

Feature: BiaX End to End Validation 

@PAss
Scenario: Launch the BiaX and get the car details
Given Biax is launched 
When Get the car name and Car model year
Then Take screenshot of HomePage

@PAss
Scenario: Data protection Validation
Given Click on the data protection link
Then Click on provider and take screenshot
Then Click on Legal Notice and take screenshot
Then Click on Cookies and take screenshot
Then Click on Data Protection Notice and take screenshot
Then Click on Contacts and take screenshot
And Close the model.

@PAss
Scenario: Quick Star Validation
Given Click on Quick Start
And Click on Lights, Windscreen wipes
And Click on electric parking
And Click on Direct select
And Click on Connecting a mobile phone
And Click on ECO start
And Click on Children in the Vechicle
And Click on Hybrid
And Click on Destination entry

@PAss
Scenario: Tips Validation
Given Click on Tips Section
And Click on At the filling station
And Click on Preparing for a holiday
And Click on Luggage and loading
And Click on Ice and Snow
And Click on Help in the event of a breakdown
And Click on Expert tips

@PAss
Scenario: GooglePlay and App Store links validation
Given Click on the Google App Store link and verify its redirection
And Click on the App Store link and verify its redirection

@PAss
Scenario: Search functionality validation
Given Click on the search bar 
Then Enter some random text in search bar and Click on search icon
Then Verify the results are matching with search key word.

@Run
Scenario: Animation videos validation
Given Click on animation section
Then Click on any video and Verify the playback
Then Play in full screen mode
Then Click on cancel button and Play another video

@PAss
Scenario: Localisation Validation
Given Click on the Language dropdown
Then Check on each Language and Take a Screen shot 





