/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class JsonDocument extends PersistentDocument {
  private transient long swigCPtr;

  protected JsonDocument(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.JsonDocument_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(JsonDocument obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_JsonDocument(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public JsonDocument() {
    this(pjsua2JNI.new_JsonDocument(), true);
  }

  public void loadFile(String filename) throws java.lang.Exception {
    pjsua2JNI.JsonDocument_loadFile(swigCPtr, this, filename);
  }

  public void loadString(String input) throws java.lang.Exception {
    pjsua2JNI.JsonDocument_loadString(swigCPtr, this, input);
  }

  public void saveFile(String filename) throws java.lang.Exception {
    pjsua2JNI.JsonDocument_saveFile(swigCPtr, this, filename);
  }

  public String saveString() throws java.lang.Exception {
    return pjsua2JNI.JsonDocument_saveString(swigCPtr, this);
  }

  public ContainerNode getRootContainer() {
    return new ContainerNode(pjsua2JNI.JsonDocument_getRootContainer(swigCPtr, this), false);
  }

}
