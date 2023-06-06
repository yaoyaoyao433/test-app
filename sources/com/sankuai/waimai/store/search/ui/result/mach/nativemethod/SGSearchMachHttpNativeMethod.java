package com.sankuai.waimai.store.search.ui.result.mach.nativemethod;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.search.common.mach.nativemethod.IBuildMachNativeMethod;
import com.sankuai.waimai.store.mach.SGHttpJSNativeMethod;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGSearchMachHttpNativeMethod implements IBuildMachNativeMethod {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.search.common.mach.nativemethod.IBuildMachNativeMethod
    public JSInvokeNativeMethod getMachHttpMethod(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25c68306191cf95507b83d0d3db1c70d", RobustBitConfig.DEFAULT_VALUE) ? (JSInvokeNativeMethod) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25c68306191cf95507b83d0d3db1c70d") : new SGHttpJSNativeMethod(str);
    }
}
