package adapter;

import adapter.IncomeData;
import entities.Contact;
import entities.Customer;

public class IncomeDataAdapter implements Customer, Contact {

    IncomeData incomeData;

    public IncomeDataAdapter(IncomeData incomeData) {
        this.incomeData = incomeData;
    }

    @Override
    public String getName() {
        return incomeData.getContactLastName() + ", " + incomeData.getContactFirstName();
    }

    @Override
    public String getPhoneNumber() {
        String phoneNumber = String.valueOf(incomeData.getPhoneNumber());
        while (phoneNumber.length() < 10) {
            phoneNumber += "0";
        }
        return "+" + String.valueOf(incomeData.getCountryPhoneCode()) + "(" + phoneNumber.substring(0, 3) + ")" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6, 8) + "-" + phoneNumber.substring(8, 10);
    }

    @Override
    public String getCompanyName() {
        return incomeData.getCompany();
    }

    @Override
    public String getCountryName() {
        return Solution.countries.get(incomeData.getCountryCode());
    }
}
