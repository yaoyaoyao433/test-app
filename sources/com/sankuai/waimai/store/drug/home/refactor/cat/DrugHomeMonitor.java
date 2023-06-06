package com.sankuai.waimai.store.drug.home.refactor.cat;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugHomeMonitor implements IMonitor {
    public static ChangeQuickRedirect a;
    private String b;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public String name() {
        return "";
    }

    public DrugHomeMonitor(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6716ea9564f328f7d8b4c3e988e204d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6716ea9564f328f7d8b4c3e988e204d");
        } else {
            this.b = str;
        }
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9e217bea33cfe120bc9968c37eab177", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9e217bea33cfe120bc9968c37eab177") : new c() { // from class: com.sankuai.waimai.store.drug.home.refactor.cat.DrugHomeMonitor.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.util.monitor.monitor.c
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e1e10cccc2170fafe1925fc6884232d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e1e10cccc2170fafe1925fc6884232d") : DrugHomeMonitor.this.b;
            }
        };
    }
}
