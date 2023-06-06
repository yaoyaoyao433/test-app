package dianping.com.remoteshark;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    private static volatile a a;

    public static a a(Context context) {
        if (a == null) {
            try {
                a = (a) Class.forName("dianping.com.idleshark.IdleShark").getMethod("instance", Context.class).invoke(null, context);
            } catch (Throwable th) {
                new StringBuilder("err: ").append(th.getMessage());
            }
        }
        if (a == null || a.a()) {
            return a;
        }
        return null;
    }
}
