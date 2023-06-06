package retrofit.client;

import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.sankuai.waimai.launcher.util.aop.b;
import com.squareup.okhttp.aa;
import com.squareup.okhttp.r;
import com.squareup.okhttp.u;
import com.squareup.okhttp.v;
import com.squareup.okhttp.x;
import com.squareup.okhttp.y;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okio.d;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class OkClient implements Client {
    private final v client;

    private static v generateDefaultOkHttp() {
        v vVar = new v();
        OkHttp2Wrapper.addInterceptorToClient(vVar);
        v a = b.a(vVar);
        a.a(15000L, TimeUnit.MILLISECONDS);
        a.b(20000L, TimeUnit.MILLISECONDS);
        return a;
    }

    public OkClient() {
        this(generateDefaultOkHttp());
    }

    public OkClient(v vVar) {
        if (vVar == null) {
            throw new NullPointerException("client == null");
        }
        this.client = vVar;
    }

    @Override // retrofit.client.Client
    public Response execute(Request request) throws IOException {
        return parseResponse(this.client.a(createRequest(request)).a());
    }

    static x createRequest(Request request) {
        x.a a = new x.a().a(request.getUrl()).a(request.getMethod(), createRequestBody(request.getBody()));
        List<Header> headers = request.getHeaders();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            Header header = headers.get(i);
            String value = header.getValue();
            if (value == null) {
                value = "";
            }
            a.b(header.getName(), value);
        }
        return a.a();
    }

    static Response parseResponse(z zVar) {
        return new Response(zVar.a().c(), zVar.b(), zVar.d(), createHeaders(zVar.e()), createResponseBody(zVar.f()));
    }

    private static y createRequestBody(final TypedOutput typedOutput) {
        if (typedOutput == null) {
            return null;
        }
        final u a = u.a(typedOutput.mimeType());
        return new y() { // from class: retrofit.client.OkClient.1
            @Override // com.squareup.okhttp.y
            public final u contentType() {
                return u.this;
            }

            @Override // com.squareup.okhttp.y
            public final void writeTo(d dVar) throws IOException {
                typedOutput.writeTo(dVar.b());
            }

            @Override // com.squareup.okhttp.y
            public final long contentLength() {
                return typedOutput.length();
            }
        };
    }

    private static TypedInput createResponseBody(final aa aaVar) {
        if (aaVar.b() == 0) {
            return null;
        }
        return new TypedInput() { // from class: retrofit.client.OkClient.2
            @Override // retrofit.mime.TypedInput
            public final String mimeType() {
                u a = aa.this.a();
                if (a == null) {
                    return null;
                }
                return a.toString();
            }

            @Override // retrofit.mime.TypedInput
            public final long length() {
                return aa.this.b();
            }

            @Override // retrofit.mime.TypedInput
            public final InputStream in() throws IOException {
                return aa.this.d();
            }
        };
    }

    private static List<Header> createHeaders(r rVar) {
        int a = rVar.a();
        ArrayList arrayList = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            arrayList.add(new Header(rVar.a(i), rVar.b(i)));
        }
        return arrayList;
    }
}
