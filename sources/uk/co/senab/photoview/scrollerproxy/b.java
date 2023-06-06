package uk.co.senab.photoview.scrollerproxy;

import android.annotation.TargetApi;
import android.content.Context;
/* compiled from: ProGuard */
@TargetApi(14)
/* loaded from: classes7.dex */
public final class b extends a {
    public b(Context context) {
        super(context);
    }

    @Override // uk.co.senab.photoview.scrollerproxy.a, uk.co.senab.photoview.scrollerproxy.d
    public final boolean a() {
        return this.a.computeScrollOffset();
    }
}
