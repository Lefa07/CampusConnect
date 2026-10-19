import { createFileRoute } from "@tanstack/react-router";
import { NotificationsPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/notifications")({
  head: () => pageHead("Notifications", "Order, message and listing updates."),
  component: () => <NotificationsPage />,
});
