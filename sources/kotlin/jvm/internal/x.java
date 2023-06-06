package kotlin.jvm.internal;

import com.meituan.robust.common.StringUtil;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class x {
    private static <T extends Throwable> T a(T t) {
        return (T) h.a((Throwable) t, x.class.getName());
    }

    private static void a(Object obj, String str) {
        String name = obj == null ? StringUtil.NULL : obj.getClass().getName();
        throw ((ClassCastException) a(new ClassCastException(name + " cannot be cast to " + str)));
    }

    public static Set a(Object obj) {
        if ((obj instanceof kotlin.jvm.internal.markers.a) && !(obj instanceof kotlin.jvm.internal.markers.e)) {
            a(obj, "kotlin.collections.MutableSet");
        }
        return c(obj);
    }

    private static Set c(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw ((ClassCastException) a(e));
        }
    }

    public static Map b(Object obj) {
        if ((obj instanceof kotlin.jvm.internal.markers.a) && !(obj instanceof kotlin.jvm.internal.markers.d)) {
            a(obj, "kotlin.collections.MutableMap");
        }
        return d(obj);
    }

    private static Map d(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw ((ClassCastException) a(e));
        }
    }
}
