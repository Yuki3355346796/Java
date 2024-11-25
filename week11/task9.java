public class task9 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'A', 'C', 'A', 'C', 'E', 'E', 'A', 'D'},
                {'C', 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A'},
                {'A', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        char[] keys = {'D', 'B', 'A', 'D', 'C', 'C', 'D', 'E', 'A', 'D'};

        int correctAnswers = 0;
        for (int i = 0; i < answers.length; i++) {
            int count = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    count++;
                }
            }
            System.out.println("Student " + i + "'s correct count is " + count);
            correctAnswers += count;
        }
    }
}