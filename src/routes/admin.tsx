import { createFileRoute } from "@tanstack/react-router";
import { AdminPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/admin")({
  head: () => pageHead("Admin dashboard", "Marketplace metrics, user management and moderation."),
  component: () => <AdminPage />,
});
