import productSheet from "@/assets/product-sheet.jpg";
import productSheetTwo from "@/assets/product-sheet-two.jpg";

export type Product = {
  id: string;
  title: string;
  category: string;
  condition: string;
  campus: string;
  price: number;
  seller: string;
  rating: number;
  sheet: string;
  position: string;
  accent: string;
};

export const products: Product[] = [
  { id: "calculus", title: "Calculus: Early Transcendentals", category: "Textbooks", condition: "Like new", campus: "District Six Campus", price: 450, seller: "Naledi M.", rating: 4.9, sheet: productSheet, position: "0% 0%", accent: "Bestseller" },
  { id: "calculator", title: "Scientific Calculator FX-991ZA", category: "Electronics", condition: "Excellent", campus: "Bellville Campus", price: 280, seller: "Thabo K.", rating: 4.8, sheet: productSheet, position: "100% 0%", accent: "Verified" },
  { id: "laptop", title: "Silver 13-inch Student Laptop", category: "Electronics", condition: "Good", campus: "Mowbray Campus", price: 4950, seller: "Ayesha P.", rating: 5, sheet: productSheet, position: "0% 100%", accent: "Great value" },
  { id: "hoodie", title: "Campus Hoodie — Size M", category: "Clothing", condition: "Like new", campus: "District Six Campus", price: 320, seller: "Lwazi D.", rating: 4.7, sheet: productSheet, position: "100% 100%", accent: "Popular" },
  { id: "backpack", title: "Waterproof Student Backpack", category: "Accessories", condition: "Excellent", campus: "Wellington Campus", price: 390, seller: "Mia J.", rating: 4.9, sheet: productSheetTwo, position: "0% 0%", accent: "New" },
  { id: "lamp", title: "LED Desk Lamp with USB Port", category: "Electronics", condition: "Good", campus: "Bellville Campus", price: 180, seller: "Sihle N.", rating: 4.6, sheet: productSheetTwo, position: "100% 0%", accent: "Under R200" },
  { id: "chemistry", title: "Organic Chemistry Study Guide", category: "Textbooks", condition: "Like new", campus: "Mowbray Campus", price: 260, seller: "Emma R.", rating: 4.8, sheet: productSheetTwo, position: "0% 100%", accent: "Study pick" },
  { id: "stationery", title: "Premium Notebook Set", category: "Stationery", condition: "New", campus: "Groote Schuur Campus", price: 140, seller: "Zola B.", rating: 4.9, sheet: productSheetTwo, position: "100% 100%", accent: "New" },
];

export const campuses = ["All campuses", "District Six Campus", "Bellville Campus", "Mowbray Campus", "Wellington Campus", "Groote Schuur Campus", "Tygerberg Campus"];

export const formatRand = (value: number) => new Intl.NumberFormat("en-ZA", { style: "currency", currency: "ZAR", maximumFractionDigits: 0 }).format(value);