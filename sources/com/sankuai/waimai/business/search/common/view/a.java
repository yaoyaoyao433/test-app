package com.sankuai.waimai.business.search.common.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends FrameLayout {
    public static ChangeQuickRedirect a;
    boolean b;
    boolean c;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f43dad14b5f31ccdd824031b61c1176e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f43dad14b5f31ccdd824031b61c1176e");
        }
    }

    public final void setUpwardSticky(boolean z) {
        this.b = z;
    }

    public final void setDownwardSticky(boolean z) {
        this.c = z;
    }
}
