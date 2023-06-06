package com.meituan.msc.mmpviews.list.msclist.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.msc.mmpviews.list.common.Command;
import com.meituan.msc.mmpviews.list.event.d;
import com.meituan.msc.mmpviews.shell.MPLayoutShadowNode;
import com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.ab;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCListViewManager extends MPShellDelegateViewGroupManager<MSCListView> {
    public static ChangeQuickRedirect a;
    private IFileModule b;

    @Override // com.meituan.msc.uimanager.as
    public final /* bridge */ /* synthetic */ View a(@NonNull ThemedReactContext themedReactContext) {
        return null;
    }

    @Override // com.meituan.msc.uimanager.as
    @NonNull
    public final String a() {
        return "MSCListView";
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(int i, @NonNull ThemedReactContext themedReactContext, ab abVar) {
        Object[] objArr = {Integer.valueOf(i), themedReactContext, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9f44be8d9b8db3350abd6d673ef7be0", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCListView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9f44be8d9b8db3350abd6d673ef7be0");
        }
        PerfTrace.online().a("list_load_total");
        Boolean bool = null;
        String b = (abVar == null || !abVar.a("layoutType")) ? null : abVar.b("layoutType");
        Boolean valueOf = (abVar == null || !abVar.a("scrollX")) ? null : Boolean.valueOf(com.meituan.msc.mmpviews.util.b.a(abVar.c("scrollX")));
        if (abVar != null && abVar.a("scrollY")) {
            bool = Boolean.valueOf(com.meituan.msc.mmpviews.util.b.a(abVar.c("scrollY")));
        }
        int b2 = (abVar == null || !abVar.a("columnCount")) ? 0 : (int) com.meituan.msc.mmpviews.util.b.b(abVar.c("columnCount"));
        int a2 = (abVar == null || !abVar.a("columnGap")) ? 0 : (int) com.meituan.msc.mmpviews.util.b.a(abVar.c("columnGap"), themedReactContext);
        int a3 = (abVar == null || !abVar.a("rowGap")) ? 0 : (int) com.meituan.msc.mmpviews.util.b.a(abVar.c("rowGap"), themedReactContext);
        boolean z = bool != null ? bool.booleanValue() || valueOf == null || !valueOf.booleanValue() : valueOf == null;
        boolean z2 = !z ? !(valueOf == null || valueOf.booleanValue()) : !(bool == null || bool.booleanValue());
        g.d("[MSCListViewManager@createViewInstance]", "tag", Integer.valueOf(i), "vertical", Boolean.valueOf(z), "layoutType", b, "isScrollEnable", Boolean.valueOf(z2));
        Bundle bundle = new Bundle();
        bundle.putInt("columnCount", b2);
        bundle.putInt("columnGap", a2);
        bundle.putInt("rowGap", a3);
        return new MSCListView(themedReactContext, z, b, z2, bundle);
    }

    @Override // com.meituan.msc.uimanager.as
    @NonNull
    public final /* synthetic */ aa a(int i, @NonNull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {Integer.valueOf(i), reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a98c494cd7b33ab9422f744aaacf3ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPLayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a98c494cd7b33ab9422f744aaacf3ae");
        }
        g.d("[MSCListViewManager@createShadowNodeInstance]", "context: ", reactApplicationContext, "tag: ", Integer.valueOf(i));
        return (MPLayoutShadowNode) super.a(i, reactApplicationContext);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
        if (r20.equals("update") != false) goto L19;
     */
    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager, com.meituan.msc.uimanager.as
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(android.view.View r19, java.lang.String r20, com.meituan.msc.jse.bridge.ReadableArray r21) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.list.msclist.view.MSCListViewManager.a(android.view.View, java.lang.String, com.meituan.msc.jse.bridge.ReadableArray):void");
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ void b(@NonNull View view) {
        MSCListView mSCListView = (MSCListView) view;
        Object[] objArr = {mSCListView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "717ed4e9aae2bc0a0c28d3b6a425bcbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "717ed4e9aae2bc0a0c28d3b6a425bcbf");
            return;
        }
        super.b((MSCListViewManager) mSCListView);
        g.d("[MSCListViewManager@onDropViewInstance]", "id: ", Integer.valueOf(mSCListView.getId()), "view: ", mSCListView);
        if (mSCListView.getParent() != null && (mSCListView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) mSCListView.getParent()).removeView(mSCListView);
        }
        mSCListView.d();
    }

    public MSCListViewManager(IFileModule iFileModule) {
        Object[] objArr = {iFileModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01ca40c0a6bdb13a2099973ee91dcff5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01ca40c0a6bdb13a2099973ee91dcff5");
        } else {
            this.b = iFileModule;
        }
    }

    @ReactProp(name = "classPrefix")
    public void setClassPrefix(MSCListView mSCListView, String str) {
        Object[] objArr = {mSCListView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b5306f1c72f1989baf51876fb893bc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b5306f1c72f1989baf51876fb893bc3");
        } else {
            mSCListView.setClassPrefix(str);
        }
    }

    @ReactProp(name = "templatePath")
    public void setTemplatePath(MSCListView mSCListView, String str) {
        Object[] objArr = {mSCListView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39012475c833c8248ad020b79d32a77c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39012475c833c8248ad020b79d32a77c");
        } else {
            mSCListView.setTemplatePath(this.b.a(str));
        }
    }

    @ReactProp(name = "batchData")
    public void setBatchData(MSCListView mSCListView, ReadableArray readableArray) {
        Object[] objArr = {mSCListView, readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d7e5e168fb85fbfd2b5d2f8daf066b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d7e5e168fb85fbfd2b5d2f8daf066b");
        } else {
            mSCListView.setData(readableArray);
        }
    }

    @ReactProp(name = "lowerThreshold")
    public void setLowerThreshold(MSCListView mSCListView, Dynamic dynamic) {
        Object[] objArr = {mSCListView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bd9d46744cbd852a13ea931fc01048b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bd9d46744cbd852a13ea931fc01048b");
        } else {
            mSCListView.setLowerThreshold((int) com.meituan.msc.mmpviews.util.b.b(dynamic));
        }
    }

    @ReactProp(name = "upperThreshold")
    public void setUpperThreshold(MSCListView mSCListView, Dynamic dynamic) {
        Object[] objArr = {mSCListView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f319ed47d10688a8b16b62f435e3e15d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f319ed47d10688a8b16b62f435e3e15d");
        } else {
            mSCListView.setUpperThreshold((int) com.meituan.msc.mmpviews.util.b.b(dynamic));
        }
    }

    @ReactProp(name = "scrollX")
    public void setScrollX(MSCListView mSCListView, Dynamic dynamic) {
        Object[] objArr = {mSCListView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c3079ff7e4fd48127eab5ec2ad1b9bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c3079ff7e4fd48127eab5ec2ad1b9bd");
            return;
        }
        boolean a2 = com.meituan.msc.mmpviews.util.b.a(dynamic);
        if (mSCListView.getOrientation() == 0) {
            mSCListView.setScrollEnabled(a2);
        }
    }

    @ReactProp(name = "scrollY")
    public void setScrollY(MSCListView mSCListView, Dynamic dynamic) {
        Object[] objArr = {mSCListView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8b3478e3b3840d29149833ec93a6991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8b3478e3b3840d29149833ec93a6991");
            return;
        }
        boolean a2 = com.meituan.msc.mmpviews.util.b.a(dynamic);
        if (mSCListView.getOrientation() == 1) {
            mSCListView.setScrollEnabled(a2);
        }
    }

    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager, com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager, com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    @Nullable
    public final Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "819a782be2fbae3de6f21c083187799b", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "819a782be2fbae3de6f21c083187799b") : com.meituan.msc.jse.common.a.c().a(d.a.ON_SCROLL.i, com.meituan.msc.jse.common.a.a("registrationName", "onScroll")).a(d.a.BEGIN_DRAG.i, com.meituan.msc.jse.common.a.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a(d.a.END_DRAG.i, com.meituan.msc.jse.common.a.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a(d.a.MOMENTUM_BEGIN.i, com.meituan.msc.jse.common.a.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a(d.a.MOMENTUM_END.i, com.meituan.msc.jse.common.a.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a("onEndReached", com.meituan.msc.jse.common.a.a("registrationName", "onEndReached")).a("onViewableItemsChanged", com.meituan.msc.jse.common.a.a("registrationName", "onViewableItemsChanged")).a();
    }

    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager, com.meituan.msc.uimanager.as
    @Nullable
    public final Map<String, Integer> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e154cda8b43dff01578c04c547c49144", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e154cda8b43dff01578c04c547c49144");
        }
        String name = Command.append.name();
        Integer valueOf = Integer.valueOf(Command.append.ordinal());
        String name2 = Command.splice.name();
        Integer valueOf2 = Integer.valueOf(Command.splice.ordinal());
        String name3 = Command.remove.name();
        Integer valueOf3 = Integer.valueOf(Command.remove.ordinal());
        String name4 = Command.update.name();
        Integer valueOf4 = Integer.valueOf(Command.update.ordinal());
        String name5 = Command.updates.name();
        Integer valueOf5 = Integer.valueOf(Command.updates.ordinal());
        String name6 = Command.scrollIntoIndex.name();
        Integer valueOf6 = Integer.valueOf(Command.scrollIntoIndex.ordinal());
        Object[] objArr2 = {name, valueOf, name2, valueOf2, name3, valueOf3, name4, valueOf4, name5, valueOf5, name6, valueOf6};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.jse.common.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "73abbc665c8c01984c0e53c3455d9cef", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "73abbc665c8c01984c0e53c3455d9cef");
        }
        Map<String, Integer> b = com.meituan.msc.jse.common.a.b();
        b.put(name, valueOf);
        b.put(name2, valueOf2);
        b.put(name3, valueOf3);
        b.put(name4, valueOf4);
        b.put(name5, valueOf5);
        b.put(name6, valueOf6);
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager
    public void a(@NonNull MSCListView mSCListView) {
        Object[] objArr = {mSCListView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1df3b638f9975d868467f0506a96ed77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1df3b638f9975d868467f0506a96ed77");
            return;
        }
        super.a((MSCListViewManager) mSCListView);
        mSCListView.a();
    }
}
