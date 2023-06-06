package android.support.design.widget;

import android.graphics.Outline;
import android.support.annotation.RequiresApi;
/* compiled from: ProGuard */
@RequiresApi(21)
/* loaded from: classes.dex */
public final class c extends b {
    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        copyBounds(this.b);
        outline.setOval(this.b);
    }
}
