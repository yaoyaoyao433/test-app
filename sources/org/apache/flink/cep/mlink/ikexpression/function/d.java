package org.apache.flink.cep.mlink.ikexpression.function;

import android.content.Context;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class d {
    static InputStream a;

    public static void a(Context context, String str) {
        try {
            a = context.getResources().getAssets().open(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
