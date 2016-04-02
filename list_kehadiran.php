<!DOCTYPE html>
<html>
<head>
	<title>List Kehadiran</title>
	<?php include 'cek_login.php'; ?>
</head>
<body>
	<form method="post" action="<?php echo htmlspecialchars($_SERVER['PHP_SELF']); ?>">
		pilih tanggal<br>
		<input type="date" name="tanggal" required>
		<input type="submit" value="cek">
	</form>
	<?php
		if ($_SERVER['REQUEST_METHOD'] == 'POST') {
			include 'database.php';
			$sql = "select tanggal, id_mhs, nama_mhs from Kehadiran join Mahasiswa using (id_mhs) where tanggal = '" . $_POST['tanggal'] . "' and id_dosen_wali = '" . $_SESSION['id_dosen'] . "';";
			$stmt = $conn->prepare($sql);
			$stmt->execute();
			$result = $stmt->fetch(PDO::FETCH_ASSOC);
			if (! $result) {
				echo "Data kosong<br>";
			} else {
				do{
					echo $result['tanggal'] . " ";
					echo $result['id_mhs'] . " ";
					echo $result['nama_mhs'] . "<br>";
				} while($result = $stmt->fetch(PDO::FETCH_ASSOC));
			}
			
		}
	?>
	<a href="panel_dosen.php">Kembali ke menu</a>
</body>
</html>