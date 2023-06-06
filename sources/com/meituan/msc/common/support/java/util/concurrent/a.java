package com.meituan.msc.common.support.java.util.concurrent;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sun.misc.Unsafe;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a<T> implements com.meituan.msc.common.support.java.util.concurrent.c<T>, Future<T> {
    public static ChangeQuickRedirect a;
    public static final C0437a d = new C0437a(null);
    private static final Executor e = new f();
    private static final Unsafe f = com.meituan.msc.common.support.java.util.concurrent.d.a;
    private static final long g;
    private static final long h;
    private static final long i;
    public volatile Object b;
    public volatile e c;

    @Override // com.meituan.msc.common.support.java.util.concurrent.c
    public final a<T> d() {
        return this;
    }

    private boolean e(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcabcbaddbfe6366f2cd79dcede4e45d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcabcbaddbfe6366f2cd79dcede4e45d")).booleanValue() : f.compareAndSwapObject(this, g, (Object) null, obj);
    }

    private boolean a(e eVar, e eVar2) {
        Object[] objArr = {eVar, eVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c50988bebd8e80988e9be2fcfb80689", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c50988bebd8e80988e9be2fcfb80689")).booleanValue() : f.compareAndSwapObject(this, h, eVar, eVar2);
    }

    private boolean b(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88ddf5f43d63b97bae31d587dc5556eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88ddf5f43d63b97bae31d587dc5556eb")).booleanValue();
        }
        e eVar2 = this.c;
        b(eVar, eVar2);
        return f.compareAndSwapObject(this, h, eVar2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.common.support.java.util.concurrent.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0437a {
        public final Throwable a;

        public C0437a(Throwable th) {
            this.a = th;
        }
    }

    static {
        try {
            g = f.objectFieldOffset(a.class.getDeclaredField("b"));
            h = f.objectFieldOffset(a.class.getDeclaredField(com.huawei.hms.opendevice.c.a));
            i = f.objectFieldOffset(e.class.getDeclaredField("d"));
        } catch (Exception e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18d3e16a2e28a010c9eba24ce1141e5a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18d3e16a2e28a010c9eba24ce1141e5a")).booleanValue() : f.compareAndSwapObject(this, g, (Object) null, d);
    }

    public final boolean a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e84c85a25baf85a4356555d48f083b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e84c85a25baf85a4356555d48f083b4")).booleanValue();
        }
        Unsafe unsafe = f;
        long j2 = g;
        if (t == null) {
            t = (T) d;
        }
        return unsafe.compareAndSwapObject(this, j2, (Object) null, t);
    }

    private static C0437a d(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3cfcf78178718e9ff142273f7cdd33f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0437a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3cfcf78178718e9ff142273f7cdd33f5");
        }
        if (!(th instanceof com.meituan.msc.common.support.java.util.concurrent.b)) {
            th = new com.meituan.msc.common.support.java.util.concurrent.b(th);
        }
        return new C0437a(th);
    }

    public final boolean a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77b842f5773e9dc6ffe9191068878c5a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77b842f5773e9dc6ffe9191068878c5a")).booleanValue() : f.compareAndSwapObject(this, g, (Object) null, d(th));
    }

    private static Object b(Throwable th, Object obj) {
        Object[] objArr = {th, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba2570e560bb91f46e019feba54a82c6", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba2570e560bb91f46e019feba54a82c6");
        }
        if (!(th instanceof com.meituan.msc.common.support.java.util.concurrent.b)) {
            th = new com.meituan.msc.common.support.java.util.concurrent.b(th);
        } else if ((obj instanceof C0437a) && th == ((C0437a) obj).a) {
            return obj;
        }
        return new C0437a(th);
    }

    public final boolean a(Throwable th, Object obj) {
        Object[] objArr = {th, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "035aaf75c3796768ec7d21134ebe1615", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "035aaf75c3796768ec7d21134ebe1615")).booleanValue() : f.compareAndSwapObject(this, g, (Object) null, b(th, obj));
    }

    private static Object f(Object obj) {
        Throwable th;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40194cca9d10cffb7d43df29645858bd", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40194cca9d10cffb7d43df29645858bd") : (!(obj instanceof C0437a) || (th = ((C0437a) obj).a) == null || (th instanceof com.meituan.msc.common.support.java.util.concurrent.b)) ? obj : new C0437a(new com.meituan.msc.common.support.java.util.concurrent.b(th));
    }

    public final boolean b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfa3bdd012d0685ef18a236d682f7556", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfa3bdd012d0685ef18a236d682f7556")).booleanValue() : f.compareAndSwapObject(this, g, (Object) null, f(obj));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static final class f implements Executor {
        public static ChangeQuickRedirect a;

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f69d8fce0d960edf2f3c8f7cc5856801", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f69d8fce0d960edf2f3c8f7cc5856801");
                return;
            }
            com.meituan.msc.common.support.java.util.a.a(runnable);
            com.sankuai.android.jarvis.c.a().execute(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class e implements Serializable, Runnable {
        public static ChangeQuickRedirect c;
        public volatile e d;

        public abstract a<?> a(int i);

        public abstract boolean a();

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dba6162422110b4446cb8df8923c8c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dba6162422110b4446cb8df8923c8c0");
            } else {
                a(1);
            }
        }
    }

    private static void b(e eVar, e eVar2) {
        Object[] objArr = {eVar, eVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "390417af88c318bd01a80b7ab62f6cc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "390417af88c318bd01a80b7ab62f6cc7");
        } else {
            f.putOrderedObject(eVar, i, eVar2);
        }
    }

    private static boolean a(e eVar, e eVar2, e eVar3) {
        Object[] objArr = {eVar, eVar2, eVar3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3bdb22f4919a125db8afc68e0408a6a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3bdb22f4919a125db8afc68e0408a6a")).booleanValue() : f.compareAndSwapObject(eVar, i, eVar2, eVar3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a1c1401d4f0e0144a8ce9847e02b26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a1c1401d4f0e0144a8ce9847e02b26");
            return;
        }
        while (true) {
            a aVar = this;
            while (true) {
                e eVar = aVar.c;
                aVar = aVar;
                if (eVar == null) {
                    if (aVar == this || (eVar = this.c) == null) {
                        return;
                    }
                    aVar = this;
                }
                e eVar2 = eVar.d;
                if (aVar.a(eVar, eVar2)) {
                    if (eVar2 != null) {
                        if (aVar != this) {
                            Object[] objArr2 = {eVar};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "047da176a0177f34acbe0258d582b56d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "047da176a0177f34acbe0258d582b56d");
                            } else {
                                do {
                                } while (!b(eVar));
                            }
                        } else {
                            a(eVar, eVar2, (e) null);
                        }
                    }
                    aVar = eVar.a(-1);
                    if (aVar == null) {
                        break;
                    }
                }
            }
        }
    }

    public final void c() {
        e eVar;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "162ed64c0c18e11989ac58480671c802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "162ed64c0c18e11989ac58480671c802");
            return;
        }
        while (true) {
            eVar = this.c;
            if (eVar == null || eVar.a()) {
                break;
            }
            z = a(eVar, eVar.d);
        }
        if (eVar == null || z) {
            return;
        }
        e eVar2 = eVar.d;
        e eVar3 = eVar;
        while (eVar2 != null) {
            e eVar4 = eVar2.d;
            if (!eVar2.a()) {
                a(eVar3, eVar2, eVar4);
                return;
            } else {
                eVar3 = eVar2;
                eVar2 = eVar4;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class i<T, V> extends e {
        public static ChangeQuickRedirect e;
        public Executor f;
        public a<V> g;
        public a<T> h;

        public i(Executor executor, a<V> aVar, a<T> aVar2) {
            Object[] objArr = {executor, aVar, aVar2};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae108505c5d1c3a01d16d63540779d30", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae108505c5d1c3a01d16d63540779d30");
                return;
            }
            this.f = executor;
            this.g = aVar;
            this.h = aVar2;
        }

        public final boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "520683409f14df8f0a84989514f49786", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "520683409f14df8f0a84989514f49786")).booleanValue();
            }
            Executor executor = this.f;
            if (executor == null) {
                return true;
            }
            this.f = null;
            com.sankuai.waimai.launcher.util.aop.b.a(executor, this);
            return false;
        }

        @Override // com.meituan.msc.common.support.java.util.concurrent.a.e
        public final boolean a() {
            return this.g != null;
        }
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adfdb2441014a46f62d7bee4808d1643", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adfdb2441014a46f62d7bee4808d1643");
        } else if (eVar != null) {
            while (true) {
                if (!b(eVar)) {
                    if (this.b != null) {
                        b(eVar, (e) null);
                        break;
                    }
                } else {
                    break;
                }
            }
            if (this.b != null) {
                eVar.a(0);
            }
        }
    }

    public final a<T> a(a<?> aVar, int i2) {
        Object[] objArr = {aVar, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dba3bb4ea57461f43fa885228a70ebda", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dba3bb4ea57461f43fa885228a70ebda");
        }
        if (aVar != null && aVar.c != null) {
            Object obj = aVar.b;
            if (obj == null) {
                aVar.c();
            }
            if (i2 >= 0 && (obj != null || aVar.b != null)) {
                aVar.b();
            }
        }
        if (this.b == null || this.c == null) {
            return null;
        }
        if (i2 < 0) {
            return this;
        }
        b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class h<T, V> extends i<T, V> {
        public static ChangeQuickRedirect a;
        public com.meituan.msc.common.support.java.util.function.d<? super T, ? extends V> b;

        public h(Executor executor, a<V> aVar, a<T> aVar2, com.meituan.msc.common.support.java.util.function.d<? super T, ? extends V> dVar) {
            super(executor, aVar, aVar2);
            Object[] objArr = {executor, aVar, aVar2, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51b7250e378d713afac28c42358c30b3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51b7250e378d713afac28c42358c30b3");
            } else {
                this.b = dVar;
            }
        }

        @Override // com.meituan.msc.common.support.java.util.concurrent.a.e
        public final a<V> a(int i) {
            Object obj;
            a<V> aVar;
            com.meituan.msc.common.support.java.util.function.d<? super T, ? extends V> dVar;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34683326c26f537dca6d759bda4faa95", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34683326c26f537dca6d759bda4faa95");
            }
            a<T> aVar2 = this.h;
            if (aVar2 == null || (obj = aVar2.b) == null || (aVar = this.g) == null || (dVar = this.b) == null) {
                return null;
            }
            if (aVar.b == null) {
                if (obj instanceof C0437a) {
                    Throwable th = ((C0437a) obj).a;
                    if (th != null) {
                        aVar.a(th, obj);
                    } else {
                        obj = null;
                    }
                }
                if (i <= 0) {
                    try {
                        if (!b()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        aVar.a(th2);
                    }
                }
                aVar.a((a<V>) dVar.a(obj));
            }
            this.h = null;
            this.g = null;
            this.b = null;
            return aVar.a((a<?>) aVar2, i);
        }
    }

    private <V> a<V> a(Executor executor, com.meituan.msc.common.support.java.util.function.d<? super T, ? extends V> dVar) {
        Object[] objArr = {null, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0370a11429d3430200d98c6ae4ffd10", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0370a11429d3430200d98c6ae4ffd10");
        }
        com.meituan.msc.common.support.java.util.a.a(dVar);
        Object obj = this.b;
        if (obj != null) {
            return a(obj, (Executor) null, dVar);
        }
        a<V> aVar = (a<V>) e();
        a((e) new h(null, aVar, this, dVar));
        return aVar;
    }

    private <V> a<V> a(Object obj, Executor executor, com.meituan.msc.common.support.java.util.function.d<? super T, ? extends V> dVar) {
        Object[] objArr = {obj, executor, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f1d37d1a833152097839fd8d47e682e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f1d37d1a833152097839fd8d47e682e");
        }
        a<V> aVar = (a<V>) e();
        if (obj instanceof C0437a) {
            Throwable th = ((C0437a) obj).a;
            if (th != null) {
                aVar.b = b(th, obj);
                return aVar;
            }
            obj = null;
        }
        try {
            if (executor != null) {
                com.sankuai.waimai.launcher.util.aop.b.a(executor, new h(null, aVar, this, dVar));
            } else {
                Object a2 = dVar.a(obj);
                if (a2 == null) {
                    a2 = d;
                }
                aVar.b = a2;
            }
        } catch (Throwable th2) {
            aVar.b = d(th2);
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class g<T> extends i<T, Void> {
        public static ChangeQuickRedirect a;
        public com.meituan.msc.common.support.java.util.function.c<? super T> b;

        public g(Executor executor, a<Void> aVar, a<T> aVar2, com.meituan.msc.common.support.java.util.function.c<? super T> cVar) {
            super(executor, aVar, aVar2);
            Object[] objArr = {executor, aVar, aVar2, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93805d6873c56b3f6a5c0473cf0d9e55", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93805d6873c56b3f6a5c0473cf0d9e55");
            } else {
                this.b = cVar;
            }
        }

        @Override // com.meituan.msc.common.support.java.util.concurrent.a.e
        public final a<Void> a(int i) {
            Object obj;
            a<V> aVar;
            com.meituan.msc.common.support.java.util.function.c<? super T> cVar;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e8662e46e4665a01914f1b6bacf0e55", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e8662e46e4665a01914f1b6bacf0e55");
            }
            a<T> aVar2 = this.h;
            if (aVar2 == null || (obj = aVar2.b) == null || (aVar = this.g) == 0 || (cVar = this.b) == null) {
                return null;
            }
            if (aVar.b == null) {
                if (obj instanceof C0437a) {
                    Throwable th = ((C0437a) obj).a;
                    if (th != null) {
                        aVar.a(th, obj);
                    } else {
                        obj = null;
                    }
                }
                if (i <= 0) {
                    try {
                        if (!b()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        aVar.a(th2);
                    }
                }
                cVar.a(obj);
                aVar.a();
            }
            this.h = null;
            this.g = null;
            this.b = null;
            return aVar.a((a<?>) aVar2, i);
        }
    }

    private a<Void> a(Object obj, Executor executor, com.meituan.msc.common.support.java.util.function.c<? super T> cVar) {
        Object[] objArr = {obj, executor, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11617cd6596d640a7548d889f1d9f2b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11617cd6596d640a7548d889f1d9f2b9");
        }
        a e2 = e();
        if (obj instanceof C0437a) {
            Throwable th = ((C0437a) obj).a;
            if (th != null) {
                e2.b = b(th, obj);
                return e2;
            }
            obj = null;
        }
        try {
            if (executor != null) {
                com.sankuai.waimai.launcher.util.aop.b.a(executor, new g(null, e2, this, cVar));
            } else {
                cVar.a(obj);
                e2.b = d;
            }
        } catch (Throwable th2) {
            e2.b = d(th2);
        }
        return e2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class n<T> extends i<T, T> {
        public static ChangeQuickRedirect a;
        public com.meituan.msc.common.support.java.util.function.a<? super T, ? super Throwable> b;

        public n(Executor executor, a<T> aVar, a<T> aVar2, com.meituan.msc.common.support.java.util.function.a<? super T, ? super Throwable> aVar3) {
            super(executor, aVar, aVar2);
            Object[] objArr = {executor, aVar, aVar2, aVar3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f2dd7ebaa005881805f02d6ffe78b2f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f2dd7ebaa005881805f02d6ffe78b2f");
            } else {
                this.b = aVar3;
            }
        }

        @Override // com.meituan.msc.common.support.java.util.concurrent.a.e
        public final a<T> a(int i) {
            Object obj;
            a<V> aVar;
            com.meituan.msc.common.support.java.util.function.a<? super T, ? super Throwable> aVar2;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f90850a8bc1e21d78b178567940bc6eb", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f90850a8bc1e21d78b178567940bc6eb");
            }
            a<T> aVar3 = this.h;
            if (aVar3 != null && (obj = aVar3.b) != null && (aVar = this.g) != 0 && (aVar2 = this.b) != null) {
                if (aVar.a(obj, (com.meituan.msc.common.support.java.util.function.a<? super V, ? super Throwable>) aVar2, (n<V>) (i > 0 ? null : this))) {
                    this.h = null;
                    this.g = null;
                    this.b = null;
                    return aVar.a((a<?>) aVar3, i);
                }
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.Object r13, com.meituan.msc.common.support.java.util.function.a<? super T, ? super java.lang.Throwable> r14, com.meituan.msc.common.support.java.util.concurrent.a.n<T> r15) {
        /*
            r12 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            r9 = 1
            r0[r9] = r14
            r1 = 2
            r0[r1] = r15
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.common.support.java.util.concurrent.a.a
            java.lang.String r11 = "faaf1126fb6265daf3cbd1646db9a16d"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L28
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L28:
            java.lang.Object r0 = r12.b
            if (r0 != 0) goto L58
            r0 = 0
            if (r15 == 0) goto L39
            boolean r15 = r15.b()     // Catch: java.lang.Throwable -> L36
            if (r15 != 0) goto L39
            return r8
        L36:
            r14 = move-exception
        L37:
            r15 = r14
            goto L51
        L39:
            boolean r15 = r13 instanceof com.meituan.msc.common.support.java.util.concurrent.a.C0437a     // Catch: java.lang.Throwable -> L36
            if (r15 == 0) goto L43
            r15 = r13
            com.meituan.msc.common.support.java.util.concurrent.a$a r15 = (com.meituan.msc.common.support.java.util.concurrent.a.C0437a) r15     // Catch: java.lang.Throwable -> L36
            java.lang.Throwable r15 = r15.a     // Catch: java.lang.Throwable -> L36
            goto L45
        L43:
            r15 = r0
            r0 = r13
        L45:
            r14.a(r0, r15)     // Catch: java.lang.Throwable -> L4e
            if (r15 != 0) goto L55
            r12.e(r13)     // Catch: java.lang.Throwable -> L4e
            return r9
        L4e:
            r14 = move-exception
            r0 = r15
            goto L37
        L51:
            if (r0 != 0) goto L54
            goto L55
        L54:
            r15 = r0
        L55:
            r12.a(r15, r13)
        L58:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.common.support.java.util.concurrent.a.a(java.lang.Object, com.meituan.msc.common.support.java.util.function.a, com.meituan.msc.common.support.java.util.concurrent.a$n):boolean");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class l<T, V> extends i<T, V> {
        public static ChangeQuickRedirect a;
        public com.meituan.msc.common.support.java.util.function.b<? super T, Throwable, ? extends V> b;

        public l(Executor executor, a<V> aVar, a<T> aVar2, com.meituan.msc.common.support.java.util.function.b<? super T, Throwable, ? extends V> bVar) {
            super(executor, aVar, aVar2);
            Object[] objArr = {executor, aVar, aVar2, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9765007cc00e3192d07b5830c3fd2311", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9765007cc00e3192d07b5830c3fd2311");
            } else {
                this.b = bVar;
            }
        }

        @Override // com.meituan.msc.common.support.java.util.concurrent.a.e
        public final a<V> a(int i) {
            Object obj;
            a<V> aVar;
            com.meituan.msc.common.support.java.util.function.b bVar;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "304cda986ccf02b243d77cfe80fd3e93", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "304cda986ccf02b243d77cfe80fd3e93");
            }
            a<T> aVar2 = this.h;
            if (aVar2 != null && (obj = aVar2.b) != null && (aVar = this.g) != null && (bVar = (com.meituan.msc.common.support.java.util.function.b<? super T, Throwable, ? extends V>) this.b) != null) {
                if (aVar.a(obj, (com.meituan.msc.common.support.java.util.function.b<? super S, Throwable, ? extends V>) bVar, (l<S, V>) (i > 0 ? null : this))) {
                    this.h = null;
                    this.g = null;
                    this.b = null;
                    return aVar.a((a<?>) aVar2, i);
                }
            }
            return null;
        }
    }

    public final <S> boolean a(Object obj, com.meituan.msc.common.support.java.util.function.b<? super S, Throwable, ? extends T> bVar, l<S, T> lVar) {
        Object obj2 = obj;
        Object[] objArr = {obj2, bVar, lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "876e9ef615d07b2fb3b132b90973d2bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "876e9ef615d07b2fb3b132b90973d2bb")).booleanValue();
        }
        if (this.b == null) {
            if (lVar != null) {
                try {
                    if (!lVar.b()) {
                        return false;
                    }
                } catch (Throwable th) {
                    a(th);
                }
            }
            Throwable th2 = null;
            if (obj2 instanceof C0437a) {
                th2 = ((C0437a) obj2).a;
                obj2 = null;
            }
            a((a<T>) bVar.a(obj2, th2));
        }
        return true;
    }

    private <V> a<V> a(Executor executor, com.meituan.msc.common.support.java.util.function.b<? super T, Throwable, ? extends V> bVar) {
        Object[] objArr = {null, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "119f888dff26713774e3d992fde9eb47", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "119f888dff26713774e3d992fde9eb47");
        }
        com.meituan.msc.common.support.java.util.a.a(bVar);
        a<V> aVar = (a<V>) e();
        Object obj = this.b;
        if (obj == null) {
            a((e) new l(null, aVar, this, bVar));
        } else {
            aVar.a(obj, (com.meituan.msc.common.support.java.util.function.b<? super S, Throwable, ? extends V>) bVar, (l<S, V>) null);
        }
        return aVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static final class k<T> extends i<T, T> {
        public static ChangeQuickRedirect a;
        public com.meituan.msc.common.support.java.util.function.d<? super Throwable, ? extends T> b;

        public k(Executor executor, a<T> aVar, a<T> aVar2, com.meituan.msc.common.support.java.util.function.d<? super Throwable, ? extends T> dVar) {
            super(executor, aVar, aVar2);
            Object[] objArr = {executor, aVar, aVar2, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3833b32f9fbd8eca39bc2d663c38f762", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3833b32f9fbd8eca39bc2d663c38f762");
            } else {
                this.b = dVar;
            }
        }

        @Override // com.meituan.msc.common.support.java.util.concurrent.a.e
        public final a<T> a(int i) {
            Object obj;
            a<V> aVar;
            com.meituan.msc.common.support.java.util.function.d<? super Throwable, ? extends T> dVar;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a824bf917520cb96a4190ac4a6705b9e", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a824bf917520cb96a4190ac4a6705b9e");
            }
            a<T> aVar2 = this.h;
            if (aVar2 != null && (obj = aVar2.b) != null && (aVar = this.g) != 0 && (dVar = this.b) != null) {
                if (aVar.a(obj, (com.meituan.msc.common.support.java.util.function.d<? super Throwable, ? extends V>) dVar, (k<V>) (i > 0 ? null : this))) {
                    this.h = null;
                    this.g = null;
                    this.b = null;
                    return aVar.a((a<?>) aVar2, i);
                }
            }
            return null;
        }
    }

    public final boolean a(Object obj, com.meituan.msc.common.support.java.util.function.d<? super Throwable, ? extends T> dVar, k<T> kVar) {
        Throwable th;
        Object[] objArr = {obj, dVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b51c6c6cbd90619fc6ee50392800de3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b51c6c6cbd90619fc6ee50392800de3")).booleanValue();
        }
        if (this.b == null) {
            if (kVar != null) {
                try {
                    if (!kVar.b()) {
                        return false;
                    }
                } catch (Throwable th2) {
                    a(th2);
                }
            }
            if ((obj instanceof C0437a) && (th = ((C0437a) obj).a) != null) {
                a((a<T>) dVar.a(th));
            } else {
                e(obj);
            }
        }
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class m<U, T extends U> extends i<T, U> {
        public static ChangeQuickRedirect a;

        public m(a<U> aVar, a<T> aVar2) {
            super(null, aVar, aVar2);
            Object[] objArr = {aVar, aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95901188cae2fad328b4d6d95166ed77", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95901188cae2fad328b4d6d95166ed77");
            }
        }

        @Override // com.meituan.msc.common.support.java.util.concurrent.a.e
        public final a<U> a(int i) {
            Object obj;
            a<V> aVar;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e0bec1a2a0955e7321931649e1470c8", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e0bec1a2a0955e7321931649e1470c8");
            }
            a<T> aVar2 = this.h;
            if (aVar2 == null || (obj = aVar2.b) == null || (aVar = this.g) == 0) {
                return null;
            }
            if (aVar.b == null) {
                aVar.b(obj);
            }
            this.h = null;
            this.g = null;
            return aVar.a((a<?>) aVar2, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class j<T, V> extends i<T, V> {
        public static ChangeQuickRedirect a;
        public com.meituan.msc.common.support.java.util.function.d<? super T, ? extends com.meituan.msc.common.support.java.util.concurrent.c<V>> b;

        public j(Executor executor, a<V> aVar, a<T> aVar2, com.meituan.msc.common.support.java.util.function.d<? super T, ? extends com.meituan.msc.common.support.java.util.concurrent.c<V>> dVar) {
            super(executor, aVar, aVar2);
            Object[] objArr = {executor, aVar, aVar2, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ab2ae55afaf5ff67fae5ffe375e0bd0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ab2ae55afaf5ff67fae5ffe375e0bd0");
            } else {
                this.b = dVar;
            }
        }

        @Override // com.meituan.msc.common.support.java.util.concurrent.a.e
        public final a<V> a(int i) {
            Object obj;
            a<V> aVar;
            com.meituan.msc.common.support.java.util.function.d<? super T, ? extends com.meituan.msc.common.support.java.util.concurrent.c<V>> dVar;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4edcfce223b6c50a4f156f1c634fea1", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4edcfce223b6c50a4f156f1c634fea1");
            }
            a<T> aVar2 = this.h;
            if (aVar2 == null || (obj = aVar2.b) == null || (aVar = this.g) == null || (dVar = this.b) == null) {
                return null;
            }
            if (aVar.b == null) {
                if (obj instanceof C0437a) {
                    Throwable th = ((C0437a) obj).a;
                    if (th != null) {
                        aVar.a(th, obj);
                    } else {
                        obj = null;
                    }
                }
                if (i <= 0) {
                    try {
                        if (!b()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        aVar.a(th2);
                    }
                }
                a<V> d = dVar.a(obj).d();
                Object obj2 = d.b;
                if (obj2 != null) {
                    aVar.b(obj2);
                } else {
                    d.a(new m(aVar, d));
                    if (aVar.b == null) {
                        return null;
                    }
                }
            }
            this.h = null;
            this.g = null;
            this.b = null;
            return aVar.a((a<?>) aVar2, i);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0068 -> B:24:0x007a). Please submit an issue!!! */
    private <V> a<V> b(Executor executor, com.meituan.msc.common.support.java.util.function.d<? super T, ? extends com.meituan.msc.common.support.java.util.concurrent.c<V>> dVar) {
        Object[] objArr = {null, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3415b055e97f0cb3821f467a564697bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3415b055e97f0cb3821f467a564697bd");
        }
        com.meituan.msc.common.support.java.util.a.a(dVar);
        a<V> aVar = (a<V>) e();
        Object obj = (Object) this.b;
        if (obj == null) {
            a((e) new j(null, aVar, this, dVar));
        } else {
            if (obj instanceof C0437a) {
                Throwable th = ((C0437a) obj).a;
                if (th != null) {
                    aVar.b = b(th, obj);
                    return aVar;
                }
                obj = (Object) null;
            }
            try {
                a<V> d2 = dVar.a(obj).d();
                Object obj2 = d2.b;
                if (obj2 != null) {
                    aVar.b = f(obj2);
                } else {
                    d2.a(new m(aVar, d2));
                }
            } catch (Throwable th2) {
                com.meituan.msc.modules.reporter.g.b("CompletableFuture", th2, "uniComposeStage");
                aVar.b = d(th2);
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class b<T, U, V> extends i<T, V> {
        public a<U> a;

        public b(Executor executor, a<V> aVar, a<T> aVar2, a<U> aVar3) {
            super(null, aVar, aVar2);
            this.a = aVar3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class d extends e {
        public static ChangeQuickRedirect a;
        public b<?, ?, ?> b;

        public d(b<?, ?, ?> bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "127770bc8d4ba03e17fbb2aa32452da9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "127770bc8d4ba03e17fbb2aa32452da9");
            } else {
                this.b = bVar;
            }
        }

        @Override // com.meituan.msc.common.support.java.util.concurrent.a.e
        public final a<?> a(int i) {
            a<?> a2;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e50860fd3f8771c06d161eb44bd8923", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e50860fd3f8771c06d161eb44bd8923");
            }
            b<?, ?, ?> bVar = this.b;
            if (bVar == null || (a2 = bVar.a(i)) == null) {
                return null;
            }
            this.b = null;
            return a2;
        }

        @Override // com.meituan.msc.common.support.java.util.concurrent.a.e
        public final boolean a() {
            b<?, ?, ?> bVar = this.b;
            return (bVar == null || bVar.g == null) ? false : true;
        }
    }

    private void a(a<?> aVar, b<?, ?, ?> bVar) {
        Object[] objArr = {aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2463dbfcd26d0d1863d24eaed0145fc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2463dbfcd26d0d1863d24eaed0145fc9");
            return;
        }
        while (this.b == null) {
            if (b((e) bVar)) {
                if (aVar.b == null) {
                    aVar.a((e) new d(bVar));
                    return;
                } else if (this.b != null) {
                    bVar.a(0);
                    return;
                } else {
                    return;
                }
            }
        }
        aVar.a((e) bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class c<T, U> extends b<T, U, Void> {
        public static ChangeQuickRedirect b;

        public c(a<Void> aVar, a<T> aVar2, a<U> aVar3) {
            super(null, aVar, aVar2, aVar3);
            Object[] objArr = {aVar, aVar2, aVar3};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "914cfb07c3039ee2ca9a1daf4e5022f2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "914cfb07c3039ee2ca9a1daf4e5022f2");
            }
        }

        @Override // com.meituan.msc.common.support.java.util.concurrent.a.e
        public final a<Void> a(int i) {
            Object obj;
            a<U> aVar;
            Object obj2;
            a<V> aVar2;
            Throwable th;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "210edbe37aa1d2d682323324495fd78d", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "210edbe37aa1d2d682323324495fd78d");
            }
            a<T> aVar3 = this.h;
            if (aVar3 == null || (obj = aVar3.b) == null || (aVar = this.a) == null || (obj2 = aVar.b) == null || (aVar2 = this.g) == 0) {
                return null;
            }
            if (aVar2.b == null) {
                if (!(obj instanceof C0437a) || (th = ((C0437a) obj).a) == null) {
                    if (!(obj2 instanceof C0437a) || (th = ((C0437a) obj2).a) == null) {
                        aVar2.a();
                    } else {
                        obj = obj2;
                    }
                }
                aVar2.a(th, obj);
            }
            this.h = null;
            this.a = null;
            this.g = null;
            Object[] objArr2 = {aVar3, aVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "7caef6a3d7a3db141d075d383ca1f659", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "7caef6a3d7a3db141d075d383ca1f659");
            }
            if (aVar != null && aVar.c != null) {
                Object obj3 = aVar.b;
                if (obj3 == null) {
                    aVar.c();
                }
                if (i >= 0 && (obj3 != null || aVar.b != null)) {
                    aVar.b();
                }
            }
            return aVar2.a((a<?>) aVar3, i);
        }
    }

    private static a<Void> a(a<?>[] aVarArr, int i2, int i3) {
        a<?> a2;
        a<?> a3;
        Object obj;
        Throwable th;
        Object[] objArr = {aVarArr, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "039e0020817ccd6b457b28a7975a4fcc", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "039e0020817ccd6b457b28a7975a4fcc");
        }
        a<Void> aVar = new a<>();
        if (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            if (i2 == i4) {
                a2 = aVarArr[i2];
            } else {
                a2 = a(aVarArr, i2, i4);
            }
            if (a2 != null) {
                if (i2 == i3) {
                    a3 = a2;
                } else {
                    int i5 = i4 + 1;
                    a3 = i3 == i5 ? aVarArr[i3] : a(aVarArr, i5, i3);
                }
                if (a3 != null) {
                    Object obj2 = a2.b;
                    if (obj2 == null || (obj = a3.b) == null) {
                        a2.a(a3, new c(aVar, a2, a3));
                    } else {
                        if (!(obj2 instanceof C0437a) || (th = ((C0437a) obj2).a) == null) {
                            if ((obj instanceof C0437a) && (th = ((C0437a) obj).a) != null) {
                                obj2 = obj;
                            }
                        }
                        aVar.b = b(th, obj2);
                    }
                    return aVar;
                }
            }
            throw new NullPointerException();
        }
        aVar.b = d;
        return aVar;
    }

    public a() {
    }

    private a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e373345c6f22cd51359dcad9d257706", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e373345c6f22cd51359dcad9d257706");
        } else {
            this.b = obj;
        }
    }

    public static <U> a<U> c(U u) {
        Object[] objArr = {u};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7de7247d134f48b1c0118ec9a96107aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7de7247d134f48b1c0118ec9a96107aa");
        }
        if (u == null) {
            u = (U) d;
        }
        return new a<>(u);
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.b != null;
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c585ce133e1d95dea32aa74a38ab89f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c585ce133e1d95dea32aa74a38ab89f4");
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public T get(long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        Object[] objArr = {new Long(j2), timeUnit};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fa46127de53f2e534ed08a14c5a5d06", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fa46127de53f2e534ed08a14c5a5d06");
        }
        throw new UnsupportedOperationException();
    }

    public final boolean d(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea68452bc8673df9c24614d5341e7f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea68452bc8673df9c24614d5341e7f5")).booleanValue();
        }
        boolean a2 = a((a<T>) t);
        b();
        return a2;
    }

    public final boolean b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3648d788160c023dea6e2ab5eaf59a4d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3648d788160c023dea6e2ab5eaf59a4d")).booleanValue();
        }
        boolean e2 = e(new C0437a((Throwable) com.meituan.msc.common.support.java.util.a.a(th)));
        b();
        return e2;
    }

    public final <U> a<U> a(com.meituan.msc.common.support.java.util.function.d<? super T, ? extends U> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcc1116e158fac56e60ed1d7df7af292", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcc1116e158fac56e60ed1d7df7af292") : (a<U>) a((Executor) null, dVar);
    }

    public final a<Void> a(com.meituan.msc.common.support.java.util.function.c<? super T> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61223e03df1686b32107696b2e42c8be", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61223e03df1686b32107696b2e42c8be");
        }
        Object[] objArr2 = {null, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9326c07b73030e9f89c08e930690b8c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9326c07b73030e9f89c08e930690b8c7");
        }
        com.meituan.msc.common.support.java.util.a.a(cVar);
        Object obj = this.b;
        if (obj != null) {
            return a(obj, (Executor) null, cVar);
        }
        a e2 = e();
        a((e) new g(null, e2, this, cVar));
        return e2;
    }

    public final <U> a<U> b(com.meituan.msc.common.support.java.util.function.d<? super T, ? extends com.meituan.msc.common.support.java.util.concurrent.c<U>> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61f9acee71a64c6d4a0a4d7f85e9b121", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61f9acee71a64c6d4a0a4d7f85e9b121") : (a<U>) b((Executor) null, dVar);
    }

    public final a<T> a(com.meituan.msc.common.support.java.util.function.a<? super T, ? super Throwable> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5216a759db909d5105361f41c31ca78e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5216a759db909d5105361f41c31ca78e");
        }
        Object[] objArr2 = {null, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10666c312a9e75c5e1a5bb4ed79a22cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10666c312a9e75c5e1a5bb4ed79a22cb");
        }
        com.meituan.msc.common.support.java.util.a.a(aVar);
        a<T> aVar2 = (a<T>) e();
        Object obj = this.b;
        if (obj == null) {
            a((e) new n(null, aVar2, this, aVar));
        } else {
            aVar2.a(obj, aVar, (n) null);
        }
        return aVar2;
    }

    public final <U> a<U> a(com.meituan.msc.common.support.java.util.function.b<? super T, Throwable, ? extends U> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdaba0f66461e6f913f3fb30cf7e91e2", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdaba0f66461e6f913f3fb30cf7e91e2") : (a<U>) a((Executor) null, bVar);
    }

    public final a<T> c(com.meituan.msc.common.support.java.util.function.d<Throwable, ? extends T> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bb588fd2dd944f97a84c8c276713fe2", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bb588fd2dd944f97a84c8c276713fe2");
        }
        Object[] objArr2 = {null, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f291235742414ae31b0c75476dde9dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f291235742414ae31b0c75476dde9dc");
        }
        com.meituan.msc.common.support.java.util.a.a(dVar);
        a<T> aVar = (a<T>) e();
        Object obj = this.b;
        if (obj == null) {
            a((e) new k(null, aVar, this, dVar));
        } else {
            aVar.a(obj, dVar, (k) null);
        }
        return aVar;
    }

    public static a<Void> a(a<?>... aVarArr) {
        Object[] objArr = {aVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9488be197aba20c35ebc599de7556e35", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9488be197aba20c35ebc599de7556e35") : a(aVarArr, 0, aVarArr.length - 1);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12e3d36de14faaef3ddcb2a5c302ea00", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12e3d36de14faaef3ddcb2a5c302ea00")).booleanValue();
        }
        boolean z2 = this.b == null && e(new C0437a(new CancellationException()));
        b();
        return z2 || isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Object obj = this.b;
        return (obj instanceof C0437a) && (((C0437a) obj).a instanceof CancellationException);
    }

    public String toString() {
        String str;
        C0437a c0437a;
        int i2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8696a5b5018caa66ffeed74bcb34d0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8696a5b5018caa66ffeed74bcb34d0d");
        }
        Object obj = this.b;
        for (e eVar = this.c; eVar != null; eVar = eVar.d) {
            i2++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (obj != null) {
            if (obj instanceof C0437a) {
                if (((C0437a) obj).a != null) {
                    str = "[Completed exceptionally: " + c0437a.a + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
                }
            }
            str = "[Completed normally]";
        } else if (i2 == 0) {
            str = "[Not completed]";
        } else {
            str = "[Not completed, " + i2 + " dependents]";
        }
        sb.append(str);
        return sb.toString();
    }

    private <U> a<U> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b3bd8a483046cd17e0987adae238c3f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b3bd8a483046cd17e0987adae238c3f") : new a<>();
    }

    public static <U> a<U> c(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "717ba60405c7a64716b643f8e2fb9de3", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "717ba60405c7a64716b643f8e2fb9de3") : new a<>(new C0437a((Throwable) com.meituan.msc.common.support.java.util.a.a(th)));
    }
}
