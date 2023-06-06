package com.sankuai.waimai.business.restaurant.base.repository;

import android.support.annotation.MainThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static final WeakHashMap<Object, a> b = new WeakHashMap<>();
    private static final WeakHashMap<Object, com.sankuai.waimai.business.restaurant.goodsdetail.network.a> c = new WeakHashMap<>();
    private static final Object d = new Object();
    private static final String e = b.class.getSimpleName();

    @MainThread
    public static a a(Object obj) {
        a aVar;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bed0a85bdbc652a802f8b19404fd4af1", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bed0a85bdbc652a802f8b19404fd4af1");
        }
        if (obj == null) {
            throw new RuntimeException("volley tag is null");
        }
        synchronized (d) {
            if (b.get(obj) == null) {
                b.put(obj, new a());
                String str = e;
                com.sankuai.waimai.foundation.utils.log.a.b(str, "create new mWMApiMangerCache cache  tag is " + obj.toString() + "mWMApiMangerCache size is " + b.size(), new Object[0]);
            }
            aVar = b.get(obj);
        }
        return aVar;
    }

    @MainThread
    public static com.sankuai.waimai.business.restaurant.goodsdetail.network.a b(Object obj) {
        com.sankuai.waimai.business.restaurant.goodsdetail.network.a aVar;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6826b2197d3a1c0719985c3066b146b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.restaurant.goodsdetail.network.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6826b2197d3a1c0719985c3066b146b0");
        }
        if (obj == null) {
            throw new RuntimeException("volley tag is null");
        }
        synchronized (d) {
            if (c.get(obj) == null) {
                c.put(obj, new com.sankuai.waimai.business.restaurant.goodsdetail.network.a());
                String str = e;
                com.sankuai.waimai.foundation.utils.log.a.b(str, "create new mWMApiMangerCache cache  tag is " + obj.toString() + "mWMApiMangerCache size is " + b.size(), new Object[0]);
            }
            aVar = c.get(obj);
        }
        return aVar;
    }

    public static void c(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d86c45ce0925448e7fd59c5c1e02ef3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d86c45ce0925448e7fd59c5c1e02ef3");
            return;
        }
        synchronized (d) {
            if (b.containsKey(obj)) {
                b.get(obj).a();
                b.remove(obj);
                String str = e;
                com.sankuai.waimai.foundation.utils.log.a.b(str, "remove cache from mRestApiMangerCache  tag is " + obj.toString() + "mRestApiMangerCache size is " + b.size(), new Object[0]);
            }
            if (c.containsKey(obj)) {
                c.get(obj).a();
                c.remove(obj);
                String str2 = e;
                com.sankuai.waimai.foundation.utils.log.a.b(str2, "remove cache from mGoodDetailApiMangerCache  tag is " + obj.toString() + "mGoodDetailApiMangerCache size is " + c.size(), new Object[0]);
            }
        }
    }
}
