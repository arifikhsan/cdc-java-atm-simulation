package org.example.data;

import org.example.model.AccountModel;

import java.util.List;

public class AccountData {
    public static List<AccountModel> getAllAccounts() {
        var account1 = new AccountModel();
        account1.setName("John Doe");
        account1.setNumber("111111");
        account1.setPin("111111");
        account1.setBalance(100);

        var account2 = new AccountModel();
        account2.setName("Jane Doe");
        account2.setNumber("222222");
        account2.setPin("222222");
        account2.setBalance(30);

        return List.of(account1, account2);
    }
}

// Name: John Doe
// PIN: 012108
// Balance: $100
// Account Number: 112233
//
// Name: Jane Doe
// PIN: 932012
// Balance: $30
// Account Number: 112244
