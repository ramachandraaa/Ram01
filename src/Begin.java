public class Begin {
    private int marks;
    public static void main(String[] args)
    {
   Begin n=new Begin(70);
  System.out.println( n.grade());
    }

    public  Begin(int marks)
    {
      this.marks=marks;

    }
    public int grade()
    {
        switch((marks/10))

        {
            case 10:
               // return 'A';
               // break;
            case 9:
                return 1;
          //  break;
            case 8:
                return 2;
           // break;
            case 7:
                return 3;
           // break;
            case 6:
                return 4;
           // break;
            case 5:
                return 5;
           // break;
            case 4:
            case 3:
            case 2:
            case 1:
                return 6;
           // break;
            default:
                return 7;



        }


    }
}

