package Domaci;

import java.util.Scanner;

public class DomaciOsam {
    public static void main(String[] args) {
//2. Napraviti program gde unosite svoju
//godinu rodjenja i ispisati broj prestupnih godina
// od vaseg rodjenja do tekuce godine.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi svoju godinu rodjenja");
        int godina = sc.nextInt();
        int brojac = 0;
        for (int i = godina; i <= 2022; i++) {
            if (i % 4 == 0 && !(i%100==0 && i%400!=0)) {
                brojac++;
                    }
                }
        System.out.println("Broj prestupnih godina je " + brojac);
            }
        }
