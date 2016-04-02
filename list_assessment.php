<!DOCTYPE html>
<html>
<head>
	<title>list_tugas</title>
	<?php
		include 'cek_login.php';
	?>
</head>
<body>
	<?php
		include 'database.php';
		$sql = "select * from Assignment where substring(id_assignment,1,12) = 'as" . $_SESSION['id_dosen'] . "';";
		$stmt = $conn->prepare($sql);
		$stmt->execute();
		$result = $stmt->fetch(PDO::FETCH_ASSOC);
		if (! $result) {
			echo "Data Kosong";
		} else{
			do {
				echo $result['tanggal'];
				echo $result['id_mhs'];
				echo $result['link_jawaban'];
				echo $result['nilai'];
	?>
	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
		<input type="number" name="nilai" required min="0" max="100" placeholder="Nilai Baru">
		<input type="hidden" name="id_mhs" value="<?php echo $result['id_mhs'] ?>">
		<input type="submit" value="submit"><br>
	</form>

	<?php
			} while($result = $stmt->fetch(PDO::FETCH_ASSOC))
		}
	?>
	<a href="panel_dosen.php">Kembali ke menu</a>
</body>
</html>