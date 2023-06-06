package com.sankuai.waimai.store.goods.list.templet.newmarket.operation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.helper.f;
import com.sankuai.waimai.store.goods.list.templet.newmarket.e;
import com.sankuai.waimai.store.platform.shop.model.PoiOperationItem;
import com.sankuai.waimai.store.util.v;
import com.sankuai.waimai.store.view.banner.BannerPagerAdapter;
import com.sankuai.waimai.store.view.banner.ImageBannerPagerAdapter;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class OperationBannerAdapter extends ImageBannerPagerAdapter<PoiOperationItem> {
    public static ChangeQuickRedirect a;
    @NonNull
    private final e g;

    @Override // com.sankuai.waimai.store.view.banner.ImageBannerPagerAdapter
    public final /* synthetic */ void a(ImageView imageView, PoiOperationItem poiOperationItem, int i) {
        PoiOperationItem poiOperationItem2 = poiOperationItem;
        Object[] objArr = {imageView, poiOperationItem2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63309fc840a5a6e44b6370a604b8fd76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63309fc840a5a6e44b6370a604b8fd76");
        } else if (poiOperationItem2 != null) {
            this.g.D().a(poiOperationItem2.bannerId, i);
            final String str = poiOperationItem2.scheme;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "91c1cdd880bba6d55a5f4a511ae90fe2", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "91c1cdd880bba6d55a5f4a511ae90fe2");
            } else if (!TextUtils.isEmpty(str)) {
                if (str.contains("supermarket")) {
                    if (str.contains("/supermarket/detail") || str.contains("/supermarket/spu/detail")) {
                        str = com.sankuai.waimai.store.goods.list.constant.a.a(str);
                    }
                } else {
                    String[] split = str.split("/productset");
                    if (com.sankuai.shangou.stone.util.a.a(split) && split.length == 2) {
                        str = split[0] + "/supermarket/productset" + split[1];
                    } else {
                        str = (String) v.a(new v.a<String>() { // from class: com.sankuai.waimai.store.goods.list.helper.f.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.util.v.a
                            public final /* synthetic */ String a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "18a1f71b2c3be57af3d7bd4600065eff", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "18a1f71b2c3be57af3d7bd4600065eff");
                                }
                                String[] split2 = str.split("/spu/detail");
                                if (com.sankuai.shangou.stone.util.a.a(split2) && split2.length == 2) {
                                    return com.sankuai.waimai.store.goods.list.constant.a.a(split2[0] + "/supermarket/spu/detail" + split2[1]);
                                }
                                return str;
                            }

                            @Override // com.sankuai.waimai.store.util.v.a
                            public final /* synthetic */ String b() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cde0201cc3ad4732a869a8f0bf9740d7", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cde0201cc3ad4732a869a8f0bf9740d7");
                                }
                                String[] split2 = str.split("/detail");
                                if (com.sankuai.shangou.stone.util.a.a(split2) && split2.length == 2) {
                                    return com.sankuai.waimai.store.goods.list.constant.a.a(split2[0] + "/supermarket/detail" + split2[1]);
                                }
                                return str;
                            }

                            @Override // com.sankuai.waimai.store.util.v.a
                            public final /* synthetic */ String c() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "792a67cfce28ab2b81c87afb0c788e85", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "792a67cfce28ab2b81c87afb0c788e85");
                                }
                                String[] split2 = str.split("/spu/detail");
                                if (com.sankuai.shangou.stone.util.a.a(split2) && split2.length == 2) {
                                    return com.sankuai.waimai.store.goods.list.constant.a.a(split2[0] + "/supermarket/spu/detail" + split2[1]);
                                }
                                return str;
                            }
                        });
                    }
                }
            }
            com.sankuai.waimai.store.router.d.a(this.d, str);
        }
    }

    public OperationBannerAdapter(Context context, List<PoiOperationItem> list, BannerPagerAdapter.a aVar, @NonNull e eVar) {
        super(context, list, aVar);
        Object[] objArr = {context, list, aVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7048df1d9a497b58a7fc0fd0f49755a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7048df1d9a497b58a7fc0fd0f49755a0");
        } else {
            this.g = eVar;
        }
    }

    @Override // com.sankuai.waimai.store.view.banner.ImageBannerPagerAdapter
    public final String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81de6a3c4ad57935e5ba90fe0c650c78", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81de6a3c4ad57935e5ba90fe0c650c78");
        }
        PoiOperationItem c = c(i);
        return c != null ? c.picUrl : "";
    }

    @Override // com.sankuai.waimai.store.view.banner.ImageBannerPagerAdapter, com.sankuai.waimai.store.view.banner.BannerPagerAdapter
    public final View b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f23c57022126c347a3fcdd4f9e40842", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f23c57022126c347a3fcdd4f9e40842");
        }
        View b = super.b(i);
        this.g.D().a(i, b);
        return b;
    }

    @Override // com.sankuai.waimai.store.view.banner.BannerPagerAdapter, android.support.v4.view.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaf1d053b880838dd5084546b5807168", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaf1d053b880838dd5084546b5807168");
            return;
        }
        super.destroyItem(viewGroup, i, obj);
        if (obj instanceof View) {
            this.g.D().a((View) obj);
        }
    }
}
