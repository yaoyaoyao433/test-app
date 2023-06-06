package com.meituan.mmp.lib.api.web;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public a b;
    public Activity c;

    public e(Activity activity, a aVar) {
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b2cf0819560d8ded15ad678a7094c29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b2cf0819560d8ded15ad678a7094c29");
            return;
        }
        this.b = aVar;
        this.c = activity;
    }

    @JavascriptInterface
    public final void onInputFocusDispatcher(final int i, final float f, final float f2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feb5cc5ccda6a2160941ce1ed0c7868d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feb5cc5ccda6a2160941ce1ed0c7868d");
        } else {
            this.c.runOnUiThread(new Runnable() { // from class: com.meituan.mmp.lib.api.web.e.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "022b779fd325c170aa8df07236724f9e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "022b779fd325c170aa8df07236724f9e");
                    } else if (e.this.b != null) {
                        e.this.b.a(i, f, f2);
                    }
                }
            });
        }
    }
}
