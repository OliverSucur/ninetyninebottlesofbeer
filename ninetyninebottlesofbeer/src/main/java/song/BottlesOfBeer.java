package song;

public class BottlesOfBeer {

    public String verse(int numberOfBottles) {

        String verse = "";

        switch(numberOfBottles) {
            case 2:
                verse = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                        "Take one down and pass it around, 1 bottle of beer on the wall.\n";
                break;
            case 1:
                verse = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                        "Take one down and pass it around, no more bottles of beer on the wall.\n";
                break;
            case 0:
                verse = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
                break;
            default:
                verse = String.format("%d bottles of beer on the wall, %d bottles of beer.\n" +
                        "Take one down and pass it around, %d bottles of beer on the wall.\n", numberOfBottles, numberOfBottles, --numberOfBottles);
        }

        return verse;
    }

    public String song(int numberOfBottles) {

        String song = "";

        for (int i = numberOfBottles; i >= 0; i--) {
            song += verse(i);
        }

        return song;
    }
}
