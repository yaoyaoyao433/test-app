package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.support.constraint.solver.widgets.j;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.common.CommonConstant;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class ConstraintHelper extends View {
    protected int[] a;
    protected int b;
    protected Context c;
    protected j d;
    protected boolean e;
    private String f;

    public void b(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public ConstraintHelper(Context context) {
        super(context);
        this.a = new int[32];
        this.e = false;
        this.c = context;
        a((AttributeSet) null);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new int[32];
        this.e = false;
        this.c = context;
        a(attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f = obtainStyledAttributes.getString(index);
                    setIds(this.f);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.a, this.b);
    }

    public void setReferencedIds(int[] iArr) {
        this.b = 0;
        for (int i : iArr) {
            setTag(i, null);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        if (this.b + 1 > this.a.length) {
            this.a = Arrays.copyOf(this.a, this.a.length * 2);
        }
        this.a[this.b] = i;
        this.b++;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public final void a() {
        if (this.d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).al = this.d;
        }
    }

    private void a(String str) {
        int i;
        Object a;
        if (str == null || this.c == null) {
            return;
        }
        String trim = str.trim();
        try {
            i = R.id.class.getField(trim).getInt(null);
        } catch (Exception unused) {
            i = 0;
        }
        if (i == 0) {
            i = this.c.getResources().getIdentifier(trim, "id", this.c.getPackageName());
        }
        if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (a = ((ConstraintLayout) getParent()).a(0, trim)) != null && (a instanceof Integer)) {
            i = ((Integer) a).intValue();
        }
        if (i != 0) {
            setTag(i, null);
            return;
        }
        StringBuilder sb = new StringBuilder("Could not find id of \"");
        sb.append(trim);
        sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
    }

    private void setIds(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f);
        }
        if (this.d == null) {
            return;
        }
        this.d.A();
        for (int i = 0; i < this.b; i++) {
            View a = constraintLayout.a(this.a[i]);
            if (a != null) {
                this.d.a(constraintLayout.a(a));
            }
        }
    }
}
