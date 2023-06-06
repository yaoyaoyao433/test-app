package com.dianping.titans.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.titans.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LineTitleLayout extends ViewGroup {
    public static final int DEFAULT_BACKGROUND_COLOR = -1;
    public static final int DEFAULT_FOREGROUND_COLOR = -14540254;
    public static final int DEFAULT_HEIGHT_DP_BORDER = 0;
    public static final int DEFAULT_HEIGHT_DP_LAYOUT = 48;
    public static final int DEFAULT_HEIGHT_DP_PROGRESS = 3;
    public static final int PRIMARY_GRAVITY_CENTER = 1;
    public static final int PRIMARY_GRAVITY_END = 2;
    public static final int PRIMARY_GRAVITY_START = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Drawable borderDrawable;
    private int borderHeight;
    private boolean borderVisible;
    private boolean layoutVisible;
    private View.OnClickListener listenerDispatcher;
    private Map<String, OnElementClickListener> listenerMap;
    private int primaryGravity;
    private int progress;
    private Drawable progressDrawable;
    private int progressHeight;
    private boolean progressVisible;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnElementClickListener {
        boolean onClick(View view, String str);
    }

    public LineTitleLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0786c7f6717a5abf9206e225a6ef44d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0786c7f6717a5abf9206e225a6ef44d");
        }
    }

    public LineTitleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "532fa0e38e62492375d5ee6906c7d12c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "532fa0e38e62492375d5ee6906c7d12c");
        }
    }

    public LineTitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b06a50a1d7717a9ce93511a8dee677a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b06a50a1d7717a9ce93511a8dee677a");
            return;
        }
        this.borderHeight = getDefaultBorderHeight();
        this.borderVisible = true;
        this.progressHeight = getDefaultProgressHeight();
        this.progressVisible = true;
        this.layoutVisible = true;
        this.primaryGravity = 1;
        this.listenerMap = new HashMap();
        init(context, attributeSet, i, 0);
    }

    @TargetApi(21)
    public LineTitleLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc7a5b62caa528d9ba18645327b606af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc7a5b62caa528d9ba18645327b606af");
            return;
        }
        this.borderHeight = getDefaultBorderHeight();
        this.borderVisible = true;
        this.progressHeight = getDefaultProgressHeight();
        this.progressVisible = true;
        this.layoutVisible = true;
        this.primaryGravity = 1;
        this.listenerMap = new HashMap();
        init(context, attributeSet, i, i2);
    }

    private void init(Context context, AttributeSet attributeSet, int i, int i2) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0242f0ef3dcf299a494bf91c412f35c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0242f0ef3dcf299a494bf91c412f35c1");
            return;
        }
        saveAttributes(context, attributeSet, i, i2);
        setBackgroundColor(-1);
        Resources resources = context.getResources();
        if (this.borderDrawable == null) {
            this.borderDrawable = resources.getDrawable(R.drawable.titans_title_shadow);
        }
        if (this.progressDrawable == null) {
            this.progressDrawable = resources.getDrawable(R.drawable.titans_horizontal_progress);
        }
        this.progressDrawable.mutate();
    }

    private void saveAttributes(Context context, AttributeSet attributeSet, int i, int i2) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cefd7537777bb26dd9a31c06e261723", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cefd7537777bb26dd9a31c06e261723");
            return;
        }
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.borderRes, R.attr.borderHeight, R.attr.borderVisible, R.attr.progressRes, R.attr.progressHeight, R.attr.progress, R.attr.progressVisible, R.attr.layoutVisible, R.attr.primaryGravity}, i, i2);
        if (obtainStyledAttributes == null) {
            return;
        }
        try {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 7) {
                    this.layoutVisible = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 0) {
                    this.borderDrawable = obtainStyledAttributes.getDrawable(index);
                } else if (index == 1) {
                    this.borderHeight = obtainStyledAttributes.getDimensionPixelSize(index, getDefaultBorderHeight());
                } else if (index == 2) {
                    this.borderVisible = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 3) {
                    this.progressDrawable = obtainStyledAttributes.getDrawable(index);
                } else {
                    if (index == 4) {
                        this.progressHeight = obtainStyledAttributes.getDimensionPixelSize(index, getDefaultProgressHeight());
                    } else if (index == 6) {
                        this.progressVisible = obtainStyledAttributes.getBoolean(index, true);
                    } else if (index == 5) {
                        this.progress = obtainStyledAttributes.getInt(index, 0);
                        if (this.progress < 0) {
                            this.progress = 0;
                        } else if (this.progress > 100) {
                            this.progress = 100;
                        }
                    } else if (index == 8) {
                        this.primaryGravity = obtainStyledAttributes.getInt(index, 1);
                    }
                }
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void measureChild(View view, int i, int i2, int i3, LayoutParams layoutParams) {
        int childMeasureSpec;
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ffbdc6258b900e256b7d891e3e5b47b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ffbdc6258b900e256b7d891e3e5b47b");
            return;
        }
        double d = layoutParams.widthPercent;
        int childMeasureSpec2 = getChildMeasureSpec(i2, 0, layoutParams.height);
        if (d > 0.0d) {
            childMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (i3 * d), 1073741824);
        } else {
            childMeasureSpec = getChildMeasureSpec(i, 0, layoutParams.width);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void measureChildAtMost(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a267c5028e15f9c4a64b1c9f38553c54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a267c5028e15f9c4a64b1c9f38553c54");
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        View view;
        int i4;
        int i5;
        View view2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "066bab214e1c4e61636973fd79eb5436", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "066bab214e1c4e61636973fd79eb5436");
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (!this.layoutVisible) {
            int max = this.borderVisible ? Math.max(0, this.borderHeight) : 0;
            int max2 = this.progressVisible ? Math.max(max, this.progressHeight) : max;
            if (max2 <= size2 || mode2 != Integer.MIN_VALUE) {
                size2 = max2;
            }
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        View view3 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i7 >= childCount) {
                i3 = i6;
                view = view3;
                break;
            }
            boolean z = i8 != 0;
            View childAt = getChildAt(z ? childCount - i8 : i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (!layoutParams.primary) {
                    int i12 = i6;
                    view = view3;
                    i4 = i7;
                    i5 = childCount;
                    measureChild(childAt, i, i2, size, layoutParams);
                    int measuredWidth = childAt.getMeasuredWidth();
                    int i13 = size > 0 ? size - i9 : Integer.MAX_VALUE;
                    if (i13 < measuredWidth) {
                        view2 = childAt;
                        measureChildAtMost(view2, i13, i2);
                        measuredWidth = view2.getMeasuredWidth();
                    } else {
                        view2 = childAt;
                    }
                    if (z) {
                        i10 += measuredWidth;
                        i8++;
                    } else {
                        i11 += measuredWidth;
                    }
                    int i14 = i9 + measuredWidth;
                    i6 = Math.max(view2.getMeasuredHeight(), i12);
                    if (i14 >= size && size > 0) {
                        i9 = i14;
                        i3 = i6;
                        break;
                    }
                    i9 = i14;
                    view3 = view;
                } else if (view3 != null) {
                    throw new RuntimeException("only one primary supported");
                } else {
                    view3 = childAt;
                    i4 = i7;
                    i5 = childCount;
                    i8 = 1;
                    i10 = 0;
                }
            } else {
                i4 = i7;
                i5 = childCount;
            }
            i7 = i4 + 1;
            childCount = i5;
        }
        int max3 = size - (this.primaryGravity == 1 ? Math.max(i11, i10) * 2 : i9);
        View view4 = view;
        if (view4 != null) {
            if (max3 > 0) {
                LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
                if (layoutParams2.primaryFillRest) {
                    view4.measure(View.MeasureSpec.makeMeasureSpec(max3, 1073741824), i2);
                } else {
                    measureChild(view4, i, i2, size, layoutParams2);
                }
                int measuredWidth2 = view4.getMeasuredWidth();
                if (measuredWidth2 > max3) {
                    measureChildAtMost(view4, max3, i2);
                    measuredWidth2 = view4.getMeasuredWidth();
                }
                i9 += measuredWidth2;
                i3 = Math.max(view4.getMeasuredHeight(), i3);
            } else {
                measureChildAtMost(view4, 0, i2);
            }
        }
        int i15 = i9;
        if (mode == 1073741824 || i15 < size || mode == Integer.MIN_VALUE) {
            i15 = size;
        }
        if (mode2 != 1073741824 && i3 <= size2) {
            size2 = i3;
        }
        setMeasuredDimension(i15, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "448281fea38ad4f1590884a1b9796fd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "448281fea38ad4f1590884a1b9796fd2");
        } else if (this.layoutVisible) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            View view = null;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i6 < childCount) {
                boolean z2 = i7 != 0;
                View childAt = getChildAt(z2 ? childCount - i7 : i6);
                if (childAt.getVisibility() != 8) {
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    int i13 = (measuredHeight - measuredHeight2) / 2;
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int i14 = (measuredHeight2 + measuredHeight) / 2;
                    i5 = measuredHeight;
                    if (((LayoutParams) childAt.getLayoutParams()).primary) {
                        i12 = measuredWidth;
                        view = childAt;
                        i11 = i14;
                        i9 = i13;
                        i10 = measuredWidth2;
                        i7 = 1;
                    } else if (!z2) {
                        int i15 = i12 + measuredWidth2;
                        childAt.layout(i12, i13, i15, i14);
                        i8 = i15;
                        i12 = i8;
                    } else {
                        int i16 = i12 - measuredWidth2;
                        childAt.layout(i16, i13, i12, i14);
                        i7++;
                        i12 = i16;
                    }
                } else {
                    i5 = measuredHeight;
                }
                i6++;
                measuredHeight = i5;
            }
            if (view != null) {
                switch (this.primaryGravity) {
                    case 0:
                        view.layout(i8, i9, i10 + i8, i11);
                        return;
                    case 1:
                        view.layout((measuredWidth - i10) / 2, i9, (measuredWidth + i10) / 2, i11);
                        return;
                    case 2:
                        view.layout(i12 - i10, i9, i12, i11);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c82e1fefc97aa51e3f81d0836517e10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c82e1fefc97aa51e3f81d0836517e10");
            return;
        }
        super.onDraw(canvas);
        if (this.borderDrawable != null && this.borderVisible && this.borderHeight > 0) {
            canvas.save();
            this.borderDrawable.setBounds(getBorderRect());
            this.borderDrawable.draw(canvas);
            canvas.restore();
        }
        if (this.progressDrawable == null || !this.progressVisible || this.progressHeight <= 0) {
            return;
        }
        canvas.save();
        this.progressDrawable.setLevel(this.progress * 100);
        this.progressDrawable.setBounds(getProgressRect());
        this.progressDrawable.draw(canvas);
        canvas.restore();
    }

    private int getDefaultBorderHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c0b9efca4b8f885b38d77c6ba676561", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c0b9efca4b8f885b38d77c6ba676561")).intValue() : ViewUtils.dip2px(getContext(), 0.0f);
    }

    private int getDefaultProgressHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a06f3778baf9e111638c61e429c3e047", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a06f3778baf9e111638c61e429c3e047")).intValue() : ViewUtils.dip2px(getContext(), 3.0f);
    }

    public void setProgress(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc36227116eed2267783eab2e06b5108", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc36227116eed2267783eab2e06b5108");
        } else if (i == this.progress || i < 0 || i > 100) {
        } else {
            this.progress = i;
            invalidate(getProgressRect());
        }
    }

    public int getProgress() {
        return this.progress;
    }

    private Rect getProgressRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67544b3ac63d0377f0bb4a7a3e3930b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67544b3ac63d0377f0bb4a7a3e3930b1");
        }
        int measuredHeight = getMeasuredHeight();
        return new Rect(0, measuredHeight - this.progressHeight, getMeasuredWidth(), measuredHeight);
    }

    public boolean getProgressVisible() {
        return this.progressVisible;
    }

    public void setProgressVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69c8155b86ba16aac892574a6a13da9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69c8155b86ba16aac892574a6a13da9f");
        } else if (this.progressVisible != z) {
            this.progressVisible = z;
            invalidate(getProgressRect());
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73487873f6b506518c1acf9ebef3856a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73487873f6b506518c1acf9ebef3856a");
        } else if (this.progressDrawable != drawable) {
            this.progressDrawable = drawable;
            this.progressDrawable.mutate();
            invalidate(getProgressRect());
        }
    }

    public boolean getBorderVisible() {
        return this.borderVisible;
    }

    private Rect getBorderRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66f854ae428b6c9e368e8cf932121094", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66f854ae428b6c9e368e8cf932121094");
        }
        int measuredHeight = getMeasuredHeight();
        return new Rect(0, measuredHeight - this.borderHeight, getMeasuredWidth(), measuredHeight);
    }

    public void setBorderVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07b74e1c33e93a4ccf0f7b42b5441f4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07b74e1c33e93a4ccf0f7b42b5441f4f");
        } else if (this.borderVisible != z) {
            this.borderVisible = z;
            invalidate(getBorderRect());
        }
    }

    public void setBorderDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c679a9018b923fdff4ca90e510c7181c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c679a9018b923fdff4ca90e510c7181c");
        } else if (this.borderDrawable != drawable) {
            this.borderDrawable = drawable;
            invalidate(getBorderRect());
        }
    }

    public void setBorderHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0383928a2bee0098a1029826686e5956", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0383928a2bee0098a1029826686e5956");
        } else if (this.borderHeight != i) {
            this.borderHeight = i;
            invalidate();
        }
    }

    public boolean getLayoutVisible() {
        return this.layoutVisible;
    }

    public void setLayoutVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32c0b934218deb705b7bd6ebba9aaea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32c0b934218deb705b7bd6ebba9aaea8");
        } else if (this.layoutVisible != z) {
            this.layoutVisible = z;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).setVisibility(z ? 0 : 8);
            }
            requestLayout();
        }
    }

    public boolean setOnElementClickListener(String str, OnElementClickListener onElementClickListener) {
        Object[] objArr = {str, onElementClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63319a7a1336434317d00527c6d5c9f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63319a7a1336434317d00527c6d5c9f1")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || onElementClickListener == this.listenerMap.get(str)) {
            return false;
        }
        this.listenerMap.put(str, onElementClickListener);
        if (this.listenerDispatcher == null) {
            this.listenerDispatcher = new View.OnClickListener() { // from class: com.dianping.titans.widget.LineTitleLayout.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2172bcdb6347c2ddcba4f473221928b8", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2172bcdb6347c2ddcba4f473221928b8");
                        return;
                    }
                    String str2 = ((LayoutParams) view.getLayoutParams()).action;
                    OnElementClickListener onElementClickListener2 = (OnElementClickListener) LineTitleLayout.this.listenerMap.get(str2);
                    if (onElementClickListener2 != null) {
                        onElementClickListener2.onClick(view, str2);
                    }
                }
            };
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).setOnClickListener(this.listenerDispatcher);
            }
        }
        return true;
    }

    public OnElementClickListener getOnElementClickListener(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecf6ddc7cce16576c162f3eccb188da1", RobustBitConfig.DEFAULT_VALUE) ? (OnElementClickListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecf6ddc7cce16576c162f3eccb188da1") : this.listenerMap.get(str);
    }

    public int getChildIndex(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03f1e4a92aa7dcb220a0d42f91050522", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03f1e4a92aa7dcb220a0d42f91050522")).intValue();
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).name.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public List<View> getChildrenByAction(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43093d97a7f71fe59ea327e32d2d45bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43093d97a7f71fe59ea327e32d2d45bb");
        }
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (str.equals(((LayoutParams) childAt.getLayoutParams()).action)) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public boolean removeView(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "356d76ced9ed6e299012fb5ca994c91b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "356d76ced9ed6e299012fb5ca994c91b")).booleanValue();
        }
        int childIndex = getChildIndex(str);
        if (childIndex == -1) {
            return true;
        }
        removeViewAt(childIndex);
        return true;
    }

    public void setPrimaryGravity(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ce639426a64856d5db4419a7ce5187d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ce639426a64856d5db4419a7ce5187d");
        } else if (this.primaryGravity == i) {
        } else {
            switch (i) {
                case 0:
                case 1:
                case 2:
                    this.primaryGravity = i;
                    requestLayout();
                    return;
                default:
                    return;
            }
        }
    }

    public View getPrimaryView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce533feeb1da0621e864f2b4ee040a55", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce533feeb1da0621e864f2b4ee040a55");
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (((LayoutParams) childAt.getLayoutParams()).primary) {
                return childAt;
            }
        }
        return null;
    }

    public boolean setElementAction(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce5449f54f2329ac56725f514fde13c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce5449f54f2329ac56725f514fde13c0")).booleanValue();
        }
        int childIndex = getChildIndex(str);
        if (childIndex != -1) {
            ((LayoutParams) getChildAt(childIndex).getLayoutParams()).action = str2;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ce747892ee9c467e7ed6eb4e92af2f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ce747892ee9c467e7ed6eb4e92af2f6");
            return;
        }
        super.onViewAdded(view);
        if (this.listenerDispatcher != null) {
            view.setOnClickListener(this.listenerDispatcher);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c86e44c9a6dbc03ec48452fb149fa1c", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c86e44c9a6dbc03ec48452fb149fa1c") : new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffb5d3fa338c0374be2cdea425731b60", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffb5d3fa338c0374be2cdea425731b60") : new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d40ab2edd400348d5536673154efd74", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d40ab2edd400348d5536673154efd74") : new LayoutParams(-2, -2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String action;
        public String name;
        public boolean primary;
        public boolean primaryFillRest;
        public double widthPercent;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.action, R.attr.name, R.attr.primary, R.attr.widthPercent, R.attr.primaryFillRest});
            if (obtainStyledAttributes != null) {
                try {
                    this.name = obtainStyledAttributes.getString(1);
                    this.action = obtainStyledAttributes.getString(0);
                    this.primary = obtainStyledAttributes.getBoolean(2, false);
                    this.primaryFillRest = obtainStyledAttributes.getBoolean(4, false);
                    this.widthPercent = obtainStyledAttributes.getFloat(3, 0.0f);
                    if (this.widthPercent < 0.0d) {
                        this.widthPercent = 0.0d;
                    } else if (this.widthPercent > 1.0d) {
                        this.widthPercent = 1.0d;
                    }
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                this.name = layoutParams2.name;
                this.action = layoutParams2.action;
                this.primary = layoutParams2.primary;
                this.primaryFillRest = layoutParams2.primaryFillRest;
                this.widthPercent = layoutParams2.widthPercent;
            }
        }
    }
}
