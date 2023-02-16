package home8;

public class Dog extends Participant {
    private String name;
    private double sumRating;


    public Dog(String participantName, String name, double sumRating) {
        super(participantName);
        this.name = name;
        this.sumRating = sumRating;
    }

    public void setSumRating(double sumRating) {
        this.sumRating = sumRating;
    }

    public double getSumRating() {
        return sumRating;
    }

    public String getNameParticipant(){
        return super.getParticipantName();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
