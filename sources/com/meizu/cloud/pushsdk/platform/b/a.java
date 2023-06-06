package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes3.dex */
public final class a extends c {
    public int[] a;
    public int b;
    public String c;

    private a(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, null, null, null, scheduledExecutorService);
        this.i = MinSdkChecker.isSupportSetDrawableSmallIcon();
    }

    public a(Context context, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, null, null, null, scheduledExecutorService);
        this.j = z;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final void a(BasicPushStatus basicPushStatus) {
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final boolean a() {
        return this.b == 0 || (this.a != null && this.a.length > 0 && this.b == 1) || (this.b == 2 && !TextUtils.isEmpty(this.c));
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final BasicPushStatus b() {
        return null;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final BasicPushStatus e() {
        int[] iArr;
        switch (this.b) {
            case 0:
                if (!MinSdkChecker.isSupportSetDrawableSmallIcon()) {
                    DebugLogger.e("Strategy", "android 6.0 blow so cancel all by context");
                    com.meizu.cloud.pushsdk.notification.c.b.a(this.d);
                }
                com.meizu.cloud.pushsdk.notification.c.b.a(this.d, this.g);
                return null;
            case 1:
                if (this.a != null) {
                    for (int i : this.a) {
                        DebugLogger.e("Strategy", "clear notifyId " + i);
                        com.meizu.cloud.pushsdk.notification.c.b.a(this.d, this.g, i);
                    }
                    return null;
                }
                return null;
            case 2:
                com.meizu.cloud.pushsdk.notification.c.b.a(this.d, this.g, this.c);
                return null;
            default:
                return null;
        }
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final BasicPushStatus f() {
        return null;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final int g() {
        return 64;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final Intent c() {
        Intent intent = new Intent();
        intent.putExtra("strategy_package_name", this.d.getPackageName());
        intent.putExtra("strategy_type", 64);
        intent.putExtra("strategy_child_type", this.b);
        if (this.b == 2) {
            intent.putExtra("strategy_params", this.c);
            return intent;
        } else if (this.b == 1) {
            return null;
        } else {
            return intent;
        }
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final Intent[] d() {
        if (this.a != null) {
            Intent[] intentArr = new Intent[this.a.length];
            for (int i = 0; i < this.a.length; i++) {
                DebugLogger.i("Strategy", "send notifyId " + this.a[i] + " to PushManagerService");
                Intent intent = new Intent();
                intent.putExtra("strategy_package_name", this.d.getPackageName());
                intent.putExtra("strategy_type", 64);
                intent.putExtra("strategy_child_type", this.b);
                StringBuilder sb = new StringBuilder();
                sb.append(this.a[i]);
                intent.putExtra("strategy_params", sb.toString());
                intentArr[i] = intent;
            }
            return intentArr;
        }
        return null;
    }
}
