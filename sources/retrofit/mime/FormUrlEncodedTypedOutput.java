package retrofit.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class FormUrlEncodedTypedOutput implements TypedOutput {
    final ByteArrayOutputStream content = new ByteArrayOutputStream();

    @Override // retrofit.mime.TypedOutput
    public final String fileName() {
        return null;
    }

    @Override // retrofit.mime.TypedOutput
    public final String mimeType() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public final void addField(String str, String str2) {
        addField(str, true, str2, true);
    }

    public final void addField(String str, boolean z, String str2, boolean z2) {
        if (str == null) {
            throw new NullPointerException("name");
        }
        if (str2 == null) {
            throw new NullPointerException("value");
        }
        if (this.content.size() > 0) {
            this.content.write(38);
        }
        if (z) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (z2) {
            str2 = URLEncoder.encode(str2, "UTF-8");
        }
        this.content.write(str.getBytes("UTF-8"));
        this.content.write(61);
        this.content.write(str2.getBytes("UTF-8"));
    }

    @Override // retrofit.mime.TypedOutput
    public final long length() {
        return this.content.size();
    }

    @Override // retrofit.mime.TypedOutput
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.content.toByteArray());
    }
}
