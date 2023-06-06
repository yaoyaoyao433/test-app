package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import com.xiaomi.push.ej;
import java.util.Map;
/* loaded from: classes6.dex */
public abstract class r {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean a(Context context, int i, String str, Map<String, String> map);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean a(Map<String, String> map, int i, Notification notification);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract ej b(Context context, int i, String str, Map<String, String> map);
}
