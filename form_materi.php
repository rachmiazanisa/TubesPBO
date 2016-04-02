<!DOCTYPE html>
<html>
<head>
	<title>Form Materi</title>
	<?php
		include 'cek_login.php';
		if ($_SERVER['REQUEST_METHOD'] == 'POST') {
			include 'database.php';
			$data = array(
				'tanggal' 		=> $_POST['tanggal'], 
				'link_materi'	=> $_POST['link_materi'],
				'id_dosen'		=> $_SESSION['id_dosen']
			);
			$sql = "insert into Jadwal(tanggal, link_materi, id_dosen) values('" . $data['tanggal'] . "', '" . $data['link_materi'] . "', '" . $data['id_dosen'] . "');";
			$conn->exec($sql);
			echo "<meta http-equiv='refresh' content='0;url=panel_dosen.php'>";
		}
	?>
</head>
<body>
	<h1>Input Materi</h1>
	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
		Tanggal : <input type="date" name="tanggal" required><br>
		Link Materi : <input type="text" name="link_materi"><br>
		<input type="submit" value="input">
	</form>
</body>
</html>