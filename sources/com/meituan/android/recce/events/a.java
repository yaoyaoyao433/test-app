package com.meituan.android.recce.events;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a implements c {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.recce.events.c
    public final String a() {
        return "app_event";
    }

    public static a a(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45246540cfbd72ef733e6bba89f1baf3", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45246540cfbd72ef733e6bba89f1baf3") : new a() { // from class: com.meituan.android.recce.events.a.1
            @Override // com.meituan.android.recce.events.c
            public final String b() {
                return str;
            }

            @Override // com.meituan.android.recce.events.c
            public final String c() {
                return str2;
            }
        };
    }
}
