package com.meituan.android.neohybrid.v2.neo.offline;

import android.text.TextUtils;
import com.meituan.android.neohybrid.v2.neo.offline.g;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.FileUtils;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {
    public static ChangeQuickRedirect a;
    private final DDResource b;
    private final String c;
    private final g.d d;

    private j(DDResource dDResource, String str, g.d dVar) {
        this.b = dDResource;
        this.c = str;
        this.d = dVar;
    }

    public static Runnable a(DDResource dDResource, String str, g.d dVar) {
        Object[] objArr = {dDResource, str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0909d35632d6165b29c9dbb3ed42f634", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0909d35632d6165b29c9dbb3ed42f634") : new j(dDResource, str, dVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e8c6ca9913ef88e9a08799ac980be17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e8c6ca9913ef88e9a08799ac980be17");
            return;
        }
        DDResource dDResource = this.b;
        String str = this.c;
        g.d dVar = this.d;
        Object[] objArr2 = {dDResource, str, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = g.AnonymousClass2.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cb306c92e57c99c4a80bf7391b0a670c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cb306c92e57c99c4a80bf7391b0a670c");
            return;
        }
        new StringBuilder("成功拉取的兜底离线包 ").append(dDResource.getVersion());
        if (dDResource != null && FileUtils.isFileExist(dDResource.getLocalPath())) {
            concurrentHashMap = g.b;
            String str2 = (String) concurrentHashMap.get(str);
            String str3 = TextUtils.isEmpty(str2) ? "" : (String) g.d.get(str2);
            if (TextUtils.isEmpty(str3) || g.a(dDResource.getVersion(), str3) > 0 || TextUtils.isEmpty(str2)) {
                concurrentHashMap2 = g.b;
                concurrentHashMap2.put(str, dDResource.getLocalPath());
                g.d.put(dDResource.getLocalPath(), dDResource.getVersion());
                dVar.a(dDResource.getLocalPath(), g.c.DEFAULT_NET);
                return;
            }
            dVar.a(str2, g.c.LATEST_NET);
            return;
        }
        dVar.a("wasai_ddd_load_resource_file_not_exist");
    }
}
