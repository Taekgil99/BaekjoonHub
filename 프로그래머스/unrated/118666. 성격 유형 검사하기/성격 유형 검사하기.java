class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        String[] type = {"R","T","C","F","J","M","A","N"};
        int[] answerScore = new int[]{0, 0, 0, 0};

        for (int i = 0; i < survey.length; i++) {
            int score = choices[i]-4;

            switch (survey[i].charAt(0)) {
                case 'R':
                    answerScore[0] -= score;
                    break;
                case 'T':
                    answerScore[0] += score;
                    break;
                case 'C':
                    answerScore[1] -= score;
                    break;
                case 'F':
                    answerScore[1] += score;
                    break;
                case 'J':
                    answerScore[2] -= score;
                    break;
                case 'M':
                    answerScore[2] += score;
                    break;
                case 'A':
                    answerScore[3] -= score;
                    break;
                case 'N':
                    answerScore[3] += score;
                    break;
            }

        }
        
        for (int i = 0; i < 4; i++) {
            if (answerScore[i] >= 0) sb.append(type[i*2]);
            else sb.append(type[i*2+1]);
        }

        return sb.toString();
    }
}