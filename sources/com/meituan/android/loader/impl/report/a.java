package com.meituan.android.loader.impl.report;

import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.loader.f;
import com.meituan.crashreporter.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements f {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.loader.f
    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dfb8f1305a076ad5143e4fcffe29b4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dfb8f1305a076ad5143e4fcffe29b4e");
            return;
        }
        try {
            c.a(th, null, false);
        } catch (Throwable unused) {
        }
    }

    @Override // com.meituan.android.loader.f
    public final void a(Throwable th, Map<String, Object> map) {
        Object[] objArr = {th, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4fb1de5b85e0d08d0a6a81134d8605f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4fb1de5b85e0d08d0a6a81134d8605f");
            return;
        }
        try {
            c.a(th, null, false);
        } catch (Throwable unused) {
        }
    }

    @Override // com.meituan.android.loader.f
    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a369326969cb7a9bf8b96298e9b23784", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a369326969cb7a9bf8b96298e9b23784");
            return;
        }
        Log.Builder builder = new Log.Builder("");
        builder.reportChannel("dynloader_ratio").tag(str).optional(map).generalChannelStatus(true);
        try {
            Babel.log(builder.build());
        } catch (Throwable th) {
            a(th);
        }
    }

    @Override // com.meituan.android.loader.f
    public final void a(String str, long j, Map<String, Object> map) {
        Object[] objArr = {str, new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b612403e7bbefd7c86228fb3f8b1f2cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b612403e7bbefd7c86228fb3f8b1f2cb");
            return;
        }
        Log.Builder builder = new Log.Builder("");
        builder.reportChannel("dynloader_ratio").tag(str).value(j).optional(map).generalChannelStatus(true);
        try {
            Babel.log(builder.build());
        } catch (Throwable th) {
            a(th);
        }
    }

    @Override // com.meituan.android.loader.f
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "612f5698688d07bb7fd69da4a055ba3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "612f5698688d07bb7fd69da4a055ba3b");
            return;
        }
        try {
            com.meituan.android.loader.impl.f.d(str);
        } catch (Throwable unused) {
        }
    }
}
