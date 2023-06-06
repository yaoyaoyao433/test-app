package com.sankuai.waimai.alita.core.event.autorunner;

import android.os.Handler;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private final Handler b;
    private final Runnable c;
    private final long d;
    private boolean e;

    public h(@IntRange(from = 1) long j, @NonNull Handler handler, @NonNull final Runnable runnable) {
        Object[] objArr = {new Long(j), handler, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5c9a61e3377a85bb20474ec66a10289", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5c9a61e3377a85bb20474ec66a10289");
            return;
        }
        this.e = false;
        this.d = j;
        this.b = handler;
        this.c = new Runnable() { // from class: com.sankuai.waimai.alita.core.event.autorunner.h.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78e64f6c52ae611c0cd362784c78dca8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78e64f6c52ae611c0cd362784c78dca8");
                    return;
                }
                try {
                    runnable.run();
                    h.this.a(0L);
                } catch (Exception unused) {
                }
            }
        };
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4550042b8185931165225751bdf73b98", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4550042b8185931165225751bdf73b98")).booleanValue() : b(0L);
    }

    private boolean b(long j) {
        Object[] objArr = {0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1142781dfbb0513ebab1f6b98e39bed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1142781dfbb0513ebab1f6b98e39bed")).booleanValue();
        }
        if (this.e) {
            return false;
        }
        this.e = true;
        a(0L);
        return true;
    }

    void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "462782500d1d91803e77e7a6b350e218", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "462782500d1d91803e77e7a6b350e218");
        } else if (this.e) {
            this.b.postDelayed(this.c, this.d + j);
        }
    }

    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7db80e6e8e3a88c280687543909aa605", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7db80e6e8e3a88c280687543909aa605");
            return;
        }
        this.e = false;
        this.b.removeCallbacks(this.c);
    }
}
