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
package demo.bridgepattern2;

import demo.bridgepattern2.items.Book;
import demo.bridgepattern2.formatter.Formatter;
import demo.bridgepattern2.formatter.TextFormatter;
import demo.bridgepattern2.formatter.HTMLFormatter;
import demo.bridgepattern2.printer.BookPrinter;

/**
 * Bridge Pattern Demo #2
 *
 * The Java Bridge Pattern decouples abstraction and implementation. Some of the
 * techniques involved in this demo are inheritance, encapsulation and
 * composition.
 *
 ********************************
 *
 * Why use the Bridge Pattern?
 *
 * - A neat way to remain "open" for new technologies down the road. Perhaps in
 * a year or two a new and 10000x faster database is available. Bridge Pattern
 * will make the implementation super-easy!
 *
 * - Can be used to make cross-platform support easier to implement (not very
 * relevant for Java though)
 *
 ********************************
 *
 * Any disadvantages?
 *
 * - Increases code complexity
 *
 * - Possible performance issues having to send messages along the abstractor
 * (DatabaseHandler) and implementor (IDatabase).
 *
 *
 * @author Ivan Skodje
 */
public class Main
{

	/**
	 * In this example of Bridge Pattern in Java, we are going to imagine having
	 * a book inventory system that will interact with various systems.
	 *
	 * Our goal today is to use the same information to getPrint out book
	 * information to both readable text, and as HTML code. A way to do that, is
	 * to use Bridge Pattern.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		// Create the Book object
		Book book = new Book();
		book.setCategory("Pen & Paper RP");
		book.setName("Rifts Ultimate Edition");
		book.setPublisher("Palladium Books");
		book.setYearPublished(2005);

		// Create formatters that we send to book printer in order to get different results
		Formatter textFormatter = new TextFormatter();
		Formatter htmlFormatter = new HTMLFormatter();

		// Create a Book Printer with the book we want to getPrint
		BookPrinter bookPrinter = new BookPrinter(book);

		// Print readable text 
		String readableText = bookPrinter.getPrint(textFormatter);
		System.out.println("----- Readable Text -----");
		System.out.println(readableText);

		// Print HTML code (that is a table)
		String htmlText = bookPrinter.getPrint(htmlFormatter);
		System.out.println("----- HTML Text -----");
		System.out.println(htmlText);
	}

}
