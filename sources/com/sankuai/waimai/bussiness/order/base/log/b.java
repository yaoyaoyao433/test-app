package com.sankuai.waimai.bussiness.order.base.log;

import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b b;
    private boolean c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc0bd08cb499c35b2f42e3cdad7e50da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc0bd08cb499c35b2f42e3cdad7e50da");
        } else {
            this.c = false;
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4a26eee713b303de811a68f304b050d", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4a26eee713b303de811a68f304b050d");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fd6aa8cd05651083a143cb9a7ed9084", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fd6aa8cd05651083a143cb9a7ed9084");
        } else {
            this.c = "from_sc_restaurant".equals(str);
        }
    }

    public final void a(String str, String str2, Object obj) {
        String json;
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e358b284d20cc465888c1aefd2e08b92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e358b284d20cc465888c1aefd2e08b92");
        } else if (this.c) {
            if (obj == null) {
                json = "";
            } else {
                try {
                    json = com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(obj);
                } catch (Exception unused) {
                    return;
                }
            }
            a(str, str2, json);
        }
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fe061e7f71da98ca13f7920c2594ea6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fe061e7f71da98ca13f7920c2594ea6");
        } else if (this.c) {
            try {
                i.d(new c().a(str).d(str3).c(str2).b());
            } catch (Exception unused) {
            }
        }
    }

    public static String a(long j, String str, String str2) {
        Object[] objArr = {new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff6ed1834706fd16af681e02935861db", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff6ed1834706fd16af681e02935861db");
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("poiId", Long.valueOf(j));
            hashMap.put("poiIdStr", str);
            hashMap.put("description", str2);
            return com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(hashMap);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(List<WmOrderedFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9c14982e169b70829ce88a18796b2f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9c14982e169b70829ce88a18796b2f2");
        }
        try {
            HashMap hashMap = new HashMap();
            if (com.sankuai.waimai.foundation.utils.b.a(list)) {
                hashMap.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, Integer.valueOf(com.sankuai.waimai.foundation.utils.b.c(list)));
                ArrayList arrayList = new ArrayList();
                hashMap.put("goodList", arrayList);
                for (WmOrderedFood wmOrderedFood : list) {
                    if (wmOrderedFood != null) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("cartId", Integer.valueOf(wmOrderedFood.getCartId()));
                        hashMap2.put("spuId", Long.valueOf(wmOrderedFood.getSpuId()));
                        hashMap2.put("skuId", Long.valueOf(wmOrderedFood.getSkuId()));
                        hashMap2.put("count", Integer.valueOf(wmOrderedFood.getCount()));
                        arrayList.add(hashMap2);
                    }
                }
            }
            return com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(hashMap);
        } catch (Exception unused) {
            return "";
        }
    }
}
