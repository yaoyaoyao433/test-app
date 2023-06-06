package com.sankuai.meituan.retrofit2;

import java.io.IOException;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ak {
    long contentLength();

    String contentType();

    void writeTo(OutputStream outputStream) throws IOException;
}
