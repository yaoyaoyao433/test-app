package com.sankuai.waimai.platform.mach.lottieextend;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.common.i;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2348df2178c60060d832c191f351bab8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2348df2178c60060d832c191f351bab8");
        } else {
            a("MachLottieDownloadFileSuccess", Integer.valueOf(i), str, str2);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b487178577a3cb6f3ecf27d420494bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b487178577a3cb6f3ecf27d420494bb");
        } else {
            a("MachLottieParseException", 1, str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, Number number, String str2, String str3) {
        Object[] objArr = {str, number, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e51a56775df60f8d10760c0e7904e58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e51a56775df60f8d10760c0e7904e58");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, number);
        Map<String, String> c = i.a().c();
        c.put("biz", "waimai");
        c.put("lottie_url", str2);
        c.put("template_id", str3);
        i.a().e().a(hashMap, c);
    }
}
