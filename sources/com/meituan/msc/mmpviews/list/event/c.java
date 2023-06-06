package com.meituan.msc.mmpviews.list.event;

import android.view.View;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.mmpviews.list.event.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public float b;
    public float c;
    public long d;
    private final int e;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34ac3bfeb80c9b39eaf18fa0a44cb531", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34ac3bfeb80c9b39eaf18fa0a44cb531");
            return;
        }
        this.e = 10;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = -11L;
    }

    public void a(View view, d.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d25c1a27a9a02d436aa451ca50062e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d25c1a27a9a02d436aa451ca50062e7");
        } else {
            a(view, aVar, 0.0f, 0.0f);
        }
    }

    public void a(View view, d.a aVar, float f, float f2) {
        Object[] objArr = {view, aVar, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c535b6181175084e14fb344b8d27877b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c535b6181175084e14fb344b8d27877b");
        } else {
            a(view, aVar, f, f2, null);
        }
    }

    public void a(View view, d.a aVar, float f, float f2, com.meituan.msc.mmpviews.list.msclist.data.c cVar) {
        Object[] objArr = {view, aVar, Float.valueOf(f), Float.valueOf(f2), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db9a3ee4bd0d6eff7cb0c656c7771225", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db9a3ee4bd0d6eff7cb0c656c7771225");
        } else if (view == null) {
        } else {
            ReactContext reactContext = (ReactContext) view.getContext();
            if (reactContext == null) {
                com.meituan.msc.modules.reporter.g.a("[MListEventHelper@emitScrollEvent]", "reactContext: null while emitEvent:" + aVar.i);
                return;
            }
            reactContext.getUIManagerModule().a().a(d.a(view.getId(), aVar, view.getScrollX(), view.getScrollY(), f, f2, view.getWidth(), view.getHeight(), view.getWidth(), view.getHeight(), cVar));
        }
    }
}
