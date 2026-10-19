import { createFileRoute } from "@tanstack/react-router";
import { FormPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/contact")({
  head: () => pageHead("Contact us", "Get in touch with the CampusConnect support team."),
  component: () => <FormPage kind="contact" />,
});
