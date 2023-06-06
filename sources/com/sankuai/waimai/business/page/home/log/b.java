package com.sankuai.waimai.business.page.home.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.e;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(String str, BaseResponse baseResponse, BaseResponse baseResponse2, e eVar) {
        Object[] objArr = {str, baseResponse, baseResponse2, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be228d1bae16a87bc945bf9bbc4e653f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be228d1bae16a87bc945bf9bbc4e653f");
        } else {
            i.d(new a().a("home_show_error_api").b(str).c("api原因导致页面显示失败异常").d(a(str, baseResponse, baseResponse2, eVar, null)).b(true).b());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:7:0x004f, B:9:0x0063, B:14:0x006b, B:16:0x0073, B:20:0x0079, B:24:0x0087, B:31:0x00a0, B:35:0x00ae, B:34:0x00aa, B:27:0x0091, B:30:0x0098, B:23:0x0083), top: B:39:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:7:0x004f, B:9:0x0063, B:14:0x006b, B:16:0x0073, B:20:0x0079, B:24:0x0087, B:31:0x00a0, B:35:0x00ae, B:34:0x00aa, B:27:0x0091, B:30:0x0098, B:23:0x0083), top: B:39:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r18, com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse r19, com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse r20, com.sankuai.waimai.platform.capacity.log.e r21, java.lang.String r22) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r12 = 0
            r4[r12] = r0
            r13 = 1
            r4[r13] = r1
            r5 = 2
            r4[r5] = r2
            r5 = 3
            r4[r5] = r3
            r14 = 0
            r5 = 4
            r4[r5] = r14
            com.meituan.robust.ChangeQuickRedirect r15 = com.sankuai.waimai.business.page.home.log.b.a
            java.lang.String r10 = "e4181b78be83cdcd8d433bac1f6b59be"
            r6 = 0
            r8 = 1
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r5 = r4
            r7 = r15
            r9 = r10
            r12 = r10
            r10 = r16
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10)
            if (r5 == 0) goto L36
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r4, r14, r15, r13, r12)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L36:
            java.util.Map r4 = com.sankuai.waimai.business.page.home.utils.p.a()
            com.sankuai.waimai.foundation.location.v2.g r5 = com.sankuai.waimai.foundation.location.v2.g.a()
            com.sankuai.waimai.foundation.location.v2.WmAddress r5 = r5.k()
            com.sankuai.waimai.foundation.location.v2.g r6 = com.sankuai.waimai.foundation.location.v2.g.a()
            com.sankuai.waimai.foundation.location.v2.WmAddress r6 = r6.j()
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r8 = "request_param"
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lc0
            r7.put(r8, r4)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r4 = "api_code"
            r7.put(r4, r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = "poilist_data_is_null"
            if (r1 == 0) goto L6a
            D r1 = r1.data     // Catch: java.lang.Exception -> Lc0
            if (r1 != 0) goto L68
            goto L6a
        L68:
            r1 = 0
            goto L6b
        L6a:
            r1 = 1
        L6b:
            r7.put(r0, r1)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = "rcmdboard_data_is_null"
            if (r2 == 0) goto L79
            D r1 = r2.data     // Catch: java.lang.Exception -> Lc0
            if (r1 != 0) goto L78
            goto L79
        L78:
            r13 = 0
        L79:
            r7.put(r0, r13)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = "address"
            if (r5 != 0) goto L83
            java.lang.String r1 = ""
            goto L87
        L83:
            java.lang.String r1 = r5.getAddress()     // Catch: java.lang.Exception -> Lc0
        L87:
            r7.put(r0, r1)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = "cityName"
            if (r5 != 0) goto L91
        L8e:
            java.lang.String r1 = ""
            goto La0
        L91:
            com.sankuai.waimai.foundation.location.v2.City r1 = r5.getMeitaunCity()     // Catch: java.lang.Exception -> Lc0
            if (r1 != 0) goto L98
            goto L8e
        L98:
            com.sankuai.waimai.foundation.location.v2.City r1 = r5.getMeitaunCity()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r1 = r1.getCityName()     // Catch: java.lang.Exception -> Lc0
        La0:
            r7.put(r0, r1)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = "actualAddress"
            if (r6 != 0) goto Laa
            java.lang.String r1 = ""
            goto Lae
        Laa:
            java.lang.String r1 = r6.getAddress()     // Catch: java.lang.Exception -> Lc0
        Lae:
            r7.put(r0, r1)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = "api_record"
            java.lang.String r1 = com.sankuai.waimai.platform.widget.emptylayout.c.a(r3, r14)     // Catch: java.lang.Exception -> Lc0
            r7.put(r0, r1)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = "random_pageid"
            r7.put(r0, r14)     // Catch: java.lang.Exception -> Lc0
        Lc0:
            java.lang.String r0 = r7.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.log.b.a(java.lang.String, com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse, com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse, com.sankuai.waimai.platform.capacity.log.e, java.lang.String):java.lang.String");
    }
}
