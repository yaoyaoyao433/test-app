package retrofit.client;

import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.passport.UserCenter;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class UrlConnectionClient implements Client {
    private static final int CHUNK_SIZE = 4096;

    @Override // retrofit.client.Client
    public Response execute(Request request) throws IOException {
        HttpURLConnection openConnection = openConnection(request);
        prepareRequest(openConnection, request);
        return readResponse(openConnection);
    }

    protected HttpURLConnection openConnection(Request request) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(request.getUrl()).openConnection());
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(UserCenter.TYPE_LOGOUT_NEGATIVE);
        return httpURLConnection;
    }

    void prepareRequest(HttpURLConnection httpURLConnection, Request request) throws IOException {
        httpURLConnection.setRequestMethod(request.getMethod());
        httpURLConnection.setDoInput(true);
        for (Header header : request.getHeaders()) {
            httpURLConnection.addRequestProperty(header.getName(), header.getValue());
        }
        TypedOutput body = request.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", body.mimeType());
            long length = body.length();
            if (length != -1) {
                httpURLConnection.setFixedLengthStreamingMode((int) length);
                httpURLConnection.addRequestProperty("Content-Length", String.valueOf(length));
            } else {
                httpURLConnection.setChunkedStreamingMode(4096);
            }
            body.writeTo(httpURLConnection.getOutputStream());
        }
    }

    Response readResponse(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        int responseCode = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        if (responseMessage == null) {
            responseMessage = "";
        }
        String str = responseMessage;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            String key = entry.getKey();
            for (String str2 : entry.getValue()) {
                arrayList.add(new Header(key, str2));
            }
        }
        String contentType = httpURLConnection.getContentType();
        int contentLength = httpURLConnection.getContentLength();
        if (responseCode >= 400) {
            inputStream = httpURLConnection.getErrorStream();
        } else {
            inputStream = httpURLConnection.getInputStream();
        }
        return new Response(httpURLConnection.getURL().toString(), responseCode, str, arrayList, new TypedInputStream(contentType, contentLength, inputStream));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class TypedInputStream implements TypedInput {
        private final long length;
        private final String mimeType;
        private final InputStream stream;

        private TypedInputStream(String str, long j, InputStream inputStream) {
            this.mimeType = str;
            this.length = j;
            this.stream = inputStream;
        }

        @Override // retrofit.mime.TypedInput
        public String mimeType() {
            return this.mimeType;
        }

        @Override // retrofit.mime.TypedInput
        public long length() {
            return this.length;
        }

        @Override // retrofit.mime.TypedInput
        public InputStream in() throws IOException {
            return this.stream;
        }
    }
}
