package com.meituan.mtwebkit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTWebResourceResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mEncoding;
    private boolean mImmutable;
    private InputStream mInputStream;
    private String mMimeType;
    private String mReasonPhrase;
    private Map<String, String> mResponseHeaders;
    private int mStatusCode;

    public MTWebResourceResponse(String str, String str2, InputStream inputStream) {
        Object[] objArr = {str, str2, inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d785ec1a542f54fcaccb67be57b443c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d785ec1a542f54fcaccb67be57b443c");
            return;
        }
        this.mMimeType = str;
        this.mEncoding = str2;
        setData(inputStream);
    }

    public MTWebResourceResponse(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        this(str, str2, inputStream);
        Object[] objArr = {str, str2, Integer.valueOf(i), str3, map, inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e88aeb722aefd4424433f8f76e422262", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e88aeb722aefd4424433f8f76e422262");
            return;
        }
        setStatusCodeAndReasonPhrase(i, str3);
        setResponseHeaders(map);
    }

    public void setMimeType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d67afc6595c0caa37c284c7a02d3197", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d67afc6595c0caa37c284c7a02d3197");
            return;
        }
        checkImmutable();
        this.mMimeType = str;
    }

    public String getMimeType() {
        return this.mMimeType;
    }

    public void setEncoding(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e50ba5b4a4e327566c481b2a2780eb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e50ba5b4a4e327566c481b2a2780eb4");
            return;
        }
        checkImmutable();
        this.mEncoding = str;
    }

    public String getEncoding() {
        return this.mEncoding;
    }

    public void setStatusCodeAndReasonPhrase(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b73640ef017cfb8936e54ea0d4679384", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b73640ef017cfb8936e54ea0d4679384");
            return;
        }
        checkImmutable();
        if (i < 100) {
            throw new IllegalArgumentException("statusCode can't be less than 100.");
        }
        if (i > 599) {
            throw new IllegalArgumentException("statusCode can't be greater than 599.");
        }
        if (i > 299 && i < 400) {
            throw new IllegalArgumentException("statusCode can't be in the [300, 399] range.");
        }
        if (str == null) {
            throw new IllegalArgumentException("reasonPhrase can't be null.");
        }
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException("reasonPhrase can't be empty.");
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) > 127) {
                throw new IllegalArgumentException("reasonPhrase can't contain non-ASCII characters.");
            }
        }
        this.mStatusCode = i;
        this.mReasonPhrase = str;
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public String getReasonPhrase() {
        return this.mReasonPhrase;
    }

    public void setResponseHeaders(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c55aa8e3e4f1ed8134573be1b0d6fa26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c55aa8e3e4f1ed8134573be1b0d6fa26");
            return;
        }
        checkImmutable();
        this.mResponseHeaders = map;
    }

    public Map<String, String> getResponseHeaders() {
        return this.mResponseHeaders;
    }

    public void setData(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a376f42ab79ceccd39d479cf15e1f89f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a376f42ab79ceccd39d479cf15e1f89f");
            return;
        }
        checkImmutable();
        if (inputStream != null && StringBufferInputStream.class.isAssignableFrom(inputStream.getClass())) {
            throw new IllegalArgumentException("StringBufferInputStream is deprecated and must not be passed to a MTWebResourceResponse");
        }
        this.mInputStream = inputStream;
    }

    public InputStream getData() {
        return this.mInputStream;
    }

    public MTWebResourceResponse(boolean z, String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2, Integer.valueOf(i), str3, map, inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a8bd6724e1fa16910bbcb059be9f743", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a8bd6724e1fa16910bbcb059be9f743");
            return;
        }
        this.mImmutable = z;
        this.mMimeType = str;
        this.mEncoding = str2;
        this.mStatusCode = i;
        this.mReasonPhrase = str3;
        this.mResponseHeaders = map;
        this.mInputStream = inputStream;
    }

    private void checkImmutable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2a499ef6f2de5cc8372d2ab4d43f0c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2a499ef6f2de5cc8372d2ab4d43f0c0");
        } else if (this.mImmutable) {
            throw new IllegalStateException("This MTWebResourceResponse instance is immutable");
        }
    }
}
