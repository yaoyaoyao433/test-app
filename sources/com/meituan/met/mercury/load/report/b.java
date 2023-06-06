package com.meituan.met.mercury.load.report;

import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends a {
    public static ChangeQuickRedirect e;
    private String f;
    private String g;
    private Float h;
    private Map<String, String> i;

    public b(String str, String str2, String str3, String str4, Float f, Map<String, String> map) {
        Object[] objArr = {str, str2, str3, str4, f, map};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49361ed8ec7be8a4a904323fc833c457", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49361ed8ec7be8a4a904323fc833c457");
            return;
        }
        this.c = str;
        this.d = str2;
        this.f = str3;
        this.g = str4;
        this.h = f;
        this.i = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75d000c91ddd75cdba3be4bf72d05cdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75d000c91ddd75cdba3be4bf72d05cdc");
            return;
        }
        c a = c.a();
        String str = this.c;
        String str2 = this.d;
        String str3 = this.f;
        String str4 = this.g;
        Float f = this.h;
        Map<String, String> map = this.i;
        Object[] objArr2 = {str, str2, str3, str4, f, map};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "4b22bae4cb1ce448a103286ec8d29642", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "4b22bae4cb1ce448a103286ec8d29642");
            return;
        }
        try {
            Log.Builder builder = new Log.Builder("");
            HashMap hashMap = new HashMap();
            if (map != null && map.size() > 0) {
                hashMap.putAll(map);
            }
            c.a(hashMap);
            c.a(hashMap, str, str2, str3);
            builder.reportChannel("prism-report-ddd").lv4LocalStatus(true).tag(str4).value(f.floatValue()).optional(hashMap);
            Babel.logRT(builder.build());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
