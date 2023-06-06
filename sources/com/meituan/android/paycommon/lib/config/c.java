package com.meituan.android.paycommon.lib.config;

import android.content.Context;
import com.meituan.android.paybase.config.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements a.InterfaceC0330a {
    public static ChangeQuickRedirect a;
    private final Context b;

    public c(Context context) {
        this.b = context;
    }

    @Override // com.meituan.android.paybase.config.a.InterfaceC0330a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06546978236b9710e6057c05f041ddf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06546978236b9710e6057c05f041ddf0");
        } else {
            a.b(this.b);
        }
    }
}
