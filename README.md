# Lab
# Hybrid Vehicle Efficiency Project

## Overview
This project models gasoline, electric, and hybrid vehicles.  
It demonstrates calculating:
- **MPG** (miles per gallon) for gas trips  
- **MPGe** (miles per gallon equivalent) for electric trips  
- **Trip costs** for gas and electric modes  
- **Combined efficiency and cost** for hybrid trips  

The project includes:
- `GasVehicle` and `ElectricVehicle` interfaces  
- `Hybrid` class implementing both interfaces  
- `CarRunner` main class to demonstrate functionality  
- `HybridTest` JUnit test suite to verify calculations  

---

## Requirements
- Java 11 or newer  
- JUnit 4.13.2  
- Hamcrest 1.3  

JARs for JUnit and Hamcrest are included in the `libs/` directory.

---

## Build Instructions

### Compile all classes
From the project root:
```bash
javac -cp .:libs/junit-4.13.2.jar:libs/hamcrest-core-1.3.jar c/*.java
```
java -cp . c.CarRunner
expected output:
```
MPGe: 144.42857142857144
Electric Trip Cost: $16.8
MPG: 20.0
Gas Trip Cost: $21.0
Average Efficiency (hybrid mode): 82.21428571428572 MPG-e
```
unit test run commands:
java -cp .:libs/junit-4.13.2.jar:libs/hamcrest-core-1.3.jar org.junit.runner.JUnitCore c.HybridTest

```
JUnit version 4.13.2
...........
OK (11 tests)
```




