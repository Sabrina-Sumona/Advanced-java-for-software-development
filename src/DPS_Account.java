public class DPS_Account extends Account{
    @Override
    public String getType() {
        return "DPS account";
    }

    @Override
    public void describe() {
        System.out.println(this.getType());
    }
}
