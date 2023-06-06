package com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer;

import android.annotation.SuppressLint;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¨\u0006\t"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/viewscontainer/MRNModuleViewsContainerWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/containers/base/MRNModuleBaseListContainerWrapperView;", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "assertIsChildAndGetInfo", "childWrapperView", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class l extends com.dianping.gcmrnmodule.wrapperviews.containers.base.b<ViewInfo> {
    public static ChangeQuickRedirect g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull ReactContext reactContext) {
        super(reactContext);
        kotlin.jvm.internal.h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "889249ee7310f1d586661b807dd0b5f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "889249ee7310f1d586661b807dd0b5f8");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.containers.base.b
    public final /* synthetic */ ViewInfo a(com.dianping.gcmrnmodule.wrapperviews.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "858cdde4b567d412f8d5d05359361680", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "858cdde4b567d412f8d5d05359361680");
        }
        kotlin.jvm.internal.h.b(bVar, "childWrapperView");
        if (bVar instanceof k) {
            return ((k) bVar).getChildInfo();
        }
        return null;
    }
}
