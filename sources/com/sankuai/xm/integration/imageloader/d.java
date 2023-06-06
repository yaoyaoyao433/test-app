package com.sankuai.xm.integration.imageloader;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ActivityUtils;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private c b;

    public d(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b2d9c096ad0682b2a53729a4998d0e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b2d9c096ad0682b2a53729a4998d0e9");
        } else {
            this.b = cVar;
        }
    }

    public final void a(View view) {
        Context context;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "975107f5cf30362925799fe3ce4d28c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "975107f5cf30362925799fe3ce4d28c9");
        } else if (view == null || (context = view.getContext()) == null) {
        } else {
            if (!(context instanceof Activity) || ActivityUtils.a((Activity) context)) {
                try {
                    b.a().a(context, view, this.b);
                } catch (Throwable th) {
                    com.sankuai.xm.log.c.a("ImageRequest::into", th);
                    com.sankuai.xm.monitor.statistics.a.a("integration", "ImageRequest::into", th);
                }
            }
        }
    }
}
