/**
 * Created by yuyu on 4/25/17.
 */
public class Driver {
    public static void main(String args[]) throws Exception{

        if (args.length < 4) {
            System.err.println("Input and output paths is needed");
            System.exit(0);
        }

        String mutualFriendInputPath = args[0];
        String mutualFriendOutputPath = args[1];
        String newFriendOutputPath = args[2];
        String numOfRecommendation = args[3];
        String[] mutualFriendArgs = {mutualFriendInputPath, mutualFriendOutputPath};
        String[] newFriendArgs= {mutualFriendOutputPath, mutualFriendInputPath, newFriendOutputPath, numOfRecommendation};
        MutualFriend.main(mutualFriendArgs);
        NewFriend.main(newFriendArgs);
    }
}
