package io.socket.client;

import com.meituan.robust.common.CommonConstant;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class g {
    private static Pattern a = Pattern.compile("^http|ws$");
    private static Pattern b = Pattern.compile("^(http|ws)s$");

    public static URL a(URI uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String scheme = uri.getScheme();
        scheme = (scheme == null || !scheme.matches("^https?|wss?$")) ? "https" : "https";
        int port = uri.getPort();
        if (port == -1) {
            if (a.matcher(scheme).matches()) {
                port = 80;
            } else if (b.matcher(scheme).matches()) {
                port = 443;
            }
        }
        String rawPath = uri.getRawPath();
        rawPath = (rawPath == null || rawPath.length() == 0) ? "/" : "/";
        String rawUserInfo = uri.getRawUserInfo();
        String rawQuery = uri.getRawQuery();
        String rawFragment = uri.getRawFragment();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(scheme);
            sb.append("://");
            if (rawUserInfo != null) {
                str = rawUserInfo + "@";
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(uri.getHost());
            if (port != -1) {
                str2 = CommonConstant.Symbol.COLON + port;
            } else {
                str2 = "";
            }
            sb.append(str2);
            sb.append(rawPath);
            if (rawQuery != null) {
                str3 = CommonConstant.Symbol.QUESTION_MARK + rawQuery;
            } else {
                str3 = "";
            }
            sb.append(str3);
            if (rawFragment != null) {
                str4 = "#" + rawFragment;
            } else {
                str4 = "";
            }
            sb.append(str4);
            return new URL(sb.toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static String a(URL url) {
        String protocol = url.getProtocol();
        int port = url.getPort();
        if (port == -1) {
            if (a.matcher(protocol).matches()) {
                port = 80;
            } else if (b.matcher(protocol).matches()) {
                port = 443;
            }
        }
        return protocol + "://" + url.getHost() + CommonConstant.Symbol.COLON + port;
    }
}
