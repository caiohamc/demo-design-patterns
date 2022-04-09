package br.com.caio.Pattern01Strategy.classes;

import br.com.caio.Pattern01Strategy.interfaces.IDisplayBehavior;
import br.com.caio.Pattern01Strategy.interfaces.IFlyBehavior;
import br.com.caio.Pattern01Strategy.interfaces.IQuackBehavior;

/**
 * @author caioalbuquerque
 *
 * Como esta é a superclasse e tudo refere-se a patos e aos tipos de patos e as coisas que patos fazem, a explicação do pattern ficará aqui.
 *
 * Este padrão torna mais independente a forma como uma estratégia é executada em um determinado contexto por um ou mais clientes.
 * Mesmo que algo seja alterado (superclasse ou subclasse) não deve haver impactos no sistema.
 *
 * No exemplo, tipos de PATOS e cada um  faz DISPLAY, QUACK e FLY diferente.
 * Sem interfaces e com heranças, é possível. Porém, não de forma tão desacoplada (algumas alterações acabam não sendo transparentes)
 *
 * Com o pattern STRATEGY, mesmo que a estratégia de ação dos patos seja alterada, nada irá afetar o resto do sistema.
 * Em outras palavras, cada pato irá executar um DISPLAY, QUACK e FLY.
 * Porém, a forma como será executado será desacoplada do restante.
 */
public class Duck {
    public IDisplayBehavior displayBehavior;
    public IFlyBehavior flyBehavior;
    public IQuackBehavior quackBehavior;

    public String tryToDisplay(){
        return this.displayBehavior.display();
    }

    public String tryToFly(){
        return this.flyBehavior.fly();
    }

    public String tryToQuack(){
        return this.quackBehavior.quack();
    }
}