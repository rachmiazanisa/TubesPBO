<!DOCTYPE html>
<html>
<head>
	<title>Daftar Mahasiswa</title>
	<?php include 'cek_login.php';?>
</head>
<body>
	<?php
		include 'database.php';
		$sql = "select id_mhs, nama_mhs, angkatan from Mahasiswa where id_dosen_wali = '" . $_SESSION['id_dosen'] . "';";
		$stmt = $conn->prepare($sql);
		$stmt->execute();
		$result = $stmt->fetch(PDO::FETCH_ASSOC);
		if (! $result) {
			echo "Data Kosong";
		} else {
			do {
				echo $result['id_mhs'] . " ";
				echo $result['nama_mhs'] . " ";
				echo $result['angkatan'] . "<br>";
			} while ($result = $stmt->fetch(PDO::FETCH_ASSOC));
		}
	?>
	<a href="panel_dosen.php">Kembali ke menu</a>
</body>
</html>