package com.meituan.android.privacy.impl.config;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.t;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class m {
    public static ChangeQuickRedirect a;
    public static volatile boolean b;
    private static volatile SyncService c;
    private static final Interceptor d = new Interceptor() { // from class: com.meituan.android.privacy.impl.config.m.1
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.meituan.retrofit2.Interceptor
        public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6ab83f30c72436c1be518866d5a88a2", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6ab83f30c72436c1be518866d5a88a2");
            }
            aj request = aVar.request();
            if (m.b) {
                try {
                    URI uri = new URI(request.b());
                    aj.a b2 = request.a().b(new t.a().a("https").b("appmock.sankuai.com").c(uri.getRawPath()).d(uri.getRawQuery()).b().toString()).b("MKOriginHost", uri.getHost()).b("MKScheme", uri.getScheme()).b("MKAppID", "10");
                    z initConfig = PermissionGuard.a.a.getInitConfig();
                    if (initConfig != null && !TextUtils.isEmpty(initConfig.b())) {
                        b2.b("MKUnionId", initConfig.b());
                    }
                    request = b2.a();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
            return aVar.a(request);
        }
    };

    @WorkerThread
    @NonNull
    public static SyncService a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8710e3d777dc46dbee226865c255743", RobustBitConfig.DEFAULT_VALUE)) {
            return (SyncService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8710e3d777dc46dbee226865c255743");
        }
        if (c == null) {
            synchronized (m.class) {
                if (c == null) {
                    c = (SyncService) new ar.a().a("https://p.meituan.com").a(com.sankuai.meituan.retrofit2.callfactory.urlconnection.a.a()).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a(d).a().a(SyncService.class);
                }
            }
        }
        return c;
    }

    public static void a(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aabdc702d65326ee621e3568c72e9a1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aabdc702d65326ee621e3568c72e9a1d");
            return;
        }
        b = z;
        d.a(context).d.a("is_mock", z);
    }
}
