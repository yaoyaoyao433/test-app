package com.huawei.hms.api;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    static final a b = new a();
    List<Activity> a = new ArrayList(1);

    a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Activity activity) {
        for (Activity activity2 : this.a) {
            if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                activity2.finish();
            }
        }
        this.a.add(activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Activity activity) {
        this.a.remove(activity);
    }
}
