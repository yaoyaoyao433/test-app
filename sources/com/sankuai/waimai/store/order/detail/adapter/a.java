package com.sankuai.waimai.store.order.detail.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.widgets.recycler.e;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends e {
    public static ChangeQuickRedirect a;
    TextView b;
    TextView c;
    String d;
    boolean e;
    ArrayList<String> f;
    TextView g;
    String h;
    String i;
    private Context j;

    public a(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4756421f3c5ba5f0bca218e78814c4d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4756421f3c5ba5f0bca218e78814c4d7");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93bbe7ce41c68ec6576cabfb1cdc3a0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93bbe7ce41c68ec6576cabfb1cdc3a0c");
            return;
        }
        this.j = view.getContext();
        this.b = (TextView) view.findViewById(R.id.logistics_arrow);
        this.c = (TextView) view.findViewById(R.id.logistics_desc);
        this.g = (TextView) view.findViewById(R.id.tv_pkg_name);
        com.sankuai.waimai.store.view.a a2 = com.sankuai.waimai.store.view.a.a(this.j, (int) R.dimen.wm_sc_common_dimen_6, (int) R.dimen.wm_sc_common_dimen_10, (int) R.color.wm_sg_color_BCBCBD, a.EnumC1338a.RIGHT);
        this.b.setCompoundDrawablePadding(h.a(this.j, 7.0f));
        this.b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a2, (Drawable) null);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.e, android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "695597b135ea821078feb4750651f0ea", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "695597b135ea821078feb4750651f0ea");
            return;
        }
        super.onClick(view);
        if (!this.e) {
            d.a(this.j, this.d);
        } else {
            com.sankuai.waimai.store.order.detail.manager.a.a(this.j, this.f);
        }
        this.e = false;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00f2394ad615614a11c73db9dfec6772", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00f2394ad615614a11c73db9dfec6772");
        } else {
            JudasManualManager.a("b_waimai_sg_dj16wzr2_mc").a("poi_id", com.sankuai.waimai.store.order.detail.manager.a.a(this.h)).a("order_id", com.sankuai.waimai.store.order.detail.manager.a.a(this.i)).a("c_hgowsqb").a(this.j).a();
        }
    }
}
