package com.meituan.android.pike.taskqueue;

import com.meituan.android.pike.bean.PikeLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    protected C0346a b;

    public abstract void a();

    public abstract void b();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81a0138a90fd2f38417c5d6b856bf008", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81a0138a90fd2f38417c5d6b856bf008");
        } else {
            this.b = new C0346a();
        }
    }

    public final int a(com.meituan.android.pike.taskqueue.base.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f56b7a9e94bc10e79fc1eb793a947696", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f56b7a9e94bc10e79fc1eb793a947696")).intValue();
        }
        PikeLog.d("AbstractPump", "AbstractPump::run => pump running.");
        this.b.a = (b) aVar;
        this.b.a(false);
        this.b.a(0);
        b();
        int b = this.b.b();
        this.b.a = null;
        PikeLog.d("AbstractPump", "AbstractPump::run => pump stopped, code is " + b);
        return b;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.pike.taskqueue.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0346a {
        b a;
        private boolean b;
        private int c;

        public final synchronized boolean a() {
            return this.b;
        }

        public final synchronized void a(boolean z) {
            this.b = false;
        }

        public final synchronized int b() {
            return this.c;
        }

        public final synchronized void a(int i) {
            this.c = 0;
        }
    }
}
