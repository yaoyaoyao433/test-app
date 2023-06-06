package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.PresenterDelegateFactory;
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
public abstract class h extends i.a {
    public static ChangeQuickRedirect c;
    protected final a d;
    private final b e;
    private final c f;
    private long g;
    private boolean h;
    private final boolean i;
    @NonNull
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a j;
    private final PresenterDelegateFactory k;

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void a(String str, long j) {
    }

    public abstract c i();

    public h(i.b bVar, @NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        super(bVar);
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "186511ea065f0aa19fc9e9b94a5d401b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "186511ea065f0aa19fc9e9b94a5d401b");
            return;
        }
        this.d = new a();
        this.e = new b();
        this.g = -1L;
        this.i = j.h().a("supermarket/cache_all_api_spus", false);
        this.k = new PresenterDelegateFactory();
        this.f = i();
        this.j = aVar;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void a(IMarketResponse iMarketResponse) {
        Poi.CouponSummary couponSummary;
        Poi.PoiCouponEntity poiCoupon;
        b bVar;
        PoiMemberInfo poiMemberInfo;
        Object[] objArr = {iMarketResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e94f1ec4434a1840472ff2f3d69dbdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e94f1ec4434a1840472ff2f3d69dbdf");
        } else if (iMarketResponse == null) {
        } else {
            Object[] objArr2 = {iMarketResponse};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c3d5a8315f89725dd63fbb889bc4346", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c3d5a8315f89725dd63fbb889bc4346");
            } else {
                if (iMarketResponse == null) {
                    this.e.a(null, null);
                    bVar = this.e;
                } else {
                    OperationPoiCategory operationPoiCategory = iMarketResponse.getOperationPoiCategory();
                    List<PoiOperationItem> operationList = operationPoiCategory != null ? operationPoiCategory.getOperationList() : null;
                    b bVar2 = this.e;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b29c8b7d316d1e40ea40ac5c50f7f291", RobustBitConfig.DEFAULT_VALUE)) {
                        couponSummary = (Poi.CouponSummary) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b29c8b7d316d1e40ea40ac5c50f7f291");
                    } else {
                        Poi poi = this.j.b;
                        couponSummary = (poi == null || (poiCoupon = poi.getPoiCoupon()) == null) ? null : poiCoupon.mCouponSummary;
                    }
                    bVar2.a(operationList, couponSummary);
                    bVar = this.e;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = c;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "100804af712269a43d4dcc6ea922c25f", RobustBitConfig.DEFAULT_VALUE)) {
                        poiMemberInfo = (PoiMemberInfo) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "100804af712269a43d4dcc6ea922c25f");
                    } else {
                        Poi poi2 = this.j.b;
                        if (poi2 != null) {
                            poiMemberInfo = poi2.memberInfo;
                        }
                    }
                    bVar.a(poiMemberInfo);
                }
                poiMemberInfo = null;
                bVar.a(poiMemberInfo);
            }
            this.h = iMarketResponse.getChosenSpuNeedAdd();
            a aVar = this.d;
            List<GoodsPoiCategory> goodsPoiCategories = iMarketResponse.getGoodsPoiCategories();
            Object[] objArr5 = {goodsPoiCategories, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect5 = a.a;
            if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "d72eaae1a789c96b11927357cb3c12c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "d72eaae1a789c96b11927357cb3c12c0");
            } else {
                aVar.b.clear();
                if (!com.sankuai.shangou.stone.util.a.b(goodsPoiCategories)) {
                    aVar.b.addAll(goodsPoiCategories);
                }
            }
            if (this.d.a()) {
                a(iMarketResponse.getChosenSpuId());
            } else {
                a(-1L);
            }
            if (this.i) {
                j();
            } else {
                this.f.c(this.d.e());
            }
            this.b.a(this.d.b());
            this.b.a(this.e.b);
            a(1, a(), null, 1, null);
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b3521c5f001e62aea5285de67039954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b3521c5f001e62aea5285de67039954");
            return;
        }
        List<GoodsPoiCategory> b = this.d.b();
        if (com.sankuai.shangou.stone.util.a.b(b)) {
            return;
        }
        for (GoodsPoiCategory goodsPoiCategory : b) {
            if (goodsPoiCategory != null) {
                ArrayList<GoodsPoiCategory> arrayList = goodsPoiCategory.childGoodPoiCategory;
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) arrayList)) {
                    for (GoodsPoiCategory goodsPoiCategory2 : arrayList) {
                        this.f.c(goodsPoiCategory2);
                    }
                } else {
                    this.f.c(goodsPoiCategory);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void a(int i, GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu, int i2, List<Long> list) {
        Object[] objArr = {Integer.valueOf(i), goodsPoiCategory, goodsSpu, Integer.valueOf(i2), list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8277cf1ba074fe81080976b2ada48ba6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8277cf1ba074fe81080976b2ada48ba6");
            return;
        }
        com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.a a = this.k.a(i, this.b);
        if (a == null) {
            return;
        }
        a.a(this.d, this.f, this.e);
        a.e = true;
        GoodsPoiCategory parentCategory = goodsPoiCategory != null ? goodsPoiCategory.getParentCategory() : null;
        if (a.b(parentCategory, goodsPoiCategory, goodsSpu)) {
            g a2 = a.a(parentCategory, goodsPoiCategory, goodsSpu);
            a.a(a2, this.j.g(), this.j.h(), this.g, i2, list);
            this.f.a(a2);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4518ed1f3eb327343f4fc72daae76bcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4518ed1f3eb327343f4fc72daae76bcb");
            return;
        }
        if (j <= 0) {
            j = -1;
        }
        this.g = j;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void b(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80717ae45033a3f0171caa0247a817d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80717ae45033a3f0171caa0247a817d0");
            return;
        }
        a aVar = this.d;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "87291662ea94b9628822b2b1e47be3b9", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "87291662ea94b9628822b2b1e47be3b9")).booleanValue();
        } else if (aVar.a(aVar.b, str) == null) {
            z = false;
        }
        if (z) {
            a(-1L);
            a(0, a(), null, 1, null);
            this.b.a(this.d.c(), this.d.f());
            if (w.e(this.j.b)) {
                this.b.F();
            }
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79fce6cffae56dba3f348157af2a6b69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79fce6cffae56dba3f348157af2a6b69");
        } else {
            a(0, 0);
        }
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da414f5a15de53cab575143770f13b52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da414f5a15de53cab575143770f13b52");
            return;
        }
        this.d.a(i, i2);
        a(1, a(), null, 1, null);
        this.b.a(this.d.c(), this.d.f());
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34f2dd57fa0f499b385c3a4b4f94894f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34f2dd57fa0f499b385c3a4b4f94894f")).intValue() : this.d.c();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb1a79797b26f5084c7fd2729effe877", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb1a79797b26f5084c7fd2729effe877")).intValue() : this.d.f();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final int a(GoodsPoiCategory goodsPoiCategory) {
        String tagCode;
        Integer num;
        int intValue;
        int i = 0;
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd69516a8138134de4285c3beae1291", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd69516a8138134de4285c3beae1291")).intValue();
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
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "492f26b8fdbed77b9bf6fbe4d2d4caba", RobustBitConfig.DEFAULT_VALUE)) {
            intValue = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "492f26b8fdbed77b9bf6fbe4d2d4caba")).intValue();
        } else {
            if (goodsPoiCategory != null) {
                if (!TextUtils.isEmpty(goodsPoiCategory.activityTag)) {
                    tagCode = goodsPoiCategory.activityTag;
                } else {
                    tagCode = goodsPoiCategory.getTagCode();
                }
                HashMap<String, Integer> a = com.sankuai.waimai.store.order.a.e().c.a(this.j.d());
                if (a != null && (num = a.get(tagCode)) != null) {
                    intValue = num.intValue();
                }
            }
            intValue = 0;
        }
        return 0 + intValue;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void a(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2467ae96bc58523bcc86b5e7c9d40d37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2467ae96bc58523bcc86b5e7c9d40d37");
        } else if (goodsPoiCategory == b()) {
            b(goodsPoiCategory2);
        } else {
            this.d.a(goodsPoiCategory, goodsPoiCategory2);
            this.b.a(this.d.c(), this.d.f());
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c0378dbccd551c3a539e8c6a846291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c0378dbccd551c3a539e8c6a846291");
        } else if (goodsPoiCategory == null || this.d.e() == goodsPoiCategory) {
        } else {
            this.d.a(goodsPoiCategory.getParentCategory(), goodsPoiCategory);
            this.b.a(-1, this.d.f());
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final GoodsPoiCategory a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7ca416ef2c2d9d59db78261d3350da8", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7ca416ef2c2d9d59db78261d3350da8") : this.d.e();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final GoodsPoiCategory b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ff5762109160ad77936d183f82c38eb", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ff5762109160ad77936d183f82c38eb") : this.d.d();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final long c() {
        return this.g;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final boolean a(GoodsSpu goodsSpu) {
        boolean z = this.h;
        this.h = false;
        return z;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void a(String str) {
        int[] a;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68d979921d11866e829729a001666de4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68d979921d11866e829729a001666de4");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a aVar = this.d;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            int[] iArr = null;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ccd706b46140c15f4a2977e3df8861b4", RobustBitConfig.DEFAULT_VALUE)) {
                iArr = (int[]) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ccd706b46140c15f4a2977e3df8861b4");
            } else if (!TextUtils.isEmpty(str) && (a = aVar.a(str, aVar.b)) != null && a.length > 0) {
                iArr = a.length == 1 ? new int[]{a[0], 0} : a;
            }
            if (iArr == null || iArr.length < 2) {
                return;
            }
            a(iArr[0], iArr[1]);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final boolean c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a8971a59822141d189ae8154c44dd65", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a8971a59822141d189ae8154c44dd65")).booleanValue();
        }
        GoodsPoiCategory b = this.d.b(goodsPoiCategory);
        return (b == null || c.d(b)) ? false : true;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca4f1d59c33f6e0a7141e77742f15a02", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca4f1d59c33f6e0a7141e77742f15a02")).booleanValue() : (this.d.b(goodsPoiCategory, goodsPoiCategory2) == null && this.d.a(goodsPoiCategory) == null) ? false : true;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final boolean d(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cda70883227b0d87d13ef12bc36cafb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cda70883227b0d87d13ef12bc36cafb")).booleanValue() : this.f.b(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final int a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce340feb94edbfe2773e90c0dac766fa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce340feb94edbfe2773e90c0dac766fa")).intValue() : this.f.c(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88b498bfb317e5cfeccb5805c772fc4a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88b498bfb317e5cfeccb5805c772fc4a")).booleanValue() : this.f.d(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final boolean c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f095d1de9fe7c5df54647c65cb9bfb0e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f095d1de9fe7c5df54647c65cb9bfb0e")).booleanValue() : this.f.e(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void a(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95cb327f765fc39d891f2d4f22bd473e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95cb327f765fc39d891f2d4f22bd473e");
        } else {
            this.f.a(j, j2, i);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public void a(final GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
        long j;
        Object[] objArr = {goodsSpu, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfbdba0991bcc29746568ff3a9d5bee4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfbdba0991bcc29746568ff3a9d5bee4");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.drug.base.net.b a = com.sankuai.waimai.store.drug.base.net.b.a(this.b.A());
            long g = this.j.g();
            String h = this.j.h();
            List<GoodsSku> list = goodsSpu.skus;
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de3456c942d83b01df27b20a7adef015", RobustBitConfig.DEFAULT_VALUE)) {
                j = ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de3456c942d83b01df27b20a7adef015")).longValue();
            } else {
                GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0);
                j = goodsSku != null ? goodsSku.id : 0L;
            }
            a.a(g, h, j, new com.sankuai.waimai.store.base.net.j<RecommendPair>() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.h.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "62faecf5ad44fa74b57c8a47c1f65d70", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "62faecf5ad44fa74b57c8a47c1f65d70");
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
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "224574d68ba453d7d8989ebcd299cd9b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "224574d68ba453d7d8989ebcd299cd9b");
                    } else if (recommendPair2 == null || goodsSpu.existCombo) {
                    } else {
                        goodsSpu.recommendPair = recommendPair2;
                        h.this.b.ba_();
                    }
                }
            });
        }
    }
}
