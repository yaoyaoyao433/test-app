package com.meituan.android.hybridcashier.config.horn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements com.meituan.android.neohybrid.base.model.c {
    public static ChangeQuickRedirect a;
    private static final b b = new b();

    public static com.meituan.android.neohybrid.base.model.c a() {
        return b;
    }

    @Override // com.meituan.android.neohybrid.base.model.c
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af26b724fa599724325fb7880fc46ebc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af26b724fa599724325fb7880fc46ebc");
        } else {
            a.a((String) obj);
        }
    }
}
