package com.meituan.android.ptcommonim.utils;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.session.SessionFragment;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Activity a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b81809b58941c32d2ad34b8d091e50dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b81809b58941c32d2ad34b8d091e50dd");
        }
        SessionFragment a2 = com.sankuai.xm.imui.session.b.a(view);
        if (a2 == null) {
            return null;
        }
        return a2.getActivity();
    }
}
