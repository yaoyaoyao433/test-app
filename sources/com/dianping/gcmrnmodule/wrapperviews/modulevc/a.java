package com.dianping.gcmrnmodule.wrapperviews.modulevc;

import com.dianping.gcmrnmodule.wrapperviews.b;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.d;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.g;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.i;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.j;
import com.dianping.shield.dynamic.model.view.DragRefreshViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020&H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000b¨\u0006'"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/modulevc/MRNModulesVCExtraViewsContainerWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "backgroundView", "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "getBackgroundView", "()Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "setBackgroundView", "(Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;)V", "dragRefreshView", "Lcom/dianping/shield/dynamic/model/view/DragRefreshViewInfo;", "getDragRefreshView", "()Lcom/dianping/shield/dynamic/model/view/DragRefreshViewInfo;", "setDragRefreshView", "(Lcom/dianping/shield/dynamic/model/view/DragRefreshViewInfo;)V", "loadingFailView", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "getLoadingFailView", "()Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "setLoadingFailView", "(Lcom/dianping/shield/dynamic/model/view/ViewInfo;)V", "loadingView", "getLoadingView", "setLoadingView", "maskView", "getMaskView", "setMaskView", "pageBackgroundView", "getPageBackgroundView", "setPageBackgroundView", "pageMaskView", "getPageMaskView", "setPageMaskView", "createInfoInstance", "updateInfo", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a extends b<Object> {
    public static ChangeQuickRedirect a;
    @Nullable
    private ViewInfo g;
    @Nullable
    private ViewInfo h;
    @Nullable
    private ExtraViewInfo i;
    @Nullable
    private ExtraViewInfo j;
    @Nullable
    private ExtraViewInfo k;
    @Nullable
    private ExtraViewInfo l;
    @Nullable
    private DragRefreshViewInfo m;

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    @NotNull
    public final Object g() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b04703788d3d196bd63c9729770403f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b04703788d3d196bd63c9729770403f");
        }
    }

    @Nullable
    public final ViewInfo getLoadingView() {
        return this.g;
    }

    public final void setLoadingView(@Nullable ViewInfo viewInfo) {
        this.g = viewInfo;
    }

    @Nullable
    public final ViewInfo getLoadingFailView() {
        return this.h;
    }

    public final void setLoadingFailView(@Nullable ViewInfo viewInfo) {
        this.h = viewInfo;
    }

    @Nullable
    public final ExtraViewInfo getBackgroundView() {
        return this.i;
    }

    public final void setBackgroundView(@Nullable ExtraViewInfo extraViewInfo) {
        this.i = extraViewInfo;
    }

    @Nullable
    public final ExtraViewInfo getMaskView() {
        return this.j;
    }

    public final void setMaskView(@Nullable ExtraViewInfo extraViewInfo) {
        this.j = extraViewInfo;
    }

    @Nullable
    public final ExtraViewInfo getPageBackgroundView() {
        return this.k;
    }

    public final void setPageBackgroundView(@Nullable ExtraViewInfo extraViewInfo) {
        this.k = extraViewInfo;
    }

    @Nullable
    public final ExtraViewInfo getPageMaskView() {
        return this.l;
    }

    public final void setPageMaskView(@Nullable ExtraViewInfo extraViewInfo) {
        this.l = extraViewInfo;
    }

    @Nullable
    public final DragRefreshViewInfo getDragRefreshView() {
        return this.m;
    }

    public final void setDragRefreshView(@Nullable DragRefreshViewInfo dragRefreshViewInfo) {
        this.m = dragRefreshViewInfo;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "780b046c3ac31523ac90c9621370d7ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "780b046c3ac31523ac90c9621370d7ab");
            return;
        }
        super.h();
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        Iterator<T> it = getChildWrapperViewList().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar instanceof g) {
                this.g = ((g) bVar).getChildInfo();
            } else if (bVar instanceof d) {
                this.h = ((d) bVar).getChildInfo();
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.a) {
                ViewInfo childInfo = ((com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.a) bVar).getChildInfo();
                if (!(childInfo instanceof ExtraViewInfo)) {
                    childInfo = null;
                }
                this.i = (ExtraViewInfo) childInfo;
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.h) {
                ViewInfo childInfo2 = ((com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.h) bVar).getChildInfo();
                if (!(childInfo2 instanceof ExtraViewInfo)) {
                    childInfo2 = null;
                }
                this.j = (ExtraViewInfo) childInfo2;
            } else if (bVar instanceof i) {
                ViewInfo childInfo3 = ((i) bVar).getChildInfo();
                if (!(childInfo3 instanceof ExtraViewInfo)) {
                    childInfo3 = null;
                }
                this.k = (ExtraViewInfo) childInfo3;
            } else if (bVar instanceof j) {
                ViewInfo childInfo4 = ((j) bVar).getChildInfo();
                if (!(childInfo4 instanceof ExtraViewInfo)) {
                    childInfo4 = null;
                }
                this.l = (ExtraViewInfo) childInfo4;
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.b) {
                ViewInfo childInfo5 = ((com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.b) bVar).getChildInfo();
                if (!(childInfo5 instanceof DragRefreshViewInfo)) {
                    childInfo5 = null;
                }
                this.m = (DragRefreshViewInfo) childInfo5;
            }
        }
    }
}
