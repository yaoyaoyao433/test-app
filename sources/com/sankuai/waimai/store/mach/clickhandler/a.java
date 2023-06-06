package com.sankuai.waimai.store.mach.clickhandler;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.mach.clickhandler.b, com.sankuai.waimai.mach.b
    public final boolean a(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
        boolean z;
        Object[] objArr = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19175155a3e644462130db4e392d4ba9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19175155a3e644462130db4e392d4ba9")).booleanValue();
        }
        Object[] objArr2 = {str, view, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc93beb941fdba75e9ebca749c5f9b22", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc93beb941fdba75e9ebca749c5f9b22")).booleanValue();
        } else {
            z = !TextUtils.isEmpty(str) && str.startsWith("click_add_dec_food");
        }
        if (z) {
            Object[] objArr3 = {str, view, aVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ee64736c06a1cb2cd8d082cfd7979972", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ee64736c06a1cb2cd8d082cfd7979972");
            } else {
                Uri parse = Uri.parse(str);
                try {
                    Activity activity = aVar.f.getActivity();
                    long parseLong = Long.parseLong(parse.getQueryParameter("poi_id"));
                    String queryParameter = parse.getQueryParameter(FoodDetailNetWorkPreLoader.URI_POI_STR);
                    String queryParameter2 = parse.getQueryParameter("good_spu");
                    GoodsSpu goodsSpu = new GoodsSpu();
                    goodsSpu.parseJson(new JSONObject(queryParameter2));
                    GoodsSku goodsSku = null;
                    String queryParameter3 = parse.getQueryParameter("good_sku");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        goodsSku = new GoodsSku();
                        goodsSku.parseJson(new JSONObject(queryParameter3));
                    }
                    com.meituan.android.bus.a.a().c(new C1218a(activity, view, parseLong, queryParameter, goodsSpu, goodsSku, Integer.parseInt(parse.getQueryParameter("count"))));
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
            return true;
        }
        return super.a(str, view, aVar);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.mach.clickhandler.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1218a {
        public static ChangeQuickRedirect a;
        public final Activity b;
        public final View c;
        public final long d;
        public final String e;
        public final GoodsSpu f;
        public final GoodsSku g;
        public final int h;

        public C1218a(Activity activity, View view, long j, String str, GoodsSpu goodsSpu, GoodsSku goodsSku, int i) {
            Object[] objArr = {activity, view, new Long(j), str, goodsSpu, goodsSku, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f528a68acaddc3941c79371197200cc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f528a68acaddc3941c79371197200cc");
                return;
            }
            this.b = activity;
            this.c = view;
            this.d = j;
            this.e = str;
            this.f = goodsSpu;
            this.g = goodsSku;
            this.h = i;
        }

        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "484345ce2d50523d991bacf07d5f40db", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "484345ce2d50523d991bacf07d5f40db") : com.sankuai.waimai.store.platform.domain.manager.poi.a.a(this.d, this.e);
        }
    }
}
