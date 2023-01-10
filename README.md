# Prerequisites

To run the tests you will need maven installed on your
local machine. 
To check if you have maven already installed please run
the following command in your terminal: `mvn -v`
If you don't have the version output printed in your 
terminal, then you need to install apache-maven following
the instructions in the following link:

`https://maven.apache.org/install.htmlhttps://maven.apache.org/install.html`

# Setup

* First you have to clone the project on your local machine by entering
the following commands in your terminal:

  `git clone github.com:Mohziaei/Commerce-Decisions.git`
  



# Searchbox Functionality

 Performed automation testing for searching 'Jaggaer' in the searchbox and accessed 'No Evidence Item Exists'
  
  1. Access https://help.commercedecisions.com/
  2. Enter "jaggaer" into the search field and click the search button
  3. Access the article with "No Evidence items exist" in the title
  4. Verify that the data-id for the displayed image in the article is 80119448694


# Run

* Test cases can be triggered from the "TestRunner" class 

