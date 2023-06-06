package retrofit.client;

import com.meituan.metrics.traffic.reflection.ApacheHttpWrapper;
import com.meituan.passport.UserCenter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedOutput;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class ApacheClient implements Client {
    private final HttpClient client;

    private static HttpClient createDefaultClient() {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, UserCenter.TYPE_LOGOUT_NEGATIVE);
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(basicHttpParams);
        ApacheHttpWrapper.addRequestAndResponseInterceptor(defaultHttpClient);
        ApacheHttpWrapper.addRequestAndResponseInterceptor(defaultHttpClient);
        return defaultHttpClient;
    }

    public ApacheClient() {
        this(createDefaultClient());
    }

    public ApacheClient(HttpClient httpClient) {
        this.client = httpClient;
    }

    @Override // retrofit.client.Client
    public Response execute(Request request) throws IOException {
        return parseResponse(request.getUrl(), execute(this.client, createRequest(request)));
    }

    protected HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return httpClient.execute(httpUriRequest);
    }

    static HttpUriRequest createRequest(Request request) {
        if (request.getBody() != null) {
            return new GenericEntityHttpRequest(request);
        }
        return new GenericHttpRequest(request);
    }

    static Response parseResponse(String str, HttpResponse httpResponse) throws IOException {
        org.apache.http.Header[] allHeaders;
        StatusLine statusLine = httpResponse.getStatusLine();
        int statusCode = statusLine.getStatusCode();
        String reasonPhrase = statusLine.getReasonPhrase();
        ArrayList arrayList = new ArrayList();
        String str2 = "application/octet-stream";
        for (org.apache.http.Header header : httpResponse.getAllHeaders()) {
            String name = header.getName();
            String value = header.getValue();
            if ("Content-Type".equalsIgnoreCase(name)) {
                str2 = value;
            }
            arrayList.add(new Header(name, value));
        }
        HttpEntity entity = httpResponse.getEntity();
        return new Response(str, statusCode, reasonPhrase, arrayList, entity != null ? new TypedByteArray(str2, EntityUtils.toByteArray(entity)) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class GenericHttpRequest extends HttpRequestBase {
        private final String method;

        public GenericHttpRequest(Request request) {
            this.method = request.getMethod();
            setURI(URI.create(request.getUrl()));
            for (Header header : request.getHeaders()) {
                addHeader(new BasicHeader(header.getName(), header.getValue()));
            }
        }

        public String getMethod() {
            return this.method;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class GenericEntityHttpRequest extends HttpEntityEnclosingRequestBase {
        private final String method;

        GenericEntityHttpRequest(Request request) {
            this.method = request.getMethod();
            setURI(URI.create(request.getUrl()));
            for (Header header : request.getHeaders()) {
                addHeader(new BasicHeader(header.getName(), header.getValue()));
            }
            setEntity(new TypedOutputEntity(request.getBody()));
        }

        public String getMethod() {
            return this.method;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static class TypedOutputEntity extends AbstractHttpEntity {
        final TypedOutput typedOutput;

        public boolean isRepeatable() {
            return true;
        }

        public boolean isStreaming() {
            return false;
        }

        TypedOutputEntity(TypedOutput typedOutput) {
            this.typedOutput = typedOutput;
            setContentType(typedOutput.mimeType());
        }

        public long getContentLength() {
            return this.typedOutput.length();
        }

        public InputStream getContent() throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.typedOutput.writeTo(byteArrayOutputStream);
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            this.typedOutput.writeTo(outputStream);
        }
    }
}
