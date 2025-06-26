Project: CI/CD Pipeline with GitHub Actions & Docker (No Cloud)

Objective
Build a complete CI/CD pipeline for a Java application using Maven, JUnit, Docker, and GitHub Actions, and deploy it locally using Docker on a VM or host system — avoiding cloud services.

🛠️ Tech Stack
Java (Palindrome Checker App)

JUnit for unit testing

Apache Maven for build management

Docker for containerization

GitHub Actions for CI/CD automation

✅ What I Did
Developed a simple Java program to check if a string is a palindrome.

Wrote and verified JUnit test cases to ensure correctness.

Created a Maven project and configured pom.xml for build and test lifecycle.

Wrote a Dockerfile to containerize the Java application.

Built and pushed the Docker image to Docker Hub.

Set up a GitHub Actions workflow to:

Run unit tests automatically on each push

Build the Docker image

Push the image to Docker Hub

Deployed the app locally using Docker, since the app is interactive and expects user input (making Kubernetes/Minikube unsuitable).

📂 Project Structure
bash
Copy
Edit
.
├── src/
├── Dockerfile
├── pom.xml
├── .github/workflows/deploy.yml
├── README.md


📸 Outputs & Deliverables


✅ Working Java palindrome app with test cases

✅ Docker Hub Image: jayashreep2005/mycicdapp

✅ CI/CD pipeline via GitHub Actions

✅ Successfully deployed and tested via local Docker run

▶️ Run the App Locally


bash
Copy
Edit


# Pull the image

docker pull jayashreep2005/mycicdapp


# Run the container

docker run -it jayashreep2005/mycicdapp

Note: -it is required to enable interactive input.

🔑 Key Learning
Learned how to:

Automate testing and Dockerization with GitHub Actions

Set up full CI/CD workflow without any cloud provider

Build, test, and deploy Java apps interactively using Docker