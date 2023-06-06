package com.sankuai.waimai.store.search.common.api.net;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.waimai.store.monitor.d;
import com.sankuai.waimai.store.search.common.api.monitor.e;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.GlobalSearch;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements d {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.search.common.api.monitor.d b;

    @Override // com.sankuai.waimai.store.monitor.d
    public final void a(String str, @Nullable ak akVar, int i, @Nullable String str2, String str3) {
        com.sankuai.waimai.store.search.common.api.monitor.b bVar;
        Object[] objArr = {str, akVar, Integer.valueOf(i), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "514e957d3e7c4e57b7cfd187641a5939", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "514e957d3e7c4e57b7cfd187641a5939");
        } else if (str2 != null) {
            if (this.b == null) {
                this.b = new com.sankuai.waimai.store.search.common.api.monitor.d();
            }
            com.sankuai.waimai.store.search.common.api.monitor.d dVar = this.b;
            Object[] objArr2 = {Integer.valueOf(i), str2};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.search.common.api.monitor.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "5e962bcf4e4bde9862a7cd23f40dc0bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "5e962bcf4e4bde9862a7cd23f40dc0bd");
                return;
            }
            com.sankuai.waimai.store.search.common.api.monitor.c a2 = new e().a(i, str2);
            if (a2.b || (bVar = a2.c) == null) {
                return;
            }
            Object[] objArr3 = {bVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.search.common.api.monitor.d.a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "3707a90a86da764ed740d07b2d84e99c", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "3707a90a86da764ed740d07b2d84e99c")).booleanValue();
            } else if (bVar == null || TextUtils.isEmpty(bVar.a) || TextUtils.isEmpty(bVar.b)) {
            } else {
                if (dVar.b.isEmpty()) {
                    dVar.a(bVar);
                    return;
                }
                com.sankuai.waimai.store.search.common.api.monitor.b peekLast = dVar.b.peekLast();
                if (peekLast != null && !TextUtils.isEmpty(peekLast.a) && !TextUtils.isEmpty(peekLast.b)) {
                    if (peekLast.a.equals(bVar.a) && peekLast.b.equals(bVar.b)) {
                        if (peekLast.c - System.currentTimeMillis() <= LocationStrategy.LOCATION_TIMEOUT) {
                            if (dVar.b.size() > 5) {
                                Object[] objArr4 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.search.common.api.monitor.d.a;
                                if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "a243b62b498dc258084b7d6a6dac482c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "a243b62b498dc258084b7d6a6dac482c");
                                } else {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("name", bVar.a);
                                    hashMap.put("type", bVar.b);
                                    hashMap.put("description", bVar.d);
                                    com.sankuai.waimai.store.util.monitor.c.a(GlobalSearch.InnerVerifyException, i.a(hashMap), bVar.a);
                                }
                                dVar.a();
                                return;
                            }
                            dVar.a(bVar);
                            return;
                        }
                        dVar.a();
                        return;
                    }
                    dVar.a();
                    return;
                }
                dVar.a();
            }
        }
    }
}
