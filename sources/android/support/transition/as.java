package android.support.transition;

import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.WindowId;
/* compiled from: ProGuard */
@RequiresApi(18)
/* loaded from: classes.dex */
public final class as implements at {
    private final WindowId a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public as(@NonNull View view) {
        this.a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof as) && ((as) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
