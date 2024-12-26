# Leveraging-Predictive-Analytics-and-Real-Time-Data-for-Traffic-Flow-Optimization

This project uses Java as its primary programming language to implement
a real-time Traffic Optimisation System. With the use of predictive
models and real-time traffic data, the system is intended to optimise
traffic signal timings and offer dynamic route recommendations. It uses
contemporary technologies to enhance urban traffic flow, lessen
congestion, and cut down on travel time, including machine learning,
real-time data streaming, and scalable deployment strategies.

Steps to Run the Project

1.  Clone the repository

**git clone
https://github.com/RishikeshPatel98/Leveraging-Predictive-Analytics-and-Real-Time-Data-for-Traffic-Flow-Optimization**

**cd traffic-optimization-system**

2.  Backend (Java, springboot)

    a.  Install dependencies

**mvn install**

b.  Configure database settings in the application.properties

c.  Run the backend

**mvn spring-boot:run**

3.  Machine learning model (weka)

    a.  Ensure Weka libraries are configured

    b.  Train the models using the historical data in the weka/models
        directories.

4.  Kafka Setup

    a.  Install and start the Kafka

**docker-compose up -d kafka**

b.  Ensure the proper configuration in the kafka-config file

```{=html}
<!-- -->
```
5.  MangoDB

    a.  Install and start MangoDB

**docker-compose up -d mangodb**

6.  React.js Dashboard

    a.  To navigate the frontend directory

**cd frontend**

**npm install**

**npm start**

7.  Deployment

    a.  To build and run the docker containers

**docker-compose up -d**

b.  Kubernetes setup: to deploy the containers to use **kubect1 apply -f
    k8s-config.yaml**
