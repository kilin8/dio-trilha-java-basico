// Superclasse Veiculo
interface Veiculo {
    void liga();
}

// Subclasse Carro
class Carro implements Veiculo {
    @Override
    public void liga() {
        System.out.println("O carro está ligando");
    }
}

// Subclasse Moto
class Moto implements Veiculo {
    @Override
    public void liga() {
        System.out.println("A moto está ligando");
    }
}

// Interface do Factory Method
interface VeiculoFactory {
    Veiculo criaVeiculo();
}

// Implementação do Factory Method para Car
class CarroFactory implements VeiculoFactory {
    @Override
    public Veiculo criaVeiculo() {
        return new Carro();
    }
}

// Implementação do Factory Method para Motorcycle
class MotoFactory implements VeiculoFactory {
    @Override
    public Veiculo criaVeiculo() {
        return new Moto();
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        // Criando uma fábrica de carros
        VeiculoFactory carroFactory = new CarroFactory();
        Veiculo carro = carroFactory.criaVeiculo();
        carro.liga(); // Inicializa um carro

        // Criando uma fábrica de motocicletas
        VeiculoFactory motoFactory = new MotoFactory();
        Veiculo motorcycle = motoFactory.criaVeiculo();
        motorcycle.liga(); // Inicializa uma motocicleta
    }
}
