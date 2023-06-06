package android.support.constraint;

import android.content.Context;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.constraint.ConstraintHelper
    public final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.e = false;
    }

    @Override // android.support.constraint.ConstraintHelper
    public final void a(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.b; i++) {
            View a = constraintLayout.a(this.a[i]);
            if (a != null) {
                a.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    a.setElevation(elevation);
                }
            }
        }
    }

    @Override // android.support.constraint.ConstraintHelper
    public final void b(ConstraintLayout constraintLayout) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.al.e(0);
        aVar.al.f(0);
    }
}
