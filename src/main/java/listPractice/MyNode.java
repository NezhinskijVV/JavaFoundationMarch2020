package listPractice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MyNode<E> {
    private E value;
    private MyNode<E> next;
}
