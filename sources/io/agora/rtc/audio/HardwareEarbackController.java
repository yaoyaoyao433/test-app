package io.agora.rtc.audio;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.meituan.android.common.unionid.oneid.oaid.RouteSelector;
import com.sankuai.meituan.takeoutnew.util.aop.f;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class HardwareEarbackController {
    private static HardwareEarbackController mInstance;
    private final String TAG = "HardwareEarbackController Java";
    private IHardwareEarback mHardwareEarback;

    public static HardwareEarbackController getInstance(Context context) {
        if (mInstance == null) {
            synchronized (HardwareEarbackController.class) {
                if (mInstance == null) {
                    mInstance = new HardwareEarbackController(context);
                }
            }
        }
        return mInstance;
    }

    private HardwareEarbackController(Context context) {
        this.mHardwareEarback = null;
        String str = Build.MANUFACTURER;
        if (str.trim().contains("vivo")) {
            return;
        }
        if (str.trim().contains("HUAWEI")) {
            if (f.a(context, "android.permission.INTERACT_ACROSS_USERS", Process.myPid(), Process.myUid()) == 0) {
                this.mHardwareEarback = new HuaweiHardwareEarback(context);
            }
        } else if (str.trim().contains(RouteSelector.ROM_OPPO)) {
            this.mHardwareEarback = new OppoHardwareEarback(context);
        }
    }

    public boolean isHardwareEarbackSupported() {
        if (this.mHardwareEarback != null) {
            return this.mHardwareEarback.isHardwareEarbackSupported();
        }
        return false;
    }

    public int enableHardwareEarback(boolean z) {
        if (this.mHardwareEarback != null) {
            return this.mHardwareEarback.enableEarbackFeature(z);
        }
        return -7;
    }

    public int setHardwareEarbackVolume(int i) {
        if (this.mHardwareEarback != null) {
            return this.mHardwareEarback.setHardwareEarbackVolume(i);
        }
        return -7;
    }
}
