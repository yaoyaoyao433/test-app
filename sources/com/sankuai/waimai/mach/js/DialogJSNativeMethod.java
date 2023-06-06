package com.sankuai.waimai.mach.js;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.jsv8.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class DialogJSNativeMethod implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void dismissProcessDialog();

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public String module() {
        return "wmui";
    }

    public abstract void showProcessDialog();

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7784e429776cc0ac598394a420e25b0c", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7784e429776cc0ac598394a420e25b0c") : new String[]{"showhud", "hidehud"};
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public void invoke(String str, String str2, String str3, a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2951bd332ebb0344357b1bdb0d369d7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2951bd332ebb0344357b1bdb0d369d7e");
        } else if ("showhud".equals(str)) {
            showProcessDialog();
            aVar.a(str3, "{\"status\":\"0\",\"data\":null}");
        } else if ("hidehud".equals(str)) {
            dismissProcessDialog();
            aVar.a(str3, "{\"status\":\"0\",\"data\":null}");
        }
    }
}
