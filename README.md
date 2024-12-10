# Anleitung
## Voraussetzung
- Aufgesetzter Minikube / Kubernetes cluster

## Step by step
1. Das Projekt sollte durch maven gebaut werden, damit der target Ordner up-to-date ist. 
2. als zweites muss das Image für die Anwendung gebaut werden, hierfür muss der Befehl `Docker build -t test-restservice:1.0.0 .` ausgeführt werden. (Wichtig: Dies sollte in dem Projekt ausgeführt werden)
