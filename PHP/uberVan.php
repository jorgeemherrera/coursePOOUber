<?php
require_once('car.php');
class UberVan extends Car {
  public $TypeCarAccepted;
  public $seatsMaterial;

  public function __construct(
    $license,
    $driver,
    $TypeCarAccepted,
    $seatsMaterial
  ) {
    parent::__construct($license, $driver) {
      $this->typeCarAccepted = $TypeCarAccepted;
      $this->seatsMaterial = $seatsMaterial;
    }
  }
}
?>