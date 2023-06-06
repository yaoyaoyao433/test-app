package com.sankuai.common.utils;

import android.os.Build;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WindowManagerLayoutParamsUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void setType(WindowManager.LayoutParams layoutParams, int i) {
        Object[] objArr = {layoutParams, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d4d6db4f66cba5fccf3ce4a9203caee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d4d6db4f66cba5fccf3ce4a9203caee9");
            return;
        }
        if (Build.VERSION.SDK_INT >= 26 && (i == 2002 || i == 2007 || i == 2003 || i == 2006 || i == 2010 || i == 2005)) {
            i = 2038;
        }
        if (layoutParams != null) {
            layoutParams.type = i;
        }
    }
}
