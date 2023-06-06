package com.meituan.android.ptcommonim.feedback;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        private static final e a = new e();
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1890c2f690241288335ce0a6a637cc26", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1890c2f690241288335ce0a6a637cc26") : a.a;
    }

    public final void a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf((int) R.string.ptim_feedback_warning_network_error)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0baa2a57bbc84a4efe5eaf2443dcaa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0baa2a57bbc84a4efe5eaf2443dcaa3");
        } else if (context instanceof Activity) {
            com.meituan.android.ptcommonim.base.util.b.a(context, context.getString(R.string.ptim_feedback_warning_network_error));
        }
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bb7f4df7dc5af2187c9d00300fb0c64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bb7f4df7dc5af2187c9d00300fb0c64");
        } else if (context instanceof Activity) {
            com.meituan.android.ptcommonim.base.util.b.a(context, context.getString(R.string.ptim_feedback_warning_network_error));
        }
    }
}
