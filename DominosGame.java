import java.util.HashSet;
public class DominosGame {
	public String solution(String[] A) {
        HashSet<String> set = new HashSet<String>();
        for (String tile : A) {
            String[] parts = tile.split("-");
            set.add(parts[0] + "-" + parts[1]);
            set.add(parts[1] + "-" + parts[0]);
        }
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                if (!set.contains(i + "-" + j)) {
                    return i + "-" + j;
                }
            }
        }
        return ""; // should never happen
    }
}
