package com.meituan.msc.common.utils;

import android.app.Activity;
import com.meituan.msc.modules.api.auth.MoreInfoDialog;
import com.meituan.msc.modules.reporter.MSCReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class at {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74ba06c71bb03bde2711b001293eea3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74ba06c71bb03bde2711b001293eea3b");
        } else {
            new MoreInfoDialog(activity, "https://i.meituan.com/awp/hfe/block/fc7fd8d9ae29/79510/index.html").show();
        }
    }

    public static /* synthetic */ void a(MSCReporter mSCReporter, String str) {
        Object[] objArr = {mSCReporter, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a3ed3d406fa7ee6e0dc23ea7e3594e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a3ed3d406fa7ee6e0dc23ea7e3594e7");
        } else {
            mSCReporter.a("msc.util.shortcut.add.failed").a("reason", str).b();
        }
    }
}
