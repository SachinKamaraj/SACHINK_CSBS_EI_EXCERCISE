package com.example;

public class Main {
    public static void main(String[] args) {
        // Create an adapter for PayPal and process a payment
        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPalGateway());
        payPalProcessor.processPayment(100.0);

        // Create an adapter for Stripe and process a payment
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(200.0);
    }
}
