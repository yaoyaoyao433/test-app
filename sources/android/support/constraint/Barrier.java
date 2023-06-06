package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.constraint.solver.widgets.b;
import android.util.AttributeSet;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class Barrier extends ConstraintHelper {
    private int f;
    private int g;
    private b h;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public int getType() {
        return this.f;
    }

    public void setType(int i) {
        this.f = i;
        this.g = i;
        if (Build.VERSION.SDK_INT < 17) {
            if (this.f == 5) {
                this.g = 0;
            } else if (this.f == 6) {
                this.g = 1;
            }
        } else {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                if (this.f == 5) {
                    this.g = 1;
                } else if (this.f == 6) {
                    this.g = 0;
                }
            } else if (this.f == 5) {
                this.g = 0;
            } else if (this.f == 6) {
                this.g = 1;
            }
        }
        this.h.a = this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.constraint.ConstraintHelper
    public final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.h = new b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.h.b = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.d = this.h;
        a();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.h.b = z;
    }
}
