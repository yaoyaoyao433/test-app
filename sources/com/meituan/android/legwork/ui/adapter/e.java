package com.meituan.android.legwork.ui.adapter;

import android.app.Activity;
import android.view.View;
import com.meituan.android.legwork.bean.im.insertmassage.ImInsertMessageView;
import com.meituan.android.legwork.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.base.util.ActivityUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final d b;
    private final ImInsertMessageView.ReceiveAddress c;

    private e(d dVar, ImInsertMessageView.ReceiveAddress receiveAddress) {
        this.b = dVar;
        this.c = receiveAddress;
    }

    public static View.OnClickListener a(d dVar, ImInsertMessageView.ReceiveAddress receiveAddress) {
        Object[] objArr = {dVar, receiveAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb7e8784da6d9b6f196e8d6e3b8bd872", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb7e8784da6d9b6f196e8d6e3b8bd872") : new e(dVar, receiveAddress);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1096e81ef6da5ac230b16cc19cc5810", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1096e81ef6da5ac230b16cc19cc5810");
            return;
        }
        d dVar = this.b;
        ImInsertMessageView.ReceiveAddress receiveAddress = this.c;
        Object[] objArr2 = {dVar, receiveAddress, view};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ccc3fbcefd4b8943460bc03e6ccfc7bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ccc3fbcefd4b8943460bc03e6ccfc7bd");
            return;
        }
        com.meituan.android.legwork.statistics.a.a(ActivityUtils.a(dVar.b), "b_banma_xa1r2esr_mc", "c_q4u2ijua", com.meituan.android.legwork.common.im.g.a().a(com.meituan.android.legwork.common.im.g.f));
        if (com.meituan.android.legwork.common.im.g.a().b() && dVar.b != null && (dVar.b instanceof Activity)) {
            n.a((Activity) dVar.b, receiveAddress.orderViewId, Long.valueOf(receiveAddress.addressLng).longValue() / 1000000.0d, Long.valueOf(receiveAddress.addressLat).longValue() / 1000000.0d, 102);
        }
    }
}
