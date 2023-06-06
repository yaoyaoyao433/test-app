package io.agora.rtc.utils;

import android.content.Context;
import android.view.WindowManager;
import com.tencent.rtmp.TXLiveConstants;
import io.agora.rtc.internal.RtcEngineImpl;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class AgoraUtils {
    private static final String TAG = "AgoraUtils";

    public static boolean ensureNativeLibsInitialized() {
        return RtcEngineImpl.initializeNativeLibs();
    }

    public static int getFrameOrientation(int i, int i2, boolean z, boolean z2) {
        if (z) {
            int i3 = (i2 + i) % 360;
            return z2 ? (360 - i3) % 360 : i3;
        }
        return ((i2 - i) + 360) % 360;
    }

    public static int getDisplayRotation(Context context) {
        switch (((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation()) {
            case 0:
                return 0;
            case 1:
                return 90;
            case 2:
                return TXLiveConstants.RENDER_ROTATION_180;
            case 3:
                return 270;
            default:
                return 0;
        }
    }

    public static String getAppStorageDir(Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return "/sdcard/" + context.getApplicationInfo().packageName;
        }
        return null;
    }
}
