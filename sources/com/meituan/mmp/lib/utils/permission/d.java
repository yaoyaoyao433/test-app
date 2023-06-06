package com.meituan.mmp.lib.utils.permission;

import android.content.Context;
import android.content.Intent;
import com.meituan.mmp.lib.utils.as;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends a {
    public static ChangeQuickRedirect b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e4688e175ea7988cf3b948752e5895f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e4688e175ea7988cf3b948752e5895f")).intValue();
        }
        String f = as.f();
        if (f != null) {
            try {
                return Integer.parseInt(f.substring(1));
            } catch (Exception unused) {
                return -1;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Intent intent, Context context) {
        Object[] objArr = {intent, context};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ff3998190e54c83d7e8273311b78d17", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ff3998190e54c83d7e8273311b78d17")).booleanValue() : context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }
}
