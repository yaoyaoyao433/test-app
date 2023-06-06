package com.dianping.picassocontroller.bridge;

import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.Value;
import com.dianping.picassocontroller.annotation.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends JavaScriptInterface {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.jscore.JavaScriptInterface
    public final Value exec(Value[] valueArr) {
        Object[] objArr = {valueArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d182540825c87c821098b597fc49f7c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d182540825c87c821098b597fc49f7c0");
        }
        try {
            return c.a(valueArr[0].string(), valueArr[1].string(), valueArr[2].string(), valueArr[3], valueArr[4].string());
        } catch (Exception e) {
            e.printStackTrace();
            return new Value(false);
        }
    }
}
