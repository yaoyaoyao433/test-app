package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
/* loaded from: classes6.dex */
public abstract class dz implements dt, ec, ed {
    public SharedPreferences a;
    public boolean c;
    public Context d;
    public dx e;
    public dw f;
    public volatile boolean b = false;
    public String g = "";
    public long h = -1;

    public dz(Context context) {
        this.d = context;
        this.c = jj.a(context);
        this.a = this.d.getSharedPreferences("hb_record", 0);
    }

    private int h() {
        if (!TextUtils.isEmpty(this.g)) {
            try {
                return this.a.getInt(dv.a(this.g), -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public abstract long a();

    private boolean g() {
        return jj.a(this.d) && com.xiaomi.push.service.z.a(this.d).a(hg.HeartbeatDataComparisonCollectSwitchBoolean.by, true) && jn.China.name().equals(com.xiaomi.push.service.b.a(this.d).a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
        if ((r11.e != null && r11.e.a.equals(r11.g) && r11.e.b == com.xiaomi.push.du.a && r11.e.c == r11.h && r11.e.f == android.text.TextUtils.isEmpty(r0) && r11.e.h.equals(r0)) == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.dz.b():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        if ((r9.f != null && r9.f.a.equals(r9.g) && r9.f.b == com.xiaomi.push.du.a && r9.f.c == r9.h) == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r10, long r11) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.dz.a(boolean, long):void");
    }

    public final long c() {
        int h;
        if (jj.a()) {
            boolean z = false;
            if (!TextUtils.isEmpty(this.g) && this.g.startsWith("M-") && !com.xiaomi.push.service.z.a(this.d).a(hg.IntelligentHeartbeatUseInMobileNetworkBoolean.by, false)) {
                z = true;
            }
            if (z) {
                return 600000L;
            }
            if ((com.xiaomi.push.service.z.a(this.d).a(hg.IntelligentHeartbeatSwitchBoolean.by, true) || this.a.getLong("keep_short_hb_effective_time", -1L) >= System.currentTimeMillis()) && (h = h()) != -1) {
                long j = h;
                this.h = j;
                return j;
            }
            return 600000L;
        }
        return 600000L;
    }

    public void a(int i) {
        this.a.edit().putLong("keep_short_hb_effective_time", System.currentTimeMillis() + (i * 1000)).apply();
    }
}
