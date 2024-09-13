package com.factorymethod;


 interface paymentfactory {
    payment createPaymentMethod();
    Receipt createReceipt();
}

 class CreditCardFactory implements paymentfactory {
    @Override
    public payment createPaymentMethod() {
        return new CreditCardPayment();
    }

    @Override
    public Receipt createReceipt() {
        return new CreditCardReceipt();
    }
}

 

 class GooglePayFactory implements paymentfactory {
    @Override
    public payment createPaymentMethod() {
        return new GooglePayPayment();
    }

    @Override
    public Receipt createReceipt() {
        return new GooglePayReceipt();
    }
}
