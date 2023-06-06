package com.dianping.shield.component.extensions.common;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR(\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/dianping/shield/component/extensions/common/CommonBgMaskFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "containerView", "Landroid/view/View;", "backgroundViewContainer", "(Landroid/content/Context;Landroid/view/View;Landroid/widget/FrameLayout;)V", "getContainerView", "()Landroid/view/View;", "value", "maskView", "getMaskView", "setMaskView", "(Landroid/view/View;)V", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "removeMaskView", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class CommonBgMaskFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap _$_findViewCache;
    private final FrameLayout backgroundViewContainer;
    @NotNull
    private final View containerView;
    @Nullable
    private View maskView;

    public final void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    @NotNull
    public final View getContainerView() {
        return this.containerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonBgMaskFrameLayout(@Nullable Context context, @NotNull View view, @NotNull FrameLayout frameLayout) {
        super(context);
        h.b(view, "containerView");
        h.b(frameLayout, "backgroundViewContainer");
        Object[] objArr = {context, view, frameLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96aee46b0f216b72dd89cf033f6b177d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96aee46b0f216b72dd89cf033f6b177d");
            return;
        }
        this.containerView = view;
        this.backgroundViewContainer = frameLayout;
        addView(this.backgroundViewContainer);
        addView(this.containerView);
    }

    @Nullable
    public final View getMaskView() {
        return this.maskView;
    }

    public final void setMaskView(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8a81be1fad27507b3afe2f93eb91e54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8a81be1fad27507b3afe2f93eb91e54");
            return;
        }
        this.maskView = view;
        addView(this.maskView);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6e7be87cd2ca6378dfdf97b78b18d47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6e7be87cd2ca6378dfdf97b78b18d47");
            return;
        }
        super.onMeasure(i, i2);
        int measuredHeight = this.containerView.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = this.containerView.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            measuredHeight = measuredHeight + (marginLayoutParams.topMargin > 0 ? marginLayoutParams.topMargin : 0) + (marginLayoutParams.bottomMargin > 0 ? marginLayoutParams.bottomMargin : 0);
        }
        this.backgroundViewContainer.getLayoutParams().height = measuredHeight;
    }

    public final void removeMaskView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7119ab4cc37bfcf09b63f79e391feda8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7119ab4cc37bfcf09b63f79e391feda8");
            return;
        }
        View view = this.maskView;
        if (view != null) {
            removeView(view);
        }
    }
}
