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
package org.sonar.java.ast.check;

import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;
import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.java.ast.visitor.AstUtils;
import org.sonar.java.ast.visitor.JavaAstVisitor;
import org.sonar.squid.api.CheckMessage;
import org.sonar.squid.api.SourceFile;

import java.util.Arrays;
import java.util.List;

@Rule(key = "AvoidBreakOutsideSwitch", priority = Priority.MAJOR)
public class BreakCheck extends JavaAstVisitor {

  @Override
  public List<Integer> getWantedTokens() {
    return WANTED_TOKENS;
  }

  @Override
  public void visitToken(DetailAST ast) {
    if (AstUtils.findParent(ast, TokenTypes.LITERAL_SWITCH) == null) {
      CheckMessage message = new CheckMessage(this,
          "The 'break' branching statement prevents refactoring the source code to reduce the complexity.");
      message.setLine(ast.getLineNo());
      SourceFile sourceFile = peekSourceCode().getParent(SourceFile.class);
      sourceFile.log(message);
    }
  }

  private static final List<Integer> WANTED_TOKENS = Arrays.asList(TokenTypes.LITERAL_BREAK);

}
