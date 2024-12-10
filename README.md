# Anleitung
> [!IMPORTANT]
> Aufgesetzter und lauffähiger Minikube wird benötigt.
> 
## Step by step
1. Das Projekt sollte durch maven gebaut werden, damit der target Ordner up-to-date ist. 
2. Als zweites muss das Image für die Anwendung gebaut werden, hierfür muss der Befehl 
`Docker build -t test-restservice:v1.0.0 .` ausgeführt werden.
3. Per Minikube das lokale image laden. `minikube image load test-restservice:v1.0.0`
> Siehe: https://minikube.sigs.k8s.io/docs/handbook/pushing/

Nach den schritten können die k8s yaml files in Kubernetes hochgeladen werden
> Befehl: `kubectl apply -f [datei]`
1. k8s/ConfigMap
2. k8s/Deployment
3. k8s/Service
4. k8s/configwatcher/WatcherDeployment

# Übersicht
![configwatcher](/resources/Diagram_Configwatcher.png)
