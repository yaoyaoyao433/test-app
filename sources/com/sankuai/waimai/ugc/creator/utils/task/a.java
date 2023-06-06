package com.sankuai.waimai.ugc.creator.utils.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a<R> implements Runnable {
    public static ChangeQuickRedirect e;
    private final AtomicBoolean a;
    private final AtomicReference<Thread> b;

    public void a() {
    }

    public abstract void a(R r);

    public void a(Throwable th) {
    }

    public abstract R b() throws Exception;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fef94b407acf62f0c48ddbbe74f9645", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fef94b407acf62f0c48ddbbe74f9645");
            return;
        }
        this.a = new AtomicBoolean(false);
        this.b = new AtomicReference<>();
    }

    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fd533c126fd73d626752920bd777457", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fd533c126fd73d626752920bd777457");
            return;
        }
        this.a.set(true);
        Thread thread = this.b.get();
        if (thread != null) {
            thread.interrupt();
        }
        b.b(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.utils.task.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "462a496d8e081517a8392150feb61e79", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "462a496d8e081517a8392150feb61e79");
                } else {
                    a.this.a();
                }
            }
        });
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03ba492941b603b21ab94ade21c04bfd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03ba492941b603b21ab94ade21c04bfd")).booleanValue() : this.a.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dc0d37563ddc2d587d24b603947a104", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dc0d37563ddc2d587d24b603947a104");
            return;
        }
        try {
            b.b(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.utils.task.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5eb23ca506b8500c19a058e0f74421d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5eb23ca506b8500c19a058e0f74421d");
                    } else if (a.this.c()) {
                    } else {
                        a aVar = a.this;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a.e;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "1673dec1e9d70b4bc0fbb72ffaf6e502", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "1673dec1e9d70b4bc0fbb72ffaf6e502");
                        }
                    }
                }
            });
            this.b.compareAndSet(null, Thread.currentThread());
            this.a.set(false);
            final R b = b();
            b.b(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.utils.task.a.3
                public static ChangeQuickRedirect a;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ffe546a72b3ae3cfd2754e1c1f94306a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ffe546a72b3ae3cfd2754e1c1f94306a");
                    } else if (a.this.c()) {
                    } else {
                        a.this.a((a) b);
                    }
                }
            });
        } catch (Throwable th) {
            b.b(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.utils.task.a.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5a83fb2df4eecd8014f44ea770173f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5a83fb2df4eecd8014f44ea770173f3");
                    } else if (a.this.c()) {
                    } else {
                        a.this.a(th);
                    }
                }
            });
        }
    }
}
