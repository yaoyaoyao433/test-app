package com.sankuai.waimai.platform.restaurant.cdn;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a e;
    public int b;
    public int c;
    public int d;
    private int f;
    private int g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0df11e081a3d04321b0d44d7e4566a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0df11e081a3d04321b0d44d7e4566a8");
            return;
        }
        this.f = a("global_cart_goods_list_pic", g.a(com.meituan.android.singleton.b.a, 75.0f));
        this.b = a("restaurant_goods_list_pic", g.a(com.meituan.android.singleton.b.a, 95.0f));
        this.c = a("goods_detail_header_pic", g.a(com.meituan.android.singleton.b.a));
        this.d = a("recommend_package_list_pic", TbsListener.ErrorCode.UNZIP_IO_ERROR);
        this.g = a("goods_feed_pic", (g.a(com.meituan.android.singleton.b.a) - g.a(com.meituan.android.singleton.b.a, 40.0f)) / 2);
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09fca205827148b508d0d8f582a85a45", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09fca205827148b508d0d8f582a85a45");
        }
        if (e == null) {
            e = new a();
        }
        return e;
    }

    private int a(String str, int i) {
        b bVar;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecb4894708131480026a1819da1ed394", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecb4894708131480026a1819da1ed394")).intValue();
        }
        JsonObject jsonObject = (JsonObject) com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, str, (Class<Object>) JsonObject.class);
        return (jsonObject == null || (bVar = (b) new Gson().fromJson(jsonObject.toString(), (Class<Object>) b.class)) == null || !bVar.a) ? i : bVar.b;
    }
}
