# QuickBid
## Introduction
QuickBid is a simple auction site I worked on in an effort to learn how to use the Django framework and CSS. This post will cover learning outcomes from this project as well as features of the website minus obvious features such as categories, log in & register.

## Learning Outcomes
* Simple arrangement and styling of elements using CSS 
* How to implement Django backend using CSS
* How to work with databases using SQLite
* How to handle and validate forms in Django
* How to create User models and forms and implement login and registration
* How to create Models and how to connect them with Templates and Views
* How to connect templates with models to present data dynamically

## Features
### Navigation
For a user that has not logged in yet the navigation options are Active Listings, Categories, Log In & Register. Upon registering and logging in the user is greeted with a few new options where Log In & Register have been replaced by Log Out, Sell, Watchlist & Your Listings. In addition, on the top right the user is also informed that they are not signed in or what account they are currently signed into.

### Active Listings
The active listings page is the homepage of the website. Here all listings active and closed can be viewed. Listings contain a title, image, current bid/winning bid, category and status.

### Sell
The sell option allows logged in users to list their items. The users are required to fill in all the fields which include the Tile, Image Url, Starting Bid, Description & Category(dropdown selection). The website displays the image using a url rather than uploading a image file.

### Watchlist
Users that did not create the listing can add active listings to their watchlist. Once the listing is clsoed it will remain in their watchlist, but can be manually removed by the user.

### Your Listings
Users can vew listings that they have posted regardless of if they ar active or not unless removed by the user.

### Listing Page
The lisitng page will include the title, seller, image, current bid, category, description and comments. If the listing is active, non seller users can bid only more than the current bid and add/remove the listing from their watchlist. Sellers do not have this option, however they have the ability to close or remove the listing. Once the listing is closed, users may no longer bid, comment or add to watchlist. Only those who have the listing in their watchlist have the option to remove it. Sellers have the option to then remove the listing. Under the seller name it will be mentioned that the listing is closed and the winning bidder will be informed next to the closed status that they have won.

