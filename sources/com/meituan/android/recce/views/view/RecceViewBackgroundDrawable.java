package com.meituan.android.recce.views.view;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.StateListDrawable;
import android.support.annotation.Nullable;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.views.view.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceViewBackgroundDrawable extends StateListDrawable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Context mContext;
    private d mReactViewBackgroundDrawable;
    private d mReactViewPressedBackgroundDrawable;

    public boolean onResolvedLayoutDirectionChanged(int i) {
        return false;
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public RecceViewBackgroundDrawable(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72f1609263fd7c54729fff80fabf8f45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72f1609263fd7c54729fff80fabf8f45");
        } else {
            this.mContext = context;
        }
    }

    public boolean hasRoundedBorders() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f42fdae9285bcff6ae15c6e345216d1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f42fdae9285bcff6ae15c6e345216d1")).booleanValue() : getOrCreateReactViewBackground().a();
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5d8b3d9729549b1f6beb6c72e4d038a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5d8b3d9729549b1f6beb6c72e4d038a");
            return;
        }
        super.onBoundsChange(rect);
        try {
            Method declaredMethod = d.class.getDeclaredMethod("onBoundsChange", Rect.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(getOrCreateReactViewBackground(), rect);
            declaredMethod.invoke(getOrCreateReactViewPressedBackground(), rect);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d0f5b1d3174dc87a6e27fcd13a689ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d0f5b1d3174dc87a6e27fcd13a689ec");
            return;
        }
        getOrCreateReactViewBackground().setAlpha(i);
        getOrCreateReactViewPressedBackground().setAlpha(i);
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public int getAlpha() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae5101a7fef9ce68fb4cd644cddf5b37", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae5101a7fef9ce68fb4cd644cddf5b37")).intValue() : getOrCreateReactViewBackground().getAlpha();
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public int getOpacity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "501b32cf41e9333996bd6943e32f0044", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "501b32cf41e9333996bd6943e32f0044")).intValue() : getOrCreateReactViewBackground().getOpacity();
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Object[] objArr = {outline};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1511740828b4c4c008a2f154082de42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1511740828b4c4c008a2f154082de42");
        } else {
            getOrCreateReactViewBackground().getOutline(outline);
        }
    }

    public void setBorderWidth(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12f4dd57eddca4689dddb039369d819b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12f4dd57eddca4689dddb039369d819b");
            return;
        }
        getOrCreateReactViewBackground().a(i, f);
        getOrCreateReactViewPressedBackground().a(i, f);
    }

    public void setBorderColor(int i, float f, float f2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "558ab6ac7401ae4f6b05ae8f0fc28b0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "558ab6ac7401ae4f6b05ae8f0fc28b0b");
            return;
        }
        getOrCreateReactViewBackground().a(i, f, f2);
        getOrCreateReactViewPressedBackground().a(i, f, f2);
    }

    @VisibleForTesting
    public d getReactViewBackgroundDrawable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f137d9afccdcd7e57a77dc01a7074ccb", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f137d9afccdcd7e57a77dc01a7074ccb") : getOrCreateReactViewBackground();
    }

    public void setBorderStyle(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3595489d0cb9f31fcb7adff46359b5a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3595489d0cb9f31fcb7adff46359b5a3");
            return;
        }
        getOrCreateReactViewBackground().a(str);
        getOrCreateReactViewPressedBackground().a(str);
    }

    public void setRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65f8e94c400107dafcb604d9b1daea9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65f8e94c400107dafcb604d9b1daea9e");
            return;
        }
        getOrCreateReactViewBackground().a(f);
        getOrCreateReactViewPressedBackground().a(f);
    }

    public void setRadius(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73999f633fa7ef254041873ec1580879", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73999f633fa7ef254041873ec1580879");
            return;
        }
        getOrCreateReactViewBackground().a(f, i);
        getOrCreateReactViewPressedBackground().a(f, i);
    }

    public float getFullBorderRadius() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d1e5822c9bf2ca1cf2749967dfd622b", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d1e5822c9bf2ca1cf2749967dfd622b")).floatValue() : getOrCreateReactViewBackground().b();
    }

    public float getBorderRadius(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1651c21ca81bd615902bb12e37a0b198", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1651c21ca81bd615902bb12e37a0b198")).floatValue() : getOrCreateReactViewBackground().a(aVar);
    }

    public float getBorderRadiusOrDefaultTo(float f, d.a aVar) {
        Object[] objArr = {Float.valueOf(f), aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11597b8eea5c92c94b2125769931e88e", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11597b8eea5c92c94b2125769931e88e")).floatValue() : getOrCreateReactViewBackground().a(f, aVar);
    }

    public void setColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "534f638478e5a0f0e03e423ab3e00592", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "534f638478e5a0f0e03e423ab3e00592");
            return;
        }
        int d = getOrCreateReactViewBackground().d();
        getOrCreateReactViewBackground().a(i);
        d orCreateReactViewPressedBackground = getOrCreateReactViewPressedBackground();
        if (orCreateReactViewPressedBackground.d() == 0 || orCreateReactViewPressedBackground.d() == d) {
            orCreateReactViewPressedBackground.a(i);
        }
    }

    public void setPressedColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d772f34c504e943e5c5b474d9c451590", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d772f34c504e943e5c5b474d9c451590");
        } else {
            getOrCreateReactViewPressedBackground().a(i);
        }
    }

    private d getOrCreateReactViewBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94dd657768247a82db8ae1bc67bb605a", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94dd657768247a82db8ae1bc67bb605a");
        }
        if (this.mReactViewBackgroundDrawable == null) {
            this.mReactViewBackgroundDrawable = new d(this.mContext);
            addState(new int[]{16842919}, getOrCreateReactViewPressedBackground());
            addState(new int[0], this.mReactViewBackgroundDrawable);
        }
        return this.mReactViewBackgroundDrawable;
    }

    private d getOrCreateReactViewPressedBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "413b59d077cc35eccb37e6e760e4abf4", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "413b59d077cc35eccb37e6e760e4abf4");
        }
        if (this.mReactViewPressedBackgroundDrawable == null) {
            this.mReactViewPressedBackgroundDrawable = new d(this.mContext);
            if (this.mReactViewBackgroundDrawable == null) {
                this.mReactViewBackgroundDrawable = getOrCreateReactViewBackground();
            }
        }
        return this.mReactViewPressedBackgroundDrawable;
    }

    public int getResolvedLayoutDirection() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87c06f3fd5f8db7c62f5615efd94e9b2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87c06f3fd5f8db7c62f5615efd94e9b2")).intValue() : getOrCreateReactViewBackground().c();
    }

    public boolean setResolvedLayoutDirection(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8ef6726e6c23d13780c343c1102f7f5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8ef6726e6c23d13780c343c1102f7f5")).booleanValue() : getOrCreateReactViewBackground().b(i) && getOrCreateReactViewPressedBackground().b(i);
    }

    @VisibleForTesting
    public int getColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "401784f714ff8d3d7f19d95c84508096", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "401784f714ff8d3d7f19d95c84508096")).intValue() : ((d) getCurrent()).d();
    }

    public float getBorderWidthOrDefaultTo(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9209810c0ca64eadd5c9ddf1e3537cd7", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9209810c0ca64eadd5c9ddf1e3537cd7")).floatValue() : getOrCreateReactViewBackground().b(f, i);
    }

    public float getFullBorderWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43ca622271153b1066f59e0464a1b1cb", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43ca622271153b1066f59e0464a1b1cb")).floatValue() : getOrCreateReactViewBackground().e();
    }

    public RectF getDirectionAwareBorderInsets() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c27fc9c44c7b96ce539d3f466ace9cd", RobustBitConfig.DEFAULT_VALUE) ? (RectF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c27fc9c44c7b96ce539d3f466ace9cd") : getOrCreateReactViewBackground().f();
    }
}
