package com.sankuai.model;

import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface Cache {
    InputStream get();

    long getLastModified();

    boolean hasCache();

    boolean isExpired();

    void removeCache();

    void save(InputStream inputStream);

    Cache setKey(String str);

    Cache setValidity(long j);

    void touch();
}
