> [!TIP]
> [Minikube](https://minikube.sigs.k8s.io/docs/) </br>
> [Spring Config Watcher](https://docs.spring.io/spring-cloud-kubernetes/reference/spring-cloud-kubernetes-configuration-watcher.html)

> [!IMPORTANT]
> Aufgesetzter Minikube oder Kubernetes cluster wird benötigt

# Anleitung
Um die Testumgebung aufzusetzen müssen folgende Schritte erledigt werden.
1. Anwendung als Docker image bauen
2. Docker image in Kubernetes/Minikube hochladen
3. Die Kubernetes files hochladen 
4. Kubernetes files des Configwatchers hochladen

> [!NOTE]
> Die Kubernetes files sollte in folgender reihenfolge hochgeladen werden 
> 1. Configmap
> 2. Deployment
> 3. Service
> 4. configwatcher/WatcherDeployment

Folgende Befehle können hilfreich sein
```
Bauen des Docker images:
Docker build -t test-restservice:v1.0.0 .

hochladen von Kubernetes Datein:
kubectl apply -f [Datei]
```

# Übersicht
![configwatcher](/resources/Diagram_Configwatcher.png)
