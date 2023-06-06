package com.meizu.cloud.pushsdk.platform.a;

import android.content.Context;
import com.meizu.cloud.pushsdk.platform.b.d;
import com.meizu.cloud.pushsdk.platform.b.e;
import com.meizu.cloud.pushsdk.platform.b.f;
import com.meizu.cloud.pushsdk.platform.b.g;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes3.dex */
public class b {
    private static b i;
    public ScheduledExecutorService a;
    public final Context b;
    public final com.meizu.cloud.pushsdk.platform.b.b c;
    public final g d;
    public final f e;
    public final e f;
    public final d g;
    public final boolean h;
    private final a j;

    private b(Context context, boolean z) {
        this(context, true, true);
    }

    private b(Context context, boolean z, boolean z2) {
        this.b = context.getApplicationContext();
        this.j = new a(this.b);
        if (z) {
            this.a = (ScheduledExecutorService) com.meizu.cloud.pushsdk.d.b.a.b.a();
        }
        this.h = true;
        this.c = new com.meizu.cloud.pushsdk.platform.b.b(this.b, this.j, this.a, true);
        this.d = new g(this.b, this.j, this.a, true);
        this.e = new f(this.b, this.j, this.a, true);
        this.f = new e(this.b, this.j, this.a, true);
        this.g = new d(this.b, this.j, this.a, true);
    }

    public static b a(Context context) {
        if (i == null) {
            synchronized (b.class) {
                if (i == null) {
                    i = new b(context, true);
                }
            }
        }
        return i;
    }

    public final boolean a(String str, int... iArr) {
        com.meizu.cloud.pushsdk.platform.b.a aVar = new com.meizu.cloud.pushsdk.platform.b.a(this.b, this.a, this.h);
        aVar.a = iArr;
        aVar.c(str);
        aVar.b = 1;
        return aVar.h();
    }
}
