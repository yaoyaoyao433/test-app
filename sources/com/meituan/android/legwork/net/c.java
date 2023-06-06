package com.meituan.android.legwork.net;

import com.meituan.android.legwork.common.util.PmUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends com.meituan.android.legwork.common.net.a {
    public static ChangeQuickRedirect c;

    @Override // com.meituan.android.legwork.net.a
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a808c1e26327f187e67f78edb69aa562", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a808c1e26327f187e67f78edb69aa562");
        }
        String a = b.a().a(com.meituan.android.legwork.a.b);
        return a + ((String) PmUtil.a(new PmUtil.a<String>() { // from class: com.meituan.android.legwork.net.c.1
            @Override // com.meituan.android.legwork.common.util.PmUtil.a
            public final /* bridge */ /* synthetic */ String a() {
                return "mt/";
            }

            @Override // com.meituan.android.legwork.common.util.PmUtil.a
            public final /* bridge */ /* synthetic */ String b() {
                return "wm/";
            }

            @Override // com.meituan.android.legwork.common.util.PmUtil.a
            public final /* bridge */ /* synthetic */ String c() {
                return "dp/";
            }

            @Override // com.meituan.android.legwork.common.util.PmUtil.a
            public final /* bridge */ /* synthetic */ String d() {
                return "unknown/";
            }
        }));
    }
}
