package com.sankuai.waimai.store.base.preload;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.mrn.preload.i;
import com.sankuai.waimai.store.mrn.preload.l;
import com.sankuai.waimai.store.mrn.preload.p;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b925844e619a49b517e3472093349c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b925844e619a49b517e3472093349c1");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            p a2 = p.a(str);
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = i.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ce4d7d1d57bc0d94ff83ad20e232cd8d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ce4d7d1d57bc0d94ff83ad20e232cd8d");
            } else if (a2 != null) {
                l.a().b(a2);
            }
        }
    }
}
