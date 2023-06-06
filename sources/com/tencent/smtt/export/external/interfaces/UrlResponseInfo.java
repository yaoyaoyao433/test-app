package com.tencent.smtt.export.external.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public abstract class UrlResponseInfo {

    /* loaded from: classes6.dex */
    public static abstract class HeaderBlock {
        public abstract List<Map.Entry<String, String>> getAsList();

        public abstract Map<String, List<String>> getAsMap();
    }

    public abstract Map<String, List<String>> getAllHeaders();

    public abstract List<Map.Entry<String, String>> getAllHeadersAsList();

    public abstract int getHttpStatusCode();

    public abstract String getHttpStatusText();

    public abstract String getNegotiatedProtocol();

    public abstract String getProxyServer();

    public abstract long getReceivedByteCount();

    public Map<String, List<String>> getRequestHeaders() {
        return new HashMap();
    }

    public String getServerIP() {
        return "";
    }

    public abstract String getUrl();

    public abstract List<String> getUrlChain();

    public abstract boolean wasCached();
}
