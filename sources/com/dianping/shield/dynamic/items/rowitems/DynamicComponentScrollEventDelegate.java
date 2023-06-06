package com.dianping.shield.dynamic.items.rowitems;

import android.view.View;
import com.dianping.shield.component.entity.ScrollEventBean;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.dianping.shield.component.utils.ScrollDispatchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0002\u000b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010#\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010$\u001a\u00020\u0011H\u0016J\b\u0010%\u001a\u00020\u0017H\u0016J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020'H\u0016J\b\u0010)\u001a\u00020'H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/dianping/shield/dynamic/items/rowitems/DynamicComponentScrollEventDelegate;", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IEventDispatcherProvider;", "()V", "contentOffsetListener", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$OnContentOffsetChangeListener;", "getContentOffsetListener", "()Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$OnContentOffsetChangeListener;", "setContentOffsetListener", "(Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$OnContentOffsetChangeListener;)V", "innerContentOffsetListener", "innerOnDragStatusListener", "com/dianping/shield/dynamic/items/rowitems/DynamicComponentScrollEventDelegate$innerOnDragStatusListener$1", "Lcom/dianping/shield/dynamic/items/rowitems/DynamicComponentScrollEventDelegate$innerOnDragStatusListener$1;", "innerOnMomentumScrollListener", "com/dianping/shield/dynamic/items/rowitems/DynamicComponentScrollEventDelegate$innerOnMomentumScrollListener$1", "Lcom/dianping/shield/dynamic/items/rowitems/DynamicComponentScrollEventDelegate$innerOnMomentumScrollListener$1;", "onDragStatusListener", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$OnDragStateChangeListener;", "getOnDragStatusListener", "()Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$OnDragStateChangeListener;", "setOnDragStatusListener", "(Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$OnDragStateChangeListener;)V", "onMomentumScrollListener", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$OnMomentumScrollListener;", "getOnMomentumScrollListener", "()Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$OnMomentumScrollListener;", "setOnMomentumScrollListener", "(Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$OnMomentumScrollListener;)V", "scrollDispatchHelper", "Lcom/dianping/shield/component/utils/ScrollDispatchHelper;", "getScrollDispatchHelper", "()Lcom/dianping/shield/component/utils/ScrollDispatchHelper;", "xOffset", "", "yOffset", "getContentOffsetDispatcher", "getDragStateChangeDispatcher", "getMomentumScrollDispatcher", "needDragEvent", "", "needMomentumEvent", "needScrollEvent", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicComponentScrollEventDelegate implements ComponentScrollEventHelper.IEventDispatcherProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private ComponentScrollEventHelper.OnContentOffsetChangeListener contentOffsetListener;
    private final ComponentScrollEventHelper.OnContentOffsetChangeListener innerContentOffsetListener;
    private final DynamicComponentScrollEventDelegate$innerOnDragStatusListener$1 innerOnDragStatusListener;
    private final DynamicComponentScrollEventDelegate$innerOnMomentumScrollListener$1 innerOnMomentumScrollListener;
    @Nullable
    private ComponentScrollEventHelper.OnDragStateChangeListener onDragStatusListener;
    @Nullable
    private ComponentScrollEventHelper.OnMomentumScrollListener onMomentumScrollListener;
    @NotNull
    private final ScrollDispatchHelper scrollDispatchHelper;
    private int xOffset;
    private int yOffset;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.dianping.shield.dynamic.items.rowitems.DynamicComponentScrollEventDelegate$innerOnDragStatusListener$1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.dianping.shield.dynamic.items.rowitems.DynamicComponentScrollEventDelegate$innerOnMomentumScrollListener$1] */
    public DynamicComponentScrollEventDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80d00255332d4d4fd77d5bf26633dc18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80d00255332d4d4fd77d5bf26633dc18");
            return;
        }
        this.scrollDispatchHelper = new ScrollDispatchHelper();
        this.innerContentOffsetListener = new ComponentScrollEventHelper.OnContentOffsetChangeListener() { // from class: com.dianping.shield.dynamic.items.rowitems.DynamicComponentScrollEventDelegate$innerContentOffsetListener$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.OnContentOffsetChangeListener
            public final void offsetChanged(@Nullable View view, @NotNull ScrollEventBean scrollEventBean, boolean z) {
                int i;
                int i2;
                Object[] objArr2 = {view, scrollEventBean, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f95816cb4dede78f391b3c8290460c7c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f95816cb4dede78f391b3c8290460c7c");
                    return;
                }
                h.b(scrollEventBean, "scrollEventBean");
                DynamicComponentScrollEventDelegate.this.xOffset = scrollEventBean.getScrollX();
                DynamicComponentScrollEventDelegate.this.yOffset = scrollEventBean.getScrollY();
                ScrollDispatchHelper scrollDispatchHelper = DynamicComponentScrollEventDelegate.this.getScrollDispatchHelper();
                i = DynamicComponentScrollEventDelegate.this.xOffset;
                i2 = DynamicComponentScrollEventDelegate.this.yOffset;
                if (scrollDispatchHelper.onScrollChanged(i, i2, z)) {
                    scrollEventBean.setXVelocity(DynamicComponentScrollEventDelegate.this.getScrollDispatchHelper().getXFlingVelocity());
                    scrollEventBean.setYVelocity(DynamicComponentScrollEventDelegate.this.getScrollDispatchHelper().getYFlingVelocity());
                    ComponentScrollEventHelper.OnContentOffsetChangeListener contentOffsetListener = DynamicComponentScrollEventDelegate.this.getContentOffsetListener();
                    if (contentOffsetListener != null) {
                        contentOffsetListener.offsetChanged(view, scrollEventBean, z);
                    }
                }
            }
        };
        this.innerOnDragStatusListener = new ComponentScrollEventHelper.OnDragStateChangeListener() { // from class: com.dianping.shield.dynamic.items.rowitems.DynamicComponentScrollEventDelegate$innerOnDragStatusListener$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.OnDragStateChangeListener
            public final void onBeginDrag(@Nullable View view, @NotNull ScrollEventBean scrollEventBean) {
                int i;
                int i2;
                Object[] objArr2 = {view, scrollEventBean};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c77294a50fb4abb2853c4c85614be4e0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c77294a50fb4abb2853c4c85614be4e0");
                    return;
                }
                h.b(scrollEventBean, "scrollEventBean");
                if (scrollEventBean.getScrollX() > 0) {
                    DynamicComponentScrollEventDelegate.this.xOffset = scrollEventBean.getScrollX();
                } else {
                    i = DynamicComponentScrollEventDelegate.this.xOffset;
                    scrollEventBean.setScrollX(i);
                }
                if (scrollEventBean.getScrollY() > 0) {
                    DynamicComponentScrollEventDelegate.this.yOffset = scrollEventBean.getScrollY();
                } else {
                    i2 = DynamicComponentScrollEventDelegate.this.yOffset;
                    scrollEventBean.setScrollY(i2);
                }
                ComponentScrollEventHelper.OnDragStateChangeListener onDragStatusListener = DynamicComponentScrollEventDelegate.this.getOnDragStatusListener();
                if (onDragStatusListener != null) {
                    onDragStatusListener.onBeginDrag(view, scrollEventBean);
                }
                ComponentScrollEventHelper.OnContentOffsetChangeListener contentOffsetListener = DynamicComponentScrollEventDelegate.this.getContentOffsetListener();
                if (contentOffsetListener != null) {
                    contentOffsetListener.offsetChanged(view, scrollEventBean, true);
                }
            }

            @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.OnDragStateChangeListener
            public final void onEndDrag(@Nullable View view, @NotNull ScrollEventBean scrollEventBean) {
                int i;
                int i2;
                Object[] objArr2 = {view, scrollEventBean};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "62eaa3ba33e6c227ae32af182f1683f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "62eaa3ba33e6c227ae32af182f1683f4");
                    return;
                }
                h.b(scrollEventBean, "scrollEventBean");
                i = DynamicComponentScrollEventDelegate.this.xOffset;
                scrollEventBean.setScrollX(i);
                i2 = DynamicComponentScrollEventDelegate.this.yOffset;
                scrollEventBean.setScrollY(i2);
                ComponentScrollEventHelper.OnDragStateChangeListener onDragStatusListener = DynamicComponentScrollEventDelegate.this.getOnDragStatusListener();
                if (onDragStatusListener != null) {
                    onDragStatusListener.onEndDrag(view, scrollEventBean);
                }
            }
        };
        this.innerOnMomentumScrollListener = new ComponentScrollEventHelper.OnMomentumScrollListener() { // from class: com.dianping.shield.dynamic.items.rowitems.DynamicComponentScrollEventDelegate$innerOnMomentumScrollListener$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.OnMomentumScrollListener
            public final void onMomentumBegin(@Nullable View view, @NotNull ScrollEventBean scrollEventBean) {
                int i;
                int i2;
                Object[] objArr2 = {view, scrollEventBean};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2982267eeab476fff3d7d2a6081021c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2982267eeab476fff3d7d2a6081021c5");
                    return;
                }
                h.b(scrollEventBean, "scrollEventBean");
                i = DynamicComponentScrollEventDelegate.this.xOffset;
                scrollEventBean.setScrollX(i);
                i2 = DynamicComponentScrollEventDelegate.this.yOffset;
                scrollEventBean.setScrollY(i2);
                ComponentScrollEventHelper.OnMomentumScrollListener onMomentumScrollListener = DynamicComponentScrollEventDelegate.this.getOnMomentumScrollListener();
                if (onMomentumScrollListener != null) {
                    onMomentumScrollListener.onMomentumBegin(view, scrollEventBean);
                }
            }

            @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.OnMomentumScrollListener
            public final void onMomentumEnd(@Nullable View view, @NotNull ScrollEventBean scrollEventBean) {
                int i;
                int i2;
                Object[] objArr2 = {view, scrollEventBean};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7c2b26b18153f710b78e69a65810a6a1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7c2b26b18153f710b78e69a65810a6a1");
                    return;
                }
                h.b(scrollEventBean, "scrollEventBean");
                i = DynamicComponentScrollEventDelegate.this.xOffset;
                scrollEventBean.setScrollX(i);
                i2 = DynamicComponentScrollEventDelegate.this.yOffset;
                scrollEventBean.setScrollY(i2);
                ComponentScrollEventHelper.OnContentOffsetChangeListener contentOffsetListener = DynamicComponentScrollEventDelegate.this.getContentOffsetListener();
                if (contentOffsetListener != null) {
                    contentOffsetListener.offsetChanged(view, scrollEventBean, true);
                }
                ComponentScrollEventHelper.OnMomentumScrollListener onMomentumScrollListener = DynamicComponentScrollEventDelegate.this.getOnMomentumScrollListener();
                if (onMomentumScrollListener != null) {
                    onMomentumScrollListener.onMomentumEnd(view, scrollEventBean);
                }
            }
        };
    }

    @Nullable
    public final ComponentScrollEventHelper.OnContentOffsetChangeListener getContentOffsetListener() {
        return this.contentOffsetListener;
    }

    public final void setContentOffsetListener(@Nullable ComponentScrollEventHelper.OnContentOffsetChangeListener onContentOffsetChangeListener) {
        this.contentOffsetListener = onContentOffsetChangeListener;
    }

    @Nullable
    public final ComponentScrollEventHelper.OnDragStateChangeListener getOnDragStatusListener() {
        return this.onDragStatusListener;
    }

    public final void setOnDragStatusListener(@Nullable ComponentScrollEventHelper.OnDragStateChangeListener onDragStateChangeListener) {
        this.onDragStatusListener = onDragStateChangeListener;
    }

    @Nullable
    public final ComponentScrollEventHelper.OnMomentumScrollListener getOnMomentumScrollListener() {
        return this.onMomentumScrollListener;
    }

    public final void setOnMomentumScrollListener(@Nullable ComponentScrollEventHelper.OnMomentumScrollListener onMomentumScrollListener) {
        this.onMomentumScrollListener = onMomentumScrollListener;
    }

    @NotNull
    public final ScrollDispatchHelper getScrollDispatchHelper() {
        return this.scrollDispatchHelper;
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IEventDispatcherProvider
    @Nullable
    public final ComponentScrollEventHelper.OnContentOffsetChangeListener getContentOffsetDispatcher() {
        return this.innerContentOffsetListener;
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IEventDispatcherProvider
    @NotNull
    public final ComponentScrollEventHelper.OnDragStateChangeListener getDragStateChangeDispatcher() {
        return this.innerOnDragStatusListener;
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IEventDispatcherProvider
    @NotNull
    public final ComponentScrollEventHelper.OnMomentumScrollListener getMomentumScrollDispatcher() {
        return this.innerOnMomentumScrollListener;
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IEventDispatcherProvider
    public final boolean needScrollEvent() {
        return this.contentOffsetListener != null;
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IEventDispatcherProvider
    public final boolean needDragEvent() {
        return this.onDragStatusListener != null;
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IEventDispatcherProvider
    public final boolean needMomentumEvent() {
        return this.onMomentumScrollListener != null;
    }
}
