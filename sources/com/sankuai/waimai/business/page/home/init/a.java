package com.sankuai.waimai.business.page.home.init;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.sankuai.waimai.monitor.model.CommonParamsInfo a(android.content.Context r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.business.page.home.init.a.a
            java.lang.String r10 = "299ca644974b7b2aea930b35763e64d7"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r11 = 0
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            com.sankuai.waimai.monitor.model.CommonParamsInfo r11 = (com.sankuai.waimai.monitor.model.CommonParamsInfo) r11
            return r11
        L1f:
            java.lang.String r0 = "native"
            java.lang.Class r1 = r11.getClass()     // Catch: java.lang.Exception -> L4e
            java.lang.Package r1 = r1.getPackage()     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Exception -> L4e
            boolean r2 = r11 instanceof com.sankuai.waimai.reactnative.WmRNActivity     // Catch: java.lang.Exception -> L4e
            if (r2 != 0) goto L49
            java.lang.String r2 = "reactnative"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Exception -> L4e
            if (r2 == 0) goto L3c
            goto L49
        L3c:
            java.lang.String r2 = "knb"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Exception -> L4e
            if (r1 == 0) goto L4f
            java.lang.String r1 = "webview"
            goto L4c
        L49:
            java.lang.String r1 = "mrn"
        L4c:
            r0 = r1
            goto L4f
        L4e:
        L4f:
            java.lang.String r1 = "mrn"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto La1
            com.sankuai.waimai.monitor.model.MRNParamsInfo r0 = new com.sankuai.waimai.monitor.model.MRNParamsInfo
            r0.<init>()
            boolean r1 = r11 instanceof com.sankuai.waimai.reactnative.WmRNActivity
            if (r1 == 0) goto L101
            r1 = r11
            com.sankuai.waimai.reactnative.WmRNActivity r1 = (com.sankuai.waimai.reactnative.WmRNActivity) r1
            java.lang.String r1 = r1.m()
            r2 = r0
            com.sankuai.waimai.monitor.model.MRNParamsInfo r2 = (com.sankuai.waimai.monitor.model.MRNParamsInfo) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "rn_waimai_"
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.setBundleName(r3)
            java.lang.Class r3 = r11.getClass()
            java.lang.String r3 = r3.getName()
            r2.setComponentName(r3)
            java.lang.Class r11 = r11.getClass()
            java.lang.Package r11 = r11.getPackage()
            java.lang.String r11 = r11.getName()
            r2.setComponentLibrary(r11)
            java.lang.String r11 = "waimai_mrn"
            r2.setSnifferBusiness(r11)
            r2.setSnifferModule(r1)
            goto L101
        La1:
            java.lang.String r1 = "webview"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lc9
            com.sankuai.waimai.monitor.model.WebParamsInfo r0 = new com.sankuai.waimai.monitor.model.WebParamsInfo
            r0.<init>()
            r11 = r0
            com.sankuai.waimai.monitor.model.WebParamsInfo r11 = (com.sankuai.waimai.monitor.model.WebParamsInfo) r11
            java.lang.String r1 = "waimai"
            r11.setwType(r1)
            java.util.Map r1 = com.sankuai.waimai.business.page.home.utils.p.a()
            java.lang.String r1 = r1.toString()
            r11.setwParams(r1)
            java.lang.String r1 = ""
            r11.setUa(r1)
            goto L101
        Lc9:
            com.sankuai.waimai.monitor.model.NativeParamsInfo r0 = new com.sankuai.waimai.monitor.model.NativeParamsInfo
            r0.<init>()
            r1 = r0
            com.sankuai.waimai.monitor.model.NativeParamsInfo r1 = (com.sankuai.waimai.monitor.model.NativeParamsInfo) r1
            java.lang.Class r2 = r11.getClass()
            java.lang.String r2 = r2.getName()
            r1.setPageName(r2)
            java.lang.Class r2 = r11.getClass()
            java.lang.String r2 = r2.getName()
            r1.setErrorPage(r2)
            java.lang.Class r2 = r11.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.setComponentName(r2)
            java.lang.Class r11 = r11.getClass()
            java.lang.Package r11 = r11.getPackage()
            java.lang.String r11 = r11.getName()
            r1.setComponentLibrary(r11)
        L101:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.init.a.a(android.content.Context):com.sankuai.waimai.monitor.model.CommonParamsInfo");
    }
}
