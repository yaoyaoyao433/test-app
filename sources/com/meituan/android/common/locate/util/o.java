package com.meituan.android.common.locate.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public abstract class o<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean a;
    private Throwable b;

    public o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eee167013178e2333de962621743ffa7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eee167013178e2333de962621743ffa7");
        } else {
            this.a = false;
        }
    }

    private Runnable d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ce769afbfda630ca09d2a1c6ede9a06", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ce769afbfda630ca09d2a1c6ede9a06") : new Runnable() { // from class: com.meituan.android.common.locate.util.o.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4812ce6dccfb394c4ecb5849a02f403c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4812ce6dccfb394c4ecb5849a02f403c");
                    return;
                }
                final Object b = o.this.b(new Void[0]);
                if (o.this.b != null) {
                    FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.util.o.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e351bd479e9b9aa6c31f7fd5ff91b3dd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e351bd479e9b9aa6c31f7fd5ff91b3dd");
                            } else {
                                o.this.a(o.this.b);
                            }
                        }
                    });
                } else {
                    FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.util.o.1.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b003660bad85bc032f7224ae98d41d3d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b003660bad85bc032f7224ae98d41d3d");
                            } else {
                                o.this.a((o) b);
                            }
                        }
                    });
                }
            }
        };
    }

    public void a() {
        this.a = true;
    }

    public abstract void a(T t);

    public abstract void a(Throwable th);

    public abstract T b(Void... voidArr);

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc5985e58587c7a59524df5dabd02f56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc5985e58587c7a59524df5dabd02f56");
        } else {
            g.a().a(d());
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61d7e3e0606410c0618792f0dc58ab70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61d7e3e0606410c0618792f0dc58ab70");
        } else {
            g.a().a(d(), true);
        }
    }
}
