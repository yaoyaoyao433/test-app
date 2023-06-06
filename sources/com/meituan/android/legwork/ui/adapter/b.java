package com.meituan.android.legwork.ui.adapter;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.legwork.bean.im.OrderAddressView;
import com.meituan.android.legwork.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.base.util.ActivityUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final a b;

    private b(a aVar) {
        this.b = aVar;
    }

    public static View.OnClickListener a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d54d02e5d31d219486d9f8d4687c16c", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d54d02e5d31d219486d9f8d4687c16c") : new b(aVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a77db0929cd2b596fb5cd7980ebaabc", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a77db0929cd2b596fb5cd7980ebaabc");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = {aVar, view};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "15ce3cb987d60c6f2671aeed440f021a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "15ce3cb987d60c6f2671aeed440f021a");
            return;
        }
        com.meituan.android.legwork.statistics.a.a(ActivityUtils.a(aVar.b), "b_banma_sqnr9imi_mc", "c_q4u2ijua", com.meituan.android.legwork.common.im.g.a().a(com.meituan.android.legwork.common.im.g.f));
        if (com.meituan.android.legwork.common.im.g.a().b()) {
            OrderAddressView orderAddressView = com.meituan.android.legwork.common.im.g.a().d;
            String str = com.meituan.android.legwork.common.im.g.a().b;
            if (aVar.b == null || !(aVar.b instanceof Activity) || orderAddressView == null || TextUtils.isEmpty(str)) {
                return;
            }
            n.a((Activity) aVar.b, str, orderAddressView.lng / 1000000.0d, orderAddressView.lat / 1000000.0d, 104);
        }
    }
}
