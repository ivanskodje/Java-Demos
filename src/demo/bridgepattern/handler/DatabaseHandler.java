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
package demo.bridgepattern.handler;

import demo.bridgepattern.database.IDatabase;

/**
 * We define the abstraction, and we keep the reference to the IDatabase. The
 * IDatabase is the interface that the Databases implements.
 *
 * This is more formally known as the "Abstraction" in a bridge design pattern.
 *
 * @author Ivan Skodje
 */
public abstract class DatabaseHandler
{

	protected IDatabase database;

	/**
	 * We use composition and expect an IDatabase implemented object.
	 *
	 * @param database
	 */
	public DatabaseHandler(IDatabase database)
	{
		this.database = database;
	}

	/**
	 * This is the operation we want to perform on the IDatabase. We can also
	 * add other operations such as "getClients" or other database queries that
	 * IDatabase may have implemented.
	 */
	abstract public void connect();
}
