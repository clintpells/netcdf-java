/*
 * Copyright (c) 1998-2020 John Caron and University Corporation for Atmospheric Research/Unidata
 * See LICENSE for license information.
 */


package thredds.server.opendap.servlet.www;

import java.io.PrintWriter;
import opendap.dap.DAS;
import opendap.dap.DInt32;

/**
 */
public class wwwI32 extends DInt32 implements BrowserForm {

  private static boolean _Debug = false;

  /**
   * Constructs a new <code>wwwI32</code>.
   */
  public wwwI32() {
    this(null);
  }

  /**
   * Constructs a new <code>wwwI32</code> with name <code>n</code>.
   *
   * @param n the name of the variable.
   */
  public wwwI32(String n) {
    super(n);
  }

  public void printBrowserForm(PrintWriter pw, DAS das) {
    wwwOutPut wOut = new wwwOutPut(pw);
    wOut.writeSimpleVar(pw, this);
  }


}


