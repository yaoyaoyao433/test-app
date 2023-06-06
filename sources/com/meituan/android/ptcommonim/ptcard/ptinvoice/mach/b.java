package com.meituan.android.ptcommonim.ptcard.ptinvoice.mach;

import android.content.Context;
import com.meituan.android.ptcommonim.base.mach.bridge.PTTextJsNativeMethodImpl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect a;
    private final Context b;

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String module() {
        return "ptimtext";
    }

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0102c1ee15f53e2bbf33edbe6cbb0d7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0102c1ee15f53e2bbf33edbe6cbb0d7a");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11d8e6d120468885cd586f4b163c5997", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11d8e6d120468885cd586f4b163c5997") : new String[]{"lastLineWidth"};
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final void invoke(String str, String str2, String str3, com.sankuai.waimai.mach.jsv8.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b9fd9312001f04e9a5065e5a4361671", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b9fd9312001f04e9a5065e5a4361671");
        } else {
            PTTextJsNativeMethodImpl.a(str, str2, str3, aVar);
        }
    }
}
