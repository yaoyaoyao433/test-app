package com.meituan.android.ptcommonim.video.play.speed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends d {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.ptcommonim.video.play.speed.d
    public final float a() {
        return 2.0f;
    }

    @Override // com.meituan.android.ptcommonim.video.play.speed.d
    public final String a(boolean z) {
        return "2.0倍";
    }

    @Override // com.meituan.android.ptcommonim.video.play.speed.d
    public final int b() {
        return 4;
    }

    @Override // com.meituan.android.ptcommonim.video.play.speed.d
    public final d c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caba463f1a7869937a34ea4ceb627151", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caba463f1a7869937a34ea4ceb627151") : new c();
    }
}
