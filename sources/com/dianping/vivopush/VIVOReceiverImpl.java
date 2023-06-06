package com.dianping.vivopush;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.base.push.pushservice.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.vivo.push.sdk.OpenClientPushMessageReceiver;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class VIVOReceiverImpl extends OpenClientPushMessageReceiver {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.vivo.push.sdk.OpenClientPushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onReceiveRegId(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3774ffb0eb453d6d85dc8aa3717230e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3774ffb0eb453d6d85dc8aa3717230e");
        } else {
            onReceiveVIVOId(context, str);
        }
    }

    public static void onReceiveVIVOId(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4546543efdf009958c93d7ccb769a0f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4546543efdf009958c93d7ccb769a0f6");
            return;
        }
        a.a("REGISTER SUCCESS");
        if (TextUtils.isEmpty(str)) {
            a.a("regId is null, return");
            return;
        }
        a.a("regId is " + str);
        n.a(context, 9, str);
    }
}
