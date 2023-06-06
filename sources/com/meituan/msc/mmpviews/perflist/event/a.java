package com.meituan.msc.mmpviews.perflist.event;

import android.view.View;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.mmpviews.list.event.d;
import com.meituan.msc.mmpviews.list.msclist.data.c;
import com.meituan.msc.mmpviews.perflist.view.PerfListView;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public float b;
    public float c;
    public long d;
    private final int e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eb2beab75be05778e2b67c5b2677176", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eb2beab75be05778e2b67c5b2677176");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f750ffe93309bb4d9185c46c7bfadbc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f750ffe93309bb4d9185c46c7bfadbc1");
        } else {
            a(view, aVar, 0.0f, 0.0f);
        }
    }

    public void a(View view, d.a aVar, float f, float f2) {
        Object[] objArr = {view, aVar, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb95f86000df5acd16019b226d8d6d4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb95f86000df5acd16019b226d8d6d4a");
        } else {
            a(view, aVar, f, f2, null);
        }
    }

    public void a(View view, d.a aVar, float f, float f2, c cVar) {
        Object[] objArr = {view, aVar, Float.valueOf(f), Float.valueOf(f2), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73258c6dcef3ece00c57869ae518e288", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73258c6dcef3ece00c57869ae518e288");
        } else if (view instanceof PerfListView) {
            ReactContext reactContext = ((PerfListView) view).getReactContext();
            if (reactContext == null) {
                g.a("[MListEventHelper@emitScrollEvent]", "reactContext: null while emitEvent:" + aVar.i);
                return;
            }
            reactContext.getUIManagerModule().a().a(d.a(view.getId(), aVar, view.getScrollX(), view.getScrollY(), f, f2, view.getWidth(), view.getHeight(), view.getWidth(), view.getHeight(), cVar));
        }
    }
}
