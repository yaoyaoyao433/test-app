package com.meituan.v8jse;

import android.support.annotation.Keep;
import com.meituan.android.soloader.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class JSRuntime {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Thread mCurrentThread;
    private long mPtr;
    private boolean released;

    private native boolean _addJSValue(long j, long j2, String str, long j3);

    private native boolean _addJSValueByIndex(long j, long j2, int i, long j3);

    private native CodeCacheData _createCachedData(long j, String str, String str2);

    private native long _createJSObjectByJson(long j, String str);

    private native boolean _deleteProperty(long j, long j2, String str);

    private native boolean _deletePropertyByIndex(long j, long j2, int i);

    private native void _destroy(long j);

    private native JSValue _executeCodeCache(long j, String str, String str2, byte[] bArr, int i, int i2);

    private native JSValue _executeFunction(long j, long j2, String str, long j3);

    private native JSValue _executeScript(long j, String str, String str2);

    private native int _getArraySize(long j, long j2);

    private native JSObject _getGlobalObject(long j);

    private native JSValue _getJSValue(long j, long j2, String str);

    private native JSValue _getJSValueByIndex(long j, long j2, int i);

    private native boolean _hasProperty(long j, long j2, String str);

    private native void _initJSRuntime();

    private native JSValue _invokeFunction(long j, long j2, long j3, long j4);

    private native String _jsObjectToJson(long j, long j2);

    private native long _newJSArray(long j);

    private native long _newJSBoolean(long j, boolean z);

    private native long _newJSDouble(long j, double d);

    private native long _newJSFunction(long j, JavaCallback javaCallback);

    private native long _newJSInteger(long j, int i);

    private native long _newJSObject(long j);

    private native long _newJSString(long j, String str);

    private native boolean _pushJSValue(long j, long j2, long j3);

    private native void _registerCallBack(long j, long j2, String str, JavaCallback javaCallback);

    private native void _releaseJSValue(long j, long j2);

    static {
        loadLibrary("v8jse");
    }

    private static void loadLibrary(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8470ae231fc5013b776a0b5d4e695f8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8470ae231fc5013b776a0b5d4e695f8a");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add("mtv8");
            arrayList.add("c++_shared");
            k.a(str, arrayList);
        } catch (Throwable unused) {
            System.loadLibrary(str);
        }
    }

    public static JSRuntime createJSRuntime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "08edc58836f160963d295f5ef13f1804", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSRuntime) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "08edc58836f160963d295f5ef13f1804");
        }
        JSRuntime jSRuntime = new JSRuntime();
        jSRuntime.mCurrentThread = Thread.currentThread();
        jSRuntime.released = false;
        jSRuntime._initJSRuntime();
        return jSRuntime;
    }

    private void checkRuntime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c57dc2e55280299568a20398571ec4b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c57dc2e55280299568a20398571ec4b9");
        } else if (this.released) {
            throw new IllegalStateException("js runtime has been released");
        } else {
            if (this.mCurrentThread != Thread.currentThread()) {
                throw new IllegalStateException("js must run in the same thread");
            }
        }
    }

    public boolean isReleased() {
        return this.released;
    }

    public void executeVoidScript(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c789c27097de1059f5751a4ced9a036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c789c27097de1059f5751a4ced9a036");
            return;
        }
        JSValue executeScript = executeScript(str, str2);
        if (executeScript != null) {
            executeScript.close();
        }
    }

    public JSValue executeScript(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42873b867b5c5f48e9e228de7446ac36", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42873b867b5c5f48e9e228de7446ac36");
        }
        checkRuntime();
        return _executeScript(this.mPtr, str, str2);
    }

    public JSValue executeCodeCache(String str, String str2, byte[] bArr, int i, int i2) {
        Object[] objArr = {str, str2, bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84191b7a3f85be3888858814faf8cba3", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84191b7a3f85be3888858814faf8cba3");
        }
        checkRuntime();
        return _executeCodeCache(this.mPtr, str, str2, bArr, i, i2);
    }

    public CodeCacheData createCachedData(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3aa5f28d0052dbea55bef73f5f3511be", RobustBitConfig.DEFAULT_VALUE)) {
            return (CodeCacheData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3aa5f28d0052dbea55bef73f5f3511be");
        }
        checkRuntime();
        return _createCachedData(this.mPtr, str, str2);
    }

    public JSObject getGlobalObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "828d584ea114b3e886246ccb9a801baa", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "828d584ea114b3e886246ccb9a801baa");
        }
        checkRuntime();
        return _getGlobalObject(this.mPtr);
    }

    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03de96235e52d4900120c5b9e047e65a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03de96235e52d4900120c5b9e047e65a");
        } else if (this.released) {
        } else {
            checkRuntime();
            this.released = true;
            _destroy(this.mPtr);
        }
    }

    public JSValue invokeFunction(long j, long j2, long j3) {
        Object[] objArr = {new Long(j), new Long(j2), new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf6ccb0963c586668a2f8b3234157109", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf6ccb0963c586668a2f8b3234157109");
        }
        checkRuntime();
        return _invokeFunction(this.mPtr, j, j2, j3);
    }

    public long newJSString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50f0136e74e86b68be525e2b9a9f77b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50f0136e74e86b68be525e2b9a9f77b5")).longValue();
        }
        checkRuntime();
        return _newJSString(this.mPtr, str);
    }

    public long newJSBoolean(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76da92cb3090eb90453cc6d77352705f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76da92cb3090eb90453cc6d77352705f")).longValue();
        }
        checkRuntime();
        return _newJSBoolean(this.mPtr, z);
    }

    public long newJSInteger(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93a1d2650f953fc54075cc10832ba745", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93a1d2650f953fc54075cc10832ba745")).longValue();
        }
        checkRuntime();
        return _newJSInteger(this.mPtr, i);
    }

    public long newJSDouble(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1504b6f96dc166a544fca9647cc39747", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1504b6f96dc166a544fca9647cc39747")).longValue();
        }
        checkRuntime();
        return _newJSDouble(this.mPtr, d);
    }

    public long newJSFunction(JavaCallback javaCallback) {
        Object[] objArr = {javaCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7812170dda42daf5f66a9892d9b3af9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7812170dda42daf5f66a9892d9b3af9")).longValue();
        }
        checkRuntime();
        return _newJSFunction(this.mPtr, javaCallback);
    }

    public void releaseJSValue(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "179f06234fca15b0ab873120102af7db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "179f06234fca15b0ab873120102af7db");
            return;
        }
        checkRuntime();
        _releaseJSValue(this.mPtr, j);
    }

    public long newJSObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f890e03e4ecc115b812f9aff660e4cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f890e03e4ecc115b812f9aff660e4cd")).longValue();
        }
        checkRuntime();
        return _newJSObject(this.mPtr);
    }

    public JSValue getJSValue(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b19e15c980edd5ff089ec8b0678564ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b19e15c980edd5ff089ec8b0678564ba");
        }
        checkRuntime();
        return _getJSValue(this.mPtr, j, str);
    }

    public JSValue getJSValue(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "156dde1da66765923977f5504abb46f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "156dde1da66765923977f5504abb46f1");
        }
        checkRuntime();
        return _getJSValueByIndex(this.mPtr, j, i);
    }

    public boolean hasProperty(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85dead6167bf3371f31ebb62ada5edcc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85dead6167bf3371f31ebb62ada5edcc")).booleanValue();
        }
        checkRuntime();
        return _hasProperty(this.mPtr, j, str);
    }

    public boolean deleteProperty(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19bfea6211aa5d7cd31f67775d597d88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19bfea6211aa5d7cd31f67775d597d88")).booleanValue();
        }
        checkRuntime();
        return _deleteProperty(this.mPtr, j, str);
    }

    public boolean deleteProperty(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddefcf4d84375e2881cebf6c38471d5d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddefcf4d84375e2881cebf6c38471d5d")).booleanValue();
        }
        checkRuntime();
        return _deletePropertyByIndex(this.mPtr, j, i);
    }

    public boolean addJSValue(long j, String str, long j2) {
        Object[] objArr = {new Long(j), str, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa47e5239383f5d097ff2e381e62aeed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa47e5239383f5d097ff2e381e62aeed")).booleanValue();
        }
        checkRuntime();
        return _addJSValue(this.mPtr, j, str, j2);
    }

    public boolean addJSValue(long j, int i, long j2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb2061a12e70dcc8f88a1cb40229031d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb2061a12e70dcc8f88a1cb40229031d")).booleanValue();
        }
        checkRuntime();
        return _addJSValueByIndex(this.mPtr, j, i, j2);
    }

    public void registerCallBack(long j, String str, JavaCallback javaCallback) {
        Object[] objArr = {new Long(j), str, javaCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2c594e9fcf580fc7eb5e8a64ac1761d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2c594e9fcf580fc7eb5e8a64ac1761d");
            return;
        }
        checkRuntime();
        _registerCallBack(this.mPtr, j, str, javaCallback);
    }

    public JSValue executeFunction(long j, String str, long j2) {
        Object[] objArr = {new Long(j), str, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b37d5945187f082e77c6c1035542117", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b37d5945187f082e77c6c1035542117");
        }
        checkRuntime();
        return _executeFunction(this.mPtr, j, str, j2);
    }

    public long createJSObjectByJson(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d465d52620a2ed8e2b41b1c269246df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d465d52620a2ed8e2b41b1c269246df")).longValue();
        }
        checkRuntime();
        return _createJSObjectByJson(this.mPtr, str);
    }

    public String jsObjectToJson(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7c40cd2704cd260951649cc2295fb2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7c40cd2704cd260951649cc2295fb2e");
        }
        checkRuntime();
        return _jsObjectToJson(this.mPtr, j);
    }

    public long newJSArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d3320bae6bed4e2146703554cbc0070", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d3320bae6bed4e2146703554cbc0070")).longValue();
        }
        checkRuntime();
        return _newJSArray(this.mPtr);
    }

    public int getArraySize(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92f23b259435174388cc93680639d804", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92f23b259435174388cc93680639d804")).intValue();
        }
        checkRuntime();
        return _getArraySize(this.mPtr, j);
    }

    public boolean pushJSValue(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c79bf018a580abfe42eba41e6ca7bfe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c79bf018a580abfe42eba41e6ca7bfe")).booleanValue();
        }
        checkRuntime();
        return _pushJSValue(this.mPtr, j, j2);
    }
}
