package com.meituan.android.common.horn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HornPushReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fd37f1c93d7ada26a7f70a57aa71fbd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fd37f1c93d7ada26a7f70a57aa71fbd");
        } else {
            HornPushService.startHornService(context, intent);
        }
    }
}
