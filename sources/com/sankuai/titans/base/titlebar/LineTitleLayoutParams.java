package com.sankuai.titans.base.titlebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LineTitleLayoutParams extends ViewGroup.LayoutParams {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String action;
    public String name;
    public boolean primary;
    public boolean primaryFillRest;
    public double widthPercent;

    public LineTitleLayoutParams(Context context, AttributeSet attributeSet) {
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

    public LineTitleLayoutParams(int i, int i2) {
        super(i, i2);
    }

    public LineTitleLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        if (layoutParams instanceof LineTitleLayoutParams) {
            LineTitleLayoutParams lineTitleLayoutParams = (LineTitleLayoutParams) layoutParams;
            this.name = lineTitleLayoutParams.name;
            this.action = lineTitleLayoutParams.action;
            this.primary = lineTitleLayoutParams.primary;
            this.primaryFillRest = lineTitleLayoutParams.primaryFillRest;
            this.widthPercent = lineTitleLayoutParams.widthPercent;
        }
    }
}
