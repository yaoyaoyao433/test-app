package com.sankuai.waimai.store.goods.list.viewblocks.header;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.PoiOperationItem;
import com.sankuai.waimai.store.view.banner.BannerPagerAdapter;
import com.sankuai.waimai.store.view.banner.ImageBannerPagerAdapter;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class GoodsListScrollViewPagerAdapter extends ImageBannerPagerAdapter<PoiOperationItem> {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a g;

    @Override // com.sankuai.waimai.store.view.banner.ImageBannerPagerAdapter
    public final /* synthetic */ void a(ImageView imageView, PoiOperationItem poiOperationItem, int i) {
        PoiOperationItem poiOperationItem2 = poiOperationItem;
        Object[] objArr = {imageView, poiOperationItem2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e72e04d2adafd8b6d38f8d9041f7547d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e72e04d2adafd8b6d38f8d9041f7547d");
        } else if (poiOperationItem2 != null) {
            HashMap hashMap = new HashMap();
            if (this.g != null && this.g.c()) {
                hashMap.put("index", Integer.valueOf(i));
                hashMap.put("poi_id", this.g.d());
                hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.g.v()));
                com.sankuai.waimai.store.manager.judas.b.a(this.d, "b_wpDVN").a(this.d).b(hashMap).a("banner_id", Long.valueOf(poiOperationItem2.bannerId)).a("activity_type", "").a("index", Integer.valueOf(i)).a();
            }
            com.sankuai.waimai.store.router.d.a(this.d, com.sankuai.waimai.store.goods.list.constant.a.a(poiOperationItem2.scheme));
        }
    }

    public GoodsListScrollViewPagerAdapter(Context context, List<PoiOperationItem> list, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, BannerPagerAdapter.a aVar2) {
        super(context, list, aVar2);
        Object[] objArr = {context, list, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07b5f359bcde9b69a81468d2818b4b60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07b5f359bcde9b69a81468d2818b4b60");
        } else {
            this.g = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.view.banner.ImageBannerPagerAdapter
    public final String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e4db87c59263b5ef370cf647aa9f2a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e4db87c59263b5ef370cf647aa9f2a5");
        }
        PoiOperationItem c = c(i);
        return c != null ? c.picUrl : "";
    }

    @Override // com.sankuai.waimai.store.view.banner.ImageBannerPagerAdapter, com.sankuai.waimai.store.view.banner.BannerPagerAdapter
    public final View b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a36a586ded73d2435dfc562f2a1fbb62", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a36a586ded73d2435dfc562f2a1fbb62");
        }
        View b = super.b(i);
        if (b != null && (this.d instanceof com.sankuai.waimai.store.expose.v2.a)) {
            com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_rqzXO", b, String.valueOf(i));
            PoiOperationItem c = c(i);
            bVar.a("poi_id", this.g.d()).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.g.v())).a("banner_id", Long.valueOf(c == null ? 0L : c.bannerId)).a("activity_type", "").a("index", Integer.valueOf(i));
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.d, bVar);
        }
        return b;
    }
}
