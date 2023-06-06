package com.meituan.android.cube.core;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a extends g {
    public static ChangeQuickRedirect a;

    public a(@Nullable String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9526c2357b122761649517770e4736e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9526c2357b122761649517770e4736e0");
        }
    }

    @Override // com.meituan.android.cube.core.g, com.meituan.android.cube.delegate.a
    public final void a(@NonNull FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0a1d2fbb959e1af7bbd3e6333046835", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0a1d2fbb959e1af7bbd3e6333046835");
            return;
        }
        super.a(fragmentActivity, bundle);
        f f = f();
        if (f != null) {
            fragmentActivity.setContentView(f.i());
        }
    }
}
