package com.dianping.monitor.impl;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class m implements l {
    public static ChangeQuickRedirect a;
    private static String b;
    private static String c;
    private final String d;
    private final String e;
    private volatile String f;
    private final Map<String, String> g;
    private final Map<String, List<Float>> h;
    private final com.dianping.monitor.metric.e i;
    private String j;

    public m(int i, Context context) {
        this(i, context, "");
        Object[] objArr = {Integer.valueOf(i), context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6a7ea48a53e385b3b4ef356f49d2d7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6a7ea48a53e385b3b4ef356f49d2d7a");
        }
    }

    public m(int i, Context context, String str) {
        this(i, context, str, com.dianping.monitor.b.g() ? o.a(context) : n.a(context));
        Object[] objArr = {Integer.valueOf(i), context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a13d3a9b0404e36854e566fe95778c2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a13d3a9b0404e36854e566fe95778c2b");
        }
    }

    public m(int i, Context context, String str, com.dianping.monitor.metric.e eVar) {
        Object[] objArr = {Integer.valueOf(i), context, str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a14b7963a7fffd5ab8b98f9e4467813", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a14b7963a7fffd5ab8b98f9e4467813");
            return;
        }
        this.g = new ConcurrentHashMap();
        this.h = new ConcurrentHashMap();
        if (TextUtils.isEmpty(c)) {
            c = "1";
        }
        if (TextUtils.isEmpty(b)) {
            b = String.valueOf(com.dianping.monitor.h.a(context));
        }
        this.d = String.valueOf(i);
        str = TextUtils.isEmpty(str) ? a.getUnionId() : str;
        this.e = str == null ? "" : str;
        this.i = eVar;
    }

    @Override // com.dianping.monitor.impl.l
    public l a(String str, List<Float> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06d6ae1165f823dad1b943671ca48758", 6917529027641081856L)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06d6ae1165f823dad1b943671ca48758");
        }
        if (str == null || list == null) {
            return this;
        }
        int a2 = this.i.a(str);
        if ((a2 == -1 || new Random().nextInt(1000) < a2) && !"".equals(str)) {
            this.h.put(str, list);
        }
        return this;
    }

    @Override // com.dianping.monitor.impl.l
    public final l a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4b2a797639c4d5b4ca26f285a209c9d", 6917529027641081856L)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4b2a797639c4d5b4ca26f285a209c9d");
        }
        if (str != null && str2 != null && !"".equals(str)) {
            this.g.put(str, str2);
        }
        return this;
    }

    @Override // com.dianping.monitor.impl.l
    public final l a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b0479f15a2ff1d53f9421d76d86d177", 6917529027641081856L)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b0479f15a2ff1d53f9421d76d86d177");
        }
        if (!TextUtils.isEmpty(str)) {
            this.f = str;
        }
        return this;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7932f9bcc07f92a35314666dda539f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7932f9bcc07f92a35314666dda539f3");
            return;
        }
        this.h.clear();
        this.g.clear();
        this.f = "";
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0cee45457f17300512656d3136fc286", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0cee45457f17300512656d3136fc286");
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(b) && !TextUtils.isEmpty(c)) {
                if (this.h.isEmpty()) {
                    return;
                }
                com.dianping.monitor.metric.a aVar = new com.dianping.monitor.metric.a();
                aVar.b = this.d;
                aVar.c = this.e;
                aVar.d = new HashMap(this.g);
                aVar.e = new HashMap(this.h);
                aVar.g = System.currentTimeMillis() / 1000;
                aVar.f = this.f;
                aVar.h = this.j;
                this.i.a(aVar);
            }
        } finally {
            b();
        }
    }

    @Override // com.dianping.monitor.impl.l
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe02a3ee0e4f0a347c298afe254c9585", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe02a3ee0e4f0a347c298afe254c9585");
            return;
        }
        a("version", b);
        c();
    }

    public void b(String str) {
        this.j = str;
    }
}
