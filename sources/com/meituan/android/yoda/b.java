package com.meituan.android.yoda;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final YodaConfirm b;

    public b(YodaConfirm yodaConfirm) {
        this.b = yodaConfirm;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a5beeb85ddb5568a3e07fa44707fd16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a5beeb85ddb5568a3e07fa44707fd16");
        } else {
            YodaConfirm.lambda$getConcurrencyInvokeFilter$0(this.b, obj);
        }
    }
}
