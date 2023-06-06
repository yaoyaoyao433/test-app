package com.meituan.msc.modules.api.selectedDialog;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b61eb5036f950a64d4009e7baac5ff50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b61eb5036f950a64d4009e7baac5ff50");
            return;
        }
        this.c = str;
        this.b = onClickListener;
    }
}
