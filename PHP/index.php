<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("account.php");

$uberX = new UberX("SUP08A", new Account("Andres Herrera","1020400090"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("ABC123", new Account("Andrea Ferran","1020305210"), "Donge", "GT");
$uberPool->printDataCar();
?>