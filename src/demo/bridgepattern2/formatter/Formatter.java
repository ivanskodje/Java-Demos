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
 * It is up to you to decide how you would like to format the data. Another
 * great part of using the bridge design pattern - flexibility.
 *
 * @author Ivan Skodje
 */
public abstract class Formatter
{

	public abstract String format(String category, List<Property> properties);
}
