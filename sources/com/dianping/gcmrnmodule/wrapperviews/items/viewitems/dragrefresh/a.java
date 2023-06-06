package com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import com.dianping.gcmrnmodule.fragments.MRNModuleFragment;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.c;
import com.dianping.shield.component.interfaces.OnRefreshSuccessListener;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.dynamic.agent.refresh.DynamicRefreshDelegate;
import com.dianping.shield.dynamic.model.view.DragRefreshViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.o;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import rx.k;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u0017H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/dragrefresh/MRNModuleDragRefreshViewItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleViewItemWrapperView;", "Lcom/dianping/shield/dynamic/model/view/DragRefreshViewInfo;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "onPullEventDetector", "Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleDragRefreshOnPullEventDetector;", "pageContainer", "Lcom/dianping/shield/component/widgets/container/CommonPageContainer;", "refreshSuccessDelegate", "Lcom/dianping/shield/dynamic/agent/refresh/DynamicRefreshDelegate;", "getRefreshSuccessDelegate", "()Lcom/dianping/shield/dynamic/agent/refresh/DynamicRefreshDelegate;", "refreshSuccessDelegate$delegate", "Lkotlin/Lazy;", "refreshSuccessListener", "Lcom/dianping/shield/component/interfaces/OnRefreshSuccessListener;", "refreshSuccessSubscription", "Lrx/Subscription;", "createViewInfo", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "onDestroy", "", "onDragRefreshStatusChanged", "params", "Lorg/json/JSONObject;", "onRefreshSuccess", "onRefreshSuccessEnd", "refreshId", "", "updateInfo", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class a extends c<DragRefreshViewInfo> {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ i[] h = {u.a(new s(u.a(a.class), "refreshSuccessDelegate", "getRefreshSuccessDelegate()Lcom/dianping/shield/dynamic/agent/refresh/DynamicRefreshDelegate;"))};
    CommonPageContainer i;
    com.dianping.gcmrnmodule.wrapperviews.items.utils.a j;
    k k;
    OnRefreshSuccessListener l;
    private final d m;

    public final DynamicRefreshDelegate getRefreshSuccessDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return (DynamicRefreshDelegate) (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbdc7c0f609baf7a71dcb88a49ba5df0", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbdc7c0f609baf7a71dcb88a49ba5df0") : this.m.a());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/dianping/shield/dynamic/agent/refresh/DynamicRefreshDelegate;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0073a extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<DynamicRefreshDelegate> {
        public static ChangeQuickRedirect a;
        public static final C0073a b = new C0073a();

        public C0073a() {
            super(0);
        }

        /* compiled from: ProGuard */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a$a$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends kotlin.jvm.internal.i implements kotlin.jvm.functions.b<Integer, Boolean> {
            public static final AnonymousClass1 a = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.b
            public final /* synthetic */ Boolean invoke(Integer num) {
                num.intValue();
                return Boolean.TRUE;
            }
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ DynamicRefreshDelegate invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c63429de15736196e295c062ffa002c", RobustBitConfig.DEFAULT_VALUE) ? (DynamicRefreshDelegate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c63429de15736196e295c062ffa002c") : new DynamicRefreshDelegate(AnonymousClass1.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08616e59ef707daeea815768258c12f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08616e59ef707daeea815768258c12f6");
        } else {
            this.m = e.a(kotlin.i.NONE, C0073a.b);
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.c
    @NotNull
    public final ViewInfo a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08b6db8bfb235c2a183127e67b81a919", RobustBitConfig.DEFAULT_VALUE) ? (ViewInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08b6db8bfb235c2a183127e67b81a919") : new DragRefreshViewInfo();
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.c, com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        com.dianping.gcmrnmodule.hostwrapper.a hostInterfaceField;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "717bb41a20c07e0fc15152d5e60e7f66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "717bb41a20c07e0fc15152d5e60e7f66");
            return;
        }
        super.h();
        com.dianping.gcmrnmodule.wrapperviews.a<?> hostWrapperView = getHostWrapperView();
        if (hostWrapperView != null && (hostInterfaceField = hostWrapperView.getHostInterfaceField()) != null) {
            Fragment hostFragment = hostInterfaceField.getHostFragment();
            if (!(hostFragment instanceof MRNModuleFragment)) {
                hostFragment = null;
            }
            MRNModuleFragment mRNModuleFragment = (MRNModuleFragment) hostFragment;
            this.i = mRNModuleFragment != null ? mRNModuleFragment.getCommonPageContainer() : null;
            CommonPageContainer commonPageContainer = this.i;
            ViewGroup agentContainerView = commonPageContainer != null ? commonPageContainer.getAgentContainerView() : null;
            if ((agentContainerView instanceof PageContainerRecyclerView) && this.j == null) {
                this.j = new com.dianping.gcmrnmodule.wrapperviews.items.utils.a(getReactContext(), (PageContainerRecyclerView) agentContainerView, getId(), 1);
                CommonPageContainer commonPageContainer2 = this.i;
                if (commonPageContainer2 != null) {
                    com.dianping.gcmrnmodule.wrapperviews.items.utils.a aVar = this.j;
                    if (aVar == null) {
                        throw new o("null cannot be cast to non-null type com.dianping.gcmrnmodule.wrapperviews.items.utils.MRNModuleDragRefreshOnPullEventDetector");
                    }
                    commonPageContainer2.addContentScrollOffsetListener(aVar.f);
                }
            }
            if (this.l == null) {
                this.l = new b(hostInterfaceField, this);
                CommonPageContainer commonPageContainer3 = this.i;
                if (commonPageContainer3 != null) {
                    commonPageContainer3.setOnRefreshSuccessListener(this.l);
                }
            }
        }
        com.dianping.gcmrnmodule.wrapperviews.items.utils.a aVar2 = this.j;
        if (aVar2 != null) {
            Boolean onPull = ((DragRefreshViewInfo) getInfo()).getOnPull();
            aVar2.e = onPull != null ? onPull.booleanValue() : false;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/dianping/gcmrnmodule/wrapperviews/items/viewitems/dragrefresh/MRNModuleDragRefreshViewItemWrapperView$updateInfo$1$1", "Lcom/dianping/shield/component/interfaces/OnRefreshSuccessListener;", "onRefreshSuccess", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class b implements OnRefreshSuccessListener {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ com.dianping.gcmrnmodule.hostwrapper.a b;
        public final /* synthetic */ a c;

        public b(com.dianping.gcmrnmodule.hostwrapper.a aVar, a aVar2) {
            this.b = aVar;
            this.c = aVar2;
        }

        @Override // com.dianping.shield.component.interfaces.OnRefreshSuccessListener
        public final void onRefreshSuccess() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb2278f12f2da9e761d7df6057f88045", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb2278f12f2da9e761d7df6057f88045");
                return;
            }
            String onRefreshSuccess = ((DragRefreshViewInfo) this.c.getInfo()).getOnRefreshSuccess();
            if (onRefreshSuccess != null) {
                k kVar = this.c.k;
                if (kVar != null && kVar.isUnsubscribed()) {
                    kVar.unsubscribe();
                }
                rx.d<Object> onRefresh = this.c.getRefreshSuccessDelegate().onRefresh();
                this.c.k = onRefresh != null ? onRefresh.c(new rx.functions.b<Object>() { // from class: com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a.b.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final void call(Object obj) {
                        Object[] objArr2 = {obj};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8980283c28266257627157eab9136ac3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8980283c28266257627157eab9136ac3");
                            return;
                        }
                        CommonPageContainer commonPageContainer = b.this.c.i;
                        if (commonPageContainer != null) {
                            commonPageContainer.setContentInset(0);
                        }
                        CommonPageContainer commonPageContainer2 = b.this.c.i;
                        if (commonPageContainer2 != null) {
                            commonPageContainer2.updateHeaderView(true);
                        }
                    }
                }) : null;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("refreshId", String.valueOf(this.c.getRefreshSuccessDelegate().getIdentifier()));
                } catch (JSONException unused) {
                }
                this.b.callMethod(onRefreshSuccess, jSONObject);
            }
        }
    }
}
