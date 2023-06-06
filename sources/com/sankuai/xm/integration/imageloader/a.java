package com.sankuai.xm.integration.imageloader;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.IntRange;
import android.support.v4.internal.view.SupportMenu;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private c b;

    public a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b32e98db328c4071ee1cc70e735cc9b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b32e98db328c4071ee1cc70e735cc9b4");
        } else {
            this.b = cVar;
        }
    }

    public final a a(boolean z) {
        this.b.h = z;
        return this;
    }

    public final a a(@IntRange(from = -1, to = 65535) int i) {
        this.b.i = SupportMenu.USER_MASK;
        return this;
    }

    public final void a(View view) {
        Context context;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d253512a01bcf5b399810ba2ba7d2688", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d253512a01bcf5b399810ba2ba7d2688");
        } else if (view == null || (context = view.getContext()) == null) {
        } else {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
                    return;
                }
            }
            try {
                b.a().b(context, view, this.b);
            } catch (Throwable th) {
                com.sankuai.xm.log.c.a("GifRequest::into", th);
                com.sankuai.xm.monitor.statistics.a.a("integration", "GifRequest::into", th);
            }
        }
    }
}
