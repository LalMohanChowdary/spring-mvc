<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body>

	<fieldset>

		<legend>Addition</legend>
		<form id="form-1" action="add">
			<input type="number" name="num1" placeholder="Enter Num1"> <input
				type="number" name="num2" placeholder="Enter Num2"> <input
				type="submit" value="Add" id="button-1" />
		</form>

	</fieldset>
	
	<br>
	<br>
	
	<fieldset>

		<legend>Multiplication</legend>
		<form id="form-2" action="multi">
			<input type="number" name="num1" placeholder="Enter Num1"> <input
				type="number" name="num2" placeholder="Enter Num2"> <input
				type="submit" value="multi" id="button-1" />
		</form>

	</fieldset>
	<br>
	<br>
	<fieldset>

		<legend>Subtraction</legend>
		<form id="form-2" action="sub">
			<input type="number" name="num1" placeholder="Enter Num1"> <input
				type="number" name="num2" placeholder="Enter Num2"> <input
				type="submit" value="sub" id="button-1" />
		</form>

	</fieldset>
	<br>
	<br>
	<fieldset>

		<legend>Division</legend>
		<form id="form-2" action="div">
			<input type="number" name="num1" placeholder="Enter Num1"> <input
				type="number" name="num2" placeholder="Enter Num2"> <input
				type="submit" value="div" id="button-1" />
		</form>

	</fieldset>

</body>
</html>