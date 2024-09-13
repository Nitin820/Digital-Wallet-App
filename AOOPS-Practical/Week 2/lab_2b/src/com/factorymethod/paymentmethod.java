package com.factorymethod;


 class CreditCardPayment implements payment {
 public void pay() {
     System.out.println("Payment made using Credit Card.");
 }
}

 class CreditCardReceipt implements Receipt {
 @Override
 public void generateReceipt() {
     System.out.println("Receipt generated for Credit Card payment.");
 }
}

 


 class GooglePayPayment implements payment {
 public void pay() {
     System.out.println("Payment made using Google Pay.");
 }
}
 class GooglePayReceipt implements Receipt {
 @Override
 public void generateReceipt() {
     System.out.println("Receipt generated for Google Pay payment.");
 }
}

