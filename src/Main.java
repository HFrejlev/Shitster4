public class Main {

    public static void main(String[] args) {
        System.out.println("Shitster 1.0");

        Shitster rasmusLort = new Shitster(); //Instansierer et objekt af klassen Shitster
        rasmusLort.weight = 3;
        rasmusLort.health = false;
        rasmusLort.temp = 37;
        rasmusLort.reminder = "Dit system er belastet. Du skal en tur på toilettet #gladsmiley";

        Shitster henrikLort = new Shitster(); //Instansierer et objekt af klassen Shitster
        henrikLort.weight = 5;
        henrikLort.temp = 38.5;
        henrikLort.reminder = "Du har det helt ok. Toiletbesøg er IKKE nødvendigt.";

        System.out.println("Rasmus' lort vejer " + rasmusLort.weight + " kg");
        System.out.println("Er Rasmus' lort sund? = " + rasmusLort.health);
        rasmusLort.erdensund();
        System.out.println("Rasmus' lort er " + rasmusLort.temp + " grader");

        System.out.println("Henriks lort vejer " + henrikLort.weight +"kg");
        System.out.println("Er Henriks lort sund? =" + henrikLort.health);
        henrikLort.erdensund();
        System.out.println("Henrik lort er " + henrikLort.temp + " grader");


    }
}
