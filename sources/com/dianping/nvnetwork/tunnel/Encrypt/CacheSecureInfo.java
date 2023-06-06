package com.dianping.nvnetwork.tunnel.Encrypt;
/* loaded from: classes.dex */
public interface CacheSecureInfo {
    String getSecureKey();

    String readSecureInfoFromCache();

    void removeSecureInfoFromCache();

    void writeSecureInfo2Cache(String str);
}
