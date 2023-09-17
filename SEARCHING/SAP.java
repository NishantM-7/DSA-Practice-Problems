public class SAP {
    public static void main(String[] args) {
        // int[] systems = { 0, 1, 0, 0, 1, 1, 0, 0 };
        // int[] distances = { 3, 5, 10, 12, 13, 23, 30, 38 };

        int[] systems = { 1, 0, 1, 1, 0, 1, 1 };
        int[] distances = { 1, 5, 6, 7, 8, 9, 17 };

        System.out.println(systemOn(systems, distances));
    }

    static int systemOn(int[] systems, int[] distance) {
        int answer = 0;

        for (int i = 0; i < systems.length; i++) {
            if (systems[i] == 0) {
                int minDist = Integer.MAX_VALUE;
                for (int j = 0; j < distance.length; j++) {
                    int dist = Math.abs(distance[j] - distance[i]);

                    if (dist < minDist && j != i) {
                        minDist = dist;

                    }

                }

                answer += minDist;
            }
        }
        return answer;
    }
}
