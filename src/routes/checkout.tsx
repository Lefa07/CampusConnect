import { createFileRoute } from "@tanstack/react-router";
import { CheckoutPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/checkout")({
  head: () => pageHead("Checkout", "Choose campus meetup or pickup point and pay securely."),
  component: () => <CheckoutPage />,
});
