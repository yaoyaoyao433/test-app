package org.apache.http.entity.mime.content;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface ContentDescriptor {
    String getCharset();

    long getContentLength();

    String getMediaType();

    String getMimeType();

    String getSubType();

    String getTransferEncoding();
}
