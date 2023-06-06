package com.sankuai.waimai.mach.manager_new;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static c b = new c("", null);
    private BundleInfo c;
    private int d;

    public static String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11d7f3b04ee19eccf16e79dbab1c7204", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11d7f3b04ee19eccf16e79dbab1c7204");
        }
        switch (i) {
            case -1:
                return "删除";
            case 0:
                return "初始";
            case 1:
                return "注册";
            case 2:
                return "下载";
            case 3:
                return "归档";
            case 4:
                return "加载";
            case 5:
                return "缓存";
            case 6:
                return "使用";
            default:
                return "";
        }
    }

    public c(String str, BundleInfo bundleInfo) {
        Object[] objArr = {str, bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de4beb01cf6913e291618d2c57551ea9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de4beb01cf6913e291618d2c57551ea9");
            return;
        }
        this.d = 0;
        this.d = 1;
        this.c = bundleInfo;
    }

    public final synchronized void a(int i) {
        this.d = i;
    }

    public final synchronized int a() {
        return this.d;
    }
}
