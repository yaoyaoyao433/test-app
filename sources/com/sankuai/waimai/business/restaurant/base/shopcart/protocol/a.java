package com.sankuai.waimai.business.restaurant.base.shopcart.protocol;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.shopcart.e;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.b;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(final Activity activity, final String str, final List<GoodsSpuAttrs> list, final e eVar) {
        Object[] objArr = {activity, str, list, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1dbc28f3709e8476c26465ad64c6eef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1dbc28f3709e8476c26465ad64c6eef");
        } else if (b.b(list)) {
        } else {
            Runnable runnable = new Runnable() { // from class: com.sankuai.waimai.business.restaurant.base.shopcart.protocol.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6dfd28506fcb09129b4be69027ef1a4b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6dfd28506fcb09129b4be69027ef1a4b");
                    } else if (list.size() == 1) {
                        try {
                            GoodsSpu goodsSpu = ((GoodsSpuAttrs) list.get(0)).spu;
                            GoodsAttr[] attrsArray = ((GoodsSpuAttrs) list.get(0)).getAttrsArray();
                            k.a().a(activity, str, goodsSpu, ((GoodsSpuAttrs) list.get(0)).sku, attrsArray, eVar);
                        } catch (Exception e) {
                            if (TextUtils.isEmpty(e.getMessage())) {
                                return;
                            }
                            ae.a(activity, e.getMessage());
                        }
                    } else {
                        for (GoodsSpuAttrs goodsSpuAttrs : list) {
                            try {
                                GoodsSpu goodsSpu2 = goodsSpuAttrs.spu;
                                GoodsAttr[] attrsArray2 = goodsSpuAttrs.getAttrsArray();
                                int i = goodsSpuAttrs.count;
                                k.a().a(activity, str, goodsSpu2, goodsSpuAttrs.sku, attrsArray2, i);
                            } catch (com.sankuai.waimai.platform.domain.manager.exceptions.a e2) {
                                if (!TextUtils.isEmpty(e2.getMessage())) {
                                    ae.a(activity, e2.getMessage());
                                }
                            }
                        }
                        k.a().b(str, eVar);
                    }
                }
            };
            if (ad.b()) {
                runnable.run();
            } else {
                ad.c(runnable);
            }
        }
    }

    public static void a(final String str, final GoodsSpuAttrs goodsSpuAttrs, final e eVar) {
        Object[] objArr = {str, goodsSpuAttrs, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db8e8d9450f7422daf786c435abf2426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db8e8d9450f7422daf786c435abf2426");
        } else if (goodsSpuAttrs == null || goodsSpuAttrs.spu == null || goodsSpuAttrs.skuId == 0) {
        } else {
            Runnable runnable = new Runnable() { // from class: com.sankuai.waimai.business.restaurant.base.shopcart.protocol.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "502c121b80c2f7227c823d51b82357fd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "502c121b80c2f7227c823d51b82357fd");
                        return;
                    }
                    GoodsSpu goodsSpu = GoodsSpuAttrs.this.spu;
                    GoodsAttr[] attrsArray = GoodsSpuAttrs.this.getAttrsArray();
                    GoodsSku goodsSku = GoodsSpuAttrs.this.sku;
                    if (goodsSpu.getSkuList() == null || goodsSpu.getSkuList().size() <= 0) {
                        return;
                    }
                    k.a().a(str, goodsSpu, goodsSku, attrsArray, eVar);
                }
            };
            if (ad.b()) {
                runnable.run();
            } else {
                ad.c(runnable);
            }
        }
    }
}
