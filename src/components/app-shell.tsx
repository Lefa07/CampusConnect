import { Link } from "@tanstack/react-router";
import { Bell, Heart, Menu, MessageCircle, Search, ShoppingBag, ShieldCheck, X } from "lucide-react";
import { useState, type ReactNode } from "react";
import { Button } from "@/components/ui/button";
import { campuses } from "@/lib/marketplace";

export function Logo() {
  return (
    <Link to="/" className="flex items-center gap-2" aria-label="CampusConnect home">
      <span className="grid size-9 place-items-center rounded-md bg-primary font-display text-sm font-extrabold text-primary-foreground">CC</span>
      <span className="hidden font-display text-lg font-bold text-foreground sm:block">Campus<span className="text-primary">Connect</span></span>
    </Link>
  );
}

export function AppShell({ children }: { children: ReactNode }) {
  const [open, setOpen] = useState(false);
  return (
    <div className="min-h-screen bg-background">
      <header className="sticky top-0 z-50 border-b border-border/80 bg-background/95 backdrop-blur">
        <div className="mx-auto flex h-18 max-w-7xl items-center gap-4 px-4 sm:px-6 lg:px-8">
          <Logo />
          <div className="relative hidden min-w-0 flex-1 md:block">
            <Search className="absolute left-3 top-1/2 size-4 -translate-y-1/2 text-muted-foreground" />
            <input className="h-10 w-full rounded-md border border-border bg-muted/60 pl-10 pr-4 text-sm outline-none focus:border-primary focus:ring-2 focus:ring-ring/20" placeholder="Search textbooks, electronics and more" />
          </div>
          <select aria-label="Select campus" className="hidden h-10 rounded-md border border-border bg-background px-3 text-sm lg:block">
            {campuses.map((campus) => <option key={campus}>{campus}</option>)}
          </select>
          <nav className="hidden items-center gap-1 md:flex">
            <Link to="/notifications" aria-label="Notifications" className="icon-link"><Bell className="size-5" /><span className="notification-dot">2</span></Link>
            <Link to="/messages" aria-label="Messages" className="icon-link"><MessageCircle className="size-5" /></Link>
            <Link to="/cart" aria-label="Shopping cart" className="icon-link"><ShoppingBag className="size-5" /><span className="notification-dot">3</span></Link>
            <Button variant="ghost" size="sm" asChild><Link to="/login">Log in</Link></Button>
            <Button size="sm" asChild><Link to="/register">Join now</Link></Button>
          </nav>
          <Button className="ml-auto md:hidden" variant="ghost" size="icon" aria-label="Open menu" onClick={() => setOpen(!open)}>{open ? <X /> : <Menu />}</Button>
        </div>
        {open && <nav className="grid gap-1 border-t border-border p-4 md:hidden">
          <Link className="mobile-link" to="/browse">Browse marketplace</Link><Link className="mobile-link" to="/dashboard">My dashboard</Link><Link className="mobile-link" to="/messages">Messages</Link><Link className="mobile-link" to="/cart">Cart</Link><Link className="mobile-link" to="/login">Log in</Link>
        </nav>}
      </header>
      <main>{children}</main>
      <footer className="border-t border-border bg-foreground text-background">
        <div className="mx-auto grid max-w-7xl gap-10 px-4 py-12 sm:px-6 md:grid-cols-[1.4fr_1fr_1fr_1fr] lg:px-8">
          <div><Logo /><p className="mt-4 max-w-sm text-sm leading-6 text-background/70">A safer way for verified students to buy, sell and connect across campus.</p><div className="mt-4 flex items-center gap-2 text-sm text-background/70"><ShieldCheck className="size-4 text-trust" /> University-verified community</div></div>
          <FooterGroup title="Marketplace" links={[['Browse items','/browse'],['Sell an item','/sell'],['My dashboard','/dashboard']]} />
          <FooterGroup title="Support" links={[['About us','/about'],['Contact','/contact'],['Report an issue','/report']]} />
          <FooterGroup title="Account" links={[['Log in','/login'],['Create account','/register'],['Verification','/documents']]} />
        </div>
        <div className="border-t border-background/15 px-4 py-5 text-center text-xs text-background/55">© 2026 CampusConnect Marketplace · Built for the CPUT student community</div>
      </footer>
    </div>
  );
}

function FooterGroup({ title, links }: { title: string; links: [string, string][] }) {
  return <div><h3 className="font-display text-sm font-bold">{title}</h3><div className="mt-4 grid gap-3">{links.map(([label, to]) => <Link key={to} to={to} className="text-sm text-background/65 hover:text-background">{label}</Link>)}</div></div>;
}

export function PageHeader({ eyebrow, title, description, action }: { eyebrow?: string; title: string; description: string; action?: ReactNode }) {
  return <div className="border-b border-border bg-surface"><div className="mx-auto flex max-w-7xl flex-col gap-5 px-4 py-10 sm:px-6 md:flex-row md:items-end md:justify-between lg:px-8"><div>{eyebrow && <p className="eyebrow">{eyebrow}</p>}<h1 className="mt-1 font-display text-3xl font-extrabold text-foreground sm:text-4xl">{title}</h1><p className="mt-2 max-w-2xl text-muted-foreground">{description}</p></div>{action}</div></div>;
}

export function EmptyHeart() { return <Heart className="size-5" />; }