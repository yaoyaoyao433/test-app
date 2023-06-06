package com.dianping.picassomodule.widget.scroll.pager;

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ad;
import android.support.v7.widget.ai;
import android.support.v7.widget.aj;
import android.util.DisplayMetrics;
import android.view.View;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.util.j;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 f2\u00020\u00012\u00020\u0002:\u0002fgB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u00106\u001a\u0002072\u0006\u00108\u001a\u00020 J\b\u00109\u001a\u00020\nH\u0016J\b\u0010:\u001a\u00020\nH\u0016J\u0012\u0010;\u001a\u00020\n2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0012\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020\u0007H\u0016J\u0015\u0010A\u001a\u0002072\u0006\u0010B\u001a\u00020\u0007H\u0000¢\u0006\u0002\bCJ\b\u0010D\u001a\u000207H\u0002J\u0015\u0010E\u001a\u0002072\u0006\u0010F\u001a\u00020\u0007H\u0000¢\u0006\u0002\bGJ\n\u0010H\u001a\u0004\u0018\u00010IH\u0002J\u0012\u0010J\u001a\u0004\u0018\u00010I2\u0006\u0010K\u001a\u00020#H\u0002J\b\u0010L\u001a\u00020=H\u0016J\u0010\u0010M\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u0007H\u0002J\u0012\u0010O\u001a\u00020P2\b\b\u0001\u0010Q\u001a\u00020IH\u0002J\u0010\u0010R\u001a\u0002072\u0006\u0010S\u001a\u00020)H\u0016J \u0010T\u001a\u0002072\b\u0010S\u001a\u0004\u0018\u00010)2\f\u0010U\u001a\b\u0018\u00010VR\u00020)H\u0016J\u001c\u0010W\u001a\u0002072\n\u0010U\u001a\u00060VR\u00020)2\u0006\u0010B\u001a\u00020XH\u0016J\u000e\u0010Y\u001a\u0002072\u0006\u00108\u001a\u00020 J(\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u00072\f\u0010U\u001a\b\u0018\u00010VR\u00020)2\b\u0010B\u001a\u0004\u0018\u00010XH\u0016J\u0010\u0010\\\u001a\u0002072\u0006\u0010N\u001a\u00020\u0007H\u0016J(\u0010]\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u00072\f\u0010U\u001a\b\u0018\u00010VR\u00020)2\b\u0010B\u001a\u0004\u0018\u00010XH\u0016J\u0016\u0010_\u001a\u0002072\u0006\u0010\u0016\u001a\u00020\n2\u0006\u00105\u001a\u00020\u0007J\u000e\u0010`\u001a\u0002072\u0006\u0010a\u001a\u00020%J\u000e\u0010b\u001a\u0002072\u0006\u0010N\u001a\u00020\u0007J\"\u0010c\u001a\u0002072\u0006\u0010*\u001a\u00020)2\b\u0010B\u001a\u0004\u0018\u00010X2\u0006\u0010N\u001a\u00020\u0007H\u0016J\b\u0010d\u001a\u000207H\u0002J\b\u0010e\u001a\u000207H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001e\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010*\u001a\u0004\u0018\u00010)2\b\u0010(\u001a\u0004\u0018\u00010)@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR\u0014\u00101\u001a\u000202X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u000e\u00105\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006h"}, d2 = {"Lcom/dianping/picassomodule/widget/scroll/pager/LoopLayoutManager;", "Landroid/support/v7/widget/LinearLayoutManager;", "Landroid/support/v7/widget/RecyclerView$SmoothScroller$ScrollVectorProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION, "", "(Landroid/content/Context;I)V", "reverseLayout", "", "(Landroid/content/Context;IZ)V", "autoPlayHandler", "Landroid/os/Handler;", "autoPlayRunnable", "Ljava/lang/Runnable;", "currentPageIndex", "getCurrentPageIndex", "()I", "setCurrentPageIndex", "(I)V", "firstLayout", "isAutoPlay", "isVertical", "()Z", "setVertical", "(Z)V", "loop", "getLoop", "setLoop", "onPageChangeListeners", "Ljava/util/ArrayList;", "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "Lkotlin/collections/ArrayList;", "orientationHelper", "Landroid/support/v7/widget/OrientationHelper;", "outerOnPageSelectedListener", "Lcom/dianping/picassomodule/widget/scroll/pager/OnPageSelectedListener;", "pageSelectReason", "Lcom/dianping/picassomodule/widget/scroll/pager/PageSelectReason;", "value", "Landroid/support/v7/widget/RecyclerView;", "recyclerView", "setRecyclerView", "(Landroid/support/v7/widget/RecyclerView;)V", "requestLayout", "scrollEnable", "getScrollEnable", "setScrollEnable", "snapHelper", "Landroid/support/v7/widget/PagerSnapHelper;", "getSnapHelper$shieldComponent_release", "()Landroid/support/v7/widget/PagerSnapHelper;", "timeInterval", "addPageChangeListener", "", "l", "canScrollHorizontally", "canScrollVertically", "checkLayoutParams", "lp", "Landroid/support/v7/widget/RecyclerView$LayoutParams;", "computeScrollVectorForPosition", "Landroid/graphics/PointF;", "targetPosition", "dispatchOnPageScrollStateChanged", "state", "dispatchOnPageScrollStateChanged$shieldComponent_release", "dispatchOnPageScrolled", "dispatchOnPageSelected", "pos", "dispatchOnPageSelected$shieldComponent_release", "findSnapStartView", "Landroid/view/View;", "findStartView", "helper", "generateDefaultLayoutParams", "normalizedPos", "position", "offsetToStart", "Lcom/dianping/picassomodule/widget/scroll/pager/LoopLayoutManager$PositionOffset;", "targetView", "onAttachedToWindow", Constants.EventType.VIEW, "onDetachedFromWindow", "recycler", "Landroid/support/v7/widget/RecyclerView$Recycler;", "onLayoutChildren", "Landroid/support/v7/widget/RecyclerView$State;", "removePageChangeListener", "scrollHorizontallyBy", "dx", "scrollToPosition", "scrollVerticallyBy", "dy", "setAutoPlay", "setPageSelectedListener", "onPageSelectedListener", "setSelectedIndex", "smoothScrollToPosition", "startLoop", "stopLoop", "Companion", "PositionOffset", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LoopLayoutManager extends LinearLayoutManager implements RecyclerView.p.b {
    public static ChangeQuickRedirect a;
    public static final a n = new a(null);
    public int b;
    public boolean c;
    @JvmField
    @Nullable
    public ai d;
    public final ArrayList<ViewPager.OnPageChangeListener> e;
    public com.dianping.picassomodule.widget.scroll.pager.b f;
    public RecyclerView g;
    public com.dianping.picassomodule.widget.scroll.pager.c h;
    public boolean i;
    int j;
    public boolean k;
    public boolean l;
    @NotNull
    final aj m;
    private boolean o;
    private boolean p;
    private final Handler q;
    private final Runnable r;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/dianping/picassomodule/widget/scroll/pager/LoopLayoutManager$PositionOffset;", "", "()V", "positionOffset", "", "getPositionOffset$shieldComponent_release", "()F", "setPositionOffset$shieldComponent_release", "(F)V", "positionOffsetPixels", "", "getPositionOffsetPixels$shieldComponent_release", "()I", "setPositionOffsetPixels$shieldComponent_release", "(I)V", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class b {
        float a;
        int b;
    }

    public static final /* synthetic */ void a(LoopLayoutManager loopLayoutManager) {
        int d2;
        b bVar;
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, loopLayoutManager, changeQuickRedirect, false, "107b3c4740e2842cc0746b487085669d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, loopLayoutManager, changeQuickRedirect, false, "107b3c4740e2842cc0746b487085669d");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        View view = null;
        if (PatchProxy.isSupport(objArr2, loopLayoutManager, changeQuickRedirect2, false, "f5ef2665e01fe0f524cf66576f1444fe", RobustBitConfig.DEFAULT_VALUE)) {
            view = (View) PatchProxy.accessDispatch(objArr2, loopLayoutManager, changeQuickRedirect2, false, "f5ef2665e01fe0f524cf66576f1444fe");
        } else {
            ai a2 = com.dianping.picassomodule.widget.scroll.pager.a.a(loopLayoutManager);
            Object[] objArr3 = {a2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, loopLayoutManager, changeQuickRedirect3, false, "6a1fa73d7a83d0f080b7d1a6c5d1b29f", RobustBitConfig.DEFAULT_VALUE)) {
                view = (View) PatchProxy.accessDispatch(objArr3, loopLayoutManager, changeQuickRedirect3, false, "6a1fa73d7a83d0f080b7d1a6c5d1b29f");
            } else {
                int childCount = loopLayoutManager.getChildCount();
                if (childCount != 0) {
                    int i2 = Integer.MAX_VALUE;
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = loopLayoutManager.getChildAt(i3);
                        int a3 = a2.a(childAt);
                        if (a3 < i2) {
                            view = childAt;
                            i2 = a3;
                        }
                    }
                }
            }
        }
        if (view == null) {
            return;
        }
        int position = loopLayoutManager.getPosition(view);
        Object[] objArr4 = {view};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, loopLayoutManager, changeQuickRedirect4, false, "d93d3f2b4f075e7a7f42b30b2344b6f0", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (b) PatchProxy.accessDispatch(objArr4, loopLayoutManager, changeQuickRedirect4, false, "d93d3f2b4f075e7a7f42b30b2344b6f0");
        } else {
            ai a4 = com.dianping.picassomodule.widget.scroll.pager.a.a(loopLayoutManager);
            int a5 = a4.a(view);
            if (loopLayoutManager.getClipToPadding()) {
                i = a4.b();
                d2 = a4.e();
            } else {
                d2 = a4.d();
            }
            b bVar2 = new b();
            int i4 = i - a5;
            bVar2.a = (i4 * 1.0f) / d2;
            bVar2.b = i4;
            bVar = bVar2;
        }
        Iterator<ViewPager.OnPageChangeListener> it = loopLayoutManager.e.iterator();
        while (it.hasNext()) {
            it.next().onPageScrolled(position, bVar.a, bVar.b);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/dianping/picassomodule/widget/scroll/pager/LoopLayoutManager$Companion;", "", "()V", "END", "", "START", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoopLayoutManager(@NotNull Context context) {
        this(context, 0);
        h.b(context, "context");
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f3325b3cc072477c3cb1b824755b77a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f3325b3cc072477c3cb1b824755b77a");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoopLayoutManager(@NotNull Context context, int i) {
        this(context, i, false);
        h.b(context, "context");
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90f1384defde7ee4542a99dc836c1895", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90f1384defde7ee4542a99dc836c1895");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoopLayoutManager(@NotNull Context context, int i, boolean z) {
        super(context, i, z);
        h.b(context, "context");
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7baf7f115d2393e4d4baf354183fa42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7baf7f115d2393e4d4baf354183fa42");
            return;
        }
        this.e = new ArrayList<>();
        this.p = true;
        this.h = com.dianping.picassomodule.widget.scroll.pager.c.USER_SWIPE;
        this.q = new Handler();
        this.j = -1;
        this.l = true;
        this.r = new c();
        this.m = new f();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/dianping/picassomodule/widget/scroll/pager/LoopLayoutManager$recyclerView$1", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class d extends RecyclerView.k {
        public static ChangeQuickRedirect a;

        public d() {
        }

        @Override // android.support.v7.widget.RecyclerView.k
        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            View a2;
            Object[] objArr = {recyclerView, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1212096233996a8414832a737890f829", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1212096233996a8414832a737890f829");
                return;
            }
            h.b(recyclerView, "recyclerView");
            LoopLayoutManager loopLayoutManager = LoopLayoutManager.this;
            Object[] objArr2 = {loopLayoutManager, recyclerView, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassomodule.widget.scroll.pager.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a979885df72f57fd6b9297432e18f194", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a979885df72f57fd6b9297432e18f194");
                return;
            }
            h.b(loopLayoutManager, "receiver$0");
            h.b(recyclerView, "recyclerView");
            loopLayoutManager.b(i);
            if (i != 0 || loopLayoutManager.getChildCount() <= 0 || (a2 = loopLayoutManager.m.a(loopLayoutManager)) == null) {
                return;
            }
            h.a((Object) a2, "snapHelper.findSnapView(this) ?: return");
            int position = loopLayoutManager.getPosition(a2);
            if (position < 0 || loopLayoutManager.j == position) {
                return;
            }
            loopLayoutManager.j = position;
            loopLayoutManager.a(loopLayoutManager.j);
        }

        @Override // android.support.v7.widget.RecyclerView.k
        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0112bea840675a634b3e5069608fff4b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0112bea840675a634b3e5069608fff4b");
                return;
            }
            h.b(recyclerView, "recyclerView");
            LoopLayoutManager.a(LoopLayoutManager.this);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class c implements Runnable {
        public static ChangeQuickRedirect a;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6ca880c6450d715d4971bfaa5ecc798", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6ca880c6450d715d4971bfaa5ecc798");
            } else if (!LoopLayoutManager.this.c || LoopLayoutManager.this.g == null) {
            } else {
                LoopLayoutManager.this.h = com.dianping.picassomodule.widget.scroll.pager.c.AUTO_PLAY;
                LoopLayoutManager loopLayoutManager = LoopLayoutManager.this;
                RecyclerView recyclerView = LoopLayoutManager.this.g;
                if (recyclerView == null) {
                    h.a();
                }
                loopLayoutManager.smoothScrollToPosition(recyclerView, null, LoopLayoutManager.this.j + 1);
                LoopLayoutManager.this.a();
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(@NotNull RecyclerView recyclerView) {
        RecyclerView recyclerView2;
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4244baaf1fd1b7bb53d362a5621c2271", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4244baaf1fd1b7bb53d362a5621c2271");
            return;
        }
        h.b(recyclerView, Constants.EventType.VIEW);
        super.onAttachedToWindow(recyclerView);
        if (!h.a(this.g, recyclerView)) {
            Object[] objArr2 = {recyclerView};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fedb7492b9a706c980838909f5e7b1e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fedb7492b9a706c980838909f5e7b1e0");
            } else {
                this.g = recyclerView;
                RecyclerView recyclerView3 = this.g;
                if (recyclerView3 != null) {
                    recyclerView3.addOnScrollListener(new d());
                }
            }
        }
        RecyclerView recyclerView4 = this.g;
        if ((recyclerView4 != null ? recyclerView4.getOnFlingListener() : null) != null && (recyclerView2 = this.g) != null) {
            recyclerView2.setOnFlingListener(null);
        }
        this.m.a(recyclerView);
        setAutoMeasureEnabled(true);
        a();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(@Nullable RecyclerView recyclerView, @Nullable RecyclerView.m mVar) {
        Object[] objArr = {recyclerView, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbaa1559341f811e975b76375291f74d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbaa1559341f811e975b76375291f74d");
            return;
        }
        super.onDetachedFromWindow(recyclerView, mVar);
        b();
        this.m.a((RecyclerView) null);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(@NotNull RecyclerView.m mVar, @NotNull RecyclerView.State state) {
        Object[] objArr = {mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc94ae47e5ecb6818c5c671cdff26e21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc94ae47e5ecb6818c5c671cdff26e21");
            return;
        }
        h.b(mVar, "recycler");
        h.b(state, "state");
        super.onLayoutChildren(mVar, state);
        int c2 = state.c();
        int i = this.j;
        int i2 = (i >= 0 && c2 > i) ? this.j : 0;
        if (this.o || this.p) {
            this.j = i2;
        }
        this.o = false;
        if (this.p) {
            this.p = false;
            this.h = com.dianping.picassomodule.widget.scroll.pager.c.INITIAL;
            a(i2);
        }
    }

    private final int c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53c01a500868400abb2c757289d17f5d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53c01a500868400abb2c757289d17f5d")).intValue();
        }
        int itemCount = getItemCount();
        if (com.dianping.picassomodule.widget.scroll.pager.a.b(this)) {
            return i % itemCount;
        }
        return i >= itemCount ? itemCount - 1 : i;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43cd68f0ee562a71dac8a1215d45437d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43cd68f0ee562a71dac8a1215d45437d");
            return;
        }
        this.j = c(i);
        this.o = true;
        super.scrollToPosition(this.j);
        a(this.j);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/dianping/picassomodule/widget/scroll/pager/LoopLayoutManager$smoothScrollToPosition$scroller$1", "Landroid/support/v7/widget/LinearSmoothScroller;", "calculateSpeedPerPixel", "", "displayMetrics", "Landroid/util/DisplayMetrics;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class e extends ad {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ RecyclerView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(RecyclerView recyclerView, Context context) {
            super(context);
            this.c = recyclerView;
        }

        @Override // android.support.v7.widget.ad
        public final float calculateSpeedPerPixel(@NotNull DisplayMetrics displayMetrics) {
            Object[] objArr = {displayMetrics};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0445acc4bd7a3b9bb028eb88268131cd", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0445acc4bd7a3b9bb028eb88268131cd")).floatValue();
            }
            h.b(displayMetrics, "displayMetrics");
            float f = 150.0f / displayMetrics.densityDpi;
            if (LoopLayoutManager.this.k || this.c.getWidth() == 0) {
                return (!LoopLayoutManager.this.k || this.c.getHeight() == 0) ? f : (f * 150.0f) / j.b(this.c.getContext(), this.c.getHeight());
            }
            return (f * 150.0f) / j.b(this.c.getContext(), this.c.getWidth());
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(@NotNull RecyclerView recyclerView, @Nullable RecyclerView.State state, int i) {
        Object[] objArr = {recyclerView, state, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54ac63c33b91991e7a4f1e66c344cee0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54ac63c33b91991e7a4f1e66c344cee0");
            return;
        }
        h.b(recyclerView, "recyclerView");
        e eVar = new e(recyclerView, recyclerView.getContext());
        eVar.setTargetPosition(c(i));
        startSmoothScroll(eVar);
        this.j = eVar.getTargetPosition();
        a(this.j);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.p.b
    @Nullable
    public final PointF computeScrollVectorForPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eadd71f6e91853df6f2175eb2038391c", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eadd71f6e91853df6f2175eb2038391c");
        }
        int itemCount = getItemCount();
        if (getChildCount() == 0 || itemCount == 0) {
            return null;
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            h.a();
        }
        int position = getPosition(childAt);
        if (com.dianping.picassomodule.widget.scroll.pager.a.b(this)) {
            return this.k ? new PointF(0.0f, 1.0f) : new PointF(1.0f, 0.0f);
        }
        int i2 = i < position ? -1 : 1;
        return this.k ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc95c98102781b71cedc71692a578bd9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc95c98102781b71cedc71692a578bd9")).booleanValue() : this.l && !this.k && getItemCount() > 1;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "796fffed331fa8b03e4307600c6821c0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "796fffed331fa8b03e4307600c6821c0")).booleanValue() : this.l && this.k && getItemCount() > 1;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, @Nullable RecyclerView.m mVar, @Nullable RecyclerView.State state) {
        int a2;
        Object[] objArr = {Integer.valueOf(i), mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e9bd735d9391a407b1cdde994cd6231", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e9bd735d9391a407b1cdde994cd6231")).intValue();
        }
        if (i == 0 || this.k || (a2 = com.dianping.picassomodule.widget.scroll.pager.a.a(this, i, this.k, mVar, state)) == 0) {
            return 0;
        }
        offsetChildrenHorizontal(-a2);
        com.dianping.picassomodule.widget.scroll.pager.a.a(this, i, mVar, state);
        return a2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, @Nullable RecyclerView.m mVar, @Nullable RecyclerView.State state) {
        int a2;
        Object[] objArr = {Integer.valueOf(i), mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b272ec4dc474c491ccf727b7050ee670", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b272ec4dc474c491ccf727b7050ee670")).intValue();
        }
        if (i == 0 || !this.k || (a2 = com.dianping.picassomodule.widget.scroll.pager.a.a(this, i, this.k, mVar, state)) == 0) {
            return 0;
        }
        offsetChildrenVertical(-a2);
        com.dianping.picassomodule.widget.scroll.pager.a.a(this, i, mVar, state);
        return a2;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/dianping/picassomodule/widget/scroll/pager/LoopLayoutManager$snapHelper$1", "Landroid/support/v7/widget/PagerSnapHelper;", "findTargetSnapPosition", "", "layoutManager", "Landroid/support/v7/widget/RecyclerView$LayoutManager;", "velocityX", "velocityY", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class f extends aj {
        public static ChangeQuickRedirect b;

        public f() {
        }

        @Override // android.support.v7.widget.aj, android.support.v7.widget.ar
        public final int a(@NotNull RecyclerView.LayoutManager layoutManager, int i, int i2) {
            Object[] objArr = {layoutManager, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02856e6347af1806da2f8882fc53d570", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02856e6347af1806da2f8882fc53d570")).intValue();
            }
            h.b(layoutManager, "layoutManager");
            int itemCount = layoutManager.getItemCount();
            int a = super.a(layoutManager, i, i2);
            if (a < itemCount || !com.dianping.picassomodule.widget.scroll.pager.a.b(LoopLayoutManager.this)) {
                return a;
            }
            return 0;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    @NotNull
    public final RecyclerView.g generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6dab4b76d28024ef85aa8b54789c204", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6dab4b76d28024ef85aa8b54789c204") : new RecyclerView.g(-2, -2);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(@Nullable RecyclerView.g gVar) {
        return gVar instanceof RecyclerView.g;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edb6f082fddb66b3dc5e1cf18f974f0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edb6f082fddb66b3dc5e1cf18f974f0e");
        } else if (this.c) {
            b();
            this.q.postDelayed(this.r, this.b);
        }
    }

    private final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "566cd16dc712354c3f730ba13d0ea498", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "566cd16dc712354c3f730ba13d0ea498");
        } else {
            this.q.removeCallbacks(this.r);
        }
    }

    public final void a(int i) {
        Iterator<ViewPager.OnPageChangeListener> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().onPageSelected(i);
        }
        com.dianping.picassomodule.widget.scroll.pager.b bVar = this.f;
        if (bVar != null) {
            bVar.onPageSelected(i, this.h);
        }
    }

    public final void b(int i) {
        switch (i) {
            case 0:
                this.h = com.dianping.picassomodule.widget.scroll.pager.c.USER_SWIPE;
                a();
                break;
            case 1:
                b();
                break;
        }
        Iterator<ViewPager.OnPageChangeListener> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().onPageScrollStateChanged(i);
        }
    }
}
