package com.meituan.android.legwork.utils;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private static List<WeakReference<Activity>> b = new ArrayList();

    public static void a(Activity activity) {
        boolean z = true;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e71f225bb163332c876037c10fcdb5a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e71f225bb163332c876037c10fcdb5a7");
        } else if (activity == null) {
        } else {
            com.meituan.android.legwork.monitor.b a2 = com.meituan.android.legwork.monitor.b.a();
            if ((a2.c == null || !a2.c.supportHookActivity) ? false : false) {
                Iterator<WeakReference<Activity>> it = b.iterator();
                while (it.hasNext()) {
                    Activity activity2 = it.next().get();
                    if (activity2 == null) {
                        it.remove();
                    } else if (activity2 == activity) {
                        return;
                    }
                }
                if (activity.getWindow() == null) {
                    return;
                }
                activity.getWindow().setCallback(new o(activity.getWindow().getCallback()));
                b.add(new WeakReference<>(activity));
            }
        }
    }
}
