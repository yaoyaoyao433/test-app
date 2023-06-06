package com.meituan.msc.mmpviews.msiviews;

import android.support.annotation.NonNull;
import com.meituan.msc.e;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.as;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.e
    @NonNull
    public final List<as> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "069ff01d80bd0b269df99da4555824fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "069ff01d80bd0b269df99da4555824fc");
        }
        Set<String> a2 = a.a();
        ArrayList arrayList = new ArrayList();
        for (String str : a2) {
            arrayList.add(new MSIViewManager(str));
        }
        if (arrayList.isEmpty()) {
            g.a("[MSIPackage@createViewManagers]", "msiViewManagers empty");
        }
        return arrayList;
    }
}
