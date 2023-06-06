package com.dianping.gcmrnmodule.contentview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.dianping.agentsdk.framework.ar;
import com.dianping.agentsdk.framework.v;
import com.dianping.gcmrnmodule.hostwrapper.d;
import com.dianping.gcmrnmodule.protocols.i;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.util.j;
import com.facebook.react.ReactRootView;
import com.facebook.react.log.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.b;
import kotlin.jvm.internal.h;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\t2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020\tH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00132\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/dianping/gcmrnmodule/contentview/MRNModuleBaseRootView;", "Lcom/facebook/react/ReactRootView;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleContainerProtocol;", "mContext", "Landroid/content/Context;", "themePackage", "Lcom/dianping/shield/component/utils/PageContainerThemePackage;", "beforeRunApplicationHook", "Lkotlin/Function1;", "", "(Landroid/content/Context;Lcom/dianping/shield/component/utils/PageContainerThemePackage;Lkotlin/jvm/functions/Function1;)V", "value", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleStandardHostWrapper;", "dynamicHostInterface", "getDynamicHostInterface", "()Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleStandardHostWrapper;", "setDynamicHostInterface", "(Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleStandardHostWrapper;)V", "<set-?>", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseHostWrapperView;", "hostWrapperView", "getHostWrapperView", "()Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseHostWrapperView;", "jsEntry", "Lkotlin/Function0;", "getJsEntry", "()Lkotlin/jvm/functions/Function0;", "setJsEntry", "(Lkotlin/jvm/functions/Function0;)V", "getAppProperties", "Landroid/os/Bundle;", "getFsTimeLogger", "Lcom/facebook/react/log/IReactFsTimeLogger;", "getHostInterface", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "onViewAdded", "child", "Landroid/view/View;", "onViewRemoved", "runApplication", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class a extends ReactRootView implements i {
    public static ChangeQuickRedirect a;
    @Nullable
    private kotlin.jvm.functions.a<r> b;
    @Nullable
    private d c;
    @Nullable
    private com.dianping.gcmrnmodule.wrapperviews.a<?> d;
    private final PageContainerThemePackage e;
    private final b<a, r> f;

    @Override // com.facebook.react.ReactRootView
    @Nullable
    public final c getFsTimeLogger() {
        return null;
    }

    @Nullable
    public final ar getWhiteboard() {
        v bridge;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4eea4bf06a915fd857ed4f3b9414b0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4eea4bf06a915fd857ed4f3b9414b0b");
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = i.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "45c1bab15ec5db4936583b90ae8e20b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "45c1bab15ec5db4936583b90ae8e20b8");
        }
        com.dianping.gcmrnmodule.hostwrapper.a hostInterface = getHostInterface();
        if (hostInterface == null || (bridge = hostInterface.getBridge()) == null) {
            return null;
        }
        return bridge.getWhiteBoard();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull PageContainerThemePackage pageContainerThemePackage, @NotNull b<? super a, r> bVar) {
        super(context);
        h.b(context, "mContext");
        h.b(pageContainerThemePackage, "themePackage");
        h.b(bVar, "beforeRunApplicationHook");
        Object[] objArr = {context, pageContainerThemePackage, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df4987ca0c09be495d1e7ecf9ebf5e49", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df4987ca0c09be495d1e7ecf9ebf5e49");
            return;
        }
        this.e = pageContainerThemePackage;
        this.f = bVar;
    }

    @Nullable
    public final kotlin.jvm.functions.a<r> getJsEntry() {
        return this.b;
    }

    public final void setJsEntry(@Nullable kotlin.jvm.functions.a<r> aVar) {
        this.b = aVar;
    }

    @Nullable
    public final d getDynamicHostInterface() {
        return this.c;
    }

    public final void setDynamicHostInterface(@Nullable d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ee4ff9598748d120981e04094778a64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ee4ff9598748d120981e04094778a64");
            return;
        }
        com.dianping.gcmrnmodule.wrapperviews.a<?> aVar = this.d;
        if (aVar != null) {
            aVar.setHostInterface(dVar);
        }
        this.c = dVar;
    }

    @Nullable
    public final com.dianping.gcmrnmodule.wrapperviews.a<?> getHostWrapperView() {
        return this.d;
    }

    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup
    public final void onViewAdded(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f409647396fc519c023f025e69f403f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f409647396fc519c023f025e69f403f6");
            return;
        }
        super.onViewAdded(view);
        if (view instanceof com.dianping.gcmrnmodule.wrapperviews.a) {
            this.d = (com.dianping.gcmrnmodule.wrapperviews.a) view;
            com.dianping.gcmrnmodule.wrapperviews.a<?> aVar = this.d;
            if (aVar != null) {
                aVar.setHostInterface(this.c);
            }
        }
        com.dianping.gcmrnmodule.b.a().a(this.d);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(@NotNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d372e563b363230b350a67fd93fc547c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d372e563b363230b350a67fd93fc547c");
            return;
        }
        h.b(view, "child");
        super.onViewRemoved(view);
        com.dianping.gcmrnmodule.wrapperviews.a<?> aVar = this.d;
        if (aVar != null) {
            aVar.setHostInterface(null);
        }
        this.d = null;
    }

    @Override // com.dianping.gcmrnmodule.protocols.i
    @Nullable
    public final com.dianping.gcmrnmodule.hostwrapper.a getHostInterface() {
        return this.c;
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.ad
    public final void runApplication() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed90e2dbf0c0ca48876a82a05c12afd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed90e2dbf0c0ca48876a82a05c12afd3");
            return;
        }
        this.f.invoke(this);
        super.runApplication();
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.ad
    @Nullable
    public final Bundle getAppProperties() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8efd7216c15a851bb228b71bf2ac2804", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8efd7216c15a851bb228b71bf2ac2804");
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("width", j.b(getContext(), j.a(getContext())));
        bundle2.putInt("height", j.b(getContext(), j.b(getContext())));
        bundle2.putInt("leftMargin", this.e.getLeftMargin());
        bundle2.putInt("rightMargin", this.e.getRightMargin());
        bundle.putBundle("moduleSetting", bundle2);
        return bundle;
    }
}
