package com.dianping.gcmrnmodule.wrapperviews.items.utils;

import com.dianping.gcmrnmodule.wrapperviews.events.q;
import com.dianping.shield.component.utils.ScrollDispatchHelper;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0010\u001a\u00060\u0011R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleDragRefreshOnPullEventDetector;", "", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "recyclerView", "Lcom/dianping/shield/component/widgets/PageContainerRecyclerView;", "viewTag", "", "throttle", "(Lcom/facebook/react/bridge/ReactContext;Lcom/dianping/shield/component/widgets/PageContainerRecyclerView;II)V", "onPull", "", "getOnPull", "()Z", "setOnPull", "(Z)V", "pullToRefreshListener", "Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleDragRefreshOnPullEventDetector$PagePullToRefreshListener;", "getPullToRefreshListener", "()Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleDragRefreshOnPullEventDetector$PagePullToRefreshListener;", "scrollDispatchHelper", "Lcom/dianping/shield/component/utils/ScrollDispatchHelper;", "xOffset", "yOffset", "PagePullToRefreshListener", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final ScrollDispatchHelper b;
    int c;
    int d;
    public boolean e;
    @NotNull
    public final C0071a f;
    final ReactContext g;
    final PageContainerRecyclerView h;
    final int i;
    private final int j;

    public a(@NotNull ReactContext reactContext, @NotNull PageContainerRecyclerView pageContainerRecyclerView, int i, int i2) {
        h.b(reactContext, "reactContext");
        h.b(pageContainerRecyclerView, "recyclerView");
        Object[] objArr = {reactContext, pageContainerRecyclerView, Integer.valueOf(i), 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b2ae80e7fc3c6db34c8bd924040b746", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b2ae80e7fc3c6db34c8bd924040b746");
            return;
        }
        this.g = reactContext;
        this.h = pageContainerRecyclerView;
        this.i = i;
        this.j = 1;
        this.b = new ScrollDispatchHelper(this.j);
        this.f = new C0071a();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleDragRefreshOnPullEventDetector$PagePullToRefreshListener;", "Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleDragRefreshOnPullEventDetector;)V", "offsetChanged", "", Constants.GestureMoveEvent.KEY_X, "", Constants.GestureMoveEvent.KEY_Y, "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.dianping.gcmrnmodule.wrapperviews.items.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0071a implements ContentOffsetListener {
        public static ChangeQuickRedirect a;

        public C0071a() {
        }

        @Override // com.dianping.shield.node.itemcallbacks.ContentOffsetListener
        public final void offsetChanged(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91bb1558a739febccb5ff97bde525c9b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91bb1558a739febccb5ff97bde525c9b");
            } else if (a.this.e) {
                a.this.c = i;
                a.this.d = i2;
                if (a.this.d < 0 && a.this.b.onScrollChanged(i, i2)) {
                    NativeModule nativeModule = a.this.g.getNativeModule(UIManagerModule.class);
                    h.a((Object) nativeModule, "reactContext.getNativeMo…anagerModule::class.java)");
                    ((UIManagerModule) nativeModule).getEventDispatcher().a(q.a(a.this.i, a.this.c, a.this.d, a.this.b.getXFlingVelocity(), a.this.b.getYFlingVelocity(), a.this.h.getWidth(), a.this.h.computeVerticalScrollRange(), a.this.h.getWidth(), a.this.h.getHeight()));
                }
            }
        }
    }
}
