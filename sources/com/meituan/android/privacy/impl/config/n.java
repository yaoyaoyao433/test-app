package com.meituan.android.privacy.impl.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v4.util.LruCache;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.q;
import com.meituan.android.privacy.impl.config.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n {
    public static ChangeQuickRedirect a;
    private static final com.meituan.android.privacy.impl.config.a b = new com.meituan.android.privacy.impl.config.a("UrlTree", 3);
    private final q c;
    @GuardedBy("this")
    private final LruCache<String, b> d;
    private final Gson e;
    private final ag<b> f;

    public n(@NonNull q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0a617580f372e04aa2072cdc78483b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0a617580f372e04aa2072cdc78483b0");
            return;
        }
        this.d = new LruCache<>(30);
        this.e = new Gson();
        this.f = new ag<b>() { // from class: com.meituan.android.privacy.impl.config.n.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cipstorage.ag
            public final /* synthetic */ String serializeAsString(b bVar) {
                b bVar2 = bVar;
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26d05754f94f8ea3dad3adc426af1201", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26d05754f94f8ea3dad3adc426af1201") : n.this.e.toJson(bVar2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meituan.android.cipstorage.ag
            /* renamed from: a */
            public b deserializeFromString(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2673a068915e58ea1822b97d7eac49f8", RobustBitConfig.DEFAULT_VALUE)) {
                    return (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2673a068915e58ea1822b97d7eac49f8");
                }
                try {
                    return (b) n.this.e.fromJson(str, (Class<Object>) b.class);
                } catch (JsonSyntaxException e) {
                    n.b.a(e);
                    return null;
                }
            }
        };
        this.c = qVar;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e14d99ea58658dc43756ee4b951f947", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e14d99ea58658dc43756ee4b951f947")).booleanValue() : this.c.b(DMKeys.KEY_IS_EMPTY, true);
    }

    @Nullable
    public final j.a a(@NonNull String str) {
        b bVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1753ed29b6e0808368f0efa6be4a5e7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (j.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1753ed29b6e0808368f0efa6be4a5e7c");
        }
        String[] b2 = b(str);
        String str2 = b2[0];
        synchronized (this) {
            bVar = this.d.get(str2);
        }
        if (bVar == null && (bVar = (b) this.c.a(str2, this.f)) != null) {
            synchronized (this) {
                this.d.put(str2, bVar);
            }
        }
        if (bVar == null) {
            return null;
        }
        return bVar.a(b2, 1);
    }

    @VisibleForTesting
    @NonNull
    private String[] b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24bbdfac9759ef51ad52e9c9c0697f4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24bbdfac9759ef51ad52e9c9c0697f4f");
        }
        String[] split = str.split("/");
        String str2 = split[0];
        if (str2.contains(CommonConstant.Symbol.COLON)) {
            split[0] = str2.substring(0, str2.indexOf(CommonConstant.Symbol.COLON));
        }
        return split;
    }

    public final Map<String, b> a(@NonNull Map<String, Long> map, @NonNull Map<String, Long> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "267613b3de3d6878ebc34dc2a5da8321", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "267613b3de3d6878ebc34dc2a5da8321");
        }
        HashMap hashMap = new HashMap();
        b(map, hashMap);
        b(map2, hashMap);
        for (b bVar : hashMap.values()) {
            bVar.a();
        }
        return hashMap;
    }

    public final void a(Context context, @NonNull String str, @NonNull Map<String, b> map) {
        Object[] objArr = {context, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f625e14c9180445b583482023036c8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f625e14c9180445b583482023036c8b");
            return;
        }
        l a2 = l.a(q.a(context, str, "UrlTree.lock").getAbsolutePath());
        try {
            a2.b();
            this.c.c();
            for (Map.Entry<String, b> entry : map.entrySet()) {
                this.c.a(entry.getKey(), (String) entry.getValue(), (ag<String>) this.f);
            }
            this.c.a(DMKeys.KEY_IS_EMPTY, false);
        } catch (Throwable th) {
            try {
                b.a(th);
            } finally {
                a2.c();
            }
        }
    }

    private void b(@NonNull Map<String, Long> map, @NonNull Map<String, b> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b21ba7c5396e48fe1e05c572222b86c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b21ba7c5396e48fe1e05c572222b86c");
            return;
        }
        for (String str : map.keySet()) {
            String[] b2 = b(str);
            b bVar = map2.get(b2[0]);
            if (bVar == null) {
                bVar = new b();
                map2.put(b2[0], bVar);
            }
            long longValue = map.get(str).longValue();
            Object[] objArr2 = {str, b2, new Long(longValue)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "0382e9c979358aef8fd826808f849226", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "0382e9c979358aef8fd826808f849226");
            } else {
                bVar.a(str, b2, longValue, 1);
            }
        }
    }

    /* compiled from: ProGuard */
    @VisibleForTesting
    /* loaded from: classes3.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        private Map<String, b> b;
        private int c;
        private List<a> d;
        private long e;
        private String f;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd580694273bac80cdf1dba9ab9a815c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd580694273bac80cdf1dba9ab9a815c");
                return;
            }
            this.b = Collections.emptyMap();
            this.c = 1;
            this.d = Collections.emptyList();
        }

        @Nullable
        public final j.a a(@NonNull String[] strArr, int i) {
            j.a a2;
            Object[] objArr = {strArr, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b2bf2e921eb4a271b1d78d4418be98a", RobustBitConfig.DEFAULT_VALUE)) {
                return (j.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b2bf2e921eb4a271b1d78d4418be98a");
            }
            if (i > strArr.length) {
                return null;
            }
            if (i == strArr.length) {
                if (this.e != 0) {
                    j.a aVar = new j.a();
                    aVar.a = this.e;
                    aVar.b = this.f;
                    aVar.c = true;
                    return aVar;
                }
                return null;
            }
            if (this.c + i <= strArr.length) {
                StringBuilder sb = new StringBuilder();
                int i2 = i;
                for (int i3 = 0; i3 < this.c; i3++) {
                    sb.append(strArr[i2]);
                    sb.append("/");
                    i2++;
                }
                if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                b bVar = this.b.get(sb.toString());
                if (bVar != null && (a2 = bVar.a(strArr, i2)) != null) {
                    return a2;
                }
            }
            for (a aVar2 : this.d) {
                j.a a3 = aVar2.a(strArr, i);
                if (a3 != null) {
                    return a3;
                }
            }
            return null;
        }

        void a(@NonNull String str, @NonNull String[] strArr, long j, int i) {
            b bVar = this;
            int i2 = i;
            while (true) {
                Object[] objArr = {str, strArr, new Long(j), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "08717cbb8707161bd77d6045f3edad40", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "08717cbb8707161bd77d6045f3edad40");
                    return;
                } else if (i2 == strArr.length) {
                    bVar.f = str;
                    bVar.e = j;
                    return;
                } else {
                    String str2 = strArr[i2];
                    if (str2.contains("*")) {
                        a aVar = new a();
                        aVar.a(str2, strArr, i2 + 1);
                        aVar.b = j;
                        aVar.c = str;
                        if (bVar.d.isEmpty()) {
                            bVar.d = new LinkedList();
                        }
                        bVar.d.add(aVar);
                        return;
                    }
                    if (bVar.b.isEmpty()) {
                        bVar.b = new HashMap(1);
                    }
                    b bVar2 = bVar.b.get(str2);
                    if (bVar2 == null) {
                        bVar2 = new b();
                        bVar.b.put(str2, bVar2);
                    }
                    bVar = bVar2;
                    i2++;
                }
            }
        }

        @SuppressLint({"LoopDetector"})
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09ada1d3d1cee95f9b5f3c302a98a029", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09ada1d3d1cee95f9b5f3c302a98a029");
            } else if (this.e == 0 && this.b.size() == 1 && this.d.isEmpty()) {
                String next = this.b.keySet().iterator().next();
                b next2 = this.b.values().iterator().next();
                next2.a();
                if (next2.b.isEmpty()) {
                    return;
                }
                this.b.clear();
                for (String str : next2.b.keySet()) {
                    this.b.put(next + "/" + str, next2.b.get(str));
                }
                this.c += next2.c;
                this.d = next2.d;
                this.e = next2.e;
                this.f = next2.f;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        long b;
        String c;
        private String d;
        private String e;
        private String[] f;

        public final void a(@NonNull String str, @NonNull String[] strArr, int i) {
            Object[] objArr = {str, strArr, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "107e90f77bafe6035cd0acecb0387d30", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "107e90f77bafe6035cd0acecb0387d30");
                return;
            }
            int indexOf = str.indexOf("*");
            this.d = str.substring(0, indexOf);
            this.e = str.substring(indexOf + 1);
            this.f = new String[strArr.length - i];
            if (this.f.length >= 0) {
                System.arraycopy(strArr, i, this.f, 0, this.f.length);
            }
        }

        public final j.a a(@NonNull String[] strArr, int i) {
            Object[] objArr = {strArr, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e660a7338d45a0d521435297d256c57", RobustBitConfig.DEFAULT_VALUE)) {
                return (j.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e660a7338d45a0d521435297d256c57");
            }
            if (this.f.length + i > strArr.length) {
                return null;
            }
            int length = strArr.length - 1;
            for (int length2 = this.f.length - 1; length >= i && length2 >= 0; length2--) {
                if (!strArr[length].equals(this.f[length2])) {
                    return null;
                }
                length--;
            }
            StringBuilder sb = new StringBuilder();
            while (i < strArr.length - this.f.length) {
                sb.append(strArr[i]);
                sb.append('/');
                i++;
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            String sb2 = sb.toString();
            if (sb2.startsWith(this.d) && sb2.endsWith(this.e)) {
                j.a aVar = new j.a();
                aVar.a = this.b;
                aVar.b = this.c;
                aVar.c = false;
                return aVar;
            }
            return null;
        }
    }
}
