package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApoliceTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Apolice apolice = new Apolice("2025-1", "Carlos", new Veiculo("Gol", 2020), "Juiz de Fora");

        Apolice apoliceClone = apolice.clone();
        apoliceClone.setNumero("2026-1");
        apoliceClone.setNomeSegurado("Ana");
        apoliceClone.getVeiculo().setAno(2024);

        assertEquals("Apolice{numero='2025-1', nomeSegurado='Carlos', veiculo=Veiculo{modelo='Gol', ano=2020}, cidade='Juiz de Fora'}", apolice.toString());
        assertEquals("Apolice{numero='2026-1', nomeSegurado='Ana', veiculo=Veiculo{modelo='Gol', ano=2024}, cidade='Juiz de Fora'}", apoliceClone.toString());
    }
}
