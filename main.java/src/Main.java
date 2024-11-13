// Classe base Forca
class Forca {
    protected int forca;
    protected int vida;
    protected String genero;
    protected String nome;

    public Forca(int forca, int vida, String nome) {
        this.forca = forca;
        this.vida = vida;
        this.nome = nome;
    }

    public void atacar(Forca f) {
        System.out.println(nome + " está atacando " + f.nome);
    }
}

// Classe Jedi, subclasse de Forca
class Jedi extends Forca {
    public Jedi(int forca, int vida, String nome) {
        super(forca, vida, nome);
        setGenero("Jedi");
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

// Classe Sith, subclasse de Forca
class Sith extends Forca {
    public Sith(int forca, int vida, String nome) {
        super(forca, vida, nome);
        setGenero("Sith");
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

// Subclasse Padawan de Jedi
class Padawan extends Jedi {
    public Padawan(String nome) {
        super(20, 100, nome);
    }
}

// Subclasse Cavaleiro de Jedi
class Cavaleiro extends Jedi {
    public Cavaleiro(String nome) {
        super(70, 100, nome);
    }
}

// Subclasse MestreJedi de Jedi
class MestreJedi extends Jedi {
    public MestreJedi(String nome) {
        super(100, 100, nome);
    }
}

// Subclasse Aprendiz de Sith
class Aprendiz extends Sith {
    public Aprendiz(String nome) {
        super(40, 100, nome);
    }
}

// Subclasse Lord de Sith
class Lord extends Sith {
    public Lord(String nome) {
        super(80, 100, nome);
    }
}

// Subclasse MestreSith de Sith
class MestreSith extends Sith implements Raios {
    public MestreSith(String nome) {
        super(120, 100, nome);
    }

    @Override
    public void usarRaio() {
        System.out.println(nome + " está usando raio com força extra de " + forcaExtra);
    }
}

// Interface Raios
interface Raios {
    String cor = "Azul";
    int forcaExtra = 50;

    void usarRaio();
}

// Classe principal para teste
public class Main {
    public static void main(String[] args) {
        Padawan padawan = new Padawan("Anakin");
        Cavaleiro cavaleiro = new Cavaleiro("Obi-Wan");
        MestreJedi mestreJedi = new MestreJedi("Yoda");

        Aprendiz aprendiz = new Aprendiz("Darth Maul");
        Lord lord = new Lord("Darth Vader");
        MestreSith mestreSith = new MestreSith("Darth Sidious");

        // Testando ataques
        padawan.atacar(aprendiz);
        cavaleiro.atacar(lord);
        mestreJedi.atacar(mestreSith);

        // Testando o uso de raios pelo MestreSith
        mestreSith.usarRaio();
    }
}

