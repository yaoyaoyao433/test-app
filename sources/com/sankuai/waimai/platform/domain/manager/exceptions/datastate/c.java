package com.sankuai.waimai.platform.domain.manager.exceptions.datastate;

import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.platform.domain.manager.exceptions.datastate.a
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8baec70501e71fcf69f05db00bebfea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8baec70501e71fcf69f05db00bebfea8");
        } else if (bundle != null) {
            bundle.putString("token", com.sankuai.waimai.platform.domain.manager.order.b.a().getToken());
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.exceptions.datastate.a
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cba85fd795ea293c8855059fc9315ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cba85fd795ea293c8855059fc9315ca");
        } else if (bundle != null) {
            String string = bundle.getString("token");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            com.sankuai.waimai.platform.domain.manager.order.b.a().setToken(string);
        }
    }
}
