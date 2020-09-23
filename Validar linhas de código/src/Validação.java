import java.util.ArrayList;
import java.util.Stack;

public class Validação {

    public boolean balanceamentoParenteses (String parenteses)
    {
        Stack<Character> Pilha = new Stack<Character>();
        ArrayList<Character> inicio = new ArrayList<Character>();
        inicio.add('(');
        inicio.add('{');
        inicio.add('[');
        inicio.add('<');
        ArrayList<Character> fina = new ArrayList<Character>();
        fina.add(')');
        fina.add('}');
        fina.add(']');
        fina.add('>');

        for (char character : parenteses.toCharArray())
        {
            if (inicio.contains(character))
            {
                Pilha.push(character);
            }
            else if (fina.contains(character))
            {
                char atual = Pilha.pop();
                if (atual == '(')
                {
                    if (character != ')')
                    {
                        return false;
                    }
                }
                if (atual == '[')
                {
                    if (character != ']')
                    {
                        return false;
                    }
                }
                if (atual == '{')
                {
                    if (character != '}')
                    {
                        return false;
                    }
                }
                if (atual == '<')
                {
                    if (character != '>')
                    {
                        return false;
                    }
                }
            }
            else if (Pilha.isEmpty() || Pilha.pop() != character)
            {
                return false;
            }
        }

        return Pilha.isEmpty();
    }
}
