package com.meituan.android.ptcommonim.video.play.speed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends d {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.ptcommonim.video.play.speed.d
    public final float a() {
        return 1.0f;
    }

    @Override // com.meituan.android.ptcommonim.video.play.speed.d
    public final String a(boolean z) {
        return z ? "变速" : "倍速";
    }

    @Override // com.meituan.android.ptcommonim.video.play.speed.d
    public final int b() {
        return 2;
    }

    @Override // com.meituan.android.ptcommonim.video.play.speed.d
    public final d c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfc99724fdd8c51b29c1588179c29c65", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfc99724fdd8c51b29c1588179c29c65") : new a();
    }
}
