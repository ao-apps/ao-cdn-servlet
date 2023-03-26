/*
 * ao-cdn-servlet - Content delivery network (CDN) in a Servlet environment.
 * Copyright (C) 2023  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of ao-cdn-servlet.
 *
 * ao-cdn-servlet is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ao-cdn-servlet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ao-cdn-servlet.  If not, see <https://www.gnu.org/licenses/>.
 */
module com.aoapps.cdn.servlet {
  exports com.aoapps.cdn.servlet;
  // Direct
  requires com.aoapps.cdn.data; // <groupId>com.aoapps</groupId><artifactId>ao-cdn-data</artifactId>
  requires javax.servlet.api; // <groupId>javax.servlet</groupId><artifactId>javax.servlet-api</artifactId>
}
