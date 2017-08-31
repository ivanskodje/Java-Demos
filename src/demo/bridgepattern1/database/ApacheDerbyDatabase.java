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
package demo.bridgepattern1.database;

import demo.bridgepattern1.database.IDatabase;

/**
 * This is where you would implement the "how we do it" from the IDatabase
 * interface.
 *
 * @author Ivan Skodje
 */
public class ApacheDerbyDatabase implements IDatabase
{

	@Override
	public void connect()
	{
		System.out.println("Connected to the Apache Derby database!");
	}

}
