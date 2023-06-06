package retrofit;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import retrofit.client.Request;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class Utils {
    private static final int BUFFER_SIZE = 4096;

    static byte[] streamToBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (inputStream != null) {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Request readBodyToBytesIfNecessary(Request request) throws IOException {
        TypedOutput body = request.getBody();
        if (body == null || (body instanceof TypedByteArray)) {
            return request;
        }
        String mimeType = body.mimeType();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        body.writeTo(byteArrayOutputStream);
        return new Request(request.getMethod(), request.getUrl(), request.getHeaders(), new TypedByteArray(mimeType, byteArrayOutputStream.toByteArray()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Response readBodyToBytesIfNecessary(Response response) throws IOException {
        TypedInput body = response.getBody();
        if (body == null || (body instanceof TypedByteArray)) {
            return response;
        }
        String mimeType = body.mimeType();
        InputStream in = body.in();
        try {
            Response replaceResponseBody = replaceResponseBody(response, new TypedByteArray(mimeType, streamToBytes(in)));
            if (in != null) {
                try {
                    in.close();
                } catch (IOException unused) {
                }
            }
            return replaceResponseBody;
        } catch (Throwable th) {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Response replaceResponseBody(Response response, TypedInput typedInput) {
        return new Response(response.getUrl(), response.getStatus(), response.getReason(), response.getHeaders(), typedInput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void validateServiceClass(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("Only interface endpoint definitions are supported.");
        }
        if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("Interface definitions must not extend other interfaces.");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class SynchronousExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    private Utils() {
    }
}
