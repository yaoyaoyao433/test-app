package com.sankuai.waimai.foundation.core.service.collect;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b implements ICollectPoiManagerService {
    public static ChangeQuickRedirect a;
    private static volatile b b;
    private ICollectPoiManagerService c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2536b7fde2eb12c03af1df1415938bb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2536b7fde2eb12c03af1df1415938bb3");
        } else {
            this.c = (ICollectPoiManagerService) com.sankuai.waimai.router.a.a(ICollectPoiManagerService.class, ICollectPoiManagerService.KEY);
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "606584b916f38dea1290e910434fbd45", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "606584b916f38dea1290e910434fbd45");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.ICollectPoiManagerService
    public void cancelCollectPoi(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d3f6ca6871d253179a2cbd5be69d30b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d3f6ca6871d253179a2cbd5be69d30b");
        } else if (this.c != null) {
            this.c.cancelCollectPoi(activity, str, str2);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.ICollectPoiManagerService
    public void collectPoi(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b135897500376c94e3f1fde2bc9ce03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b135897500376c94e3f1fde2bc9ce03");
        } else if (this.c != null) {
            this.c.collectPoi(activity, str, str2);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.ICollectPoiManagerService
    public void checkCollectPoi(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45c3b1a26d53d2416c6ef6e2e772b18c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45c3b1a26d53d2416c6ef6e2e772b18c");
        } else if (this.c != null) {
            this.c.checkCollectPoi(activity, str, str2);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.ICollectPoiManagerService
    public void setCollectPoiListener(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08174481d892f415e1aa353c26b6aa07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08174481d892f415e1aa353c26b6aa07");
        } else if (this.c != null) {
            this.c.setCollectPoiListener(aVar);
        }
    }
}
