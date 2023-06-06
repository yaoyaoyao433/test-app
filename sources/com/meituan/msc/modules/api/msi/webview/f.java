package com.meituan.msc.modules.api.msi.webview;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public d b;
    public Activity c;

    public f(Activity activity, d dVar) {
        Object[] objArr = {activity, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b6d3419d6b6c4fb6f9af5185a7664a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b6d3419d6b6c4fb6f9af5185a7664a7");
            return;
        }
        this.b = dVar;
        this.c = activity;
    }

    @JavascriptInterface
    public final void onInputFocusDispatcher(final int i, final float f, final float f2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa772d91d25af9954c8e895376c9ef27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa772d91d25af9954c8e895376c9ef27");
        } else {
            this.c.runOnUiThread(new Runnable() { // from class: com.meituan.msc.modules.api.msi.webview.f.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c206e4e1b7a65ed310bbcd5d43bb3a2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c206e4e1b7a65ed310bbcd5d43bb3a2");
                    } else if (f.this.b != null) {
                        f.this.b.a(i, f, f2);
                    }
                }
            });
        }
    }
}
