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
package demo.bridgepattern2.printer;

import demo.bridgepattern2.items.Book;
import demo.bridgepattern2.items.Property;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple book printer. We expect a book, and we will work with the book.
 *
 * @author Ivan Skodje
 */
public class BookPrinter extends Printer
{

	private Book book;

	public BookPrinter(Book book)
	{
		this.book = book;
	}

	@Override
	protected String getCategory()
	{
		return book.getCategory();
	}

	@Override
	protected List<Property> getProperties()
	{
		List<Property> properties = new ArrayList<>();

		properties.add(new Property("Name", book.getName()));
		properties.add(new Property("Publisher", book.getPublisher()));
		properties.add(new Property("Year Published", book.getYearPublished() + ""));

		return properties;
	}
}
