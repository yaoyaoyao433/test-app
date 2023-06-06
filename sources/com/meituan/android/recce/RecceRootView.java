package com.meituan.android.recce;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.react.ReactRootView;
import com.facebook.react.uimanager.UIManagerModule;
import com.meituan.android.recce.exception.RecceException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceRootView extends ReactRootView implements h {
    public static ChangeQuickRedirect a;
    public c b;
    protected long c;

    public RecceRootView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64520a9d9c4bc67fe19dcf64f8f1c0ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64520a9d9c4bc67fe19dcf64f8f1c0ce");
            return;
        }
        this.c = com.meituan.android.recce.reporter.a.a();
        com.meituan.android.recce.reporter.a.a("recce_create");
    }

    public RecceRootView(Context context, Object obj) {
        super(context);
        Object[] objArr = {context, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8bdd0efd0405b3fea5aca5c7ffc70f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8bdd0efd0405b3fea5aca5c7ffc70f5");
            return;
        }
        this.c = com.meituan.android.recce.reporter.a.a();
        com.meituan.android.recce.reporter.a.a(obj, "recce_create", (HashMap<String, Object>) null);
    }

    public RecceRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de8126f90e4659fa380c4e73ff8bba44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de8126f90e4659fa380c4e73ff8bba44");
            return;
        }
        this.c = com.meituan.android.recce.reporter.a.a();
        com.meituan.android.recce.reporter.a.a("recce_create");
    }

    @Override // com.facebook.react.ReactRootView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "527d0812bf1f6bb04d2c9fd0816af71c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "527d0812bf1f6bb04d2c9fd0816af71c");
            return;
        }
        super.onMeasure(i, i2);
        if (getUIManagerModule() != null) {
            getUIManagerModule().updateRootLayoutSpecs(getId(), i, i2);
        }
    }

    private UIManagerModule getUIManagerModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e067c0d0492569e3bd85a115ee0654d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (UIManagerModule) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e067c0d0492569e3bd85a115ee0654d6");
        }
        if (this.b == null) {
            com.dianping.networklog.c.a("RecceRootView: getUIManagerModule recceInstanceManager is null", 3, new String[]{"Recce-Android"});
            return null;
        }
        return this.b.b;
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.aj
    public void handleException(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8f9f41ad05756a49b13c4639f669012", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8f9f41ad05756a49b13c4639f669012");
            return;
        }
        if (this.b != null) {
            this.b.a(RecceException.RENDER_ROOT_VIEW_ERROR, th);
        } else {
            com.dianping.networklog.c.a("RecceRootView: getUIManagerModule recceInstanceManager is null", 3, new String[]{"Recce-Android"});
        }
        super.handleException(th);
    }

    public c getRecceInstanceManager() {
        return this.b;
    }
}
