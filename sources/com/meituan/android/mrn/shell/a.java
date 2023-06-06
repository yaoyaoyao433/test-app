package com.meituan.android.mrn.shell;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.module.MRNExceptionsManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements i {
    public static ChangeQuickRedirect a;
    private final k b;
    private com.facebook.react.devsupport.interfaces.b c;

    public a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9dfa034b725e91c4d4f54e74f988de3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9dfa034b725e91c4d4f54e74f988de3");
            return;
        }
        this.c = null;
        this.b = kVar;
    }

    @Override // com.facebook.react.i
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c75260f1523ef1029523c5bdc5e09ee6", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c75260f1523ef1029523c5bdc5e09ee6");
        }
        if (this.b != null && this.b.b != null) {
            this.c = this.b.b.getDevSupportManager();
        }
        return Arrays.asList(new MRNExceptionsManagerModule(reactApplicationContext, this.b, this.c));
    }

    @Override // com.facebook.react.i
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc521101ad1acda1d1c22961fd1dfc6c", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc521101ad1acda1d1c22961fd1dfc6c") : Collections.emptyList();
    }
}
