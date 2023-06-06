package com.meituan.android.privacy.impl.permission;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e implements com.meituan.android.privacy.interfaces.d {
    public static ChangeQuickRedirect a;
    public com.meituan.android.privacy.interfaces.monitor.d b;
    public com.meituan.android.privacy.interfaces.d c;

    public e(com.meituan.android.privacy.interfaces.d dVar, com.meituan.android.privacy.interfaces.monitor.d dVar2) {
        Object[] objArr = {dVar, dVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0121e51b89dda3b38ee14270c5c5b435", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0121e51b89dda3b38ee14270c5c5b435");
            return;
        }
        this.c = dVar;
        this.b = dVar2;
    }

    @Override // com.meituan.android.privacy.interfaces.d
    public void onResult(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fbc16f0285d1fc55f487ccbbb43a700", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fbc16f0285d1fc55f487ccbbb43a700");
            return;
        }
        this.b.e = i;
        com.meituan.android.privacy.impl.b.a(this.b);
        this.c.onResult(str, i);
    }
}
