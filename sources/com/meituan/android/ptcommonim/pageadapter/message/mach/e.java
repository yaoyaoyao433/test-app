package com.meituan.android.ptcommonim.pageadapter.message.mach;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements com.sankuai.waimai.mach.d {
    public static ChangeQuickRedirect a;
    int b;
    private final Context c;
    private final com.sankuai.waimai.mach.d d;
    private final com.sankuai.waimai.mach.d e;

    public e(Context context, com.sankuai.waimai.mach.d dVar, com.sankuai.waimai.mach.d dVar2) {
        Object[] objArr = {context, dVar, dVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81a4892520ba32b35034ecb7f02e1f36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81a4892520ba32b35034ecb7f02e1f36");
            return;
        }
        this.b = -1;
        this.c = context;
        this.d = dVar;
        this.e = dVar2;
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1076480b9a9c48414d1eeefc8b143f64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1076480b9a9c48414d1eeefc8b143f64");
        } else if (map == null) {
        } else {
            if (i != 2) {
                if (i == 1) {
                    Map<String, Object> map2 = (Map) map.get("platformMgeJson");
                    if (map2 != null && !map2.isEmpty()) {
                        try {
                            if (this.e != null) {
                                this.e.a(str, str2, i, map2, aVar);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    Map<String, Object> map3 = (Map) map.get("originMgeJson");
                    Map<String, Object> map4 = (map2 == null && map3 == null) ? map : map3;
                    try {
                        if (this.d != null) {
                            this.d.a(str, str2, i, map4, aVar);
                        }
                    } catch (Throwable unused2) {
                    }
                }
            } else if (this.b == 0) {
                Map<String, Object> map5 = (Map) map.get("platformMgeJson");
                if (map5 == null || map5.isEmpty()) {
                    return;
                }
                try {
                    if (this.e != null) {
                        this.e.a(str, str2, i, map5, aVar);
                    }
                } catch (Throwable unused3) {
                }
            } else if (this.b == 1) {
                Map<String, Object> map6 = (Map) map.get("originMgeJson");
                Map<String, Object> map7 = (map6 == null && ((Map) map.get("platformMgeJson")) == null) ? map : map6;
                try {
                    if (this.d != null) {
                        this.d.a(str, str2, i, map7, aVar);
                    }
                } catch (Throwable unused4) {
                }
            }
        }
    }
}
