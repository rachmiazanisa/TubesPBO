<!DOCTYPE html>
<html>
<head>
	<title>Jadwal Mahasiswa</title>
	<?php include 'cek_login.php'; ?>
</head>
<body>
	<h1>Jadwal</h1>
	<?php
		include 'database.php';
		$sql = "select tanggal, id_materi from Jadwal where id_mhs = '" . $_SESSION['id_mhs'] . "';";
		$stmt = $conn->prepare($sql);
		$stmt->execute();
		$result = $stmt->fetch(PDO::FETCH_ASSOC);
		if (! $result) {
			echo "Data kosong";
		} else {
			do{
				echo $result['tanggal'] . " ";
				echo $result['id_materi'] . "<br>";
			} while($result = $stmt->fetch(PDO::FETCH_ASSOC));
		}
	?>
	<a href="panel_mhs.php">Kembali ke menu</a>
</body>
</html>