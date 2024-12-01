public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        int len1=sentences.length;
        int len2 = keywords.length;
        int i = 0;
        int i1 = 0;
        for(i=0;i<len1;i++){
            for(i1=0;i1<len2;i1++)
            if(contains(sentences[i],keywords[i1])==true)
            {
                System.out.println(sentences[i]);
                break;
            }
        }

    }
    public static boolean contains(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if (len2 > len1) {
            return false;
        }
        for (int i1 = 0; i1 <= len1 - len2; i1++) {
            boolean match = true;
            for (int b = 0; b < len2; b++) {
                if (str1.charAt(i1 + b) != str2.charAt(b)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }
}
