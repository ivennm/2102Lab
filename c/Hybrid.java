package c;

public class Hybrid implements ElectricVehicle, GasVehicle {
    private int batteryLevel;
    private int fuelLevel;
    private int milesTraveled;


    private double totalElectricMiles;
    private double totalKWh;

    private double milesFromGas;
    private double gallonsFromGas;

    private static double ELECTRIC_COST_PER_KWH = 0.24;
    private static double GAS_COST_PER_GALLON = 3.5;
    private static double MPGe_CONVERSION = 33.7;


    public Hybrid(int batteryLevel, int fuelLevel) {
        this.batteryLevel = batteryLevel;
        this.fuelLevel = fuelLevel;
    }

    public void setMilesTraveled(int miles) {
        this.milesTraveled = miles;
    }

    public int getMilesTraveled() {
        return milesTraveled;
    }

    public int getMilesPerGallon() {
        //return milesTraveled / gallonsUsed();
        return 0;
    }


    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("Battery fully charged.");
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void refuel() {
        fuelLevel = 100;
        System.out.println("Fuel tank full.");
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public double CalcGasMPG() {
    if (gallonsFromGas == 0) return 0;
    return milesFromGas / gallonsFromGas;
    }

    @Override
    public double calcMPGe() {
        return ((totalElectricMiles / totalKWh) * MPGe_CONVERSION);
    }
    
    @Override
    public void setElectricMiles(double totalElectricMiles) {
        this.totalElectricMiles = totalElectricMiles;
    }

    @Override
    public void setTotalkWh(double totalkWh) {
        this.totalKWh = totalkWh;
    }

    public double calcElectricCost() {
        return totalKWh * ELECTRIC_COST_PER_KWH;
    }
    
    @Override
    public void setMilesfromGas(double miles) {
        this.milesFromGas = miles;
    }
    
    @Override
    public void setGallonsfromGas(double gallons) {
        this.gallonsFromGas = gallons;
    }

    public double calcGasCost() {
        return gallonsFromGas * GAS_COST_PER_GALLON;
    }

    // ---------------- Hybrid helper ----------------
    public double calcCombinedEfficiency() {
        double totalMiles = totalElectricMiles + milesFromGas;
        double electricGallonsEquivalent = totalKWh / MPGe_CONVERSION;
        double totalGallonsEquivalent = electricGallonsEquivalent + gallonsFromGas;

        if (totalGallonsEquivalent == 0) return 0;
        return totalMiles / totalGallonsEquivalent;
    }

    public double calcCombinedCost() {
        return calcElectricCost() + calcGasCost();
    }
}
    
