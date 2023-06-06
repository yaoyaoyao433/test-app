package com.sankuai.waimai.touchmatrix.utils;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public static volatile boolean b;
    public static volatile boolean c;

    public static boolean a(@NonNull Activity activity) {
        ViewGroup viewGroup;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13dc301b2d9dede836b99286a2dabf56", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13dc301b2d9dede836b99286a2dabf56")).booleanValue();
        }
        if (activity != null && !activity.isFinishing() && (viewGroup = (ViewGroup) activity.getWindow().getDecorView()) != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                viewGroup.getChildAt(i).getContext().getPackageName();
                if (viewGroup.getChildAt(i).getId() != -1 && "navigationBarBackground".equals(activity.getResources().getResourceEntryName(viewGroup.getChildAt(i).getId()))) {
                    return true;
                }
            }
        }
        return false;
    }
}
