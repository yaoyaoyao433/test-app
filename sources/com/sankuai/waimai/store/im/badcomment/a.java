package com.sankuai.waimai.store.im.badcomment;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.xm.im.desensitization.c {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[Catch: Exception -> 0x008c, TRY_LEAVE, TryCatch #0 {Exception -> 0x008c, blocks: (B:16:0x004d, B:18:0x006a, B:21:0x0071, B:26:0x0083, B:28:0x0089, B:22:0x0074, B:25:0x0081), top: B:35:0x004d }] */
    @Override // com.sankuai.xm.im.desensitization.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(com.sankuai.xm.im.vcard.entity.a r13, com.sankuai.xm.im.vcard.d r14, com.sankuai.xm.im.a<com.sankuai.xm.im.vcard.entity.a> r15) {
        /*
            r12 = this;
            com.sankuai.xm.im.vcard.entity.a r13 = (com.sankuai.xm.im.vcard.entity.a) r13
            com.sankuai.xm.im.vcard.d r14 = (com.sankuai.xm.im.vcard.d) r14
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            r9 = 1
            r0[r9] = r14
            r1 = 2
            r0[r1] = r15
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.store.im.badcomment.a.a
            java.lang.String r11 = "72c270b8bc3cd49a0d4afb7234bb916b"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            return
        L25:
            if (r13 == 0) goto L90
            if (r14 == 0) goto L90
            java.lang.String r0 = r14.f
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L90
            com.sankuai.xm.im.IMClient r1 = com.sankuai.xm.im.IMClient.a()
            int r14 = r14.g
            com.sankuai.xm.im.message.bean.IMMessage r14 = r1.a(r14, r0, r9)
            if (r14 == 0) goto L90
            int r0 = r14.getDirection()
            if (r0 == r9) goto L90
            java.lang.String r0 = r14.getExtension()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L90
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8c
            java.lang.String r1 = r14.getExtension()     // Catch: java.lang.Exception -> L8c
            r0.<init>(r1)     // Catch: java.lang.Exception -> L8c
            java.lang.String r1 = "groupName"
            java.lang.String r1 = r0.optString(r1)     // Catch: java.lang.Exception -> L8c
            java.lang.String r2 = "groupUrl"
            java.lang.String r0 = r0.optString(r2)     // Catch: java.lang.Exception -> L8c
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L8c
            if (r2 != 0) goto L74
            boolean r2 = com.sankuai.waimai.store.im.badcomment.c.a(r1)     // Catch: java.lang.Exception -> L8c
            if (r2 == 0) goto L71
            goto L74
        L71:
            r13.d = r1     // Catch: java.lang.Exception -> L8c
            goto L83
        L74:
            java.lang.String r14 = r14.getGroupName()     // Catch: java.lang.Exception -> L8c
            boolean r1 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Exception -> L8c
            if (r1 == 0) goto L81
            java.lang.String r14 = "差评订单回访"
        L81:
            r13.d = r14     // Catch: java.lang.Exception -> L8c
        L83:
            boolean r14 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L8c
            if (r14 != 0) goto L90
            r13.b = r0     // Catch: java.lang.Exception -> L8c
            goto L90
        L8c:
            r14 = move-exception
            com.sankuai.shangou.stone.util.log.a.a(r14)
        L90:
            if (r15 == 0) goto L95
            r15.onSuccess(r13)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.im.badcomment.a.a(java.lang.Object, java.lang.Object, com.sankuai.xm.im.a):void");
    }
}
