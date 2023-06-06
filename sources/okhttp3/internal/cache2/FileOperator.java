package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import okio.c;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileOperator(FileChannel fileChannel) {
        this.fileChannel = fileChannel;
    }

    public final void read(long j, c cVar, long j2) throws IOException {
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long transferTo = this.fileChannel.transferTo(j, j2, cVar);
            j += transferTo;
            j2 -= transferTo;
        }
    }

    public final void write(long j, c cVar, long j2) throws IOException {
        if (j2 < 0 || j2 > cVar.b) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long transferFrom = this.fileChannel.transferFrom(cVar, j, j2);
            j += transferFrom;
            j2 -= transferFrom;
        }
    }
}
