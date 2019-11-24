package io.zipcoder.currencyconverterapplication;

public enum CurrencyType {
    // expected className values can be found in the CurrencyTypeTest
    AUSTRALIAN_DOLLAR(2.70, "AustralianDollar"),
    CANADIAN_DOLLAR(2.64, "CanadianDollar"),
    CHINESE_YR(13.84, "ChineseYR"),
    EURO(1.88, "Euro"),
    FRANC(2.02, "Franc"),
    POUND(1.64, "Pound"),
    RINGGIT(8.94, "Ringgit"),
    RUPEE(136.64, "Rupee"),
    SINGAPORE_DOLLAR(1.86, "SingaporeDollar"),
    US_DOLLAR(2.0, "USDollar"),
    UNIVERSAL_CURRENCY(1.0, "UniversalCurrency"),
    YEN(231.68, "Yen");

    private final double rate;
    private final String className;

    CurrencyType(double rate, String className) {
        this.rate = rate;
        this.className = className;
    }

    public Double getRate() {
        return rate;
    }

    public static CurrencyType getTypeOfCurrency(ConvertableCurrency currency) {
        for (CurrencyType type : CurrencyType.values()){
            if (type.className.equals(currency.getClass().getSimpleName())){
                return type;
            }
        }
        return null;
    }
}
