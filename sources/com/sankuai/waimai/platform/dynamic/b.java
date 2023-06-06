package com.sankuai.waimai.platform.dynamic;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.report.IAdChargeManagerService;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b implements com.sankuai.waimai.mach.d {
    public static ChangeQuickRedirect c;
    private String a;
    private String b;
    private IAdChargeManagerService d;

    public b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b5d5d8bc4f7b4e369c89dd1076eade3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b5d5d8bc4f7b4e369c89dd1076eade3");
            return;
        }
        this.a = str;
        this.b = str2;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bbbc6fcffb938673fa5d2fb4040b530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bbbc6fcffb938673fa5d2fb4040b530");
            return;
        }
        List a = com.sankuai.meituan.serviceloader.b.a(IAdChargeManagerService.class, "IAdChargeManagerService");
        if (a == null || a.isEmpty()) {
            return;
        }
        this.d = (IAdChargeManagerService) a.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // com.sankuai.waimai.mach.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r28, java.lang.String r29, int r30, java.util.Map<java.lang.String, java.lang.Object> r31, com.sankuai.waimai.mach.node.a r32) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.dynamic.b.a(java.lang.String, java.lang.String, int, java.util.Map, com.sankuai.waimai.mach.node.a):void");
    }
}
