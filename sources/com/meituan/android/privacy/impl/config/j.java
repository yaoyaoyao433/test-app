package com.meituan.android.privacy.impl.config;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.cipstorage.q;
import com.meituan.android.privacy.impl.c;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
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
public final class j implements c.b {
    public static ChangeQuickRedirect a;
    final Context b;
    final q c;
    Map<String, Long> d;
    Set<String> e;
    Set<String> f;
    public boolean g;
    final n h;
    private n i;

    public j(@NonNull Context context, @NonNull q qVar) {
        Object[] objArr = {context, qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ea717eee5bb865f3e15a3f29e2c36d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ea717eee5bb865f3e15a3f29e2c36d5");
            return;
        }
        this.g = true;
        this.b = context;
        this.c = qVar;
        this.h = new n(qVar);
    }

    @Override // com.meituan.android.privacy.impl.c.b
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7463855e2a8f639884c3ce2710c238c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7463855e2a8f639884c3ce2710c238c")).booleanValue() : Privacy.createPermissionGuard().a(this.b);
    }

    @Override // com.meituan.android.privacy.impl.c.b
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e506cf0f94a006e263fe77c6b2f35ed9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e506cf0f94a006e263fe77c6b2f35ed9")).booleanValue() : this.h.a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements c.a {
        public long a;
        public String b;
        public boolean c;
        public boolean d;

        @Override // com.meituan.android.privacy.impl.c.a
        public final long a() {
            return this.a;
        }

        @Override // com.meituan.android.privacy.impl.c.a
        public final String b() {
            return this.b;
        }

        @Override // com.meituan.android.privacy.impl.c.a
        public final boolean c() {
            return this.d;
        }
    }

    @Override // com.meituan.android.privacy.impl.c.b
    public final c.a a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85dbc89a83a23a2f251b134fa40ff65f", RobustBitConfig.DEFAULT_VALUE)) {
            return (c.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85dbc89a83a23a2f251b134fa40ff65f");
        }
        a a2 = this.h.a(str);
        if (a2 == null) {
            if (this.i != null) {
                a2 = this.i.a(str);
            }
            if (a2 == null) {
                a2 = new a();
            }
        }
        if (this.g) {
            g();
            a2.d = this.f.contains(str);
        } else {
            a2.d = true;
        }
        return a2;
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abad09d710647477adc3a34b6c3c8ae0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abad09d710647477adc3a34b6c3c8ae0") : this.c.b("netfilter_hash", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Long> a(Map<String, Long> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d64ca777087dbedf00829f88efabe078", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d64ca777087dbedf00829f88efabe078");
        }
        if (map == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(str.toLowerCase(), map.get(str));
        }
        return hashMap;
    }

    private Map<String, Long> c(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7997fe9a7e58cbed35107b0cfb31d56", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7997fe9a7e58cbed35107b0cfb31d56");
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, Long.valueOf(jSONObject.getLong(next)));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<String> a(JSONArray jSONArray) throws JSONException {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8009c3f7f6756b4a69e5d4cd2668af80", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8009c3f7f6756b4a69e5d4cd2668af80");
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    public final Map<String, Long> a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06f0f2f3440f23e9a4882016a07c0991", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06f0f2f3440f23e9a4882016a07c0991");
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                long parseLong = Long.parseLong(next);
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashMap.put(jSONArray.getString(i), Long.valueOf(parseLong));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Long> b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80ac2b58e8b985a1c3dc0a29a398a05b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80ac2b58e8b985a1c3dc0a29a398a05b");
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                long j = 0;
                for (int i = 0; i < jSONArray.length(); i++) {
                    j |= jSONArray.getLong(i);
                }
                hashMap.put(next, Long.valueOf(j));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return hashMap;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "181c6f5bdef1b2e7692a4e870f0646b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "181c6f5bdef1b2e7692a4e870f0646b5");
        } else if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    Set<String> b = this.c.b("netfilter_black", (Set<String>) null);
                    if (b == null) {
                        this.e = Collections.emptySet();
                    } else {
                        this.e = b;
                    }
                }
            }
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78422d4fb9b3f7d6fa624fa499718ab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78422d4fb9b3f7d6fa624fa499718ab1");
            return;
        }
        this.f = this.c.b("netfilter_doublecheck", Collections.emptySet());
        if (this.f == null) {
            this.f = Collections.emptySet();
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc06368260f963e12d8b2e4f8d75ff93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc06368260f963e12d8b2e4f8d75ff93");
        } else if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    f();
                }
            }
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edb44642b3acf748dbe29e94b8e71c58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edb44642b3acf748dbe29e94b8e71c58");
        } else if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fdaaa2dfe65c7502bd0398de635e424a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fdaaa2dfe65c7502bd0398de635e424a");
                    } else {
                        String b = this.c.b("netfilter_privacy_arg2type", (String) null);
                        if (b == null) {
                            this.d = Collections.emptyMap();
                        } else {
                            this.d = a(c(new JSONObject(b)));
                        }
                    }
                }
            }
        }
    }

    @Override // com.meituan.android.privacy.impl.c.b
    public final boolean b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee1b27a5224bc9f13504b1e6a16d3147", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee1b27a5224bc9f13504b1e6a16d3147")).booleanValue();
        }
        e();
        return this.e.contains(str);
    }

    @Override // com.meituan.android.privacy.impl.c.b
    public final Set<c.C0350c> a(@NonNull Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "042cb649dfc07c36dfee0b99db5bbc11", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "042cb649dfc07c36dfee0b99db5bbc11");
        }
        h();
        HashSet hashSet = null;
        Map<String, Long> map = this.d;
        for (String str : set) {
            String lowerCase = str.toLowerCase();
            if (map.containsKey(lowerCase)) {
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                c.C0350c c0350c = new c.C0350c();
                c0350c.c = map.get(lowerCase).longValue();
                c0350c.b = str;
                hashSet.add(c0350c);
            }
        }
        return hashSet == null ? Collections.emptySet() : hashSet;
    }

    @Override // com.meituan.android.privacy.impl.c.b
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8df1b6f881c9dcebc58f1172cb44bfc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8df1b6f881c9dcebc58f1172cb44bfc");
        }
        h();
        e();
        g();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hash", d());
            Map<String, Long> map = this.d;
            Object[] objArr2 = {map};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8d13c5892ee0021cd940738bf93243f", RobustBitConfig.DEFAULT_VALUE)) {
                map = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8d13c5892ee0021cd940738bf93243f");
            } else if (map == null) {
                map = Collections.emptyMap();
            }
            jSONObject.put("mPrivacyArg2PrivacyType", new JSONObject(map));
            jSONObject.put("mBlackList", new JSONArray((Collection) b(this.e)));
            jSONObject.put("mDoubleCheck", new JSONArray((Collection) b(this.f)));
            return jSONObject.toString(4);
        } catch (JSONException e) {
            e.printStackTrace();
            return "error";
        }
    }

    private Set<String> b(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b76098c7e7cba047625d21c03f03aae4", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b76098c7e7cba047625d21c03f03aae4") : set == null ? Collections.emptySet() : set;
    }
}
