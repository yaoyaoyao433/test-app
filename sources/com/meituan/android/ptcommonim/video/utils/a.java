package com.meituan.android.ptcommonim.video.utils;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36afa31fb1d6d4477123633a460beb0d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36afa31fb1d6d4477123633a460beb0d")).booleanValue() : (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public static boolean a(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df502e96cbd3a09468e0ec482d1ab773", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df502e96cbd3a09468e0ec482d1ab773")).booleanValue() : fragment != null && fragment.isAdded() && a(fragment.getActivity());
    }

    public static void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccd9cce5dbdb86c7af715a523611bc46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccd9cce5dbdb86c7af715a523611bc46");
        } else if (a(activity)) {
            activity.finish();
        }
    }
}
