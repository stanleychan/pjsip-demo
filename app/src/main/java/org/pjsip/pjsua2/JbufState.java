/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class JbufState {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected JbufState(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(JbufState obj) {
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
        pjsua2JNI.delete_JbufState(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrameSize(long value) {
    pjsua2JNI.JbufState_frameSize_set(swigCPtr, this, value);
  }

  public long getFrameSize() {
    return pjsua2JNI.JbufState_frameSize_get(swigCPtr, this);
  }

  public void setMinPrefetch(long value) {
    pjsua2JNI.JbufState_minPrefetch_set(swigCPtr, this, value);
  }

  public long getMinPrefetch() {
    return pjsua2JNI.JbufState_minPrefetch_get(swigCPtr, this);
  }

  public void setMaxPrefetch(long value) {
    pjsua2JNI.JbufState_maxPrefetch_set(swigCPtr, this, value);
  }

  public long getMaxPrefetch() {
    return pjsua2JNI.JbufState_maxPrefetch_get(swigCPtr, this);
  }

  public void setBurst(long value) {
    pjsua2JNI.JbufState_burst_set(swigCPtr, this, value);
  }

  public long getBurst() {
    return pjsua2JNI.JbufState_burst_get(swigCPtr, this);
  }

  public void setPrefetch(long value) {
    pjsua2JNI.JbufState_prefetch_set(swigCPtr, this, value);
  }

  public long getPrefetch() {
    return pjsua2JNI.JbufState_prefetch_get(swigCPtr, this);
  }

  public void setSize(long value) {
    pjsua2JNI.JbufState_size_set(swigCPtr, this, value);
  }

  public long getSize() {
    return pjsua2JNI.JbufState_size_get(swigCPtr, this);
  }

  public void setAvgDelayMsec(long value) {
    pjsua2JNI.JbufState_avgDelayMsec_set(swigCPtr, this, value);
  }

  public long getAvgDelayMsec() {
    return pjsua2JNI.JbufState_avgDelayMsec_get(swigCPtr, this);
  }

  public void setMinDelayMsec(long value) {
    pjsua2JNI.JbufState_minDelayMsec_set(swigCPtr, this, value);
  }

  public long getMinDelayMsec() {
    return pjsua2JNI.JbufState_minDelayMsec_get(swigCPtr, this);
  }

  public void setMaxDelayMsec(long value) {
    pjsua2JNI.JbufState_maxDelayMsec_set(swigCPtr, this, value);
  }

  public long getMaxDelayMsec() {
    return pjsua2JNI.JbufState_maxDelayMsec_get(swigCPtr, this);
  }

  public void setDevDelayMsec(long value) {
    pjsua2JNI.JbufState_devDelayMsec_set(swigCPtr, this, value);
  }

  public long getDevDelayMsec() {
    return pjsua2JNI.JbufState_devDelayMsec_get(swigCPtr, this);
  }

  public void setAvgBurst(long value) {
    pjsua2JNI.JbufState_avgBurst_set(swigCPtr, this, value);
  }

  public long getAvgBurst() {
    return pjsua2JNI.JbufState_avgBurst_get(swigCPtr, this);
  }

  public void setLost(long value) {
    pjsua2JNI.JbufState_lost_set(swigCPtr, this, value);
  }

  public long getLost() {
    return pjsua2JNI.JbufState_lost_get(swigCPtr, this);
  }

  public void setDiscard(long value) {
    pjsua2JNI.JbufState_discard_set(swigCPtr, this, value);
  }

  public long getDiscard() {
    return pjsua2JNI.JbufState_discard_get(swigCPtr, this);
  }

  public void setEmpty(long value) {
    pjsua2JNI.JbufState_empty_set(swigCPtr, this, value);
  }

  public long getEmpty() {
    return pjsua2JNI.JbufState_empty_get(swigCPtr, this);
  }

  public JbufState() {
    this(pjsua2JNI.new_JbufState(), true);
  }

}
