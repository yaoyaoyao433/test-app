package com.meituan.v8jse;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class JSValue {
    protected static final int INVALID_KEY = -1;
    public static final int TYPE_JSVALUE_ARRAY = 8;
    public static final int TYPE_JSVALUE_BOOLEAN = 4;
    public static final int TYPE_JSVALUE_DOUBLE = 6;
    public static final int TYPE_JSVALUE_FUNCTION = 9;
    public static final int TYPE_JSVALUE_INTEGER = 5;
    public static final int TYPE_JSVALUE_NULL = 1;
    public static final int TYPE_JSVALUE_OBJECT = 7;
    public static final int TYPE_JSVALUE_STRING = 3;
    public static final int TYPE_JSVALUE_UNDEFINED = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean booleanValue;
    private double doubleValue;
    private int integerValue;
    protected long mObjKey;
    protected JSRuntime mRuntime;
    protected int mType;
    private boolean released;
    private String stringValue;

    public boolean isArray() {
        return false;
    }

    public boolean isFunction() {
        return false;
    }

    public boolean isObject() {
        return false;
    }

    public JSValue(JSRuntime jSRuntime) {
        Object[] objArr = {jSRuntime};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da47e8002baab7fe7e83088dec6f26bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da47e8002baab7fe7e83088dec6f26bf");
            return;
        }
        this.mObjKey = -1L;
        this.mType = -1;
        this.mRuntime = jSRuntime;
    }

    public int getType() {
        return this.mType;
    }

    public static JSValue createStringValue(JSRuntime jSRuntime, String str) {
        Object[] objArr = {jSRuntime, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fdd7e52173c52c84d35fe3cb871d343a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fdd7e52173c52c84d35fe3cb871d343a");
        }
        long newJSString = jSRuntime.newJSString(str);
        JSValue jSValue = new JSValue(jSRuntime);
        jSValue.mType = 3;
        jSValue.stringValue = str;
        jSValue.mObjKey = newJSString;
        return jSValue;
    }

    public boolean isString() {
        return this.mType == 3;
    }

    public String stringValue() {
        return this.stringValue == null ? "" : this.stringValue;
    }

    public boolean isNullOrUndefined() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67907abc435aca0f22ca9cf0be0d3ca7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67907abc435aca0f22ca9cf0be0d3ca7")).booleanValue() : isNull() || isUndefined();
    }

    public boolean isNull() {
        return this.mType == 1;
    }

    public boolean isUndefined() {
        return this.mType == 2;
    }

    public static JSValue createBooleanValue(JSRuntime jSRuntime, boolean z) {
        Object[] objArr = {jSRuntime, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a6bc4b247664bdf439730ec62fd8644", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a6bc4b247664bdf439730ec62fd8644");
        }
        long newJSBoolean = jSRuntime.newJSBoolean(z);
        JSValue jSValue = new JSValue(jSRuntime);
        jSValue.mType = 4;
        jSValue.booleanValue = z;
        jSValue.mObjKey = newJSBoolean;
        return jSValue;
    }

    public boolean isBoolean() {
        return this.mType == 4;
    }

    public boolean booleanValue() {
        return this.booleanValue;
    }

    public static JSValue createIntegerValue(JSRuntime jSRuntime, int i) {
        Object[] objArr = {jSRuntime, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a4f8e6cbbb9a9faf74b17534382df20f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a4f8e6cbbb9a9faf74b17534382df20f");
        }
        long newJSInteger = jSRuntime.newJSInteger(i);
        JSValue jSValue = new JSValue(jSRuntime);
        jSValue.mType = 5;
        jSValue.integerValue = i;
        jSValue.mObjKey = newJSInteger;
        return jSValue;
    }

    public boolean isInteger() {
        return this.mType == 5;
    }

    public int integerValue() {
        return this.integerValue;
    }

    public static JSValue createDoubleValue(JSRuntime jSRuntime, double d) {
        Object[] objArr = {jSRuntime, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e7111cc246f40808f3585b411195d981", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e7111cc246f40808f3585b411195d981");
        }
        long newJSDouble = jSRuntime.newJSDouble(d);
        JSValue jSValue = new JSValue(jSRuntime);
        jSValue.mType = 6;
        jSValue.doubleValue = d;
        jSValue.mObjKey = newJSDouble;
        return jSValue;
    }

    public boolean isDouble() {
        return this.mType == 6;
    }

    public double doubleValue() {
        return this.doubleValue;
    }

    public void checkRelease() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6332b2e53ec258ac199fed2facbbc9a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6332b2e53ec258ac199fed2facbbc9a6");
        } else if (this.released) {
            throw new IllegalStateException("JSValue released");
        }
    }

    public Object getValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcff65e3b938f330c62a941e28c275c1", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcff65e3b938f330c62a941e28c275c1");
        }
        if (isNullOrUndefined()) {
            return null;
        }
        if (isString()) {
            return this.stringValue;
        }
        if (isInteger()) {
            return Integer.valueOf(this.integerValue);
        }
        if (isDouble()) {
            return Double.valueOf(this.doubleValue);
        }
        if (isBoolean()) {
            return Boolean.valueOf(this.booleanValue);
        }
        return null;
    }

    public boolean isClosed() {
        return this.released;
    }

    public void close() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0860d3d75f802d7651008f8f307be97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0860d3d75f802d7651008f8f307be97");
            return;
        }
        if (this.mObjKey != -1) {
            this.mRuntime.releaseJSValue(this.mObjKey);
        }
        this.released = true;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe2c809960056b7e77aa18b6f39c663a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe2c809960056b7e77aa18b6f39c663a");
        }
        if (isString()) {
            return this.stringValue;
        }
        if (isBoolean()) {
            return String.valueOf(this.booleanValue);
        }
        if (isInteger()) {
            return String.valueOf(this.integerValue);
        }
        if (isDouble()) {
            return String.valueOf(this.doubleValue);
        }
        return isUndefined() ? "undefind" : isNull() ? StringUtil.NULL : super.toString();
    }
}
