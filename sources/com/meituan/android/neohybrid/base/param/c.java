package com.meituan.android.neohybrid.base.param;

import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c extends b {
    public static ChangeQuickRedirect a;
    public final Map<Object, Map<String, Object>> b;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1daff281c4c8f07dd7131f355a7c5ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1daff281c4c8f07dd7131f355a7c5ee");
        } else {
            this.b = new WeakHashMap();
        }
    }

    public final synchronized Map<String, Object> a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "295f0008d4f747fff012306120720b43", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "295f0008d4f747fff012306120720b43");
        }
        Map<String, Object> map = this.b.get(obj);
        if (map == null) {
            return new HashMap();
        }
        return new HashMap(map);
    }

    public final synchronized Map<String, Object> b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b2d42dd9692b298e23c0d6ab50c0dce", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b2d42dd9692b298e23c0d6ab50c0dce");
        }
        HashMap hashMap = new HashMap(this.d);
        Map<String, Object> map = this.b.get(obj);
        if (!i.a(map)) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public final synchronized Map<String, Object> a(Object obj, Collection<String> collection) {
        Object[] objArr = {obj, collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88f2f4ed764aea6b872a3ac067ebcbdd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88f2f4ed764aea6b872a3ac067ebcbdd");
        }
        HashMap hashMap = new HashMap(16);
        if (i.a(collection)) {
            return hashMap;
        }
        Map<String, Object> map = this.b.get(obj);
        boolean z = !i.a(map);
        for (String str : collection) {
            Object obj2 = z ? map.get(str) : null;
            if (obj2 == null) {
                obj2 = this.d.get(str);
            }
            if (obj2 != null) {
                hashMap.put(str, obj2);
            }
        }
        return hashMap;
    }

    public final synchronized Object a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e12df31a60b9ca9933d49e02e2cf4645", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e12df31a60b9ca9933d49e02e2cf4645");
        }
        Map<String, Object> map = this.b.get(obj);
        Object obj2 = !i.a(map) ? map.get(str) : null;
        if (obj2 == null) {
            obj2 = this.d.get(str);
        }
        return obj2;
    }

    public synchronized void a(Object obj, Map<String, ?> map) {
        Object[] objArr = {obj, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "779f6b227a1154a58150bae3afb0417b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "779f6b227a1154a58150bae3afb0417b");
            return;
        }
        if (obj != null && !i.a(map)) {
            Map<String, Object> map2 = this.b.get(obj);
            if (map2 != null) {
                map2.putAll(map);
            } else {
                this.b.put(obj, new HashMap(map));
            }
        }
    }

    public synchronized void a(Object obj, String str, Object obj2) {
        Object[] objArr = {obj, str, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36c8340a62472de8955e929ce0fca788", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36c8340a62472de8955e929ce0fca788");
        } else if (obj == null || str == null || obj2 == null) {
        } else {
            Map<String, Object> map = this.b.get(obj);
            if (map == null) {
                map = new HashMap<>();
                this.b.put(obj, map);
            }
            map.putAll(com.meituan.android.neohybrid.neo.report.a.c(str, obj2).b);
        }
    }
}
