package com.meituan.android.common.aidata.jsengine.jsinterface;

import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.Value;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSCallbackJSInterface extends JavaScriptInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private JSBridgeCallback mJSBridgeCallback;

    public JSCallbackJSInterface(JSBridgeCallback jSBridgeCallback) {
        Object[] objArr = {jSBridgeCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4ace1d0001b87eac57a1d8963cc9fb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4ace1d0001b87eac57a1d8963cc9fb1");
        } else {
            this.mJSBridgeCallback = jSBridgeCallback;
        }
    }

    @Override // com.dianping.jscore.JavaScriptInterface
    public Value exec(Value[] valueArr) {
        Object[] objArr = {valueArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93244c2bf6c3d713cdde31a2dc640e19", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93244c2bf6c3d713cdde31a2dc640e19");
        }
        if (valueArr == null || valueArr.length < 5) {
            return null;
        }
        try {
            String string = valueArr[0].isNULL() ? null : valueArr[0].string();
            String string2 = valueArr[1].isNULL() ? null : valueArr[1].string();
            String string3 = valueArr[2].isNULL() ? null : valueArr[2].string();
            String string4 = valueArr[3].isNULL() ? null : valueArr[3].string();
            String string5 = valueArr[4].isNULL() ? null : valueArr[4].string();
            if (this.mJSBridgeCallback != null) {
                this.mJSBridgeCallback.onJSCallBack(string, string2, string3, string4, string5);
            }
        } catch (Exception e) {
            new StringBuilder(" NativeCallbackBridgeJSInterface js2native exec fail: ").append(e.getMessage());
        }
        return null;
    }
}
