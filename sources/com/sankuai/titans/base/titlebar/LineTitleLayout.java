package com.sankuai.titans.base.titlebar;

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
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.titlebar.DynamicTitleParser;
import com.sankuai.titans.base.utils.UIKit;
import com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarElementEntity;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LineTitleLayout extends ViewGroup {
    public static final int DEFAULT_BACKGROUND_COLOR = -1;
    public static final int DEFAULT_BORDER_COLOR = 0;
    public static final int DEFAULT_FOREGROUND_COLOR = -14540254;
    public static final int DEFAULT_HEIGHT_DP_BORDER = 0;
    public static final int DEFAULT_HEIGHT_DP_LAYOUT = 48;
    public static final int DEFAULT_HEIGHT_DP_PROGRESS = 3;
    private static final int ERR_INTERNAL = -1;
    public static final int PRIMARY_GRAVITY_CENTER = 1;
    public static final int PRIMARY_GRAVITY_END = 2;
    public static final int PRIMARY_GRAVITY_START = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Drawable borderDrawable;
    private int borderHeight;
    private boolean borderVisible;
    private boolean layoutVisible;
    private View.OnClickListener listenerDispatcher;
    private final Map<String, OnElementClickListener> listenerMap;
    private int primaryGravity;
    private int progress;
    private Drawable progressDrawable;
    private int progressHeight;
    private boolean progressVisible;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnElementClickListener {
        boolean onClick(View view, String str);
    }

    public LineTitleLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aca31dd6f903b70d465840afca021274", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aca31dd6f903b70d465840afca021274");
        }
    }

    public LineTitleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b19564da68ebca0f16b10b738de823dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b19564da68ebca0f16b10b738de823dd");
        }
    }

    public LineTitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "489727dcd4eb0b7c610e7daee1f04b27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "489727dcd4eb0b7c610e7daee1f04b27");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b14397882a39a1d25b696b9229bee1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b14397882a39a1d25b696b9229bee1b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "177e4f336395717f0c51e29ec8e9f036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "177e4f336395717f0c51e29ec8e9f036");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcd72111dd5c82c5065b240684d31153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcd72111dd5c82c5065b240684d31153");
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

    private void measureChild(View view, int i, int i2, int i3, LineTitleLayoutParams lineTitleLayoutParams) {
        int childMeasureSpec;
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), lineTitleLayoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13ff3e43c973c4988a0dd459cc575183", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13ff3e43c973c4988a0dd459cc575183");
            return;
        }
        double d = lineTitleLayoutParams.widthPercent;
        int childMeasureSpec2 = getChildMeasureSpec(i2, 0, lineTitleLayoutParams.height);
        if (d > 0.0d) {
            childMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (i3 * d), 1073741824);
        } else {
            childMeasureSpec = getChildMeasureSpec(i, 0, lineTitleLayoutParams.width);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void measureChildAtMost(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "147ac5093d6e0d05d1dabe8d744ad2f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "147ac5093d6e0d05d1dabe8d744ad2f7");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cdd56aa339460f30171f0d88c5615b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cdd56aa339460f30171f0d88c5615b4");
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
                LineTitleLayoutParams lineTitleLayoutParams = (LineTitleLayoutParams) childAt.getLayoutParams();
                if (!lineTitleLayoutParams.primary) {
                    int i12 = i6;
                    view = view3;
                    i4 = i7;
                    i5 = childCount;
                    measureChild(childAt, i, i2, size, lineTitleLayoutParams);
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
                LineTitleLayoutParams lineTitleLayoutParams2 = (LineTitleLayoutParams) view4.getLayoutParams();
                if (lineTitleLayoutParams2.primaryFillRest) {
                    view4.measure(View.MeasureSpec.makeMeasureSpec(max3, 1073741824), i2);
                } else {
                    measureChild(view4, i, i2, size, lineTitleLayoutParams2);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e868aa1c99caa89fe70a071e8e6ec392", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e868aa1c99caa89fe70a071e8e6ec392");
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
                    if (((LineTitleLayoutParams) childAt.getLayoutParams()).primary) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f819c180e1dc423df7886ba9331f275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f819c180e1dc423df7886ba9331f275");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "415aaed08277a8a40cfd3e8479b6a807", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "415aaed08277a8a40cfd3e8479b6a807")).intValue() : UIKit.dip2px(getContext(), 0.0f);
    }

    private int getDefaultProgressHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fdbc99f0c82cf2c658ef100efeb2369", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fdbc99f0c82cf2c658ef100efeb2369")).intValue() : UIKit.dip2px(getContext(), 3.0f);
    }

    public void setProgress(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d4706f5f190d920899bfa6190dd6444", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d4706f5f190d920899bfa6190dd6444");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3aec13f4f81f9c1ba431b1f241aeac53", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3aec13f4f81f9c1ba431b1f241aeac53");
        }
        int measuredHeight = getMeasuredHeight();
        return new Rect(0, measuredHeight - this.progressHeight, getMeasuredWidth(), measuredHeight);
    }

    public boolean getProgressVisible() {
        return this.progressVisible;
    }

    public void showProgress(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "febd131cdb77f00bd0cd64b0764f9c57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "febd131cdb77f00bd0cd64b0764f9c57");
        } else if (this.progressVisible != z) {
            this.progressVisible = z;
            invalidate(getProgressRect());
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4088e3207d6a4ae498da91e02e83b3d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4088e3207d6a4ae498da91e02e83b3d1");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f15aa240224d82cfbe4b15d150c9dfad", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f15aa240224d82cfbe4b15d150c9dfad");
        }
        int measuredHeight = getMeasuredHeight();
        return new Rect(0, measuredHeight - this.borderHeight, getMeasuredWidth(), measuredHeight);
    }

    public void setBorderVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b6187a3487590f948820962bfc39fe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b6187a3487590f948820962bfc39fe3");
        } else if (this.borderVisible != z) {
            this.borderVisible = z;
            invalidate(getBorderRect());
        }
    }

    public void setBorderDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1400e4217793b84323bbf140ec564668", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1400e4217793b84323bbf140ec564668");
        } else if (this.borderDrawable != drawable) {
            this.borderDrawable = drawable;
            invalidate(getBorderRect());
        }
    }

    public void setBorderHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a8579a7e2c75b3dc7f010d7754a82bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a8579a7e2c75b3dc7f010d7754a82bb");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e1e08b76d72f290a00e04cdab85ce2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e1e08b76d72f290a00e04cdab85ce2f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e92cba4a3cb05899dbe6a9776e482372", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e92cba4a3cb05899dbe6a9776e482372")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || onElementClickListener == this.listenerMap.get(str)) {
            return false;
        }
        this.listenerMap.put(str, onElementClickListener);
        if (this.listenerDispatcher == null) {
            this.listenerDispatcher = new View.OnClickListener() { // from class: com.sankuai.titans.base.titlebar.LineTitleLayout.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "21a5dc42d015895a34a72e6c03796831", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "21a5dc42d015895a34a72e6c03796831");
                        return;
                    }
                    String str2 = ((LineTitleLayoutParams) view.getLayoutParams()).action;
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9fefd679a866829329e105d4c1e0017", RobustBitConfig.DEFAULT_VALUE) ? (OnElementClickListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9fefd679a866829329e105d4c1e0017") : this.listenerMap.get(str);
    }

    public int getChildIndex(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17161efdf4ec141f5735240179f232b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17161efdf4ec141f5735240179f232b7")).intValue();
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LineTitleLayoutParams) getChildAt(i).getLayoutParams()).name.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public boolean hasPrimary() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a7cf3225f7e0aa16f0ddc48bd572f1c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a7cf3225f7e0aa16f0ddc48bd572f1c")).booleanValue();
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LineTitleLayoutParams) getChildAt(i).getLayoutParams()).primary) {
                return true;
            }
        }
        return false;
    }

    public List<View> getChildrenByAction(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52a3d982ba0919c050945e1f70d82f92", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52a3d982ba0919c050945e1f70d82f92");
        }
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (str.equals(((LineTitleLayoutParams) childAt.getLayoutParams()).action)) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public void removeView(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a309cf1e9311ea04df6228c5b35af813", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a309cf1e9311ea04df6228c5b35af813");
            return;
        }
        int childIndex = getChildIndex(str);
        if (childIndex == -1) {
            return;
        }
        removeViewAt(childIndex);
    }

    public void setPrimaryGravity(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "198299fa3cf13166ea26ce161dc11c24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "198299fa3cf13166ea26ce161dc11c24");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba97d4337d05440f401654d870bcd037", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba97d4337d05440f401654d870bcd037");
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (((LineTitleLayoutParams) childAt.getLayoutParams()).primary) {
                return childAt;
            }
        }
        return null;
    }

    public boolean setElementAction(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8108bee60460173435d8eeb48062daf7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8108bee60460173435d8eeb48062daf7")).booleanValue();
        }
        int childIndex = getChildIndex(str);
        if (childIndex != -1) {
            ((LineTitleLayoutParams) getChildAt(childIndex).getLayoutParams()).action = str2;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1fd2d518185c8e466a917aaea14b851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1fd2d518185c8e466a917aaea14b851");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d77574e001d5551842c4050f5ac11d08", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d77574e001d5551842c4050f5ac11d08") : new LineTitleLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b14c4397c99dd9cf6639cebf3c2f9078", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b14c4397c99dd9cf6639cebf3c2f9078") : new LineTitleLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8918b7b91b406507c9e366965603e714", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8918b7b91b406507c9e366965603e714") : new LineTitleLayoutParams(-2, -2);
    }

    public void replaceElement(String str, DynamicTitleBarElementEntity dynamicTitleBarElementEntity, DynamicTitleParser.ResourceProvider resourceProvider, ITitleBarActionCallback iTitleBarActionCallback) {
        Object[] objArr = {str, dynamicTitleBarElementEntity, resourceProvider, iTitleBarActionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9928b95853d50cdcf450dd6f89fe487b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9928b95853d50cdcf450dd6f89fe487b");
            return;
        }
        int childIndex = getChildIndex(str);
        if (childIndex < 0) {
            iTitleBarActionCallback.onFail(-1, "no element");
            return;
        }
        AbsElementParser elementParser = DynamicTitleParser.getElementParser(dynamicTitleBarElementEntity.getType());
        if (elementParser == null) {
            iTitleBarActionCallback.onFail(-1, "not support: " + dynamicTitleBarElementEntity.getType());
            return;
        }
        Object tag = getTag(R.id.titans_dynamic_style_tag);
        Pair<View, LineTitleLayoutParams> parse = elementParser.parse(getContext(), null, tag instanceof BaseStyle ? (BaseStyle) tag : null, dynamicTitleBarElementEntity, resourceProvider);
        if (parse == null || parse.first == null) {
            iTitleBarActionCallback.onFail(-1, "parse error");
            return;
        }
        removeViewAt(childIndex);
        if (hasPrimary() && dynamicTitleBarElementEntity.isPrimary()) {
            iTitleBarActionCallback.onFail(-1, "only one primary supported");
            return;
        }
        addView((View) parse.first, childIndex, (ViewGroup.LayoutParams) parse.second);
        iTitleBarActionCallback.onSuccess();
    }

    public void addElement(String str, DynamicTitleBarElementEntity dynamicTitleBarElementEntity, DynamicTitleParser.ResourceProvider resourceProvider, ITitleBarActionCallback iTitleBarActionCallback) {
        Object[] objArr = {str, dynamicTitleBarElementEntity, resourceProvider, iTitleBarActionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55e04d0acfe5b29682888d7109d0233b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55e04d0acfe5b29682888d7109d0233b");
        } else if (getChildIndex(dynamicTitleBarElementEntity.getName()) >= 0) {
            iTitleBarActionCallback.onFail(-1, "exist " + dynamicTitleBarElementEntity.getName());
        } else {
            AbsElementParser elementParser = DynamicTitleParser.getElementParser(dynamicTitleBarElementEntity.getType());
            if (elementParser == null) {
                iTitleBarActionCallback.onFail(-1, "not support: " + dynamicTitleBarElementEntity.getType());
                return;
            }
            Object tag = getTag(R.id.titans_dynamic_style_tag);
            Pair<View, LineTitleLayoutParams> parse = elementParser.parse(getContext(), null, tag instanceof BaseStyle ? (BaseStyle) tag : null, dynamicTitleBarElementEntity, resourceProvider);
            if (parse == null || parse.first == null) {
                iTitleBarActionCallback.onFail(-1, "parse error");
                return;
            }
            if (str == null) {
                str = "";
            }
            addView((View) parse.first, getChildIndex(str), (ViewGroup.LayoutParams) parse.second);
            iTitleBarActionCallback.onSuccess();
        }
    }
}
