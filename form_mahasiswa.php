<!DOCTYPE html>
<html>
<head>
	<title>Form Mahasiswa</title>
	<?php
		$error = "";
		if ($_SERVER["REQUEST_METHOD"] == "POST") {
			include 'database.php';
			$data = array(
				'id_mhs' => htmlspecialchars($_POST['id_mhs']), 
				'nama_mhs' => htmlspecialchars($_POST['nama_mhs']),
				'angkatan' => htmlspecialchars($_POST['angkatan']),
				'id_dosen_wali' => htmlspecialchars($_POST['id_dosen'])
			);
			$sql = "insert into Mahasiswa(id_mhs, nama_mhs, angkatan, id_dosen_wali) values ('" . $data['id_mhs'] . "', '" . $data['nama_mhs'] . "', '" . $data['angkatan'] . "', '" . $data['id_dosen_wali'] . "');";
			try {
				$conn->exec($sql);
			} catch (PDOException $e) {
				if ($e->getMessage() == "SQLSTATE[23000]: Integrity constraint violation: 1452 Cannot add or update a child row: a foreign key constraint fails (`rpl`.`Mahasiswa`, CONSTRAINT `fk_Mahasiswa` FOREIGN KEY (`id_dosen_wali`) REFERENCES `Dosen` (`id_dosen`))"){
					$error = "ID Dosen tidak ada";
				} else{
					$error = "ID Mahasiswa sudah ada";
				}
			}
		}
		
	?>
</head>
<body>
	<h1>Input Data Mahasiswa</h1>
	<?php echo $error; ?>
	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
		ID Mahasiswa : <input type="number" name="id_mhs" min="1000000000" max="9999999999" required><br>
		Nama Mahasiswa : <input type="text" name="nama_mhs" required><br>
		Angkatan : <input type="number" name="angkatan" min="2010" max="3000" required><br>
		ID Dosen Wali : <input type="text" name="id_dosen" required><br>
		<input type="submit" value="Input">
	</form>
</body>
</html>