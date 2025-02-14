public class FindPatternMatchCount {


//    int solution2(String pattern, String source) {
//
//        int k = pattern.length();
//        int i = 0;
//        int j = 0;
//        int m = 0;
//
//        String result = "";
//
//        char[] resultArray = new char[k];
//
//        int count = 0;
//
//        while(j < source.length())
//        {
//            if(m < k)
//            {
//                resultArray[j] = isVovel(c) ? '0' : '1';
//            }
//            else{
//                if(resultArray.toString().equals(pattern)){
//                    count++;
//                }else{
//                    count--;
//                }
//
//                for(int l = 1 ; l < resultArray.length; l++)
//                {
//                    resultArray[l-1] = resultArray[l];
//                }
//                i++;
//                j++;
//                resultArray[k-l] = isVovel(c) ? '0' : '1';
//            }
//        }
//        return count;
//
//    }

    public static void main (String[] args)
    {
        String pattern = "010";
        String source = "amazing";

        // ama
        // 010 - true

        // maz
        // 010 - false

        // azi
        // 010 - true

        // zin
        // 010 - false

        // ing
        // 010 - false

//        String pattern = "1010";
//        String source = "brajeshmehra";

        // braj
        // 1010 - false

        // raje
        // 1010 - true

        // ajes
        // 1010 - false

        // jesh
        // 1010 - false

        // eshm
        // 1010 - false

        // shme
        // 1010 - false

        // hmeh
        // 1010 - false

        // mehr
        // 1010 - false

        // ehra
        // 1010 - false

        FindPatternMatchCount findPatternMatchCount = new FindPatternMatchCount();
        System.out.println("==============");
        System.out.println(findPatternMatchCount.solutionKForce(pattern, source));
    }

    int solutionKForce(String pattern, String source) {
        int count = 0;

        int si = 0, ei = pattern.length();

        while (ei < source.length())
        {
            if(isPatternMatch(pattern, source.substring(si, ei)))
            {
                count++;
            }
            si++;
            ei++;
        }

        return count;
    }

    boolean isPatternMatch(String pattern, String source){
        if (pattern.length() != source.length()) return false;

        String newString = "";

        for (char c: source.toCharArray())
        {
            if(isVovel(c)) {
                newString += "0";
            } else {
                newString += "1";
            }
        }

        return newString.equals(pattern);
    }

    boolean isVowel2(char sourceChar){
        char [] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char c : vowels){
            return c == sourceChar;
        }
        return false;
    }


    int solution(String pattern, String source) {

        int matches = 0;
        int startIndex = 0, endIndex = pattern.length();

        // amazing - 7
        // 0 - si, 0 - 3
        // 1 - 1,4
        // 2 - 2,5
        // 3 - 3,6
        // 4 - 4, 7

        while(endIndex < source.length())
        {
            if(doesPatternMatch(pattern, source.substring(startIndex, endIndex)))
            {
                matches++;
            }
            startIndex++;
            endIndex++;
        }
        return matches;
    }

    boolean doesPatternMatch(String pattern, String source)
    {
        if(pattern.length() != source.length() ) return false;

        char[] patternArr = pattern.toCharArray();
        char[] sourceArr = source.toCharArray();

        int matchCharCount = 0;
        // p - 010, ama
        // p - 110, ama
        for(int i = 0; i < patternArr.length; i++)
        {
            if((patternArr[i] == '0' && isVovel(sourceArr[i])) || (patternArr[i] == '1' && !isVovel(sourceArr[i])))
            {
                matchCharCount++;
            } else
            {
                return false;
            }
        }
        return matchCharCount == patternArr.length;
    }

    boolean isVovel(char c)
    {
        char[] vovels = {'a', 'e', 'i', 'o', 'u', 'y'};


        for (int i=0; i < vovels.length; i++)
        {
            if(vovels[i] == c)
            {
                return true;
            }
        }
        return false;
    }

}
