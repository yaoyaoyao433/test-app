package com.meituan.msi.api.selectedDialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    View.OnClickListener b;
    String c;

    public a(View.OnClickListener onClickListener, String str) {
        Object[] objArr = {onClickListener, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b22c7837d3f2f7f1f22ff3f70070d830", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b22c7837d3f2f7f1f22ff3f70070d830");
            return;
        }
        this.c = str;
        this.b = onClickListener;
    }
}
