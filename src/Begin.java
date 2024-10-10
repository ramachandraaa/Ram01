public class Begin {
    private int marks;
    public static void main(String[] args)
    {
   Begin n=new Begin(100);
  System.out.println( n.grade());
      if( n.grade()=='X')
      {
          System.out.println("Please Enter the valid marks");
      }
    }

    public  Begin(int marks)
    {
      this.marks=marks;

    }
    public char grade()

    {
        switch((marks/10))

        {
            case 10:
               // return 'A';
               // break;
            case 9:
                return 'A';
          //  break;
            case 8:
                return 'B';
           // break;
            case 7:
                return 'C';
           // break;
            case 6:
                return 'D';
           // break;
            case 5:
                return 'E';
           // break;
            case 4:
            case 3:
            case 2:
            case 1:
                return 'F';
           // break;
            default:
                return 'X';



        }



    }
}

