public class AccountMain {
    public static void main(String[] args) {

//        Account account = new Account() {
//            @Override
//            public String getType() {
//                return null;
//            }
//
//            @Override
//            public void describe() {
//
//            }
//        }

        Account account = new DPS_Account();

        account.describe();
        System.out.println(account.getBankName());

        Debit debitAcc = new Debit() {
            @Override
            public void describe() {
                System.out.println(this.getType());
            }
        };
        debitAcc.describe();
        System.out.println(debitAcc.getBankName());

        Account saccount = new SalaryAccount();

        saccount.describe();
        System.out.println(saccount.getBankName());

    }
}
