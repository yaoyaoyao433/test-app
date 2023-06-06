package com.meituan.mmp.lib.engine;

import android.content.Context;
import com.meituan.mmp.lib.mp.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h extends f {
    public static ChangeQuickRedirect a;
    final Map<Integer, b.a> b;

    public h(Context context, com.meituan.mmp.lib.config.a aVar, com.meituan.mmp.lib.trace.h hVar) {
        super(context, aVar, hVar);
        Object[] objArr = {context, aVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71c376aa9cd6cb355d671c063699986b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71c376aa9cd6cb355d671c063699986b");
        } else {
            this.b = new ConcurrentHashMap();
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9dd1b4b0a39775728f7a9a87ccfbd63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9dd1b4b0a39775728f7a9a87ccfbd63");
            return;
        }
        this.b.remove(Integer.valueOf(i));
        com.meituan.mmp.lib.trace.b.b("DownloadOnlyAppLoader", "app engine released, engine retain count: " + this.b.size());
        if (this.b.isEmpty()) {
            b();
        }
    }

    @Override // com.meituan.mmp.lib.engine.f
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7703f01ac91da02a9965d2bccc5e71ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7703f01ac91da02a9965d2bccc5e71ba");
        } else {
            c();
        }
    }

    @Override // com.meituan.mmp.lib.engine.f
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c484b65be04ca25f4cc74353977bbdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c484b65be04ca25f4cc74353977bbdb");
            return;
        }
        super.c();
        j.a(this);
    }
}
