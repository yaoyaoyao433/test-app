package com.meituan.mmp.lib.api.selectedDialog;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "972374640dbaf3a67018779b5eca9be7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "972374640dbaf3a67018779b5eca9be7");
            return;
        }
        this.c = str;
        this.b = onClickListener;
    }
}
