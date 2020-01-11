import java.util.*;
public class Hello {
    
    public int checkCondition(int arr[], String currWord) {
        
        for(int index = 0; index < currWord.length(); index++)
        {
            if(arr[word.charAt(index)] == 0)
                return 1;
            else    
                arr[word.charAt(index)]--;
        }
        
        return 0;
    }

    public static void main(String[] args) {
		//Your Code Here
    
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    String currWord;
    int N, flag = 0;
    int arr[] = new int[256];
    
    N = sc.nextInt();
    sc.nextLine();
    
    for(int index = 0; index < word.length(); index++)
    {
        arr[word.charAt(index)]++;    
    }
    
    for(int index = 0; index < N; index++)
    {
        currWord = sc.nextLine();
        flag = checkCondition(arr[],currWord);
        
        if(flag == 1)
        {
            System.out.println("No");
            return;
        }
    }
    
    System.out.println("Yes");
    
	}
}
