package com.xiaomi.mipush.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.push.dr;
import com.xiaomi.push.ds;
import java.util.HashSet;
import java.util.Set;
@TargetApi(14)
/* loaded from: classes6.dex */
public final class s implements Application.ActivityLifecycleCallbacks {
    private Set<String> a = new HashSet();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        String a = com.sankuai.waimai.platform.utils.f.a(intent, "messageId");
        int a2 = com.sankuai.waimai.platform.utils.f.a(intent, "eventMessageType", -1);
        if (TextUtils.isEmpty(a) || a2 <= 0 || this.a.contains(a)) {
            return;
        }
        this.a.add(a);
        if (a2 == 3000) {
            ds.a(activity.getApplicationContext()).a(activity.getPackageName(), dr.a(a2), a, 3008, null);
        } else if (a2 == 1000) {
            ds.a(activity.getApplicationContext()).a(activity.getPackageName(), dr.a(a2), a, 1008, null);
        }
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

    public static void a(Context context) {
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new s());
    }
}
