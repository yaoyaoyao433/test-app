package com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.normal;

import com.dianping.gcmrnmodule.wrapperviews.b;
import com.dianping.shield.dynamic.model.section.NormalSectionInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/normal/MRNModuleSectionItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/MRNModuleBaseSectionItemWrapperView;", "Lcom/dianping/shield/dynamic/model/section/NormalSectionInfo;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "createInfoInstance", "updateInfo", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a extends com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.a<NormalSectionInfo> {
    public static ChangeQuickRedirect g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddef00beebb77cdcc7157c2450900194", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddef00beebb77cdcc7157c2450900194");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* synthetic */ Object g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9951e37ee92108f1c30d8dba8f1eb0c", RobustBitConfig.DEFAULT_VALUE) ? (NormalSectionInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9951e37ee92108f1c30d8dba8f1eb0c") : new NormalSectionInfo();
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.a, com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69508404e3e4e9c9f8a3d25f4fa7270a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69508404e3e4e9c9f8a3d25f4fa7270a");
            return;
        }
        super.h();
        ((NormalSectionInfo) getInfo()).setChildren(null);
        Iterator<T> it = getChildWrapperViewList().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.section.a) {
                ((NormalSectionInfo) getInfo()).setChildren((ArrayList) ((com.dianping.gcmrnmodule.wrapperviews.containers.section.a) bVar).getInfo());
            }
        }
    }
}
