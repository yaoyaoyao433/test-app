package com.sankuai.model;

import android.content.Context;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.utils.Strings;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class BlobRequestBase<T> extends RequestBase<T> {
    protected static final long VALID = 1800000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final FileCache cache;

    @Override // com.sankuai.model.Request
    public Uri getDataUri() {
        return null;
    }

    @Override // com.sankuai.model.RequestBase
    public abstract String getUrl();

    public BlobRequestBase(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "916954848d222d459b78ceb5921504b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "916954848d222d459b78ceb5921504b9");
            return;
        }
        this.cache = new FileCache(context);
        setValid(1800000L);
    }

    public BlobRequestBase<T> setValid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7141ad8ffbe7e2361e0d08ff9d64440", RobustBitConfig.DEFAULT_VALUE)) {
            return (BlobRequestBase) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7141ad8ffbe7e2361e0d08ff9d64440");
        }
        this.cache.setValidity(j);
        return this;
    }

    @Override // com.sankuai.model.RequestBase
    public T local() throws IOException {
        InputStream inputStream;
        Throwable th;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "354296d3fe8c90a3a320e0a170e47b43", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "354296d3fe8c90a3a320e0a170e47b43");
        }
        this.cache.setKey(makeKey(getUrl()));
        try {
            inputStream = this.cache.get();
            try {
                if (!this.cache.hasCache() || inputStream == null) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return null;
                }
                T t = (T) this.gson.fromJson(Strings.toString(inputStream), getType());
                if (inputStream != null) {
                    inputStream.close();
                }
                return t;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            inputStream = null;
            th = th3;
        }
    }

    @Override // com.sankuai.model.RequestBase
    public void store(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf5784e370ab8e031ae55db30cc08bec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf5784e370ab8e031ae55db30cc08bec");
        } else if (t != null) {
            this.cache.setKey(makeKey(getUrl()));
            this.cache.save(new ByteArrayInputStream(this.gson.toJson(t).getBytes()));
        }
    }

    @Override // com.sankuai.model.Request
    public HttpUriRequest getHttpUriRequest() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ce64808703aada2c37895c75cb6eae5", RobustBitConfig.DEFAULT_VALUE) ? (HttpUriRequest) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ce64808703aada2c37895c75cb6eae5") : new HttpGet(getUrl());
    }

    @Override // com.sankuai.model.Request
    public boolean isLocalValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34611c0e4bbe8451b96e22ad4a6099a7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34611c0e4bbe8451b96e22ad4a6099a7")).booleanValue() : !this.cache.setKey(makeKey(getUrl())).isExpired();
    }

    public String makeKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0fbcf447ee92a86e18a0f99051a04b6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0fbcf447ee92a86e18a0f99051a04b6") : Strings.md5(str);
    }
}
