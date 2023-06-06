package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.push.bm;
import com.xiaomi.push.m;
/* loaded from: classes6.dex */
public class az {
    private static volatile az i;
    Context a;
    String b;
    String c;
    public bp d;
    private bq j;
    private final String e = "push_stat_sp";
    private final String f = "upload_time";
    private final String g = "delete_time";
    private final String h = "check_time";
    private m.a k = new ba(this);
    private m.a l = new bb(this);
    private m.a m = new bc(this);

    private az(Context context) {
        this.a = context;
    }

    public static az a(Context context) {
        if (i == null) {
            synchronized (az.class) {
                if (i == null) {
                    i = new az(context);
                }
            }
        }
        return i;
    }

    public final void a(bm.a aVar) {
        bm.a(this.a).a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.a.getDatabasePath(be.a).getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return com.xiaomi.push.service.z.a(this.a).a(hg.StatDataSwitch.by, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(az azVar, String str) {
        SharedPreferences.Editor edit = azVar.a.getSharedPreferences("push_stat_sp", 0).edit();
        edit.putLong(str, System.currentTimeMillis());
        edit.apply();
    }
}
