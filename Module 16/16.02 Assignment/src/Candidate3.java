/**
 * 16.02 Assignment - Constructor for Candidate objects.
 * @author 
 * @date 5/23/15
 */
public class Candidate3 {
    
    // instance variables 
    private String name;
    private int numVotes;
 
    public Candidate3(String name, int numVotes)
    {
        this.name = name;
        this.numVotes = numVotes;
    }
    
    public String getName()
    {
    return name;
    }
     
    public int getVotes()
    {
    return numVotes;
    }
    
    public String toString()
    {
        return getName() + " received " + getVotes() + " votes.";
    }
 
}