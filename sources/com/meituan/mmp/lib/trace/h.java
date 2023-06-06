package com.meituan.mmp.lib.trace;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.mmp.lib.api.report.MetricsModule;
import com.meituan.mmp.lib.engine.o;
import com.meituan.mmp.lib.trace.f;
import com.meituan.mmp.lib.utils.ac;
import com.meituan.mmp.lib.utils.am;
import com.meituan.mmp.lib.utils.v;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public d b;
    public ConcurrentHashMap<String, Object> c;
    ConcurrentHashMap<String, Long> d;
    ConcurrentHashMap<String, Integer> e;
    a f;
    public List<String> g;
    public volatile boolean h;
    Handler i;
    public long j;
    public long k;
    public g l;
    public final Queue<f> m;
    private ConcurrentHashMap<String, Object> n;
    private Stack<e> o;
    private LinkedList<String> p;
    private long q;

    public h(Context context, String str) {
        this(context, str, false, SystemClock.elapsedRealtime(), System.currentTimeMillis());
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17f8449f03a19a685bf4107fb16c7cd5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17f8449f03a19a685bf4107fb16c7cd5");
        }
    }

    private h(Context context, String str, boolean z, long j, long j2) {
        Object[] objArr = {context, str, (byte) 0, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9714cb8ebd39e4a169f15f30efe46d97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9714cb8ebd39e4a169f15f30efe46d97");
            return;
        }
        this.b = new d();
        this.c = new ConcurrentHashMap<>();
        this.n = new ConcurrentHashMap<>();
        this.d = new ConcurrentHashMap<>();
        this.e = new ConcurrentHashMap<>();
        this.f = new a();
        this.o = new Stack<>();
        this.p = new LinkedList<>();
        this.g = new CopyOnWriteArrayList();
        this.h = false;
        this.i = new Handler(Looper.getMainLooper());
        this.l = null;
        this.m = new ConcurrentLinkedQueue();
        this.q = j;
        this.j = j2;
        this.n.put("env", MMPEnvHelper.getEnvInfo().isProdEnv() ? "prod" : "test");
        this.n.put("mmp.id", str);
        this.n.put("group.id", UUID.randomUUID().toString());
        if (context != null) {
            this.n.put("networkType", am.a(context, ""));
        }
        this.n.put("sdkVersion", "0.4.231.7-wm");
        com.meituan.mmp.lib.mp.a e = com.meituan.mmp.lib.mp.a.e();
        this.n.put("process", e == null ? "" : e.b());
        this.n.put("mtWebViewEnable", Boolean.valueOf(com.meituan.mmp.lib.config.f.a(str)));
        if (o.e(str)) {
            a("mtPreloadStrategy", (Object) o.d(str));
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b0434c3c73caf3efb5654e491e54e63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b0434c3c73caf3efb5654e491e54e63");
        } else {
            this.m.clear();
        }
    }

    public final h a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cff2a7a6bf347ae60643310057fdaaf9", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cff2a7a6bf347ae60643310057fdaaf9");
        }
        this.q = j;
        return this;
    }

    public final h b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de40ca13d04f6bb93d2dd2aa78c41fb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de40ca13d04f6bb93d2dd2aa78c41fb3");
        }
        this.j = j;
        return this;
    }

    public final Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94d62cbf5d6476eb1730fb41d98b6555", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94d62cbf5d6476eb1730fb41d98b6555");
        }
        HashMap hashMap = new HashMap(this.n);
        hashMap.putAll(this.c);
        if (!hashMap.containsKey("chrome") && !TextUtils.isEmpty(com.meituan.mmp.lib.config.a.d)) {
            hashMap.put("chrome", com.meituan.mmp.lib.config.a.d);
        }
        if (!hashMap.containsKey("webViewType") && com.meituan.mmp.lib.config.a.c != null) {
            hashMap.put("webViewType", com.meituan.mmp.lib.config.a.c);
        }
        return hashMap;
    }

    Map<String, Object> a(@Nullable Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1472d4b44a12aaa0899cfd7a00c3a1e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1472d4b44a12aaa0899cfd7a00c3a1e6");
        }
        Map<String, Object> b = b();
        if (map != null) {
            b.putAll(map);
        }
        return b;
    }

    public final Map<String, Object> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91ce027f719d398106d16aa602d0c313", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91ce027f719d398106d16aa602d0c313") : new HashMap(this.c);
    }

    public final h a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3340e88e34f20dc4206eca460121e5c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3340e88e34f20dc4206eca460121e5c2");
        }
        if (obj != null) {
            this.c.put(str, obj);
        }
        return this;
    }

    public final h b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdd11b7d304295bcb48fb98ac6d52729", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdd11b7d304295bcb48fb98ac6d52729");
        }
        this.c.putAll(map);
        return this;
    }

    public final h a(Intent intent, boolean z) {
        Object[] objArr = {intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6464ed7083ae254621a232bc71fe092f", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6464ed7083ae254621a232bc71fe092f");
        }
        if (z && this.c.containsKey("launchData")) {
            return this;
        }
        String dataString = intent != null ? intent.getDataString() : null;
        if (dataString == null) {
            dataString = "empty";
        }
        String jSONObject = intent == null ? "empty" : ac.a(intent.getExtras()).toString();
        a("launchData", (Object) dataString);
        a("launchExtras", (Object) jSONObject);
        return this;
    }

    public final h a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdbf7847665e588380830749f124bb5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdbf7847665e588380830749f124bb5b");
        }
        com.sankuai.meituan.takeoutnew.util.aop.c.a(this, str);
        if (!this.d.containsKey(str)) {
            this.d.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        }
        return this;
    }

    public final h a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c4e55dff9ec8e2b6b5681c1885b44b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c4e55dff9ec8e2b6b5681c1885b44b5");
        }
        a(e(str, str2));
        return this;
    }

    public final h b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b417af1be8e7f0cdd314a2276eebed7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b417af1be8e7f0cdd314a2276eebed7b");
        }
        if (this.o.size() >= 20) {
            this.o.remove(0);
        }
        this.o.push(new e(str2, str));
        if (this.p.size() >= 10) {
            this.p.remove(0);
        }
        LinkedList<String> linkedList = this.p;
        linkedList.add("push id=" + str2 + ",path=" + str + "\\n");
        return this;
    }

    public final h c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5447397c952e682cac14a4fe9be2648", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5447397c952e682cac14a4fe9be2648");
        }
        a(this.o.search(new e(str2, str)));
        return this;
    }

    public final h d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7dbcc9a5565a6524b61f1b5c7994ea4", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7dbcc9a5565a6524b61f1b5c7994ea4");
        }
        a(this.o.search(new e(str2, str)) - 1);
        return this;
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79ba3ae376786b8e9e44d7a0ee0681fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79ba3ae376786b8e9e44d7a0ee0681fc");
            return;
        }
        for (int i2 = 1; i2 <= i; i2++) {
            e pop = this.o.pop();
            if (this.p.size() >= 10) {
                this.p.remove(0);
            }
            LinkedList<String> linkedList = this.p;
            linkedList.add("pop id=" + pop.c + ",path=" + pop.b + "\\n");
        }
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c64cc198f38286792895ed933ce2946b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c64cc198f38286792895ed933ce2946b");
        }
        StringBuilder sb = new StringBuilder();
        for (int size = this.o.size() - 1; size >= 0; size--) {
            e elementAt = this.o.elementAt(size);
            if (elementAt != null) {
                sb.append(f(elementAt.toString()));
            }
        }
        return sb.toString();
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cceb8a13d4e7e4bfe9768aa449e1fadb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cceb8a13d4e7e4bfe9768aa449e1fadb");
        }
        StringBuilder sb = new StringBuilder();
        for (int size = this.p.size() - 1; size >= 0; size--) {
            sb.append(f(this.p.get(size)));
        }
        return sb.toString();
    }

    private String f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e1eb9ccb0ddf19469649d770f8899c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e1eb9ccb0ddf19469649d770f8899c") : TextUtils.isEmpty(str) ? "" : str.length() > 128 ? str.substring(0, 128) : str;
    }

    public final h b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d823594ee05e9e9425d401c26b42c63e", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d823594ee05e9e9425d401c26b42c63e");
        }
        a(str, (String) null, (HashMap<String, Object>) null);
        return this;
    }

    public final h a(String str, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47741dfd6bd0261cb0a29bd24cd87ce6", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47741dfd6bd0261cb0a29bd24cd87ce6");
        }
        a(str, (String) null, hashMap);
        return this;
    }

    public final h a(String str, String str2, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, str2, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46a32b9ace54aba847ef02d2e757ed5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46a32b9ace54aba847ef02d2e757ed5d");
        }
        String e = e(str, str2);
        Long remove = this.d.remove(e);
        this.e.remove(e);
        if (remove != null && remove.longValue() > 0) {
            a(str, SystemClock.elapsedRealtime() - remove.longValue(), hashMap);
        }
        return this;
    }

    public final h a(String str, long j, Map<String, Object> map) {
        Object[] objArr = {str, new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b843b5d2bfc3312fc2ddca66aaf13b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b843b5d2bfc3312fc2ddca66aaf13b2");
        }
        b(str, j, map);
        this.m.add(new f.a(str, j));
        return this;
    }

    private void b(String str, long j, Map<String, Object> map) {
        Object[] objArr = {str, new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ce2527179029cabc9e0bd0f0a1473c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ce2527179029cabc9e0bd0f0a1473c6");
        } else {
            MetricsModule.a(str, j, a(map));
        }
    }

    public final h b(String str, @Nullable HashMap<String, Object> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "279f6a1fe8ddf4e4e1b71fc439e45a21", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "279f6a1fe8ddf4e4e1b71fc439e45a21");
        }
        if (this.k > 0) {
            b(str, SystemClock.elapsedRealtime() - this.k, hashMap);
        }
        return this;
    }

    public final h c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2cc962e151bc3ba541a489597298fa0", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2cc962e151bc3ba541a489597298fa0");
        }
        a(str, (Map<String, Object>) null);
        return this;
    }

    public final h a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a75213bea4b1e8e7017a8e4139bbf347", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a75213bea4b1e8e7017a8e4139bbf347");
        }
        com.sankuai.meituan.takeoutnew.util.aop.c.a(this, str, map);
        if (this.q > 0) {
            b(str, SystemClock.elapsedRealtime() - this.q, map);
            this.m.add(new f.b(str));
        }
        this.d.remove(str);
        this.e.remove(str);
        return this;
    }

    public final void c(String str, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62dc56567929e5ad7e0160ba4ad87054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62dc56567929e5ad7e0160ba4ad87054");
            return;
        }
        if (this.q > 0) {
            this.m.add(new f.b(str));
        }
        this.d.remove(str);
        this.e.remove(str);
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55d9945fe59503965659b7c3a375936b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55d9945fe59503965659b7c3a375936b");
            return;
        }
        Long remove = this.d.remove(str);
        this.e.remove(str);
        if (remove == null || remove.longValue() <= 0) {
            return;
        }
        this.m.add(new f.a(str, SystemClock.elapsedRealtime() - remove.longValue()));
    }

    public final void b(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b68f516955f07db648e5264acb505b56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b68f516955f07db648e5264acb505b56");
            return;
        }
        MetricsModule.a(str, a(map));
        this.m.add(new f.b(str));
    }

    public final void d(String str, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a30238e86250cfa56a92a545ae2e04c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a30238e86250cfa56a92a545ae2e04c");
        } else {
            b(str, (Map<String, Object>) a(hashMap, "success"));
        }
    }

    public final void e(String str, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "202e19b3032727d2473779f576b91585", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "202e19b3032727d2473779f576b91585");
        } else {
            b(str, (Map<String, Object>) a(hashMap, "fail"));
        }
    }

    public HashMap<String, Object> a(Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbaf168af0875d072071529b41c14f47", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbaf168af0875d072071529b41c14f47");
        }
        HashMap<String, Object> hashMap = new HashMap<>(map);
        hashMap.put("state", str);
        return hashMap;
    }

    private String e(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d12cd2666562b43e9da9fcee83224a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d12cd2666562b43e9da9fcee83224a");
        }
        if (str2 != null) {
            return str + "_extraKey:" + str2;
        }
        return str;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {h.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87d3052bd149e86b7f02b59ae37b30ad", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87d3052bd149e86b7f02b59ae37b30ad");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Long l;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd889ec9c1334850a9240a1e51454109", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd889ec9c1334850a9240a1e51454109");
            } else if (h.this.e.size() > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Iterator<Map.Entry<String, Integer>> it = h.this.e.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Integer> next = it.next();
                    if (next.getKey() != null && (l = h.this.d.get(next.getKey())) != null && l.longValue() > 0) {
                        if (elapsedRealtime - l.longValue() > next.getValue().intValue() * 1000) {
                            Map<String, Object> a2 = h.this.a(v.a("state", "timeout"));
                            String key = next.getKey();
                            int indexOf = next.getKey().indexOf("_extraKey:");
                            if (indexOf >= 0) {
                                key = next.getKey().substring(0, indexOf);
                                a2.put("extraKey", next.getKey().substring(indexOf + 10));
                            }
                            MetricsModule.a(key, elapsedRealtime - l.longValue(), a2);
                            MMPEnvHelper.getSniffer().a("MMPTimeout", "default", String.format("%s timeout %s seconds", key, Long.valueOf(elapsedRealtime - l.longValue())), a2.toString());
                        }
                    }
                    it.remove();
                }
                if (h.this.e.size() > 0) {
                    h.this.i.removeCallbacks(h.this.f);
                    h.this.i.postDelayed(h.this.f, 1000L);
                }
            }
        }
    }

    public final void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79f5fb8b120997f25c9cf94e4bf93138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79f5fb8b120997f25c9cf94e4bf93138");
        } else if (!this.h || this.g.size() >= 5) {
        } else {
            this.g.add(str);
        }
    }

    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5698319f8630d4ad21fb029ca2da916d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5698319f8630d4ad21fb029ca2da916d");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.g) {
            if (str != null) {
                sb.append(f(str) + "\\n");
            }
        }
        return sb.toString();
    }
}
