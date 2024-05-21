# trilha-java-basico-desafios-poo
classDiagram
    iPhone <|-- ReprodutorMusical
    iPhone <|-- AparelhoTelefonico
    iPhone <|-- NavegadorInternet
   
    class ReprodutorMusical{
      +tocar()
      +pausar()
      +selecionarMusica(Stringmusica)
    }
    class AparelhoTelefonico{
      -ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
    }
    class NavegadorInternet{
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }
