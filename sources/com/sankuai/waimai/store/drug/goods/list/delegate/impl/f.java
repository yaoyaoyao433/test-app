package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class f implements android.arch.lifecycle.l {
    public static ChangeQuickRedirect a;
    private final c b;

    public f(c cVar) {
        this.b = cVar;
    }

    @Override // android.arch.lifecycle.l
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53419462257d137a24d90c4da9d6a34f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53419462257d137a24d90c4da9d6a34f");
            return;
        }
        c cVar = this.b;
        com.sankuai.waimai.store.drug.goods.list.model.c cVar2 = (com.sankuai.waimai.store.drug.goods.list.model.c) obj;
        Object[] objArr2 = {cVar, cVar2};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7335001f06460f626501d9d1df938beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7335001f06460f626501d9d1df938beb");
        } else if (cVar2 == null || !cVar2.a) {
        } else {
            Object[] objArr3 = {cVar2};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "adee7efb50385d067bc00cd816a2b084", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "adee7efb50385d067bc00cd816a2b084");
                return;
            }
            View inflate = LayoutInflater.from(cVar.y).inflate(R.layout.drug_shop_offline_cover_view, (ViewGroup) cVar.C, false);
            inflate.setOnClickListener(g.a());
            View findViewById = inflate.findViewById(R.id.view_drug_shop_offline_bg);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_drug_shop_offline_back);
            TextView textView = (TextView) inflate.findViewById(R.id.iv_drug_shop_offline_button);
            findViewById.setBackground(new e.a().a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1, -592137, -657930}).a());
            ((TextView) inflate.findViewById(R.id.iv_drug_shop_offline_shop_name)).setText(cVar2.b);
            imageView.setOnClickListener(h.a(cVar));
            imageView.setBackground(com.sankuai.waimai.store.util.e.a(cVar.y.getDrawable(R.drawable.wm_sc_super_drugstore_back), -1));
            com.sankuai.waimai.store.util.m.b(cVar2.c, (ImageView) inflate.findViewById(R.id.iv_drug_shop_offline_header_bg), com.sankuai.shangou.stone.util.h.a(cVar.y, 169.0f));
            ((ImageView) inflate.findViewById(R.id.iv_drug_shop_offline_divider)).setBackground(new e.a().a(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1, ViewCompat.MEASURED_SIZE_MASK}).a());
            com.sankuai.waimai.store.util.m.b("https://p0.meituan.net/travelcube/1cc2761580cc858deb1f67f5c2307f9717250.png", (ImageView) inflate.findViewById(R.id.iv_drug_shop_offline_icon), com.sankuai.shangou.stone.util.h.a(cVar.y, 150.0f));
            com.sankuai.waimai.store.expose.v2.entity.a aVar = new com.sankuai.waimai.store.expose.v2.entity.a(textView, String.valueOf(System.identityHashCode(textView)));
            Object[] objArr4 = {cVar};
            ChangeQuickRedirect changeQuickRedirect4 = i.a;
            aVar.a(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "39650c938dbce857e1a2e268876a8f2a", RobustBitConfig.DEFAULT_VALUE) ? (c.a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "39650c938dbce857e1a2e268876a8f2a") : new i(cVar));
            com.sankuai.waimai.store.expose.v2.b.a().a(cVar.y, aVar);
            textView.setBackground(com.sankuai.waimai.store.util.e.a(cVar.y, new int[]{R.color.wm_sg_color_FFE14D, R.color.wm_sg_color_FFC34D}, (int) R.dimen.wm_sc_common_dimen_16));
            textView.setOnClickListener(j.a(cVar));
            cVar.C.removeAllViews();
            cVar.C.addView(inflate, new ViewGroup.LayoutParams(-1, -1));
            com.sankuai.shangou.stone.util.k.a((Activity) cVar.y, true);
            com.sankuai.shangou.stone.util.k.c(cVar.y);
        }
    }
}
