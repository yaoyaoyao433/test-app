package com.dianping.gcmrnmodule.wrapperviews.items.viewitems.extrareuse;

import com.dianping.shield.dynamic.model.view.ExtraReusableViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/extrareuse/MRNModuleExtraReusableViewItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/extra/MRNModuleExtraViewItemWrapperView;", "Lcom/dianping/shield/dynamic/model/view/ExtraReusableViewInfo;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "createViewInfo", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a extends com.dianping.gcmrnmodule.wrapperviews.items.viewitems.extra.a<ExtraReusableViewInfo> {
    public static ChangeQuickRedirect i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ao aoVar) {
        super(aoVar);
        h.b(aoVar, "context");
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cecdc40504abf4d92e700dfa1cf8ea51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cecdc40504abf4d92e700dfa1cf8ea51");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.extra.a, com.dianping.gcmrnmodule.wrapperviews.items.viewitems.a, com.dianping.gcmrnmodule.wrapperviews.items.viewitems.c
    @NotNull
    public final ViewInfo a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97fa5dbb2f040cc93938ca99b54e425a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97fa5dbb2f040cc93938ca99b54e425a");
        }
        ExtraReusableViewInfo extraReusableViewInfo = new ExtraReusableViewInfo();
        extraReusableViewInfo.setViewType(Integer.valueOf(DMConstant.DynamicModuleViewType.MRNView.ordinal()));
        return extraReusableViewInfo;
    }
}
