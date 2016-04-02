<!DOCTYPE html>
<html>
<head>
	<title>Form Soal</title>
	<?php
		include 'cek_login.php';
		if ($_SERVER['REQUEST_METHOD'] == 'POST') {
			include 'database.php';
			if ($_POST['tipe'] == 'tugas') {
				$type = 'tg';
			} else{
				$type = 'as';
			}
			$data = array(
				'id_soal'		=> $type . $_SESSION['id_dosen'] . htmlspecialchars($_POST['tanggal']),
				'id_dosen' 		=> $_SESSION['id_dosen'], 
				'tanggal' 		=> htmlspecialchars($_POST['tanggal']),
				'link_materi'	=> htmlspecialchars($_POST['link_soal'])
			);
			$sql = "insert into Soal(id_dosen, tanggal, link_soal) values('" . $data['id_dosen'] . "', '" . $data['tanggal'] . "', '" . $data['link_soal'] . "');";
			$conn->exec($sql);
		}
	?>
</head>
<body>
	<h1>Input Soal</h1>
	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
		tipe	: 
		<select name="tipe">
			<option value="tugas">tugas</option>
			<option value="assessment">assessment</option>
		</select>
		tanggal 	: <input type="date" name="tanggal" required><br>
		link soal : <input type="text" name="link_materi" required><br>
		<input type="submit" value="input">
	</form>
	<a href="panel_dosen.php">Kembali ke menu</a>
</body>
</html>