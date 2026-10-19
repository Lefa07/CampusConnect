import { createFileRoute } from "@tanstack/react-router";
import { AuthPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/register")({
  head: () => pageHead("Create account", "Register as a verified student or admin on CampusConnect."),
  component: () => <AuthPage mode="register" />,
});
