package com.meituan.android.mrn.engine;

import android.text.TextUtils;
import com.facebook.react.bridge.LoadJSCodeCacheCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class t implements LoadJSCodeCacheCallback {
    public static ChangeQuickRedirect a;
    private static final Map<String, Integer> c = new ConcurrentHashMap();
    protected e b;

    public t(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06797e8e4649eaa9d71c8aa937bb0bc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06797e8e4649eaa9d71c8aa937bb0bc8");
        } else {
            this.b = eVar;
        }
    }

    @Override // com.facebook.react.bridge.LoadJSCodeCacheCallback
    public final void onLoad(String str, String str2, LoadJSCodeCacheCallback.LoadStatus loadStatus) {
        int i;
        Object[] objArr = {str, str2, loadStatus};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7de12c84b8ade30ca6a548a7567b834a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7de12c84b8ade30ca6a548a7567b834a");
            return;
        }
        switch (loadStatus) {
            case nonexistent:
                i = 3;
                break;
            case invalid:
            case unmatched:
                com.meituan.android.mrn.utils.k.c(new File(str2));
                i = 2;
                break;
            case loaded:
                i = 1;
                break;
            default:
                i = 0;
                break;
        }
        if (this.b != null) {
            c.put(this.b.i(), Integer.valueOf(i));
        }
        com.meituan.android.mrn.utils.p.a("MRNLoadJSCodeCacheCallback@onLoad", String.format("CodeCache onLoad status: %s, codeCachePath: %s", loadStatus, str2));
    }

    public static String a(String str, String str2) {
        Integer num;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "198ceb7bb786ae53a03930e9af2613c2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "198ceb7bb786ae53a03930e9af2613c2") : (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (num = c.get(e.a(str, str2))) == null) ? "-1" : num.toString();
    }
}
