const menu = document.querySelector('#mobile_menu')
const menuLinks = document.querySelector('.navbar_menu')
const navLogo = document.querySelector('#navbar_logo')
const sections = document.querySelectorAll("section[id]");

//Display Mobile Menu
const mobileMenu = () => {
    menu.classList.toggle('is_active')
    menuLinks.classList.toggle('active')
}

menu.addEventListener('click', mobileMenu)

//Credits to https://gist.github.com/khuongyolo/4e7d8308c01733961f7ad0c9964db591 for navbar highlight on scroll
//Add an event listener listening for scroll
window.addEventListener("scroll", navHighlighter);

function navHighlighter() {
  
    //Get current scroll position
    let scrollY = window.pageYOffset;
    
  //Now we loop through sections to get height, top and ID values for each
    sections.forEach(current => {
    const sectionHeight = current.offsetHeight;
  
    const sectionTop = (current.getBoundingClientRect().top + window.pageYOffset) - 400;
    sectionId = current.getAttribute("id");

    /*
    - If our current scroll position enters the space where current section on screen is, add .active class to corresponding navigation link, else remove it
    - To know which link needs an active class, we use sectionId variable we are getting while looping through sections as an selector
    */
    if (window.innerWidth > 960 && scrollY > sectionTop && scrollY <= sectionTop + sectionHeight) {
      document.querySelector(".navbar_container a[href*=" + sectionId + "]").classList.add("highlight");
    } else {
      document.querySelector(".navbar_container a[href*=" + sectionId + "]").classList.remove("highlight");
    }
  });
}

  window.onload = navHighlighter;

//Hide project card that is not hovered on
const cards = document.querySelectorAll('.projects_card');

cards.forEach(card => {
  card.addEventListener('mouseover', () => {
    cards.forEach(card => card.classList.add('dim_cards'));
    card.classList.remove('dim_cards');
  });

  card.addEventListener('mouseleave', () => {
    cards.forEach(card => card.classList.remove('dim_cards'));
  });
});

//Close mobile Menu when clicking on a menu item
const hideMobileMenu = () => {
  const menuBars = document.querySelector('.is_active');
  if (menuBars) {
    menu.classList.toggle('is_active');
    menuLinks.classList.remove('active');
  }
};

menuLinks.addEventListener('click', hideMobileMenu);
navLogo.addEventListener('click', hideMobileMenu);