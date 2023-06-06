package io.socket.global;

import com.meituan.robust.common.CommonConstant;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a {
    public static String a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20").replace("%21", "!").replace("%27", CommonConstant.Symbol.SINGLE_QUOTES).replace("%28", CommonConstant.Symbol.BRACKET_LEFT).replace("%29", CommonConstant.Symbol.BRACKET_RIGHT).replace("%7E", "~");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String b(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
