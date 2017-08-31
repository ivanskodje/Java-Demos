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
package demo.bridgepattern1.handler;

import demo.bridgepattern1.database.IDatabase;

/**
 * BasicDatabaseHandler is an extension to the DatabaseHandler abstraction. This
 * allows us to easily add new functions and features when needed. Usually to
 * provide more options to deal with the same IDatabase.
 *
 * This is more formally known as the refined abstraction in a bridge design
 * pattern.
 *
 * @author Ivan Skodje
 */
public class BasicDatabaseHandler extends DatabaseHandler
{

	/**
	 * We use composition and expect an IDatabase implemented object.
	 *
	 * @param database
	 */
	public BasicDatabaseHandler(IDatabase database)
	{
		super(database);
	}

	/**
	 * Connect to the database.
	 *
	 * We do not know if we are using SQLite or Apache Derby. All we know is
	 * that any concrete implementation of IDatabase must be able to connect()
	 */
	@Override
	public void connect()
	{
		System.out.println("Doing a basic connect... ");
		database.connect();
	}
}
