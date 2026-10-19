import { createFileRoute } from "@tanstack/react-router";
import { CartPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/cart")({
  head: () => pageHead("Shopping cart", "Review items in your CampusConnect cart."),
  component: () => <CartPage />,
});
