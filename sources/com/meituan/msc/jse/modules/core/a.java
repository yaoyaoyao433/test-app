package com.meituan.msc.jse.modules.core;

import android.view.Choreographer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    static a b;
    private Choreographer c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c781e9e9579d1df218655522ba5ed54d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c781e9e9579d1df218655522ba5ed54d");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.c = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "139f4e0fa91419b9cc0c666da2290e0a", RobustBitConfig.DEFAULT_VALUE) ? (Choreographer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "139f4e0fa91419b9cc0c666da2290e0a") : Choreographer.getInstance();
    }

    public final void a(AbstractC0445a abstractC0445a) {
        Object[] objArr = {abstractC0445a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d55b768731586cce6d97f2b5bed4d31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d55b768731586cce6d97f2b5bed4d31");
            return;
        }
        Choreographer.FrameCallback a2 = abstractC0445a.a();
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23f9b91a111992a4ce629638673aed80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23f9b91a111992a4ce629638673aed80");
        } else {
            this.c.postFrameCallback(a2);
        }
    }

    public final void b(AbstractC0445a abstractC0445a) {
        Object[] objArr = {abstractC0445a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcdb12106ceff55b8aa1ee1ff0b80193", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcdb12106ceff55b8aa1ee1ff0b80193");
            return;
        }
        Choreographer.FrameCallback a2 = abstractC0445a.a();
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23b0c3f6c15cdb31b0b95d296aa73844", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23b0c3f6c15cdb31b0b95d296aa73844");
        } else {
            this.c.removeFrameCallback(a2);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.jse.modules.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0445a {
        public static ChangeQuickRedirect a;
        private Choreographer.FrameCallback b;

        public abstract void a(long j);

        public final Choreographer.FrameCallback a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1acc0b870f61c361b79a8b8ec165bb3e", RobustBitConfig.DEFAULT_VALUE)) {
                return (Choreographer.FrameCallback) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1acc0b870f61c361b79a8b8ec165bb3e");
            }
            if (this.b == null) {
                this.b = new Choreographer.FrameCallback() { // from class: com.meituan.msc.jse.modules.core.a.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        Object[] objArr2 = {new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff9515e291e66ab7c04411a485175f5e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff9515e291e66ab7c04411a485175f5e");
                        } else {
                            AbstractC0445a.this.a(j);
                        }
                    }
                };
            }
            return this.b;
        }
    }
}
