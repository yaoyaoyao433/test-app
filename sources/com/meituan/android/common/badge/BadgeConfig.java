package com.meituan.android.common.badge;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class BadgeConfig {
    private static final String TAG = "badge_bc";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static volatile boolean sBadgeOn = true;

    public static void pullConfig(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a20c9d7fe6a6555e8fa1dff5b930636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a20c9d7fe6a6555e8fa1dff5b930636");
            return;
        }
        Horn.init(context.getApplicationContext());
        HashMap hashMap = new HashMap();
        hashMap.put("badge_ver", BuildConfig.VERSION_NAME);
        Horn.register("badge", new HornCallback() { // from class: com.meituan.android.common.badge.BadgeConfig.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b5b4f72d178b796f3753d4fb4e116598", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b5b4f72d178b796f3753d4fb4e116598");
                    return;
                }
                try {
                    if (BadgeEngine.shouldLog(0)) {
                        BadgeEngine.verbose(BadgeConfig.TAG, "enable: " + z + " config: " + str);
                    }
                    if (z && !TextUtils.isEmpty(str)) {
                        BadgeConfig.sBadgeOn = new JSONObject(str).optBoolean("badgeOn", true);
                    }
                } catch (Throwable th) {
                    if (BadgeEngine.shouldLog(3)) {
                        BadgeEngine.error(BadgeConfig.TAG, new BadgeException(th));
                    }
                }
            }
        }, hashMap);
    }
}
