package com.meituan.android.privacy.impl.config;

import android.support.annotation.Nullable;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.metrics.common.Constants;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public f b;
    public Map<String, f> c;
    public String d;
    public String e;
    public long f;
    public Map<String, com.meituan.android.privacy.interfaces.config.a> g;
    private transient Map<String, Set<String>> h;
    private final transient Set<String> i;
    private final transient Set<String> j;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9ae38cf4bbf2edcc51f5056569feca0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9ae38cf4bbf2edcc51f5056569feca0");
            return;
        }
        this.g = Collections.emptyMap();
        this.h = Collections.emptyMap();
        this.i = new HashSet();
        this.j = new HashSet();
    }

    public final void a(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aacbb4b188d5404e816a20c1b8902834", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aacbb4b188d5404e816a20c1b8902834");
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        this.d = jSONObject.optString("hash");
        JSONObject optJSONObject = jSONObject.optJSONObject("hints");
        this.e = optJSONObject == null ? null : optJSONObject.toString();
        this.f = jSONObject.optLong("pollDuration", 1L);
        a(jSONObject.optJSONObject("features"));
        a(jSONObject.optJSONArray("notRegistered"));
        b(jSONObject);
        c(jSONObject.optJSONObject("appGuardPermission"));
    }

    public final e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da5c7686a1ed65764cf3eac65185f267", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da5c7686a1ed65764cf3eac65185f267");
        }
        e eVar = new e();
        eVar.i = this.b;
        if (this.i.isEmpty()) {
            eVar.h = Collections.emptyMap();
        } else {
            HashMap hashMap = new HashMap();
            for (String str : this.i) {
                f fVar = this.c.get(str);
                if (fVar != null) {
                    hashMap.put(str, fVar);
                }
            }
            eVar.h = hashMap;
        }
        eVar.j = this.j;
        eVar.m = this.c;
        eVar.g = this.f;
        eVar.l = this.e;
        eVar.f = this.d;
        eVar.k = this.g;
        return eVar;
    }

    public final void a(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdb78705f53e37e4ea941e5867b19d6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdb78705f53e37e4ea941e5867b19d6a");
        } else {
            this.i.addAll(set);
        }
    }

    public final void b(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67bcc971490ec741fe1cf32c386358b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67bcc971490ec741fe1cf32c386358b0");
        } else {
            this.j.addAll(set);
        }
    }

    private void a(@Nullable JSONArray jSONArray) throws JSONException {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86229e1697a982b1a80d37e96ac48060", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86229e1697a982b1a80d37e96ac48060");
        } else if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                this.j.add(jSONArray.getString(i));
            }
        }
    }

    private void a(@Nullable JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b32ee2fd6f2551e819402b3d3fbc690b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b32ee2fd6f2551e819402b3d3fbc690b");
        } else if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                HashSet hashSet = new HashSet();
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(jSONArray.getString(i));
                }
                hashMap.put(next, hashSet);
            }
            this.h = hashMap;
        }
    }

    private void b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4805fdf57c9744db36da96bb647f7c90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4805fdf57c9744db36da96bb647f7c90");
            return;
        }
        HashMap hashMap = new HashMap();
        f a2 = a(jSONObject, (f) null, true);
        JSONObject jSONObject2 = (JSONObject) a(jSONObject, ShieldMonitorKey.TAG_BUSINESS, new JSONObject());
        HashSet<String> hashSet = new HashSet(this.h.keySet());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            f a3 = a((JSONObject) a(jSONObject2, next, new JSONObject()), a2, false);
            a(next, a3, a2);
            if (a3.d) {
                this.i.add(next);
            }
            hashSet.remove(next);
            hashMap.put(next, a3);
        }
        for (String str : hashSet) {
            f fVar = new f();
            a(str, fVar, a2);
            if (fVar.d) {
                this.i.add(str);
            }
            hashMap.put(str, fVar);
        }
        a2.e = true;
        this.b = a2;
        this.c = hashMap;
    }

    private void a(String str, f fVar, f fVar2) {
        com.meituan.android.privacy.interfaces.config.c d;
        Object[] objArr = {str, fVar, fVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "033ba6c446332bd4ff6d8620d540afe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "033ba6c446332bd4ff6d8620d540afe1");
            return;
        }
        Set<String> set = this.h.get(str);
        if (set == null || set.isEmpty()) {
            return;
        }
        set.removeAll(fVar.b.keySet());
        if (set.isEmpty()) {
            return;
        }
        if (fVar.b.isEmpty()) {
            fVar.b = new HashMap();
        }
        for (String str2 : set) {
            com.meituan.android.privacy.interfaces.config.c cVar = fVar2.b.get(str2);
            if (cVar == null) {
                d = new com.meituan.android.privacy.interfaces.config.c();
            } else {
                d = cVar.d();
            }
            fVar.b.put(str2, d);
        }
    }

    private static f a(JSONObject jSONObject, f fVar, boolean z) {
        Object[] objArr = {jSONObject, fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8674d9e421949fd8a21ab3a283e4abea", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8674d9e421949fd8a21ab3a283e4abea");
        }
        String[] strArr = {"permission", "api"};
        ArrayList arrayList = new ArrayList(2);
        if (fVar != null) {
            arrayList.add(0, fVar.b);
            arrayList.add(1, fVar.c);
        } else {
            arrayList.add(0, null);
            arrayList.add(1, null);
        }
        ArrayList arrayList2 = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList2.add(i, a((JSONObject) a(jSONObject, strArr[i], new JSONObject()), (Map) arrayList.get(i)));
        }
        return new f((Map) arrayList2.get(0), (Map) arrayList2.get(1), jSONObject.optBoolean(PackageLoadReporter.Source.LAUNCH, false));
    }

    private static Map<String, com.meituan.android.privacy.interfaces.config.c> a(JSONObject jSONObject, Map<String, com.meituan.android.privacy.interfaces.config.c> map) {
        com.meituan.android.privacy.interfaces.config.c cVar;
        com.meituan.android.privacy.interfaces.config.c cVar2;
        Object[] objArr = {jSONObject, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ef51066c4223afb1be459ee3c3b21e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ef51066c4223afb1be459ee3c3b21e5");
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = (JSONObject) a(jSONObject, next, new JSONObject());
            com.meituan.android.privacy.interfaces.config.c cVar3 = map == null ? null : map.get(next);
            Object[] objArr2 = {jSONObject2, cVar3};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a44745765567942a64a6f28e6e24f8b1", RobustBitConfig.DEFAULT_VALUE)) {
                cVar2 = (com.meituan.android.privacy.interfaces.config.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a44745765567942a64a6f28e6e24f8b1");
            } else {
                if (cVar3 != null) {
                    cVar = cVar3.d();
                } else {
                    cVar = new com.meituan.android.privacy.interfaces.config.c();
                }
                cVar.b = ((Boolean) a(jSONObject2, "enable", Boolean.valueOf(cVar.b))).booleanValue();
                cVar.d = ((Boolean) a(jSONObject2, "enableOnBackground", Boolean.valueOf(cVar.d))).booleanValue();
                cVar.g = ((Boolean) a(jSONObject2, "needScenePermission", Boolean.valueOf(cVar.g))).booleanValue();
                cVar.h = (String) a(jSONObject2, "perceptionType", cVar.h);
                cVar.k = ((Integer) a(jSONObject2, "intervalShowAppAlert", Integer.valueOf(cVar.k))).intValue();
                cVar.e = ((Long) a(jSONObject2, Constants.LAG_THRESHOLD, Long.valueOf(cVar.e))).longValue();
                cVar.j = ((Boolean) a(jSONObject2, "onlyCache", Boolean.valueOf(cVar.j))).booleanValue();
                cVar.i = ((Boolean) a(jSONObject2, "enableFirstPass", Boolean.valueOf(cVar.i))).booleanValue();
                cVar.l = ((Boolean) a(jSONObject2, "mnCheckHijack", Boolean.valueOf(cVar.l))).booleanValue();
                cVar.f = ((Boolean) a(jSONObject2, "enableShowAppAlert", Boolean.valueOf(cVar.f))).booleanValue();
                cVar2 = cVar;
            }
            hashMap.put(next, cVar2);
        }
        return hashMap;
    }

    private void c(JSONObject jSONObject) {
        com.meituan.android.privacy.interfaces.config.a aVar;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5849dd62aa2013cef1cb55a6d16cc86d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5849dd62aa2013cef1cb55a6d16cc86d");
        } else if (jSONObject == null) {
        } else {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = (JSONObject) a(jSONObject, next, new JSONObject());
                Object[] objArr2 = {jSONObject2, null};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5bb49963ce7efe5125c22ce8bb92b25c", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (com.meituan.android.privacy.interfaces.config.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5bb49963ce7efe5125c22ce8bb92b25c");
                } else {
                    com.meituan.android.privacy.interfaces.config.a aVar2 = new com.meituan.android.privacy.interfaces.config.a();
                    aVar2.b = ((Boolean) a(jSONObject2, "enable", Boolean.valueOf(aVar2.b))).booleanValue();
                    aVar2.c = ((Integer) a(jSONObject2, "intervalShowAppAlert", Integer.valueOf(aVar2.c))).intValue();
                    aVar2.d = (String) a(jSONObject2, "permissionDesc", aVar2.d);
                    aVar2.e = (String) a(jSONObject2, "permissionUseDesc", aVar2.e);
                    aVar = aVar2;
                }
                hashMap.put(next, aVar);
            }
            this.g = hashMap;
        }
    }

    private static synchronized <T> T a(JSONObject jSONObject, String str, T t) {
        synchronized (c.class) {
            Object[] objArr = {jSONObject, str, t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b265bc785cb5655f5b3825e4bb802744", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b265bc785cb5655f5b3825e4bb802744");
            } else if (jSONObject == null) {
                return t;
            } else {
                if (t instanceof Boolean) {
                    return (T) Boolean.valueOf(jSONObject.optBoolean(str, ((Boolean) t).booleanValue()));
                } else if (t instanceof Integer) {
                    return (T) Integer.valueOf(jSONObject.optInt(str, ((Integer) t).intValue()));
                } else if (t instanceof Long) {
                    return (T) Long.valueOf(jSONObject.optLong(str, ((Long) t).longValue()));
                } else if (t instanceof Double) {
                    return (T) Double.valueOf(jSONObject.optDouble(str, ((Double) t).doubleValue()));
                } else if (t instanceof String) {
                    return (T) jSONObject.optString(str, (String) t);
                } else if (t instanceof JSONObject) {
                    T t2 = (T) jSONObject.optJSONObject(str);
                    return t2 == null ? t : t2;
                } else if (t instanceof JSONArray) {
                    T t3 = (T) jSONObject.optJSONArray(str);
                    return t3 == null ? t : t3;
                } else {
                    throw new IllegalStateException("key:" + str + " def:" + t);
                }
            }
        }
    }
}
