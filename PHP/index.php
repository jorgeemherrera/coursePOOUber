<?php
include ("Account.php");
include ("Car.php");
$car = new Car("AMX908", new Account("Andres Herrera", "1020400090"));
$car->passenger = 4;
$car->printDataCar();
?>