import React from "react";
import { SpecialsList } from "../components/specials-list";
import { HeroBanner } from "../components/hero-banner";
import { PageLayout } from "../components/page-layout";

export const HomePage = () => (
  <PageLayout>
    <HeroBanner />
    <SpecialsList />
  </PageLayout>
);
