package com.xiaomi.push.service;

import com.xiaomi.push.cz;
import com.xiaomi.push.p;
import com.xiaomi.push.service.av;
import java.util.List;
/* loaded from: classes6.dex */
public final class aw extends p.b {
    boolean a = false;
    final /* synthetic */ av b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aw(av avVar) {
        this.b = avVar;
    }

    @Override // com.xiaomi.push.p.b
    public final void b() {
        List list;
        List list2;
        av.a[] aVarArr;
        cz.a unused;
        av.a(this.b, (p.b) null);
        if (this.a) {
            synchronized (this.b) {
                list = this.b.c;
                list2 = this.b.c;
                aVarArr = (av.a[]) list.toArray(new av.a[list2.size()]);
            }
            int length = aVarArr.length;
            for (int i = 0; i < length; i++) {
                unused = this.b.a;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[Catch: Exception -> 0x0053, TRY_LEAVE, TryCatch #0 {Exception -> 0x0053, blocks: (B:2:0x0000, B:4:0x0012, B:9:0x0024, B:11:0x0046), top: B:16:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // com.xiaomi.push.p.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r5 = this;
            android.content.Context r0 = com.xiaomi.push.jr.a()     // Catch: java.lang.Exception -> L53
            com.xiaomi.push.service.b r0 = com.xiaomi.push.service.b.a(r0)     // Catch: java.lang.Exception -> L53
            java.lang.String r0 = r0.a()     // Catch: java.lang.Exception -> L53
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L53
            if (r1 != 0) goto L22
            com.xiaomi.push.jn r1 = com.xiaomi.push.jn.China     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = r1.name()     // Catch: java.lang.Exception -> L53
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L1f
            goto L22
        L1f:
            java.lang.String r0 = "https://resolver.msg.global.xiaomi.net/psc/?t=a"
            goto L24
        L22:
            java.lang.String r0 = "https://resolver.msg.xiaomi.net/psc/?t=a"
        L24:
            android.content.Context r1 = com.xiaomi.push.jr.a()     // Catch: java.lang.Exception -> L53
            r2 = 0
            com.xiaomi.push.cc$a r3 = new com.xiaomi.push.cc$a     // Catch: java.lang.Exception -> L53
            r3.<init>()     // Catch: java.lang.Exception -> L53
            r4 = 1
            java.lang.String r0 = com.xiaomi.push.cc.a(r1, r0, r2, r3, r4)     // Catch: java.lang.Exception -> L53
            r1 = 10
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Exception -> L53
            com.xiaomi.push.cz$a r1 = new com.xiaomi.push.cz$a     // Catch: java.lang.Exception -> L53
            r1.<init>()     // Catch: java.lang.Exception -> L53
            com.xiaomi.push.de r0 = r1.b(r0)     // Catch: java.lang.Exception -> L53
            com.xiaomi.push.cz$a r0 = (com.xiaomi.push.cz.a) r0     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L52
            com.xiaomi.push.service.av r1 = r5.b     // Catch: java.lang.Exception -> L53
            com.xiaomi.push.service.av.a(r1, r0)     // Catch: java.lang.Exception -> L53
            r5.a = r4     // Catch: java.lang.Exception -> L53
            com.xiaomi.push.service.av r0 = r5.b     // Catch: java.lang.Exception -> L53
            com.xiaomi.push.service.av.a(r0)     // Catch: java.lang.Exception -> L53
        L52:
            return
        L53:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "fetch config failure: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.xiaomi.channel.commonutils.logger.c.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.aw.a():void");
    }
}
