import { createFileRoute } from "@tanstack/react-router";
import { DashboardPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/dashboard")({
  head: () => pageHead("My dashboard", "Manage your listings, orders, wishlist and chats."),
  component: () => <DashboardPage />,
});
