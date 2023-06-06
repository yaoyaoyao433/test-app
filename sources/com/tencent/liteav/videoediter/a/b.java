package com.tencent.liteav.videoediter.a;

import android.annotation.TargetApi;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.IOException;
import java.util.HashMap;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes6.dex */
public class b {
    private MediaExtractor a;
    private MediaExtractor b;
    private MediaFormat d;
    private MediaFormat e;
    private HashMap<Integer, MediaFormat> c = new HashMap<>();
    private long f = 0;
    private boolean g = true;
    private boolean h = true;

    public synchronized void a(String str) throws IOException {
        f();
        this.a = new MediaExtractor();
        this.a.setDataSource(str);
        int trackCount = this.a.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = this.a.getTrackFormat(i);
            if (trackFormat != null) {
                this.c.put(Integer.valueOf(i), trackFormat);
                String string = trackFormat.getString(IMediaFormat.KEY_MIME);
                if (string != null && string.startsWith("video")) {
                    this.d = trackFormat;
                    this.a.selectTrack(i);
                    this.g = false;
                } else if (string != null && string.startsWith("audio")) {
                    this.e = trackFormat;
                    this.b = new MediaExtractor();
                    this.b.setDataSource(str);
                    this.b.selectTrack(i);
                    this.h = false;
                }
                TXCLog.i("TXMediaExtractor", "track index: " + i + ", format: " + trackFormat);
                long j = trackFormat.getLong("durationUs");
                if (this.f < j) {
                    this.f = j;
                }
            }
        }
    }

    public synchronized MediaFormat a() {
        return this.d;
    }

    public synchronized MediaFormat b() {
        return this.e;
    }

    public synchronized long c() {
        return this.f;
    }

    public synchronized void a(long j) {
        if (this.a != null) {
            this.a.seekTo(j, 0);
            this.g = false;
        }
        if (this.b != null && this.a != null) {
            this.b.seekTo(this.a.getSampleTime(), 0);
            this.h = false;
        }
    }

    public synchronized long d() {
        long sampleTime;
        sampleTime = this.a != null ? this.a.getSampleTime() : 0L;
        if (this.b != null && sampleTime > this.b.getSampleTime()) {
            sampleTime = this.b.getSampleTime();
        }
        return sampleTime;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int a(com.tencent.liteav.d.e r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = -1
            r1 = 4
            r2 = 0
            if (r9 == 0) goto Lb5
            java.nio.ByteBuffer r3 = r9.b()     // Catch: java.lang.Throwable -> Lb3
            if (r3 != 0) goto Le
            goto Lb5
        Le:
            r3 = 0
            boolean r4 = r8.g     // Catch: java.lang.Throwable -> Lb3
            if (r4 == 0) goto L16
            android.media.MediaExtractor r3 = r8.b     // Catch: java.lang.Throwable -> Lb3
            goto L37
        L16:
            boolean r4 = r8.h     // Catch: java.lang.Throwable -> Lb3
            if (r4 != 0) goto L35
            android.media.MediaExtractor r4 = r8.a     // Catch: java.lang.Throwable -> Lb3
            if (r4 == 0) goto L37
            android.media.MediaExtractor r4 = r8.b     // Catch: java.lang.Throwable -> Lb3
            if (r4 == 0) goto L37
            android.media.MediaExtractor r3 = r8.a     // Catch: java.lang.Throwable -> Lb3
            long r3 = r3.getSampleTime()     // Catch: java.lang.Throwable -> Lb3
            android.media.MediaExtractor r5 = r8.b     // Catch: java.lang.Throwable -> Lb3
            long r5 = r5.getSampleTime()     // Catch: java.lang.Throwable -> Lb3
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L35
            android.media.MediaExtractor r3 = r8.b     // Catch: java.lang.Throwable -> Lb3
            goto L37
        L35:
            android.media.MediaExtractor r3 = r8.a     // Catch: java.lang.Throwable -> Lb3
        L37:
            if (r3 != 0) goto L50
            java.lang.String r3 = "TXMediaExtractor"
            java.lang.String r4 = "extractor = null!"
            com.tencent.liteav.basic.log.TXCLog.e(r3, r4)     // Catch: java.lang.Throwable -> Lb3
            if (r9 == 0) goto L4e
            java.nio.ByteBuffer r3 = r9.b()     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L4e
            r9.d(r2)     // Catch: java.lang.Throwable -> Lb3
            r9.c(r1)     // Catch: java.lang.Throwable -> Lb3
        L4e:
            monitor-exit(r8)
            return r0
        L50:
            java.nio.ByteBuffer r4 = r9.b()     // Catch: java.lang.Throwable -> Lb3
            int r4 = r3.readSampleData(r4, r2)     // Catch: java.lang.Throwable -> Lb3
            if (r4 >= 0) goto L73
            android.media.MediaExtractor r5 = r8.a     // Catch: java.lang.Throwable -> Lb3
            r6 = 1
            if (r3 != r5) goto L62
            r8.g = r6     // Catch: java.lang.Throwable -> Lb3
            goto L64
        L62:
            r8.h = r6     // Catch: java.lang.Throwable -> Lb3
        L64:
            boolean r3 = r8.g     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto Le
            boolean r3 = r8.h     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto Le
            r9.d(r2)     // Catch: java.lang.Throwable -> Lb3
            r9.c(r1)     // Catch: java.lang.Throwable -> Lb3
            goto Lb1
        L73:
            long r0 = r3.getSampleTime()     // Catch: java.lang.Throwable -> Lb3
            int r5 = r3.getSampleFlags()     // Catch: java.lang.Throwable -> Lb3
            int r6 = r3.getSampleTrackIndex()     // Catch: java.lang.Throwable -> Lb3
            java.util.HashMap<java.lang.Integer, android.media.MediaFormat> r7 = r8.c     // Catch: java.lang.Throwable -> Lb3
            int r7 = r7.size()     // Catch: java.lang.Throwable -> Lb3
            if (r6 >= r7) goto L9e
            java.util.HashMap<java.lang.Integer, android.media.MediaFormat> r7 = r8.c     // Catch: java.lang.Throwable -> Lb3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> Lb3
            android.media.MediaFormat r6 = (android.media.MediaFormat) r6     // Catch: java.lang.Throwable -> Lb3
            if (r6 == 0) goto L9e
            java.lang.String r7 = "mime"
            java.lang.String r6 = r6.getString(r7)     // Catch: java.lang.Throwable -> Lb3
            r9.a(r6)     // Catch: java.lang.Throwable -> Lb3
        L9e:
            r9.a(r0)     // Catch: java.lang.Throwable -> Lb3
            r9.c(r5)     // Catch: java.lang.Throwable -> Lb3
            r9.d(r4)     // Catch: java.lang.Throwable -> Lb3
            java.nio.ByteBuffer r9 = r9.b()     // Catch: java.lang.Throwable -> Lb3
            r9.position(r2)     // Catch: java.lang.Throwable -> Lb3
            r3.advance()     // Catch: java.lang.Throwable -> Lb3
        Lb1:
            monitor-exit(r8)
            return r4
        Lb3:
            r9 = move-exception
            goto Lcc
        Lb5:
            java.lang.String r3 = "TXMediaExtractor"
            java.lang.String r4 = "frame input is invalid"
            com.tencent.liteav.basic.log.TXCLog.e(r3, r4)     // Catch: java.lang.Throwable -> Lb3
            if (r9 == 0) goto Lca
            java.nio.ByteBuffer r3 = r9.b()     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto Lca
            r9.d(r2)     // Catch: java.lang.Throwable -> Lb3
            r9.c(r1)     // Catch: java.lang.Throwable -> Lb3
        Lca:
            monitor-exit(r8)
            return r0
        Lcc:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoediter.a.b.a(com.tencent.liteav.d.e):int");
    }

    private synchronized void f() {
        if (this.a != null) {
            this.a.release();
            this.a = null;
        }
        if (this.b != null) {
            this.b.release();
            this.b = null;
        }
        this.c.clear();
        this.d = null;
        this.e = null;
        this.f = 0L;
        this.g = true;
        this.h = true;
    }

    public synchronized void e() {
        f();
    }
}
