public class SalaryAccount extends Debit{
    @Override
    public void describe() {
        System.out.println(this.getType());
    }
    @Override
    public String getType() {
        return "Salary Account";
    }
}
