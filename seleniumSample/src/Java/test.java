package Java;

public class test {

    //Given the following tax slab for a country, calculate the total tax collected for a set of incomes provided:
    //
    //|   Slab      | Tax Rate |
    //| <= $2000    | 0%       |
    //| <= $5000    | 20%      |
    //| >  $5000    | 50%      |
    //
    //Important Note:
    //
    //The tax is not a flat deduction. It is applied to income falling in range. For example: For an individual earning $5000, the tax would be $600 first $2000 being tax-free.
    static  void calculateTax(){
        int a[]= {4000, 2000, 6000};
        int val=0;
        int cal=0;
        int cal2=0;
        for(int i = 0; i<a.length; i++){
            if(a[i]<=2000){
                val= a[i]*0/1000;
            }
            else if (a[i]>2000 && a[i]>=5000){
                cal= a[i]*20/100;
            }
            else if(a[i]>5000){
                cal2 = a[i]*50/100;
            }

        }
        System.out.println(val);
        System.out.println(cal);
        System.out.println(cal2);
    }

    public static void main(String[] args) {

       test t = new test();
       t.calculateTax();
    }

}

/*String a = new String("a")
        String b= new String("a")
                sout(a==b)*/
