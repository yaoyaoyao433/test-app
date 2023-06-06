package com.sankuai.waimai.store.search.ui.result.mach;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.mach.b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.b
    public final boolean b(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "387f65c1b8adaa5d97d773c423270d5d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "387f65c1b8adaa5d97d773c423270d5d")).booleanValue();
        }
        return false;
    }

    @Override // com.sankuai.waimai.mach.b
    public final boolean a(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        Activity activity;
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d01fccb2cc8a8328a128b2f3b35b64d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d01fccb2cc8a8328a128b2f3b35b64d")).booleanValue();
        }
        if (aVar != null && aVar.f != null && (activity = aVar.f.getActivity()) != null && !TextUtils.isEmpty(str)) {
            com.sankuai.waimai.foundation.router.a.a(activity, str);
        }
        return true;
    }
}
