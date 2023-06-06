package android.support.transition;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.ViewOverlay;
/* compiled from: ProGuard */
@RequiresApi(18)
/* loaded from: classes.dex */
public final class ai implements aj {
    private final ViewOverlay a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ai(@NonNull View view) {
        this.a = view.getOverlay();
    }

    @Override // android.support.transition.aj
    public final void a(@NonNull Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // android.support.transition.aj
    public final void b(@NonNull Drawable drawable) {
        this.a.remove(drawable);
    }
}
