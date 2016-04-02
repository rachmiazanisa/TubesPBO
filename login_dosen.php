<!DOCTYPE html>
<html>
<head>
	<title>Login Dosen</title>
	<?php
		$error = "";
		if ($_SERVER["REQUEST_METHOD"] == "POST") {
			include 'database.php';
			$data = array(
				'id_dosen' => htmlspecialchars($_POST['id_dosen']), 
				'password' =>md5(htmlspecialchars($_POST['password']))
			);
			$sql = "select * from Dosen where id_dosen = '" . $data['id_dosen'] . "' and password = '" . $data['password'] . "';";
			$stmt = $conn->prepare($sql);
			$stmt->execute();
			$result = $stmt->fetch(PDO::FETCH_ASSOC);
			if (! $result) {
				$error = "ID atau password salah, coba lagi";
			} else{
				session_start();
				$_SESSION['login'] = true;
				$_SESSION['id_dosen'] = $data['id_dosen'];
				echo "<meta http-equiv='refresh' content='0;url=panel_dosen.php'>";
			}
		}
	?>
</head>
<body>
	<h1>Login Dosen</h1>
	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
		<?php echo $error; ?><br>
		ID Dosen : <input type="number" name="id_dosen" min="1000000000" max="9999999999" required><br>
		Password : <input type="password" name="password" required><br>
		<input type="submit" value="Login">
	</form>
</body>
</html>