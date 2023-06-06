package com.xiaomi.push;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
/* loaded from: classes6.dex */
public final class ee extends dz {
    private String i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ee(Context context) {
        super(context);
        this.i = "";
        com.xiaomi.channel.commonutils.logger.c.a("[Policy] Fixed Interval");
    }

    private void b(String str) {
        if ("WIFI-ID-UNKNOWN".equals(str)) {
            if (this.i == null || !this.i.startsWith("W-")) {
                str = null;
            }
            this.g = this.i;
        }
        this.i = str;
        this.g = this.i;
    }

    @Override // com.xiaomi.push.dz
    public final long a() {
        long c = c();
        this.h = c;
        return c;
    }

    @Override // com.xiaomi.push.dt
    public final void a(long j) {
    }

    @Override // com.xiaomi.push.ec
    public final void a(NetworkInfo networkInfo) {
        String str = null;
        if (networkInfo == null) {
            b(null);
        } else if (networkInfo.getType() != 0) {
            if (networkInfo.getType() == 1 || networkInfo.getType() == 6) {
                b("WIFI-ID-UNKNOWN");
            } else {
                b(null);
            }
        } else {
            String subtypeName = networkInfo.getSubtypeName();
            if (!TextUtils.isEmpty(subtypeName) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equalsIgnoreCase(subtypeName)) {
                str = "M-" + subtypeName;
            }
            b(str);
        }
    }

    @Override // com.xiaomi.push.ec
    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            b("W-" + str);
        }
        if (TextUtils.isEmpty(this.i)) {
            return;
        }
        this.b = true;
    }

    @Override // com.xiaomi.push.dz
    public final void b() {
        super.b();
    }

    @Override // com.xiaomi.push.ed
    public final void d() {
    }

    @Override // com.xiaomi.push.ed
    public final void e() {
        this.b = false;
        a(false, 0L);
    }

    @Override // com.xiaomi.push.ed
    public final void f() {
        this.b = false;
        a(true, 0L);
    }
}
