package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes3.dex */
public abstract class c<T extends BasicPushStatus> {
    private ScheduledExecutorService a;
    protected final Context d;
    protected String e;
    protected String f;
    protected String g;
    protected final com.meizu.cloud.pushsdk.platform.a.a h;
    protected boolean i = true;
    protected boolean j = true;
    private String b = null;

    public c(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
        this.d = context;
        this.e = str;
        this.f = str2;
        this.h = aVar;
    }

    private void a(Intent intent) {
        try {
            intent.setPackage(this.b);
            intent.setAction(PushConstants.MZ_PUSH_MANAGER_SERVICE_ACTION);
            this.d.startService(intent);
        } catch (Exception e) {
            DebugLogger.e("Strategy", "start RemoteService error " + e.getMessage());
        }
    }

    private static boolean a(int i) {
        return i >= 110000 && i <= 200000;
    }

    private static boolean b(T t) {
        int intValue = Integer.valueOf(t.getCode()).intValue();
        if (intValue <= 200 || intValue >= 600) {
            return (intValue > 1000 && intValue < 2000) || intValue == 0;
        }
        return true;
    }

    private boolean k() {
        return this.j && !this.d.getPackageName().equals(this.b);
    }

    private boolean l() {
        return 2 == g() || 32 == g();
    }

    protected abstract void a(T t);

    public final void a(String str) {
        this.e = str;
    }

    public final void a(boolean z) {
        this.i = z;
    }

    protected abstract boolean a();

    protected abstract T b();

    public final void b(String str) {
        this.f = str;
    }

    protected abstract Intent c();

    public final void c(String str) {
        this.g = str;
    }

    protected Intent[] d() {
        return null;
    }

    protected abstract T e();

    protected abstract T f();

    protected abstract int g();

    public final boolean h() {
        if (this.a != null) {
            this.a.execute(new Runnable() { // from class: com.meizu.cloud.pushsdk.platform.b.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.i();
                }
            });
            return true;
        }
        return i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i() {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.platform.b.c.i():boolean");
    }

    private boolean j() {
        if (this.j && this.i) {
            Context context = this.d;
            String str = null;
            if (!TextUtils.isEmpty(PushConstants.MZ_PUSH_MANAGER_SERVICE_ACTION)) {
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(PushConstants.MZ_PUSH_MANAGER_SERVICE_ACTION), 0);
                if (queryIntentServices != null) {
                    Iterator<ResolveInfo> it = queryIntentServices.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ResolveInfo next = it.next();
                        if (PushConstants.PUSH_PACKAGE_NAME.equals(next.serviceInfo.packageName)) {
                            this.b = next.serviceInfo.packageName;
                            str = next.serviceInfo.name;
                            break;
                        }
                    }
                    if (TextUtils.isEmpty(str) && queryIntentServices.size() > 0) {
                        this.b = queryIntentServices.get(0).serviceInfo.packageName;
                        str = queryIntentServices.get(0).serviceInfo.name;
                    }
                }
            }
            DebugLogger.i("Strategy", "current process packageName " + this.b);
            if (!TextUtils.isEmpty(str)) {
                return true;
            }
        }
        return false;
    }
}
