package teste_unitario;

import org.junit.Test;
import org.junit.Assert;

public class Teste_ex03 {
        @Test
        public void validarFrase(){
            Assert.assertEquals("Gabriel",Ex03.retorneNome());
        }


}

