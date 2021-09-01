package Week1;

/** 
 * @author Nick Zimanski
 * @Class CS 1122
 * @Lab L01-J
 * @version 9/1/2021
 */
public class Problem09 {
    public static void main(String[] args) {
        VoterGroup votes[] = new VoterGroup[3];
        votes[0] = new VoterGroup("Democratic", 91758125);
        votes[1] = new VoterGroup("Republican", 81658291);
        votes[2] = new VoterGroup("Independent", 636820);

        int totalVotes = 0;
        for (VoterGroup vg : votes) {
            totalVotes += vg.votes;
        }

        for (VoterGroup vg : votes) {
            System.out.println("Percentage votes for " + vg.name + ": " + ((Double.valueOf(vg.votes)/totalVotes) * 100) + "%");
        }
    }
}