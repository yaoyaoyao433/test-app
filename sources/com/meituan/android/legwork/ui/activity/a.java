package com.meituan.android.legwork.ui.activity;

import android.os.Bundle;
import com.meituan.android.legwork.common.util.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements a.InterfaceC0264a {
    public static ChangeQuickRedirect a;
    private final ToSendOneMoreActivity b;
    private final Bundle c;

    public a(ToSendOneMoreActivity toSendOneMoreActivity, Bundle bundle) {
        this.b = toSendOneMoreActivity;
        this.c = bundle;
    }

    @Override // com.meituan.android.legwork.common.util.a.InterfaceC0264a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34c2a070bac95968e4c0f3360aea5f7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34c2a070bac95968e4c0f3360aea5f7c");
        } else {
            ToSendOneMoreActivity.a(this.b, this.c, z);
        }
    }
}
