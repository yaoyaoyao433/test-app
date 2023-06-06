package com.meituan.android.ptcommonim.pageadapter.v2;

import android.content.Context;
import com.meituan.android.ptcommonim.model.PTSessionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final PTSessionInfo b;

    public b(Context context, PTSessionInfo pTSessionInfo) {
        Object[] objArr = {context, pTSessionInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a2357d86c8e288f4005b9066196cabe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a2357d86c8e288f4005b9066196cabe");
        } else {
            this.b = pTSessionInfo;
        }
    }
}
