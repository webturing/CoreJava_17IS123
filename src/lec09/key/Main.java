package lec09.key;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		for (int T = cin.nextInt(); T-- > 0;) {
			int n = cin.nextInt();
			Pipe[] pipes = new Pipe[n];
			for (int i = 0; i < pipes.length; i++) {
				pipes[i] = new Pipe(cin.nextInt(), cin.nextInt(), cin.nextInt());
			}
			Arrays.sort(pipes);
			System.out.println(pipes[0].number);
		}
	}

	static Scanner cin = new Scanner(System.in);
	static class Pipe implements Comparable<Pipe> {
		int length;
		int diameter;
		int number;

		public Pipe(int length, int diameter, int number) {
			super();
			this.length = length;
			this.diameter = diameter;
			this.number = number;
		}

		@Override
		public int compareTo(Pipe that) {
			if (this.length != that.length)
				return that.length - this.length;
			if (this.diameter != that.diameter)
				return this.diameter - that.diameter;
			return that.number - this.number;
		}

	}
}
