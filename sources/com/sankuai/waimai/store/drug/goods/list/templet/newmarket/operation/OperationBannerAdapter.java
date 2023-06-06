package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.operation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.helper.e;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h;
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
    private final h g;

    @Override // com.sankuai.waimai.store.view.banner.ImageBannerPagerAdapter
    public final /* synthetic */ void a(ImageView imageView, PoiOperationItem poiOperationItem, int i) {
        PoiOperationItem poiOperationItem2 = poiOperationItem;
        Object[] objArr = {imageView, poiOperationItem2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73cbb69669a9ccd647c5acaf29159552", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73cbb69669a9ccd647c5acaf29159552");
        } else if (poiOperationItem2 != null) {
            this.g.w().a(poiOperationItem2.bannerId, i);
            final String str = poiOperationItem2.scheme;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8f761274d262f6ac36e45ca52d47c24f", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8f761274d262f6ac36e45ca52d47c24f");
            } else if (!TextUtils.isEmpty(str)) {
                if (str.contains("supermarket")) {
                    if (str.contains("/supermarket/detail") || str.contains("/supermarket/spu/detail")) {
                        str = com.sankuai.waimai.store.drug.goods.list.constant.a.a(str);
                    }
                } else {
                    String[] split = str.split("/productset");
                    if (com.sankuai.shangou.stone.util.a.a(split) && split.length == 2) {
                        str = split[0] + "/supermarket/productset" + split[1];
                    } else {
                        str = (String) v.a(new v.a<String>() { // from class: com.sankuai.waimai.store.drug.goods.list.helper.e.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.util.v.a
                            public final /* synthetic */ String a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "63d2f9420ce5c5c645a8cd91a9df9afa", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "63d2f9420ce5c5c645a8cd91a9df9afa");
                                }
                                String[] split2 = str.split("/spu/detail");
                                if (com.sankuai.shangou.stone.util.a.a(split2) && split2.length == 2) {
                                    return com.sankuai.waimai.store.drug.goods.list.constant.a.a(split2[0] + "/supermarket/spu/detail" + split2[1]);
                                }
                                return str;
                            }

                            @Override // com.sankuai.waimai.store.util.v.a
                            public final /* synthetic */ String b() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6eb75fc2fceba16322a355ce366e2fa8", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6eb75fc2fceba16322a355ce366e2fa8");
                                }
                                String[] split2 = str.split("/detail");
                                if (com.sankuai.shangou.stone.util.a.a(split2) && split2.length == 2) {
                                    return com.sankuai.waimai.store.drug.goods.list.constant.a.a(split2[0] + "/supermarket/detail" + split2[1]);
                                }
                                return str;
                            }

                            @Override // com.sankuai.waimai.store.util.v.a
                            public final /* synthetic */ String c() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a47b81563245df1f05398cef0d025f7c", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a47b81563245df1f05398cef0d025f7c");
                                }
                                String[] split2 = str.split("/spu/detail");
                                if (com.sankuai.shangou.stone.util.a.a(split2) && split2.length == 2) {
                                    return com.sankuai.waimai.store.drug.goods.list.constant.a.a(split2[0] + "/supermarket/spu/detail" + split2[1]);
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

    public OperationBannerAdapter(Context context, List<PoiOperationItem> list, BannerPagerAdapter.a aVar, @NonNull h hVar) {
        super(context, list, aVar);
        Object[] objArr = {context, list, aVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b04d5cf4f5728dcc867792480063547", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b04d5cf4f5728dcc867792480063547");
        } else {
            this.g = hVar;
        }
    }

    @Override // com.sankuai.waimai.store.view.banner.ImageBannerPagerAdapter
    public final String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afa86184164a0dd43ef59b3dc9dd2cb4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afa86184164a0dd43ef59b3dc9dd2cb4");
        }
        PoiOperationItem c = c(i);
        return c != null ? c.picUrl : "";
    }

    @Override // com.sankuai.waimai.store.view.banner.ImageBannerPagerAdapter, com.sankuai.waimai.store.view.banner.BannerPagerAdapter
    public final View b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d84186131029032c54b128d5283c5ef9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d84186131029032c54b128d5283c5ef9");
        }
        View b = super.b(i);
        this.g.w().a(i, b);
        return b;
    }

    @Override // com.sankuai.waimai.store.view.banner.BannerPagerAdapter, android.support.v4.view.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc660479e038db879b58c1ca63faf72c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc660479e038db879b58c1ca63faf72c");
            return;
        }
        super.destroyItem(viewGroup, i, obj);
        if (obj instanceof View) {
            this.g.w().a((View) obj);
        }
    }
}
