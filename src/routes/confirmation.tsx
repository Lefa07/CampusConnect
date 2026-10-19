import { createFileRoute } from "@tanstack/react-router";
import { ConfirmationPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/confirmation")({
  head: () => pageHead("Order confirmed", "Your CampusConnect order is confirmed."),
  component: () => <ConfirmationPage />,
});
