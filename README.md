This repository contains two independent Spring Boot services communicating via Apache Kafka:

- `delivery-service`: Simulates a delivery system that updates location data to a Kafka topic.
- `consumer-service`: Consumes and logs location data from the Kafka topic.

---

## 📦 Project Structure

multi-service-kafka-apps/
│
├── delivery-service/
│ └── (Spring Boot Producer app)
│
├── consumer-service/
│ └── (Spring Boot Consumer app)

yaml
Copy
Edit

---

## ⚙️ Technologies Used

- Java 17+
- Spring Boot
- Spring Kafka
- Apache Kafka
- Maven
- IntelliJ IDEA

---

## 🚀 How to Run

### 1. Start Zookeeper and Kafka Server
Make sure Kafka is running locally:
```bash
# Start Zookeeper
bin\windows\zookeeper-server-start.bat config\zookeeper.properties

# Start Kafka Broker
bin\windows\kafka-server-start.bat config\server.properties
2. Start Delivery Service (Producer)
bash
Copy
Edit
cd delivery-service
mvn spring-boot:run
3. Start Consumer Service
bash
Copy
Edit
cd consumer-service
mvn spring-boot:run
📡 Kafka Topic
Both services communicate via the Kafka topic:

yaml
Copy
Edit
Topic Name: delivery
📬 Sample API (Delivery Service)
http
Copy
Edit
POST /location/update
Sends a randomly generated location string to the Kafka topic.

🙌 Contributors
Your Name

📄 License
This project is open-source and available under the MIT License.

yaml
Copy
Edit

---

Let me know if you'd like the `README.md` as a file or if you want help setting up `.gitignore` or `.env` too.






You said:
write discription


ChatGPT said:
Here’s a project description you can use in your GitHub repository:

📄 Project Description
This repository contains two Spring Boot microservices that demonstrate event-driven communication using Apache Kafka.

delivery-service: Acts as a Kafka producer that sends delivery location updates (random coordinates) to a Kafka topic named delivery.

consumer-service: Acts as a Kafka consumer that listens to the delivery topic and logs the incoming location updates.

This setup mimics a real-world scenario where a delivery system continuously streams live data to a central service or dashboard via Kafka.

🔍 Use Case
A delivery agent's live location is published by delivery-service, and consumer-service receives and processes this data in real-time. This can be extended for analytics, customer updates, or monitoring.

