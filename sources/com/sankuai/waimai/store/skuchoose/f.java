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
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.store.base.b implements FlashStepper.a {
    public static ChangeQuickRedirect a;
    TextView b;
    FlashStepper c;
    TextView d;
    private TextView e;
    private GoodsSpu f;
    private GoodsSku g;
    private TextView h;
    private TextView i;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a j;
    private GoodsAttr[] k;
    private e l;
    private com.sankuai.waimai.store.shopping.cart.a m;
    private int n;

    public static /* synthetic */ void a(f fVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "9f10cabbfe072f88cbc028fc37337810", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "9f10cabbfe072f88cbc028fc37337810");
        } else if (fVar.l.c()) {
            if (fVar.l != null) {
                fVar.l.b();
            }
            if (fVar.g.getStock() == 0) {
                am.a(fVar.getView(), fVar.getContext().getString(R.string.wm_sc_common_select_good_sold_out_tip));
                if (fVar.l != null) {
                    fVar.l.b();
                }
            } else if (fVar.a(fVar.g, fVar.f) || fVar.g.getStock() < fVar.g.getMinOrderCount()) {
                am.a(fVar.getView(), fVar.getContext().getString(R.string.wm_sc_common_select_good_can_not_tip));
                if (fVar.l != null) {
                    fVar.l.b();
                }
            } else if (fVar.l.a(fVar.f, fVar.g, fVar.k, i)) {
            } else {
                ArrayList arrayList = new ArrayList();
                if (fVar.f != null && fVar.g != null) {
                    arrayList.add(new WmOrderedFood(fVar.f.getId(), fVar.g.id, fVar.k, i, 0, 0, fVar.f.activityTag));
                }
                Activity activity = fVar.mContext instanceof SCBaseActivity ? (Activity) fVar.mContext : null;
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) arrayList) && fVar.m != null && activity != null && fVar.m.c != null) {
                    com.sankuai.waimai.store.order.a.e().a(activity, fVar.j, fVar.m.e, fVar.m.d, arrayList, fVar.m.c.recommendCouponInfo, fVar.e, fVar.m.g);
                }
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "b676489aaaead180ad4da3ddf5c131a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "b676489aaaead180ad4da3ddf5c131a9");
                } else if (fVar.j == null || fVar.g == null || fVar.f == null || fVar.m == null) {
                } else {
                    com.sankuai.waimai.store.manager.judas.b.a(fVar.mContext, "b_waimai_dpbvahjn_mc").a("poi_id", Long.valueOf(fVar.j.f())).a("spu_id", Long.valueOf(fVar.f.id)).a("deal_id", Long.valueOf(fVar.g.id)).a("stid", t.a(fVar.m.f) ? "-999" : fVar.m.f).a();
                }
            }
        }
    }

    public f(@NonNull Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, e eVar, com.sankuai.waimai.store.shopping.cart.a aVar2) {
        super(context);
        Object[] objArr = {context, aVar, eVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a58efb3f38d8210fe452c759ff44afb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a58efb3f38d8210fe452c759ff44afb");
            return;
        }
        this.n = 1;
        this.j = aVar;
        this.l = eVar;
        this.m = aVar2;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f35d7d81f4fa9d4d8294bfd300155be7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f35d7d81f4fa9d4d8294bfd300155be7");
            return;
        }
        super.onViewCreated();
        this.b = (TextView) findView(R.id.txt_normal_price);
        this.c = (FlashStepper) findView(R.id.flash_stepper);
        this.h = (TextView) findView(R.id.sku_stock);
        this.e = (TextView) findView(R.id.purchase_now_btn);
        this.d = (TextView) findView(R.id.sku_dialog_member_price);
        this.i = (TextView) findView(R.id.sku_stock);
    }

    public final void a(GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {goodsSpu, goodsSku, goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61cb2cfbbaab662ec6d24d6cd7cfef4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61cb2cfbbaab662ec6d24d6cd7cfef4c");
        } else if (goodsSpu == null || goodsSku == null) {
            a();
        } else {
            this.f = goodsSpu;
            this.g = goodsSku;
            this.k = goodsAttrArr;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd0a7f74e9e4766ed06da46e45b8d47e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd0a7f74e9e4766ed06da46e45b8d47e");
            } else {
                this.e.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(this.mContext, 6.0f)).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{this.mContext.getResources().getColor(R.color.wm_st_common_FF8F1E), this.mContext.getResources().getColor(R.color.wm_st_common_F45219)}).a());
                this.e.setText(getContext().getString(R.string.wm_sc_channel_drug_new_user_quick_buy));
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.skuchoose.f.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "803fd927a68a6263ad25bcd89f5fe848", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "803fd927a68a6263ad25bcd89f5fe848");
                        } else {
                            f.a(f.this, f.this.c.getCount());
                        }
                    }
                });
            }
            a(goodsSku, goodsSpu);
            this.c.setCallback(this);
        }
    }

    private boolean a(@NonNull GoodsSku goodsSku, @NonNull GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSku, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ab6363ca847765865def48947bdeae7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ab6363ca847765865def48947bdeae7")).booleanValue();
        }
        if (goodsSku == null || goodsSpu == null) {
            c();
            return true;
        } else if (goodsSku.getStock() == 0) {
            a();
            return true;
        } else {
            switch (goodsSku.getStatus()) {
                case 1:
                case 2:
                    a();
                    return true;
                default:
                    b();
                    this.c.setEnable(true);
                    a(goodsSku);
                    d();
                    return false;
            }
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e466b180dbcd63046572e5259d1b57b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e466b180dbcd63046572e5259d1b57b");
        } else if (this.g == null) {
        } else {
            c();
            b();
            a(this.g);
            d();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f5d6950e923cbb82fabb331af497087", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f5d6950e923cbb82fabb331af497087");
        } else if (this.f == null || this.g == null) {
            u.c(this.d, this.b);
        } else {
            s.a(this.f.activityType > 0, this.g, new s.a<GoodsSku>() { // from class: com.sankuai.waimai.store.skuchoose.f.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.s.a
                public final /* synthetic */ void a(GoodsSku goodsSku) {
                    GoodsSku goodsSku2 = goodsSku;
                    Object[] objArr2 = {goodsSku2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b4a7951e974353ba3cec359b8ae8121", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b4a7951e974353ba3cec359b8ae8121");
                    } else if (goodsSku2 != null) {
                        u.a(f.this.b, String.valueOf(goodsSku2.price));
                        u.c(f.this.d);
                    } else {
                        u.c(f.this.b, f.this.d);
                    }
                }

                @Override // com.sankuai.waimai.store.util.s.a
                public final /* synthetic */ void b(GoodsSku goodsSku) {
                    GoodsSku goodsSku2 = goodsSku;
                    Object[] objArr2 = {goodsSku2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e40c031aa116c65aad9e84175f14c15", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e40c031aa116c65aad9e84175f14c15");
                    } else if (goodsSku2 != null) {
                        u.a(f.this.b, String.valueOf(goodsSku2.price));
                        f.this.d.setText(f.this.mContext.getString(R.string.wm_sc_common_price, com.sankuai.shangou.stone.util.i.a(goodsSku2.memberPrice)));
                        u.a(f.this.d);
                    } else {
                        u.c(f.this.b, f.this.d);
                    }
                }
            });
        }
    }

    private void a(@NonNull GoodsSku goodsSku) {
        Object[] objArr = {goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15f84b8631b6ebbb9b06e52d96ee777a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15f84b8631b6ebbb9b06e52d96ee777a");
            return;
        }
        int stock = goodsSku.getStock();
        if (stock <= 0 || stock >= 10000) {
            u.c(this.h);
            return;
        }
        u.a(this.h);
        u.a(this.h, getContext().getString(R.string.wm_sc_common_current_stock, Integer.valueOf(stock)));
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a3da383a625a4dea4d023153ab1388a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a3da383a625a4dea4d023153ab1388a");
            return;
        }
        this.c.b = false;
        this.c.setCount(1);
        this.c.setEnable(false);
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f220f84edc7e424cd7f8c431b20f2ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f220f84edc7e424cd7f8c431b20f2ea");
        } else if (this.g == null) {
        } else {
            this.n = this.g.getMinOrderCount();
            this.c.b = true;
            this.c.setCount(this.n);
        }
    }

    @Override // com.sankuai.waimai.store.view.standard.FlashStepper.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7497d742f504757cc9492ed080bbae7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7497d742f504757cc9492ed080bbae7e");
        } else if (this.l.c()) {
            int count = this.c.getCount();
            if (this.g != null) {
                int stock = this.g.getStock();
                int restrict = this.g.getRestrict();
                int minOrderCount = this.g.getMinOrderCount();
                if (count < minOrderCount) {
                    this.n = minOrderCount;
                } else {
                    this.n = count + 1;
                }
                if (restrict > 0 && this.n > restrict) {
                    am.a(getView(), getContext().getString(R.string.wm_sc_common_restrict_purchase_tip, Integer.valueOf(restrict)));
                } else if (stock >= 0 && this.n > stock) {
                    am.a(getView(), getContext().getString(R.string.wm_sc_common_stock_purchase_tip));
                } else {
                    this.c.setCount(this.n);
                }
                if (this.l != null) {
                    this.l.b(this.g);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.view.standard.FlashStepper.a
    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8696c35e60a6842e3b55d1cd4d48141", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8696c35e60a6842e3b55d1cd4d48141");
        } else if (this.l.c() && this.g != null) {
            int count = this.c.getCount();
            int minOrderCount = this.g.getMinOrderCount();
            if (count <= minOrderCount) {
                am.a(getView(), getContext().getString(R.string.wm_sc_common_restrict_purchase_tip_dec, Integer.valueOf(minOrderCount)));
            } else {
                minOrderCount = count - 1;
            }
            this.c.setCount(minOrderCount);
            if (this.l != null) {
                this.l.c(this.g);
            }
        }
    }
}
