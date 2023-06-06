package com.dianping.gcmrnmodule.wrapperviews.reuse;

import android.annotation.SuppressLint;
import android.content.Context;
import com.dianping.agentsdk.framework.aq;
import com.dianping.gcmrnmodule.monitor.a;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018*\u0001\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u0010&\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020\fH\u0002J\u000e\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u0010J\u000e\u0010+\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u0010J\b\u0010,\u001a\u00020\u0002H\u0016J\u0006\u0010-\u001a\u00020\"J\u000e\u0010.\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u0010J\n\u0010/\u001a\u0004\u0018\u00010%H\u0002J\u0012\u00100\u001a\u00020\"2\b\b\u0002\u00101\u001a\u00020\fH\u0002J\b\u00102\u001a\u00020\"H\u0002J\u0010\u00103\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0010H\u0002J\u000e\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020\u0010J\u000e\u00106\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u0010J\u000e\u00107\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u0010J\u000e\u00108\u001a\u00020\"2\u0006\u00105\u001a\u00020\u0010J\u0016\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u000fJ\u000e\u0010<\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0016j\b\u0012\u0004\u0012\u00020\u0010`\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0016j\b\u0012\u0004\u0012\u00020\u0010`\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0016j\b\u0012\u0004\u0012\u00020\u0010`\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0016j\b\u0012\u0004\u0012\u00020\u0010`\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006="}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/reuse/MRNModuleReuseViewsContainerWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "MAX_EVENT_LIMIT", "", "callback", "com/dianping/gcmrnmodule/wrapperviews/reuse/MRNModuleReuseViewsContainerWrapperView$callback$1", "Lcom/dianping/gcmrnmodule/wrapperviews/reuse/MRNModuleReuseViewsContainerWrapperView$callback$1;", "framePosted", "", "idInputMap", "Ljava/util/HashMap;", "", "Lcom/dianping/gcmrnmodule/objects/MRNModuleViewDelayInput;", "Lkotlin/collections/HashMap;", "idViewMap", "Lcom/dianping/gcmrnmodule/utils/BiMap;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleView;", "needDidEndDisplayingViewIds", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "needPrefetchViewIds", "needWillDisplayViewIds", "notifyEventSet", "performanceMonitor", "Lcom/dianping/gcmrnmodule/monitor/MRNPerformanceMonitor;", "getPerformanceMonitor", "()Lcom/dianping/gcmrnmodule/monitor/MRNPerformanceMonitor;", "performanceMonitor$delegate", "Lkotlin/Lazy;", "addToAppearArray", "", "appearInput", "willDisplayViews", "Lcom/facebook/react/bridge/WritableArray;", "addToDisappearArray", "didEndDisplayingViews", "assertEventAvaliable", "attach2Prefetch", TensorConfig.KEY_INPUT_ARRAY, "cancelPrefetchView", "createInfoInstance", "destroy", "didEndDisplayingView", "flushEndDisplay", "handleViewIds", "force", "handleViewIdsOnNextLoop", "handleViewInput", "popupSetAndJump", "delayInput", "prefetch2Attach", "prefetchView", "registViewInput", "updateViewInput", "moduleView", "reuseId", "willDisplayView", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class b extends com.dianping.gcmrnmodule.wrapperviews.b<Object> {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ i[] g = {u.a(new s(u.a(b.class), "performanceMonitor", "getPerformanceMonitor()Lcom/dianping/gcmrnmodule/monitor/MRNPerformanceMonitor;"))};
    public final HashSet<com.dianping.gcmrnmodule.objects.a> h;
    public final HashSet<com.dianping.gcmrnmodule.objects.a> i;
    public final HashSet<com.dianping.gcmrnmodule.objects.a> j;
    public final HashMap<String, com.dianping.gcmrnmodule.objects.a> k;
    public final com.dianping.gcmrnmodule.utils.a<String, com.dianping.gcmrnmodule.wrapperviews.c> l;
    private final int m;
    private boolean n;
    private final HashSet<com.dianping.gcmrnmodule.objects.a> o;
    private final a p;
    @Nullable
    private final d q;

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    @NotNull
    public final Object g() {
        return this;
    }

    @Nullable
    public final com.dianping.gcmrnmodule.monitor.a getPerformanceMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return (com.dianping.gcmrnmodule.monitor.a) (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e693722c40377d98808d3a76ea872278", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e693722c40377d98808d3a76ea872278") : this.q.a());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/dianping/gcmrnmodule/monitor/MRNPerformanceMonitor;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.dianping.gcmrnmodule.wrapperviews.reuse.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0074b extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<com.dianping.gcmrnmodule.monitor.a> {
        public static ChangeQuickRedirect a;

        public C0074b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ com.dianping.gcmrnmodule.monitor.a invoke() {
            com.dianping.gcmrnmodule.hostwrapper.a hostInterface;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5cb3729af72afd832b1fc174d089c10", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.dianping.gcmrnmodule.monitor.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5cb3729af72afd832b1fc174d089c10");
            }
            com.dianping.gcmrnmodule.wrapperviews.a<?> hostWrapperView = b.this.getHostWrapperView();
            if (hostWrapperView == null || (hostInterface = hostWrapperView.getHostInterface()) == null) {
                return null;
            }
            Context context = b.this.getContext();
            h.a((Object) context, "context");
            return new com.dianping.gcmrnmodule.monitor.a(context, hostInterface);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ce5cedaa152fc860e5851c1671903c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ce5cedaa152fc860e5851c1671903c1");
            return;
        }
        this.m = 10;
        this.h = new HashSet<>();
        this.i = new HashSet<>();
        this.j = new HashSet<>();
        this.o = new HashSet<>();
        this.k = new HashMap<>();
        this.l = new com.dianping.gcmrnmodule.utils.a<>();
        this.p = new a();
        this.q = e.a(new C0074b());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"com/dianping/gcmrnmodule/wrapperviews/reuse/MRNModuleReuseViewsContainerWrapperView$callback$1", "Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;", "force", "", "getForce", "()Z", "setForce", "(Z)V", "doFrame", "", "frameTimeNanos", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a extends a.AbstractC0145a {
        public static ChangeQuickRedirect a;
        boolean b;

        public a() {
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0145a
        public final void doFrame(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e0fa68462aed2ed77a74a7b4805f983", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e0fa68462aed2ed77a74a7b4805f983");
                return;
            }
            b.this.a(this.b);
            if (!(!b.this.h.isEmpty()) && !(!b.this.i.isEmpty()) && !(!b.this.j.isEmpty())) {
                this.b = !b.this.c();
                b.this.n = false;
                return;
            }
            com.facebook.react.modules.core.a.a().a(this);
        }
    }

    public final void a(@NotNull com.dianping.gcmrnmodule.wrapperviews.c cVar, @NotNull String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73bc4655931a8cb20e66495ae7f89e98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73bc4655931a8cb20e66495ae7f89e98");
            return;
        }
        h.b(cVar, "moduleView");
        h.b(str, "reuseId");
        StringBuilder sb = new StringBuilder("setGDM: ");
        sb.append(str);
        sb.append(" to ");
        sb.append(str);
        sb.append(" time:");
        sb.append(System.currentTimeMillis());
        sb.append("view:");
        sb.append(cVar);
        this.l.remove(str);
        this.l.put(str, cVar);
        com.dianping.gcmrnmodule.objects.a aVar = this.k.get(str);
        if (aVar != null) {
            aVar.a(cVar);
            c(aVar);
        } else if (c()) {
        } else {
            this.p.b = true;
            a();
        }
    }

    private void c(@NotNull com.dianping.gcmrnmodule.objects.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94e39d39773e32c3f73588562e083622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94e39d39773e32c3f73588562e083622");
            return;
        }
        h.b(aVar, "delayInput");
        this.o.remove(aVar);
        if (c()) {
            if ((!this.h.isEmpty()) || (!this.i.isEmpty()) || (!this.j.isEmpty())) {
                a(false);
            }
        }
    }

    public final void b(com.dianping.gcmrnmodule.objects.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b9aa5c7bd1120f335ba162fba65e261", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b9aa5c7bd1120f335ba162fba65e261");
        } else if (!c()) {
            this.h.add(aVar);
        } else {
            WritableArray createArray = Arguments.createArray();
            h.a((Object) createArray, "willDisplayViews");
            a(aVar, createArray);
            this.h.remove(aVar);
            for (com.dianping.gcmrnmodule.objects.a aVar2 : this.h) {
                a(aVar2, createArray);
            }
            this.h.clear();
            WritableArray b = b();
            if (createArray.size() <= 0) {
                if ((b != null ? b.size() : 0) <= 0) {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("willDisplay ");
            sb.append(createArray.toString());
            sb.append(" endDisplay: ");
            sb.append(b != null ? b.toString() : null);
            sb.append(" time: ");
            sb.append(System.currentTimeMillis());
            com.dianping.util.h.a("NihaoSpeed", sb.toString());
            a(new com.dianping.gcmrnmodule.wrapperviews.events.i(getId(), createArray, b));
        }
    }

    private final WritableArray b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdd87c8a0085cc0b15d3cfe46b456877", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdd87c8a0085cc0b15d3cfe46b456877");
        }
        WritableArray writableArray = null;
        if (this.j.size() > 0) {
            writableArray = Arguments.createArray();
            for (com.dianping.gcmrnmodule.objects.a aVar : this.j) {
                h.a((Object) writableArray, "didEndDisplayingViews");
                b(aVar, writableArray);
            }
        }
        this.j.clear();
        return writableArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8cdba05fd0f0e15bab22754846daa2f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8cdba05fd0f0e15bab22754846daa2f")).booleanValue() : this.o.size() < this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(boolean z) {
        WritableArray writableArray;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7624f7e25a6663d69d50fcf8663de4af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7624f7e25a6663d69d50fcf8663de4af");
        } else if (z || c()) {
            if (!this.h.isEmpty()) {
                writableArray = Arguments.createArray();
                if (writableArray != null) {
                    for (com.dianping.gcmrnmodule.objects.a aVar : this.h) {
                        a(aVar, writableArray);
                    }
                    this.h.clear();
                }
            } else if (!this.i.isEmpty()) {
                writableArray = Arguments.createArray();
                if (writableArray != null) {
                    for (com.dianping.gcmrnmodule.objects.a aVar2 : this.i) {
                        a(aVar2, writableArray);
                    }
                    this.i.clear();
                }
            } else {
                writableArray = null;
            }
            WritableArray b = b();
            if ((writableArray != null ? writableArray.size() : 0) <= 0) {
                if ((b != null ? b.size() : 0) <= 0) {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("willDisplay ");
            sb.append(writableArray != null ? writableArray.toString() : null);
            sb.append(" endDisplay: ");
            sb.append(b != null ? b.toString() : null);
            sb.append(" time: ");
            sb.append(System.currentTimeMillis());
            com.dianping.util.h.a("NihaoSpeed", sb.toString());
            a(new com.dianping.gcmrnmodule.wrapperviews.events.i(getId(), writableArray, b));
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb239d50a14668d19dbf6e9f08c06100", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb239d50a14668d19dbf6e9f08c06100");
        } else if (this.n) {
        } else {
            this.n = true;
            com.facebook.react.modules.core.a.a().a(this.p);
        }
    }

    public final void a(@NotNull com.dianping.gcmrnmodule.objects.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b760560f762467480aac32976ad5146a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b760560f762467480aac32976ad5146a");
            return;
        }
        h.b(aVar, TensorConfig.KEY_INPUT_ARRAY);
        if (!aVar.e) {
            this.h.remove(aVar);
            this.i.remove(aVar);
            com.dianping.gcmrnmodule.monitor.a performanceMonitor = getPerformanceMonitor();
            if (performanceMonitor != null) {
                performanceMonitor.b(aVar.j);
                return;
            }
            return;
        }
        this.j.add(aVar);
        a();
    }

    private final void a(com.dianping.gcmrnmodule.objects.a aVar, WritableArray writableArray) {
        WritableNativeMap writableNativeMap;
        a.b bVar;
        Object[] objArr = {aVar, writableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd6fb9393dc68e72a395bcb03944c27b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd6fb9393dc68e72a395bcb03944c27b");
        } else if (aVar.e) {
        } else {
            aVar.e = true;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.gcmrnmodule.objects.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "52c14faa5fe0606a93466f532bfd9050", RobustBitConfig.DEFAULT_VALUE)) {
                writableNativeMap = (WritableMap) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "52c14faa5fe0606a93466f532bfd9050");
            } else {
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                if (aVar.g > 0) {
                    writableNativeMap2.putInt("width", aq.b(aVar.k, aVar.g));
                }
                writableNativeMap2.putInt(DMKeys.KEY_GDM_REUSEID, Integer.parseInt(aVar.j));
                writableNativeMap = writableNativeMap2;
            }
            writableArray.pushMap(writableNativeMap);
            com.dianping.gcmrnmodule.monitor.a performanceMonitor = getPerformanceMonitor();
            if (performanceMonitor != null) {
                String str = aVar.j;
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = com.dianping.gcmrnmodule.monitor.a.a;
                if (PatchProxy.isSupport(objArr3, performanceMonitor, changeQuickRedirect3, false, "9fede8acd429aa4211bd1e2a6bfb15f7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, performanceMonitor, changeQuickRedirect3, false, "9fede8acd429aa4211bd1e2a6bfb15f7");
                } else {
                    h.b(str, "reuseId");
                    if (performanceMonitor.d.equals(str) && (bVar = performanceMonitor.b) != null) {
                        bVar.addEvent(performanceMonitor.c, 2);
                    }
                }
            }
            if (aVar.b == null) {
                this.o.add(aVar);
            }
        }
    }

    private final void b(com.dianping.gcmrnmodule.objects.a aVar, WritableArray writableArray) {
        Object[] objArr = {aVar, writableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9cf25b67108373f7131498af48bff3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9cf25b67108373f7131498af48bff3e");
        } else if (aVar.e) {
            aVar.e = false;
            Integer valueOf = Integer.valueOf(aVar.j);
            h.a((Object) valueOf, "Integer.valueOf(appearInput.reuseId)");
            writableArray.pushInt(valueOf.intValue());
            this.o.remove(aVar);
        }
    }
}
