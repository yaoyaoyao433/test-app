package com.sankuai.waimai.platform.capacity.deeplink;

import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static boolean a(@NonNull Activity activity, @NonNull String str, Map<String, Object> map) {
        Object[] objArr = {activity, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2890374d0e5c54c12342e8e325738650", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2890374d0e5c54c12342e8e325738650")).booleanValue();
        }
        if (activity == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Intent intent = activity.getIntent();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (f.a(intent, "_dl_target_", false)) {
            if (b.c(str)) {
                b.a(str, elapsedRealtime - TimeUtil.processStartElapsedTimeMillis(), map);
                return true;
            }
        } else {
            Serializable c = f.c(intent, "_dl_task_ext_");
            if (c instanceof e) {
                e eVar = (e) c;
                if (eVar.b(str)) {
                    eVar.a(str, elapsedRealtime - eVar.b, map);
                    return true;
                }
            }
        }
        return false;
    }
}
