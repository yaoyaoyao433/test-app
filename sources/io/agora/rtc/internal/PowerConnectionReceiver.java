package io.agora.rtc.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sankuai.waimai.platform.utils.f;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class PowerConnectionReceiver extends BroadcastReceiver {
    private WeakReference<CommonUtility> mCommonUtility;

    public PowerConnectionReceiver(CommonUtility commonUtility) {
        this.mCommonUtility = new WeakReference<>(commonUtility);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        CommonUtility commonUtility = this.mCommonUtility.get();
        if (commonUtility == null) {
            Logging.w("rtc engine is not ready");
        } else if (intent != null) {
            int a = f.a(intent, "level", -1);
            int a2 = f.a(intent, "scale", -1);
            if (a2 != 0) {
                commonUtility.onPowerChange((int) ((a / a2) * 100.0f));
            }
        }
    }
}
