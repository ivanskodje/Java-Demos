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
package demo.bridgepattern.database;

/**
 * The IDatabase is going to be taken in by "DatabaseHandler" as a bridge to run
 * the commands that would be expected between the Handler and Database.
 *
 * IDatabase is a database interface that each followed database will inherit.
 * This allows us to be independent of the "how we do it", and can focus more on
 * "what we can do" when we create classes that implements IDatabase.
 *
 * For the purpose of this demo, we have only included "connect()". The same
 * principle also applies for executing queries and pulling data from the
 * database.
 *
 * @author Ivan Skodje
 */
public interface IDatabase
{

	/* Establishes connection with server */
	public void connect();
}
