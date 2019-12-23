##BidApp
This is demo app. It has a user and manager interfaces with own login and password for each.
User could create a bid and check a status of it. 
After bid creation user could get email about his bid (the bid was created, sended to manager and what status it has)
Manager could see a list of bids and deny or approve it. When manager clicked on approve/deny button, 
status of bid changing to approved/denied and user that create that bid receive email with updated status.

Microservices interaction scheme: 
![alt text](readme_images/image7.png)

Kafka Topic listeners scheme:

![alt text](readme_images/image8.png)

Login as a user or a manager according to a role: 

![alt text](readme_images/image1.png)

Users page:

![alt text](readme_images/image2.png)

Users menu:

![alt text](readme_images/image3.png)

Creating a new bid in modal window:

![alt text](readme_images/image4.png)

Manager can approve or deny the bid and then the user will get an email message:

![alt text](readme_images/image5.png)

Inbound mail with updated statuses:

![alt text](readme_images/image6.png)

Usernames and passwords:
User,123;
Manager,1234;