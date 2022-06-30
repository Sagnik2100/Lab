public class armstrong {
    public static void main(String[] args) {
        int n=153,number,temp,t=0;
        number=n;
        while(n!=0){
            temp=n%10;
            t=t+temp*temp*temp;
            n=n/10;
        }
        if(t==number){
        System.out.println("The number is an armstrong number:"+number);
        }
        else{
            System.out.println("Its not armstrong number:"+number);
        }
    }
}
