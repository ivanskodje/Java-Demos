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

import demo.bridgepattern2.formatter.Formatter;
import demo.bridgepattern2.items.Property;
import java.util.List;

/**
 *
 * @author Ivan Skodje
 */
public abstract class Printer
{

	/**
	 * Returns a string using a specific formatter
	 *
	 * @param formatter
	 * @return
	 */
	public String getPrint(Formatter formatter)
	{
		return formatter.format(getCategory(), getProperties());
	}

	/**
	 * getCategory is used to get the type of data we are working with. Working
	 * with groceries instead of Books? The category could be "Food". Everything
	 * has a category!
	 *
	 * @return
	 */
	abstract protected String getCategory();

	/**
	 * Returns a List of properties. We use Property to send data over the
	 * bridge.
	 *
	 * @return
	 */
	abstract protected List<Property> getProperties();

}
