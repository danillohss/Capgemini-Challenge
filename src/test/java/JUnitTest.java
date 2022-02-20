import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import Questao01.Questao01;
import Questao02.Questao02;
import Questao03.Questao03;

public class JUnitTest {
    
    public JUnitTest() {
    }
    
    //Teste para verificar se com um número negativo aconteceria algum erro.
    @Test
    void retornarValorNegativo() {
	Questao01 l1 = new Questao01();
	assertEquals("", l1.ladder(-10));
    }
    @Test
    void retornarValor3() {
	Questao01 l2 = new Questao01();
	assertEquals(" *\n" + "**\n" + "", l2.ladder(2));
    }
    @Test
    void retornarValor6() {
	Questao01 l3 = new Questao01();
	assertEquals("     *\n" + "    **\n" + "   ***\n" + "  ****\n" +
                    " *****\n" + "******\n" + "", l3.ladder(6));
    }
    @Test
    void retornarValor0() {
	Questao01 l4 = new Questao01();
	assertEquals("", l4.ladder(0));
    }
    @Test
    void retornarValorCorreto(){
	Questao02 pss1 = new Questao02();
	assertEquals("Senha cadastrada com sucesso.", pss1.verification("Ya3&ab"));
    }
    @Test
    void retornarValorErrado(){
	Questao02 pss2 = new Questao02();
	assertEquals("Sua senha não atende todos os requisitos. Faltam 3 caracteres", pss2.verification("A1@"));
    }
    @Test
    void retornarValorVazio(){
	Questao02 pss3 = new Questao02();
	assertEquals("Sua senha não atende todos os requisitos. Faltam 6 caracteres", pss3.verification(""));
    }
    @Test
    void retornarValor2(){
	Questao03 an1 = new Questao03();
	assertEquals("Saída:2", an1.anagram("ovo"));
    }
    @Test
    void retornarValorVazio2(){
	Questao03 an2 = new Questao03();
	assertEquals("Saída:0", an2.anagram(""));
    }
    @Test
    void retornarAnValor3(){
	Questao03 an3 = new Questao03();
	assertEquals("Saída:3", an3.anagram("ifailuhkqq"));
    }
     

}
