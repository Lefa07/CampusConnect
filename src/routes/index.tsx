import { createFileRoute, Link } from "@tanstack/react-router";
import { BookOpen, Laptop, MapPin, MessageCircle, PenTool, Shirt, ShieldCheck, Backpack, Store, Users } from "lucide-react";
import hero from "@/assets/campus-marketplace-hero.jpg";
import { AppShell } from "@/components/app-shell";
import { ProductCard } from "@/components/product-card";
import { pageHead } from "@/components/app-pages";
import { Button } from "@/components/ui/button";
import { products } from "@/lib/marketplace";

export const Route = createFileRoute("/")({
  head: () => pageHead("Student marketplace", "Buy and sell textbooks, electronics and campus essentials with verified CPUT students."),
  component: Home,
});

const categories = [
  { name: "Textbooks", icon: BookOpen },
  { name: "Electronics", icon: Laptop },
  { name: "Clothing", icon: Shirt },
  { name: "Stationery", icon: PenTool },
  { name: "Accessories", icon: Backpack },
];

function Home() {
  return (
    <AppShell>
      <section className="relative overflow-hidden bg-foreground">
        <img src={hero} alt="Students trading on campus" className="absolute inset-0 size-full object-cover opacity-45" />
        <div className="absolute inset-0 bg-gradient-to-r from-foreground via-foreground/80 to-transparent" />
        <div className="relative mx-auto max-w-7xl px-4 py-20 sm:px-6 md:py-28 lg:px-8">
          <p className="inline-flex items-center gap-2 rounded-full bg-background/10 px-3 py-1 text-xs font-semibold text-background"><ShieldCheck className="size-4 text-trust" /> Only verified university students</p>
          <h1 className="mt-6 max-w-2xl font-display text-4xl font-extrabold leading-tight text-background sm:text-6xl">Buy, sell & connect — safely, on campus.</h1>
          <p className="mt-5 max-w-xl text-lg text-background/80">CampusConnect is the trusted marketplace for CPUT students to trade textbooks, electronics and essentials at fair student prices.</p>
          <div className="mt-8 flex flex-wrap gap-3">
            <Button size="lg" asChild><Link to="/browse">Browse marketplace</Link></Button>
            <Button size="lg" variant="secondary" asChild><Link to="/sell">Sell an item</Link></Button>
          </div>
          <div className="mt-12 grid max-w-lg grid-cols-3 gap-6 text-background">
            {[["12k+", "Verified students"], ["3.4k", "Active listings"], ["6", "CPUT campuses"]].map(([n, l]) => (
              <div key={l}><p className="font-display text-3xl font-extrabold">{n}</p><p className="text-sm text-background/70">{l}</p></div>
            ))}
          </div>
        </div>
      </section>

      <section className="mx-auto max-w-7xl px-4 py-16 sm:px-6 lg:px-8">
        <p className="eyebrow">Shop by category</p>
        <h2 className="mt-1 font-display text-3xl font-extrabold">What are you looking for?</h2>
        <div className="mt-8 grid grid-cols-2 gap-4 sm:grid-cols-3 lg:grid-cols-5">
          {categories.map(({ name, icon: Icon }) => (
            <Link key={name} to="/browse" className="group rounded-xl border border-border bg-card p-6 text-center transition hover:-translate-y-1 hover:border-primary hover:shadow-lg">
              <span className="mx-auto grid size-12 place-items-center rounded-full bg-secondary text-primary transition group-hover:bg-primary group-hover:text-primary-foreground"><Icon className="size-5" /></span>
              <p className="mt-3 font-semibold">{name}</p>
            </Link>
          ))}
        </div>
      </section>

      <section className="bg-surface">
        <div className="mx-auto max-w-7xl px-4 py-16 sm:px-6 lg:px-8">
          <div className="flex items-end justify-between gap-4">
            <div><p className="eyebrow">Featured listings</p><h2 className="mt-1 font-display text-3xl font-extrabold">Fresh on campus this week</h2></div>
            <Button variant="outline" asChild><Link to="/browse">View all</Link></Button>
          </div>
          <div className="product-grid mt-8">{products.slice(0, 8).map((p) => <ProductCard key={p.id} product={p} />)}</div>
        </div>
      </section>

      <section className="mx-auto max-w-7xl px-4 py-16 sm:px-6 lg:px-8">
        <div className="text-center"><p className="eyebrow">Why CampusConnect</p><h2 className="mt-1 font-display text-3xl font-extrabold">Built on campus trust</h2></div>
        <div className="mt-10 grid gap-6 md:grid-cols-4">
          {[
            { icon: ShieldCheck, t: "Verified students", d: "Every account is confirmed with a university email and student number." },
            { icon: MapPin, t: "Safe campus pickup", d: "Meet at approved points like libraries and security desks." },
            { icon: MessageCircle, t: "In-app messaging", d: "Chat with sellers without sharing your phone number." },
            { icon: Users, t: "Admin moderation", d: "Reports and listings are reviewed by campus administrators." },
          ].map(({ icon: Icon, t, d }) => (
            <div key={t} className="feature-panel"><Icon className="size-7 text-primary" /><h3 className="mt-4 font-bold">{t}</h3><p className="mt-2 text-sm leading-6 text-muted-foreground">{d}</p></div>
          ))}
        </div>
      </section>

      <section className="mx-auto max-w-7xl px-4 pb-16 sm:px-6 lg:px-8">
        <div className="flex flex-col items-start justify-between gap-6 rounded-2xl bg-primary p-10 text-primary-foreground md:flex-row md:items-center">
          <div><h2 className="font-display text-3xl font-extrabold">Got books you no longer need?</h2><p className="mt-2 text-primary-foreground/80">List them in under two minutes and help a fellow student save.</p></div>
          <Button size="lg" variant="secondary" asChild><Link to="/sell"><Store /> Start selling</Link></Button>
        </div>
      </section>
    </AppShell>
  );
}
