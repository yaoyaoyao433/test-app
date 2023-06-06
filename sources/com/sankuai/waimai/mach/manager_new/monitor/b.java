package com.sankuai.waimai.mach.manager_new.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.mach.manager.download.exception.DownloadException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static int a(com.sankuai.waimai.mach.manager.exception.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d305fa0a3e7ead25914eef28878a495c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d305fa0a3e7ead25914eef28878a495c")).intValue();
        }
        if (aVar == null) {
            return 6;
        }
        if (!(aVar instanceof com.sankuai.waimai.mach.manager.download.exception.a)) {
            if (!(aVar instanceof CacheException)) {
                return aVar instanceof DownloadException ? 3 : 6;
            }
            switch (aVar.c) {
                case 17807:
                    return 4;
                case 17808:
                    break;
                case 17809:
                    return 2;
                default:
                    return 6;
            }
        }
        return 5;
    }
}
