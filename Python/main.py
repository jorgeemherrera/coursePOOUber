from Python.car import Car
from Python.account import Account
from Python.uberX import UberX
from Python.user import User

if __name__ == "__main___":
    print("Hola mundo")
    
    car = Car("AMS345", Account("Jorge Herrera", "91038910"))
    print(vars(car.driver))

    uberX = UberX("FRG678", Account("Andrea Ferran", "AND980"), "Chevrolet", "Spark")
    print(vars(uberX))
    print(vars(uberX.driver))

    user = User("Jorge Herrera", "SUP09D", "jorge@gmail.com", "pass1234*")
    print(vars(user))