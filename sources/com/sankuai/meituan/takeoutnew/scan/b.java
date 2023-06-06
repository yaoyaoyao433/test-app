package com.sankuai.meituan.takeoutnew.scan;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.scan.handler.ScanResultHandler;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    com.sankuai.meituan.takeoutnew.scan.a b;
    protected final List<String> c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95c4b62b327b72ebf59bb2cbdba8b758", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95c4b62b327b72ebf59bb2cbdba8b758");
            return;
        }
        this.b = new com.sankuai.meituan.takeoutnew.scan.a();
        this.c = new LinkedList();
        a("http");
        a("WMScheme");
        a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        private static final b a = new b();
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "615b894183d7b0ffb8cfd703c30cd274", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "615b894183d7b0ffb8cfd703c30cd274");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.c.add(str);
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd054f9e4a0cf70bbe36c2a555b56d69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd054f9e4a0cf70bbe36c2a555b56d69");
            return;
        }
        for (String str : this.c) {
            if (!TextUtils.isEmpty(str)) {
                com.sankuai.meituan.takeoutnew.scan.a aVar = this.b;
                ScanResultHandler scanResultHandler = (ScanResultHandler) com.sankuai.waimai.router.a.a(ScanResultHandler.class, str);
                Object[] objArr2 = {scanResultHandler};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.takeoutnew.scan.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "8500ea903bcfdd0b51a81574b571566b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "8500ea903bcfdd0b51a81574b571566b");
                } else if (scanResultHandler != null) {
                    aVar.b.add(scanResultHandler);
                }
            }
        }
    }
}
