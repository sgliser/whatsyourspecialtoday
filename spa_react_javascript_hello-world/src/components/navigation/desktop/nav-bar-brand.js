import React from "react";
import { NavLink } from "react-router-dom";

export const NavBarBrand = () => {
  return (
    <div className="nav-bar__brand">
      <NavLink to="/">
        <img
          className="nav-bar__logo"
          src="/images/wyst-logo-no-icon.png"
          alt="What's your special today?"
          width="122"
          height="36"
        />
      </NavLink>
    </div>
  );
};
