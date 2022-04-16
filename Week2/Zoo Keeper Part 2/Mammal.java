public class Mammal {
    public Integer energyLevel = 100;


    public Integer displayEnergy() {
        System.out.printf("Energy Level: %d\n", this.energyLevel);
        return this.energyLevel;
    }

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}
