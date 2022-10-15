public class Review {
    private int ID;
    private String description;
    private int rating;
    public Review(int ID,String description,int rating){
        this.ID = ID;
        this.description = description;
        this.rating = rating;
    }
    public String toString(){
        return String.format("ID- %d,description- %s,rating %d",ID,description,rating);
    }
}
