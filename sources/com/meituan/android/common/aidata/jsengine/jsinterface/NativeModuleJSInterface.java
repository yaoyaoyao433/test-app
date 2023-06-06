package com.meituan.android.common.aidata.jsengine.jsinterface;

import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.Value;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NativeModuleJSInterface extends JavaScriptInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private JSBridgeCallback mJSBridgeCallback;

    public NativeModuleJSInterface(JSBridgeCallback jSBridgeCallback) {
        Object[] objArr = {jSBridgeCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "949235cfc14fbe689c06442daeeaf48e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "949235cfc14fbe689c06442daeeaf48e");
        } else {
            this.mJSBridgeCallback = jSBridgeCallback;
        }
    }

    @Override // com.dianping.jscore.JavaScriptInterface
    public Value exec(Value[] valueArr) {
        Object[] objArr = {valueArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77b462f06973f34f366c75c6fc203c83", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77b462f06973f34f366c75c6fc203c83");
        }
        if (valueArr == null || valueArr.length < 7) {
            return null;
        }
        try {
            String string = valueArr[0].isNULL() ? null : valueArr[0].string();
            String string2 = valueArr[1].isNULL() ? null : valueArr[1].string();
            String string3 = valueArr[2].isNULL() ? null : valueArr[2].string();
            String string4 = valueArr[3].isNULL() ? null : valueArr[3].string();
            String string5 = valueArr[4].isNULL() ? null : valueArr[4].string();
            String string6 = valueArr[5].isNULL() ? null : valueArr[5].string();
            String string7 = valueArr[6].isNULL() ? null : valueArr[6].string();
            StringBuilder sb = new StringBuilder("NativeModuleBridgeJSInterface js2native: ");
            sb.append(string4);
            sb.append(" - ");
            sb.append(string5);
            sb.append(" - ");
            sb.append(string6);
            if (this.mJSBridgeCallback != null) {
                this.mJSBridgeCallback.callNativeModule(string, string2, string3, string4, string5, string6, string7);
            }
        } catch (Exception e) {
            new StringBuilder(" NativeModuleBridgeJSInterface js2native exec fail: ").append(e.getMessage());
        }
        return null;
    }
}
