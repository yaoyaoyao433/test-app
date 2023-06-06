package com.sankuai.waimai.store.util.monitor.report;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements c {
    public static ChangeQuickRedirect a;
    @NonNull
    private final c b;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0739e829812074f7f0c58f9bedccdfb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0739e829812074f7f0c58f9bedccdfb2");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.b = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9c9037c9e33f6151c26f75db4935afc", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9c9037c9e33f6151c26f75db4935afc") : new f();
    }

    @Override // com.sankuai.waimai.store.util.monitor.report.c
    public final void a(IMonitor iMonitor, String str, String str2) {
        Object[] objArr = {iMonitor, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff32643a31bb2f2b8f164bf35d03d9c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff32643a31bb2f2b8f164bf35d03d9c4");
        } else {
            this.b.a(iMonitor, str, str2);
        }
    }

    @Override // com.sankuai.waimai.store.util.monitor.report.c
    public final void a(IMonitor iMonitor, String str, String str2, Map<String, String> map) {
        Object[] objArr = {iMonitor, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12f8cbb5268fd12b61d0fce437c08aa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12f8cbb5268fd12b61d0fce437c08aa6");
        } else {
            this.b.a(iMonitor, str, str2, map);
        }
    }

    @Override // com.sankuai.waimai.store.util.monitor.report.c
    public final void d(IMonitor iMonitor) {
        Object[] objArr = {iMonitor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89e1298d2ff04e5604682fc50b3ecd85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89e1298d2ff04e5604682fc50b3ecd85");
        } else {
            this.b.d(iMonitor);
        }
    }

    @Override // com.sankuai.waimai.store.util.monitor.report.c
    public final void b(IMonitor iMonitor, String str, String str2) {
        Object[] objArr = {iMonitor, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be0b6c45a27ef200a15bb4d94a9d80ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be0b6c45a27ef200a15bb4d94a9d80ef");
        } else {
            this.b.b(iMonitor, str, str2);
        }
    }

    @Override // com.sankuai.waimai.store.util.monitor.report.c
    public final void b(IMonitor iMonitor, String str, String str2, Map<String, String> map) {
        Object[] objArr = {iMonitor, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e884b28026a1cda3da84c9d42238f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e884b28026a1cda3da84c9d42238f9");
        } else {
            this.b.b(iMonitor, str, str2, map);
        }
    }
}
