package com.sankuai.waimai.store.v2.detail.component.pricebar;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.waimai.store.goods.detail.widget.SGPriceTextView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.v2.detail.component.pricebar.b;
/* compiled from: ProGuard */
@Cube
/* loaded from: classes5.dex */
public class SGDetailB2CPriceBarBlock extends a {
    public static ChangeQuickRedirect g;
    private SGPriceTextView h;
    private TextView i;
    private TextView j;
    private View k;
    private TextView l;
    private boolean m;
    private b.a n;

    public SGDetailB2CPriceBarBlock(@NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e003fe2c50c619701825682e7119ebcb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e003fe2c50c619701825682e7119ebcb");
            return;
        }
        this.n = new e(this);
        this.m = z;
    }

    @Override // com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "469dbbb3a93dd6561bf79bf5bddbc270", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "469dbbb3a93dd6561bf79bf5bddbc270");
            return;
        }
        super.a_(view);
        this.h = (SGPriceTextView) a(R.id.txt_price);
        this.i = (TextView) a(R.id.txt_price_unit);
        this.k = a(R.id.rl_member_price_container);
        this.l = (TextView) a(R.id.tv_member_price);
        this.j = (TextView) a(R.id.txt_origin_price);
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35d34d2ddf63715e521e2c4577ee1646", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35d34d2ddf63715e521e2c4577ee1646");
        } else {
            super.bE_();
        }
    }

    public final void a(GoodsSpu goodsSpu) {
        String unit;
        boolean z = true;
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a1610f36fef3a1c1b593a5a4dd1a064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a1610f36fef3a1c1b593a5a4dd1a064");
        } else if (goodsSpu != null) {
            if ((goodsSpu.getSkuList() == null || goodsSpu.getSkuList().size() <= 1) ? false : false) {
                unit = l().getString(R.string.wm_sc_common_multi_goods_price_format);
            } else {
                unit = goodsSpu.getUnit();
            }
            b(unit);
            this.n.a(goodsSpu);
        }
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f825817ab39de81b75988a113947b68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f825817ab39de81b75988a113947b68");
        } else if (TextUtils.isEmpty(str)) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            TextView textView = this.i;
            textView.setText("/" + str);
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.pricebar.b.InterfaceC1335b
    public final void a(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91165cac9306e02301c1197bc097021f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91165cac9306e02301c1197bc097021f");
            return;
        }
        this.h.setPrice(i.a(gVar.b));
        if (i.d(Double.valueOf(gVar.c), Double.valueOf(0.0d))) {
            this.j.setText(l().getString(R.string.wm_sc_common_price, new Object[]{i.a(gVar.c)}));
            this.j.setVisibility(0);
        } else {
            this.j.setVisibility(4);
        }
        if (gVar.a) {
            this.l.setText(i.a(gVar.d));
            this.k.setVisibility(0);
            if (this.m) {
                this.k.setBackground(new e.a().a(h.a(m(), 17.0f)).b(h.a(m(), 0.5f)).c(com.sankuai.waimai.store.util.b.b(m(), R.color.wm_sg_color_FFFFFF)).a());
                return;
            }
            return;
        }
        this.k.setBackground(null);
        this.k.setVisibility(8);
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7cdfb1eb3aed7a1cc683c25126d4119", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7cdfb1eb3aed7a1cc683c25126d4119");
        }
        return layoutInflater.inflate(this.m ? R.layout.wm_sc_goods_detail_price_b2c_promotion : R.layout.wm_sc_goods_detail_price_b2c_normal, viewGroup, false);
    }
}
