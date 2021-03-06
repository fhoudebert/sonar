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
package org.sonar.persistence.resource;

public final class ResourceIndexDto {

  private String key;
  private int position;
  private int nameSize;
  private int resourceId;
  private int rootProjectId;
  private String qualifier;

  public String getKey() {
    return key;
  }

  public ResourceIndexDto setKey(String key) {
    this.key = key;
    return this;
  }

  public int getPosition() {
    return position;
  }

  public ResourceIndexDto setPosition(int i) {
    this.position = i;
    return this;
  }

  public int getResourceId() {
    return resourceId;
  }

  public ResourceIndexDto setResourceId(int i) {
    this.resourceId = i;
    return this;
  }

  public int getRootProjectId() {
    return rootProjectId;
  }

  public ResourceIndexDto setRootProjectId(int i) {
    this.rootProjectId = i;
    return this;
  }

  public int getNameSize() {
    return nameSize;
  }

  public ResourceIndexDto setNameSize(int i) {
    this.nameSize = i;
    return this;
  }

  public String getQualifier() {
    return qualifier;
  }

  public ResourceIndexDto setQualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }
}
