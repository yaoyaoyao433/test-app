package com.meituan.android.common.unionid.oneid.session;

import android.content.Context;
import com.meituan.android.common.unionid.oneid.OneIdPrivacyHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SessionIdHelper {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getSessionId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a2057e5bc2a3799aee8fb658eefd9f8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a2057e5bc2a3799aee8fb658eefd9f8") : OneIdPrivacyHelper.getSessionId(context);
    }
}
