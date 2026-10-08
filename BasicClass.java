
//  Class : A class is a blueprint or template used to create objects. It defines the properties (data) and methods (behavior) that its objects will have. 


class Car {
    constructor(brand, model) {
        this.brand = brand;
        this.model = model;
    }

    start() {
        console.log(`${this.brand} ${this.model} is starting.`);
    }
}

const car1 = new Car("Toyota", "Camry");

car1.start();
