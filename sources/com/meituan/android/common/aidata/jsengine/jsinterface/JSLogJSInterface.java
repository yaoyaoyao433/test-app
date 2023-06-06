package com.meituan.android.common.aidata.jsengine.jsinterface;

import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.Value;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSLogJSInterface extends JavaScriptInterface {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.jscore.JavaScriptInterface
    public Value exec(Value[] valueArr) {
        Object[] objArr = {valueArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe7bd12c02f5fd48970facd80d6ca6d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe7bd12c02f5fd48970facd80d6ca6d1");
        }
        if (valueArr != null) {
            try {
                if (valueArr.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < valueArr.length; i++) {
                        sb.append(valueArr[i].isNULL() ? null : valueArr[i].string());
                        sb.append("___");
                    }
                    new StringBuilder("js log: ").append(sb.toString());
                }
            } catch (Exception e) {
                new StringBuilder(" NativeCallbackBridgeJSInterface js2native exec fail: ").append(e.getMessage());
                return null;
            }
        }
        return null;
    }
}
