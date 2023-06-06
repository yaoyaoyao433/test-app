package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.RestrictTo;
import android.support.v7.widget.z;
import android.util.AttributeSet;
import android.widget.LinearLayout;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements z {
    private z.a a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.support.v7.widget.z
    public void setOnFitSystemWindowsListener(z.a aVar) {
        this.a = aVar;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (this.a != null) {
            this.a.a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
