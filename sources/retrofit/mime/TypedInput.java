package retrofit.mime;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface TypedInput {
    InputStream in() throws IOException;

    long length();

    String mimeType();
}
