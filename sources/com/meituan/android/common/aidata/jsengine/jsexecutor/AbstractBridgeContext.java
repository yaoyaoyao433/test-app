package com.meituan.android.common.aidata.jsengine.jsexecutor;

import com.dianping.jscore.JSExecutor;
import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.Value;
import com.meituan.android.common.aidata.jsengine.utils.ThreadScheduleContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AbstractBridgeContext extends ThreadScheduleContext {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract JSExecutor getJSExecutor();

    public void bindJSValue(String str, Value value) {
        Object[] objArr = {str, value};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5ad09e0d77f89a679ed7508294c9d0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5ad09e0d77f89a679ed7508294c9d0a");
            return;
        }
        String jSFunctionName = getJSFunctionName(str);
        executeJS(String.format("this.%s = function(v){this.%s = v;};", jSFunctionName, str));
        invokeMethod(jSFunctionName, new Value[]{value});
    }

    public String getJSFunctionName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d64f8a692a162e5f76711944cc2eeab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d64f8a692a162e5f76711944cc2eeab");
        }
        if (str == null || str.isEmpty()) {
            return str;
        }
        return "set" + str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public String executeJS(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f28608996de5b0c443039313f229c5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f28608996de5b0c443039313f229c5c");
        }
        if (getJSExecutor() != null) {
            new StringBuilder("executeJS:").append(str);
            return getJSExecutor().execJS(str, "");
        }
        return null;
    }

    public void addJavaScriptInterface(String str, JavaScriptInterface javaScriptInterface) {
        Object[] objArr = {str, javaScriptInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9f9babe5d34d1bd773223e7b9f20221", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9f9babe5d34d1bd773223e7b9f20221");
        } else if (getJSExecutor() != null) {
            getJSExecutor().addJavaScriptInterface(str, javaScriptInterface);
        }
    }

    public byte[] invokeMethod(String str, Value[] valueArr) {
        Object[] objArr = {str, valueArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "110a8c6e792e97b27a12fc620032448c", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "110a8c6e792e97b27a12fc620032448c");
        }
        new StringBuilder("AbstractBridgeContext invokeMethod ").append(str);
        try {
            if (getJSExecutor() != null) {
                return getJSExecutor().invokeMethod(null, str, valueArr);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
}
