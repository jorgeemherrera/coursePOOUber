from Python.car import Car

class UBerPool(Car):
  brand = str
  model = str

  def __init__(self, license, driver, brand, model):
    super().__init__(license, driver)
    self.brand = brand
    self.model = model