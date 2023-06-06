package com.meituan.android.neohybrid.neo.preset;

import android.net.Uri;
import android.text.TextUtils;
import com.dianping.titans.offline.OfflineCenter;
import com.meituan.android.neohybrid.neo.offline.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(String str) {
        OfflineCenter offlineCenter;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef20a267d73536de5e0388102b80c4d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef20a267d73536de5e0388102b80c4d1")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (offlineCenter = OfflineCenter.getInstance()) == null) {
            return false;
        }
        String a2 = e.a(Uri.parse(str));
        return (TextUtils.isEmpty(a2) || offlineCenter.getPresetResource(a2) == null) ? false : true;
    }
}
