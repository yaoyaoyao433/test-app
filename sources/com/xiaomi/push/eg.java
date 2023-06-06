package com.xiaomi.push;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.meituan.robust.Constants;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes6.dex */
public final class eg extends dz {
    private final AtomicInteger i;
    private String j;
    private volatile boolean k;
    private String l;
    private final AtomicInteger m;
    private final AtomicInteger n;
    private long o;
    private final boolean p;
    private final boolean q;
    private int r;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "WIFI-ID-UNKNOWN"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L17
            java.lang.String r10 = r9.j
            if (r10 == 0) goto L16
            java.lang.String r10 = r9.j
            java.lang.String r0 = "W-"
            boolean r10 = r10.startsWith(r0)
            if (r10 != 0) goto L19
        L16:
            r10 = 0
        L17:
            r9.j = r10
        L19:
            java.lang.String r10 = r9.j
            r9.g = r10
            android.content.SharedPreferences r10 = r9.a
            java.lang.String r0 = r9.j
            java.lang.String r0 = com.xiaomi.push.dv.a(r0)
            r1 = -1
            int r10 = r10.getInt(r0, r1)
            android.content.SharedPreferences r0 = r9.a
            java.lang.String r2 = r9.j
            java.lang.String r2 = com.xiaomi.push.dv.b(r2)
            r3 = -1
            long r5 = r0.getLong(r2, r3)
            long r7 = java.lang.System.currentTimeMillis()
            if (r10 == r1) goto L7a
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 != 0) goto L5b
            android.content.SharedPreferences r10 = r9.a
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r0 = r9.j
            java.lang.String r0 = com.xiaomi.push.dv.b(r0)
            long r2 = r9.g()
            long r7 = r7 + r2
            android.content.SharedPreferences$Editor r10 = r10.putLong(r0, r7)
        L57:
            r10.apply()
            goto L7a
        L5b:
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 <= 0) goto L7a
            android.content.SharedPreferences r10 = r9.a
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r0 = r9.j
            java.lang.String r0 = com.xiaomi.push.dv.a(r0)
            android.content.SharedPreferences$Editor r10 = r10.remove(r0)
            java.lang.String r0 = r9.j
            java.lang.String r0 = com.xiaomi.push.dv.b(r0)
            android.content.SharedPreferences$Editor r10 = r10.remove(r0)
            goto L57
        L7a:
            java.util.concurrent.atomic.AtomicInteger r10 = r9.i
            r0 = 0
            r10.getAndSet(r0)
            java.lang.String r10 = r9.j
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            r2 = 1
            if (r10 != 0) goto L93
            int r10 = r9.h()
            if (r10 == r1) goto L90
            goto L93
        L90:
            r9.k = r2
            goto L95
        L93:
            r9.k = r0
        L95:
            java.lang.String r10 = "[HB] network changed, netid:%s, %s"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r9.j
            r1[r0] = r3
            boolean r0 = r9.k
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1[r2] = r0
            java.lang.String r10 = java.lang.String.format(r10, r1)
            com.xiaomi.channel.commonutils.logger.c.a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.eg.b(java.lang.String):void");
    }

    private int h() {
        if (!TextUtils.isEmpty(this.j)) {
            try {
                return this.a.getInt(dv.a(this.j), -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    private boolean j() {
        return this.q && (this.p || ((k() > System.currentTimeMillis() ? 1 : (k() == System.currentTimeMillis() ? 0 : -1)) >= 0));
    }

    @Override // com.xiaomi.push.dt
    public final void a(long j) {
    }

    @Override // com.xiaomi.push.ec
    public final void a(NetworkInfo networkInfo) {
        if (j()) {
            String str = null;
            if (networkInfo == null) {
                b(null);
                this.r = -1;
            } else if (networkInfo.getType() != 0) {
                if (networkInfo.getType() == 1 || networkInfo.getType() == 6) {
                    b("WIFI-ID-UNKNOWN");
                    this.r = 1;
                    return;
                }
                b(null);
                this.r = -1;
            } else {
                String subtypeName = networkInfo.getSubtypeName();
                if (!TextUtils.isEmpty(subtypeName) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equalsIgnoreCase(subtypeName)) {
                    str = "M-" + subtypeName;
                }
                b(str);
                this.r = 0;
            }
        }
    }

    @Override // com.xiaomi.push.dz
    public final void b() {
        super.b();
    }

    @Override // com.xiaomi.push.ed
    public final void d() {
        if (j()) {
            this.l = this.j;
        }
    }

    public eg(Context context) {
        super(context);
        this.i = new AtomicInteger(0);
        this.j = null;
        this.k = false;
        this.l = null;
        this.m = new AtomicInteger(0);
        this.n = new AtomicInteger(0);
        this.r = -1;
        this.d = context;
        this.q = jj.a(context);
        this.p = com.xiaomi.push.service.z.a(this.d).a(hg.IntelligentHeartbeatSwitchBoolean.by, true);
        this.a = this.d.getSharedPreferences("hb_record", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (this.a.getLong("record_hb_count_start", -1L) == -1) {
            this.a.edit().putLong("record_hb_count_start", currentTimeMillis).apply();
        }
        this.o = this.a.getLong("record_ptc_start", -1L);
        if (this.o == -1) {
            this.o = currentTimeMillis;
            this.a.edit().putLong("record_ptc_start", currentTimeMillis).apply();
        }
        com.xiaomi.channel.commonutils.logger.c.a("[Policy] Wifi Fixed Short policy");
    }

    @Override // com.xiaomi.push.dz
    public final long a() {
        int h;
        long c = ft.c();
        if (this.q) {
            if (!((TextUtils.isEmpty(this.j) || !this.j.startsWith("M-") || com.xiaomi.push.service.z.a(this.d).a(hg.IntelligentHeartbeatUseInMobileNetworkBoolean.by, false)) ? false : true) && ((com.xiaomi.push.service.z.a(this.d).a(hg.IntelligentHeartbeatSwitchBoolean.by, true) || k() >= System.currentTimeMillis()) && (h = h()) != -1)) {
                c = h;
            }
        }
        if (!TextUtils.isEmpty(this.j) && !"WIFI-ID-UNKNOWN".equals(this.j) && this.r == 1) {
            boolean z = c < 300000;
            if (i()) {
                int incrementAndGet = (z ? this.m : this.n).incrementAndGet();
                Object[] objArr = new Object[2];
                objArr[0] = z ? Constants.SHORT : Constants.LONG;
                objArr[1] = Integer.valueOf(incrementAndGet);
                com.xiaomi.channel.commonutils.logger.c.b(String.format("[HB] %s ping interval count: %s", objArr));
                if (incrementAndGet >= 5) {
                    String str = z ? "record_short_hb_count" : "record_long_hb_count";
                    int i = this.a.getInt(str, 0) + incrementAndGet;
                    this.a.edit().putInt(str, i).apply();
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = z ? Constants.SHORT : Constants.LONG;
                    objArr2[1] = Integer.valueOf(i);
                    com.xiaomi.channel.commonutils.logger.c.a(String.format("[HB] accumulate %s hb count(%s) and write to file. ", objArr2));
                    (z ? this.m : this.n).set(0);
                }
            }
        }
        com.xiaomi.channel.commonutils.logger.c.a("[HB] ping interval:" + c);
        this.h = c;
        return c;
    }

    @Override // com.xiaomi.push.ec
    public final void a(String str) {
        if (!TextUtils.isEmpty(str) && !this.a.getBoolean("support_wifi_digest", false)) {
            this.a.edit().putBoolean("support_wifi_digest", true).apply();
        }
        if (!j() || TextUtils.isEmpty(str)) {
            return;
        }
        b("W-" + str);
    }

    private long g() {
        return com.xiaomi.push.service.z.a(this.d).a(hg.ShortHeartbeatEffectivePeriodMsLong.by, 777600000L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.xiaomi.push.ed
    public final void e() {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.eg.e():void");
    }

    @Override // com.xiaomi.push.ed
    public final void f() {
        String str;
        String str2;
        String str3;
        if (j()) {
            switch (this.r) {
                case 0:
                    str = "record_mobile_ptc";
                    break;
                case 1:
                    str = "record_wifi_ptc";
                    break;
                default:
                    str = null;
                    break;
            }
            if (!TextUtils.isEmpty(str)) {
                if (this.a.getLong("record_ptc_start", -1L) == -1) {
                    this.o = System.currentTimeMillis();
                    this.a.edit().putLong("record_ptc_start", this.o).apply();
                }
                this.a.edit().putInt(str, this.a.getInt(str, 0) + 1).apply();
            }
            if (this.k && !TextUtils.isEmpty(this.j) && this.j.equals(this.l)) {
                this.i.getAndIncrement();
                com.xiaomi.channel.commonutils.logger.c.a("[HB] ping timeout count:" + this.i);
                if (this.i.get() >= Math.max(com.xiaomi.push.service.z.a(this.d).a(hg.IntelligentHeartbeatNATCountInt.by, 5), 3)) {
                    com.xiaomi.channel.commonutils.logger.c.a("[HB] change hb interval for net:" + this.j);
                    String str4 = this.j;
                    if (!TextUtils.isEmpty(str4) && (str4.startsWith("W-") || str4.startsWith("M-"))) {
                        this.a.edit().putInt(dv.a(str4), 235000).apply();
                        this.a.edit().putLong(dv.b(this.j), System.currentTimeMillis() + g()).apply();
                    }
                    this.k = false;
                    this.i.getAndSet(0);
                    String str5 = this.j;
                    if (i() && !TextUtils.isEmpty(str5)) {
                        if (str5.startsWith("W-")) {
                            str2 = "W";
                        } else if (str5.startsWith("M-")) {
                            str2 = ErrorCode.ERROR_TYPE_M;
                        }
                        String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
                        StringBuilder sb = new StringBuilder();
                        sb.append(str5);
                        sb.append(":::");
                        sb.append(str2);
                        sb.append(":::");
                        sb.append("235000");
                        sb.append(":::");
                        sb.append(valueOf);
                        String string = this.a.getString("record_hb_change", null);
                        if (TextUtils.isEmpty(string)) {
                            str3 = sb.toString();
                        } else {
                            str3 = string + "###" + sb.toString();
                        }
                        this.a.edit().putString("record_hb_change", str3).apply();
                    }
                }
            }
        }
        a(true, 0L);
    }

    private boolean i() {
        return j() && com.xiaomi.push.service.z.a(this.d).a(hg.IntelligentHeartbeatDataCollectSwitchBoolean.by, true) && jn.China.name().equals(com.xiaomi.push.service.b.a(this.d).a());
    }

    @Override // com.xiaomi.push.dz
    public final void a(int i) {
        this.a.edit().putLong("keep_short_hb_effective_time", System.currentTimeMillis() + (i * 1000)).apply();
    }

    private long k() {
        return this.a.getLong("keep_short_hb_effective_time", -1L);
    }
}
