import { createFileRoute } from "@tanstack/react-router";
import { ProductPage, pageHead } from "@/components/app-pages";
import { products } from "@/lib/marketplace";

export const Route = createFileRoute("/product/$productId")({
  head: ({ params }) => {
    const p = products.find((x) => x.id === params.productId);
    return pageHead(p?.title ?? "Product", `${p?.title ?? "Item"} from a verified student seller on CampusConnect.`);
  },
  component: ProductRoute,
});

function ProductRoute() {
  const { productId } = Route.useParams();
  return <ProductPage productId={productId} />;
}
