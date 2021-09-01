package Week1;

/** 
 * @author Nick Zimanski
 * @Class CS 1122
 * @Lab L01-J
 * @version 9/1/2021
 */
public class Problem08 {
    public static void main(String[] args) {
        VoterGroup votes[] = new VoterGroup[3];
        votes[0] = new VoterGroup("Democratic", 728165);
        votes[1] = new VoterGroup("Republican", 917572);
        votes[2] = new VoterGroup("Independent", 37175);

        int totalVotes = 0;
        for (VoterGroup vg : votes) {
            totalVotes += vg.votes;
        }

        for (VoterGroup vg : votes) {
            System.out.println("Percentage votes for " + vg.name + ": " + ((Double.valueOf(vg.votes)/totalVotes) * 100) + "%");
        }
    }
}

class VoterGroup {
    public VoterGroup(String name, int votes) {
        this.name = name; 
        this.votes = votes;
    }
    public String name;
    public int votes;
}