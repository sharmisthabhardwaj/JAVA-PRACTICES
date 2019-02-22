public class InstanceofExample
{
public static void main(String [] args)
{
Vehicle vehicle = new Vehicle();
Car car = new Car();
MotorCycle moto = new MotorCycle();
System.out.println("Vehicle instanceof Vehicle:"+(vehicle instanceof Vehicle));
System.out.println("car instanceof Vehicle:"+(car instanceof Vehicle));
System.out.println("moto instanceof Vehicle:"+(moto instanceof Vehicle));
System.out.println("moto instanceof motorcycle:"+(moto instanceof MotorCycle));
System.out.println("Vehicle instanceof car:"+(vehicle instanceof Car));
System.out.println("Vehicle instanceof DriveCar:"+(vehicle instanceof DriveCar));
System.out.println("moto instanceof DriveCar:"+(moto instanceof DriveCar));
car=null;
System.out.println("(car=null) instanceof Vehicle:"+(car instanceof Vehicle));
System.out.println("(car=null) instanceof car:"+(car instanceof Car));
}}
class Vehicle
{
}
class Car extends Vehicle implements DriveCar
{
}
class MotorCycle extends Vehicle
{
}
interface DriveCar
{
}
