package com.sankuai.waimai.alita.core.tasklistener;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.Exception;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b<K, V, E extends Exception> {
    public static ChangeQuickRedirect e;
    private final Map<K, d<V>> a;
    private Executor b;
    private boolean c;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.core.tasklistener.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0712b<K, V, E> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d<T> {
        public int a;
        public T b;
    }

    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42d58d75c8b21890a80cb39fdf60eacc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42d58d75c8b21890a80cb39fdf60eacc");
        }
        switch (i) {
            case 1:
                return "STATE_DOING";
            case 2:
                return "STATE_SUCCESS";
            case 3:
                return "STATE_FAIL";
            default:
                return "STATE_UNKNOWN";
        }
    }

    public void a(@NonNull Map<K, d<V>> map) {
    }

    public void b(@NonNull Map<K, d<V>> map) {
    }

    public void c(@NonNull Map<K, d<V>> map) {
    }

    public void d(@NonNull Map<K, d<V>> map) {
    }

    public void e(@NonNull Map<K, d<V>> map) {
    }

    public b() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23ad50633f1d1d31cc5dac05f950cf4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23ad50633f1d1d31cc5dac05f950cf4c");
        }
    }

    public b(Executor executor) {
        Object[] objArr = {executor};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e20ca95dbbaad9377e27a9737d15dca5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e20ca95dbbaad9377e27a9737d15dca5");
            return;
        }
        this.a = new HashMap();
        this.c = false;
        if (executor != null) {
            this.b = executor;
        } else {
            this.b = com.sankuai.android.jarvis.c.c("alita_callback_thread_pool");
        }
    }

    public final com.sankuai.waimai.alita.core.tasklistener.a<V, E> a(@NonNull K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a9cf85b152eee42348e2761bcf539f", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.alita.core.tasklistener.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a9cf85b152eee42348e2761bcf539f") : a(k, null);
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ddda0f5e9da5718c695f64e28cce8cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ddda0f5e9da5718c695f64e28cce8cb");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(this.b, new Runnable() { // from class: com.sankuai.waimai.alita.core.tasklistener.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8588b6008f1761221c96cd696f19c1be", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8588b6008f1761221c96cd696f19c1be");
                    } else {
                        b.this.a();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public boolean a;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;

        public a() {
            this.a = true;
            this.b = true;
            this.c = false;
            this.d = false;
            this.e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c<K, V, E extends Exception> implements com.sankuai.waimai.alita.core.tasklistener.a<V, E> {
        public static ChangeQuickRedirect a;
        private K b;
        private d<V> c;
        private b<K, V, E> d;
        private InterfaceC0712b<K, V, E> e;

        private c(@NonNull K k, d<V> dVar, b<K, V, E> bVar, @Nullable InterfaceC0712b<K, V, E> interfaceC0712b) {
            Object[] objArr = {k, dVar, bVar, interfaceC0712b};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99c0cf9a2efdb68eb801390fd3148f82", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99c0cf9a2efdb68eb801390fd3148f82");
                return;
            }
            this.b = k;
            this.c = dVar;
            this.d = bVar;
            this.e = interfaceC0712b;
        }

        @Override // com.sankuai.waimai.alita.core.tasklistener.a
        public final void a(@Nullable V v) {
            Object[] objArr = {v};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e05109cfa825b47e166b204d25cf9a55", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e05109cfa825b47e166b204d25cf9a55");
                return;
            }
            this.c.a = 2;
            this.c.b = v;
            this.d.b();
            Object[] objArr2 = {this.b, v};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "194f22e6fb1a75d7b344124b8ec18717", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "194f22e6fb1a75d7b344124b8ec18717");
            }
        }

        @Override // com.sankuai.waimai.alita.core.tasklistener.a
        public final void a(@Nullable E e) {
            Object[] objArr = {e};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcf85ad9b0caadb8a6e2ee68d7be6c24", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcf85ad9b0caadb8a6e2ee68d7be6c24");
                return;
            }
            this.c.a = 3;
            this.c.b = null;
            this.d.b();
            Object[] objArr2 = {this.b, e};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "021d003a5eb5e4d2fdd803e7f63fefd8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "021d003a5eb5e4d2fdd803e7f63fefd8");
            }
        }
    }

    private synchronized com.sankuai.waimai.alita.core.tasklistener.a<V, E> a(@NonNull K k, @Nullable InterfaceC0712b<K, V, E> interfaceC0712b) {
        Object[] objArr = {k, null};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcfaadda5f34f4728af3ce270423a006", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.alita.core.tasklistener.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcfaadda5f34f4728af3ce270423a006");
        }
        this.c = false;
        d<V> dVar = new d<>();
        dVar.a = 1;
        dVar.b = null;
        c cVar = new c(k, dVar, this, null);
        this.a.put(k, dVar);
        return cVar;
    }

    synchronized void a() {
        a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa0ace3684992ed7f72d8b404f253f28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa0ace3684992ed7f72d8b404f253f28");
            return;
        }
        if (!this.c) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99d7e54e118daa49ab404f8bd4acf562", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99d7e54e118daa49ab404f8bd4acf562");
            } else {
                a aVar2 = new a();
                aVar2.a = true;
                aVar2.b = true;
                aVar2.c = false;
                aVar2.d = false;
                aVar2.e = true;
                for (Map.Entry<K, d<V>> entry : this.a.entrySet()) {
                    if (entry != null && entry.getValue() != null) {
                        int i = entry.getValue().a;
                        aVar2.a &= i != 1;
                        aVar2.b &= i == 2;
                        aVar2.c |= i == 2;
                        aVar2.d |= i == 3;
                        aVar2.e = (i == 3) & aVar2.e;
                    }
                }
                aVar = aVar2;
            }
            if (aVar.c) {
                c(this.a);
            }
            if (aVar.b) {
                b(this.a);
            }
            if (aVar.d) {
                d(this.a);
            }
            if (aVar.e) {
                e(this.a);
            }
            if (aVar.a) {
                a((Map) this.a);
                this.c = true;
            }
        }
    }
}
