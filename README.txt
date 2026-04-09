sandri robin
Projet domotique TP4

@startuml

class Lampe {
  - nom : String
  - allume : boolean
  + Lampe(paramNom : String)
  + allumer() : void
  + eteindre() : void
  + isAllume() : boolean
  + toString() : String
}

class Hifi {
  - son : int
  + allumer() : void
  + eteindre() : void
  + toString() : String
}

class Telecommande {
  - lampes : List<Lampe>
  - hifis : List<Hifi>
  + Telecommande()
  + ajouterLampe(lampe : Lampe) : void
  + ajouterHifi(hifi : Hifi) : void
  + activerLampe(indiceLampe : int) : void
  + desactiverLampe(indiceLampe : int) : void
  + activerTout() : void
  + toString() : String
}

Telecommande "1" --> "0..*" Lampe : controle
Telecommande "1" --> "0..*" Hifi : controle

@enduml