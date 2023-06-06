package com.meituan.android.common.badge;

import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class BadgeReporter {
    private static final String BABEL_REPORT_TAG = "badge";
    private static final String BADGE_REPORT_CATEGORY = "met-badge";
    private static final String TAG = "badge_br";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void report(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eef5dca9e388b071dddb424ea0297645", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eef5dca9e388b071dddb424ea0297645");
            return;
        }
        if (BadgeEngine.shouldLog(1)) {
            BadgeEngine.debug(TAG, "will synchronize: " + new JSONObject(map));
        }
        boolean z = BadgeConfig.sBadgeOn;
        if (BadgeEngine.shouldLog(1)) {
            BadgeEngine.debug(TAG, "report on: " + z + " strategy on: " + BadgeEngine.reallySynchronize());
        }
        if (z && BadgeEngine.reallySynchronize()) {
            Babel.logRT(new Log.Builder("").tag(BABEL_REPORT_TAG).reportChannel(BADGE_REPORT_CATEGORY).optional(new HashMap(map)).lv4LocalStatus(true).build());
            if (BadgeEngine.shouldLog(1)) {
                BadgeEngine.debug(TAG, "report over");
            }
        }
    }
}
