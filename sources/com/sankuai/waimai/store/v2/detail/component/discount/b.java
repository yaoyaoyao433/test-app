package com.sankuai.waimai.store.v2.detail.component.discount;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends SGDetailDiscountInfoBlock {
    public static ChangeQuickRedirect o;
    private RelativeLayout p;
    private UniversalImageView q;
    private UniversalImageView r;
    private LinearLayout s;

    @Override // com.sankuai.waimai.store.v2.detail.component.discount.SGDetailDiscountInfoBlock, com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6de9eab9c6f3ee09aa9285e73e0243f2", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6de9eab9c6f3ee09aa9285e73e0243f2") : layoutInflater.inflate(R.layout.wm_sc_goods_details_limited_time_spiked_discount_bar, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.discount.SGDetailDiscountInfoBlock, com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9b72b6336151335c9ef2f1768b9c6e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9b72b6336151335c9ef2f1768b9c6e3");
            return;
        }
        super.a_(view);
        this.p = (RelativeLayout) a(R.id.wm_sc_detail_discount_info_left_layout);
        this.q = (UniversalImageView) view.findViewById(R.id.goods_detail_limited_discount_icon);
        this.r = (UniversalImageView) view.findViewById(R.id.promotion_info_center_small_icon);
        this.s = (LinearLayout) a(R.id.promotion_deadline_layout);
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.discount.SGDetailDiscountInfoBlock
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77986c8dfb17913d23abf7ebf347efbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77986c8dfb17913d23abf7ebf347efbd");
        } else {
            a(this.p, true, -1, 0);
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.discount.SGDetailDiscountInfoBlock
    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c81c7ca165c84158cf2eb829572cd31d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c81c7ca165c84158cf2eb829572cd31d");
            return;
        }
        u.c(this.j);
        u.c(this.q);
        u.a(this.n);
        int color = m().getResources().getColor(R.color.wm_sg_color_BFBEBE);
        this.k.a(color, m().getResources().getColor(R.color.wm_sg_color_FFFFFF), color);
        u.a(this.n, com.sankuai.waimai.store.util.b.a(m(), (int) R.string.wm_sg_good_detail_discount_finished));
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.discount.SGDetailDiscountInfoBlock
    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe4551ebdb431a97bd19f0c6265f8b51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe4551ebdb431a97bd19f0c6265f8b51");
            return;
        }
        u.c(this.n);
        u.c(this.j);
        int color = m().getResources().getColor(R.color.wm_sg_color_FB5D34);
        this.k.a(color, m().getResources().getColor(R.color.wm_sg_color_FFFFFF), color);
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.discount.SGDetailDiscountInfoBlock
    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2a14f95ab46084e3df977aca7a10aba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2a14f95ab46084e3df977aca7a10aba");
        } else {
            u.c(this.r, this.s);
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.discount.SGDetailDiscountInfoBlock
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2c4afefc1d6fc595aefbd1e83223c2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2c4afefc1d6fc595aefbd1e83223c2d");
        } else if (this.l == null || t.a(this.l.flashSaleLabel)) {
        } else {
            u.a(this.q);
            b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a.b = m();
            a.c = this.l.flashSaleLabel;
            b.C0608b b = a.b(this.q.getLayoutParams().width);
            b.f = ImageQualityUtil.b();
            b.a((ImageView) this.q);
        }
    }
}
