import { createFileRoute } from "@tanstack/react-router";
import { ReceiptPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/receipt")({
  head: () => pageHead("Receipt", "Download or print your CampusConnect receipt."),
  component: () => <ReceiptPage />,
});
