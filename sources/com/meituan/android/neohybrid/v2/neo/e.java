package com.meituan.android.neohybrid.v2.neo;

import android.content.Intent;
import com.meituan.android.neohybrid.v2.neo.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements b.a {
    public static ChangeQuickRedirect a;
    private final int b;
    private final int c;
    private final Intent d;

    public e(int i, int i2, Intent intent) {
        this.b = i;
        this.c = i2;
        this.d = intent;
    }

    @Override // com.meituan.android.neohybrid.v2.neo.b.a
    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c37ece5dcf0cdf395635027241cdf0ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c37ece5dcf0cdf395635027241cdf0ef");
            return;
        }
        int i = this.b;
        int i2 = this.c;
        Intent intent = this.d;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5d97f937be84173de172d1d442862c3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5d97f937be84173de172d1d442862c3b");
        } else {
            aVar.a(i, i2, intent);
        }
    }
}
