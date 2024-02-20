# Formen-Anzeiger v1.0

## Überblick
Dieses Projekt ist eine Java-Anwendung, die darauf abzielt, verschiedene geometrische Formen in einem GUI-Fenster darzustellen.

## Ziel
Die Etablierung einer erweiterbaren Klassenhierarchie für geometrische Formen, die eine effiziente Darstellung einer Vielzahl von Formen ermöglicht. Die Hierarchie basiert auf einer Basisklasse `Form`, von der alle anderen Formen abgeleitet werden.

## Implementierte Formen

- Rechteck
- Quadrat
- Kreis
- Trapez
- Dreieck
- Raute
- Ellipse
- Sechseck (regelmäßig)
- Stern (regelmäßig)

## Klassenhierarchie
- `Form` - Wurzelklasse, definiert allgemeine Eigenschaften und Methoden für geometrische Formen
    - `Polygon` - Erbt von `Form`, Basis für alle polygonalen Formen
        - `Quadrilateral` (Viereck) - Klasse, die die Formen mit vier Seiten definiert
            - `Trapez`
            - `Raute`
            - `Parallelogramm`
                - `Rechteck`
                    - `Quadrat`
        - `Dreieck`
        - `Sechseck`
    - `Kreis`
    - `Ellipse`
    - `Stern`

## GUI-Anzeige
`MainWindow.java` wurde so angepasst, dass es groß genug ist, um alle gewünschten Formen darzustellen. Jede Form erbt direkt von `Form`, `Polygon` oder `Quadrilateral` für Vierecke.
