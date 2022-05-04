package adapter;

import entities.Contact;
import entities.Customer;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("KZ", "Kazakhstan");
    }

    public static void main(String[] args) {
        Contact contactAdapter = new IncomeDataAdapter(new IncomeDataImpl());
        Customer customerAdapter = new IncomeDataAdapter(new IncomeDataImpl());

        System.out.println(contactAdapter.getName());
        System.out.println(contactAdapter.getPhoneNumber());
        System.out.println(customerAdapter.getCountryName());
        System.out.println(customerAdapter.getCompanyName());
    }

}
