//package task06.mostpopularword;
//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.*;
//
//
//public class MostPopularWord {
//    public static void main(String[] args) {
//        Map<String, Integer> wordHits = new HashMap<String, Integer>();
//
//        for (Status status3 : statuses) {
//
//            String mdry = status3.getText();
//            String[] statusSplitOnSpace = mdry.split(" ");
//
//            for (String wordInStatus : statusSplitOnSpace) {
//                for (String str : statusSplitOnSpace) {
//                    if (doesListContainWord(str)) {
//                        incrementKeyofWordInList(str);
//                    } else {
//                        if (doesWordCountAsAWord(str)) {
//                            addNewWordToList(str);
//                        }
//                    }
//                }
//            }
//
//            Set keys = list.keySet();
//            for (Iterator i = keys.iterator(); i.hasNext(); ) {
//                String key = (String) i.next();
//                String value = (String) list.get(key);
//                //if(value.length()>10)
//                System.out.println("Word (" + key + ") was found " + value + " times.");
//                //else{
//            }
//
//        }
//    }
//}
//
