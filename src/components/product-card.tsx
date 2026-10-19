import { Link } from "@tanstack/react-router";
import { Heart, MapPin, ShieldCheck, Star } from "lucide-react";
import { useState } from "react";
import { Button } from "@/components/ui/button";
import { formatRand, type Product } from "@/lib/marketplace";
import { cn } from "@/lib/utils";

export function ProductImage({ product, className }: { product: Product; className?: string }) {
  return <div role="img" aria-label={product.title} className={cn("bg-cover", className)} style={{ backgroundImage: `url(${product.sheet})`, backgroundPosition: product.position, backgroundSize: "200% 200%" }} />;
}

export function ProductCard({ product }: { product: Product }) {
  const [saved, setSaved] = useState(false);
  return <article className="group overflow-hidden rounded-lg border border-border bg-card transition-all hover:-translate-y-1 hover:shadow-xl">
    <div className="relative aspect-[4/3] overflow-hidden"><ProductImage product={product} className="size-full transition-transform duration-500 group-hover:scale-105" /><span className="absolute left-3 top-3 rounded-sm bg-background/95 px-2 py-1 text-[11px] font-bold text-foreground shadow-sm">{product.accent}</span><Button variant="secondary" size="icon" className="absolute right-3 top-3 size-8 rounded-full" aria-label={saved ? "Remove from wishlist" : "Add to wishlist"} onClick={() => setSaved(!saved)}><Heart className={cn("size-4", saved && "fill-primary text-primary")} /></Button></div>
    <div className="p-4"><p className="text-xs font-semibold uppercase text-primary">{product.category} · {product.condition}</p><h3 className="mt-2 line-clamp-2 min-h-12 font-display font-bold leading-6">{product.title}</h3><div className="mt-2 flex items-center gap-1 text-xs text-muted-foreground"><MapPin className="size-3.5" /> {product.campus}</div><div className="mt-4 flex items-end justify-between"><div><p className="font-display text-xl font-extrabold">{formatRand(product.price)}</p><p className="mt-1 flex items-center gap-1 text-xs text-muted-foreground"><ShieldCheck className="size-3 text-trust" /> {product.seller} <Star className="ml-1 size-3 fill-warning text-warning" /> {product.rating}</p></div><Button size="sm" asChild><Link to="/product/$productId" params={{ productId: product.id }}>View</Link></Button></div></div>
  </article>;
}