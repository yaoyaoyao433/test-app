package com.meituan.android.singleton;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.meituan.retrofit2.raw.a;
import java.io.IOException;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.params.AbstractHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h implements HttpClient {
    public static ChangeQuickRedirect a;
    private a.InterfaceC0637a b;
    private final HttpParams c;

    public h(a.InterfaceC0637a interfaceC0637a) {
        Object[] objArr = {interfaceC0637a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b97262b73d47986977f46369effac7cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b97262b73d47986977f46369effac7cb");
            return;
        }
        this.c = new AbstractHttpParams() { // from class: com.meituan.android.singleton.h.1
            public static ChangeQuickRedirect a;

            public final Object getParameter(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "409159718f26881697e92539152216a8", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "409159718f26881697e92539152216a8");
                }
                if (str.equals("http.route.default-proxy")) {
                    return null;
                }
                throw new IllegalArgumentException(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final HttpParams setParameter(String str, Object obj) {
                Object[] objArr2 = {str, obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "029fc188b3c9bd9e6f03eb3d6f1f93be", RobustBitConfig.DEFAULT_VALUE)) {
                    return (HttpParams) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "029fc188b3c9bd9e6f03eb3d6f1f93be");
                }
                if (str.equals("http.route.default-proxy")) {
                    return this;
                }
                throw new IllegalArgumentException(str);
            }

            public final HttpParams copy() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd452a543266eb45e60e89ec6aa5590b", RobustBitConfig.DEFAULT_VALUE)) {
                    return (HttpParams) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd452a543266eb45e60e89ec6aa5590b");
                }
                throw new UnsupportedOperationException();
            }

            public final boolean removeParameter(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "508c685a376883251b3b1ad58d4894dc", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "508c685a376883251b3b1ad58d4894dc")).booleanValue();
                }
                throw new UnsupportedOperationException();
            }
        };
        this.b = interfaceC0637a;
    }

    public final HttpParams getParams() {
        return this.c;
    }

    public final ClientConnectionManager getConnectionManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "778b9298ffe9a4191486c61dd5e5779a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ClientConnectionManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "778b9298ffe9a4191486c61dd5e5779a");
        }
        throw new UnsupportedOperationException();
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest) throws IOException {
        Object[] objArr = {httpUriRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd0734955f898b2984f066fe37755c61", RobustBitConfig.DEFAULT_VALUE) ? (HttpResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd0734955f898b2984f066fe37755c61") : execute((HttpHost) null, (HttpRequest) httpUriRequest, (HttpContext) null);
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        Object[] objArr = {httpUriRequest, httpContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51df415850799fdf05f46034a900dadd", RobustBitConfig.DEFAULT_VALUE) ? (HttpResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51df415850799fdf05f46034a900dadd") : execute((HttpHost) null, (HttpRequest) httpUriRequest, httpContext);
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        Object[] objArr = {httpHost, httpRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27971fedf4bf3cd224b787a4210afd37", RobustBitConfig.DEFAULT_VALUE) ? (HttpResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27971fedf4bf3cd224b787a4210afd37") : execute(httpHost, httpRequest, (HttpContext) null);
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        Header[] allHeaders;
        ak akVar;
        aj a2;
        Object[] objArr = {httpHost, httpRequest, httpContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17cc5234a5bf00e36a3707d7cac52db5", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17cc5234a5bf00e36a3707d7cac52db5");
        }
        Object[] objArr2 = {httpRequest};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8106ec219e96cc7f0357cdb6cb7b2684", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (aj) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8106ec219e96cc7f0357cdb6cb7b2684");
        } else {
            aj.a aVar = new aj.a();
            RequestLine requestLine = httpRequest.getRequestLine();
            aVar.a(requestLine.getMethod());
            aVar.b(requestLine.getUri());
            String str = null;
            for (Header header : httpRequest.getAllHeaders()) {
                String name = header.getName();
                if ("Content-Type".equalsIgnoreCase(name)) {
                    str = header.getValue();
                } else {
                    aVar.a(name, header.getValue());
                }
            }
            if (httpRequest instanceof HttpEntityEnclosingRequest) {
                HttpEntity entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
                if (entity != null) {
                    j jVar = new j(entity, str);
                    Header contentEncoding = entity.getContentEncoding();
                    if (contentEncoding != null) {
                        aVar.a(contentEncoding.getName(), contentEncoding.getValue());
                    }
                    akVar = jVar;
                } else {
                    akVar = al.a(new byte[0], (String) null);
                }
            } else {
                akVar = null;
            }
            aVar.a(akVar);
            a2 = aVar.a();
        }
        com.sankuai.meituan.retrofit2.raw.b execute = this.b.get(a2).execute();
        Object[] objArr3 = {execute};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "862865b71e19e04f010a962109f3324d", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpResponse) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "862865b71e19e04f010a962109f3324d");
        }
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(HttpVersion.HTTP_1_1, execute.code(), execute.reason());
        ap body = execute.body();
        InputStreamEntity inputStreamEntity = new InputStreamEntity(body.source(), body.contentLength());
        basicHttpResponse.setEntity(inputStreamEntity);
        List<q> headers = execute.headers();
        if ((headers != null) & (headers.size() > 0)) {
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                q qVar = headers.get(i);
                if (qVar != null) {
                    String a3 = qVar.a();
                    String b = qVar.b();
                    basicHttpResponse.addHeader(a3, b);
                    if ("Content-Type".equalsIgnoreCase(a3)) {
                        inputStreamEntity.setContentType(b);
                    } else if ("Content-Encoding".equalsIgnoreCase(a3)) {
                        inputStreamEntity.setContentEncoding(b);
                    }
                }
            }
        }
        return basicHttpResponse;
    }

    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        Object[] objArr = {httpUriRequest, responseHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab4e64cc77646b488e21c2b3e9a0ef0", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab4e64cc77646b488e21c2b3e9a0ef0") : (T) execute(null, httpUriRequest, responseHandler, null);
    }

    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        Object[] objArr = {httpUriRequest, responseHandler, httpContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75895f6a0a3ea2b61d9a123b6546ba2d", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75895f6a0a3ea2b61d9a123b6546ba2d") : (T) execute(null, httpUriRequest, responseHandler, httpContext);
    }

    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        Object[] objArr = {httpHost, httpRequest, responseHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "026da28e9092471cb8437442b18b1b49", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "026da28e9092471cb8437442b18b1b49") : (T) execute(httpHost, httpRequest, responseHandler, null);
    }

    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        Object[] objArr = {httpHost, httpRequest, responseHandler, httpContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55b3490ce23e92c413b18c9e6427b7b1", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55b3490ce23e92c413b18c9e6427b7b1") : (T) responseHandler.handleResponse(execute(httpHost, httpRequest, httpContext));
    }
}
