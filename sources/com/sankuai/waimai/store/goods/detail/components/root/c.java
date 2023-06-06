package com.sankuai.waimai.store.goods.detail.components.root;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.goods.list.viewblocks.strollaround.PoiCommonMachListItem;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.platform.shop.model.LiveInfo;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.repository.model.GoodsDetailResponse;
import com.sankuai.waimai.store.repository.model.ProductFreeInfo;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    public GoodsSpu d;
    public GoodsSku e;
    public BaseTile.LayoutInfo f;

    private c(int i, String str, BaseTile.LayoutInfo layoutInfo) {
        Object[] objArr = {Integer.valueOf(i), str, layoutInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b4f1e1523dbaea5b900f001d85b505b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b4f1e1523dbaea5b900f001d85b505b");
            return;
        }
        this.b = i;
        this.c = str;
        this.f = layoutInfo;
    }

    private c(int i, String str, GoodsSpu goodsSpu, GoodsSku goodsSku, BaseTile.LayoutInfo layoutInfo) {
        Object[] objArr = {Integer.valueOf(i), str, goodsSpu, goodsSku, layoutInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "939bdd77cc9bf3bcf19b255048714921", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "939bdd77cc9bf3bcf19b255048714921");
            return;
        }
        this.b = i;
        this.c = str;
        this.d = goodsSpu;
        this.e = goodsSku;
        this.f = layoutInfo;
    }

    private c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "307ea0767888c543262d4026569c438d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "307ea0767888c543262d4026569c438d");
        } else {
            this.b = i;
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5bb79c745ce744df517f3ebcf290415", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5bb79c745ce744df517f3ebcf290415");
        }
        if (this.d == null || com.sankuai.shangou.stone.util.a.b(this.d.getSkuList())) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (GoodsSku goodsSku : this.d.getSkuList()) {
            if (goodsSku != null) {
                arrayList.add(String.valueOf(goodsSku.getSkuId()));
            }
        }
        return t.a(arrayList, CommonConstant.Symbol.COMMA);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.detail.components.root.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1175c extends c {
        public static ChangeQuickRedirect g;
        public com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.d h;
        public float i;
        public int j;
        @NonNull
        public GoodsDetailResponse k;
        public ProductFreeInfo l;
        public GoodDetailResponse.SpuPraiseInfo m;
        public LiveInfo n;

        public C1175c(String str, GoodsSku goodsSku, com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.d dVar, float f, @NonNull GoodsDetailResponse goodsDetailResponse, ProductFreeInfo productFreeInfo, GoodDetailResponse.SpuPraiseInfo spuPraiseInfo, LiveInfo liveInfo, BaseTile.LayoutInfo layoutInfo) {
            super(str, goodsDetailResponse.mGoodsSpu, goodsSku, layoutInfo);
            Object[] objArr = {str, goodsSku, dVar, Float.valueOf(f), goodsDetailResponse, productFreeInfo, spuPraiseInfo, liveInfo, layoutInfo};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc35e3624abdd0a8257c3edcf26087b4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc35e3624abdd0a8257c3edcf26087b4");
                return;
            }
            this.h = dVar;
            this.i = f;
            this.k = goodsDetailResponse;
            this.l = productFreeInfo;
            this.m = spuPraiseInfo;
            this.n = liveInfo;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends c {
        public com.sankuai.waimai.store.goods.detail.components.subroot.mach.d g;

        public a(@NonNull String str, String str2, BaseTile.LayoutInfo layoutInfo, BaseModuleDesc baseModuleDesc, com.sankuai.waimai.mach.recycler.b bVar) {
            super(str2, layoutInfo);
            this.g = new com.sankuai.waimai.store.goods.detail.components.subroot.mach.d("supermarket", "sm_goodsdetail_mach", str, str2, baseModuleDesc, bVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends c {
        public PoiCommonMachListItem g;
        public boolean h;

        public b(PoiCommonMachListItem poiCommonMachListItem) {
            super(7);
            this.g = poiCommonMachListItem;
            this.h = false;
        }

        public b(PoiCommonMachListItem poiCommonMachListItem, boolean z) {
            super(8);
            this.g = poiCommonMachListItem;
            this.h = true;
        }
    }
}
