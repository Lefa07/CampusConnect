import { createFileRoute } from "@tanstack/react-router";
import { AuthPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/login")({
  head: () => pageHead("Log in", "Sign in to your verified CampusConnect student account."),
  component: () => <AuthPage mode="login" />,
});
