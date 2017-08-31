/*
 * Copyright (C) 2017 Ivan Skodje
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package demo.simple.bridgepattern;

/**
 * A simple Bridge Pattern demo
 *
 * @author Ivan Skodje
 */
public class Main
{

	/* Abstractor */
	abstract class Abstractor
	{

		protected Implementor impl;

		public Abstractor(Implementor impl)
		{
			this.impl = impl;
		}

		public abstract void operation();
	}

	/* Implementor */
	interface Implementor
	{

		public void implementedOperation();
	}

	/* Refined Abstraction 1*/
	class RefinedAbstraction1 extends Abstractor
	{

		public RefinedAbstraction1(Implementor impl)
		{
			super(impl);
		}

		@Override
		public void operation()
		{
			impl.implementedOperation();
		}
	}

	/* Concrete Implementor 1 */
	class ConcreteImplementor1 implements Implementor
	{

		@Override
		public void implementedOperation()
		{
			System.out.println("Running implemented operation 1");
		}
	}

	/* Concrete Implementor 2 */
	class ConcreteImplementor2 implements Implementor
	{

		@Override
		public void implementedOperation()
		{
			System.out.println("Running implemented operation 2");
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		// We create an instance of Main in order to run directly from main.
		// (Otherwise we will get a non-static variable error)
		Main main = new Main();
		main.run();
	}

	/* Run Demo */
	private void run()
	{
		Implementor concreteImplementor1 = new ConcreteImplementor1();
		Abstractor refinedAbstraction1 = new RefinedAbstraction1(concreteImplementor1);
		refinedAbstraction1.operation();

		Implementor concreteImplementor2 = new ConcreteImplementor2();
		refinedAbstraction1 = new RefinedAbstraction1(concreteImplementor2);
		refinedAbstraction1.operation();
	}
}
