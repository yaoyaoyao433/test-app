package com.meituan.android.cashier.activity;

import android.graphics.drawable.Drawable;
import com.meituan.android.paybase.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements f.a {
    public static ChangeQuickRedirect a;
    private final MTCashierActivity b;

    public c(MTCashierActivity mTCashierActivity) {
        this.b = mTCashierActivity;
    }

    @Override // com.meituan.android.paybase.utils.f.a
    public final void a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bad01e0f8b4bda68849190f9f7bed1ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bad01e0f8b4bda68849190f9f7bed1ca");
        } else {
            MTCashierActivity.a(this.b, drawable);
        }
    }
}
