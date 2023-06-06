package com.meituan.msc.modules.engine.requestPrefetch;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ab;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    private ab d;

    /* JADX WARN: Removed duplicated region for block: B:102:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x038e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final com.meituan.msc.modules.engine.requestPrefetch.d r29, final com.meituan.msc.modules.engine.requestPrefetch.f.a r30, com.meituan.msc.modules.engine.requestPrefetch.b r31) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.engine.requestPrefetch.e.a(com.meituan.msc.modules.engine.requestPrefetch.d, com.meituan.msc.modules.engine.requestPrefetch.f$a, com.meituan.msc.modules.engine.requestPrefetch.b):void");
    }

    private static String a(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a621e2bb987115300a0ae0f5c902ba3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a621e2bb987115300a0ae0f5c902ba3");
        }
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        HashMap hashMap = new HashMap();
        for (String str2 : queryParameterNames) {
            hashMap.put(str2, parse.getQueryParameter(str2));
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (TextUtils.isEmpty((String) hashMap.get(key))) {
                buildUpon.appendQueryParameter(key, entry.getValue());
            }
        }
        return buildUpon.build().toString();
    }

    public final synchronized void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e94cd02e8477d12366322794631e8ed7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e94cd02e8477d12366322794631e8ed7");
            return;
        }
        if (this.d != null && !this.d.b) {
            this.d.cancel();
        }
    }

    synchronized void a(ab abVar) {
        this.d = abVar;
    }
}
