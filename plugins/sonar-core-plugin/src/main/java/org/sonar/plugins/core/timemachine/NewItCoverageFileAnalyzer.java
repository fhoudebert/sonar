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
package org.sonar.plugins.core.timemachine;

import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;
import org.sonar.batch.components.TimeMachineConfiguration;

public class NewItCoverageFileAnalyzer extends AbstractNewCoverageFileAnalyzer {

  public NewItCoverageFileAnalyzer(TimeMachineConfiguration timeMachineConfiguration) {
    super(timeMachineConfiguration);
  }

  @Override
  public Metric getCoverageLineHitsDataMetric() {
    return CoreMetrics.IT_COVERAGE_LINE_HITS_DATA;
  }

  @Override
  public Metric getConditionsByLineMetric() {
    return CoreMetrics.IT_CONDITIONS_BY_LINE;
  }

  @Override
  public Metric getCoveredConditionsByLineMetric() {
    return CoreMetrics.IT_COVERED_CONDITIONS_BY_LINE;
  }

  @Override
  public Metric getNewLinesToCoverMetric() {
    return CoreMetrics.NEW_IT_LINES_TO_COVER;
  }

  @Override
  public Metric getNewUncoveredLinesMetric() {
    return CoreMetrics.NEW_IT_UNCOVERED_LINES;
  }

  @Override
  public Metric getNewConditionsToCoverMetric() {
    return CoreMetrics.NEW_IT_CONDITIONS_TO_COVER;
  }

  @Override
  public Metric getNewUncoveredConditionsMetric() {
    return CoreMetrics.NEW_IT_UNCOVERED_CONDITIONS;
  }
}
