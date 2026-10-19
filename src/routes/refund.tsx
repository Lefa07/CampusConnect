import { createFileRoute } from "@tanstack/react-router";
import { FormPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/refund")({
  head: () => pageHead("Request a refund", "Submit a refund request for a CampusConnect order."),
  component: () => <FormPage kind="refund" />,
});
