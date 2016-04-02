<!DOCTYPE html>
<html>
<head>
	<title>Jadwal Dosen</title>
	<?php include 'cek_login.php'; ?>
</head>
<body>
	<h1>Jadwal</h1>
	<?php
		include 'database.php';
		$sql = "select tanggal, id_materi from Jadwal j join Materi m on (id_materi) join Dosen d using (id_dosen) where id_dosen = '" . $_SESSION['id_dosen'] . "';";
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
	<a href="panel_dosen.php">Kembali ke menu</a>
</body>
</html>