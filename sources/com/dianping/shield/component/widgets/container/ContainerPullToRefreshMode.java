package com.dianping.shield.component.widgets.container;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.component.interfaces.OnDragRefreshStatusChangedListener;
import com.dianping.shield.component.interfaces.OnRefreshSuccessListener;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.dianping.shield.component.widgets.ScBaseRefreshHeaderView;
import com.dianping.shield.component.widgets.ScPullToRefreshCustomizedHeaderView;
import com.dianping.shield.component.widgets.ScPullToRefreshHeaderView;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0016J\u0006\u0010!\u001a\u00020 J\u0006\u0010\"\u001a\u00020 J\u0006\u0010#\u001a\u00020 J\u0006\u0010$\u001a\u00020 J\u0010\u0010%\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010&\u001a\u00020 2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010'\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010(\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,J\u0010\u0010-\u001a\u00020 2\b\u0010.\u001a\u0004\u0018\u00010\u0010J\u0006\u0010/\u001a\u00020 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/dianping/shield/component/widgets/container/ContainerPullToRefreshMode;", "Lcom/dianping/shield/component/widgets/container/ContainerBaseMode;", "commonPageContainer", "Lcom/dianping/shield/component/widgets/container/CommonPageContainer;", "(Lcom/dianping/shield/component/widgets/container/CommonPageContainer;)V", "curRefreshStatus", "Lcom/dianping/shield/component/widgets/container/ContainerPullToRefreshMode$DragRefreshStatus;", "isRefreshComplete", "", "isRefreshing", "()Z", JsBridgeResult.ARG_KEY_LOCATION_MODE, "Lcom/dianping/shield/component/widgets/container/CommonPageContainer$PullToRefreshMode;", "onRefreshListener", "Lcom/dianping/shield/component/widgets/container/CommonPageContainer$OnRefreshListener;", "onRefreshStatusChangedListener", "Lcom/dianping/shield/component/interfaces/OnDragRefreshStatusChangedListener;", "onRefreshSuccessListener", "Lcom/dianping/shield/component/interfaces/OnRefreshSuccessListener;", "refreshCustomizedView", "Lcom/dianping/shield/component/widgets/ScPullToRefreshCustomizedHeaderView;", "refreshDefaultView", "Lcom/dianping/shield/component/widgets/ScBaseRefreshHeaderView;", "value", "", "refreshHeight", "getRefreshHeight", "()I", "setRefreshHeight", "(I)V", "refreshView", "init", "", "onDestroy", "onRefreshComplete", "releaseAnim", "setLoading", "setOnRefreshListener", "setOnRefreshSuccessListener", "setPullToRefreshMode", "setRefreshCustomizedView", Constants.EventType.VIEW, "Landroid/view/View;", "layoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "setRefreshStatusChangedListener", "listener", "setSuccess", "DragRefreshStatus", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ContainerPullToRefreshMode extends ContainerBaseMode {
    public static ChangeQuickRedirect changeQuickRedirect;
    private DragRefreshStatus curRefreshStatus;
    private boolean isRefreshComplete;
    private CommonPageContainer.PullToRefreshMode mode;
    private CommonPageContainer.OnRefreshListener onRefreshListener;
    private OnDragRefreshStatusChangedListener onRefreshStatusChangedListener;
    private OnRefreshSuccessListener onRefreshSuccessListener;
    private ScPullToRefreshCustomizedHeaderView refreshCustomizedView;
    private ScBaseRefreshHeaderView refreshDefaultView;
    private int refreshHeight;
    private ScBaseRefreshHeaderView refreshView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContainerPullToRefreshMode(@NotNull CommonPageContainer commonPageContainer) {
        super(commonPageContainer);
        h.b(commonPageContainer, "commonPageContainer");
        Object[] objArr = {commonPageContainer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9aa6ad78efa0d8cf3a63b2bffc0ca6a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9aa6ad78efa0d8cf3a63b2bffc0ca6a9");
            return;
        }
        this.refreshHeight = aq.a(getContext(), commonPageContainer.getThemePackage().getRefreshHeight());
        this.mode = CommonPageContainer.PullToRefreshMode.PULL_DOWN_TO_REFRESH;
        this.curRefreshStatus = DragRefreshStatus.Normal;
        this.isRefreshComplete = true;
        init();
    }

    public final int getRefreshHeight() {
        return this.refreshHeight;
    }

    public final void setRefreshHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0a3edeadac07eb6a779eb3429e8814c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0a3edeadac07eb6a779eb3429e8814c");
        } else {
            this.refreshHeight = aq.a(getContext(), i);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/component/widgets/container/ContainerPullToRefreshMode$DragRefreshStatus;", "", "(Ljava/lang/String;I)V", "Normal", "Pulling", "PullOver", "Refreshing", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public enum DragRefreshStatus {
        Normal,
        Pulling,
        PullOver,
        Refreshing;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static DragRefreshStatus valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (DragRefreshStatus) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e80d30442be5bdb3a95fc82fc5344473", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e80d30442be5bdb3a95fc82fc5344473") : Enum.valueOf(DragRefreshStatus.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static DragRefreshStatus[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (DragRefreshStatus[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "20e0b4d1585f182c2554c257d8084244", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "20e0b4d1585f182c2554c257d8084244") : values().clone());
        }

        DragRefreshStatus() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57fa514a03cb6392cc2043b5490b2023", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57fa514a03cb6392cc2043b5490b2023");
            }
        }
    }

    @Override // com.dianping.shield.component.widgets.container.ContainerBaseMode
    public final void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ed50dbff318f596acfbaf7dd08ba725", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ed50dbff318f596acfbaf7dd08ba725");
            return;
        }
        ScPullToRefreshHeaderView createPullToRefreshView = getCommonPageContainer().getThemePackage().getPageContainerViewResCreate().createPullToRefreshView(getContext());
        if (createPullToRefreshView != null) {
            createPullToRefreshView.setRefreshHeight(this.refreshHeight);
            createPullToRefreshView.setOnRefreshCompleteListener(new ScBaseRefreshHeaderView.OnRefreshCompleteListener() { // from class: com.dianping.shield.component.widgets.container.ContainerPullToRefreshMode$init$$inlined$let$lambda$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView.OnRefreshCompleteListener
                public final void onRefreshComplete() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1be7991ea255d26d1c8bf012be6e77c6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1be7991ea255d26d1c8bf012be6e77c6");
                        return;
                    }
                    ContainerPullToRefreshMode.this.getCommonPageContainer().setContentInset(0);
                    ContainerPullToRefreshMode.this.getCommonPageContainer().updateHeaderView(true);
                }
            });
        }
        if (createPullToRefreshView == null) {
            ScPullToRefreshHeaderView scPullToRefreshHeaderView = new ScPullToRefreshHeaderView(getContext());
            scPullToRefreshHeaderView.setThemePackage(getCommonPageContainer().getThemePackage());
            scPullToRefreshHeaderView.setRefreshHeight(this.refreshHeight);
            scPullToRefreshHeaderView.setOnRefreshCompleteListener(new ScBaseRefreshHeaderView.OnRefreshCompleteListener() { // from class: com.dianping.shield.component.widgets.container.ContainerPullToRefreshMode$init$$inlined$also$lambda$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView.OnRefreshCompleteListener
                public final void onRefreshComplete() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5702106ac4877e80c659903fabdf1e2d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5702106ac4877e80c659903fabdf1e2d");
                        return;
                    }
                    ContainerPullToRefreshMode.this.getCommonPageContainer().setContentInset(0);
                    ContainerPullToRefreshMode.this.getCommonPageContainer().updateHeaderView(true);
                }
            });
            createPullToRefreshView = scPullToRefreshHeaderView;
        }
        this.refreshDefaultView = createPullToRefreshView;
        this.refreshView = this.refreshDefaultView;
        getCommonPageContainer().setRefreshView(this.refreshView);
        getCommonPageContainer().addContentOffsetListener(new ContentOffsetListener() { // from class: com.dianping.shield.component.widgets.container.ContainerPullToRefreshMode$init$3
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Code restructure failed: missing block: B:50:0x00ed, code lost:
                r0 = r10.this$0.refreshView;
             */
            @Override // com.dianping.shield.node.itemcallbacks.ContentOffsetListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void offsetChanged(int r11, int r12) {
                /*
                    Method dump skipped, instructions count: 309
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.component.widgets.container.ContainerPullToRefreshMode$init$3.offsetChanged(int, int):void");
            }
        });
    }

    public final void setRefreshCustomizedView(@Nullable final View view, @Nullable final FrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50c8b7b26992cf4b51e994645f9d024f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50c8b7b26992cf4b51e994645f9d024f");
        } else if (view == null) {
            this.refreshView = this.refreshDefaultView;
            getCommonPageContainer().setRefreshView(this.refreshView);
            setRefreshHeight(getCommonPageContainer().getThemePackage().getRefreshHeight());
            this.refreshCustomizedView = null;
            this.onRefreshSuccessListener = null;
            this.onRefreshStatusChangedListener = null;
        } else {
            if (this.refreshCustomizedView == null) {
                this.refreshCustomizedView = new ScPullToRefreshCustomizedHeaderView(getCommonPageContainer().getContext());
            }
            ScPullToRefreshCustomizedHeaderView scPullToRefreshCustomizedHeaderView = this.refreshCustomizedView;
            if (scPullToRefreshCustomizedHeaderView != null) {
                scPullToRefreshCustomizedHeaderView.setRefreshView(view, layoutParams);
                scPullToRefreshCustomizedHeaderView.setRefreshHeight(this.refreshHeight);
                scPullToRefreshCustomizedHeaderView.setOnRefreshCompleteListener(new ScBaseRefreshHeaderView.OnRefreshCompleteListener() { // from class: com.dianping.shield.component.widgets.container.ContainerPullToRefreshMode$setRefreshCustomizedView$$inlined$let$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView.OnRefreshCompleteListener
                    public final void onRefreshComplete() {
                        OnRefreshSuccessListener onRefreshSuccessListener;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "465ba7b41ddc5022b642e13291cb2aa8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "465ba7b41ddc5022b642e13291cb2aa8");
                            return;
                        }
                        onRefreshSuccessListener = ContainerPullToRefreshMode.this.onRefreshSuccessListener;
                        if (onRefreshSuccessListener != null) {
                            onRefreshSuccessListener.onRefreshSuccess();
                        }
                    }
                });
            }
            this.refreshView = this.refreshCustomizedView;
            getCommonPageContainer().setRefreshView(this.refreshView);
        }
    }

    public final void setOnRefreshSuccessListener(@Nullable OnRefreshSuccessListener onRefreshSuccessListener) {
        this.onRefreshSuccessListener = onRefreshSuccessListener;
    }

    public final void setRefreshStatusChangedListener(@Nullable OnDragRefreshStatusChangedListener onDragRefreshStatusChangedListener) {
        this.onRefreshStatusChangedListener = onDragRefreshStatusChangedListener;
    }

    public final void setOnRefreshListener(@Nullable CommonPageContainer.OnRefreshListener onRefreshListener) {
        this.onRefreshListener = onRefreshListener;
    }

    public final void setLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12c2d9651ed8fbde051cf2ecf5a6faec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12c2d9651ed8fbde051cf2ecf5a6faec");
            return;
        }
        ScBaseRefreshHeaderView scBaseRefreshHeaderView = this.refreshView;
        if (scBaseRefreshHeaderView == null || scBaseRefreshHeaderView.isLoading()) {
            return;
        }
        scBaseRefreshHeaderView.setLoading();
        ViewGroup agentContainerView = getCommonPageContainer().getAgentContainerView();
        if (agentContainerView instanceof PageContainerRecyclerView) {
            ((PageContainerRecyclerView) agentContainerView).setEmptyHeaderViewHeight(this.refreshHeight);
        }
    }

    public final boolean isRefreshing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fcb3c520c8edc96a54e6d36e0fdabd5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fcb3c520c8edc96a54e6d36e0fdabd5")).booleanValue();
        }
        if (this.refreshView != null) {
            ScBaseRefreshHeaderView scBaseRefreshHeaderView = this.refreshView;
            if (scBaseRefreshHeaderView == null) {
                h.a();
            }
            return scBaseRefreshHeaderView.isLoading();
        }
        return false;
    }

    public final void setSuccess() {
        ScBaseRefreshHeaderView scBaseRefreshHeaderView;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f32ba50d560f80f716af9edd46451db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f32ba50d560f80f716af9edd46451db");
            return;
        }
        ScBaseRefreshHeaderView scBaseRefreshHeaderView2 = this.refreshView;
        if (scBaseRefreshHeaderView2 != null && scBaseRefreshHeaderView2.isLoading()) {
            scBaseRefreshHeaderView2.setSuccess();
            if (getCommonPageContainer().isFrozenEnabled() && (scBaseRefreshHeaderView = this.refreshView) != null) {
                scBaseRefreshHeaderView.removeHeaderView();
            }
            scBaseRefreshHeaderView2.resetLoadingStatus();
        }
        this.isRefreshComplete = true;
    }

    public final void onRefreshComplete() {
        ScBaseRefreshHeaderView scBaseRefreshHeaderView;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66fd8c565a07f9c6ad8a2d0754950e73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66fd8c565a07f9c6ad8a2d0754950e73");
            return;
        }
        ScBaseRefreshHeaderView scBaseRefreshHeaderView2 = this.refreshView;
        if (scBaseRefreshHeaderView2 != null && scBaseRefreshHeaderView2.isLoading()) {
            scBaseRefreshHeaderView2.onRefreshComplete();
            if (getCommonPageContainer().isFrozenEnabled() && (scBaseRefreshHeaderView = this.refreshView) != null) {
                scBaseRefreshHeaderView.removeHeaderView();
            }
            scBaseRefreshHeaderView2.resetLoadingStatus();
        }
        this.isRefreshComplete = true;
    }

    public final void setPullToRefreshMode(@NotNull CommonPageContainer.PullToRefreshMode pullToRefreshMode) {
        Object[] objArr = {pullToRefreshMode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "931a584bb0eb57bc1079d87cc66c838b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "931a584bb0eb57bc1079d87cc66c838b");
            return;
        }
        h.b(pullToRefreshMode, JsBridgeResult.ARG_KEY_LOCATION_MODE);
        this.mode = pullToRefreshMode;
        if (pullToRefreshMode != CommonPageContainer.PullToRefreshMode.DISABLED) {
            View refreshView = getCommonPageContainer().getRefreshView();
            if (refreshView != null) {
                getCommonPageContainer().setRefreshView(refreshView);
            } else {
                getCommonPageContainer().setRefreshView(this.refreshView);
            }
        }
    }

    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72f6dd227d7166c7c4a2f4411e8bc72b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72f6dd227d7166c7c4a2f4411e8bc72b");
            return;
        }
        ScBaseRefreshHeaderView scBaseRefreshHeaderView = this.refreshView;
        if (scBaseRefreshHeaderView != null) {
            scBaseRefreshHeaderView.onDestroy();
        }
    }

    public final void releaseAnim() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89507df82730a9dbc0096f029ac3fb84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89507df82730a9dbc0096f029ac3fb84");
            return;
        }
        ScBaseRefreshHeaderView scBaseRefreshHeaderView = this.refreshView;
        if (scBaseRefreshHeaderView != null) {
            scBaseRefreshHeaderView.releaseAnim();
        }
    }
}
