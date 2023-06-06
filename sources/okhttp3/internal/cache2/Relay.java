package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.internal.Util;
import okio.c;
import okio.f;
import okio.s;
import okio.t;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class Relay {
    private static final long FILE_HEADER_SIZE = 32;
    static final f PREFIX_CLEAN = f.a("OkHttp cache v1\n");
    static final f PREFIX_DIRTY = f.a("OkHttp DIRTY :(\n");
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    final long bufferMaxSize;
    boolean complete;
    RandomAccessFile file;
    private final f metadata;
    int sourceCount;
    s upstream;
    long upstreamPos;
    Thread upstreamReader;
    final c upstreamBuffer = new c();
    final c buffer = new c();

    private Relay(RandomAccessFile randomAccessFile, s sVar, long j, f fVar, long j2) {
        this.file = randomAccessFile;
        this.upstream = sVar;
        this.complete = sVar == null;
        this.upstreamPos = j;
        this.metadata = fVar;
        this.bufferMaxSize = j2;
    }

    public static Relay edit(File file, s sVar, f fVar, long j) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        Relay relay = new Relay(randomAccessFile, sVar, 0L, fVar, j);
        randomAccessFile.setLength(0L);
        relay.writeHeader(PREFIX_DIRTY, -1L, -1L);
        return relay;
    }

    public static Relay read(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
        c cVar = new c();
        fileOperator.read(0L, cVar, 32L);
        if (!cVar.d(PREFIX_CLEAN.h()).equals(PREFIX_CLEAN)) {
            throw new IOException("unreadable cache file");
        }
        long j = cVar.j();
        long j2 = cVar.j();
        c cVar2 = new c();
        fileOperator.read(j + 32, cVar2, j2);
        return new Relay(randomAccessFile, null, j, cVar2.o(), 0L);
    }

    private void writeHeader(f fVar, long j, long j2) throws IOException {
        c cVar = new c();
        cVar.c(fVar);
        cVar.j(j);
        cVar.j(j2);
        if (cVar.b != 32) {
            throw new IllegalArgumentException();
        }
        new FileOperator(this.file.getChannel()).write(0L, cVar, 32L);
    }

    private void writeMetadata(long j) throws IOException {
        c cVar = new c();
        cVar.c(this.metadata);
        new FileOperator(this.file.getChannel()).write(32 + j, cVar, this.metadata.h());
    }

    final void commit(long j) throws IOException {
        writeMetadata(j);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.h());
        this.file.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        Util.closeQuietly(this.upstream);
        this.upstream = null;
    }

    final boolean isClosed() {
        return this.file == null;
    }

    public final f metadata() {
        return this.metadata;
    }

    public final s newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    class RelaySource implements s {
        private FileOperator fileOperator;
        private long sourcePos;
        private final t timeout = new t();

        RelaySource() {
            this.fileOperator = new FileOperator(Relay.this.file.getChannel());
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
            if (r5 != 2) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
            r2 = java.lang.Math.min(r23, r7 - r21.sourcePos);
            r21.fileOperator.read(r21.sourcePos + 32, r22, r2);
            r21.sourcePos += r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
            r5 = r21.this$0.upstream.read(r21.this$0.upstreamBuffer, r21.this$0.bufferMaxSize);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
            if (r5 != (-1)) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
            r21.this$0.commit(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
            r21.this$0.upstreamReader = null;
            r21.this$0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
            r2 = java.lang.Math.min(r5, r23);
            r21.this$0.upstreamBuffer.a(r22, 0, r2);
            r21.sourcePos += r2;
            r21.fileOperator.write(r7 + 32, r21.this$0.upstreamBuffer.clone(), r5);
            r7 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
            monitor-enter(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00bf, code lost:
            r21.this$0.buffer.write(r21.this$0.upstreamBuffer, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
            if (r21.this$0.buffer.b <= r21.this$0.bufferMaxSize) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
            r21.this$0.buffer.i(r21.this$0.buffer.b - r21.this$0.bufferMaxSize);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00eb, code lost:
            r21.this$0.upstreamPos += r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f3, code lost:
            monitor-exit(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00f4, code lost:
            r5 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00f6, code lost:
            monitor-enter(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00f7, code lost:
            r21.this$0.upstreamReader = null;
            r21.this$0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
            monitor-exit(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0101, code lost:
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0108, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x010b, code lost:
            monitor-enter(r21.this$0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x010c, code lost:
            r21.this$0.upstreamReader = null;
            r21.this$0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0116, code lost:
            throw r0;
         */
        @Override // okio.s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(okio.c r22, long r23) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 324
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(okio.c, long):long");
        }

        @Override // okio.s
        public t timeout() {
            return this.timeout;
        }

        @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            synchronized (Relay.this) {
                Relay relay = Relay.this;
                relay.sourceCount--;
                if (Relay.this.sourceCount == 0) {
                    RandomAccessFile randomAccessFile2 = Relay.this.file;
                    Relay.this.file = null;
                    randomAccessFile = randomAccessFile2;
                }
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }
    }
}
