package com.dianping.gcmrnmodule.wrapperviews.items.utils;

import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import com.dianping.shield.component.interfaces.OnDragStatusListener;
import com.dianping.shield.component.utils.ScrollDispatchHelper;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.scroll.i;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0004&'()B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010$\u001a\u00020%2\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u0015\u0010\f\u001a\u00060\rR\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0010\u001a\u00060\u0011R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u001c\u001a\u00060\u001dR\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector;", "", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "recyclerView", "Lcom/dianping/shield/component/widgets/PageContainerRecyclerView;", "viewTag", "", "throttle", "(Lcom/facebook/react/bridge/ReactContext;Lcom/dianping/shield/component/widgets/PageContainerRecyclerView;II)V", "MOMENTUM_DELAY", "", "beginDragListener", "Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector$PageContainerOnDragStatusListener;", "getBeginDragListener", "()Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector$PageContainerOnDragStatusListener;", "contentOffsetListener", "Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector$PageContainerContentOffsetListener;", "getContentOffsetListener", "()Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector$PageContainerContentOffsetListener;", "currentFlingRunnable", "Ljava/lang/Runnable;", "getCurrentFlingRunnable", "()Ljava/lang/Runnable;", "setCurrentFlingRunnable", "(Ljava/lang/Runnable;)V", "fling", "", "flingListener", "Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector$PageContainerFlingListener;", "getFlingListener", "()Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector$PageContainerFlingListener;", "scrollDispatchHelper", "Lcom/dianping/shield/component/utils/ScrollDispatchHelper;", "xOffset", "yOffset", "setThrottle", "", "Companion", "PageContainerContentOffsetListener", "PageContainerFlingListener", "PageContainerOnDragStatusListener", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static final a g = new a(null);
    public final ScrollDispatchHelper b;
    @NotNull
    public final d c;
    @NotNull
    public final C0072b d;
    @NotNull
    public final c e;
    @Nullable
    Runnable f;
    private final long h;
    private boolean i;
    private int j;
    private int k;
    private final ReactContext l;
    private final PageContainerRecyclerView m;
    private final int n;
    private final int o;

    public b(@NotNull ReactContext reactContext, @NotNull PageContainerRecyclerView pageContainerRecyclerView, int i, int i2) {
        h.b(reactContext, "reactContext");
        h.b(pageContainerRecyclerView, "recyclerView");
        Object[] objArr = {reactContext, pageContainerRecyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba49df78672d16eef6b3b4b436379d9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba49df78672d16eef6b3b4b436379d9e");
            return;
        }
        this.l = reactContext;
        this.m = pageContainerRecyclerView;
        this.n = i;
        this.o = i2;
        this.h = 20L;
        this.b = new ScrollDispatchHelper(this.o);
        this.c = new d();
        this.d = new C0072b();
        this.e = new c();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector$Companion;", "", "()V", "emitScrollEvent", "", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "viewTag", "", "recyclerView", "Lcom/dianping/shield/component/widgets/PageContainerRecyclerView;", "xOffset", "yOffset", "xVelocity", "", "yVelocity", "type", "Lcom/facebook/react/views/scroll/ScrollEventType;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public static ChangeQuickRedirect a;

        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public static final /* synthetic */ void a(a aVar, ReactContext reactContext, int i, PageContainerRecyclerView pageContainerRecyclerView, int i2, int i3, float f, float f2, i iVar) {
            Object[] objArr = {reactContext, Integer.valueOf(i), pageContainerRecyclerView, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f), Float.valueOf(f2), iVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "d8c302a4f799193b9cca579aef3ef2ac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "d8c302a4f799193b9cca579aef3ef2ac");
                return;
            }
            NativeModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
            h.a((Object) nativeModule, "reactContext.getNativeMo…anagerModule::class.java)");
            ((UIManagerModule) nativeModule).getEventDispatcher().a(com.facebook.react.views.scroll.h.a(i, iVar, i2, i3, f, f2, pageContainerRecyclerView.getWidth(), pageContainerRecyclerView.computeVerticalScrollRange(), pageContainerRecyclerView.getWidth(), pageContainerRecyclerView.getHeight()));
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector$PageContainerOnDragStatusListener;", "Lcom/dianping/shield/component/interfaces/OnDragStatusListener;", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector;)V", "onBeginDrag", "", "recyclerView", "Lcom/dianping/shield/component/widgets/PageContainerRecyclerView;", "onEndDrag", "xVelocity", "", "yVelocity", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public final class d implements OnDragStatusListener {
        public static ChangeQuickRedirect a;

        public d() {
        }

        @Override // com.dianping.shield.component.interfaces.OnDragStatusListener
        public final void onBeginDrag(@NotNull PageContainerRecyclerView pageContainerRecyclerView) {
            Object[] objArr = {pageContainerRecyclerView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "128293dc13450451b1ca5ba60347c688", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "128293dc13450451b1ca5ba60347c688");
                return;
            }
            h.b(pageContainerRecyclerView, "recyclerView");
            a.a(b.g, b.this.l, b.this.n, pageContainerRecyclerView, b.this.j, b.this.k, 0.0f, 0.0f, i.BEGIN_DRAG);
            a.a(b.g, b.this.l, b.this.n, pageContainerRecyclerView, b.this.j, b.this.k, 0.0f, 0.0f, i.SCROLL);
        }

        @Override // com.dianping.shield.component.interfaces.OnDragStatusListener
        public final void onEndDrag(@NotNull PageContainerRecyclerView pageContainerRecyclerView, float f, float f2) {
            Object[] objArr = {pageContainerRecyclerView, Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d783a35956a9592f641ba2e137471103", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d783a35956a9592f641ba2e137471103");
                return;
            }
            h.b(pageContainerRecyclerView, "recyclerView");
            StringBuilder sb = new StringBuilder("EndDrag ");
            sb.append(f);
            sb.append(" - ");
            sb.append(f2);
            a.a(b.g, b.this.l, b.this.n, pageContainerRecyclerView, b.this.j, b.this.k, f, f2, i.END_DRAG);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector$PageContainerContentOffsetListener;", "Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector;)V", "offsetChanged", "", Constants.GestureMoveEvent.KEY_X, "", Constants.GestureMoveEvent.KEY_Y, "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.dianping.gcmrnmodule.wrapperviews.items.utils.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0072b implements ContentOffsetListener {
        public static ChangeQuickRedirect a;

        public C0072b() {
        }

        @Override // com.dianping.shield.node.itemcallbacks.ContentOffsetListener
        public final void offsetChanged(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "408421d648b86e454967655773195fe8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "408421d648b86e454967655773195fe8");
                return;
            }
            StringBuilder sb = new StringBuilder("offsetChanged ");
            sb.append(i);
            sb.append(" - ");
            sb.append(i2);
            b.this.j = i;
            b.this.k = i2;
            if (b.this.b.onScrollChanged(i, i2)) {
                a.a(b.g, b.this.l, b.this.n, b.this.m, b.this.j, b.this.k, b.this.b.getXFlingVelocity(), b.this.b.getYFlingVelocity(), i.SCROLL);
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector$PageContainerFlingListener;", "Landroid/support/v7/widget/RecyclerView$OnFlingListener;", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector;)V", "onFling", "", "velocityX", "", "velocityY", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public final class c extends RecyclerView.i {
        public static ChangeQuickRedirect a;

        public c() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3187a48c8f4e01904e8db49d107a8d15", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3187a48c8f4e01904e8db49d107a8d15");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.i
        public final boolean onFling(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34b8d4a316bedb332429348ede547de6", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34b8d4a316bedb332429348ede547de6")).booleanValue();
            }
            if (b.this.f != null) {
                return false;
            }
            b.this.i = true;
            StringBuilder sb = new StringBuilder("momentumBegin ");
            sb.append(i);
            sb.append(" - ");
            sb.append(i2);
            a.a(b.g, b.this.l, b.this.n, b.this.m, b.this.j, b.this.k, i, i2, i.MOMENTUM_BEGIN);
            b.this.f = new a(i, i2);
            ViewCompat.postOnAnimationDelayed(b.this.m, b.this.f, b.this.h);
            return false;
        }

        /* compiled from: ProGuard */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector$PageContainerFlingListener$onFling$1", "Ljava/lang/Runnable;", "run", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
        /* loaded from: classes.dex */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect a;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;

            public a(int i, int i2) {
                this.c = i;
                this.d = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9cda5b3e9298e803cc78187ff40e8b6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9cda5b3e9298e803cc78187ff40e8b6");
                } else if (b.this.i && b.this.m.getScrollState() == 0) {
                    b.this.i = false;
                    a.a(b.g, b.this.l, b.this.n, b.this.m, b.this.j, b.this.k, b.this.b.getXFlingVelocity(), b.this.b.getYFlingVelocity(), i.SCROLL);
                    StringBuilder sb = new StringBuilder("momentumEnd ");
                    sb.append(this.c);
                    sb.append(" - ");
                    sb.append(this.d);
                    a.a(b.g, b.this.l, b.this.n, b.this.m, b.this.j, b.this.k, 0.0f, 0.0f, i.MOMENTUM_END);
                    b.this.f = null;
                } else {
                    ViewCompat.postOnAnimationDelayed(b.this.m, this, b.this.h);
                }
            }
        }
    }
}
