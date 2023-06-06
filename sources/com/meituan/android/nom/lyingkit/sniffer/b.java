package com.meituan.android.nom.lyingkit.sniffer;

import com.meituan.android.nom.lyingkit.LyingkitZone;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private final String b;
    private final String c;
    private final String d;
    private final LyingkitZone e;

    public b(String str, String str2, LyingkitZone lyingkitZone, String str3) {
        Object[] objArr = {str, str2, lyingkitZone, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a51612b92d9b91386b688d6b41e08ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a51612b92d9b91386b688d6b41e08ac");
            return;
        }
        this.b = str;
        this.c = str2;
        this.e = lyingkitZone;
        this.d = str3;
    }

    public final Map<String, String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2a3558672b5c15443df773712dbad10", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2a3558672b5c15443df773712dbad10");
        }
        HashMap hashMap = new HashMap(8);
        hashMap.put("className", this.b);
        hashMap.put("methodName", this.c);
        hashMap.put("alias", this.d);
        hashMap.put("zoneName", this.e != null ? this.e.b() : "");
        return hashMap;
    }
}
