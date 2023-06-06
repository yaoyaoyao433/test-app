package com.dianping.gcmrnmodule.objects;

import android.content.Context;
import android.view.View;
import com.dianping.gcmrnmodule.monitor.a;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.cellnode.AttachStatus;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0012\u0010<\u001a\u00020=2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010>\u001a\u00020=H\u0002J\u0013\u0010?\u001a\u00020(2\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010A\u001a\u00020BJ\b\u0010C\u001a\u00020\fH\u0016J\u0016\u0010D\u001a\u00020=2\u0006\u0010E\u001a\u00020\u00192\u0006\u0010F\u001a\u00020GJ\u0012\u0010H\u001a\u00020=2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u001c\u0010-\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001eR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R(\u00101\u001a\u0004\u0018\u0001002\b\u0010\u000f\u001a\u0004\u0018\u000100@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010!\"\u0004\b8\u0010#R\u001c\u00109\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001c\"\u0004\b;\u0010\u001e¨\u0006I"}, d2 = {"Lcom/dianping/gcmrnmodule/objects/MRNModuleViewDelayInput;", "", "reuseId", "", "context", "Landroid/content/Context;", "reuseContainerWrapperView", "Lcom/dianping/gcmrnmodule/wrapperviews/reuse/MRNModuleReuseViewsContainerWrapperView;", "skeletonReusePool", "Lcom/dianping/gcmrnmodule/skeleton/MRNModuleSkeletonViewReusePool;", "(Ljava/lang/String;Landroid/content/Context;Lcom/dianping/gcmrnmodule/wrapperviews/reuse/MRNModuleReuseViewsContainerWrapperView;Lcom/dianping/gcmrnmodule/skeleton/MRNModuleSkeletonViewReusePool;)V", "MIN_WHITE_LIMIT", "", "appearTimeStamp", "", "value", "Lcom/dianping/gcmrnmodule/objects/MrnInputView;", "container", "getContainer", "()Lcom/dianping/gcmrnmodule/objects/MrnInputView;", "setContainer", "(Lcom/dianping/gcmrnmodule/objects/MrnInputView;)V", "getContext", "()Landroid/content/Context;", "currentStatus", "Lcom/dianping/shield/node/cellnode/AttachStatus;", "didEndDisplayCallback", "getDidEndDisplayCallback", "()Ljava/lang/String;", "setDidEndDisplayCallback", "(Ljava/lang/String;)V", DMKeys.KEY_ESTIMATED_HEIGHT, "getEstimatedHeight", "()I", "setEstimatedHeight", "(I)V", "height", "getHeight", "setHeight", "isDisplaying", "", "()Z", "setDisplaying", "(Z)V", "getReuseId", DMKeys.KEY_REUSE_IDENTIFIER, "getReuseIdentifier", "setReuseIdentifier", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleView;", Constants.EventType.VIEW, "getView", "()Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleView;", "setView", "(Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleView;)V", "width", "getWidth", "setWidth", DMKeys.KEY_WILL_DISPLAY_CALLBACK, "getWillDisplayCallback", "setWillDisplayCallback", "addSkeletonView", "", "clearView", "equals", "other", "getNativeMap", "Lcom/facebook/react/bridge/WritableMap;", "hashCode", "onStatusChange", "status", "direction", "Lcom/dianping/shield/entity/ScrollDirection;", "removeSkeletonView", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    @Nullable
    public com.dianping.gcmrnmodule.wrapperviews.c b;
    @Nullable
    public String c;
    @Nullable
    public String d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    @Nullable
    public String i;
    @NotNull
    public final String j;
    @Nullable
    public final Context k;
    private final int l;
    @Nullable
    private e m;
    private AttachStatus n;
    private long o;
    private final com.dianping.gcmrnmodule.wrapperviews.reuse.b p;
    private final com.dianping.gcmrnmodule.skeleton.a q;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "width", "", "height", "oldWidth", "oldHeight", "invoke", "com/dianping/gcmrnmodule/objects/MRNModuleViewDelayInput$view$2$1"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.dianping.gcmrnmodule.objects.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0068a extends i implements kotlin.jvm.functions.d<Integer, Integer, Integer, Integer, r> {
        public static ChangeQuickRedirect a;

        public C0068a() {
            super(4);
        }

        @Override // kotlin.jvm.functions.d
        public final /* synthetic */ r a(Integer num, Integer num2, Integer num3, Integer num4) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            Object[] objArr = {Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(num3.intValue()), Integer.valueOf(num4.intValue())};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20cfcb8d372530f61788cf60719e2a2a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20cfcb8d372530f61788cf60719e2a2a");
            } else {
                com.dianping.gcmrnmodule.wrapperviews.reuse.c cVar = com.dianping.gcmrnmodule.wrapperviews.reuse.c.b;
                cVar.a(String.valueOf(intValue) + " - " + String.valueOf(intValue2), "SizeChange1");
                a.this.g = intValue;
                a.this.f = intValue2;
            }
            return r.a;
        }
    }

    public a(@NotNull String str, @Nullable Context context, @Nullable com.dianping.gcmrnmodule.wrapperviews.reuse.b bVar, @Nullable com.dianping.gcmrnmodule.skeleton.a aVar) {
        h.b(str, "reuseId");
        Object[] objArr = {str, context, bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "167ec97ab5a47b8711d76990a3391850", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "167ec97ab5a47b8711d76990a3391850");
            return;
        }
        this.j = str;
        this.k = context;
        this.p = bVar;
        this.q = aVar;
        this.l = 200;
        this.n = AttachStatus.DETACHED;
        this.o = -1L;
        com.dianping.gcmrnmodule.wrapperviews.reuse.b bVar2 = this.p;
        if (bVar2 != null) {
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.gcmrnmodule.wrapperviews.reuse.b.a;
            if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "ca24dec34061bb7820f994ce40857619", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "ca24dec34061bb7820f994ce40857619");
                return;
            }
            h.b(this, "delayInput");
            String str2 = this.j;
            bVar2.k.put(str2, this);
            com.dianping.gcmrnmodule.wrapperviews.c cVar = bVar2.l.get(str2);
            if (cVar != null) {
                a(cVar);
            }
        }
    }

    public final void a(@Nullable com.dianping.gcmrnmodule.wrapperviews.c cVar) {
        com.dianping.gcmrnmodule.monitor.a performanceMonitor;
        a delayInput;
        com.dianping.gcmrnmodule.wrapperviews.reuse.b bVar;
        com.dianping.gcmrnmodule.monitor.a performanceMonitor2;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4ada83e11132c52da73fc2805ce66db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4ada83e11132c52da73fc2805ce66db");
            return;
        }
        if (cVar != null) {
            if (this.m != null) {
                com.dianping.gcmrnmodule.wrapperviews.reuse.c cVar2 = com.dianping.gcmrnmodule.wrapperviews.reuse.c.b;
                cVar2.a("set rid:" + this.j + " it's view fill container by setView", "Nihao12");
                if ((this.n == AttachStatus.PARTLY_ATTACHED || this.n == AttachStatus.FULLY_ATTACHED) && this.o != -1) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.o > this.l && (bVar = this.p) != null && (performanceMonitor2 = bVar.getPerformanceMonitor()) != null) {
                        performanceMonitor2.a((currentTimeMillis - this.o) - this.l);
                    }
                }
            } else {
                com.dianping.gcmrnmodule.wrapperviews.reuse.c cVar3 = com.dianping.gcmrnmodule.wrapperviews.reuse.c.b;
                cVar3.a("set rid:" + this.j + " it's view but container is null", "Nihao12");
            }
            b(this.m);
            e eVar = this.m;
            if (eVar != null) {
                eVar.a(cVar);
            }
        }
        if (!h.a(cVar, this.b)) {
            com.dianping.gcmrnmodule.wrapperviews.c cVar4 = this.b;
            if (cVar4 != null) {
                cVar4.setDelayInput(null);
            }
            if (cVar != null && (delayInput = cVar.getDelayInput()) != null) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, delayInput, changeQuickRedirect2, false, "cb74a5a855c65e328ee707dcd8f7b390", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, delayInput, changeQuickRedirect2, false, "cb74a5a855c65e328ee707dcd8f7b390");
                } else {
                    delayInput.a((com.dianping.gcmrnmodule.wrapperviews.c) null);
                    delayInput.b(delayInput.m);
                    e eVar2 = delayInput.m;
                    if (eVar2 != null) {
                        eVar2.b();
                    }
                }
            }
            this.b = cVar;
            com.dianping.gcmrnmodule.wrapperviews.c cVar5 = this.b;
            if (cVar5 != null) {
                cVar5.setDelayInput(this);
            }
            com.dianping.gcmrnmodule.wrapperviews.c cVar6 = this.b;
            if (cVar6 != null) {
                cVar6.setOnSizeChangedListener(new C0068a());
                com.dianping.gcmrnmodule.wrapperviews.reuse.c cVar7 = com.dianping.gcmrnmodule.wrapperviews.reuse.c.b;
                cVar7.a(String.valueOf(cVar6.getWidth()) + " - " + String.valueOf(cVar6.getHeight()), "SizeChange2");
                this.g = cVar6.getWidth();
                this.f = cVar6.getHeight();
            }
            if (cVar == null) {
                com.dianping.gcmrnmodule.wrapperviews.reuse.c cVar8 = com.dianping.gcmrnmodule.wrapperviews.reuse.c.b;
                cVar8.a("set rid:" + this.j + " it's view to null", "Nihao12");
            }
            com.dianping.gcmrnmodule.wrapperviews.reuse.b bVar2 = this.p;
            if (bVar2 == null || (performanceMonitor = bVar2.getPerformanceMonitor()) == null) {
                return;
            }
            String str = this.j;
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = com.dianping.gcmrnmodule.monitor.a.a;
            if (PatchProxy.isSupport(objArr3, performanceMonitor, changeQuickRedirect3, false, "9b15e7efed9ef6fa2817e522822b840e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, performanceMonitor, changeQuickRedirect3, false, "9b15e7efed9ef6fa2817e522822b840e");
                return;
            }
            h.b(str, "reuseId");
            if (performanceMonitor.d.equals(str)) {
                a.b bVar3 = performanceMonitor.b;
                if (bVar3 != null) {
                    bVar3.addEvent(performanceMonitor.c, 3);
                }
                a.b bVar4 = performanceMonitor.b;
                if (bVar4 != null) {
                    bVar4.sendEvent(performanceMonitor.c);
                }
                performanceMonitor.b(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r0 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@org.jetbrains.annotations.Nullable com.dianping.gcmrnmodule.objects.e r20) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.gcmrnmodule.objects.a.a(com.dianping.gcmrnmodule.objects.e):void");
    }

    private final void b(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd952dbc2e5fdf5c74e798a88130e1fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd952dbc2e5fdf5c74e798a88130e1fb");
        } else if (eVar != null) {
            View a2 = eVar.a();
            com.dianping.gcmrnmodule.skeleton.a aVar = this.q;
            if (aVar != null) {
                aVar.a(this.i, a2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0105, code lost:
        if (r0 == null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@org.jetbrains.annotations.NotNull com.dianping.shield.node.cellnode.AttachStatus r22, @org.jetbrains.annotations.NotNull com.dianping.shield.entity.ScrollDirection r23) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.gcmrnmodule.objects.a.a(com.dianping.shield.node.cellnode.AttachStatus, com.dianping.shield.entity.ScrollDirection):void");
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bf05d75a9493f5a69bb67025a88a818", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bf05d75a9493f5a69bb67025a88a818")).intValue() : this.j.hashCode();
    }

    public final boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15f4d7d411559ffad20245f4f7cdddac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15f4d7d411559ffad20245f4f7cdddac")).booleanValue();
        }
        if (obj instanceof a) {
            return h.a((Object) this.j, (Object) ((a) obj).j);
        }
        return false;
    }
}
