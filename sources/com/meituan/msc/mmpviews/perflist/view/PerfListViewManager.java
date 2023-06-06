package com.meituan.msc.mmpviews.perflist.view;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.common.statistics.Constants;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.common.a;
import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.msc.mmpviews.list.event.d;
import com.meituan.msc.mmpviews.perflist.PerfListInfoWrapper;
import com.meituan.msc.mmpviews.shell.MPLayoutShadowNode;
import com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager;
import com.meituan.msc.mmpviews.util.b;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.ab;
import com.meituan.msc.uimanager.ai;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PerfListViewManager extends MPShellDelegateViewGroupManager<PerfListView> {
    public static ChangeQuickRedirect a;
    private IFileModule b;

    @Override // com.meituan.msc.uimanager.as
    public final /* bridge */ /* synthetic */ View a(@NonNull ThemedReactContext themedReactContext) {
        return null;
    }

    @Override // com.meituan.msc.uimanager.as
    @NonNull
    public final String a() {
        return "MSCRList";
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(final int i, @NonNull final ThemedReactContext themedReactContext, ab abVar) {
        Boolean bool;
        Object[] objArr = {Integer.valueOf(i), themedReactContext, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b92e1e49bba98537e576a3f1d86aa21", RobustBitConfig.DEFAULT_VALUE)) {
            return (PerfListView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b92e1e49bba98537e576a3f1d86aa21");
        }
        themedReactContext.getRuntimeDelegate().getPerfEventRecorder().a("r_list_create");
        PerfTrace.begin("list_load_total");
        abVar.getClass();
        final String b = abVar.b("renderItem");
        PerfListInfoWrapper.a aVar = new PerfListInfoWrapper.a(b);
        aVar.d = abVar.a("layoutType") ? abVar.b("layoutType") : Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST;
        aVar.c = abVar.a("scrollType") ? abVar.b("scrollType") : "scroll-y";
        aVar.e = abVar.a("columnCount") ? abVar.a("columnCount", 1) : 1;
        aVar.f = abVar.a("columnGap") ? abVar.b("columnGap") : "";
        aVar.g = abVar.a("rowGap") ? abVar.b("rowGap") : "";
        Boolean bool2 = null;
        if (abVar.a("scrollX")) {
            Dynamic c = abVar.c("scrollX");
            c.getClass();
            bool = Boolean.valueOf(b.a(c));
        } else {
            bool = null;
        }
        aVar.h = bool;
        if (abVar.a("scrollY")) {
            Dynamic c2 = abVar.c("scrollY");
            c2.getClass();
            bool2 = Boolean.valueOf(b.a(c2));
        }
        aVar.i = bool2;
        PerfListView a2 = themedReactContext.getRuntimeDelegate().getPerfListInfoWrapper().a(themedReactContext, aVar, abVar);
        g.d("PerfListView", "ViewManager createView PerfListView, tag:", Integer.valueOf(i), aVar.d, a2);
        themedReactContext.getRuntimeDelegate().getPerfEventRecorder().b("r_list_create", new ConcurrentHashMap<String, Object>() { // from class: com.meituan.msc.mmpviews.perflist.view.PerfListViewManager.1
            {
                put("page", Integer.valueOf(themedReactContext.getRuntimeDelegate().getPageId()));
                put("renderItem", b);
            }
        });
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.mmpviews.perflist.view.PerfListViewManager.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54f146bc275b358b6a91095c5728923a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54f146bc275b358b6a91095c5728923a");
                } else {
                    themedReactContext.getRuntimeDelegate().notifyRListCreated(i);
                }
            }
        });
        return a2;
    }

    @Override // com.meituan.msc.uimanager.as
    @NonNull
    public final /* synthetic */ View a(int i, @NonNull ThemedReactContext themedReactContext, @Nullable ab abVar, @Nullable ai aiVar) {
        Object[] objArr = {Integer.valueOf(i), themedReactContext, abVar, aiVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed997069bead215284e5b4c786fa6355", RobustBitConfig.DEFAULT_VALUE) ? (PerfListView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed997069bead215284e5b4c786fa6355") : (PerfListView) super.a(i, themedReactContext, abVar, aiVar);
    }

    @Override // com.meituan.msc.uimanager.as
    @NonNull
    public final /* synthetic */ aa a(int i, @NonNull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {Integer.valueOf(i), reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41c655293e29c89a932715b653dd6acc", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPLayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41c655293e29c89a932715b653dd6acc");
        }
        g.d("[PerfListViewManager@createShadowNodeInstance]", "tag:", Integer.valueOf(i));
        return (MPLayoutShadowNode) super.a(i, reactApplicationContext);
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ void b(@NonNull View view) {
        PerfListView perfListView = (PerfListView) view;
        Object[] objArr = {perfListView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d599d32dde7bd9bb866d2f9ddc61f35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d599d32dde7bd9bb866d2f9ddc61f35");
            return;
        }
        super.b((PerfListViewManager) perfListView);
        if (perfListView.getParent() != null && (perfListView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) perfListView.getParent()).removeView(perfListView);
        }
        perfListView.d();
    }

    public PerfListViewManager(IFileModule iFileModule) {
        Object[] objArr = {iFileModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d212d0e54fe4fe21f227bfef79660a0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d212d0e54fe4fe21f227bfef79660a0d");
        } else {
            this.b = iFileModule;
        }
    }

    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager, com.meituan.msc.uimanager.as
    /* renamed from: g */
    public final MPLayoutShadowNode d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b62a87c951f53cc75e4aa45c10c63c69", RobustBitConfig.DEFAULT_VALUE) ? (MPLayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b62a87c951f53cc75e4aa45c10c63c69") : super.d();
    }

    @ReactProp(name = "classPrefix")
    public void setClassPrefix(PerfListView perfListView, String str) {
        Object[] objArr = {perfListView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2d334ec20e9b1755b3dc6a5002a98a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2d334ec20e9b1755b3dc6a5002a98a2");
        } else {
            perfListView.setClassPrefix(str);
        }
    }

    @ReactProp(name = "lowerThreshold")
    public void setLowerThreshold(PerfListView perfListView, Dynamic dynamic) {
        Object[] objArr = {perfListView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2517ec9c25da890012dbb6828d63026", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2517ec9c25da890012dbb6828d63026");
        } else {
            perfListView.setLowerThreshold((int) b.b(dynamic));
        }
    }

    @ReactProp(name = "upperThreshold")
    public void setUpperThreshold(PerfListView perfListView, Dynamic dynamic) {
        Object[] objArr = {perfListView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f9d82888ca0359fe9e87e2d5bddadba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f9d82888ca0359fe9e87e2d5bddadba");
        } else {
            perfListView.setUpperThreshold((int) b.b(dynamic));
        }
    }

    @ReactProp(name = "columnCount")
    public void setColumnCount(PerfListView perfListView, Dynamic dynamic) {
        Object[] objArr = {perfListView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a7fb34b9aea704ff7590f45bee390d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a7fb34b9aea704ff7590f45bee390d0");
        } else {
            perfListView.setColumnCount((int) b.b(dynamic));
        }
    }

    @ReactProp(name = "columnGap")
    public void setColumnGap(PerfListView perfListView, Dynamic dynamic) {
        Object[] objArr = {perfListView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d92a7a7047b19d8b509b6dd2c28f37cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d92a7a7047b19d8b509b6dd2c28f37cb");
        } else {
            perfListView.setColumnGap((int) b.a(dynamic, perfListView.getContext()));
        }
    }

    @ReactProp(name = "rowGap")
    public void setRowGap(PerfListView perfListView, Dynamic dynamic) {
        Object[] objArr = {perfListView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d3ba28928dda7b0155501546a09d8fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d3ba28928dda7b0155501546a09d8fb");
        } else {
            perfListView.setRowGap((int) b.a(dynamic, perfListView.getContext()));
        }
    }

    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager, com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager, com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    @javax.annotation.Nullable
    public final Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50e873a574953e0cc16f250748298796", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50e873a574953e0cc16f250748298796") : a.c().a(d.a.ON_SCROLL.i, a.a("registrationName", "onScroll")).a(d.a.BEGIN_DRAG.i, a.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a(d.a.END_DRAG.i, a.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a(d.a.MOMENTUM_BEGIN.i, a.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a(d.a.MOMENTUM_END.i, a.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a("onEndReached", a.a("registrationName", "onEndReached")).a("onViewableItemsChanged", a.a("registrationName", "onViewableItemsChanged")).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager
    public void a(@NonNull PerfListView perfListView) {
        Object[] objArr = {perfListView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6f49bc25891eae27c06c58b9d0e7541", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6f49bc25891eae27c06c58b9d0e7541");
            return;
        }
        super.a((PerfListViewManager) perfListView);
        perfListView.a();
    }
}
