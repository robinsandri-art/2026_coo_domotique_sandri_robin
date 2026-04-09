@startuml

interface Appareil {
  + allumer() : void
  + eteindre() : void
}

class Lampe {
  - nom : String
  - allume : boolean
  + allumer() : void
  + eteindre() : void
  + toString() : String
}

class Hifi {
  - son : int
  + allumer() : void
  + eteindre() : void
  + toString() : String
}

class Telecommande {
  - appareils : List<Appareil>
  + ajouterAppareil(a : Appareil) : void
  + activer(i : int) : void
  + desactiver(i : int) : void
  + activerTout() : void
  + toString() : String
}

Lampe ..|> Appareil
Hifi ..|> Appareil
Telecommande "1" --> "0..*" Appareil

@enduml





@startuml

interface Appareil {
  + allumer() : void
  + eteindre() : void
}

class Lampe {
  - nom : String
  - allume : boolean
  + allumer() : void
  + eteindre() : void
  + toString() : String
}

class Hifi {
  - son : int
  + allumer() : void
  + eteindre() : void
  + toString() : String
}

class Television {
  - volume : int
  + allumer() : void
  + eteindre() : void
  + toString() : String
}

class Telecommande {
  - appareils : List<Appareil>
  + ajouterAppareil(a : Appareil) : void
  + activer(i : int) : void
  + desactiver(i : int) : void
  + activerTout() : void
  + toString() : String
}

Lampe ..|> Appareil
Hifi ..|> Appareil
Television ..|> Appareil
Telecommande "1" --> "0..*" Appareil

@enduml





@startuml

interface Appareil {
  + allumer() : void
  + eteindre() : void
}

class Lampe {
  - nom : String
  - allume : boolean
  + allumer() : void
  + eteindre() : void
  + toString() : String
}

class Hifi {
  - son : int
  + allumer() : void
  + eteindre() : void
  + toString() : String
}

class Telecommande {
  - appareils : List<Appareil>
  + ajouterAppareil(a : Appareil) : void
  + activer(i : int) : void
  + desactiver(i : int) : void
  + activerTout() : void
  + toString() : String
}

Lampe ..|> Appareil
Hifi ..|> Appareil
Telecommande "1" --> "0..*" Appareil

@enduml