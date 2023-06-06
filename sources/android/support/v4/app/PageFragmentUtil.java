package android.support.v4.app;

import android.support.annotation.RestrictTo;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class PageFragmentUtil {
    public static boolean haveChildFragmentManager(Fragment fragment) {
        return fragment.peekChildFragmentManager() != null;
    }
}
