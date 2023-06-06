package io.agora.rtc.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class ConnectionChangeBroadcastReceiver extends BroadcastReceiver {
    private WeakReference<CommonUtility> mCommonUtility;

    public ConnectionChangeBroadcastReceiver(CommonUtility commonUtility) {
        this.mCommonUtility = new WeakReference<>(commonUtility);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        CommonUtility commonUtility = this.mCommonUtility.get();
        if (commonUtility == null) {
            Logging.w("rtc engine is not ready");
        } else {
            commonUtility.notifyNetworkChange();
        }
    }
}
