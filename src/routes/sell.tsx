import { createFileRoute } from "@tanstack/react-router";
import { SellPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/sell")({
  head: () => pageHead("Sell an item", "List a textbook, device or campus essential for verified students."),
  component: () => <SellPage />,
});
