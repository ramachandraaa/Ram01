//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private int  sum;
    public static void main(String [] args)
    {
   Main n=new Main();
   n.perfect(5);
    }
    void perfect(int n)
    {
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
            this.sum=this.sum+i;
            }}
            if(sum==n)
            {
                System.out.println("Perfect");
            }
            if(sum!=n)
            {

            }





    }
}