import { createFileRoute } from "@tanstack/react-router";
import { InfoPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/about")({
  head: () => pageHead("About us", "Why CampusConnect makes student trading safer."),
  component: () => <InfoPage kind="about" />,
});
