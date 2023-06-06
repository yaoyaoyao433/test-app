package com.sankuai.waimai.mach.manager_new.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    public static int b = 0;
    public static int c = 1;
    public static int d = 2;
    public List<a> e;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b4076c6feff44ebb6a0a7c5aeaea919", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b4076c6feff44ebb6a0a7c5aeaea919");
        } else {
            this.e = new ArrayList();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public BundleInfo c;

        public a(int i, BundleInfo bundleInfo) {
            Object[] objArr = {Integer.valueOf(i), bundleInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7f5014024b083d7b453cbda92e04c27", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7f5014024b083d7b453cbda92e04c27");
                return;
            }
            this.b = i;
            this.c = bundleInfo;
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16daede0fda7aee6510a7e8218fd66ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16daede0fda7aee6510a7e8218fd66ed");
        } else {
            this.e.add(aVar);
        }
    }
}
