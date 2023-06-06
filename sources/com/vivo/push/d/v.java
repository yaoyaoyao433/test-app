package com.vivo.push.d;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class v implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ Map b;
    final /* synthetic */ u c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(u uVar, Context context, Map map) {
        this.c = uVar;
        this.a = context;
        this.b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String packageName = this.a.getPackageName();
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) this.a.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningTasks(100);
            if (runningTasks != null) {
                for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                    ComponentName componentName = runningTaskInfo.topActivity;
                    if (componentName.getPackageName().equals(packageName)) {
                        com.vivo.push.util.p.d("OnNotificationClickTask", "topClassName=" + componentName.getClassName());
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        intent.setFlags(335544320);
                        u.b(intent, this.b);
                        this.a.startActivity(intent);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            com.vivo.push.util.p.a("OnNotificationClickTask", "start recentIntent is error", e);
        }
        Intent launchIntentForPackage = this.a.getPackageManager().getLaunchIntentForPackage(this.a.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(com.tencent.mapsdk.internal.y.a);
            u.b(launchIntentForPackage, this.b);
            this.a.startActivity(launchIntentForPackage);
            return;
        }
        com.vivo.push.util.p.a("OnNotificationClickTask", "LaunchIntent is null");
    }
}
