<!DOCTYPE html>
<html>
<head>
	<title>Form Dosen</title>
	<?php
		$error = "";
		if ($_SERVER["REQUEST_METHOD"] == "POST") {
			include 'database.php';
			$data = array(
				'id_dosen' 		=> htmlspecialchars($_POST["id_dosen"]), 
				'nama_dosen'	=> htmlspecialchars($_POST["nama_dosen"])
			);
			$sql = "insert into Dosen(id_dosen,nama_dosen) values ('" . $data['id_dosen'] . "', '" . $data['nama_dosen'] . "');";
			try {
				$conn->exec($sql);
			} catch (PDOException $e) {
				$error = "ID sudah ada!";
			}
		}		
	?>
</head>
<body>
	<h1>Input Data Dosen</h1>
	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
		<?php echo $error?><br>
		ID Dosen : <input type="number" name="id_dosen" min="1000000000" max="9999999999" required><br>
		Nama Dosen : <input type="text" name="nama_dosen" required><br>
		<input type="submit" value="input">
	</form>
</body>
</html>