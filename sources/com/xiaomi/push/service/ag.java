package com.xiaomi.push.service;

import android.content.Context;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes6.dex */
public final class ag {
    private static ag a;
    private ConcurrentHashMap<String, HashMap<String, b>> b = new ConcurrentHashMap<>();
    private List<a> c = new ArrayList();

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes6.dex */
    public enum c {
        unbind,
        binding,
        binded
    }

    private ag() {
    }

    public static synchronized ag a() {
        ag agVar;
        synchronized (ag.class) {
            if (a == null) {
                a = new ag();
            }
            agVar = a;
        }
        return agVar;
    }

    private static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("@");
        return indexOf > 0 ? str.substring(0, indexOf) : str;
    }

    public final synchronized void a(Context context) {
        for (HashMap<String, b> hashMap : this.b.values()) {
            for (b bVar : hashMap.values()) {
                bVar.a(c.unbind, 1, 3, null, null);
            }
        }
    }

    public final synchronized void a(Context context, int i) {
        for (HashMap<String, b> hashMap : this.b.values()) {
            for (b bVar : hashMap.values()) {
                bVar.a(c.unbind, 2, i, null, null);
            }
        }
    }

    public final synchronized void a(a aVar) {
        this.c.add(aVar);
    }

    public final synchronized void a(b bVar) {
        HashMap<String, b> hashMap = this.b.get(bVar.h);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.b.put(bVar.h, hashMap);
        }
        hashMap.put(d(bVar.b), bVar);
        com.xiaomi.channel.commonutils.logger.c.a("add active client. " + bVar.a);
        for (a aVar : this.c) {
            aVar.a();
        }
    }

    public final synchronized void a(String str) {
        HashMap<String, b> hashMap = this.b.get(str);
        if (hashMap != null) {
            for (b bVar : hashMap.values()) {
                bVar.a();
            }
            hashMap.clear();
            this.b.remove(str);
        }
        for (a aVar : this.c) {
            aVar.a();
        }
    }

    public final synchronized void a(String str, String str2) {
        HashMap<String, b> hashMap = this.b.get(str);
        if (hashMap != null) {
            b bVar = hashMap.get(d(str2));
            if (bVar != null) {
                bVar.a();
            }
            hashMap.remove(d(str2));
            if (hashMap.isEmpty()) {
                this.b.remove(str);
            }
        }
        for (a aVar : this.c) {
            aVar.a();
        }
    }

    public final synchronized b b(String str, String str2) {
        HashMap<String, b> hashMap = this.b.get(str);
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(d(str2));
    }

    public final synchronized ArrayList<b> b() {
        ArrayList<b> arrayList;
        arrayList = new ArrayList<>();
        for (HashMap<String, b> hashMap : this.b.values()) {
            arrayList.addAll(hashMap.values());
        }
        return arrayList;
    }

    public final synchronized List<String> b(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (HashMap<String, b> hashMap : this.b.values()) {
            for (b bVar : hashMap.values()) {
                if (str.equals(bVar.a)) {
                    arrayList.add(bVar.h);
                }
            }
        }
        return arrayList;
    }

    public final synchronized int c() {
        return this.b.size();
    }

    public final synchronized Collection<b> c(String str) {
        if (this.b.containsKey(str)) {
            return ((HashMap) this.b.get(str).clone()).values();
        }
        return new ArrayList();
    }

    public final synchronized void d() {
        Iterator<b> it = b().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.b.clear();
    }

    public final synchronized void e() {
        this.c.clear();
    }

    /* loaded from: classes6.dex */
    public static class b {
        public String a;
        public String b;
        public String c;
        public String d;
        public boolean e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public ce k;
        public Context l;
        XMPushService p;
        Messenger r;
        c m = c.unbind;
        int n = 0;
        public List<a> o = new ArrayList();
        c q = null;
        boolean s = false;
        XMPushService.c t = new XMPushService.c(this);
        IBinder.DeathRecipient u = null;
        final C1519b v = new C1519b();

        /* loaded from: classes6.dex */
        public interface a {
            void a(c cVar, c cVar2, int i);
        }

        public b() {
        }

        public b(XMPushService xMPushService) {
            this.p = xMPushService;
            a(new ah(this));
        }

        private static String a(int i) {
            switch (i) {
                case 1:
                    return "OPEN";
                case 2:
                    return "CLOSE";
                case 3:
                    return "KICK";
                default:
                    return "unknown";
            }
        }

        public static String a(String str) {
            int lastIndexOf;
            return (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf("/")) == -1) ? "" : str.substring(lastIndexOf + 1);
        }

        private boolean a(int i, int i2, String str) {
            switch (i) {
                case 1:
                    return (this.m == c.binded || !this.p.b() || i2 == 21 || (i2 == 7 && "wait".equals(str))) ? false : true;
                case 2:
                    return this.p.b();
                case 3:
                    return !"wait".equals(str);
                default:
                    return false;
            }
        }

        final void a() {
            try {
                Messenger messenger = this.r;
                if (messenger != null && this.u != null) {
                    messenger.getBinder().unlinkToDeath(this.u, 0);
                }
            } catch (Exception unused) {
            }
            this.q = null;
        }

        void a(int i, int i2, String str, String str2) {
            this.q = this.m;
            if (i == 2) {
                ce.a(this.l, this, i2);
            } else if (i == 3) {
                ce.a(this.l, this, str2, str);
            } else if (i == 1) {
                boolean z = this.m == c.binded;
                if (!z && "wait".equals(str2)) {
                    this.n++;
                } else if (z) {
                    this.n = 0;
                    if (this.r != null) {
                        try {
                            this.r.send(Message.obtain(null, 16, this.p.e));
                        } catch (RemoteException unused) {
                        }
                    }
                }
                this.k.a(this.p, this, z, i2, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(Messenger messenger) {
            a();
            try {
                if (messenger == null) {
                    com.xiaomi.channel.commonutils.logger.c.b("peer linked with old sdk chid = " + this.h);
                    return;
                }
                this.r = messenger;
                this.s = true;
                this.u = new c(this, messenger);
                messenger.getBinder().linkToDeath(this.u, 0);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.b("peer linkToDeath err: " + e.getMessage());
                this.r = null;
                this.s = false;
            }
        }

        public final void a(a aVar) {
            synchronized (this.o) {
                this.o.add(aVar);
            }
        }

        public final void a(c cVar, int i, int i2, String str, String str2) {
            synchronized (this.o) {
                for (a aVar : this.o) {
                    aVar.a(this.m, cVar, i2);
                }
            }
            int i3 = 0;
            if (this.m != cVar) {
                com.xiaomi.channel.commonutils.logger.c.a(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", this.m, cVar, a(i), ak.a(i2), str, str2, this.h));
                this.m = cVar;
            }
            if (this.k == null) {
                com.xiaomi.channel.commonutils.logger.c.d("status changed while the client dispatcher is missing");
            } else if (cVar != c.binding) {
                if (this.q != null && this.s) {
                    i3 = (this.r == null || !this.s) ? 10100 : 1000;
                }
                this.p.a(this.v);
                if (a(i, i2, str2)) {
                    a(i, i2, str, str2);
                } else {
                    this.p.a(this.v.a(i, i2, str, str2), i3);
                }
            }
        }

        /* loaded from: classes6.dex */
        public class c implements IBinder.DeathRecipient {
            final b a;
            final Messenger b;

            c(b bVar, Messenger messenger) {
                this.a = bVar;
                this.b = messenger;
            }

            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                com.xiaomi.channel.commonutils.logger.c.b("peer died, chid = " + this.a.h);
                b.this.p.a(new ai(this, 0), 0L);
                if ("9".equals(this.a.h) && "com.xiaomi.xmsf".equals(b.this.p.getPackageName())) {
                    b.this.p.a(new aj(this, 0), LocationStrategy.LOCATION_TIMEOUT);
                }
            }
        }

        /* renamed from: com.xiaomi.push.service.ag$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public class C1519b extends XMPushService.j {
            int a;
            int b;
            String c;
            String d;

            public C1519b() {
                super(0);
            }

            public final XMPushService.j a(int i, int i2, String str, String str2) {
                this.a = i;
                this.b = i2;
                this.d = str2;
                this.c = str;
                return this;
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            public final String b() {
                return "notify job";
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
            @Override // com.xiaomi.push.service.XMPushService.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a() {
                /*
                    r5 = this;
                    com.xiaomi.push.service.ag$b r0 = com.xiaomi.push.service.ag.b.this
                    int r1 = r5.a
                    int r1 = r5.b
                    java.lang.String r1 = r5.d
                    com.xiaomi.push.service.ag$c r1 = r0.q
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L51
                    boolean r1 = r0.s
                    if (r1 != 0) goto L13
                    goto L51
                L13:
                    com.xiaomi.push.service.ag$c r1 = r0.q
                    com.xiaomi.push.service.ag$c r4 = r0.m
                    if (r1 != r4) goto L2d
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r3 = " status recovered, don't notify client:"
                    r1.<init>(r3)
                L20:
                    java.lang.String r0 = r0.h
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    com.xiaomi.channel.commonutils.logger.c.b(r0)
                    goto L52
                L2d:
                    android.os.Messenger r1 = r0.r
                    if (r1 == 0) goto L49
                    boolean r1 = r0.s
                    if (r1 == 0) goto L49
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Peer alive notify status to client:"
                    r1.<init>(r2)
                    java.lang.String r0 = r0.h
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    com.xiaomi.channel.commonutils.logger.c.b(r0)
                    goto L51
                L49:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r3 = "peer died, ignore notify "
                    r1.<init>(r3)
                    goto L20
                L51:
                    r2 = 1
                L52:
                    if (r2 == 0) goto L62
                    com.xiaomi.push.service.ag$b r0 = com.xiaomi.push.service.ag.b.this
                    int r1 = r5.a
                    int r2 = r5.b
                    java.lang.String r3 = r5.c
                    java.lang.String r4 = r5.d
                    r0.a(r1, r2, r3, r4)
                    return
                L62:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = " ignore notify client :"
                    r0.<init>(r1)
                    com.xiaomi.push.service.ag$b r1 = com.xiaomi.push.service.ag.b.this
                    java.lang.String r1 = r1.h
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    com.xiaomi.channel.commonutils.logger.c.b(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ag.b.C1519b.a():void");
            }
        }
    }
}
