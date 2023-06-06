package com.meituan.android.legwork.ui.activity;

import android.os.Bundle;
import com.meituan.android.legwork.ui.util.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements a.InterfaceC0275a {
    public static ChangeQuickRedirect a;
    private final ToSendOneMoreActivity b;
    private final Bundle c;

    private b(ToSendOneMoreActivity toSendOneMoreActivity, Bundle bundle) {
        this.b = toSendOneMoreActivity;
        this.c = bundle;
    }

    public static a.InterfaceC0275a a(ToSendOneMoreActivity toSendOneMoreActivity, Bundle bundle) {
        Object[] objArr = {toSendOneMoreActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "925ad26677a1ecd2ab142404904b3c73", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0275a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "925ad26677a1ecd2ab142404904b3c73") : new b(toSendOneMoreActivity, bundle);
    }

    @Override // com.meituan.android.legwork.ui.util.a.InterfaceC0275a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dc9f55124fe767ad7341e434c7aaada", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dc9f55124fe767ad7341e434c7aaada");
        } else {
            ToSendOneMoreActivity.a(this.b, this.c, i);
        }
    }
}
