package com.meituan.android.pike.taskqueue;

import com.meituan.android.pike.bean.PikeLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends a {
    public static ChangeQuickRedirect c;
    private c d;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1465fef9a3f7ff2d8ee0e7cc0ae169e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1465fef9a3f7ff2d8ee0e7cc0ae169e9");
        } else {
            this.d = new c();
        }
    }

    @Override // com.meituan.android.pike.taskqueue.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01e1c50fda581c716455bd67f46274f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01e1c50fda581c716455bd67f46274f8");
            return;
        }
        PikeLog.d("TaskPump", "TaskPump::notifySignal");
        c cVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "e1678bab6b57edec27e5c96e86d98f77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "e1678bab6b57edec27e5c96e86d98f77");
            return;
        }
        synchronized (cVar.b) {
            cVar.c++;
            cVar.b.notify();
        }
    }

    @Override // com.meituan.android.pike.taskqueue.a
    public final void b() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f825dfe471ccd5f922463df6297f8028", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f825dfe471ccd5f922463df6297f8028");
            return;
        }
        while (true) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41e2da30f962a11554d6115e6e8e5ce1", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41e2da30f962a11554d6115e6e8e5ce1")).booleanValue();
            } else {
                PikeLog.d("TaskPump", "TaskPump::processNextMessage");
                z = false;
            }
            if (this.b.a()) {
                return;
            }
            this.b.a.d();
            if (this.b.a()) {
                return;
            }
            long e = this.b.a.e();
            if (this.b.a()) {
                return;
            }
            if (!z) {
                Object[] objArr3 = {new Long(e)};
                ChangeQuickRedirect changeQuickRedirect3 = c;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a3eca0b0e608e4e3cef75a12b6aa0d8f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a3eca0b0e608e4e3cef75a12b6aa0d8f");
                } else {
                    PikeLog.d("TaskPump", "TaskPump::waitSignal => timeout = " + e);
                    c cVar = this.d;
                    Object[] objArr4 = {new Long(e)};
                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                    if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "c3f645b8df6824349111de42ee0580ed", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "c3f645b8df6824349111de42ee0580ed");
                    } else {
                        synchronized (cVar.b) {
                            if (cVar.c == 0) {
                                Object[] objArr5 = {new Long(e)};
                                ChangeQuickRedirect changeQuickRedirect5 = c.a;
                                if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "6df63ad90394408110b60f98fcc42ff1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "6df63ad90394408110b60f98fcc42ff1");
                                } else if (e > 0) {
                                    try {
                                        cVar.b.wait(e);
                                    } catch (InterruptedException unused) {
                                    }
                                }
                            }
                            cVar.c = 0L;
                        }
                    }
                }
            }
        }
    }
}
