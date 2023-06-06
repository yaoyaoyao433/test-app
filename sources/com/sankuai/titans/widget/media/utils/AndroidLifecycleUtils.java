package com.sankuai.titans.widget.media.utils;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AndroidLifecycleUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean canLoadImage(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bed6145178b42055f70456fc0251b56e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bed6145178b42055f70456fc0251b56e")).booleanValue();
        }
        if (fragment == null) {
            return true;
        }
        return canLoadImage((Activity) fragment.getActivity());
    }

    public static boolean canLoadImage(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b96caabcedcc8d92d8a2dd20f656159", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b96caabcedcc8d92d8a2dd20f656159")).booleanValue();
        }
        if (context != null && (context instanceof Activity)) {
            return canLoadImage((Activity) context);
        }
        return true;
    }

    public static boolean canLoadImage(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17100b6642542ee3bf8ddd90ee06975f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17100b6642542ee3bf8ddd90ee06975f")).booleanValue();
        }
        if (activity == null) {
            return true;
        }
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
