import { createFileRoute } from "@tanstack/react-router";
import { FormPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/report")({
  head: () => pageHead("Report an issue", "Report a listing, user or safety concern."),
  component: () => <FormPage kind="report" />,
});
