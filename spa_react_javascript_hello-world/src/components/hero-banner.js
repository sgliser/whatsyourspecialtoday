import React from "react";

export const HeroBanner = () => {
  const logo = "/images/wyst-logo.png";

  return (
    <div className="hero-banner hero-banner--pink-yellow">
      <div className="hero-banner__logo">
        <img className="hero-banner__image" src={logo} alt="React logo" />
      </div>
      <h1 className="hero-banner__headline">Hungry for deal?</h1>
      <p className="hero-banner__description">
        We'll use your location to save you money at quality local restaurants.  No fast food chains.  
      </p>
      <a
        id="code-sample-link"
        target="_blank"
        rel="noopener noreferrer"
        href="https://developer.auth0.com/resources/code-samples/spa/react/basic-authentication"
        className="button button--secondary"
      >
        Show me the good stuff!
      </a>
    </div>
  );
};
