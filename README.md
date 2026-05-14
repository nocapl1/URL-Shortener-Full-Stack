# URL Shortener Full Stack

The URL Shortener Full Stack is built with a Java Spring Boot backend and involves using HTML/CSS/JavaScript frontend. It is a web application that allows users' long links convert into short 6 combination code URL links that can functional properly. Interface UI is made under minimalistic theme, allows user input, long links convert into short, clickable hyperlink while being able to safely store data. 

# 🛠 Qualities

* **Fast Conversion:** Links are generated instantly providing a smooth experience without reloading the page.
* **Data Saved in Storage:** All shortened links are  stored in an H2 Database which ensures that links survive under browser resets and remain accessible to all.
* **Easy to use:** The interface is direct, user-friendly, and utilizes pastel color palette.

# 🛠 Features

* **Unique Link Generation:** Paste any valid URL you wish to shorten and the application's backend will generate a unique, randomized short code and map it to your destination.
* **Clickable Redirection:** The shorten URL outputs to users as a result which is a fully functional hyperlink that safely opens your destination in a new tab.
* **Shorten Another Button:** A built-in reset feature instantly clears the previous data and toggles the UI back to its default state, allowing for rapid, back-to-back link shortening.

# 📜 Project Process

This URL Shortener application requires a "Frontend" (what the user sees) and the "Backend" (where the data stores). 

Creating the interface involved making a container that stores buttons and labels through utilizing a split-complementary pastel color palette. CSS Variables (`:root`) were heavily utilized to manage the aesthetic pastel theme. The color palette includes:

| Color | RGB | Hex |
| :--- | :--- | :--- |
| Creamy Sand | 244, 241, 222 | #F4F1DE |
| Soft Navy | 61, 64, 91 | #3D405B |
| Sage Green | 129, 178, 154 | #81B29A |
| Soft Terracotta | 224, 122, 95 | #E07A5F |
| Pure White | 255, 255, 255 | #FFFFFF |

The frontend relies on using the `fetch()` API undergoing The Fetch Cycle to communicate with the Java server asynchronously. This means taking the user's input, encoding it and sending it to a `@GetMapping` REST endpoint in Java. 

Full-stack project had to consider ensuring data survival while Java resets. Initially I relied on using HashMap in the backend architecture to store URL data through 'key:value' and later was upgraded to use Spring Data JPA. By creating an UrlEntity, `@Entity` class which stores database and created through using OOP framework. UrlRepository interface, manages UrlEntity database tables behind the scenes. This allows the built-in H2 relational database to persistently store every generated URL on the hard drive.

Finally, for the user interaction, we use JavaScript to create toggle switches to hide input box after 'shorten url' using CSS display properties and instantly show the output. 

# 📓 What I've Learned

* **Full-Stack Integration:** I've learned how to build a bridge between a frontend UI and a backend server using REST APIs and the JavaScript Fetch API.
* **Spring Data JPA & Databases:** Moving beyond temporary HashMaps, I learned how to use JPA Entities and Repositories to automatically create and manage database tables, persisting data using H2 database.
* **CSS Architecture:** Using `:root` CSS variables to enforce aesthetic color for UI design.

# Credits

Built with standard Java Spring Boot libraries.
