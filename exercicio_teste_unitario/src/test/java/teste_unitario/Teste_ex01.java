package teste_unitario;

import org.junit.Test;
import org.junit.Assert;


public class Teste_ex01 {
    @Test
    public void validaPalavra(){
        Assert.assertEquals("Bom dia",Ex01.retronePalavra());
    } 
    @Test
    public void validaPalavraIncorreta() {
        Assert.assertEquals("não",Ex01.retronePalavra());

    }
    }
    

