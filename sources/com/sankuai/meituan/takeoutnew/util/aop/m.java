package com.sankuai.meituan.takeoutnew.util.aop;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class m implements Executor {
    public static ChangeQuickRedirect a;
    private Executor b;
    private ArrayDeque<Runnable> c;
    private Runnable d;

    public m(Executor executor) {
        Object[] objArr = {executor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb669da79eebc9c353656da0f559177a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb669da79eebc9c353656da0f559177a");
            return;
        }
        this.c = new ArrayDeque<>();
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eef73918266fec86697a63cff960a587", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eef73918266fec86697a63cff960a587");
            return;
        }
        this.c.offer(new Runnable() { // from class: com.sankuai.meituan.takeoutnew.util.aop.m.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "effab334143ba96715d7a646067be527", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "effab334143ba96715d7a646067be527");
                    return;
                }
                try {
                    runnable.run();
                } finally {
                    m.this.a();
                }
            }

            @NonNull
            public final String toString() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92d937198438ebe0292a7e2fb7d47360", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92d937198438ebe0292a7e2fb7d47360") : runnable == null ? super.toString() : runnable.toString();
            }
        });
        if (this.d == null) {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e63295f685aee698e85fe05a6b08bc14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e63295f685aee698e85fe05a6b08bc14");
            return;
        }
        Runnable poll = this.c.poll();
        this.d = poll;
        if (poll != null) {
            this.b.execute(this.d);
        }
    }
}
