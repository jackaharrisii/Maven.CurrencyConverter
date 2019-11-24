package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.UniversalCurrency;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / CurrencyType.getTypeOfCurrency(this).getRate();
    }
}

// returns rate of currency in () divided by rate of this.currency
// e.g., US Dollars to Universal Currency
// US_DOLLAR.convert(UNIVERSAL_CURRENCY);
// UNIVERSAL_CURRENCY rate / US_DOLLAR rate
// 1.00 / 2.00
// 1/2 or 50%
// so $10 US -> $5 Universal Currency