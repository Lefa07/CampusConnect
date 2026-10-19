import { createFileRoute } from "@tanstack/react-router";
import { ReviewsPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/reviews")({
  head: () => pageHead("Reviews", "Rate sellers and read verified-purchase reviews."),
  component: () => <ReviewsPage />,
});
