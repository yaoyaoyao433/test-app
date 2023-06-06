package com.sankuai.model;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.Request;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class RequestBaseAdapter<T> extends RequestBase<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected static ExceptionObserver exceptionObserver;
    private boolean needRetry;
    protected String url;

    @Override // com.sankuai.model.Request
    public Uri getDataUri() {
        return null;
    }

    @Override // com.sankuai.model.Request
    public boolean isLocalValid() {
        return false;
    }

    @Override // com.sankuai.model.RequestBase
    public T local() throws IOException {
        return null;
    }

    @Override // com.sankuai.model.RequestBase
    public void store(T t) {
    }

    public RequestBaseAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "987d2df526c9c9cca0d7693da193c368", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "987d2df526c9c9cca0d7693da193c368");
        } else {
            this.needRetry = true;
        }
    }

    public T execute() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8b939b9d61d8d393c14c7084e8be048", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8b939b9d61d8d393c14c7084e8be048") : execute(Request.Origin.NET);
    }

    public HttpUriRequest buildFormEntityRequest(String str, List<BasicNameValuePair> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb0fe034676eb5769d8c2ba9e24d342d", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpUriRequest) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb0fe034676eb5769d8c2ba9e24d342d");
        }
        HttpPost httpPost = new HttpPost(str);
        HttpEntity httpEntity = null;
        try {
            httpEntity = new UrlEncodedFormEntity(list, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        httpPost.setEntity(httpEntity);
        return httpPost;
    }

    public HttpUriRequest buildStringEntityRequest(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "679cc45da3cd49f8cd843991963449c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpUriRequest) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "679cc45da3cd49f8cd843991963449c9");
        }
        HttpPost httpPost = new HttpPost(str);
        HttpEntity httpEntity = null;
        try {
            httpEntity = new StringEntity(str2, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        httpPost.setEntity(httpEntity);
        return httpPost;
    }

    public static void setExceptionObserver(ExceptionObserver exceptionObserver2) {
        exceptionObserver = exceptionObserver2;
    }

    @Override // com.sankuai.model.RequestBase, com.sankuai.model.Request
    public T execute(Request.Origin origin) throws IOException {
        Object[] objArr = {origin};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e61e554e71b211ccf3373da2bf618f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e61e554e71b211ccf3373da2bf618f7");
        }
        try {
            return (T) super.execute(origin);
        } catch (SSLHandshakeException e) {
            throw e;
        } catch (IOException e2) {
            if (this.needRetry && !TextUtils.isEmpty(this.url) && this.url.contains(AbsApiFactory.HTTPS)) {
                if (exceptionObserver != null) {
                    exceptionObserver.onHttpsRetryException(e2);
                }
                this.needRetry = false;
                this.url = this.url.replace(AbsApiFactory.HTTPS, AbsApiFactory.HTTP);
                return (T) super.execute(origin);
            }
            throw e2;
        } catch (HttpResponseException e3) {
            throw e3;
        }
    }
}
