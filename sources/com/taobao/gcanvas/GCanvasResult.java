package com.taobao.gcanvas;

import android.app.Activity;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GCanvasResult<T> {
    protected Activity mActivity;
    protected String mCallbackId;
    protected int mChangingThreads;
    protected T mCustomData;
    protected boolean mFinished;
    protected ResultCode mResultCode;
    protected Listener mResultListener;
    protected Object mResultMessage;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface Listener {
        void onCallJS(String str);

        void onResult(GCanvasResult gCanvasResult, ResultCode resultCode, Object obj);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum ResultCode {
        NO_RESULT,
        OK,
        ERROR
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    public void setActivity(Activity activity) {
        this.mActivity = activity;
    }

    public GCanvasResult() {
        this.mResultCode = ResultCode.NO_RESULT;
        this.mActivity = null;
        this.mCallbackId = "";
    }

    public GCanvasResult(T t) {
        this.mResultCode = ResultCode.NO_RESULT;
        this.mActivity = null;
        this.mCustomData = t;
        this.mCallbackId = "";
    }

    public GCanvasResult(String str, Listener listener) {
        this.mResultCode = ResultCode.NO_RESULT;
        this.mActivity = null;
        this.mCallbackId = str;
        this.mResultListener = listener;
    }

    public ResultCode getResultCode() {
        return this.mResultCode;
    }

    public Object getResultMessage() {
        return this.mResultMessage;
    }

    public boolean isFinished() {
        return this.mFinished;
    }

    public boolean isChangingThreads() {
        return this.mChangingThreads > 0;
    }

    public String getCallbackId() {
        return this.mCallbackId;
    }

    public T getCustomData() {
        return this.mCustomData;
    }

    public void setResult(ResultCode resultCode, Object obj) {
        this.mResultCode = resultCode;
        this.mResultMessage = obj;
        onResult(resultCode, obj);
    }

    protected void onResult(ResultCode resultCode, Object obj) {
        if (this.mResultListener != null) {
            this.mResultListener.onResult(this, resultCode, obj);
        }
    }

    protected void onCallJS(String str) {
        if (this.mResultListener != null) {
            this.mResultListener.onCallJS(str);
        }
    }

    public void success(JSONObject jSONObject) {
        setResult(ResultCode.OK, jSONObject);
    }

    public void success(JSONArray jSONArray) {
        setResult(ResultCode.OK, jSONArray);
    }

    public void success(int i) {
        setResult(ResultCode.OK, Integer.valueOf(i));
    }

    public void success(String str) {
        setResult(ResultCode.OK, str);
    }

    public void success(boolean z) {
        setResult(ResultCode.OK, Boolean.valueOf(z));
    }

    public void success(float f) {
        setResult(ResultCode.OK, Float.valueOf(f));
    }

    public void success(Object obj) {
        setResult(ResultCode.OK, obj);
    }

    public void success() {
        setResult(ResultCode.OK, "");
    }

    public void error() {
        setResult(ResultCode.ERROR, "");
    }

    public void error(JSONObject jSONObject) {
        setResult(ResultCode.ERROR, jSONObject.toString());
    }

    public void error(String str) {
        setResult(ResultCode.ERROR, str);
    }

    public void error(Object obj) {
        setResult(ResultCode.ERROR, obj);
    }

    public void calljs(String str) {
        onCallJS(str);
    }
}
