package ATMSIMULATIONSYSTEM;

import java.util.ArrayList;
import java.util.List;

public class AtmSystem {
    public static List<Integer> uniquecardNumbe = new ArrayList<>();
    public static List<Integer> uniquePinno = new ArrayList<>();
    public static List<AccountDetails> accountdet = new ArrayList<>();

    public void addaccount(AccountDetails acc)
    {
        accountdet.add(acc);
        System.out.println("New Account is Added Successfully!");
    }

}
