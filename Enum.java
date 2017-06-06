package enumpackage;

/**
 * Created by P.Xorygij on 06.06.17.
 */
enum Transport{
    CAR(20), TRUCK(30), AIRPLANE(590),TRAIN(30);

    private int speed;

    Transport(int ss){
        speed = ss;
    }

    public int getSpeed() {
        return speed;
    }

}

class enumDemo{
    public static void main(String[] args) {
        System.out.println(Transport.AIRPLANE.getSpeed());

        for(Transport transport : Transport.values()){
            System.out.println(transport + " speed: "+ transport.getSpeed() +" " +transport.ordinal());
        }

    }
}