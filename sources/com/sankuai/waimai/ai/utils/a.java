package com.sankuai.waimai.ai.utils;

import android.os.Handler;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public boolean b;
    private final Handler c;
    private final Runnable d;
    private final long e;

    public a(@IntRange(from = 1) long j, @NonNull Handler handler, @NonNull final Runnable runnable) {
        Object[] objArr = {Long.valueOf((long) PayTask.j), handler, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "456ec8b9128d9e027e7c07437fb8b534", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "456ec8b9128d9e027e7c07437fb8b534");
            return;
        }
        this.b = false;
        this.e = PayTask.j;
        this.c = handler;
        this.d = new Runnable() { // from class: com.sankuai.waimai.ai.utils.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b531e520d6332b910b6af8ab5997fc7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b531e520d6332b910b6af8ab5997fc7");
                    return;
                }
                try {
                    runnable.run();
                    a.this.a(0L);
                } catch (Exception unused) {
                }
            }
        };
    }

    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a15f233ddddab9557473e9ded820f596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a15f233ddddab9557473e9ded820f596");
        } else if (this.b) {
            this.c.postDelayed(this.d, this.e + j);
        }
    }

    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "763a6f0e17a43c4037457eeed1fad59c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "763a6f0e17a43c4037457eeed1fad59c");
            return;
        }
        this.b = false;
        this.c.removeCallbacks(this.d);
    }
}
