package com.meituan.android.recce.views.base;

import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class RecceInstanceUtils {
    private static final String TAG = "RecceInstanceUtils";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getCollidedViewManager(List<ViewManager> list, List<ViewManager> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7011bfc3d70bd1c814d1ec25c3387494", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7011bfc3d70bd1c814d1ec25c3387494");
        }
        if (list == null || list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ViewManager viewManager : list) {
            arrayList.add(viewManager.getName());
        }
        for (ViewManager viewManager2 : list2) {
            if (arrayList.contains(viewManager2.getName())) {
                return viewManager2.getName();
            }
            arrayList.add(viewManager2.getName());
        }
        return null;
    }
}
