package retrofit.mime;

import com.meituan.robust.common.StringUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class MultipartTypedOutput implements TypedOutput {
    public static final String DEFAULT_TRANSFER_ENCODING = "binary";
    private final String boundary;
    private final byte[] footer;
    private long length;
    private final List<MimePart> mimeParts;

    @Override // retrofit.mime.TypedOutput
    public final String fileName() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class MimePart {
        private final TypedOutput body;
        private final String boundary;
        private boolean isBuilt;
        private final boolean isFirst;
        private final String name;
        private byte[] partBoundary;
        private byte[] partHeader;
        private final String transferEncoding;

        public MimePart(String str, String str2, TypedOutput typedOutput, String str3, boolean z) {
            this.name = str;
            this.transferEncoding = str2;
            this.body = typedOutput;
            this.isFirst = z;
            this.boundary = str3;
        }

        public final void writeTo(OutputStream outputStream) throws IOException {
            build();
            outputStream.write(this.partBoundary);
            outputStream.write(this.partHeader);
            this.body.writeTo(outputStream);
        }

        public final long size() {
            build();
            if (this.body.length() > -1) {
                return this.body.length() + this.partBoundary.length + this.partHeader.length;
            }
            return -1L;
        }

        private void build() {
            if (this.isBuilt) {
                return;
            }
            this.partBoundary = MultipartTypedOutput.buildBoundary(this.boundary, this.isFirst, false);
            this.partHeader = MultipartTypedOutput.buildHeader(this.name, this.transferEncoding, this.body);
            this.isBuilt = true;
        }
    }

    public MultipartTypedOutput() {
        this(UUID.randomUUID().toString());
    }

    MultipartTypedOutput(String str) {
        this.mimeParts = new LinkedList();
        this.boundary = str;
        this.footer = buildBoundary(str, false, true);
        this.length = this.footer.length;
    }

    final List<byte[]> getParts() throws IOException {
        ArrayList arrayList = new ArrayList(this.mimeParts.size());
        for (MimePart mimePart : this.mimeParts) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mimePart.writeTo(byteArrayOutputStream);
            arrayList.add(byteArrayOutputStream.toByteArray());
        }
        return arrayList;
    }

    public final void addPart(String str, TypedOutput typedOutput) {
        addPart(str, "binary", typedOutput);
    }

    public final void addPart(String str, String str2, TypedOutput typedOutput) {
        if (str == null) {
            throw new NullPointerException("Part name must not be null.");
        }
        if (str2 == null) {
            throw new NullPointerException("Transfer encoding must not be null.");
        }
        if (typedOutput == null) {
            throw new NullPointerException("Part body must not be null.");
        }
        MimePart mimePart = new MimePart(str, str2, typedOutput, this.boundary, this.mimeParts.isEmpty());
        this.mimeParts.add(mimePart);
        long size = mimePart.size();
        if (size == -1) {
            this.length = -1L;
        } else if (this.length != -1) {
            this.length += size;
        }
    }

    public final int getPartCount() {
        return this.mimeParts.size();
    }

    @Override // retrofit.mime.TypedOutput
    public final String mimeType() {
        return "multipart/form-data; boundary=" + this.boundary;
    }

    @Override // retrofit.mime.TypedOutput
    public final long length() {
        return this.length;
    }

    @Override // retrofit.mime.TypedOutput
    public final void writeTo(OutputStream outputStream) throws IOException {
        for (MimePart mimePart : this.mimeParts) {
            mimePart.writeTo(outputStream);
        }
        outputStream.write(this.footer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] buildBoundary(String str, boolean z, boolean z2) {
        try {
            StringBuilder sb = new StringBuilder(str.length() + 8);
            if (!z) {
                sb.append(StringUtil.CRLF_STRING);
            }
            sb.append("--");
            sb.append(str);
            if (z2) {
                sb.append("--");
            }
            sb.append(StringUtil.CRLF_STRING);
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e) {
            throw new RuntimeException("Unable to write multipart boundary", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] buildHeader(String str, String str2, TypedOutput typedOutput) {
        try {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Content-Disposition: form-data; name=\"");
            sb.append(str);
            String fileName = typedOutput.fileName();
            if (fileName != null) {
                sb.append("\"; filename=\"");
                sb.append(fileName);
            }
            sb.append("\"\r\nContent-Type: ");
            sb.append(typedOutput.mimeType());
            long length = typedOutput.length();
            if (length != -1) {
                sb.append("\r\nContent-Length: ");
                sb.append(length);
            }
            sb.append("\r\nContent-Transfer-Encoding: ");
            sb.append(str2);
            sb.append("\r\n\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e) {
            throw new RuntimeException("Unable to write multipart header", e);
        }
    }
}
