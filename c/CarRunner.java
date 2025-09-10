package c;

public class CarRunner {
    public static void main(String[] args) {
        Hybrid car = new Hybrid(80, 50);

        // Fully electric trip
        car.setElectricMiles(300);
        car.setTotalkWh(70);
        System.out.println("MPGe: " + car.calcMPGe());
        System.out.println("Electric Trip Cost: $" + car.calcElectricCost());

        // Fully gas trip
        car.setMilesfromGas(120);
        car.setGallonsfromGas(6);
        System.out.println("MPG: " + car.CalcGasMPG());
        System.out.println("Gas Trip Cost: $" + car.calcGasCost());

        // Hybrid efficiency (average of MPG and MPGe)
        double average = (car.CalcGasMPG() + car.calcMPGe()) / 2.0;
        System.out.println("Average Efficiency (hybrid mode): " + average + " MPG-e");
    }
}
