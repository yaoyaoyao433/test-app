package com.dianping.gcmrnmodule.wrapperviews.items.modules;

import android.annotation.SuppressLint;
import com.dianping.shield.dynamic.model.module.ScrollTabModuleInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0016J8\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b`\u000fJ\b\u0010\u0010\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNScrollTabModuleItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNBaseTabModuleItemWrapperView;", "Lcom/dianping/shield/dynamic/model/module/ScrollTabModuleInfo;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "createInfoInstance", "onLoadedPageChanged", "", "pages", "Ljava/util/HashSet;", "", "pageKeys", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "updateInfo", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class f extends a<ScrollTabModuleInfo> {
    public static ChangeQuickRedirect i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull ReactContext reactContext) {
        super(reactContext);
        kotlin.jvm.internal.h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61c16b2038763b8301cf082dee54bae7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61c16b2038763b8301cf082dee54bae7");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* synthetic */ Object g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce31aea88f0c37ecdb447cfe2e5addab", RobustBitConfig.DEFAULT_VALUE) ? (ScrollTabModuleInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce31aea88f0c37ecdb447cfe2e5addab") : new ScrollTabModuleInfo();
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.modules.a, com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99c816d90c8f2375cfcb7169f84ace79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99c816d90c8f2375cfcb7169f84ace79");
            return;
        }
        super.h();
        ((ScrollTabModuleInfo) getInfo()).setPageChangeScrollEvent(null);
        Iterator<T> it = getChildWrapperViewList().iterator();
        while (it.hasNext()) {
            com.dianping.gcmrnmodule.wrapperviews.b bVar = (com.dianping.gcmrnmodule.wrapperviews.b) it.next();
            if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.c) {
                ((ScrollTabModuleInfo) getInfo()).setPageChangeScrollEvent(((com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.c) bVar).getPageChangeScrollEvent());
            }
        }
    }
}
