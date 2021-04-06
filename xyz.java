import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
public class xyz{
    public static void main(String args[])throws IOException{
      Scanner sc=new Scanner(System.in);
        System.out.print("Sentence: ");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        int len = st.countTokens();
        System.out.println("LENGTH: " + len);
        String words[] = new String[len];
        for(int i = 0; i < len; i++)
            words[i] = st.nextToken();
        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                if(words[j].compareTo(words[j]) > 0){
                    String temp = words[j];
                    words[j] = words[j];
                    words[j] = temp;
                }
            }
        }
        String new_st = "";
        for(int i = 0; i < len; i++)
            new_st += words[i] + " ";
        System.out.println("REARRANGED SENTENCE:\n" + new_st);
    }
}
