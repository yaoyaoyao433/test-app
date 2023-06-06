package com.xiaomi.push;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.robust.common.CommonConstant;
/* loaded from: classes6.dex */
public final class cp implements Application.ActivityLifecycleCallbacks {
    private String a;
    private String b;
    private Context c;

    public cp(Context context, String str) {
        this.a = "";
        this.c = context;
        this.a = str;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (TextUtils.isEmpty(this.b)) {
            this.b = activity.getLocalClassName();
        }
        this.a = String.valueOf(System.currentTimeMillis() / 1000);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (TextUtils.isEmpty(this.a) || TextUtils.isEmpty(localClassName)) {
            return;
        }
        this.b = "";
        if (!TextUtils.isEmpty(this.b) && !TextUtils.equals(this.b, localClassName)) {
            this.a = "";
            return;
        }
        hj hjVar = new hj();
        hjVar.c = this.c.getPackageName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + localClassName + CommonConstant.Symbol.COLON + this.a + CommonConstant.Symbol.COMMA + String.valueOf(System.currentTimeMillis() / 1000);
        hjVar.a(System.currentTimeMillis());
        hjVar.b = hc.ActivityActiveTimeStamp;
        cw.a(this.c, hjVar);
        this.a = "";
        this.b = "";
    }
}
