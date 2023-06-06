package android.support.transition;

import android.os.Build;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ad {
    private static final ag a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            a = new af();
        } else {
            a = new ae();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ac a(@NonNull ViewGroup viewGroup) {
        return a.a(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@NonNull ViewGroup viewGroup, boolean z) {
        a.a(viewGroup, z);
    }
}
