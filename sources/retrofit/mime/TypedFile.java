package retrofit.mime;

import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class TypedFile implements TypedInput, TypedOutput {
    private static final int BUFFER_SIZE = 4096;
    private final File file;
    private final String mimeType;

    public TypedFile(String str, File file) {
        if (str == null) {
            throw new NullPointerException("mimeType");
        }
        if (file == null) {
            throw new NullPointerException("file");
        }
        this.mimeType = str;
        this.file = file;
    }

    public File file() {
        return this.file;
    }

    @Override // retrofit.mime.TypedInput
    public String mimeType() {
        return this.mimeType;
    }

    @Override // retrofit.mime.TypedInput
    public long length() {
        return this.file.length();
    }

    @Override // retrofit.mime.TypedOutput
    public String fileName() {
        return this.file.getName();
    }

    @Override // retrofit.mime.TypedInput
    public InputStream in() throws IOException {
        return new FileInputStream(this.file);
    }

    @Override // retrofit.mime.TypedOutput
    public void writeTo(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        FileInputStream fileInputStream = new FileInputStream(this.file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    return;
                }
                outputStream.write(bArr, 0, read);
            } finally {
                fileInputStream.close();
            }
        }
    }

    public void moveTo(TypedFile typedFile) throws IOException {
        if (!mimeType().equals(typedFile.mimeType())) {
            throw new IOException("Type mismatch.");
        }
        if (!this.file.renameTo(typedFile.file())) {
            throw new IOException("Rename failed!");
        }
    }

    public String toString() {
        return this.file.getAbsolutePath() + " (" + mimeType() + CommonConstant.Symbol.BRACKET_RIGHT;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TypedFile) {
            return this.file.equals(((TypedFile) obj).file);
        }
        return false;
    }

    public int hashCode() {
        return this.file.hashCode();
    }
}
