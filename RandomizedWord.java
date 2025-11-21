import java.sql.SQLOutput;

public class RandomizedWord {
    private static int wordLen;
    private static String randomWord;

    public static int length() {
        wordLen = (int) ((Math.random() * 4) + 2);

        return wordLen;
    }


    public static String getRandomWord(int length) {
        randomWord = "";
        String alphabet = "abcdefghijklmnopqrstuwxyz";
        for (int i = 0; i < length; i++) {
            int num = (int) (Math.random() * 24);;
            String character = alphabet.substring(num, (num + 1));
            randomWord = randomWord + character;
        }
        return randomWord;
    }

    public static String check(String guess) {
        StringBuilder checking = new StringBuilder(" ");
        int h = 0;
        while (h <= wordLen - 1) {
            int count = 0;
            String b = guess.substring(h, (h + 1));
            for (int i = 0; i < randomWord.length(); i++) {
                String a = randomWord.substring(i, (i + 1));
                if (b.equals(a)) {
                    if (i == h) {
                        checking.append(b).append(" is in the correct spot. ");
                    } else {
                        checking.append(b).append(" is a letter in the word but its placement is wrong. ");
                    }
                } else {
                    count++;
                }

                if (count == wordLen) {
                    checking.append(b).append(" is not a letter in the word. ");
                }
            }
            h++;
        }
        return checking.toString();
    }

    public static String hint(String userWord, int length) {

        // input is the user guess
        // length of the random word

        // notGuessed should be all the letters in the random word that the user has NOT guessed

        // for each letter in the random word
        // if that letter is NOT in the userword, add it to notGuessed
        StringBuilder notGuessed = new StringBuilder();
        for (int i = 0; i < randomWord.length(); i++) {
            String c = randomWord.substring(i, i+1);

            if (userWord.indexOf(c) == -1) {
                notGuessed.append(c);
            }
        }

        System.out.println(notGuessed);

        return "";

//        String alphabet = "abcdefghijklmnopqrstuwxyz";
//        System.out.println("User word is: " + userWord);
//        String hints= "";
//        int h = 0;
//        while (h <= length - 1) {
//            int count = 0;
//            String b = userWord.substring(h, (h + 1));
//            for (int i = 0; i < length; i++) {
//                String a = randomWord.substring(i, (i + 1));
//                if (b.equals(a)) {
//                } else {
//                    count++;
//                }
//                if (count==length)
//                {
//                    notGuessed.append(a);
//                }
//            }
//            h++;
//        }
//
//        System.out.println(notGuessed.toString());
//        int ind= (int) (Math.random()*(notGuessed.length()-1));
//        for (int s=0;s<notGuessed.length()-1;s++)
//        {
//            String k = notGuessed.substring(s, (s + 1));
//            if ((notGuessed.indexOf(k))==ind)
//            {
//                hints=("the index of the missing letter in your word in the alphabet is: "+(alphabet.indexOf(k) + 1));
//            }
//        }
//        return hints;
    }
}
