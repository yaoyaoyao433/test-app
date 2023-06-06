package android.support.transition;

import android.os.IBinder;
import android.support.annotation.RequiresApi;
/* compiled from: ProGuard */
@RequiresApi(14)
/* loaded from: classes.dex */
public final class ar implements at {
    private final IBinder a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ar(IBinder iBinder) {
        this.a = iBinder;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ar) && ((ar) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
