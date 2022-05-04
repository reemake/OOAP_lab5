package adapter;

public class IncomeDataImpl implements IncomeData {
    @Override
    public String getCountryCode() { return "KZ"; }

    @Override
    public String getCompany() {
        return "DSR";
    }

    @Override
    public String getContactFirstName() {
        return "Anton";
    }

    @Override
    public String getContactLastName() {
        return "Lisovsky";
    }

    @Override
    public int getCountryPhoneCode() {
        return 7;
    }

    @Override
    public int getPhoneNumber() {
        return 9911;
    }
}
