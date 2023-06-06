package com.facebook.react.views.progressbar;

import android.support.annotation.Nullable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.c;
import com.facebook.yoga.d;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ProgressBarShadowNode extends LayoutShadowNode implements YogaMeasureFunction {
    private String a = "Normal";
    private final SparseIntArray b = new SparseIntArray();
    private final SparseIntArray c = new SparseIntArray();
    private final Set<Integer> d = new HashSet();

    public ProgressBarShadowNode() {
        setMeasureFunction(this);
    }

    @ReactProp(name = "styleAttr")
    public void setStyle(@Nullable String str) {
        if (str == null) {
            str = "Normal";
        }
        this.a = str;
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(this.a);
        if (!this.d.contains(Integer.valueOf(styleFromString))) {
            ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(getThemedContext(), styleFromString);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            createProgressBar.measure(makeMeasureSpec, makeMeasureSpec);
            this.b.put(styleFromString, createProgressBar.getMeasuredHeight());
            this.c.put(styleFromString, createProgressBar.getMeasuredWidth());
            this.d.add(Integer.valueOf(styleFromString));
        }
        return c.a(this.c.get(styleFromString), this.b.get(styleFromString));
    }
}
