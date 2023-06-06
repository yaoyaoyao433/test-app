package com.sankuai.waimai.store.v2.detail.component.actionbar;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.k;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b;
import com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.SGDetailIndicatorBlock;
import com.sankuai.waimai.store.newwidgets.SCActionbarItemView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.g;
/* compiled from: ProGuard */
@Cube(children = {SGDetailIndicatorBlock.class}, events = {com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.a.class})
/* loaded from: classes5.dex */
public class SGDetailSearchActionBarBlock extends b implements SGDetailSearchActionBarBlockEventHelper {
    public static ChangeQuickRedirect k;
    private SGDetailIndicatorBlock l;
    private TextView m;
    private com.sankuai.waimai.store.expose.v2.entity.b n;

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final int b(int i, int i2) {
        return i;
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.actionbar.SGDetailSearchActionBarBlockEventHelper
    public void onSGDetailIndicatorClickEventReceive(com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.b bVar) {
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ae4746f06ccc27dba675ff42608f756", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ae4746f06ccc27dba675ff42608f756") : layoutInflater.inflate(R.layout.wm_st_goods_detail_search_style_action_bar, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b, com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "041e617382c01cafe6b1a47e56d13534", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "041e617382c01cafe6b1a47e56d13534");
            return;
        }
        super.a_(view);
        this.l = (SGDetailIndicatorBlock) b(R.id.fl_detail_indicator, (int) new SGDetailIndicatorBlock());
        this.l.i().setBackgroundColor(-1);
        View a = a(R.id.status_bar_place_holder);
        a.setBackgroundColor(-1);
        ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
        layoutParams.height = u.a(view.getContext());
        a.setLayoutParams(layoutParams);
        a.setVisibility(k.a(l()) ? 0 : 8);
        a(0.0f);
        this.m = (TextView) a(R.id.tv_actionbar_search_text);
        this.m.setBackground(new e.a().c(com.sankuai.waimai.store.util.b.b(m(), R.color.wm_sg_color_F1F1F2)).a(h.a(l(), 15.0f)).a());
        this.m.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.v2.detail.component.actionbar.SGDetailSearchActionBarBlock.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc3c17b3c20960c470b66d0f13ba2412", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc3c17b3c20960c470b66d0f13ba2412");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a(SGDetailSearchActionBarBlock.this.l(), "b_waimai_sg_grqt042o_mc").a("poi_id", Long.valueOf(SGDetailSearchActionBarBlock.this.j.b())).a("spu_id", Long.valueOf(SGDetailSearchActionBarBlock.this.j.c())).a("stid", SGDetailSearchActionBarBlock.this.a("stid")).a();
                SGDetailSearchActionBarBlock.this.j.g();
            }
        });
        this.n = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_grqt042o_mv", this.m);
        com.sankuai.waimai.store.expose.v2.b.a().a(l(), this.n);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final void a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, GoodsSpu goodsSpu, String str, String str2, String str3) {
        Object[] objArr = {aVar, goodsSpu, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5987ae5dadffa676c5d115cbe5e9b7ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5987ae5dadffa676c5d115cbe5e9b7ef");
            return;
        }
        super.a(aVar, goodsSpu, str, str2, str3);
        this.m.setText(str2);
        this.n.a("poi_id", Long.valueOf(this.j.b()));
        this.n.a("spu_id", Long.valueOf(this.j.c()));
        this.n.a("stid", a("stid"));
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67f56bb2bce12ba3d7d8ec0303831281", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67f56bb2bce12ba3d7d8ec0303831281");
            return;
        }
        i().setClickable(!g.a(f, 0.0f));
        this.l.a(true ^ g.a(f, 0.0f));
        this.l.i().setAlpha(f);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final SCActionbarItemView s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9676311c995369f0630a46b3aca1515e", RobustBitConfig.DEFAULT_VALUE) ? (SCActionbarItemView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9676311c995369f0630a46b3aca1515e") : (SCActionbarItemView) a(R.id.actionbar_message_center);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final ImageView t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d44e2a2f343b21653733d01307cf369", RobustBitConfig.DEFAULT_VALUE) ? (ImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d44e2a2f343b21653733d01307cf369") : (ImageView) a(R.id.iv_global_cart_icon);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final ImageView u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f676b5c848fe859b863ce85e3961a374", RobustBitConfig.DEFAULT_VALUE) ? (ImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f676b5c848fe859b863ce85e3961a374") : (ImageView) a(R.id.img_back);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7530ab571a2c66b15cce964faf7be387", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7530ab571a2c66b15cce964faf7be387")).intValue() : this.l.i().getHeight() + i + l().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_negative_2);
    }
}
