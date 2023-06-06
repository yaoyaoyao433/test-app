package android.support.transition;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
/* compiled from: ProGuard */
@RequiresApi(18)
/* loaded from: classes.dex */
public final class ab implements ac {
    private final ViewGroupOverlay a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ab(@NonNull ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    @Override // android.support.transition.aj
    public final void a(@NonNull Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // android.support.transition.aj
    public final void b(@NonNull Drawable drawable) {
        this.a.remove(drawable);
    }

    @Override // android.support.transition.ac
    public final void a(@NonNull View view) {
        this.a.add(view);
    }

    @Override // android.support.transition.ac
    public final void b(@NonNull View view) {
        this.a.remove(view);
    }
}
