package com.sankuai.waimai.drug.im.imlight;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.imbase.init.model.a {
    public static ChangeQuickRedirect a;

    public b() {
        super((short) 1052, new com.sankuai.waimai.imbase.listener.a() { // from class: com.sankuai.waimai.drug.im.imlight.b.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
            @Override // com.sankuai.waimai.imbase.listener.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.sankuai.waimai.imbase.listener.model.a a(com.sankuai.xm.im.message.bean.IMMessage r23, boolean r24) {
                /*
                    r22 = this;
                    r0 = 2
                    java.lang.Object[] r8 = new java.lang.Object[r0]
                    r9 = 0
                    r8[r9] = r23
                    java.lang.Byte r1 = java.lang.Byte.valueOf(r24)
                    r10 = 1
                    r8[r10] = r1
                    com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.drug.im.imlight.b.AnonymousClass1.a
                    java.lang.String r12 = "35d4464562b7f9a08b90cbb822416704"
                    r4 = 0
                    r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                    r1 = r8
                    r2 = r22
                    r3 = r11
                    r5 = r12
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                    if (r1 == 0) goto L28
                    r1 = r22
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r1, r11, r9, r12)
                    com.sankuai.waimai.imbase.listener.model.a r0 = (com.sankuai.waimai.imbase.listener.model.a) r0
                    return r0
                L28:
                    r1 = r22
                    java.lang.String r2 = ""
                    java.lang.String r3 = r23.getFromName()
                    java.lang.String r13 = com.sankuai.waimai.business.im.prepare.h.a(r23)
                    org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L51
                    java.lang.String r5 = r23.getExtension()     // Catch: java.lang.Exception -> L51
                    r4.<init>(r5)     // Catch: java.lang.Exception -> L51
                    java.lang.String r5 = "poi_nickname"
                    java.lang.String r6 = ""
                    java.lang.String r5 = r4.optString(r5, r6)     // Catch: java.lang.Exception -> L51
                    java.lang.String r3 = "poi_logo_url"
                    java.lang.String r3 = r4.optString(r3)     // Catch: java.lang.Exception -> L50
                    r14 = r3
                    r12 = r5
                    goto L53
                L50:
                    r3 = r5
                L51:
                    r14 = r2
                    r12 = r3
                L53:
                    com.sankuai.waimai.imbase.listener.model.a r2 = new com.sankuai.waimai.imbase.listener.model.a
                    r2.<init>(r10)
                    long r3 = r23.getSts()
                    r5 = 6
                    java.lang.Object[] r5 = new java.lang.Object[r5]
                    r5[r9] = r2
                    r5[r10] = r12
                    r5[r0] = r13
                    r0 = 3
                    r5[r0] = r14
                    r0 = 4
                    java.lang.Long r6 = new java.lang.Long
                    r6.<init>(r3)
                    r5[r0] = r6
                    r0 = 5
                    java.lang.Byte r6 = java.lang.Byte.valueOf(r24)
                    r5[r0] = r6
                    com.meituan.robust.ChangeQuickRedirect r0 = com.sankuai.waimai.drug.im.imlight.b.a
                    java.lang.String r6 = "6f92d705c6a1adf9cdcbc3e567653e8e"
                    r16 = 0
                    r18 = 1
                    r20 = 4611686018427387904(0x4000000000000000, double:2.0)
                    r15 = r5
                    r17 = r0
                    r19 = r6
                    boolean r7 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20)
                    r8 = 0
                    if (r7 == 0) goto L91
                    com.meituan.robust.PatchProxy.accessDispatch(r5, r8, r0, r10, r6)
                    goto Ld3
                L91:
                    if (r24 == 0) goto Lb3
                    com.sankuai.waimai.foundation.utils.activity.a r0 = com.sankuai.waimai.foundation.utils.activity.a.a()
                    android.app.Activity r0 = r0.b()
                    if (r0 == 0) goto Ld3
                    com.sankuai.waimai.imbase.listener.model.a$a r0 = new com.sankuai.waimai.imbase.listener.model.a$a
                    r15 = 2130840186(0x7f020a7a, float:1.7285404E38)
                    r18 = 0
                    com.sankuai.waimai.drug.im.imlight.b$2 r19 = new com.sankuai.waimai.drug.im.imlight.b$2
                    r19.<init>()
                    r11 = r0
                    r16 = r3
                    r11.<init>(r12, r13, r14, r15, r16, r18, r19)
                    r2.a(r0)
                    goto Ld3
                Lb3:
                    com.sankuai.waimai.imbase.listener.model.a$b r0 = new com.sankuai.waimai.imbase.listener.model.a$b
                    android.content.Context r3 = com.meituan.android.singleton.b.a
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    r4.append(r12)
                    java.lang.String r5 = " : "
                    r4.append(r5)
                    r4.append(r13)
                    java.lang.String r4 = r4.toString()
                    r5 = 1001(0x3e9, float:1.403E-42)
                    r0.<init>(r3, r4, r8, r5)
                    r2.a(r0)
                Ld3:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.drug.im.imlight.b.AnonymousClass1.a(com.sankuai.xm.im.message.bean.IMMessage, boolean):com.sankuai.waimai.imbase.listener.model.a");
            }
        });
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29e67fcb47b55de790c72590082ef670", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29e67fcb47b55de790c72590082ef670");
        }
    }
}
