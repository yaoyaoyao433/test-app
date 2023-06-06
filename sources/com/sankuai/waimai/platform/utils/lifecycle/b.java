package com.sankuai.waimai.platform.utils.lifecycle;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.lifecycle.c;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.router.core.j;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements i {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.i
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Set<String> set;
        c.b put;
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4086d760387c99927d73c01b04e79378", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4086d760387c99927d73c01b04e79378");
            return;
        }
        Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra", null);
        if (bundle == null) {
            bundle = new Bundle();
            jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle);
        }
        long elapsedTimeMillis = TimeUtil.elapsedTimeMillis();
        bundle.putLong("_wm_router_start_", elapsedTimeMillis);
        c a2 = c.a();
        String path = jVar.d.getPath();
        Object[] objArr2 = {path, new Long(elapsedTimeMillis)};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "0ed3cbe3df1440e682c9245b02fbaf09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "0ed3cbe3df1440e682c9245b02fbaf09");
        } else if (!TextUtils.isEmpty(path) && (set = a2.b) != null && set.contains(path) && (put = a2.c.put(path, new c.b(elapsedTimeMillis, path))) != null) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c.b.a;
            if (PatchProxy.isSupport(objArr3, put, changeQuickRedirect3, false, "9b51c8741daa38d026fae47729385ed4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, put, changeQuickRedirect3, false, "9b51c8741daa38d026fae47729385ed4");
            } else {
                put.c.disable();
            }
        }
        gVar.a();
    }
}
