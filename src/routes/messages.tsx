import { createFileRoute } from "@tanstack/react-router";
import { MessagesPage, pageHead } from "@/components/app-pages";

export const Route = createFileRoute("/messages")({
  head: () => pageHead("Messages", "Chat safely with buyers and sellers on campus."),
  component: () => <MessagesPage />,
});
