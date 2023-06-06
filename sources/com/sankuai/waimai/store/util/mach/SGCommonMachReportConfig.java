package com.sankuai.waimai.store.util.mach;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGCommonMachReportConfig implements IMonitor {
    public static ChangeQuickRedirect a;
    private final String b;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return true;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public String name() {
        return "SGMachError";
    }

    public SGCommonMachReportConfig(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c9faf785c6bf7150c5a01b3951845d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c9faf785c6bf7150c5a01b3951845d6");
        } else {
            this.b = str;
        }
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de19aaafd5a13a8d2bcdb93ff300f9e8", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de19aaafd5a13a8d2bcdb93ff300f9e8") : new c() { // from class: com.sankuai.waimai.store.util.mach.SGCommonMachReportConfig.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.util.monitor.monitor.c
            public final String c() {
                return "SGMachError";
            }

            @Override // com.sankuai.waimai.store.util.monitor.monitor.c
            public final com.sankuai.waimai.store.util.monitor.monitor.b b() {
                return com.sankuai.waimai.store.util.monitor.monitor.b.NORMAL;
            }

            @Override // com.sankuai.waimai.store.util.monitor.monitor.c
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9d3f77a68cd6425fcc9c2db8f6bf05a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9d3f77a68cd6425fcc9c2db8f6bf05a") : SGCommonMachReportConfig.this.b;
            }
        };
    }
}
