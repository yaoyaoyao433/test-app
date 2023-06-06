package com.sankuai.waimai.store.search.template.carouselcard;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.manager.judas.b;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.model.PicElement;
import com.sankuai.waimai.store.view.banner.BannerPagerAdapter;
import com.sankuai.waimai.store.view.banner.ImageBannerPagerAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CarouselCardBannerAdapter extends ImageBannerPagerAdapter<PicElement> {
    public static ChangeQuickRedirect a;
    private Map<String, Object> g;

    @Override // com.sankuai.waimai.store.view.banner.ImageBannerPagerAdapter
    public final /* synthetic */ void a(ImageView imageView, PicElement picElement, int i) {
        PicElement picElement2 = picElement;
        Object[] objArr = {imageView, picElement2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de1954a1dd9a7560ab636f3c9170c09a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de1954a1dd9a7560ab636f3c9170c09a");
        } else if (picElement2 == null || TextUtils.isEmpty(picElement2.scheme)) {
        } else {
            d.a(this.d, picElement2.scheme);
            b.a("c_nfqbfvw", "b_waimai_sg_rnjibpln_mc").b(this.g).a();
        }
    }

    public CarouselCardBannerAdapter(Context context, List<PicElement> list, BannerPagerAdapter.a aVar, Map<String, Object> map) {
        super(context, list, aVar);
        Object[] objArr = {context, list, aVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fe419dc03e19251d2472ca6f7df79ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fe419dc03e19251d2472ca6f7df79ca");
            return;
        }
        this.g = new HashMap();
        this.g = map;
    }

    @Override // com.sankuai.waimai.store.view.banner.ImageBannerPagerAdapter
    public final String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1de571a1e758aa0219ae881abc74ddb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1de571a1e758aa0219ae881abc74ddb");
        }
        PicElement c = c(i);
        return c != null ? c.pic : "";
    }

    @Override // com.sankuai.waimai.store.view.banner.ImageBannerPagerAdapter, com.sankuai.waimai.store.view.banner.BannerPagerAdapter
    public final View b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b00e3ad384a8d5565ead5bc2fed2783", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b00e3ad384a8d5565ead5bc2fed2783") : super.b(i);
    }
}
