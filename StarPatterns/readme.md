butteerfly --> starts + spaces (2*(n-i)) + stars       
          for(int i = 1;i<=n ; i++)
            for(int j = 1 ; j<=i; j++) { System.out.print("*"); // stars - i  }
            for(int j = 1  ; j<=2*(n-i); j++){ System.out.print(" "); }
            //2nd half  for(int i = n ; i>=1 ;i--)

diamond - space(n-i) + star(2 * i - 1)

hollowPattern --> if(i == 1 || i == totrows || j == 1 ||j == totcols)                   System.out.print("*");

hollowrhombus --> spaces(n-i)  // first and lst row        if (i == 1 || i == n || j == 1 || j == n) {

inverted pyramid = two loops    for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= (n - line + 1); star++)

characted pyramid -->  for (int charNum = 1; charNum <= line; charNum++) {  System.out.print(ch);  ch++;

// star pattern perpendicular
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // }

        // inverted star patter
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= (n - line + 1); star++) { // 4-1+1 = 4 ,, 3-1+1 = 3
                System.out.print("*");
            }
            System.out.println();
        }