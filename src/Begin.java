public class Begin {
    private int marks;
    public static void main(String[] args)
    {
   Begin n=new Begin(98);
    }

    public  Begin(int marks)
    {
      this.marks=marks;

    }
    public char grade(char u)
    {
        switch((int)(marks/10))
        {
            case 10:
               // return 'A';
               // break;
            case 9:
                return u=='A';
            break;
            case 8:
                return u=='B';
            break;
            case 7:
                return u=='C';
            break;
            case 6:
                return u='D';
            break;
            case 5:
                return u= 'E';
            break;
            case 4:
            case 3:
            case 2:
            case 1:
                return 'A';
            break;



        }


    }
}

