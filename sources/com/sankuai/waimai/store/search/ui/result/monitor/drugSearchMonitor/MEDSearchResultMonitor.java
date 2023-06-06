package com.sankuai.waimai.store.search.ui.result.monitor.drugSearchMonitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MEDSearchResultMonitor implements IMonitor {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    public MEDSearchResultMonitor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cd0576b447a6afc5b9d2419ae161678", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cd0576b447a6afc5b9d2419ae161678");
        } else {
            this.b = str;
        }
    }

    public MEDSearchResultMonitor(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e801f63eea25c4eff631461c18976cf6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e801f63eea25c4eff631461c18976cf6");
            return;
        }
        this.b = str;
        this.c = str2;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public String name() {
        return this.c;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6c5699c87cd2e68d9905d375f8cf8e2", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6c5699c87cd2e68d9905d375f8cf8e2") : new c() { // from class: com.sankuai.waimai.store.search.ui.result.monitor.drugSearchMonitor.MEDSearchResultMonitor.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.util.monitor.monitor.c
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74c86239998b4530cc7cc9f0d0111722", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74c86239998b4530cc7cc9f0d0111722") : MEDSearchResultMonitor.this.b;
            }
        };
    }
}
