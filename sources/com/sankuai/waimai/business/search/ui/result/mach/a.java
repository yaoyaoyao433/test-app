package com.sankuai.waimai.business.search.ui.result.mach;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements com.sankuai.waimai.mach.b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.b
    public final boolean b(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0d4dc5979e4ba5c95add24e58a2eb7c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0d4dc5979e4ba5c95add24e58a2eb7c")).booleanValue();
        }
        return false;
    }

    @Override // com.sankuai.waimai.mach.b
    public final boolean a(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        Activity activity;
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1ae778af24b48682da9689fb9a0a6a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1ae778af24b48682da9689fb9a0a6a5")).booleanValue();
        }
        if (aVar != null && aVar.f != null && (activity = aVar.f.getActivity()) != null && !TextUtils.isEmpty(str)) {
            com.sankuai.waimai.foundation.router.a.a(activity, str);
        }
        return true;
    }
}
