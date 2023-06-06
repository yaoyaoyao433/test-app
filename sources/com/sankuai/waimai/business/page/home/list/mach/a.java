package com.sankuai.waimai.business.page.home.list.mach;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.c;
import com.sankuai.waimai.mach.k;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.mach.util.WmMachImageLoaderUtil;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    String d;
    int e;
    int f;
    String g;
    private String h;
    private String i;
    private String j;
    private WmMachImageLoaderUtil.LoadStatusListener k;

    public static /* synthetic */ String a(a aVar, com.sankuai.waimai.mach.node.a aVar2) {
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "a2ecf63c80b83f1ae3dcfb9f9c548bf3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "a2ecf63c80b83f1ae3dcfb9f9c548bf3") : aVar2.f != null ? aVar2.f.getTemplateId() : "templateId is null";
    }

    public static /* synthetic */ void a(a aVar, String str, String str2, boolean z, Exception exc) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "535b720e537932d04139e835b9980697", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "535b720e537932d04139e835b9980697");
        } else {
            i.d(new com.sankuai.waimai.business.page.home.log.a().a(aVar.h).b(aVar.i).c(aVar.j).d(aVar.a(str, str2, z, exc)).b(true).b());
        }
    }

    public static /* synthetic */ String b(a aVar, com.sankuai.waimai.mach.node.a aVar2) {
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "6c3e87959d9a267687f9e03487798a25", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "6c3e87959d9a267687f9e03487798a25") : (String) aVar2.h().get("source");
    }

    public a(String str, String str2, String str3, int i, int i2, String str4, int i3, int i4, String str5) {
        Object[] objArr = {str, str2, str3, 10001, 10002, str4, 10001, 10002, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbd9087dc3ba790190f063e28ce8a909", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbd9087dc3ba790190f063e28ce8a909");
            return;
        }
        this.k = new WmMachImageLoaderUtil.LoadStatusListener() { // from class: com.sankuai.waimai.business.page.home.list.mach.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.mach.util.WmMachImageLoaderUtil.LoadStatusListener
            public final void a(com.sankuai.waimai.mach.node.a aVar, int i5, boolean z, Exception exc) {
                Object[] objArr2 = {aVar, Integer.valueOf(i5), Byte.valueOf(z ? (byte) 1 : (byte) 0), exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63406e970dec16a82f7dfb80dbc0a1eb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63406e970dec16a82f7dfb80dbc0a1eb");
                } else if (aVar == null || aVar.h() == null) {
                } else {
                    if (z) {
                        if (i5 == 0) {
                            com.sankuai.waimai.platform.capacity.log.c.a().a(a.this.b, a.this.d, SystemClock.elapsedRealtime());
                            return;
                        }
                        a.a(a.this, a.a(a.this, aVar), a.b(a.this, aVar), z, exc);
                        com.sankuai.waimai.platform.capacity.log.c.a().a(a.this.c, a.this.d, SystemClock.elapsedRealtime());
                    } else if (i5 == 0) {
                        com.sankuai.waimai.platform.capacity.log.c.a().a(a.this.e, a.this.g, SystemClock.elapsedRealtime());
                    } else {
                        a.a(a.this, a.a(a.this, aVar), a.b(a.this, aVar), z, exc);
                        com.sankuai.waimai.platform.capacity.log.c.a().a(a.this.f, a.this.g, SystemClock.elapsedRealtime());
                    }
                }
            }
        };
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.b = 10001;
        this.c = 10002;
        this.d = str4;
        this.e = 10001;
        this.f = 10002;
        this.g = str5;
    }

    @Override // com.sankuai.waimai.mach.c
    public final void a(c.a aVar, k kVar) {
        Object[] objArr = {aVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c09da952df6c9001882b867640ce2d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c09da952df6c9001882b867640ce2d9");
        } else {
            WmMachImageLoaderUtil.a(aVar, kVar, this.k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:7:0x0044, B:11:0x0059, B:18:0x0072, B:22:0x0080, B:21:0x007c, B:14:0x0063, B:17:0x006a, B:10:0x0055), top: B:26:0x0044 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.lang.String r11, java.lang.String r12, boolean r13, java.lang.Exception r14) {
        /*
            r10 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r11
            r1 = 1
            r0[r1] = r12
            java.lang.Byte r13 = java.lang.Byte.valueOf(r13)
            r1 = 2
            r0[r1] = r13
            r13 = 3
            r0[r13] = r14
            com.meituan.robust.ChangeQuickRedirect r13 = com.sankuai.waimai.business.page.home.list.mach.a.a
            java.lang.String r9 = "2a78057256dff10aea5dc4e789317a2c"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r10
            r3 = r13
            r5 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2b
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r0, r10, r13, r8, r9)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L2b:
            java.util.Map r13 = com.sankuai.waimai.business.page.home.utils.p.a()
            com.sankuai.waimai.foundation.location.v2.g r0 = com.sankuai.waimai.foundation.location.v2.g.a()
            com.sankuai.waimai.foundation.location.v2.WmAddress r0 = r0.k()
            com.sankuai.waimai.foundation.location.v2.g r1 = com.sankuai.waimai.foundation.location.v2.g.a()
            com.sankuai.waimai.foundation.location.v2.WmAddress r1 = r1.j()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "request_param"
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> La1
            r2.put(r3, r13)     // Catch: java.lang.Exception -> La1
            java.lang.String r13 = "address"
            if (r0 != 0) goto L55
            java.lang.String r3 = ""
            goto L59
        L55:
            java.lang.String r3 = r0.getAddress()     // Catch: java.lang.Exception -> La1
        L59:
            r2.put(r13, r3)     // Catch: java.lang.Exception -> La1
            java.lang.String r13 = "cityName"
            if (r0 != 0) goto L63
        L60:
            java.lang.String r0 = ""
            goto L72
        L63:
            com.sankuai.waimai.foundation.location.v2.City r3 = r0.getMeitaunCity()     // Catch: java.lang.Exception -> La1
            if (r3 != 0) goto L6a
            goto L60
        L6a:
            com.sankuai.waimai.foundation.location.v2.City r0 = r0.getMeitaunCity()     // Catch: java.lang.Exception -> La1
            java.lang.String r0 = r0.getCityName()     // Catch: java.lang.Exception -> La1
        L72:
            r2.put(r13, r0)     // Catch: java.lang.Exception -> La1
            java.lang.String r13 = "actualAddress"
            if (r1 != 0) goto L7c
            java.lang.String r0 = ""
            goto L80
        L7c:
            java.lang.String r0 = r1.getAddress()     // Catch: java.lang.Exception -> La1
        L80:
            r2.put(r13, r0)     // Catch: java.lang.Exception -> La1
            java.lang.String r13 = "template"
            r2.put(r13, r11)     // Catch: java.lang.Exception -> La1
            java.lang.String r11 = "image_url"
            r2.put(r11, r12)     // Catch: java.lang.Exception -> La1
            java.lang.String r11 = "retry"
            java.lang.String r12 = "retry"
            r2.put(r11, r12)     // Catch: java.lang.Exception -> La1
            java.lang.String r11 = "error"
            java.lang.String r12 = r14.getMessage()     // Catch: java.lang.Exception -> La1
            r2.put(r11, r12)     // Catch: java.lang.Exception -> La1
        La1:
            java.lang.String r11 = r2.toString()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.list.mach.a.a(java.lang.String, java.lang.String, boolean, java.lang.Exception):java.lang.String");
    }
}
