package Activity4;
import java.util.*;
public class DisplayTeamMain {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        Map<String, Team> map = new TreeMap<>();

        for (int i = 0; i < size; i++) {
            String input = sc.nextLine();
            String splitAr[] = input.split("\\|");
            if (map.containsKey(splitAr[0])) {
                Team getTeam = map.get(splitAr[0]);
                getTeam.addPlayer(splitAr[1]);
            } else {
                Team t2 = new Team(splitAr[0]);
                t2.addPlayer(splitAr[1]);
                map.put(splitAr[0], t2);
            }
        }
        for (Map.Entry<String, Team> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            Collections.sort(entry.getValue().playerList);
            for (int i = 0; i < entry.getValue().playerList.size(); i++) {
                System.out.println("--" + entry.getValue().playerList.get(i));
            }
        }
        sc.close();
    }

}
/*
CSK|MS Dhoni
CSK|Sam Curran
CSK|Ambati Rayudu
RCB|Virat Kohli
RCB|Davudatt Padikkal
RCB|AB de Villiers
CSK|Suresh Raina
KKR|Eoin Morgan
KKR|Pat Cummins
KKR|Dinesh Karthick
*/