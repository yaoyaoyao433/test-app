package com.sankuai.waimai.store.skuchoose;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.s;
import com.sankuai.waimai.store.view.standard.FlashStepper;
import java.util.ArrayList;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k extends a implements FlashStepper.a {
    public static ChangeQuickRedirect f;
    @NonNull
    final e g;
    TextView h;
    TextView i;
    com.sankuai.waimai.store.platform.domain.manager.poi.a j;
    FlashStepper k;
    TextView l;
    com.sankuai.waimai.store.shopping.cart.a m;
    private TextView n;
    private int o;

    @Override // com.sankuai.waimai.store.skuchoose.a
    public final int a() {
        return R.layout.wm_sc_view_sku_dialog_bottom_price;
    }

    public k(@NonNull Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NotNull e eVar, com.sankuai.waimai.store.shopping.cart.a aVar2) {
        super(context);
        Object[] objArr = {context, aVar, eVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a883609d0cd90d2538dc02157c19607d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a883609d0cd90d2538dc02157c19607d");
            return;
        }
        this.o = 1;
        this.j = aVar;
        this.g = eVar;
        this.m = aVar2;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "822e384b90b5f83f880a92298a3dc1e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "822e384b90b5f83f880a92298a3dc1e4");
            return;
        }
        super.onViewCreated();
        this.n = (TextView) findView(R.id.sku_dialog_price_label);
        this.h = (TextView) findView(R.id.sku_dialog_goods_price);
        this.i = (TextView) findView(R.id.sku_dialog_member_price);
        this.k = (FlashStepper) findView(R.id.sku_dialog_flash_stepper);
        this.k.setEnable(false);
        this.k.setCallback(this);
        this.l = (TextView) findView(R.id.sku_dialog_buy_now);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee8fe383273c95580556275f8bebfdfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee8fe383273c95580556275f8bebfdfc");
        } else {
            this.l.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(this.b, 6.0f)).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{this.b.getResources().getColor(R.color.wm_st_common_FF8F1E), this.b.getResources().getColor(R.color.wm_st_common_F45219)}).a());
        }
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.skuchoose.k.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eb6dd3ab801fdac8869dc798dad2b4cb", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eb6dd3ab801fdac8869dc798dad2b4cb");
                    return;
                }
                int count = k.this.k.getCount();
                if (k.this.d == null) {
                    am.a(k.this.getView(), k.this.getContext().getString(R.string.wm_sc_common_select_good_attr_tip));
                    k.this.g.b();
                } else if (k.this.d.getStock() == 0) {
                    am.a(k.this.getView(), k.this.getContext().getString(R.string.wm_sc_common_select_good_sold_out_tip));
                    k.this.g.b();
                } else if (k.this.a(k.this.d, k.this.c) || k.this.d.getStock() < k.this.d.getMinOrderCount()) {
                    am.a(k.this.getView(), k.this.getContext().getString(R.string.wm_sc_common_select_good_can_not_tip));
                    k.this.g.b();
                } else {
                    k kVar = k.this;
                    Object[] objArr4 = {Integer.valueOf(count)};
                    ChangeQuickRedirect changeQuickRedirect4 = k.f;
                    if (PatchProxy.isSupport(objArr4, kVar, changeQuickRedirect4, false, "50a6d9a749edb66d269581d6acedb48f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, kVar, changeQuickRedirect4, false, "50a6d9a749edb66d269581d6acedb48f");
                        return;
                    }
                    kVar.g.b();
                    if (kVar.g.a(kVar.c, kVar.d, kVar.e, count)) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (kVar.c != null && kVar.d != null) {
                        arrayList.add(new WmOrderedFood(kVar.c.getId(), kVar.d.id, kVar.e, count, 0, 0, kVar.c.activityTag));
                    }
                    Activity activity = kVar.b instanceof SCBaseActivity ? (Activity) kVar.b : null;
                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) arrayList) && kVar.m != null && kVar.m.c != null && activity != null) {
                        com.sankuai.waimai.store.order.a.e().a(activity, kVar.j, kVar.m.e, kVar.m.d, arrayList, kVar.m.c.recommendCouponInfo, kVar.l, kVar.m.g);
                    }
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = k.f;
                    if (PatchProxy.isSupport(objArr5, kVar, changeQuickRedirect5, false, "2c0887f87e49a29144d17b4107fac630", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, kVar, changeQuickRedirect5, false, "2c0887f87e49a29144d17b4107fac630");
                    } else if (kVar.j == null || kVar.d == null || kVar.c == null || kVar.m == null) {
                    } else {
                        com.sankuai.waimai.store.manager.judas.b.a(kVar.b, "b_waimai_dpbvahjn_mc").a("poi_id", kVar.j.d()).a("spu_id", Long.valueOf(kVar.c.id)).a("deal_id", Long.valueOf(kVar.d.id)).a("stid", t.a(kVar.m.f) ? "-999" : kVar.m.f).a();
                    }
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.skuchoose.a
    public final void a(GoodsSpu goodsSpu, boolean z, GoodsSku goodsSku) {
        Object[] objArr = {goodsSpu, Byte.valueOf(z ? (byte) 1 : (byte) 0), goodsSku};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09ca3dcd3851a5e046d95c2d4e0f28fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09ca3dcd3851a5e046d95c2d4e0f28fb");
        } else if (goodsSpu == null || goodsSku == null) {
        } else {
            this.c = goodsSpu;
            this.d = goodsSku;
            s.a(z, goodsSku, new s.a<GoodsSku>() { // from class: com.sankuai.waimai.store.skuchoose.k.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.s.a
                public final /* synthetic */ void a(GoodsSku goodsSku2) {
                    GoodsSku goodsSku3 = goodsSku2;
                    Object[] objArr2 = {goodsSku3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9337df9b0cf3f894644105cd0ed90a77", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9337df9b0cf3f894644105cd0ed90a77");
                    } else if (goodsSku3 != null) {
                        u.a(k.this.h, String.valueOf(goodsSku3.price));
                        u.c(k.this.i);
                    }
                }

                @Override // com.sankuai.waimai.store.util.s.a
                public final /* synthetic */ void b(GoodsSku goodsSku2) {
                    GoodsSku goodsSku3 = goodsSku2;
                    Object[] objArr2 = {goodsSku3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "620e8e2d117e5e281e52081718daa7bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "620e8e2d117e5e281e52081718daa7bd");
                    } else if (goodsSku3 != null) {
                        u.a(k.this.h, String.valueOf(goodsSku3.price));
                        k kVar = k.this;
                        double d = goodsSku3.memberPrice;
                        Object[] objArr3 = {Double.valueOf(d)};
                        ChangeQuickRedirect changeQuickRedirect3 = k.f;
                        if (PatchProxy.isSupport(objArr3, kVar, changeQuickRedirect3, false, "8fd5ba781b9854bc5204eb951b898bf1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, kVar, changeQuickRedirect3, false, "8fd5ba781b9854bc5204eb951b898bf1");
                            return;
                        }
                        u.a(kVar.i);
                        u.a(kVar.i, kVar.b.getString(R.string.wm_sc_common_price, com.sankuai.shangou.stone.util.i.a(d)));
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.a
    public final void a(GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {goodsSpu, goodsSku, goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bd2f230b5cc6c9d6e0b0a2d35c70c18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bd2f230b5cc6c9d6e0b0a2d35c70c18");
        } else if (goodsSpu == null || goodsSku == null) {
            b();
        } else {
            this.d = goodsSku;
            this.c = goodsSpu;
            this.e = goodsAttrArr;
            a(goodsSku, goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.a
    public final void a(int i, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {Integer.valueOf(i), goodsSpu, goodsSku, goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f21b2c31b5a767dbe020a620862aa969", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f21b2c31b5a767dbe020a620862aa969");
        } else if (goodsSpu == null || goodsSku == null) {
        } else {
            this.d = goodsSku;
            this.c = goodsSpu;
            this.e = goodsAttrArr;
            a(goodsSku, goodsSpu);
        }
    }

    boolean a(GoodsSku goodsSku, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSku, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b445c15ada92aaaef367c5800f63973", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b445c15ada92aaaef367c5800f63973")).booleanValue();
        }
        if (goodsSku == null || goodsSpu == null) {
            b();
            return true;
        } else if (goodsSku.getStock() == 0) {
            c();
            return true;
        } else {
            switch (goodsSku.getStatus()) {
                case 1:
                case 2:
                    c();
                    return true;
                default:
                    this.k.setEnable(true);
                    d();
                    return false;
            }
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55d34a485cc7b6c06f84abd5f6d86b9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55d34a485cc7b6c06f84abd5f6d86b9c");
            return;
        }
        this.k.b = false;
        this.k.setCount(1);
        this.k.setEnable(false);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15419b054b023ee6004497fe538b40fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15419b054b023ee6004497fe538b40fd");
        } else if (this.d == null) {
        } else {
            b();
            a(this.c);
            d();
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b878d996b9a690d0dfb54569ac2cad6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b878d996b9a690d0dfb54569ac2cad6");
        } else if (this.d == null) {
        } else {
            this.o = this.d.getMinOrderCount();
            this.k.b = true;
            this.k.setCount(this.o);
        }
    }

    @Override // com.sankuai.waimai.store.view.standard.FlashStepper.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34c74b090785db4f5feda4abf584df6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34c74b090785db4f5feda4abf584df6a");
            return;
        }
        int count = this.k.getCount();
        if (this.d != null) {
            int stock = this.d.getStock();
            int restrict = this.d.getRestrict();
            int minOrderCount = this.d.getMinOrderCount();
            if (count < minOrderCount) {
                this.o = minOrderCount;
            } else {
                this.o = count + 1;
            }
            if (restrict > 0 && this.o > restrict) {
                am.a(getView(), getContext().getString(R.string.wm_sc_common_restrict_purchase_tip, Integer.valueOf(restrict)));
            } else if (stock >= 0 && this.o > stock) {
                am.a(getView(), getContext().getString(R.string.wm_sc_common_stock_purchase_tip));
            } else {
                this.k.setCount(this.o);
            }
            if (this.g != null) {
                this.g.b(this.d);
            }
        }
    }

    @Override // com.sankuai.waimai.store.view.standard.FlashStepper.a
    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9956f6c4bbe1464621a3e90a6db5f3d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9956f6c4bbe1464621a3e90a6db5f3d2");
            return;
        }
        int count = this.k.getCount();
        if (this.d != null) {
            int minOrderCount = this.d.getMinOrderCount();
            if (this.k.getCount() <= minOrderCount) {
                am.a(getView(), getContext().getString(R.string.wm_sc_common_restrict_purchase_tip_dec, Integer.valueOf(minOrderCount)));
            } else {
                minOrderCount = count - 1;
            }
            this.k.b = true;
            this.k.setCount(minOrderCount);
            if (this.g != null) {
                this.g.c(this.d);
            }
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.a
    public final void a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bdab969df3e2ea16e172726794b6a5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bdab969df3e2ea16e172726794b6a5a");
        } else if (goodsSpu == null || !com.sankuai.shangou.stone.util.a.a((Collection) goodsSpu.getSkus(), 1)) {
        } else {
            a(goodsSpu, goodsSpu.activityType > 0, goodsSpu.getSkus().get(0));
        }
    }
}
