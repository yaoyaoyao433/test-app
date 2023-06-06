package com.xiaomi.push;

import android.os.SystemClock;
import com.xiaomi.push.service.XMPushService;
import java.net.Socket;
/* loaded from: classes6.dex */
public abstract class fu extends fn {
    private long A;
    protected Exception r;
    protected Socket s;
    String t;
    protected XMPushService u;
    protected volatile long v;
    protected volatile long w;
    protected volatile long x;
    private String y;
    private int z;

    public fu(XMPushService xMPushService, fo foVar) {
        super(xMPushService, foVar);
        this.r = null;
        this.t = null;
        this.v = 0L;
        this.w = 0L;
        this.x = 0L;
        this.A = 0L;
        this.u = xMPushService;
    }

    protected abstract void a(boolean z);

    @Override // com.xiaomi.push.fn
    public void a(fb[] fbVarArr) {
        throw new fy("Don't support send Blob");
    }

    protected synchronized void c() {
    }

    @Override // com.xiaomi.push.fn
    public final String f() {
        return this.y;
    }

    public final String n() {
        return this.k;
    }

    public final void p() {
        this.v = SystemClock.elapsedRealtime();
    }

    public final void q() {
        this.w = SystemClock.elapsedRealtime();
    }

    @Override // com.xiaomi.push.fn
    public final void b(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        a(z);
        dy.a(this.u).a.d();
        if (z) {
            return;
        }
        this.u.a(new fv(this, 13, elapsedRealtime, currentTimeMillis), 10000L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void a(int i, Exception exc) {
        if (this.m == 2) {
            return;
        }
        a(2, i, exc);
        this.k = "";
        try {
            this.s.close();
        } catch (Throwable unused) {
        }
        this.v = 0L;
        this.w = 0L;
    }

    @Override // com.xiaomi.push.fn
    public final void b(int i, Exception exc) {
        a(i, exc);
        if ((exc != null || i == 18) && this.x != 0) {
            if (SystemClock.elapsedRealtime() - this.x >= 300000) {
                this.z = 0;
            } else if (al.a(this.u)) {
                this.z++;
                if (this.z >= 2) {
                    String str = this.y;
                    com.xiaomi.channel.commonutils.logger.c.a("max short conn time reached, sink down current host:" + str);
                    bu a = by.a().a(fo.a(), false);
                    if (a != null) {
                        a.b(str, 0L, 0L, exc);
                        by.a().f();
                    }
                    this.z = 0;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029b A[Catch: all -> 0x0337, IOException -> 0x0339, TryCatch #0 {IOException -> 0x0339, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x0011, B:11:0x0049, B:12:0x0051, B:14:0x005b, B:15:0x005f, B:17:0x0068, B:18:0x0070, B:20:0x0076, B:22:0x0083, B:23:0x0087, B:25:0x008d, B:26:0x0090, B:27:0x00aa, B:29:0x00b0, B:89:0x02de, B:91:0x02ef, B:93:0x02f5, B:96:0x031c, B:97:0x0325, B:95:0x0304, B:98:0x0326, B:48:0x0151, B:52:0x01a6, B:54:0x01ad, B:56:0x01c1, B:51:0x0191, B:62:0x01d4, B:66:0x0229, B:68:0x0230, B:70:0x0244, B:65:0x0214, B:75:0x025b, B:79:0x02b0, B:81:0x02b7, B:83:0x02cb, B:86:0x02da, B:78:0x029b, B:101:0x0330), top: B:111:0x0003, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b7 A[Catch: all -> 0x0337, IOException -> 0x0339, TryCatch #0 {IOException -> 0x0339, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x0011, B:11:0x0049, B:12:0x0051, B:14:0x005b, B:15:0x005f, B:17:0x0068, B:18:0x0070, B:20:0x0076, B:22:0x0083, B:23:0x0087, B:25:0x008d, B:26:0x0090, B:27:0x00aa, B:29:0x00b0, B:89:0x02de, B:91:0x02ef, B:93:0x02f5, B:96:0x031c, B:97:0x0325, B:95:0x0304, B:98:0x0326, B:48:0x0151, B:52:0x01a6, B:54:0x01ad, B:56:0x01c1, B:51:0x0191, B:62:0x01d4, B:66:0x0229, B:68:0x0230, B:70:0x0244, B:65:0x0214, B:75:0x025b, B:79:0x02b0, B:81:0x02b7, B:83:0x02cb, B:86:0x02da, B:78:0x029b, B:101:0x0330), top: B:111:0x0003, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02da A[Catch: all -> 0x0337, IOException -> 0x0339, TryCatch #0 {IOException -> 0x0339, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x0011, B:11:0x0049, B:12:0x0051, B:14:0x005b, B:15:0x005f, B:17:0x0068, B:18:0x0070, B:20:0x0076, B:22:0x0083, B:23:0x0087, B:25:0x008d, B:26:0x0090, B:27:0x00aa, B:29:0x00b0, B:89:0x02de, B:91:0x02ef, B:93:0x02f5, B:96:0x031c, B:97:0x0325, B:95:0x0304, B:98:0x0326, B:48:0x0151, B:52:0x01a6, B:54:0x01ad, B:56:0x01c1, B:51:0x0191, B:62:0x01d4, B:66:0x0229, B:68:0x0230, B:70:0x0244, B:65:0x0214, B:75:0x025b, B:79:0x02b0, B:81:0x02b7, B:83:0x02cb, B:86:0x02da, B:78:0x029b, B:101:0x0330), top: B:111:0x0003, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ef A[Catch: all -> 0x0337, IOException -> 0x0339, TryCatch #0 {IOException -> 0x0339, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x0011, B:11:0x0049, B:12:0x0051, B:14:0x005b, B:15:0x005f, B:17:0x0068, B:18:0x0070, B:20:0x0076, B:22:0x0083, B:23:0x0087, B:25:0x008d, B:26:0x0090, B:27:0x00aa, B:29:0x00b0, B:89:0x02de, B:91:0x02ef, B:93:0x02f5, B:96:0x031c, B:97:0x0325, B:95:0x0304, B:98:0x0326, B:48:0x0151, B:52:0x01a6, B:54:0x01ad, B:56:0x01c1, B:51:0x0191, B:62:0x01d4, B:66:0x0229, B:68:0x0230, B:70:0x0244, B:65:0x0214, B:75:0x025b, B:79:0x02b0, B:81:0x02b7, B:83:0x02cb, B:86:0x02da, B:78:0x029b, B:101:0x0330), top: B:111:0x0003, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0326 A[Catch: all -> 0x0337, IOException -> 0x0339, TRY_LEAVE, TryCatch #0 {IOException -> 0x0339, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x0011, B:11:0x0049, B:12:0x0051, B:14:0x005b, B:15:0x005f, B:17:0x0068, B:18:0x0070, B:20:0x0076, B:22:0x0083, B:23:0x0087, B:25:0x008d, B:26:0x0090, B:27:0x00aa, B:29:0x00b0, B:89:0x02de, B:91:0x02ef, B:93:0x02f5, B:96:0x031c, B:97:0x0325, B:95:0x0304, B:98:0x0326, B:48:0x0151, B:52:0x01a6, B:54:0x01ad, B:56:0x01c1, B:51:0x0191, B:62:0x01d4, B:66:0x0229, B:68:0x0230, B:70:0x0244, B:65:0x0214, B:75:0x025b, B:79:0x02b0, B:81:0x02b7, B:83:0x02cb, B:86:0x02da, B:78:0x029b, B:101:0x0330), top: B:111:0x0003, outer: #3 }] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void o() {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.fu.o():void");
    }

    public final void c(int i, Exception exc) {
        this.u.a(new fw(this, 2, i, exc), 0L);
    }
}
