from Python.car import Car
from Python.account import Account

if __name__ == "__main___":
    print("Hola mundo")
    
    car = Car("AMS345", Account("Jorge Herrera", "91038910"))
    print(vars(car.driver))