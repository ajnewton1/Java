//**************************************** 
// Project: Program 3 
// Class: CS 422
//
// Author: Aaron Newton 
//
// Completion time: 81 min
//
// Honor Code: I pledge that this program represents my own program code. 
// I received help from no one in designing and debugging my program.
//****************************************

package readabilitystatistics;

    class ReadabilityStatistics {
        private static double character;
        private static double sentence;
        private static double words;
        
    public ReadabilityStatistics() {
        double character = 0;
        double sentence = 0;
        double words = 0.0;
    }        

    //accept a String object as an argument and returns the number of non-whitespace characters
    public static int characterCount(String stats) {
        for (int i = 0; i < stats.length(); i++) {
            if (stats.charAt(i) == ('.') || stats.charAt(i) == ('!') || stats.charAt(i) == ('?') 
                    || Character.isLetter(stats.charAt(i))) {
                character++;
            }
        }
        return (int) character;
    }
    
    //accept a String object as an argument and returns the average number of characters per word
    public static double charactersPerWord() {
        return character/words;
    }
    
    //accept a String object as an argument and returns the number of paragraphs contained in the string
    public static int paragraphCount(String stats) {
        String[] paraCount = stats.split("\r\n");
        return paraCount.length;
    }
    
    //accept a String object as an argument and returns the number of sentences contained in the string
    public static int sentenceCount(String stats) {
        for (int i = 0; i < stats.length(); i++){
            if (stats.charAt(i) == ('!') || stats.charAt(i) == ('.') || stats.charAt(i) == ('?')) {
            sentence++;
            }  
        }
       return (int) sentence; 
    }
    
    //accept a String object as an argument and returns the average number of sentences per paragraph
    public static double sentencesPerParagraph(String stats) {
        String[] paraCount = stats.split("\r\n");
        return sentence/paraCount.length;
    }
    
    //accept a String object as an argument and returns the number of words
    public static int wordCount(String stats) {
        for (int i = 0; i < stats.length(); i++){
            if (stats.charAt(i) == (' ')) {
            words++;
            }  
           
        }
        String[] paraCount = stats.split("\r\n");
        return (int) (words + paraCount.length);
    }
    
    //accept a String object as an argument and returns the average words per sentence
    public static double wordsPerSentences(String stats) {
        String[] paraCount = stats.split("\r\n");
        return (words + paraCount.length)/sentence;
    }
}