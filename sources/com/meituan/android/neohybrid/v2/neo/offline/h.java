package com.meituan.android.neohybrid.v2.neo.offline;

import com.meituan.android.neohybrid.v2.neo.offline.g;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.FileUtils;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public static ChangeQuickRedirect a;
    private final DDResource b;
    private final String c;
    private final g.d d;

    private h(DDResource dDResource, String str, g.d dVar) {
        this.b = dDResource;
        this.c = str;
        this.d = dVar;
    }

    public static Runnable a(DDResource dDResource, String str, g.d dVar) {
        Object[] objArr = {dDResource, str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc0dfcfe5b170177829bccb2fd10a4a3", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc0dfcfe5b170177829bccb2fd10a4a3") : new h(dDResource, str, dVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentHashMap concurrentHashMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cee65685ccbf4d969bf7e4d73f9c76d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cee65685ccbf4d969bf7e4d73f9c76d");
            return;
        }
        DDResource dDResource = this.b;
        String str = this.c;
        g.d dVar = this.d;
        Object[] objArr2 = {dDResource, str, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = g.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4395c0072483bf01600e6c6d1686726f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4395c0072483bf01600e6c6d1686726f");
        } else if (dDResource != null && FileUtils.isFileExist(dDResource.getLocalPath())) {
            String localPath = dDResource.getLocalPath();
            new StringBuilder("getLocalPath ").append(dDResource.getLocalPath());
            concurrentHashMap = g.b;
            concurrentHashMap.put(str, localPath);
            g.d.put(localPath, dDResource.getVersion());
            new StringBuilder("成功拉取的最新离线包 ").append(dDResource.getVersion());
            dVar.a(localPath, g.c.LATEST_NET);
            new StringBuilder("load resource successfully: ").append(localPath);
        } else {
            dVar.a("wasai_ddd_load_resource_file_not_exist");
        }
    }
}
