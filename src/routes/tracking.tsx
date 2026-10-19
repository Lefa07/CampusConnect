import { createFileRoute } from "@tanstack/react-router";
import { TrackingPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/tracking")({
  head: () => pageHead("Track order", "Follow your order to the campus collection point."),
  component: () => <TrackingPage />,
});
