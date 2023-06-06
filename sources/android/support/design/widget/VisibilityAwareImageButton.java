package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class VisibilityAwareImageButton extends ImageButton {
    private int a;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    private VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = getVisibility();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        a(i, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.a = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getUserSetVisibility() {
        return this.a;
    }
}
