package com.meituan.msc.modules.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.msc.modules.container.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends t {
    public static ChangeQuickRedirect c;
    private Uri d;

    public e(Context context, Uri uri) {
        super(context);
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63a0cfeff2623543d7d6e9323e393971", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63a0cfeff2623543d7d6e9323e393971");
        } else {
            this.d = uri;
        }
    }

    @Override // com.meituan.msc.modules.container.t
    public final boolean a(Context context, Intent intent, boolean z) {
        Object[] objArr = {context, intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4393062e64425784d23f4bab033447d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4393062e64425784d23f4bab033447d")).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null && data.isHierarchical() && f.a(data, this.d)) {
            if (z) {
                com.meituan.msc.modules.engine.requestPrefetch.a.a(null, intent);
            }
            return g.a(context, intent, z);
        }
        return false;
    }
}
