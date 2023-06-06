package com.sankuai.meituan.tte;

import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.tte.e;
import com.sankuai.meituan.tte.w;
import com.sankuai.meituan.tte.x;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class s implements m {
    public static ChangeQuickRedirect a;
    private static final b<a, s> g = new b<a, s>() { // from class: com.sankuai.meituan.tte.s.1
        public static ChangeQuickRedirect b;

        @Override // com.sankuai.meituan.tte.b
        public final /* synthetic */ s b(a aVar) {
            a aVar2 = aVar;
            Object[] objArr = {aVar2};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1804b4a2acc3585dd02b3b446dca4a57", RobustBitConfig.DEFAULT_VALUE)) {
                return (s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1804b4a2acc3585dd02b3b446dca4a57");
            }
            x.b bVar = aVar2.b;
            return new s(bVar, new r(bVar), t.a(x.a()));
        }
    };
    private static final List<l> l;
    final x.b b;
    final r c;
    final v d;
    volatile boolean e;
    volatile long f;
    private final t h;
    private final l i;
    private final List<l> j;
    private final AtomicBoolean k;

    public static /* synthetic */ void a(s sVar, l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, sVar, changeQuickRedirect, false, "bc2a149327edb85b6e8b0477ea484e66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sVar, changeQuickRedirect, false, "bc2a149327edb85b6e8b0477ea484e66");
            return;
        }
        sVar.j.add(0, lVar);
        t tVar = sVar.h;
        Object[] objArr2 = {lVar};
        ChangeQuickRedirect changeQuickRedirect2 = t.a;
        if (PatchProxy.isSupport(objArr2, tVar, changeQuickRedirect2, false, "23f321fa35d5f53be0b620ebc3aa0044", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, tVar, changeQuickRedirect2, false, "23f321fa35d5f53be0b620ebc3aa0044")).booleanValue();
            return;
        }
        boolean b = tVar.b(lVar);
        u.a("TKeyStore", "[set][" + lVar.b + ", " + lVar.c + "]: " + b);
    }

    public static /* synthetic */ boolean a(s sVar, boolean z) {
        sVar.e = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public final x.b b;
        private final String c;

        public a(x.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d10d32be09b435d8e6243bae23164647", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d10d32be09b435d8e6243bae23164647");
                return;
            }
            this.b = bVar;
            this.c = bVar.c + CommonConstant.Symbol.COLON + bVar.b;
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efcb0f608723ce01abd9bbee062ee1bb", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efcb0f608723ce01abd9bbee062ee1bb")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.c.equals(((a) obj).c);
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46c264daa288bb13a079ca9a9d50577e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46c264daa288bb13a079ca9a9d50577e")).intValue() : this.c.hashCode();
        }
    }

    static {
        List<l> asList;
        List<l> emptyList = Collections.emptyList();
        try {
            asList = Arrays.asList(new l(x.d.PROD, x.c.SM4_GCM, y.b(y.a("8SwYC6qvtecJe/ejwVvj3Q==")), y.a("AwgAAAA5AgAAAAE7ms1vAAAALKG9MK5WfPQ7FgK4mR/N2aENNO8kJ/sm1OGXok7yWZQYdYEYr3ZTQKTUnF+rAAAALHSxwbeLu2q64eteB7RH6sb/FjuBXiJ/1EeOwElxzIH8Ew9E9uAyK3P7ZBKr")), new l(x.d.PROD, x.c.AES_GCM, y.b(y.a("6b/QLJFUKqOgRT9hEuBT9Q==")), y.a("AwMAAAA5AgAAAAE7msxaAAAALJ5Fpfz1naiDFsyOAEPIOQS7nNIx80RkLtOnHdY9USg4lIG/SKelK3K3DENAAAAALHEWYqDHyi+yC3EyJ/DjJG+MQwGOb5cNuuzfA/j0Zq1ulAnFO329qBchm/v4")), new l(x.d.TEST, x.c.SM4_GCM, y.b(y.a("QgNIxT62n1HYJMw+f2wHmw==")), y.a("AwgAAAA5AgAAAAE7mtUIAAAALPHuERN814KKSsVkhf4io1viRF/CHzTIaWYALuZta2+YVvOQ2kZua9TMstljAAAALHQ8EcjqYRx3FYGBZIZpcOgS6x25GpSVCOcwzs0os2zIfi0izFjt+fXxFWYd")), new l(x.d.TEST, x.c.AES_GCM, y.b(y.a("uxJngujFcukYF7byPipKeg==")), y.a("BktNUwMaOQIAAAABO5rRzAAAACwpBG9PaSNES8pLNKGuQHQOCCMgWGA/tpcxQpWUz2hvCvrHbg8HSWf6QB7ufyIsALCU8pTJ/3PRSGSEFuJswi1gijx416qXVTtZ6K5LIzAiT3yqokCNhkCDJhY=")));
        } catch (Throwable th) {
            th = th;
        }
        try {
            for (l lVar : asList) {
                lVar.g = true;
            }
            emptyList = asList;
        } catch (Throwable th2) {
            th = th2;
            emptyList = asList;
            u.b("TKeyManager", "init", th);
            l = emptyList;
        }
        l = emptyList;
    }

    public static s a(x.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7dc9590e6a60fc5e702f19f26370056", RobustBitConfig.DEFAULT_VALUE) ? (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7dc9590e6a60fc5e702f19f26370056") : g.a(new a(bVar));
    }

    public s(x.b bVar, r rVar, t tVar) {
        Object[] objArr = {bVar, rVar, tVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec3f10768dc66f61b90c52ef712f43d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec3f10768dc66f61b90c52ef712f43d");
            return;
        }
        this.j = new CopyOnWriteArrayList();
        this.k = new AtomicBoolean();
        this.f = -1L;
        this.b = bVar;
        this.c = rVar;
        this.h = tVar;
        x.d dVar = bVar.b;
        x.c cVar = bVar.c.d;
        Object[] objArr2 = {dVar, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        l lVar = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "46de85d7717b25fbf2a3d779124cf6c6", RobustBitConfig.DEFAULT_VALUE)) {
            lVar = (l) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "46de85d7717b25fbf2a3d779124cf6c6");
        } else {
            List<l> a2 = a(dVar, cVar, l);
            if (!a2.isEmpty()) {
                lVar = a2.get(0);
            }
        }
        this.i = lVar;
        this.d = new v("TKeyManager", this.b.a());
    }

    @Override // com.sankuai.meituan.tte.m
    public final l a() throws c {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46eef0c24de0a397f0114fbb05bde060", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46eef0c24de0a397f0114fbb05bde060") : a((byte[]) null);
    }

    private l a(byte[] bArr) throws c {
        List<l> list;
        l lVar;
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18b1ee00eec7613e9ae6161adccba298", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18b1ee00eec7613e9ae6161adccba298");
        }
        x.d dVar = this.b.b;
        x.c cVar = this.b.c.d;
        try {
            boolean z = d().a(this.b.c).i;
            if (z) {
                list = new ArrayList<>();
            } else {
                List<l> a2 = a(dVar, cVar, this.j);
                if (a2.isEmpty() && !z) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "114e47e5196d96a49d0e80b27f1c0b08", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "114e47e5196d96a49d0e80b27f1c0b08");
                    } else if (this.k.compareAndSet(false, true)) {
                        g.c().execute(new Runnable() { // from class: com.sankuai.meituan.tte.s.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                final l a3;
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d2fbcd86fd3ee65538b06e82db7895f1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d2fbcd86fd3ee65538b06e82db7895f1");
                                    return;
                                }
                                t tVar = s.this.h;
                                x.d dVar2 = s.this.b.b;
                                x.c cVar2 = s.this.b.c.d;
                                Object[] objArr4 = {dVar2, cVar2};
                                ChangeQuickRedirect changeQuickRedirect4 = t.a;
                                if (PatchProxy.isSupport(objArr4, tVar, changeQuickRedirect4, false, "72b388be007e65a6cacfc86d75efea2d", RobustBitConfig.DEFAULT_VALUE)) {
                                    a3 = (l) PatchProxy.accessDispatch(objArr4, tVar, changeQuickRedirect4, false, "72b388be007e65a6cacfc86d75efea2d");
                                } else {
                                    a3 = tVar.a(dVar2, cVar2);
                                    StringBuilder sb = new StringBuilder("[get][");
                                    sb.append(dVar2);
                                    sb.append(", ");
                                    sb.append(cVar2);
                                    sb.append("] null?: ");
                                    sb.append(a3 == null);
                                    u.a("TKeyStore", sb.toString());
                                }
                                if (a3 != null) {
                                    s.this.j.add(a3);
                                    final s sVar = s.this;
                                    Object[] objArr5 = {a3};
                                    ChangeQuickRedirect changeQuickRedirect5 = s.a;
                                    if (PatchProxy.isSupport(objArr5, sVar, changeQuickRedirect5, false, "7fb6f73a5230d3f09210136018172da7", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, sVar, changeQuickRedirect5, false, "7fb6f73a5230d3f09210136018172da7");
                                    } else if (a3.i.compareAndSet(false, true) && !sVar.d().a(sVar.b.c).c()) {
                                        v vVar = sVar.d;
                                        vVar.c("verify key: " + a3);
                                        final r rVar = sVar.c;
                                        o<Boolean> oVar = new o<Boolean>() { // from class: com.sankuai.meituan.tte.s.5
                                            public static ChangeQuickRedirect a;

                                            @Override // com.sankuai.meituan.tte.o
                                            public final void a(Throwable th) {
                                                Object[] objArr6 = {th};
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "03e730248ed34bce9b3f3658c01c6d68", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "03e730248ed34bce9b3f3658c01c6d68");
                                                }
                                            }

                                            @Override // com.sankuai.meituan.tte.o
                                            public final /* synthetic */ void a(Boolean bool) {
                                                Boolean bool2 = bool;
                                                Object[] objArr6 = {bool2};
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a7758626ca3251e62787ef260cadb9ab", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a7758626ca3251e62787ef260cadb9ab");
                                                    return;
                                                }
                                                v vVar2 = s.this.d;
                                                vVar2.c("verify result: " + bool2 + ", " + y.a(a3.e));
                                                if (!bool2.booleanValue()) {
                                                    a3.j = true;
                                                    t tVar2 = s.this.h;
                                                    l lVar2 = a3;
                                                    Object[] objArr7 = {lVar2};
                                                    ChangeQuickRedirect changeQuickRedirect7 = t.a;
                                                    if (PatchProxy.isSupport(objArr7, tVar2, changeQuickRedirect7, false, "cdf4e94f55276e750e760bd0319176ed", RobustBitConfig.DEFAULT_VALUE)) {
                                                        ((Boolean) PatchProxy.accessDispatch(objArr7, tVar2, changeQuickRedirect7, false, "cdf4e94f55276e750e760bd0319176ed")).booleanValue();
                                                    } else {
                                                        boolean a4 = tVar2.a(lVar2);
                                                        u.a("TKeyStore", "[remove][" + lVar2.b + ", " + lVar2.c + "]: " + a4);
                                                    }
                                                }
                                                s.this.a(a3);
                                            }
                                        };
                                        Object[] objArr6 = {a3, oVar};
                                        ChangeQuickRedirect changeQuickRedirect6 = r.a;
                                        if (PatchProxy.isSupport(objArr6, rVar, changeQuickRedirect6, false, "824a2fc9c13495163d470e80ae9f144c", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, rVar, changeQuickRedirect6, false, "824a2fc9c13495163d470e80ae9f144c");
                                        } else {
                                            g.a(new Callable<Boolean>() { // from class: com.sankuai.meituan.tte.r.2
                                                public static ChangeQuickRedirect a;

                                                @Override // java.util.concurrent.Callable
                                                public final /* synthetic */ Boolean call() throws Exception {
                                                    Object[] objArr7 = new Object[0];
                                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                                    return PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "7a0ee45f9a51dc6649301dc6766e343f", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "7a0ee45f9a51dc6649301dc6766e343f") : Boolean.valueOf(rVar.a(a3, false));
                                                }
                                            }, rVar.a(), oVar);
                                        }
                                    }
                                }
                                s.this.a(a3);
                            }
                        });
                    }
                }
                list = a2;
            }
            list.add(this.i);
            Iterator<l> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    lVar = null;
                    break;
                }
                lVar = it.next();
                if (lVar != null) {
                    if (!lVar.j) {
                        break;
                    }
                    this.d.b("skip error key");
                }
            }
            a(lVar);
            if (lVar != null) {
                return lVar;
            }
        } catch (Throwable th) {
            this.d.b("getKey", th);
        }
        throw new c("no key found for env: " + dVar + ", cipherType: " + cVar.d, -10201);
    }

    private boolean b(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "462da2e8470d7c86c2a35427e4de558c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "462da2e8470d7c86c2a35427e4de558c")).booleanValue();
        }
        if (lVar.g) {
            return false;
        }
        long j = lVar.f;
        e d = d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        return j + (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "145c645f293bf832a9b07a958a5d3fa5", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "145c645f293bf832a9b07a958a5d3fa5")).longValue() : ((long) d.g) * 1000) < System.currentTimeMillis();
    }

    @VisibleForTesting
    public final void a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f9554c760d2a77fcaa4fed3c6b260d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f9554c760d2a77fcaa4fed3c6b260d4");
            return;
        }
        if (lVar != null) {
            lVar.h = b(lVar);
            if (!lVar.h && !lVar.j) {
                return;
            }
        }
        e.a a2 = d().a(this.b.c);
        if (a2.b() || a2.i || !b()) {
            return;
        }
        com.sankuai.waimai.launcher.util.aop.b.a(e(), new Runnable() { // from class: com.sankuai.meituan.tte.s.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df06de760e39cc3238e7a43fa904a4e7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df06de760e39cc3238e7a43fa904a4e7");
                    return;
                }
                final s sVar = s.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = s.a;
                if (PatchProxy.isSupport(objArr3, sVar, changeQuickRedirect3, false, "688e613f029708784b4f4db9c4f16487", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, sVar, changeQuickRedirect3, false, "688e613f029708784b4f4db9c4f16487");
                } else if (!sVar.b()) {
                    sVar.d.a("skip agreement for interval");
                } else if (!sVar.c()) {
                    sVar.d.a("skip agreement for count");
                } else {
                    sVar.e = true;
                    sVar.f = System.nanoTime();
                    sVar.d.c("start key agreement");
                    final r rVar = sVar.c;
                    final o<l> oVar = new o<l>() { // from class: com.sankuai.meituan.tte.s.4
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.tte.o
                        public final /* synthetic */ void a(l lVar2) {
                            final l lVar3 = lVar2;
                            Object[] objArr4 = {lVar3};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cede6c01298a7b07d2a0a176ca2933ac", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cede6c01298a7b07d2a0a176ca2933ac");
                                return;
                            }
                            v vVar = s.this.d;
                            vVar.c("key agreement result: " + lVar3);
                            com.sankuai.waimai.launcher.util.aop.b.a(s.this.e(), new Runnable() { // from class: com.sankuai.meituan.tte.s.4.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e72e54602383cce40f05c3485039432c", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e72e54602383cce40f05c3485039432c");
                                        return;
                                    }
                                    s.a(s.this, lVar3);
                                    s.a(s.this, false);
                                }
                            });
                        }

                        @Override // com.sankuai.meituan.tte.o
                        public final void a(Throwable th) {
                            Object[] objArr4 = {th};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fd700489ed45afe5dafae248745d8c9c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fd700489ed45afe5dafae248745d8c9c");
                                return;
                            }
                            s.this.d.b("key agreement error", th);
                            com.sankuai.waimai.launcher.util.aop.b.a(s.this.e(), new Runnable() { // from class: com.sankuai.meituan.tte.s.4.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "af10fff52a5a22cf63cfe20b803001a4", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "af10fff52a5a22cf63cfe20b803001a4");
                                    } else {
                                        s.a(s.this, false);
                                    }
                                }
                            });
                        }
                    };
                    Object[] objArr4 = {oVar};
                    ChangeQuickRedirect changeQuickRedirect4 = r.a;
                    if (PatchProxy.isSupport(objArr4, rVar, changeQuickRedirect4, false, "75974caaf0eb090ca20b10f710fc5b33", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, rVar, changeQuickRedirect4, false, "75974caaf0eb090ca20b10f710fc5b33");
                        return;
                    }
                    final AtomicInteger atomicInteger = new AtomicInteger(0);
                    rVar.a().execute(new Runnable() { // from class: com.sankuai.meituan.tte.r.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            l lVar2;
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5521be2c70f1b798f9d5b181f42cb084", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5521be2c70f1b798f9d5b181f42cb084");
                                return;
                            }
                            int andIncrement = atomicInteger.getAndIncrement();
                            w.a a3 = w.a("tte.keyAgreement.finalResult", "keyAgreement");
                            w.a(a3);
                            try {
                                try {
                                    r rVar2 = rVar;
                                    Object[] objArr6 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect6 = r.a;
                                    if (PatchProxy.isSupport(objArr6, rVar2, changeQuickRedirect6, false, "27e3803a9495e585c5dda1e477817526", RobustBitConfig.DEFAULT_VALUE)) {
                                        lVar2 = (l) PatchProxy.accessDispatch(objArr6, rVar2, changeQuickRedirect6, false, "27e3803a9495e585c5dda1e477817526");
                                    } else {
                                        l b = rVar2.b();
                                        v vVar = rVar2.b;
                                        vVar.b("result: " + b);
                                        Object[] objArr7 = {b};
                                        ChangeQuickRedirect changeQuickRedirect7 = r.a;
                                        if (!(PatchProxy.isSupport(objArr7, rVar2, changeQuickRedirect7, false, "0edd22fb61d92118b6e1522f1b77348b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr7, rVar2, changeQuickRedirect7, false, "0edd22fb61d92118b6e1522f1b77348b")).booleanValue() : rVar2.a(b, true))) {
                                            throw new InvalidKeyException("verify key failed");
                                        }
                                        b.i.set(true);
                                        lVar2 = b;
                                    }
                                    a3.b();
                                    oVar.a((o) lVar2);
                                    w.a(null);
                                } catch (IOException e) {
                                    e a4 = e.a(x.a());
                                    if (andIncrement < a4.e) {
                                        ScheduledExecutorService a5 = rVar.a();
                                        Object[] objArr8 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect8 = e.a;
                                        a5.schedule(this, PatchProxy.isSupport(objArr8, a4, changeQuickRedirect8, false, "6fa626018ed0b79be3cb6c011aff185b", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr8, a4, changeQuickRedirect8, false, "6fa626018ed0b79be3cb6c011aff185b")).longValue() : a4.f * 1000, TimeUnit.MILLISECONDS);
                                    } else {
                                        a3.b();
                                        oVar.a((Throwable) e);
                                    }
                                    w.a(null);
                                } catch (Throwable th) {
                                    a3.b();
                                    oVar.a(th);
                                    w.a(null);
                                }
                            } catch (Throwable th2) {
                                w.a(null);
                                throw th2;
                            }
                        }
                    });
                }
            }
        });
    }

    boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ea66efb4c822bc67136bdfc135f172a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ea66efb4c822bc67136bdfc135f172a")).booleanValue();
        }
        if (this.e) {
            return false;
        }
        if (this.f < 0) {
            return true;
        }
        return System.nanoTime() - this.f >= TimeUnit.MILLISECONDS.toNanos(d().a());
    }

    boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25a88cb0a1ff67a0a654238a3258ca54", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25a88cb0a1ff67a0a654238a3258ca54")).booleanValue();
        }
        try {
            String str = "ka_timestamps:" + this.b.b + CommonConstant.Symbol.COLON + this.b.c;
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, f().b(str, "").split(CommonConstant.Symbol.COMMA));
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (TextUtils.isEmpty(str2) || currentTimeMillis - Long.parseLong(str2) > 86400000) {
                    it.remove();
                }
            }
            if (arrayList.size() < d().d) {
                StringBuilder sb = new StringBuilder();
                sb.append(System.currentTimeMillis());
                arrayList.add(sb.toString());
                f().a(str, TextUtils.join(CommonConstant.Symbol.COMMA, arrayList));
                return true;
            }
            return false;
        } catch (Throwable th) {
            this.d.a("check agreement count error", th);
            return true;
        }
    }

    private com.meituan.android.cipstorage.q f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac41d5ec7e4878a41f68be0551857b07", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cipstorage.q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac41d5ec7e4878a41f68be0551857b07") : y.a(x.a(), "status");
    }

    public final e d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "155afac72a60fa9d046ad2660a6613fc", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "155afac72a60fa9d046ad2660a6613fc") : e.a(x.a());
    }

    @VisibleForTesting
    public final Executor e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c8240425eacf09456ed4eade1de0a95", RobustBitConfig.DEFAULT_VALUE) ? (Executor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c8240425eacf09456ed4eade1de0a95") : g.b();
    }

    private static List<l> a(x.d dVar, x.c cVar, Collection<l> collection) {
        Object[] objArr = {dVar, cVar, collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9096bfd2f20dd0c2d76597adb1257db6", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9096bfd2f20dd0c2d76597adb1257db6");
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (l lVar : collection) {
            if (lVar.b == dVar && lVar.c == cVar) {
                arrayList.add(lVar);
            }
        }
        return arrayList;
    }
}
