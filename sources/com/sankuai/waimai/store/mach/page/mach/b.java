package com.sankuai.waimai.store.mach.page.mach;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.mach.b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.b
    public final boolean b(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27aafdda8c0c9dffa2ed15650a8ef12c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27aafdda8c0c9dffa2ed15650a8ef12c")).booleanValue();
        }
        return false;
    }

    @Override // com.sankuai.waimai.mach.b
    public final boolean a(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        Activity activity;
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e54c9756128bccbff4a8ecd06abc6527", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e54c9756128bccbff4a8ecd06abc6527")).booleanValue();
        }
        if (aVar != null && aVar.f != null && (activity = aVar.f.getActivity()) != null && !TextUtils.isEmpty(str)) {
            com.sankuai.waimai.store.router.d.a(activity, str);
        }
        return true;
    }
}
