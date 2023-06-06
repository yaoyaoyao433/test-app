package okhttp3;

import com.meituan.robust.common.CommonConstant;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import okio.f;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        return basic(str, str2, Util.ISO_8859_1);
    }

    public static String basic(String str, String str2, Charset charset) {
        String b = f.a(str + CommonConstant.Symbol.COLON + str2, charset).b();
        return "Basic " + b;
    }
}
