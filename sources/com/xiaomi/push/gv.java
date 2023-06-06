package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.service.XMPushService;
import java.io.File;
/* loaded from: classes6.dex */
public final class gv implements XMPushService.o {
    private static boolean a = false;
    private Context b;
    private boolean c;
    private int d;

    public gv(Context context) {
        this.b = context;
    }

    public static void a(boolean z) {
        a = false;
    }

    @Override // com.xiaomi.push.service.XMPushService.o
    public final void a() {
        Context context = this.b;
        this.c = com.xiaomi.push.service.z.a(context).a(hg.TinyDataUploadSwitch.by, true);
        this.d = com.xiaomi.push.service.z.a(context).a(hg.TinyDataUploadFrequency.by, 7200);
        this.d = Math.max(60, this.d);
        if (this.c) {
            boolean z = false;
            if (Math.abs((System.currentTimeMillis() / 1000) - this.b.getSharedPreferences("mipush_extra", 4).getLong("last_tiny_data_upload_timestamp", -1L)) > ((long) this.d)) {
                com.xiaomi.channel.commonutils.logger.c.a("TinyData TinyDataCacheProcessor.pingFollowUpAction ts:" + System.currentTimeMillis());
                gy a2 = gy.a(this.b);
                gz gzVar = a2.b.get("UPLOADER_PUSH_CHANNEL");
                if (gzVar == null && (gzVar = a2.b.get("UPLOADER_HTTP")) == null) {
                    gzVar = null;
                }
                if (al.a(this.b) && gzVar != null) {
                    String packageName = this.b.getPackageName();
                    if (!TextUtils.isEmpty("com.xiaomi.xmsf".equals(packageName) ? "1000271" : this.b.getSharedPreferences("pref_registered_pkg_names", 0).getString(packageName, null)) && new File(this.b.getFilesDir(), "tiny_data.data").exists() && !a && (!com.xiaomi.push.service.z.a(this.b).a(hg.ScreenOnOrChargingTinyDataUploadSwitch.by, false) || hf.i(this.b) || hf.j(this.b))) {
                        z = true;
                    }
                }
                if (z) {
                    a = true;
                    gw.a(this.b, gzVar);
                    return;
                }
                com.xiaomi.channel.commonutils.logger.c.a("TinyData TinyDataCacheProcessor.pingFollowUpAction !canUpload(uploader) ts:" + System.currentTimeMillis());
            }
        }
    }
}
