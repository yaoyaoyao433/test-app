package com.dianping.agentsdk.framework;

import android.support.annotation.NonNull;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class aa<H> {
    public static ChangeQuickRedirect a;
    protected String b;
    protected a<H> c;
    protected ConcurrentHashMap<String, CopyOnWriteArrayList<H>> d;
    protected ConcurrentHashMap<String, Pair<String, H>> e;
    protected int f;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a<HA> {
        Object a(String str, Object obj, HA ha);
    }

    public aa(@NonNull String str, a<H> aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fb35de9d2878eff65e119d294f0b8d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fb35de9d2878eff65e119d294f0b8d1");
            return;
        }
        this.f = 0;
        this.d = new ConcurrentHashMap<>();
        this.e = new ConcurrentHashMap<>();
        this.b = str;
        this.c = aVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa30097df7f728f3cdcfeb250c5c3fd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa30097df7f728f3cdcfeb250c5c3fd5");
            return;
        }
        if (this.d != null) {
            this.d.clear();
        }
        if (this.e != null) {
            this.e.clear();
        }
        this.f = 0;
    }

    public final String a(@NonNull String str, @NonNull H h) {
        String sb;
        Object[] objArr = {str, h};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8b4badb977dd2342179d64aacfcf991", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8b4badb977dd2342179d64aacfcf991");
        }
        if (this.d == null) {
            this.d = new ConcurrentHashMap<>();
        }
        if (this.e == null) {
            this.e = new ConcurrentHashMap<>();
        }
        CopyOnWriteArrayList<H> copyOnWriteArrayList = this.d.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.d.put(str, copyOnWriteArrayList);
        }
        if (!copyOnWriteArrayList.contains(h)) {
            copyOnWriteArrayList.add(h);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "181bffa13795aaf64298eab36637de43", RobustBitConfig.DEFAULT_VALUE)) {
                sb = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "181bffa13795aaf64298eab36637de43");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.b == null ? "" : this.b);
                sb2.append(this.f);
                sb = sb2.toString();
                this.f++;
            }
            String str2 = sb;
            this.e.put(str2, new Pair<>(str, h));
            return str2;
        }
        Pair pair = new Pair(str, h);
        for (Map.Entry<String, Pair<String, H>> entry : this.e.entrySet()) {
            if (pair.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public final void a(@NonNull String str) {
        Pair<String, H> pair;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0244d7afabbfe70c7da0cdfbe4469d0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0244d7afabbfe70c7da0cdfbe4469d0e");
        } else if (this.e == null || this.e.isEmpty() || (pair = this.e.get(str)) == null || pair.first == null || pair.second == null) {
        } else {
            b(pair.first, pair.second);
        }
    }

    public final void b(@NonNull String str, @NonNull H h) {
        CopyOnWriteArrayList<H> copyOnWriteArrayList;
        Object[] objArr = {str, h};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc882a2cc5dc01a0c969fad0d7fcea6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc882a2cc5dc01a0c969fad0d7fcea6");
        } else if (this.d == null || this.d.isEmpty() || (copyOnWriteArrayList = this.d.get(str)) == null || copyOnWriteArrayList.isEmpty() || !copyOnWriteArrayList.contains(h)) {
        } else {
            copyOnWriteArrayList.remove(h);
            d(str, h);
        }
    }

    public final void a(@NonNull H h) {
        Object[] objArr = {h};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daccdf2e24991bef2c0e43e2cd649651", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daccdf2e24991bef2c0e43e2cd649651");
        } else if (this.d != null && !this.d.isEmpty()) {
            for (Map.Entry<String, CopyOnWriteArrayList<H>> entry : this.d.entrySet()) {
                CopyOnWriteArrayList<H> value = entry.getValue();
                if (value != null && !value.isEmpty() && value.contains(h)) {
                    value.remove(h);
                    d(entry.getKey(), h);
                }
            }
        }
    }

    private void d(@NonNull String str, @NonNull H h) {
        Object[] objArr = {str, h};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c14888e63ad3bbf73c08c1aebd75de4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c14888e63ad3bbf73c08c1aebd75de4e");
        } else if (this.e == null || this.e.isEmpty()) {
        } else {
            String str2 = null;
            Pair pair = new Pair(str, h);
            Iterator<Map.Entry<String, Pair<String, H>>> it = this.e.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Pair<String, H>> next = it.next();
                if (pair.equals(next.getValue())) {
                    str2 = next.getKey();
                    break;
                }
            }
            this.e.remove(str2);
        }
    }

    public final ArrayList<Object> c(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "080143ac43891f7699facd63c3cbdc86", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "080143ac43891f7699facd63c3cbdc86");
        }
        ArrayList<Object> arrayList = new ArrayList<>();
        CopyOnWriteArrayList<H> copyOnWriteArrayList = this.d.get(str);
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<H> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                H next = it.next();
                if (next != null) {
                    Object a2 = this.c != null ? this.c.a(str, obj, next) : null;
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
        }
        return arrayList;
    }
}
