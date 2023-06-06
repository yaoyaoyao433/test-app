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
public final class a implements Runnable {
    public static ChangeQuickRedirect a;
    Handler b;
    @NonNull
    private final InterfaceC1216a c;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.logcenter.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1216a {
        void a();
    }

    public a(@NotNull InterfaceC1216a interfaceC1216a) {
        Object[] objArr = {interfaceC1216a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de3f308c049ee2d3e4f5cd5d0c714ff2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de3f308c049ee2d3e4f5cd5d0c714ff2");
            return;
        }
        this.b = new Handler(Looper.getMainLooper());
        this.c = interfaceC1216a;
    }

    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94746707c5386ea923b4942de09a4935", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94746707c5386ea923b4942de09a4935");
        } else {
            this.b.removeCallbacks(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c241b010cc4d049f5dbe689a7f45153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c241b010cc4d049f5dbe689a7f45153");
            return;
        }
        this.c.a();
        cancel();
    }
}
