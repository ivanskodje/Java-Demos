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
package demo.bridgepattern1;

import demo.bridgepattern1.handler.DatabaseHandler;
import demo.bridgepattern1.handler.AdvancedDatabaseHandler;
import demo.bridgepattern1.handler.BasicDatabaseHandler;
import demo.bridgepattern1.database.SQLiteDatabase;
import demo.bridgepattern1.database.ApacheDerbyDatabase;
import demo.bridgepattern1.database.IDatabase;

/**
 * Bridge Pattern Demo
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
	 *
	 * DatabaseHandler : Abstraction
	 *
	 * BasicDatabaseHandler : Refined Abstraction
	 *
	 * AdvancedDatabasehandler : Refined Abstraction
	 *
	 * IDatabase : Implementor
	 *
	 * SQLiteDatabase : Concrete Implementor
	 *
	 * ApacheDerbyDatabase : Concrete Implementor
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		// Basic DatabaseHandler using SQLite
		IDatabase sqliteDatabase = new SQLiteDatabase();
		DatabaseHandler sqliteDatabaseHandler = new BasicDatabaseHandler(sqliteDatabase);
		sqliteDatabaseHandler.connect();

		// Advanced DatabaseHandler using Apache Derby
		IDatabase apacheDerbyDatabase = new ApacheDerbyDatabase();
		DatabaseHandler derbyDatabaseHandler = new AdvancedDatabaseHandler(apacheDerbyDatabase);
		derbyDatabaseHandler.connect();
	}

}
