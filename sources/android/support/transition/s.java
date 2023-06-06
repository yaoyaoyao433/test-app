package android.support.transition;

import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class s {
    ViewGroup a;
    Runnable b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s a(View view) {
        return (s) view.getTag(R.id.transition_current_scene);
    }
}
