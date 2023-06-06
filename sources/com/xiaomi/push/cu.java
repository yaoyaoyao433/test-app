package com.xiaomi.push;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.xiaomi.push.m;
/* loaded from: classes6.dex */
public class cu {
    private static volatile cu b;
    public Context a;

    private cu(Context context) {
        this.a = context;
    }

    public static cu a(Context context) {
        if (b == null) {
            synchronized (cu.class) {
                if (b == null) {
                    b = new cu(context);
                }
            }
        }
        return b;
    }

    private boolean a() {
        try {
            ((Application) (this.a instanceof Application ? this.a : this.a.getApplicationContext())).registerActivityLifecycleCallbacks(new cp(this.a, String.valueOf(System.currentTimeMillis() / 1000)));
            return true;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            return false;
        }
    }

    private void a(com.xiaomi.push.service.z zVar, m mVar, boolean z) {
        if (zVar.a(hg.UploadSwitch.by, true)) {
            cy cyVar = new cy(this.a);
            if (z) {
                mVar.a(cyVar, Math.max(60, zVar.a(hg.UploadFrequency.by, RemoteMessageConst.DEFAULT_TTL)), 0);
            } else {
                mVar.a((m.a) cyVar, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(cu cuVar) {
        m a = m.a(cuVar.a);
        com.xiaomi.push.service.z a2 = com.xiaomi.push.service.z.a(cuVar.a);
        SharedPreferences sharedPreferences = cuVar.a.getSharedPreferences("mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("first_try_ts", currentTimeMillis);
        if (j == currentTimeMillis) {
            sharedPreferences.edit().putLong("first_try_ts", currentTimeMillis).commit();
        }
        if (Math.abs(currentTimeMillis - j) >= DDLoadConstants.UNKNOWN_FILE_CLEAR_POLL_DURATION) {
            cuVar.a(a2, a, false);
            if (a2.a(hg.StorageCollectionSwitch.by, true)) {
                int max = Math.max(60, a2.a(hg.StorageCollectionFrequency.by, RemoteMessageConst.DEFAULT_TTL));
                a.a(new cx(cuVar.a, max), max, 0);
            }
            jj.a(cuVar.a);
            if (a2.a(hg.ActivityTSSwitch.by, false)) {
                cuVar.a();
            }
            cuVar.a(a2, a, true);
        }
    }
}
