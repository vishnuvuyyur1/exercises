import java.util.Arrays;

public class WidestPath {

	public int solution(int[] X, int[] Y) {

		int widestPath = 0;
		Arrays.sort(X);
		for (int i = 0; i < X.length - 1; i++) {

			widestPath = Math.max(widestPath, X[i + 1] - X[i]);

		}

		return widestPath;
	}
}
