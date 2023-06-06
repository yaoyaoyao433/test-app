package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach;

import android.text.TextUtils;
import android.view.View;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final d b;
    private final String c;

    private f(d dVar, String str) {
        this.b = dVar;
        this.c = str;
    }

    public static View.OnClickListener a(d dVar, String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "690b01bde47453b30b43044a9f225906", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "690b01bde47453b30b43044a9f225906") : new f(dVar, str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91054f173bbc5598eba87c2b301681f8", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91054f173bbc5598eba87c2b301681f8");
            return;
        }
        d dVar = this.b;
        String str = this.c;
        Object[] objArr2 = {dVar, str, view};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9f3368295609a61c5faef4a26c2e14c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9f3368295609a61c5faef4a26c2e14c4");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            dVar.b.a(new ButtonItem(r.a(str, -1)));
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "947c402c0d2828360951a85759c31a2b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "947c402c0d2828360951a85759c31a2b");
                return;
            }
            com.sankuai.waimai.business.order.api.detail.model.a a2 = dVar.i.J.a();
            JudasManualManager.a("b_waimai_r0nm2k3v_mc", "c_hgowsqb", AppUtil.generatePageInfoKey(dVar.e)).a("order_status", a2 != null ? a2.e : -1).a();
        }
    }
}
