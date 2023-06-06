package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.goods.ToBeMemberInfo;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class i extends com.sankuai.waimai.store.newwidgets.list.g<e, d> implements com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b, com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b {
    public static ChangeQuickRedirect a;
    public g b;
    private com.sankuai.waimai.store.widgets.filterbar.sortlist.b c;
    private com.sankuai.waimai.store.widgets.filterbar.multiselect.one.a d;
    private View e;
    private GoodsPoiCategory f;
    private f g;
    private a h;
    private View i;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public int a() {
        return R.layout.wm_drug_shop_content_goods_sort_item_layout;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public void a(e eVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c7d964597ae30a07273c88b6354ce5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c7d964597ae30a07273c88b6354ce5d");
        } else if (eVar == null || eVar.b == null) {
        } else {
            this.e.setVisibility(8);
            this.f = eVar.b;
            if (b(this.f)) {
                this.i.setVisibility(0);
                this.c.a(this.f.sortType, this.f.sortList);
            } else {
                this.c.a(this.f.sortType, (List<SGSortModel>) null);
            }
            if (a(this.f)) {
                this.i.setVisibility(0);
                this.d.a(this.f.getBrandIds(), this.f.brandInfo);
                this.d.a(eVar.e);
                if (!((d) this.o).k()) {
                    this.d.b();
                } else if (eVar.e) {
                    this.d.a();
                }
            } else {
                this.d.a((List<Long>) null, (SGSortModel) null);
                if (!((d) this.o).k()) {
                    this.d.b();
                }
            }
            if (b(this.f) || a(this.f)) {
                this.e.setVisibility(0);
            } else {
                this.e.setVisibility(8);
            }
            GoodsPoiCategory goodsPoiCategory = this.f;
            Object[] objArr2 = {goodsPoiCategory};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26f9ca6f3439984b313b48efff9aee75", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26f9ca6f3439984b313b48efff9aee75")).booleanValue();
            } else {
                z = (goodsPoiCategory.receiveCouponTip == null || t.a(goodsPoiCategory.receiveCouponTip.activityDesc)) ? false : true;
            }
            if (z) {
                this.i.setVisibility(0);
                this.g.hide();
                this.b.show();
                this.b.a(eVar, i, 0);
            } else {
                GoodsPoiCategory goodsPoiCategory2 = this.f;
                Object[] objArr3 = {goodsPoiCategory2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5259169ca4a91705e3174412d25891e4", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5259169ca4a91705e3174412d25891e4")).booleanValue();
                } else {
                    z2 = (goodsPoiCategory2.activityInfo == null || t.a(goodsPoiCategory2.activityInfo.activityText)) ? false : true;
                }
                if (z2) {
                    this.i.setVisibility(0);
                    this.b.hide();
                    this.g.show();
                    this.g.a(eVar, i, 0);
                } else {
                    GoodsPoiCategory goodsPoiCategory3 = eVar.c;
                    Object[] objArr4 = {goodsPoiCategory3};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "de6b9262971261d0f8cc010b722826ba", RobustBitConfig.DEFAULT_VALUE)) {
                        z3 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "de6b9262971261d0f8cc010b722826ba")).booleanValue();
                    } else {
                        z3 = (goodsPoiCategory3.mDescriptionBar == null || t.a(goodsPoiCategory3.mDescriptionBar.content)) ? false : true;
                    }
                    if (z3) {
                        this.i.setVisibility(0);
                        this.b.hide();
                        this.g.show();
                        this.g.a(eVar, i, 1);
                    } else {
                        this.g.hide();
                        this.b.hide();
                    }
                }
            }
            GoodsPoiCategory goodsPoiCategory4 = eVar.b;
            Object[] objArr5 = {goodsPoiCategory4};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "abf759177cee681d6b46376adcf2e91c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "abf759177cee681d6b46376adcf2e91c");
            } else if (goodsPoiCategory4.mToBeMemberInfo == null || TextUtils.isEmpty(goodsPoiCategory4.mToBeMemberInfo.memberText)) {
                this.h.hide();
            } else {
                this.h.show();
                a aVar = this.h;
                Object[] objArr6 = {goodsPoiCategory4};
                ChangeQuickRedirect changeQuickRedirect6 = a.a;
                if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "63d35f57423e5e3e46f5d97c3175f3a1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "63d35f57423e5e3e46f5d97c3175f3a1");
                    return;
                }
                ToBeMemberInfo toBeMemberInfo = goodsPoiCategory4.mToBeMemberInfo;
                u.a(aVar.c, toBeMemberInfo.memberText);
                u.a(aVar.b);
                b.C0608b b = com.sankuai.waimai.store.util.m.b("https://p0.meituan.net/travelcube/0f8015bcd4eb382d3589943356cb097511501.png", ImageQualityUtil.a());
                b.e = 0;
                b.a(aVar.d);
                if (TextUtils.isEmpty(toBeMemberInfo.memberIcon)) {
                    u.c(aVar.b);
                } else {
                    u.a(aVar.b);
                    b.C0608b b2 = com.sankuai.waimai.store.util.m.b(toBeMemberInfo.memberIcon, ImageQualityUtil.a());
                    b2.e = 0;
                    b2.a(aVar.b);
                }
                aVar.e.b(aVar.a());
            }
        }
    }

    private boolean a(@NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2361ddee053018474c048ae9f65a3fb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2361ddee053018474c048ae9f65a3fb")).booleanValue() : goodsPoiCategory.brandInfo != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsPoiCategory.brandInfo.subFilterList);
    }

    private boolean b(@NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a971be267c8917b9368fb01c879dd67", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a971be267c8917b9368fb01c879dd67")).booleanValue();
        }
        return com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsPoiCategory.sortList) && !(goodsPoiCategory.activityTag != null && goodsPoiCategory.activityTag.contains("hotsale_food")) && ((d) this.o).b(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cea54f56ecc31f89c547fc9f09e6ae64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cea54f56ecc31f89c547fc9f09e6ae64");
            return;
        }
        this.e = view.findViewById(R.id.filter_layout);
        this.i = view.findViewById(R.id.root_spin_layout);
        this.c = new com.sankuai.waimai.store.widgets.filterbar.sortlist.b(view.getContext(), this);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.fl_sort_container);
        if (frameLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).leftMargin = -com.sankuai.shangou.stone.util.h.a(view.getContext(), 2.0f);
        }
        frameLayout.addView(this.c.createView(frameLayout));
        this.d = new com.sankuai.waimai.store.widgets.filterbar.multiselect.one.a(view.getContext(), ((d) this.o).o(), this);
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.fl_brand_filter_container);
        frameLayout2.addView(this.d.createView(frameLayout2));
        FrameLayout frameLayout3 = (FrameLayout) view.findViewById(R.id.fl_slogan_container);
        FrameLayout frameLayout4 = (FrameLayout) view.findViewById(R.id.to_be_poi_member_banner_container);
        this.g = new f(view.getContext());
        frameLayout3.addView(this.g.createView(frameLayout3));
        this.b = new g(view.getContext(), (d) this.o);
        frameLayout3.addView(this.b.createView(frameLayout3));
        this.h = new a(view.getContext(), (d) this.o);
        frameLayout4.addView(this.h.createView(frameLayout4));
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b
    public final void a(View view, long j) {
        Object[] objArr = {view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2beb7396970165340a6422470fae87c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2beb7396970165340a6422470fae87c6");
        } else {
            ((d) this.o).a(this.f, view, (int) j);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ba4118d417478900f829f29d4631039", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ba4118d417478900f829f29d4631039");
            return;
        }
        GoodsPoiCategory goodsPoiCategory = this.f;
        ((d) this.o).a(goodsPoiCategory, i2, goodsPoiCategory.getBrandIds());
        ((d) this.o).a(i, this.f, i2);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b
    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6077eb1a25ff854621c988dd709eb9c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6077eb1a25ff854621c988dd709eb9c8");
        } else {
            ((d) this.o).a(view, this.f);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa8f437931a2a839af29a4992ea39f7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa8f437931a2a839af29a4992ea39f7d");
        } else {
            ((d) this.o).d(this.f);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeb57e4f2baa02be1637eeef26c04ec0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeb57e4f2baa02be1637eeef26c04ec0");
        } else {
            ((d) this.o).a(z, this.f);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b
    public final void a(View view, int i, String str) {
        Object[] objArr = {view, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e7ea6ac65ded910ab6545898433a3e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e7ea6ac65ded910ab6545898433a3e3");
        } else {
            ((d) this.o).a(this.f, view, str, i);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.b
    public final void a(int i, String str, List<Long> list) {
        Object[] objArr = {Integer.valueOf(i), str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c5f836416142353b7d69fc0da318b12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c5f836416142353b7d69fc0da318b12");
            return;
        }
        ((d) this.o).a(this.f, this.f.sortType, list);
        ((d) this.o).a(this.f, str, i);
    }
}
