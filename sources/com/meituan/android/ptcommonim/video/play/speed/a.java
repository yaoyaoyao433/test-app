package com.meituan.android.ptcommonim.video.play.speed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends d {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.ptcommonim.video.play.speed.d
    public final float a() {
        return 1.5f;
    }

    @Override // com.meituan.android.ptcommonim.video.play.speed.d
    public final String a(boolean z) {
        return "1.5倍";
    }

    @Override // com.meituan.android.ptcommonim.video.play.speed.d
    public final int b() {
        return 3;
    }

    @Override // com.meituan.android.ptcommonim.video.play.speed.d
    public final d c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d007a6f110470ad437822dd6ab44977", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d007a6f110470ad437822dd6ab44977") : new b();
    }
}
