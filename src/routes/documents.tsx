import { createFileRoute } from "@tanstack/react-router";
import { FormPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/documents")({
  head: () => pageHead("Verification documents", "Upload documents to verify your student status."),
  component: () => <FormPage kind="documents" />,
});
