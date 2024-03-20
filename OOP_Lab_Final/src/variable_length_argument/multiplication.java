package variable_length_argument;

public class multiplication {
    multiplication(int...num){
        int ans = 1;
        for(int a:num){
            ans=ans*a;
        }
        System.out.println("Ans = "+ans);
    }
}
