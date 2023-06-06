package com.meituan.android.paybase.screen;

import android.view.View;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static b h;
    int b;
    int c;
    float d;
    boolean e;
    float f;
    float g;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        com.meituan.android.paybase.screen.a a();
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d0c45b475ff96fc7f1c126020e02702", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d0c45b475ff96fc7f1c126020e02702");
            return;
        }
        this.b = 0;
        this.c = 0;
        this.d = 0.0f;
        this.e = false;
    }

    @MTPaySuppressFBWarnings({"LI_LAZY_INIT_STATIC"})
    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb7b9fefe555c57af2479405c686f055", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb7b9fefe555c57af2479405c686f055");
        }
        if (h == null) {
            h = new b();
        }
        return h;
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ac0b3183c2c4606724fc41fb54457e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ac0b3183c2c4606724fc41fb54457e3")).intValue();
        }
        float b = b(i);
        if (i > 0 && ((int) b) == 0) {
            b = 1.0f;
        } else if (i < 0 && ((int) b) == 0) {
            b = -1.0f;
        }
        return Math.round(b);
    }

    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a66d58207762da6e6a0c372d2d55980", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a66d58207762da6e6a0c372d2d55980")).intValue();
        }
        float a2 = a(i);
        if (i > 0 && ((int) a2) == 0) {
            a2 = 1.0f;
        } else if (i < 0 && ((int) a2) == 0) {
            a2 = -1.0f;
        }
        return Math.round(a2);
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "703770ec83ed56c55c7d7be25058bc42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "703770ec83ed56c55c7d7be25058bc42");
        } else if (view != null && (view.getLayoutParams() instanceof a)) {
            ((a) view.getLayoutParams()).a().a(view);
        }
    }

    private float b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e785273b0b9c8985c473af9bdcdd269a", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e785273b0b9c8985c473af9bdcdd269a")).floatValue() : (this.b <= 0 || this.f <= 0.0f) ? f : f * this.f;
    }

    public final float a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5688d2e7af8b9120f5b49f9576a90e9", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5688d2e7af8b9120f5b49f9576a90e9")).floatValue() : (this.c <= 0 || this.g <= 0.0f) ? f : f * this.g;
    }
}
