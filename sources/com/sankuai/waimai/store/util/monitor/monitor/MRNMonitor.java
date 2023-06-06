package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MRNMonitor implements IMonitor {
    public static ChangeQuickRedirect a;
    private final String b;
    private final String c;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public String name() {
        return "";
    }

    public MRNMonitor(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89a5a231cb4d5a7bee805ace06a5587f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89a5a231cb4d5a7bee805ace06a5587f");
            return;
        }
        this.b = str;
        this.c = str2;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd6623e9d9e29136862ee352a4efd550", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd6623e9d9e29136862ee352a4efd550") : new c() { // from class: com.sankuai.waimai.store.util.monitor.monitor.MRNMonitor.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.util.monitor.monitor.c
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "861067ff5e53d7b7528b5bad2b59a41a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "861067ff5e53d7b7528b5bad2b59a41a") : MRNMonitor.this.b;
            }

            @Override // com.sankuai.waimai.store.util.monitor.monitor.c
            public final String c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c457f47febd4b9f4ed7ffbdaf4ce1e5b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c457f47febd4b9f4ed7ffbdaf4ce1e5b") : MRNMonitor.this.c;
            }
        };
    }
}
