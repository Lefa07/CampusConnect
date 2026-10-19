import { createFileRoute } from "@tanstack/react-router";
import { BrowsePage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/browse")({
  head: () => pageHead("Browse marketplace", "Search verified student listings across CPUT campuses."),
  component: () => <BrowsePage />,
});
