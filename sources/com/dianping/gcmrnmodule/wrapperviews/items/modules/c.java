package com.dianping.gcmrnmodule.wrapperviews.items.modules;

import android.annotation.SuppressLint;
import com.dianping.gcmrnmodule.wrapperviews.events.z;
import com.dianping.shield.dynamic.model.module.ModuleInfo;
import com.dianping.shield.dynamic.model.view.HoverViewInfo;
import com.dianping.shield.dynamic.model.view.PopViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0014J\b\u0010\u0019\u001a\u00020\u0007H\u0014J\u001c\u0010\u001a\u001a\u00020\u00172\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cJ\b\u0010\u001f\u001a\u00020\u0017H\u0016J\b\u0010\f\u001a\u00020\rH\u0014J\u000e\u0010 \u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010%\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rJ\b\u0010'\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006("}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModuleItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseHostWrapperView;", "Lcom/dianping/shield/dynamic/model/module/ModuleInfo;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "onScroll", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, DMKeys.KEY_ON_SCROLL_END_DRAG, DMKeys.KEY_THROTTLE, "", "skeletonReusePool", "Lcom/dianping/gcmrnmodule/skeleton/MRNModuleSkeletonViewReusePool;", "getSkeletonReusePool", "()Lcom/dianping/gcmrnmodule/skeleton/MRNModuleSkeletonViewReusePool;", "skeletonReusePool$delegate", "Lkotlin/Lazy;", "createInfoInstance", "needDragEvent", "needLoadMore", "", "needMomentumEvent", "needOnScroll", "registerSkeletonInfo", "skeletonInfo", "", "", "", "retryForLoadingFail", "setNeedBeginDrag", "setNeedEndDrag", "setNeedMomentumScrollBegin", "momentumScrollBegin", "setNeedMomentumScrollEnd", "setNeedScroll", "setScrollEventThrottle", "updateInfo", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class c extends com.dianping.gcmrnmodule.wrapperviews.a<ModuleInfo> {
    public static ChangeQuickRedirect g;
    public static final /* synthetic */ kotlin.reflect.i[] h = {u.a(new s(u.a(c.class), "skeletonReusePool", "getSkeletonReusePool()Lcom/dianping/gcmrnmodule/skeleton/MRNModuleSkeletonViewReusePool;"))};
    @NotNull
    private final kotlin.d i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;

    @NotNull
    public final com.dianping.gcmrnmodule.skeleton.a getSkeletonReusePool() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return (com.dianping.gcmrnmodule.skeleton.a) (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d16d935e8f2e8d35f2a5d84cc43bb7a", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d16d935e8f2e8d35f2a5d84cc43bb7a") : this.i.a());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/dianping/gcmrnmodule/skeleton/MRNModuleSkeletonViewReusePool;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<com.dianping.gcmrnmodule.skeleton.a> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ ReactContext b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ReactContext reactContext) {
            super(0);
            this.b = reactContext;
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ com.dianping.gcmrnmodule.skeleton.a invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcda149dc16695c86607d32bcef6baa5", RobustBitConfig.DEFAULT_VALUE) ? (com.dianping.gcmrnmodule.skeleton.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcda149dc16695c86607d32bcef6baa5") : new com.dianping.gcmrnmodule.skeleton.a(this.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull ReactContext reactContext) {
        super(reactContext);
        kotlin.jvm.internal.h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9410cfa1d80b5baa66e6dfc60df945e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9410cfa1d80b5baa66e6dfc60df945e1");
            return;
        }
        this.i = kotlin.e.a(kotlin.i.NONE, new a(reactContext));
        setVisibility(4);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* synthetic */ Object g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaafa64c9bfc57b1653af1827c8ce063", RobustBitConfig.DEFAULT_VALUE) ? (ModuleInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaafa64c9bfc57b1653af1827c8ce063") : new ModuleInfo();
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4e47cb204562a8540d78760aca652d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4e47cb204562a8540d78760aca652d9");
            return;
        }
        super.h();
        ((ModuleInfo) getInfo()).setChildren(null);
        ((ModuleInfo) getInfo()).setHoverView(null);
        ((ModuleInfo) getInfo()).setPopView(null);
        ((ModuleInfo) getInfo()).setLoadingView(null);
        ((ModuleInfo) getInfo()).setLoadingFailView(null);
        ((ModuleInfo) getInfo()).setLoadingMoreView(null);
        ((ModuleInfo) getInfo()).setLoadingMoreFailView(null);
        ((ModuleInfo) getInfo()).setEmptyView(null);
        Iterator<T> it = getChildWrapperViewList().iterator();
        while (it.hasNext()) {
            com.dianping.gcmrnmodule.wrapperviews.b bVar = (com.dianping.gcmrnmodule.wrapperviews.b) it.next();
            if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.module.c) {
                ((ModuleInfo) getInfo()).setChildren((ArrayList) ((com.dianping.gcmrnmodule.wrapperviews.containers.module.c) bVar).getInfo());
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.module.a) {
                ModuleInfo moduleInfo = (ModuleInfo) getInfo();
                ViewInfo childInfo = ((com.dianping.gcmrnmodule.wrapperviews.containers.module.a) bVar).getChildInfo();
                if (!(childInfo instanceof HoverViewInfo)) {
                    childInfo = null;
                }
                moduleInfo.setHoverView((HoverViewInfo) childInfo);
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.module.b) {
                ModuleInfo moduleInfo2 = (ModuleInfo) getInfo();
                ViewInfo childInfo2 = ((com.dianping.gcmrnmodule.wrapperviews.containers.module.b) bVar).getChildInfo();
                if (!(childInfo2 instanceof PopViewInfo)) {
                    childInfo2 = null;
                }
                moduleInfo2.setPopView((PopViewInfo) childInfo2);
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.g) {
                ((ModuleInfo) getInfo()).setLoadingView(((com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.g) bVar).getChildInfo());
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.d) {
                ((ModuleInfo) getInfo()).setLoadingFailView(((com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.d) bVar).getChildInfo());
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.f) {
                ((ModuleInfo) getInfo()).setLoadingMoreView(((com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.f) bVar).getChildInfo());
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.e) {
                ((ModuleInfo) getInfo()).setLoadingMoreFailView(((com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.e) bVar).getChildInfo());
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.c) {
                ((ModuleInfo) getInfo()).setEmptyView(((com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.c) bVar).getChildInfo());
            }
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e89bbcf2884e7fd618dd3639d7cc89c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e89bbcf2884e7fd618dd3639d7cc89c6");
        } else {
            a(new z(getId()));
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0aaf68ca4fe783fc27f81bc7081b881", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0aaf68ca4fe783fc27f81bc7081b881");
        } else {
            a(new com.dianping.gcmrnmodule.wrapperviews.events.b(getId()));
        }
    }

    public final void setNeedScroll(boolean z) {
        this.j = z;
    }

    public final void setNeedMomentumScrollBegin(boolean z) {
        this.l = z;
    }

    public final void setNeedMomentumScrollEnd(boolean z) {
        this.k = z;
    }

    public final void setNeedBeginDrag(boolean z) {
        this.m = z;
    }

    public final void setNeedEndDrag(boolean z) {
        this.n = z;
    }

    public final void setScrollEventThrottle(int i) {
        this.o = i;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.a
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0df4123735e55a41c8b0af33874aedae", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0df4123735e55a41c8b0af33874aedae")).booleanValue() : this.j || d();
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.a
    public final boolean d() {
        return this.k || this.l || this.o == 0;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.a
    public final boolean e() {
        return this.m || this.n || this.o == 0;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.a
    public final int f() {
        return this.o;
    }
}
