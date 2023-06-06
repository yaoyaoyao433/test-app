package com.meituan.mmp.lib.utils;

import android.app.Activity;
import com.meituan.mmp.lib.api.auth.MoreInfoDialog;
import com.meituan.mmp.lib.api.report.MetricsModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class aw {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba0e773d7b5d21441f576cc07a5bc59f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba0e773d7b5d21441f576cc07a5bc59f");
        } else {
            new MoreInfoDialog(activity, "https://i.meituan.com/awp/hfe/block/fc7fd8d9ae29/79510/index.html").show();
        }
    }

    public static /* synthetic */ void a(HashMap hashMap, String str) {
        Object[] objArr = {hashMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "066e4fb1a7bd12cadf7504cc51d530a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "066e4fb1a7bd12cadf7504cc51d530a5");
            return;
        }
        hashMap.put("reason", str);
        MetricsModule.a("mmp.util.shortcut.add.failed", hashMap);
    }
}
