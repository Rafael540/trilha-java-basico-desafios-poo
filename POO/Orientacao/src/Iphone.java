public class Iphone {
    public void Tocar(){
        tocandoMusica();
        System.out.println("Tocando música!");
        
        pausandoMusica();
        System.out.println("A música foi pausada");

        selecionarMusica("Bella chao");
        System.out.println("A musica foi selecionada");
    }

    public void Ligando(){
        vericandoLinha();
        
        ligar("99999-5555");
        System.out.println("Ligando");

        atender();

        iniciarCorreioVoz();
    }

    public void NavegadorInternet(){
        exibirPagina("www.noticias.com.br");
        System.out.println("Página sendo exibida");

        adicionarNovaAba();
        System.out.println("Abrindo nova aba");

        atualizarPagina();
        System.out.println("Pagina foi atualizada");
    }

//Reprodutor Musical
private void tocandoMusica(){
    System.out.println("A música esta tocando");
}

private void pausandoMusica() {
    System.out.println("A música está sendo pausada");
}

private void selecionarMusica(String musica){
   System.out.println("Selecionando música"); 
}


//Aparelho telefonico
private void vericandoLinha(){
    System.out.println("Verificando linha");
}
private void ligar(String numero){
    System.out.println("Ligando");
}

private void atender(){
    System.out.println("Atendendo ligação");
}

private void iniciarCorreioVoz(){
    System.out.println("Ligação não foi atendida");
}

//Navegador Internet
private void exibirPagina(String url){
    System.out.println("Acessando página");
}

private void adicionarNovaAba(){
    System.out.println("Nova aba sendo adicionada");
}

private void atualizarPagina(){
    System.out.println("Adicionando nova página");
}
}

