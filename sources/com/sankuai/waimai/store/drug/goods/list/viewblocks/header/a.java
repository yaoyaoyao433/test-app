package com.sankuai.waimai.store.drug.goods.list.viewblocks.header;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.drug.goods.list.base.e;
import com.sankuai.waimai.store.drug.goods.list.controller.i;
import com.sankuai.waimai.store.drug.util.d;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends e implements com.sankuai.waimai.store.drug.goods.list.base.b, PrioritySmoothNestedScrollView.a {
    public static ChangeQuickRedirect d;
    private c c;
    protected com.sankuai.waimai.store.platform.domain.manager.poi.a e;
    public final i f;
    public View g;
    public ViewGroup h;

    public abstract void a(View view);

    public void a(@NonNull Poi poi, List<BaseModuleDesc> list) {
    }

    public void a(String str) {
    }

    @LayoutRes
    public abstract int c();

    @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public void c_(int i) {
    }

    public a(@NonNull com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddb1e5647ff97255da21c8945b51d725", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddb1e5647ff97255da21c8945b51d725");
            return;
        }
        this.f = a(cVar);
        this.e = cVar.d();
    }

    public i a(@NonNull com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0fd0d139938e58663fad27fa16f8f59", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0fd0d139938e58663fad27fa16f8f59") : new i(cVar);
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbd570401f060eee7790622da88acc5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbd570401f060eee7790622da88acc5d");
        }
        View inflate = layoutInflater.inflate(c(), viewGroup, false);
        a(inflate);
        this.c = new c(this.a.k(), this.a.b());
        c cVar = this.c;
        Object[] objArr2 = {inflate};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "a07bb5d12acb50cbe023ce67d8186c07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "a07bb5d12acb50cbe023ce67d8186c07");
        } else {
            cVar.b = (ImageView) inflate.findViewById(R.id.img_poi_blurred_bg);
            cVar.c = (ImageView) inflate.findViewById(R.id.shop_background_image);
        }
        return inflate;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e5c66ea49446d40f2cc350b43271013", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e5c66ea49446d40f2cc350b43271013");
        } else {
            this.f.createAndReplaceView(this.h);
        }
    }

    public final void a(ViewGroup viewGroup, View view) {
        this.h = viewGroup;
        this.g = view;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9da25536871daef07b1d8ba7874d7be5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9da25536871daef07b1d8ba7874d7be5");
        } else {
            this.f.onDestroy();
        }
    }

    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6096267de92793cc5dde0fdd9a525cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6096267de92793cc5dde0fdd9a525cf");
            return;
        }
        Poi poi = restMenuResponse.getPoi();
        if (poi == null) {
            return;
        }
        a(poi, restMenuResponse.moduleList);
        a(restMenuResponse.newPoiPage);
        this.c.a(poi);
        d();
        this.f.a(restMenuResponse);
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b80ef7616b6229564824c14abae6fcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b80ef7616b6229564824c14abae6fcd");
        } else if (this.e.c()) {
            d.a(this.mContext, this.e.g(), this.e.h(), 101, this.e.b, 0, this.a.n());
        }
    }

    public final void a(@NonNull Poi poi, BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {poi, baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1357da73a9c9ca6774b6d22ca937ab66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1357da73a9c9ca6774b6d22ca937ab66");
        } else if (baseModuleDesc.jsonData != null) {
            baseModuleDesc.jsonData.put("name_tag", poi.nameTag);
            baseModuleDesc.jsonData.put("pic_url", poi.picUrl);
            baseModuleDesc.jsonData.put("poi_type_icon", poi.poiTypeIcon);
            baseModuleDesc.jsonData.put("name", poi.name);
            baseModuleDesc.jsonData.put("score", Double.valueOf(poi.score));
            baseModuleDesc.jsonData.put("poi_id", Long.valueOf(this.e.g()));
            baseModuleDesc.jsonData.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.e.h());
            baseModuleDesc.jsonData.put("comment_number", Long.valueOf(poi.commentNumber));
            if (poi.containerTemplate != null) {
                baseModuleDesc.jsonData.put("container_template", (Map) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(poi.containerTemplate), new TypeToken<Map<String, Object>>() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a.1
                }.getType()));
            }
            if (poi.brandStory != null) {
                baseModuleDesc.jsonData.put("brand_story", (Map) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(poi.brandStory), new TypeToken<Map<String, Object>>() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a.2
                }.getType()));
            }
            if (poi.poiDetailStoryInfo != null) {
                baseModuleDesc.jsonData.put("story_info", (Map) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(poi.poiDetailStoryInfo), new TypeToken<Map<String, Object>>() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a.3
                }.getType()));
            }
            if (poi.getNewPoiLabels() != null) {
                baseModuleDesc.jsonData.put("poi_label_new", (Map) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(poi.getNewPoiLabels()), new TypeToken<Map<String, Object>>() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a.4
                }.getType()));
            }
        }
    }
}
