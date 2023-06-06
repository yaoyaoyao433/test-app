package com.facebook.react.devsupport;

import android.content.Context;
import android.support.annotation.Nullable;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    static String a = "DevSupportManagerImpl";

    public static com.facebook.react.devsupport.interfaces.b a(Context context, d dVar, @Nullable String str, boolean z, @Nullable e eVar, @Nullable com.facebook.react.devsupport.interfaces.a aVar, int i, @Nullable Map<String, com.facebook.react.packagerconnection.a> map) {
        if (!z) {
            return new b();
        }
        try {
            return (com.facebook.react.devsupport.interfaces.b) Class.forName("com.facebook.react.devsupport." + a).getConstructor(Context.class, d.class, String.class, Boolean.TYPE, e.class, com.facebook.react.devsupport.interfaces.a.class, Integer.TYPE, Map.class).newInstance(context, dVar, str, Boolean.TRUE, eVar, aVar, Integer.valueOf(i), map);
        } catch (Exception e) {
            com.facebook.common.logging.a.d("[DevSupportManagerFactory@create]", "", e);
            return new b();
        }
    }
}
