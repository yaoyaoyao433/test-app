package com.dianping.shield.component.utils;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.ViewCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.dianping.shield.component.entity.ScrollEventBean;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.dianping.shield.component.widgets.VelocityHelper;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0005789:;B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0002J\u0006\u0010(\u001a\u00020$J\u0016\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012J\u000e\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020$2\u0006\u0010,\u001a\u00020-J\u0016\u0010/\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012J\u0006\u00100\u001a\u00020\u0015J\u0006\u00101\u001a\u00020\u0015J\u0006\u00102\u001a\u00020\u0015J\u000e\u00103\u001a\u00020$2\u0006\u00104\u001a\u00020\u0012J\u000e\u00105\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u0005J\u000e\u00106\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/dianping/shield/component/utils/ComponentScrollEventHelper;", "", "context", "Landroid/content/Context;", "componentView", "Landroid/view/View;", "componentRange", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IScrollRange;", "(Landroid/content/Context;Landroid/view/View;Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IScrollRange;)V", "MOMENTUM_DELAY", "", "getComponentView", "()Landroid/view/View;", "setComponentView", "(Landroid/view/View;)V", "getContext", "()Landroid/content/Context;", "currentOffsetToAnchor", "", "Ljava/lang/Integer;", "doneFling", "", "eventDispatcher", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IEventDispatcherProvider;", "getEventDispatcher", "()Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IEventDispatcherProvider;", "setEventDispatcher", "(Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IEventDispatcherProvider;)V", "fling", "gestureDetectorCompat", "Landroid/support/v4/view/GestureDetectorCompat;", "isDragging", "mVelocityHelper", "Lcom/dianping/shield/component/widgets/VelocityHelper;", "postEventView", "dispatchMomentumScrollEvent", "", "velocityX", "", "velocityY", "handleBeginDrag", Constants.GestureMoveEvent.KEY_X, Constants.GestureMoveEvent.KEY_Y, "handleEndDragByTouchEvent", "e", "Landroid/view/MotionEvent;", "handleMomentumScrollAndDragEndByEvent", "handleScrollEvent", "needDragEvent", "needMomentumEvent", "needScrollEvent", "setOffsetToAnchor", "offsetToAnchor", "setPostEventView", "updateComponentView", "IEventDispatcherProvider", "IScrollRange", "OnContentOffsetChangeListener", "OnDragStateChangeListener", "OnMomentumScrollListener", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ComponentScrollEventHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final long MOMENTUM_DELAY;
    private final IScrollRange componentRange;
    @NotNull
    private View componentView;
    @NotNull
    private final Context context;
    private Integer currentOffsetToAnchor;
    private boolean doneFling;
    @Nullable
    private IEventDispatcherProvider eventDispatcher;
    private boolean fling;
    private final GestureDetectorCompat gestureDetectorCompat;
    private boolean isDragging;
    private final VelocityHelper mVelocityHelper;
    private View postEventView;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IEventDispatcherProvider;", "", "getContentOffsetDispatcher", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$OnContentOffsetChangeListener;", "getDragStateChangeDispatcher", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$OnDragStateChangeListener;", "getMomentumScrollDispatcher", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$OnMomentumScrollListener;", "needDragEvent", "", "needMomentumEvent", "needScrollEvent", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public interface IEventDispatcherProvider {
        @Nullable
        OnContentOffsetChangeListener getContentOffsetDispatcher();

        @Nullable
        OnDragStateChangeListener getDragStateChangeDispatcher();

        @Nullable
        OnMomentumScrollListener getMomentumScrollDispatcher();

        boolean needDragEvent();

        boolean needMomentumEvent();

        boolean needScrollEvent();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IScrollRange;", "", "getTotalHorizontalScrollRange", "", "getTotalVerticalScrollRange", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public interface IScrollRange {
        int getTotalHorizontalScrollRange();

        int getTotalVerticalScrollRange();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$OnContentOffsetChangeListener;", "", "offsetChanged", "", Constants.EventType.VIEW, "Landroid/view/View;", "scrollEventBean", "Lcom/dianping/shield/component/entity/ScrollEventBean;", "shouldDispatchDirectly", "", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public interface OnContentOffsetChangeListener {
        void offsetChanged(@Nullable View view, @NotNull ScrollEventBean scrollEventBean, boolean z);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$OnDragStateChangeListener;", "", "onBeginDrag", "", Constants.EventType.VIEW, "Landroid/view/View;", "scrollEventBean", "Lcom/dianping/shield/component/entity/ScrollEventBean;", "onEndDrag", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public interface OnDragStateChangeListener {
        void onBeginDrag(@Nullable View view, @NotNull ScrollEventBean scrollEventBean);

        void onEndDrag(@Nullable View view, @NotNull ScrollEventBean scrollEventBean);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$OnMomentumScrollListener;", "", "onMomentumBegin", "", Constants.EventType.VIEW, "Landroid/view/View;", "scrollEventBean", "Lcom/dianping/shield/component/entity/ScrollEventBean;", "onMomentumEnd", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public interface OnMomentumScrollListener {
        void onMomentumBegin(@Nullable View view, @NotNull ScrollEventBean scrollEventBean);

        void onMomentumEnd(@Nullable View view, @NotNull ScrollEventBean scrollEventBean);
    }

    public ComponentScrollEventHelper(@NotNull Context context, @NotNull View view, @NotNull IScrollRange iScrollRange) {
        h.b(context, "context");
        h.b(view, "componentView");
        h.b(iScrollRange, "componentRange");
        Object[] objArr = {context, view, iScrollRange};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ae9a0d2ae46b41a094912a3863502f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ae9a0d2ae46b41a094912a3863502f1");
            return;
        }
        this.context = context;
        this.componentView = view;
        this.componentRange = iScrollRange;
        this.mVelocityHelper = new VelocityHelper();
        this.MOMENTUM_DELAY = 20L;
        this.postEventView = this.componentView;
        this.gestureDetectorCompat = new GestureDetectorCompat(this.context, new GestureDetector.OnGestureListener() { // from class: com.dianping.shield.component.utils.ComponentScrollEventHelper$gestureDetectorCompat$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(@Nullable MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(@Nullable MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(@Nullable MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(@NotNull MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "80086ed569e254dfef1ccee2e4a77ef5", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "80086ed569e254dfef1ccee2e4a77ef5")).booleanValue();
                }
                h.b(motionEvent, "e");
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f, float f2) {
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7ca3b78e4180133af4a683d045822386", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7ca3b78e4180133af4a683d045822386")).booleanValue();
                }
                ComponentScrollEventHelper.this.dispatchMomentumScrollEvent(f / 1000.0f, f2 / 1000.0f);
                return false;
            }
        });
    }

    @NotNull
    public final View getComponentView() {
        return this.componentView;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final void setComponentView(@NotNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b06b5926a4e1d4d9a459941be0a01859", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b06b5926a4e1d4d9a459941be0a01859");
            return;
        }
        h.b(view, "<set-?>");
        this.componentView = view;
    }

    @Nullable
    public final IEventDispatcherProvider getEventDispatcher() {
        return this.eventDispatcher;
    }

    public final void setEventDispatcher(@Nullable IEventDispatcherProvider iEventDispatcherProvider) {
        this.eventDispatcher = iEventDispatcherProvider;
    }

    public final void setOffsetToAnchor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb3ad6f88d15a85e90e22dcadcb6e4b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb3ad6f88d15a85e90e22dcadcb6e4b4");
        } else {
            this.currentOffsetToAnchor = Integer.valueOf(i);
        }
    }

    public final void handleBeginDrag() {
        OnDragStateChangeListener dragStateChangeDispatcher;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b92833e332ea0f718512e8cf54498b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b92833e332ea0f718512e8cf54498b0");
            return;
        }
        this.isDragging = true;
        ScrollEventBean scrollEventBean = new ScrollEventBean();
        scrollEventBean.setScrollViewHeight(this.componentView.getHeight());
        scrollEventBean.setScrollViewWidth(this.componentView.getWidth());
        scrollEventBean.setContentWidth(this.componentRange.getTotalHorizontalScrollRange());
        scrollEventBean.setContentHeight(this.componentRange.getTotalVerticalScrollRange());
        Integer num = this.currentOffsetToAnchor;
        if (num != null) {
            scrollEventBean.setOffsetToAnchor(Integer.valueOf(num.intValue()));
        }
        IEventDispatcherProvider iEventDispatcherProvider = this.eventDispatcher;
        if (iEventDispatcherProvider == null || (dragStateChangeDispatcher = iEventDispatcherProvider.getDragStateChangeDispatcher()) == null) {
            return;
        }
        dragStateChangeDispatcher.onBeginDrag(this.componentView, scrollEventBean);
    }

    public final void handleBeginDrag(int i, int i2) {
        OnDragStateChangeListener dragStateChangeDispatcher;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01f341c1bd7061ba20d00de4afe160de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01f341c1bd7061ba20d00de4afe160de");
            return;
        }
        this.isDragging = true;
        ScrollEventBean scrollEventBean = new ScrollEventBean();
        scrollEventBean.setScrollX(i);
        scrollEventBean.setScrollY(i2);
        scrollEventBean.setScrollViewHeight(this.componentView.getHeight());
        scrollEventBean.setScrollViewWidth(this.componentView.getWidth());
        scrollEventBean.setContentWidth(this.componentRange.getTotalHorizontalScrollRange());
        scrollEventBean.setContentHeight(this.componentRange.getTotalVerticalScrollRange());
        Integer num = this.currentOffsetToAnchor;
        if (num != null) {
            scrollEventBean.setOffsetToAnchor(Integer.valueOf(num.intValue()));
        }
        IEventDispatcherProvider iEventDispatcherProvider = this.eventDispatcher;
        if (iEventDispatcherProvider == null || (dragStateChangeDispatcher = iEventDispatcherProvider.getDragStateChangeDispatcher()) == null) {
            return;
        }
        dragStateChangeDispatcher.onBeginDrag(this.componentView, scrollEventBean);
    }

    public final void handleEndDragByTouchEvent(@NotNull MotionEvent motionEvent) {
        OnDragStateChangeListener dragStateChangeDispatcher;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5609a8ec7649c89721ad871ec54b1b49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5609a8ec7649c89721ad871ec54b1b49");
            return;
        }
        h.b(motionEvent, "e");
        if ((motionEvent.getAction() & 255) == 1 && this.isDragging) {
            this.mVelocityHelper.calculateVelocity(motionEvent);
            ScrollEventBean scrollEventBean = new ScrollEventBean();
            scrollEventBean.setScrollViewHeight(this.componentView.getHeight());
            scrollEventBean.setScrollViewWidth(this.componentView.getWidth());
            scrollEventBean.setContentHeight(this.componentRange.getTotalVerticalScrollRange());
            scrollEventBean.setContentWidth(this.componentRange.getTotalHorizontalScrollRange());
            scrollEventBean.setXVelocity(this.mVelocityHelper.getXVelocity());
            scrollEventBean.setYVelocity(this.mVelocityHelper.getYVelocity());
            Integer num = this.currentOffsetToAnchor;
            if (num != null) {
                scrollEventBean.setOffsetToAnchor(Integer.valueOf(num.intValue()));
            }
            IEventDispatcherProvider iEventDispatcherProvider = this.eventDispatcher;
            if (iEventDispatcherProvider != null && (dragStateChangeDispatcher = iEventDispatcherProvider.getDragStateChangeDispatcher()) != null) {
                dragStateChangeDispatcher.onEndDrag(this.componentView, scrollEventBean);
            }
            this.isDragging = false;
        }
    }

    public final void handleScrollEvent(int i, int i2) {
        OnContentOffsetChangeListener contentOffsetDispatcher;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60ad53fb57ebe1dfaec0a8ca0379a341", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60ad53fb57ebe1dfaec0a8ca0379a341");
            return;
        }
        if (this.fling) {
            this.doneFling = false;
        }
        ScrollEventBean scrollEventBean = new ScrollEventBean();
        scrollEventBean.setScrollX(i);
        scrollEventBean.setScrollY(i2);
        scrollEventBean.setScrollViewHeight(this.componentView.getHeight());
        scrollEventBean.setScrollViewWidth(this.componentView.getWidth());
        scrollEventBean.setContentWidth(this.componentRange.getTotalHorizontalScrollRange());
        scrollEventBean.setContentHeight(this.componentRange.getTotalVerticalScrollRange());
        Integer num = this.currentOffsetToAnchor;
        if (num != null) {
            scrollEventBean.setOffsetToAnchor(Integer.valueOf(num.intValue()));
        }
        IEventDispatcherProvider iEventDispatcherProvider = this.eventDispatcher;
        if (iEventDispatcherProvider == null || (contentOffsetDispatcher = iEventDispatcherProvider.getContentOffsetDispatcher()) == null) {
            return;
        }
        contentOffsetDispatcher.offsetChanged(this.componentView, scrollEventBean, false);
    }

    public final void handleMomentumScrollAndDragEndByEvent(@NotNull MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "239084005dd20ca041a901273b13858d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "239084005dd20ca041a901273b13858d");
            return;
        }
        h.b(motionEvent, "e");
        this.gestureDetectorCompat.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchMomentumScrollEvent(final float f, final float f2) {
        OnMomentumScrollListener momentumScrollDispatcher;
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ec36f6d2a975faceb747e35e18f6b74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ec36f6d2a975faceb747e35e18f6b74");
            return;
        }
        this.fling = true;
        ScrollEventBean scrollEventBean = new ScrollEventBean();
        scrollEventBean.setXVelocity(f);
        scrollEventBean.setYVelocity(f2);
        scrollEventBean.setScrollViewHeight(this.componentView.getHeight());
        scrollEventBean.setScrollViewWidth(this.componentView.getWidth());
        scrollEventBean.setContentHeight(this.componentRange.getTotalVerticalScrollRange());
        scrollEventBean.setContentWidth(this.componentRange.getTotalHorizontalScrollRange());
        Integer num = this.currentOffsetToAnchor;
        if (num != null) {
            scrollEventBean.setOffsetToAnchor(Integer.valueOf(num.intValue()));
        }
        IEventDispatcherProvider iEventDispatcherProvider = this.eventDispatcher;
        if (iEventDispatcherProvider != null && (momentumScrollDispatcher = iEventDispatcherProvider.getMomentumScrollDispatcher()) != null) {
            momentumScrollDispatcher.onMomentumBegin(this.componentView, scrollEventBean);
        }
        ViewCompat.postOnAnimationDelayed(this.postEventView, new Runnable() { // from class: com.dianping.shield.component.utils.ComponentScrollEventHelper$dispatchMomentumScrollEvent$r$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                View view;
                long j;
                ComponentScrollEventHelper.IScrollRange iScrollRange;
                ComponentScrollEventHelper.IScrollRange iScrollRange2;
                Integer num2;
                ComponentScrollEventHelper.OnMomentumScrollListener momentumScrollDispatcher2;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8e38640294fd3037b10c561bca243e49", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8e38640294fd3037b10c561bca243e49");
                    return;
                }
                z = ComponentScrollEventHelper.this.doneFling;
                if (z) {
                    ComponentScrollEventHelper.this.fling = false;
                    ScrollEventBean scrollEventBean2 = new ScrollEventBean();
                    scrollEventBean2.setXVelocity(f);
                    scrollEventBean2.setYVelocity(f2);
                    scrollEventBean2.setScrollViewHeight(ComponentScrollEventHelper.this.getComponentView().getHeight());
                    scrollEventBean2.setScrollViewWidth(ComponentScrollEventHelper.this.getComponentView().getWidth());
                    iScrollRange = ComponentScrollEventHelper.this.componentRange;
                    scrollEventBean2.setContentHeight(iScrollRange.getTotalVerticalScrollRange());
                    iScrollRange2 = ComponentScrollEventHelper.this.componentRange;
                    scrollEventBean2.setContentWidth(iScrollRange2.getTotalHorizontalScrollRange());
                    num2 = ComponentScrollEventHelper.this.currentOffsetToAnchor;
                    if (num2 != null) {
                        scrollEventBean2.setOffsetToAnchor(Integer.valueOf(num2.intValue()));
                    }
                    ComponentScrollEventHelper.IEventDispatcherProvider eventDispatcher = ComponentScrollEventHelper.this.getEventDispatcher();
                    if (eventDispatcher == null || (momentumScrollDispatcher2 = eventDispatcher.getMomentumScrollDispatcher()) == null) {
                        return;
                    }
                    momentumScrollDispatcher2.onMomentumEnd(ComponentScrollEventHelper.this.getComponentView(), scrollEventBean2);
                    return;
                }
                ComponentScrollEventHelper.this.doneFling = true;
                view = ComponentScrollEventHelper.this.postEventView;
                j = ComponentScrollEventHelper.this.MOMENTUM_DELAY;
                ViewCompat.postOnAnimationDelayed(view, this, j);
            }
        }, this.MOMENTUM_DELAY);
    }

    public final void setPostEventView(@NotNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e6121bab77d5c65e6e069975d94eaf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e6121bab77d5c65e6e069975d94eaf5");
            return;
        }
        h.b(view, "postEventView");
        this.postEventView = view;
    }

    public final void updateComponentView(@NotNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e61250ad73791e71aadc8ebd79e06b84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e61250ad73791e71aadc8ebd79e06b84");
            return;
        }
        h.b(view, "componentView");
        this.componentView = view;
    }

    public final boolean needScrollEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5689b026590ca2f5aca7fc6683ed58f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5689b026590ca2f5aca7fc6683ed58f9")).booleanValue();
        }
        IEventDispatcherProvider iEventDispatcherProvider = this.eventDispatcher;
        if (iEventDispatcherProvider != null) {
            return iEventDispatcherProvider.needScrollEvent();
        }
        return false;
    }

    public final boolean needDragEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac0c2b8d020c9a90abd3f9a9d79dfd06", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac0c2b8d020c9a90abd3f9a9d79dfd06")).booleanValue();
        }
        IEventDispatcherProvider iEventDispatcherProvider = this.eventDispatcher;
        if (iEventDispatcherProvider != null) {
            return iEventDispatcherProvider.needDragEvent();
        }
        return false;
    }

    public final boolean needMomentumEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc07c06687a7f365c8dcdf2036484e8f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc07c06687a7f365c8dcdf2036484e8f")).booleanValue();
        }
        IEventDispatcherProvider iEventDispatcherProvider = this.eventDispatcher;
        if (iEventDispatcherProvider != null) {
            return iEventDispatcherProvider.needMomentumEvent();
        }
        return false;
    }
}
