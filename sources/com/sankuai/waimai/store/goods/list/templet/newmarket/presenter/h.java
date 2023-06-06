package com.sankuai.waimai.store.goods.list.templet.newmarket.presenter;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.goods.list.templet.newmarket.f;
import com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.PresenterDelegateFactory;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.RecommendPair;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiMemberInfo;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import com.sankuai.waimai.store.platform.shop.model.OperationPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.PoiOperationItem;
import com.sankuai.waimai.store.util.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class h extends f.a {
    public static ChangeQuickRedirect d;
    protected final a e;
    final c f;
    private final b g;
    private long h;
    private boolean i;
    private final boolean j;
    @NonNull
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a k;
    private final PresenterDelegateFactory l;

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void a(String str, long j) {
    }

    public abstract c k();

    public h(f.b bVar, @NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i) {
        super(bVar, i);
        Object[] objArr = {bVar, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2e9bb4c0d3465eb1cf8e16d96d02768", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2e9bb4c0d3465eb1cf8e16d96d02768");
            return;
        }
        this.e = new a();
        this.g = new b();
        this.h = -1L;
        this.j = j.h().a("supermarket/cache_all_api_spus", false);
        this.l = new PresenterDelegateFactory();
        this.f = k();
        this.k = aVar;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void a(IMarketResponse iMarketResponse) {
        Poi.CouponSummary couponSummary;
        Poi.PoiCouponEntity poiCoupon;
        b bVar;
        PoiMemberInfo poiMemberInfo;
        Object[] objArr = {iMarketResponse};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ec3c5fec7b46cdb34b21c58fa68c763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ec3c5fec7b46cdb34b21c58fa68c763");
        } else if (iMarketResponse == null) {
        } else {
            Object[] objArr2 = {iMarketResponse};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "916342c049bb54de6d2eec857c6f05f3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "916342c049bb54de6d2eec857c6f05f3");
            } else {
                if (iMarketResponse == null) {
                    this.g.a(null, null);
                    bVar = this.g;
                } else {
                    OperationPoiCategory operationPoiCategory = iMarketResponse.getOperationPoiCategory();
                    List<PoiOperationItem> operationList = operationPoiCategory != null ? operationPoiCategory.getOperationList() : null;
                    b bVar2 = this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = d;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "71531b0933509a57d9fb8d66a2bfa627", RobustBitConfig.DEFAULT_VALUE)) {
                        couponSummary = (Poi.CouponSummary) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "71531b0933509a57d9fb8d66a2bfa627");
                    } else {
                        Poi poi = this.k.b;
                        couponSummary = (poi == null || (poiCoupon = poi.getPoiCoupon()) == null) ? null : poiCoupon.mCouponSummary;
                    }
                    bVar2.a(operationList, couponSummary);
                    bVar = this.g;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = d;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b1b3fcb3eaeec5a3b08d86fea2888bfc", RobustBitConfig.DEFAULT_VALUE)) {
                        poiMemberInfo = (PoiMemberInfo) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b1b3fcb3eaeec5a3b08d86fea2888bfc");
                    } else {
                        Poi poi2 = this.k.b;
                        if (poi2 != null) {
                            poiMemberInfo = poi2.memberInfo;
                        }
                    }
                    bVar.a(poiMemberInfo);
                }
                poiMemberInfo = null;
                bVar.a(poiMemberInfo);
            }
            this.i = iMarketResponse.getChosenSpuNeedAdd();
            a aVar = this.e;
            List<GoodsPoiCategory> goodsPoiCategories = iMarketResponse.getGoodsPoiCategories();
            Object[] objArr5 = {goodsPoiCategories, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect5 = a.a;
            if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "596f71c32f8428d23693828dcb0b022a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "596f71c32f8428d23693828dcb0b022a");
            } else {
                aVar.b.clear();
                if (!com.sankuai.shangou.stone.util.a.b(goodsPoiCategories)) {
                    aVar.b.addAll(goodsPoiCategories);
                }
            }
            if (this.e.a()) {
                a(iMarketResponse.getChosenSpuId());
            } else {
                a(-1L);
            }
            if (this.j) {
                l();
            } else {
                this.f.d(this.e.e());
            }
            this.b.a(this.e.b());
            this.b.a(this.g.b);
            a(1, a(), null, 1, null);
        }
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03f40a1cd79eae70554065e8011183b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03f40a1cd79eae70554065e8011183b1");
            return;
        }
        List<GoodsPoiCategory> b = this.e.b();
        if (com.sankuai.shangou.stone.util.a.b(b)) {
            return;
        }
        for (GoodsPoiCategory goodsPoiCategory : b) {
            if (goodsPoiCategory != null) {
                ArrayList<GoodsPoiCategory> arrayList = goodsPoiCategory.childGoodPoiCategory;
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) arrayList)) {
                    for (GoodsPoiCategory goodsPoiCategory2 : arrayList) {
                        this.f.d(goodsPoiCategory2);
                    }
                } else {
                    this.f.d(goodsPoiCategory);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void a(int i, GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu, int i2, List<Long> list) {
        Object[] objArr = {Integer.valueOf(i), goodsPoiCategory, goodsSpu, Integer.valueOf(i2), list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e7f935bf60108c5f3c036d37924b76a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e7f935bf60108c5f3c036d37924b76a");
            return;
        }
        com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.a a = this.l.a(i, this.b);
        if (a == null) {
            return;
        }
        a.a(this.e, this.f, this.g);
        a.e = true;
        GoodsPoiCategory parentCategory = goodsPoiCategory != null ? goodsPoiCategory.getParentCategory() : null;
        if (a.b(parentCategory, goodsPoiCategory, goodsSpu)) {
            g a2 = a.a(parentCategory, goodsPoiCategory, goodsSpu);
            a.a(a2, this.k.f(), this.k.h(), this.h, i2, list);
            a2.q = this.c;
            this.f.a(a2);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6d54ecbc8a95365f44e5a077f15b902", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6d54ecbc8a95365f44e5a077f15b902");
            return;
        }
        if (j <= 0) {
            j = -1;
        }
        this.h = j;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void b(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebbbef14c93fdc04c471429d67ee10bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebbbef14c93fdc04c471429d67ee10bd");
            return;
        }
        a aVar = this.e;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ab5aa3d8b9a88966e8637884197bf3e0", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ab5aa3d8b9a88966e8637884197bf3e0")).booleanValue();
        } else if (aVar.a(aVar.b, str) == null) {
            z = false;
        }
        if (z) {
            a(-1L);
            a(1, a(), null, 1, null);
            this.b.a(this.e.c(), this.e.f());
            if (w.e(this.k.b)) {
                this.b.N();
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0f73423a60facd05af9a687f95adadd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0f73423a60facd05af9a687f95adadd");
        } else {
            a(0, 0);
        }
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87c98009f89587f92fea7dfe8aee13ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87c98009f89587f92fea7dfe8aee13ae");
            return;
        }
        this.e.a(i, i2);
        a(1, a(), null, 1, null);
        this.b.a(this.e.c(), this.e.f());
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79a289f56e04dc5e3ee88e8c7751fbc5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79a289f56e04dc5e3ee88e8c7751fbc5")).intValue() : this.e.c();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f1a5fa9e52a98473b1f5bd2d3acedec", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f1a5fa9e52a98473b1f5bd2d3acedec")).intValue() : this.e.f();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final int a(GoodsPoiCategory goodsPoiCategory) {
        String tagCode;
        HashMap<String, Integer> a;
        Integer num;
        int intValue;
        int i = 0;
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd8fc82b89f990cbb34323b9912e0fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd8fc82b89f990cbb34323b9912e0fb")).intValue();
        }
        if (goodsPoiCategory == null) {
            return 0;
        }
        if (goodsPoiCategory.aggregationActivityTags && goodsPoiCategory.isCloneCategory) {
            return 0;
        }
        if (!com.sankuai.shangou.stone.util.a.b(goodsPoiCategory.childGoodPoiCategory)) {
            Iterator<GoodsPoiCategory> it = goodsPoiCategory.childGoodPoiCategory.iterator();
            while (it.hasNext()) {
                i += a(it.next());
            }
            return i;
        }
        Object[] objArr2 = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a16be71791f035b4fd86f24f9761f70", RobustBitConfig.DEFAULT_VALUE)) {
            intValue = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a16be71791f035b4fd86f24f9761f70")).intValue();
        } else {
            if (goodsPoiCategory != null) {
                if (this.b.p()) {
                    tagCode = goodsPoiCategory.getTagCode();
                    a = com.sankuai.waimai.store.order.a.e().c.b(this.k.d());
                } else {
                    if (!TextUtils.isEmpty(goodsPoiCategory.activityTag)) {
                        tagCode = goodsPoiCategory.activityTag;
                    } else {
                        tagCode = goodsPoiCategory.getTagCode();
                    }
                    a = com.sankuai.waimai.store.order.a.e().c.a(this.k.d());
                }
                if (a != null && (num = a.get(tagCode)) != null) {
                    intValue = num.intValue();
                }
            }
            intValue = 0;
        }
        return 0 + intValue;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void a(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c1e94a803f3fe1bd3b334fea2ac1140", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c1e94a803f3fe1bd3b334fea2ac1140");
        } else if (goodsPoiCategory == b()) {
            b(goodsPoiCategory2);
        } else {
            this.e.a(goodsPoiCategory, goodsPoiCategory2);
            this.b.a(this.e.c(), this.e.f());
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4137e5675b53ed8b71cafd0f3c7fa392", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4137e5675b53ed8b71cafd0f3c7fa392");
        } else if (goodsPoiCategory == null || this.e.e() == goodsPoiCategory) {
        } else {
            this.e.a(goodsPoiCategory.getParentCategory(), goodsPoiCategory);
            this.b.a(-1, this.e.f());
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final GoodsPoiCategory a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "024b5c363d80d66f8ced60c7d711c172", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "024b5c363d80d66f8ced60c7d711c172") : this.e.e();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final GoodsPoiCategory b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0cc68e821f04d2069698636d0cc16f8", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0cc68e821f04d2069698636d0cc16f8") : this.e.d();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final GoodsPoiCategory f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7def932335702fe14b4f7d39d37c6460", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7def932335702fe14b4f7d39d37c6460") : this.e.g();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final GoodsPoiCategory c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57234cf036a883dd0eb58f6b96649a32", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57234cf036a883dd0eb58f6b96649a32") : this.e.a(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final GoodsPoiCategory g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d36567143f8d51711d76936e1cf0e8d3", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d36567143f8d51711d76936e1cf0e8d3") : this.e.h();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final GoodsPoiCategory d(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95e5d878f8b5e50792e2a60f446cc32e", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95e5d878f8b5e50792e2a60f446cc32e") : this.e.b(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final long c() {
        return this.h;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final boolean a(GoodsSpu goodsSpu) {
        boolean z = this.i;
        this.i = false;
        return z;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void a(String str) {
        int[] a;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d410b619f4414db6f8078effe04dee64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d410b619f4414db6f8078effe04dee64");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a aVar = this.e;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            int[] iArr = null;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "6d1675d0c0f303f6756df7e04feaca16", RobustBitConfig.DEFAULT_VALUE)) {
                iArr = (int[]) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "6d1675d0c0f303f6756df7e04feaca16");
            } else if (!TextUtils.isEmpty(str) && (a = aVar.a(str, aVar.b)) != null && a.length > 0) {
                iArr = a.length == 1 ? new int[]{a[0], 0} : a;
            }
            if (iArr == null || iArr.length < 2) {
                return;
            }
            a(iArr[0], iArr[1]);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final boolean e(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95fd9fd746378d4acdf55a9ee92999dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95fd9fd746378d4acdf55a9ee92999dc")).booleanValue();
        }
        GoodsPoiCategory b = this.e.b(goodsPoiCategory);
        return (b == null || c.e(b)) ? false : true;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "007eb7e2b51cf5b17d4fe93f0ffa977d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "007eb7e2b51cf5b17d4fe93f0ffa977d")).booleanValue() : (this.e.b(goodsPoiCategory, goodsPoiCategory2) == null && this.e.a(goodsPoiCategory) == null) ? false : true;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final boolean f(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da9d6b0273d5877ca8c93af4fa8b733a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da9d6b0273d5877ca8c93af4fa8b733a")).booleanValue() : this.f.b(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final int a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceace2548f2d59e02fb3ae3653b53ae8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceace2548f2d59e02fb3ae3653b53ae8")).intValue() : this.f.c(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "833ae7c7b13b9298e74bd27a6fa0915e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "833ae7c7b13b9298e74bd27a6fa0915e")).booleanValue() : this.f.d(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final boolean c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4beb9012021e9a5a8f87437738c255d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4beb9012021e9a5a8f87437738c255d")).booleanValue() : this.f.e(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void a(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdf26239aa20a5093ea425b4d78308cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdf26239aa20a5093ea425b4d78308cb");
        } else {
            this.f.a(j, j2, i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public void a(final GoodsSpu goodsSpu, GoodsSku goodsSku, final GoodsPoiCategory goodsPoiCategory, String str) {
        long j;
        Object[] objArr = {goodsSpu, goodsSku, goodsPoiCategory, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55d52abe1015ec30a979141c0758aba6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55d52abe1015ec30a979141c0758aba6");
        } else if (goodsSpu == null) {
        } else {
            String str2 = "";
            if (goodsPoiCategory != null && goodsPoiCategory.getParentCategory() != null && t.a(goodsPoiCategory.getParentCategory().tag)) {
                str2 = goodsPoiCategory.getParentCategory().tag;
            }
            String str3 = str2;
            List<GoodsSku> list = goodsSpu.skus;
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d26fe92f7293acb1e471b181925be72a", RobustBitConfig.DEFAULT_VALUE)) {
                j = ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d26fe92f7293acb1e471b181925be72a")).longValue();
            } else {
                GoodsSku goodsSku2 = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0);
                j = goodsSku2 != null ? goodsSku2.id : 0L;
            }
            if (goodsSku != null) {
                j = goodsSku.id;
            }
            com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b.H()).a(this.k.f(), this.k.h(), goodsSpu.getId(), j, 1, str3, str, new com.sankuai.waimai.store.base.net.j<RecommendPair>() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.h.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca5597c04f361343a01129a097578826", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca5597c04f361343a01129a097578826");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(RecommendPair recommendPair) {
                    RecommendPair recommendPair2 = recommendPair;
                    Object[] objArr3 = {recommendPair2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "19d9dd29681cf8377d0b2c72e0a8bfd8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "19d9dd29681cf8377d0b2c72e0a8bfd8");
                    } else if (recommendPair2 != null) {
                        if (recommendPair2.moduleType == 2) {
                            if (h.this.f.a(goodsSpu, goodsPoiCategory, recommendPair2.collocateFrequencyNum)) {
                                return;
                            }
                            goodsSpu.recommendPair = recommendPair2;
                            if (goodsSpu.isManySku()) {
                                h.this.b.a(recommendPair2, goodsSpu.id);
                            }
                            h.this.b.ba_();
                        } else if (TextUtils.isEmpty(recommendPair2.sceneId) || h.this.f.a(goodsSpu, goodsPoiCategory, recommendPair2.collocateFrequencyNum) || goodsSpu.notShowRecommendRegion) {
                        } else {
                            goodsSpu.recommendPair = recommendPair2;
                            h.this.b.ba_();
                        }
                    }
                }
            });
        }
    }
}
