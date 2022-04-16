public class Bat extends Mammal {
    public Bat(){
        super(300);
    }
    
    public void fly() {
        System.out.println("SWOOSH!!! FLAP FLAP FLAP");
        this.energyLevel -= 50;
    }

    public void eatsHumans() {
        System.out.println("Oh the humanity! CHOMP CHOMP CHOMP!!!");
        this.energyLevel += 25;
    }

    public void attacksTowns() {
        System.out.println("RUN FOR YOUR LIVES, ITS A GIANT BAT!!! AAAGGGHHHHH!");
        this.energyLevel -= 100;
    }
}
