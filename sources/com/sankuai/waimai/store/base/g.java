package com.sankuai.waimai.store.base;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends FrameLayout {
    public static ChangeQuickRedirect a;

    public g(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f6228429e182bd50c4a29abb04ec74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f6228429e182bd50c4a29abb04ec74");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "644a6870382b5fa37f9e111342499ae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "644a6870382b5fa37f9e111342499ae5");
            return;
        }
        super.dispatchDraw(canvas);
        if (getContext() instanceof Activity) {
            com.sankuai.waimai.store.base.monitor.time.a a2 = com.sankuai.waimai.store.base.monitor.time.a.a();
            Activity activity = (Activity) getContext();
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.base.monitor.time.a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "05d865c6bd68c61fb108271ad7cc2924", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "05d865c6bd68c61fb108271ad7cc2924");
                return;
            }
            Map<String, Long> b = a2.b(a2.c(activity));
            if (b == null) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (b.containsKey("onActivityFirstRenderFinish")) {
                return;
            }
            b.put("onActivityFirstRenderFinish", Long.valueOf(elapsedRealtime));
        }
    }
}
