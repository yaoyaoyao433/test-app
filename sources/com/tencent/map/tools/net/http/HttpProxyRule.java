package com.tencent.map.tools.net.http;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class HttpProxyRule extends JsonComposer {
    @Json(name = "domain")
    public String domain;
    @Json(name = "proxy_domain")
    public String proxyDomain;

    public String replaceHost(String str) {
        String host;
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        return (scheme == null || !scheme.startsWith("http") || (host = parse.getHost()) == null || TextUtils.isEmpty(host) || !host.matches(this.domain)) ? str : parse.buildUpon().encodedAuthority(this.proxyDomain).build().toString();
    }

    public boolean match(String str) {
        Uri parse;
        String scheme;
        String host;
        if (str == null || (scheme = (parse = Uri.parse(str)).getScheme()) == null || !scheme.startsWith("http") || (host = parse.getHost()) == null || TextUtils.isEmpty(host)) {
            return false;
        }
        return host.matches(this.domain);
    }
}
