package com.dianping.jscore;

import android.support.annotation.Keep;
import com.meituan.android.soloader.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class JSExecutor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean destroyed;
    @Keep
    private long ptr;
    private Thread thread;

    @Keep
    private native void _addJavaScriptInterface(String str, JavaScriptInterface javaScriptInterface);

    @Keep
    private native void _create();

    @Keep
    private native JSCodeCache _createCodeCache(String str, String str2) throws JSRuntimeException;

    @Keep
    private native void _destroy();

    @Keep
    private native String _execJS(String str, String str2) throws JSRuntimeException;

    @Keep
    private native String _executeJSCodeCache(String str, String str2, byte[] bArr, int i, int i2) throws JSRuntimeException;

    @Keep
    private native byte[] _executeJSForBinary(String str, String str2) throws JSRuntimeException;

    @Keep
    private native void _garbageCollect() throws JSRuntimeException;

    @Keep
    private native JSHeapStatistics _getHeapStatistics() throws JSRuntimeException;

    @Keep
    private native void _injectGlobalJSObject(String str, Value value);

    @Keep
    private native byte[] _invokeMethod(String str, String str2, Value[] valueArr) throws JSRuntimeException;

    @Keep
    private native Value _invokeMethodToValue(String str, String str2, Value[] valueArr) throws JSRuntimeException;

    static {
        try {
            k.b("jse");
        } catch (Throwable unused) {
            System.loadLibrary("jse");
        }
    }

    public JSExecutor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d7fe981309fcc21027ba18603775cbf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d7fe981309fcc21027ba18603775cbf");
            return;
        }
        this.thread = Thread.currentThread();
        this.destroyed = false;
    }

    private void check() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "139b0e62ac5d6338c7ec9b7c45097ebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "139b0e62ac5d6338c7ec9b7c45097ebb");
        } else if (this.destroyed) {
            throw new Error("Invalid access: the JSExecutor has been destroyed!");
        } else {
            if (this.thread == Thread.currentThread()) {
                return;
            }
            throw new Error("Invalid thread access: current thread is " + Thread.currentThread() + " while the JSExecutor was created on " + this.thread);
        }
    }

    public static synchronized JSExecutor create() {
        synchronized (JSExecutor.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb604ba93ab92b51fe26b642b64e9215", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSExecutor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb604ba93ab92b51fe26b642b64e9215");
            }
            JSExecutor jSExecutor = new JSExecutor();
            jSExecutor._create();
            return jSExecutor;
        }
    }

    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "253310c62a0e3a6d87c53e6c8557ef11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "253310c62a0e3a6d87c53e6c8557ef11");
            return;
        }
        check();
        _destroy();
        this.destroyed = true;
    }

    public String execJS(String str, String str2) throws JSRuntimeException {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "648055d1ba6aab3bbc8ab40174e4e987", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "648055d1ba6aab3bbc8ab40174e4e987");
        }
        check();
        return _execJS(str, str2);
    }

    public byte[] executeJSForBinary(String str, String str2) throws JSRuntimeException {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "157c488882d7fe1129c9d61380f8ec7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "157c488882d7fe1129c9d61380f8ec7a");
        }
        check();
        return _executeJSForBinary(str, str2);
    }

    public void addJavaScriptInterface(String str, JavaScriptInterface javaScriptInterface) {
        Object[] objArr = {str, javaScriptInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b82d5b404d389cad62ef24436283b610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b82d5b404d389cad62ef24436283b610");
            return;
        }
        check();
        _addJavaScriptInterface(str, javaScriptInterface);
    }

    public void injectGlobalJSObject(String str, Value value) {
        Object[] objArr = {str, value};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32c7a5df55ee532e55ac63f8eb222ff7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32c7a5df55ee532e55ac63f8eb222ff7");
            return;
        }
        check();
        _injectGlobalJSObject(str, value);
    }

    public byte[] invokeMethod(String str, String str2, Value[] valueArr) throws JSRuntimeException {
        Object[] objArr = {str, str2, valueArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "122aae4adf0ac11a482171d924e9e464", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "122aae4adf0ac11a482171d924e9e464");
        }
        check();
        return _invokeMethod(str, str2, valueArr);
    }

    public Value invokeMethodToValue(String str, String str2, Value[] valueArr) throws JSRuntimeException {
        Object[] objArr = {str, str2, valueArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "baaa65fe9d29680267df17e3737b81fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "baaa65fe9d29680267df17e3737b81fe");
        }
        check();
        return _invokeMethodToValue(str, str2, valueArr);
    }

    public JSCodeCache createCodeCache(String str, String str2) throws JSRuntimeException {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d113e2a082b49e109eb8d432f5c626b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSCodeCache) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d113e2a082b49e109eb8d432f5c626b");
        }
        check();
        return _createCodeCache(str, str2);
    }

    public String executeJSCodeCache(String str, String str2, byte[] bArr, int i, int i2) throws JSRuntimeException {
        Object[] objArr = {str, str2, bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "387272f85c2eae53d3896147ba95a092", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "387272f85c2eae53d3896147ba95a092");
        }
        check();
        return _executeJSCodeCache(str, str2, bArr, i, i2);
    }

    public JSHeapStatistics getHeapStatistics() throws JSRuntimeException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dec670c992f87507d7b5a0f43a9a56b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSHeapStatistics) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dec670c992f87507d7b5a0f43a9a56b3");
        }
        check();
        return _getHeapStatistics();
    }

    public void garbageCollect() throws JSRuntimeException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6751c038b68ad9bbbec5d54d9956ee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6751c038b68ad9bbbec5d54d9956ee9");
            return;
        }
        check();
        _garbageCollect();
    }
}
