package com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall;

import com.dianping.gcmrnmodule.wrapperviews.b;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.l;
import com.dianping.shield.dynamic.model.section.WaterfallSectionInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/waterfall/MRNModuleWaterfallSectionItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/MRNModuleBaseSectionItemWrapperView;", "Lcom/dianping/shield/dynamic/model/section/WaterfallSectionInfo;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "createInfoInstance", "updateInfo", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a extends com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.a<WaterfallSectionInfo> {
    public static ChangeQuickRedirect g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d1cb65e6cec9a3ef472ac84e1561402", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d1cb65e6cec9a3ef472ac84e1561402");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* synthetic */ Object g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3383e2ee21ab880355f1758bd6e4399", RobustBitConfig.DEFAULT_VALUE) ? (WaterfallSectionInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3383e2ee21ab880355f1758bd6e4399") : new WaterfallSectionInfo();
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.a, com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "513c6ae08c643cf832edf5c906019d0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "513c6ae08c643cf832edf5c906019d0f");
            return;
        }
        super.h();
        ((WaterfallSectionInfo) getInfo()).setChildren(null);
        Iterator<T> it = getChildWrapperViewList().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar instanceof l) {
                WaterfallSectionInfo waterfallSectionInfo = (WaterfallSectionInfo) getInfo();
                RandomAccess info = ((l) bVar).getInfo();
                if (info == null) {
                    throw new o("null cannot be cast to non-null type kotlin.collections.ArrayList<com.dianping.shield.dynamic.model.view.ReusableViewInfo> /* = java.util.ArrayList<com.dianping.shield.dynamic.model.view.ReusableViewInfo> */");
                }
                waterfallSectionInfo.setChildren((ArrayList) info);
            }
        }
    }
}
