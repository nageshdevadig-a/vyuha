# Vyuha

Vyuha is a real-time system monitoring platform with AI-powered anomaly detection.  
It collects host metrics via lightweight Java agents, aggregates data on a Spring Boot server, analyzes anomalies with a Python AI engine, and visualizes results on a web dashboard.

## Architecture

- **Agent (Java)**: Collects system metrics from host machines
- **Server (Spring Boot)**: Aggregates metrics and exposes APIs
- **AI Engine (Python)**: Performs anomaly detection and prediction
- **Dashboard (Web)**: Real-time visualization of system metrics

## Tech Stack

- Java 21 (Agent & Server)
- Spring Boot 3.5.6 (Server)
- Python 3.12 (AI Engine)
- React / Vue (Dashboard)
- MySQL / PostgreSQL (Storage)
- REST / HTTP (Communication)

## Features

- Real-time system monitoring
- CPU, memory, disk, network metrics
- AI-powered anomaly detection
- Modular microservices architecture
- Scalable and cloud-ready

## Disclaimer

This project is created for personal learning, experimentation, and fun.  
You may use it to monitor your own applications.  
The author is not responsible for any misuse or damages.  
This project is not affiliated with any company.

## Getting Started

1. Clone the repository:

```bash
git clone https://github.com/nageshdevadig-a/vyuha.git
