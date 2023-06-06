package com.sankuai.waimai.store.logcenter;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements Runnable {
    public static ChangeQuickRedirect a;
    Handler b;
    int c;
    @NonNull
    private final a d;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(boolean z);
    }

    public e(@NotNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc199aeb9f92a7d21e699367bd2eb7b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc199aeb9f92a7d21e699367bd2eb7b2");
            return;
        }
        this.b = new Handler(Looper.getMainLooper());
        this.c = 0;
        this.d = aVar;
    }

    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d2b18d98075e480488a8e797ff68e2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d2b18d98075e480488a8e797ff68e2e");
            return;
        }
        this.c = 0;
        this.b.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d15dab1cb5b9cdfa045e5b0f3346b50a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d15dab1cb5b9cdfa045e5b0f3346b50a");
        } else {
            this.d.a(this.c >= 5);
        }
    }
}
