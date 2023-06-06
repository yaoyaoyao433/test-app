package com.sankuai.waimai.restaurant.shopcart.config;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static HashMap<String, a> b = new HashMap<>();

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public long d;
        public long e;

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16966cb9c440076ef554ceb059c2bd3d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16966cb9c440076ef554ceb059c2bd3d")).booleanValue();
            }
            long b = com.meituan.android.time.c.b();
            return this.d <= b && b <= this.e;
        }
    }

    public static a a(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bca444387e07e781a94dd4fbfe9221f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bca444387e07e781a94dd4fbfe9221f7");
        }
        a aVar = b.get(str);
        if (aVar == null) {
            String b2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "start_config", "");
            if (TextUtils.isEmpty(b2)) {
                return null;
            }
            try {
                JsonArray asJsonArray = new JsonParser().parse(b2).getAsJsonArray();
                Gson gson = new Gson();
                for (int i = 0; i < asJsonArray.size(); i++) {
                    a aVar2 = (a) gson.fromJson(asJsonArray.get(i), (Class<Object>) a.class);
                    b.put(aVar2.b, aVar2);
                    if (TextUtils.equals(str, aVar2.b)) {
                        return aVar2;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return aVar;
    }
}
