package mark.allen.weiss.chapter03.stack;

import org.junit.Before;
import org.junit.Test;

public class MyArrayStackTest {

	private MyArrayStack<Integer> stack;

	@Before
	public void setUp() {
		stack = new MyArrayStack<Integer>();
		stack.push(3);
		stack.push(5);
		stack.push(8);
		stack.push(11);
		stack.push(3);
		stack.push(5);
		stack.push(8);
		stack.push(11);

		System.out.println(stack.print());
	}

	@Test
	public void pushTest() {
		stack.push(3);
		stack.push(5);
		stack.push(8);
		stack.push(11);

		System.out.println(stack.print());
	}

	/**
	 * 不能用for循环。因为每次pop。栈大小-1
	 */
	@Test
	public void popTest() {
		boolean result = true;
		while (result) {
			if (!stack.isEmpty()) {
				System.out.println(stack.pop());
			} else {
				result = false;
			}

		}

	}
}
