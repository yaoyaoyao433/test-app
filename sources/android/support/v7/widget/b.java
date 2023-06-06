package android.support.v7.widget;

import android.graphics.Outline;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
/* compiled from: ProGuard */
@RequiresApi(21)
/* loaded from: classes.dex */
public final class b extends a {
    public b(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(@NonNull Outline outline) {
        if (this.a.d) {
            if (this.a.c != null) {
                this.a.c.getOutline(outline);
            }
        } else if (this.a.a != null) {
            this.a.a.getOutline(outline);
        }
    }
}
