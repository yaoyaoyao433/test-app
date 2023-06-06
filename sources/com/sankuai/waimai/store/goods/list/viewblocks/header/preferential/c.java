package com.sankuai.waimai.store.goods.list.viewblocks.header.preferential;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.view.CouponLayout;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c extends g<Poi.PoiCouponItem, d> {
    public static ChangeQuickRedirect a;
    protected CouponLayout b;
    protected TextView c;
    protected TextView d;
    @Nullable
    protected com.sankuai.waimai.store.platform.domain.manager.poi.a e;
    private ImageView f;
    private ImageView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private com.sankuai.waimai.store.expose.v2.entity.b k;
    private TextView l;

    public abstract void a(@NonNull Context context);

    public abstract void b();

    public abstract void b(@NonNull Context context);

    public abstract void c(@NonNull Context context);

    public abstract void d(@NonNull Context context);

    /* JADX WARN: Removed duplicated region for block: B:37:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0405  */
    @Override // com.sankuai.waimai.store.newwidgets.list.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(final com.sankuai.waimai.store.platform.domain.core.poi.Poi.PoiCouponItem r23, final int r24) {
        /*
            Method dump skipped, instructions count: 1224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.c.a(com.sankuai.waimai.store.platform.domain.core.poi.Poi$PoiCouponItem, int):void");
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15667ba6c1666f646a0e0f2f1df0a5ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15667ba6c1666f646a0e0f2f1df0a5ed");
            return;
        }
        this.b = (CouponLayout) view.findViewById(R.id.coupon_layout);
        this.g = (ImageView) view.findViewById(R.id.coupon_logo);
        this.h = (TextView) view.findViewById(R.id.amount);
        this.i = (TextView) view.findViewById(R.id.describe);
        this.c = (TextView) view.findViewById(R.id.receive);
        this.d = (TextView) view.findViewById(R.id.dollar_symbol);
        this.j = (TextView) view.findViewById(R.id.discount_unit);
        this.f = (ImageView) view.findViewById(R.id.exchange_logo);
        this.k = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_n1te2k95_mv", this.b);
        if (view.getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) view.getContext(), this.k);
        }
        this.l = (TextView) view.findViewById(R.id.exchange_coupon_text_prefix);
    }
}
