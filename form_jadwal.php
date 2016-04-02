<!DOCTYPE html>
<html>
<head>
	<title>Form Jadwal</title>
	<?php 
		if ($_SERVER["REQUEST_METHOD"] == 'post') {
			include 'database.php';
			$data = array(
				'tanggal'   => htmlspecialchars($_Post['tanggal']), 
				'id_materi' => htmlspecialchars($_Post['id_materi']),
				'id_mhs' 	=> htmlspecialchars($_Post['id_mhs'])
			);
			$sql = "insert into Jadwal(tanggal, id_materi, id_mhs) values ('". $data['tanggal'] . "', '" . $data['id_materi'] . "', '" . $data['id_mhs'] . "');";
			try {
				$conn->exec($sql);
			} catch (PDOException $e) {
				$error = "ini belum selesai";
			}
		}
	?>
</head>
<body>
	<h1>Input Data Jadwal</h1>
	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
		Tanggal      : <input type="date" name="tanggal" required><br>
		ID Materi    : <input type="number" name="id_materi" required><br>
		ID Mahasiswa : <input type="number" name="id_mhs" required><br>
		<input type="submit" value="Input">
	</form>
</body>
</html>