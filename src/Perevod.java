 class Perevod {


     static void perevod(int res1){

        String c="";
        if (res1>0) {
        int x = res1/100;
        int x1 = res1/10;
        int x2 = res1%10;
        String c1 = "", c2="", c3="";

            switch (x) {

                case 1 :   c1= "C"; break;
                case 0 :    c1 = ""; break;}

            switch (x1) {

                case 1: c2 = "X";break;
                case 2: c2 = "XX";break;
                case 3: c2 = "XXX";break;
                case 4: c2 = "XL";break;
                case 5: c2 = "L";break;
                case 6: c2 = "LX";break;
                case 7: c2 = "LXX";break;
                case 8: c2 = "LXXX";break;
                case 9: c2 = "XC";break;}

            switch (x2) {
                case 1: c3 = "I";break;
                case 2: c3 = "II";break;
                case 3: c3 = "III";break;
                case 4: c3 = "IV";break;
                case 5: c3 = "V";break;
                case 6: c3 = "VI";break;
                case 7: c3 = "VII";break;
                case 8: c3 = "VIII";break;
                case 9: c3 = "IX";break;}
            c = c1+c2+c3;
            System.out.println(""+c);}
        else {try { throw new Ex("Результат не может быть отрицательным или равным 0");}
            catch (Ex e) { System.out.println("Результат не может быть отрицательным или равным 0");}}
     }
}