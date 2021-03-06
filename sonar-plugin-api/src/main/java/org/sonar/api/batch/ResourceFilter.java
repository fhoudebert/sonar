/*
 * Sonar, open source software quality management tool.
 * Copyright (C) 2008-2011 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * Sonar is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * Sonar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Sonar; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.api.batch;

import org.sonar.api.BatchExtension;
import org.sonar.api.resources.Resource;

/**
 * Filter resources to save. For example, ignore a resource if its path matches an exclusion pattern (defined on the project).
 * Filters are applied to files, directories and packages only.
 *
 * If the method start(), without parameters, exists, then it is executed at startup.
 *
 * @since 1.12
 */
public interface ResourceFilter extends BatchExtension {

  /**
   * Return true if the resource must be ignored, else it's saved into database.
   */
  boolean isIgnored(Resource resource);
  
}
