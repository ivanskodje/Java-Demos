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
package demo.bridgepattern2.formatter;

import demo.bridgepattern2.items.Property;
import java.util.List;

/**
 * TextFormatter will format the Name and Properties in a readable text format.
 * Perhaps to print on a web-site, or perhaps on an item viewer.
 *
 * @author Ivan Skodje
 */
public class TextFormatter extends Formatter
{

	@Override
	public String format(String category, List<Property> properties)
	{
		String text = category + "\n";

		for (Property property : properties)
		{
			text += property.getName() + ": " + property.getDescription() + "\n";
		}

		return text;
	}

}
