package com.sankuai.waimai.platform.mach.extension.nestedv2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String module() {
        return "wmembed";
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e539d5a9500b6931775481443bbb57bb", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e539d5a9500b6931775481443bbb57bb") : new String[]{"loadTemplate"};
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(java.lang.String r26, java.lang.String r27, java.lang.String r28, com.sankuai.waimai.mach.jsv8.a r29) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.mach.extension.nestedv2.c.invoke(java.lang.String, java.lang.String, java.lang.String, com.sankuai.waimai.mach.jsv8.a):void");
    }

    private void a(com.sankuai.waimai.mach.jsv8.a aVar, String str, boolean z, String str2) {
        Object[] objArr = {aVar, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a65a36080811429bbd29ad03276344a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a65a36080811429bbd29ad03276344a");
        } else if (aVar != null) {
            StringBuilder sb = new StringBuilder("{\"status\":");
            sb.append(z ? 0 : -1);
            sb.append(",\"data\": {");
            sb.append("\"success\":");
            sb.append(z);
            sb.append(",\"message\":\"");
            sb.append(str2);
            sb.append("\"}}");
            aVar.a(str, sb.toString());
        }
    }
}
