import { createFileRoute } from "@tanstack/react-router";
import { InfoPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/settings")({
  head: () => pageHead("Settings", "Manage email and notification preferences."),
  component: () => <InfoPage kind="settings" />,
});
