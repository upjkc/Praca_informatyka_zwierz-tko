package zwierzatko_puchalko;

public class Main {


    private String name;
    private String color;
    private String wiek;
    private String rasa;
    private String stan_zdrowia;
    private String uzebienie;

    public Main(String name, String color, String wiek, String rasa, String stan_zdrowia, String uzebienie) {
        this.name = name;
        this.color = color;
        this.wiek = wiek;
        this.rasa = rasa;
        this.stan_zdrowia = stan_zdrowia;
        this.uzebienie = uzebienie;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getWiek() {
        return wiek;
    }

    public String getRasa() {
        return rasa;
    }

    public String getStan_zdrowia() {
        return stan_zdrowia;
    }

    public String getUzebienie() {
        return uzebienie;
    }

    public static void main(String[] args) {

        zwierzatko Pies = new zwierzatko("wafel", "czarny podpalany", "5 lat", "kundel", "zdrowy", "pelne");
        zwierzatko Kot = new zwierzatko("ziemniak", "pomaranczowy w pregi", "5 lat", "dachowiec", "zdrowy", "pelne");
        zwierzatko Kon = new zwierzatko("Kadzidlo", "siwy", "7 lat", "Haflinger", "zdrowy", "pelne");
        zwierzatko Mysz = new zwierzatko("Boiler", "szary", "1 rok", "polna", "zdrowy", "pelne");
        zwierzatko Gekon = new zwierzatko("Grzejnik", "lamparci", "2 lata", "lamparci", "zdrowy", "pelne");

        System.out.println(" ");
        System.out.println("Pies : imie - " + Pies.getName() + ",\nkolor - " + Pies.getColor() + ",\nwiek - " + Pies.getWiek() +",\nrasa - " +Pies.getRasa()+",\nstan zdrowia - "+Pies.getStan_zdrowia()+",\nuzebienie - "+Pies.getUzebienie()+" .");
        System.out.println(" ");
        System.out.println("Kot : imie - " + Kot.getName() + ",\nkolor - " + Kot.getColor() + ",\nwiek - " + Kot.getWiek() +",\nrasa - " +Kot.getRasa()+",\nstan zdrowia - "+Kot.getStan_zdrowia()+",\nuzebienie - "+Kot.getUzebienie()+" .");
        System.out.println(" ");
        System.out.println("Kon : imie - " + Kon.getName() + ",\nkolor - " + Kon.getColor() + ",\nwiek - " + Kon.getWiek() +",\nrasa - " +Kon.getRasa()+",\nstan zdrowia - "+Kon.getStan_zdrowia()+",\nuzebienie - "+Kon.getUzebienie()+" .");
        System.out.println(" ");
        System.out.println("Mysz : imie - " + Mysz.getName() + ",\nkolor - " + Mysz.getColor() + ",\nwiek - " + Mysz.getWiek() +",\nrasa - " +Mysz.getRasa()+",\nstan zdrowia - "+Mysz.getStan_zdrowia()+",\nuzebienie - "+Mysz.getUzebienie()+" .");
        System.out.println(" ");
        System.out.println("Gekon : imie - " + Gekon.getName() + ",\nkolor - " + Gekon.getColor() + ",\nwiek - " + Gekon.getWiek() +",\nrasa - " +Gekon.getRasa()+",\nstan zdrowia - "+Gekon.getStan_zdrowia()+",\nuzebienie - "+Gekon.getUzebienie()+" .");
    }
}
