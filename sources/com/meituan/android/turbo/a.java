package com.meituan.android.turbo;

import android.os.Build;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.android.turbo.converter.c;
import com.meituan.android.turbo.converter.d;
import com.meituan.android.turbo.converter.e;
import com.meituan.android.turbo.converter.f;
import com.meituan.android.turbo.converter.g;
import com.meituan.android.turbo.converter.h;
import com.meituan.android.turbo.converter.i;
import com.meituan.android.turbo.converter.j;
import com.meituan.android.turbo.converter.k;
import com.meituan.android.turbo.converter.l;
import com.meituan.android.turbo.converter.m;
import com.meituan.android.turbo.converter.n;
import com.meituan.android.turbo.converter.o;
import com.meituan.android.turbo.converter.p;
import com.meituan.android.turbo.converter.q;
import com.meituan.android.turbo.converter.r;
import com.meituan.android.turbo.converter.s;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.abtestv2.mode.ABTestStrategyBean;
import com.sankuai.meituan.ipredownload.ResEntity;
import com.sankuai.meituan.model.dao.City;
import com.sankuai.meituan.model.dao.City_TurboTool;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Map<Class, f> b;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        b = concurrentHashMap;
        concurrentHashMap.put(Boolean.TYPE, com.meituan.android.turbo.converter.b.b);
        b.put(Boolean.class, com.meituan.android.turbo.converter.b.b);
        b.put(Byte.TYPE, c.b);
        b.put(Byte.class, c.b);
        b.put(Short.TYPE, n.b);
        b.put(Short.class, n.b);
        b.put(Integer.TYPE, j.b);
        b.put(Integer.class, j.b);
        b.put(Long.TYPE, l.b);
        b.put(Long.class, l.b);
        b.put(Float.TYPE, i.b);
        b.put(Float.class, i.b);
        b.put(Double.TYPE, g.b);
        b.put(Double.class, g.b);
        b.put(Character.TYPE, d.b);
        b.put(Character.class, d.b);
        b.put(String.class, s.b);
        b.put(SparseArray.class, o.b);
        b.put(SparseIntArray.class, q.b);
        b.put(SparseBooleanArray.class, p.b);
        b.put(JsonElement.class, k.b);
        b.put(JsonObject.class, k.b);
        b.put(JsonArray.class, k.b);
        b.put(JsonPrimitive.class, k.b);
        if (Build.VERSION.SDK_INT > 17) {
            b.put(SparseLongArray.class, r.b);
        }
        Map<Class, f> map = b;
        map.put(VersionInfo.DiffInfo.class, com.meituan.android.uptodate.model.a.b);
        map.put(ABTestStrategyBean.class, com.sankuai.meituan.abtestv2.mode.c.b);
        map.put(ResEntity.class, com.sankuai.meituan.ipredownload.a.b);
        map.put(City.class, City_TurboTool.INSTANCE);
        map.put(com.sankuai.meituan.abtestv2.mode.a.class, com.sankuai.meituan.abtestv2.mode.b.b);
        map.put(VersionInfo.PeakPeriod.class, com.meituan.android.uptodate.model.b.b);
        map.put(ABStrategy.class, com.sankuai.waimai.foundation.core.service.abtest.a.b);
        map.put(VersionInfo.class, com.meituan.android.uptodate.model.c.b);
    }

    public static <T> String a(T t) throws com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8364b246be801ff178a0e07d5545a64d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8364b246be801ff178a0e07d5545a64d");
        }
        try {
            StringWriter stringWriter = new StringWriter();
            a((Class) t.getClass()).a((f) t, new JsonWriter(Streams.writerForAppendable(stringWriter)));
            return stringWriter.toString();
        } catch (Exception e) {
            throw new com.meituan.android.turbo.exceptions.a(e);
        }
    }

    public static <T> T a(Type type, String str) throws com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "714737ad903e08ef32e9cc23192fb002", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "714737ad903e08ef32e9cc23192fb002");
        }
        try {
            return (T) a(type).a(type, new JsonReader(new StringReader(str)));
        } catch (Exception e) {
            throw new com.meituan.android.turbo.exceptions.a(e);
        }
    }

    public static f a(Type type) throws com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cdbc810bc6d108d4415dd72748add33d", 6917529027641081856L) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cdbc810bc6d108d4415dd72748add33d") : a(b.a(type));
    }

    public static f a(Class cls) throws com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac019a4a459284b526caf423a3616923", 6917529027641081856L)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac019a4a459284b526caf423a3616923");
        }
        f fVar = b.get(cls);
        if (fVar != null) {
            return fVar;
        }
        if (cls.isArray()) {
            b.put(cls, com.meituan.android.turbo.converter.a.b);
            return com.meituan.android.turbo.converter.a.b;
        } else if (Map.class.isAssignableFrom(cls)) {
            b.put(cls, m.b);
            return m.b;
        } else if (Collection.class.isAssignableFrom(cls)) {
            b.put(cls, e.b);
            return e.b;
        } else if (Enum.class.isAssignableFrom(cls)) {
            b.put(cls, h.b);
            return h.b;
        } else {
            f fVar2 = (f) Class.forName(cls.getName() + "_TurboTool").newInstance();
            b.put(cls, fVar2);
            return fVar2;
        }
    }
}
