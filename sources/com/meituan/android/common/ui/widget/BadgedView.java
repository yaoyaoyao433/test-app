package com.meituan.android.common.ui.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BadgedView extends View {
    public static final int BADGE_HORIZONTAL_POSITION_MODE_CENTER = 1;
    public static final int BADGE_HORIZONTAL_POSITION_MODE_LEFT = 0;
    public static final int BADGE_HORIZONTAL_POSITION_MODE_RIGHT = 2;
    public static final int BADGE_VERTICAL_POSITION_MODE_BOTTOM = 2;
    public static final int BADGE_VERTICAL_POSITION_MODE_CENTER = 1;
    public static final int BADGE_VERTICAL_POSITION_MODE_TOP = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private ColorStateList backgroundColor;
    private Drawable badge;
    private int badgeHeight;
    private int badgeHorizontalPosistionMode;
    private int badgeHorizontalPositionMargin;
    private int badgePositionX;
    private int badgePositionY;
    private int badgeVerticalPositionMargin;
    private int badgeVerticalPositionMode;
    private int badgeWidth;
    private Paint bgPaint;
    private Paint.Align currentAlignMode;
    private int currentBackgroundColor;
    private int currentTextColor;
    private Drawable icon;
    private int iconDrawHeight;
    private int iconDrawWidth;
    private int iconHeight;
    private int iconWidth;
    private int iconX;
    private int iconY;
    private Paint.FontMetrics sharedFontMetrics;
    private Rect sharedRect;
    private ColorStateList textColor;
    private TextPaint textPaint;
    private int textSize;
    private String title;
    private int titleMarginTop;
    private int titleX;
    private int titleY;

    public BadgedView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "339069c4255c4d5b8330f24b58de5230", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "339069c4255c4d5b8330f24b58de5230");
            return;
        }
        this.sharedRect = new Rect();
        this.sharedFontMetrics = new Paint.FontMetrics();
        this.currentAlignMode = Paint.Align.LEFT;
        init(context);
    }

    private void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41f3d8a38de1832c3527545f8e250e25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41f3d8a38de1832c3527545f8e250e25");
            return;
        }
        this.textPaint = new TextPaint();
        this.textPaint.setAntiAlias(true);
        this.textPaint.setTextAlign(Paint.Align.LEFT);
        setWillNotDraw(false);
        this.bgPaint = new Paint();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd8cf940f50b48345fa6d025bbab1a4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd8cf940f50b48345fa6d025bbab1a4f");
            return;
        }
        super.onDraw(canvas);
        if (this.currentBackgroundColor != 0) {
            this.sharedRect.set(0, 0, getWidth(), getHeight());
            this.bgPaint.setColor(this.currentBackgroundColor);
            canvas.drawRect(this.sharedRect, this.bgPaint);
        }
        if (this.icon != null) {
            this.sharedRect.set(this.iconX, this.iconY, this.iconX + this.iconDrawWidth, this.iconY + this.iconDrawHeight);
            this.icon.setBounds(this.sharedRect);
            this.icon.draw(canvas);
        }
        if (this.badge != null) {
            this.sharedRect.set(this.badgePositionX, this.badgePositionY, this.badgePositionX + this.badgeWidth, this.badgePositionY + this.badgeHeight);
            this.badge.setBounds(this.sharedRect);
            this.badge.draw(canvas);
        }
        if (TextUtils.isEmpty(this.title)) {
            return;
        }
        canvas.drawText(this.title, this.titleX, this.titleY, this.textPaint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
        if (r8 < 0) goto L79;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.ui.widget.BadgedView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdf89656ffa892a4b56d5e91b4b4da85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdf89656ffa892a4b56d5e91b4b4da85");
            return;
        }
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        if (this.textColor != null) {
            int color = this.textPaint.getColor();
            this.currentTextColor = this.textColor.getColorForState(drawableState, this.textColor.getDefaultColor());
            this.textPaint.setColor(this.currentTextColor);
            z = (color != this.currentTextColor) | false;
        } else {
            z = false;
        }
        if (this.backgroundColor != null) {
            int i = this.currentBackgroundColor;
            this.currentBackgroundColor = this.backgroundColor.getColorForState(drawableState, this.backgroundColor.getDefaultColor());
            z |= i != this.currentBackgroundColor;
        }
        if (this.icon != null) {
            z |= this.icon.setState(drawableState);
        }
        if (this.badge != null) {
            z |= this.badge.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0a55b9c9e2e5633c0216f4ee578bac8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0a55b9c9e2e5633c0216f4ee578bac8")).booleanValue() : super.verifyDrawable(drawable) || drawable == this.icon || drawable == this.badge;
    }

    public void setIcon(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cb2b7bd3f83a490b9de44f8786fe02d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cb2b7bd3f83a490b9de44f8786fe02d");
        } else if (this.icon == drawable) {
        } else {
            if (this.icon != null) {
                this.icon.setCallback(null);
            }
            this.icon = drawable;
            if (this.icon != null) {
                this.icon.setCallback(this);
                this.icon.setState(getDrawableState());
            }
            requestLayout();
            invalidate();
        }
    }

    public void setIcon(Bitmap bitmap) {
        boolean z = true;
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5dbfe7b8f3b3c193869f6d3cf615038", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5dbfe7b8f3b3c193869f6d3cf615038");
        } else if (bitmap == null) {
            setIcon((Drawable) null);
        } else if (this.icon != null && (this.icon instanceof FastBitmapDrawable)) {
            if (((FastBitmapDrawable) this.icon).bitmap != bitmap) {
                if (this.icon.getIntrinsicWidth() == bitmap.getWidth() && this.icon.getIntrinsicHeight() == bitmap.getHeight()) {
                    z = false;
                }
                ((FastBitmapDrawable) this.icon).setBitmap(bitmap);
                if (z) {
                    requestLayout();
                }
                invalidate();
            }
        } else {
            setIcon(new FastBitmapDrawable(bitmap));
        }
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public void setBadge(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "397489380515c89a007b987fef3f7d1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "397489380515c89a007b987fef3f7d1b");
        } else if (this.badge == drawable) {
        } else {
            if (this.badge != null) {
                this.badge.setCallback(null);
            }
            this.badge = drawable;
            if (this.badge != null) {
                this.badge.setCallback(this);
                this.badge.setState(getDrawableState());
            }
            requestLayout();
            invalidate();
        }
    }

    public void setBadge(Bitmap bitmap) {
        boolean z = true;
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbba1fb606901b77f21070bc94a0071b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbba1fb606901b77f21070bc94a0071b");
        } else if (bitmap == null) {
            setBadge((Drawable) null);
        } else if (this.badge != null && (this.badge instanceof FastBitmapDrawable)) {
            if (((FastBitmapDrawable) this.badge).bitmap != bitmap) {
                if (this.badge.getIntrinsicWidth() == bitmap.getWidth() && this.badge.getIntrinsicHeight() == bitmap.getHeight()) {
                    z = false;
                }
                ((FastBitmapDrawable) this.badge).setBitmap(bitmap);
                if (z) {
                    requestLayout();
                }
                invalidate();
            }
        } else {
            setBadge(new FastBitmapDrawable(bitmap));
        }
    }

    public Drawable getBadge() {
        return this.badge;
    }

    public void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9c424691e433e0cc53b6f2f01e469d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9c424691e433e0cc53b6f2f01e469d2");
            return;
        }
        this.title = str;
        requestLayout();
        invalidate();
    }

    public void setTitleMarginTop(int i) {
        this.titleMarginTop = i;
    }

    public void setBadgeHeight(int i) {
        this.badgeHeight = i;
    }

    public void setBadgeHorizontalPosistionMode(int i) {
        this.badgeHorizontalPosistionMode = i;
    }

    public void setBadgeHorizontalPositionMargin(int i) {
        this.badgeHorizontalPositionMargin = i;
    }

    public int getBadgeVerticalPositionMode() {
        return this.badgeVerticalPositionMode;
    }

    public void setBadgeVerticalPositionMode(int i) {
        this.badgeVerticalPositionMode = i;
    }

    public int getBadgeVerticalPositionMargin() {
        return this.badgeVerticalPositionMargin;
    }

    public void setBadgeVerticalPositionMargin(int i) {
        this.badgeVerticalPositionMargin = i;
    }

    public void setIconWidth(int i) {
        this.iconWidth = i;
    }

    public void setIconHeight(int i) {
        this.iconHeight = i;
    }

    public void setTextSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccd49641ce8051c264768293061a7327", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccd49641ce8051c264768293061a7327");
            return;
        }
        this.textSize = i;
        this.textPaint.setTextSize(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        Object[] objArr = {colorStateList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "971ddb017a2b920da1a533258b84f086", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "971ddb017a2b920da1a533258b84f086");
            return;
        }
        this.textColor = colorStateList;
        if (colorStateList != null) {
            this.currentTextColor = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
        } else {
            this.currentTextColor = 0;
        }
        this.textPaint.setColor(this.currentTextColor);
    }

    public void setTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52831c6bbb6b9aa67508b907ca0f961b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52831c6bbb6b9aa67508b907ca0f961b");
            return;
        }
        this.textColor = null;
        this.currentTextColor = i;
        this.textPaint.setColor(this.currentTextColor);
    }

    public void setBackgroundColor(ColorStateList colorStateList) {
        Object[] objArr = {colorStateList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a94013b85c5e7f8d3ff70b2d1237737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a94013b85c5e7f8d3ff70b2d1237737");
            return;
        }
        this.backgroundColor = colorStateList;
        if (colorStateList != null) {
            this.currentBackgroundColor = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
        } else {
            this.currentBackgroundColor = 0;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class FastBitmapDrawable extends Drawable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int alpha;
        public Bitmap bitmap;
        public Paint paint;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        public FastBitmapDrawable(Bitmap bitmap) {
            Object[] objArr = {bitmap};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "436194bd9b4cb2595dca425d5216f5ae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "436194bd9b4cb2595dca425d5216f5ae");
                return;
            }
            this.paint = new Paint(3);
            this.bitmap = bitmap;
        }

        public void setBitmap(Bitmap bitmap) {
            this.bitmap = bitmap;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Object[] objArr = {canvas};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1131af9904e7b8ea7e2540163b0ed04", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1131af9904e7b8ea7e2540163b0ed04");
            } else {
                canvas.drawBitmap(this.bitmap, (Rect) null, getBounds(), this.paint);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbd946f795a5eead22928aeb13218e74", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbd946f795a5eead22928aeb13218e74");
                return;
            }
            this.alpha = i;
            this.paint.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            Object[] objArr = {colorFilter};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2afcd06778dbfdd149382e954da7c6bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2afcd06778dbfdd149382e954da7c6bd");
            } else {
                this.paint.setColorFilter(colorFilter);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getAlpha() {
            return this.alpha;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e826636dc14cdef9ae09de2b60b44f3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e826636dc14cdef9ae09de2b60b44f3")).intValue() : this.bitmap.getWidth();
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7750f7525c8113d2e703c02c72f6fac4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7750f7525c8113d2e703c02c72f6fac4")).intValue() : this.bitmap.getHeight();
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1bb87857939966c3e051b44cd149329", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1bb87857939966c3e051b44cd149329")).intValue() : getBounds().width();
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb1bb7195527e8e1c4da13bddbc24f26", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb1bb7195527e8e1c4da13bddbc24f26")).intValue() : getBounds().height();
        }
    }
}
