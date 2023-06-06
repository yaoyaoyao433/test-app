package com.meituan.android.neohybrid.core;

import android.webkit.ValueCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements ValueCallback {
    public static ChangeQuickRedirect a;
    private final n b;
    private final String c;

    private r(n nVar, String str) {
        this.b = nVar;
        this.c = str;
    }

    public static ValueCallback a(n nVar, String str) {
        Object[] objArr = {nVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a10fd5e46698b57646d60c256ce1fca2", RobustBitConfig.DEFAULT_VALUE) ? (ValueCallback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a10fd5e46698b57646d60c256ce1fca2") : new r(nVar, str);
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e81fcb3a8d18574a36fde6eb39740c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e81fcb3a8d18574a36fde6eb39740c2");
        } else {
            n.a(this.b, this.c, (String) obj);
        }
    }
}
