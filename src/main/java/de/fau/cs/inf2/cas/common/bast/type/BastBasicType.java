/*
 * Copyright (c) 2017 Programming Systems Group, CS Department, FAU
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 */

package de.fau.cs.inf2.cas.common.bast.type;

import de.fau.cs.inf2.cas.common.bast.general.TagConstants;
import de.fau.cs.inf2.cas.common.bast.visitors.IBastVisitor;

import de.fau.cs.inf2.cas.common.parser.odin.TokenAndHistory;



/**
 * todo.
 *
 * <p>Represents the basic types of C, Java
 * 

 */
public class BastBasicType extends BastType {

  public static final int TAG = TagConstants.BAST_BASIC_TYPE;
  public int typeTag = TagConstants.TYPE_NONE;

  /**
   * Instantiates a new bast basic type.
   *
   * @param tokens the tokens
   * @param type the type
   */
  public BastBasicType(TokenAndHistory[] tokens, int type) {
    super(tokens);
    typeTag = type;
  }

  /**
   * Accept.
   *
   * @param visitor the visitor
   */
  @Override
  public void accept(IBastVisitor visitor) {
    visitor.visit(this);
  }

  
  /**
   * Gets the tag.
   *
   * @return the tag
   */
  @Override
  public int getTag() {
    return TAG;
  }

  
  /**
   * Gets the type tag2.
   *
   * @return the type tag2
   */
  public int getTypeTag2() {
    return typeTag;
  }

  
  /**
   * To string.
   *
   * @return the string
   */
  public String toString() {
    switch (typeTag) {
      case TagConstants.TYPE_VOID:
        return "void";
      case TagConstants.TYPE_BOOL:
        return "bool";
      case TagConstants.TYPE_BYTE:
        return "u8";
      case TagConstants.TYPE_CHAR:
        return "i8";
      case TagConstants.TYPE_WORD:
        return "u16";
      case TagConstants.TYPE_DWORD:
        return "u32";
      case TagConstants.TYPE_QWORD:
        return "u64";
      case TagConstants.TYPE_INT:
        return "i16";
      case TagConstants.TYPE_DINT:
        return "i32";
      case TagConstants.TYPE_QINT:
        return "i64";
      case TagConstants.TYPE_FLOAT:
        return "float";
      case TagConstants.TYPE_GENERAL_INT:
        return "gen_int";
      case TagConstants.TYPE_GENERAL_BOOLEAN:
        return "gen_boolean";
      case TagConstants.TYPE_UNKNOWN:
        return "unknown";
      case TagConstants.TYPE_SHORT:
        return "short";
      case TagConstants.TYPE_SIGNED:
        return "signed";
      case TagConstants.TYPE_UNSIGNED:
        return "unsigned";
      case TagConstants.TYPE_DOUBLE:
        return "double";
      case TagConstants.TYPE_LONG:
        return "long";

      default:
        return "none";
    }
  }
}
