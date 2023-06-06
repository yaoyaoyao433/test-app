package com.dianping.video.videofilter.transcoder.engine;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final MediaFormat b;
    int c;
    int d;
    int e;
    int f;
    c g;
    final C0136a h;
    MediaFormat i;
    b j;
    com.dianping.video.model.g k;
    private final Queue<C0136a> l;
    private final Queue<C0136a> m;
    private final MediaCodec n;
    private final MediaCodec o;
    private final com.dianping.video.videofilter.transcoder.compat.a p;
    private final com.dianping.video.videofilter.transcoder.compat.a q;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.video.videofilter.transcoder.engine.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0136a {
        public int a;
        public long b;
        public ShortBuffer c;

        public C0136a() {
        }
    }

    public a(MediaCodec mediaCodec, MediaCodec mediaCodec2, MediaFormat mediaFormat, com.dianping.video.model.g gVar) {
        Object[] objArr = {mediaCodec, mediaCodec2, mediaFormat, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "286414b33e20be36aafe6973bd35a3fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "286414b33e20be36aafe6973bd35a3fd");
            return;
        }
        this.l = new ArrayDeque();
        this.m = new ArrayDeque();
        this.h = new C0136a();
        this.n = mediaCodec;
        this.o = mediaCodec2;
        this.b = mediaFormat;
        this.k = gVar;
        this.p = new com.dianping.video.videofilter.transcoder.compat.a(this.n);
        this.q = new com.dianping.video.videofilter.transcoder.compat.a(this.o);
    }

    public final void a(int i, long j, int i2) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70833edbdb8f6dd430c0e3095e5a4015", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70833edbdb8f6dd430c0e3095e5a4015");
        } else if (this.i == null) {
            throw new RuntimeException("Buffer received before format!");
        } else {
            ByteBuffer b = i == -1 ? null : this.p.b(i);
            C0136a poll = this.l.poll();
            if (poll == null) {
                poll = new C0136a();
            }
            poll.a = i;
            poll.b = j;
            poll.c = b != null ? b.asShortBuffer() : null;
            if (poll.c != null) {
                poll.c.clear().limit(i2 / 2);
            }
            if (this.h.c == null) {
                this.h.c = ByteBuffer.allocateDirect(b != null ? b.capacity() : 32768).order(ByteOrder.nativeOrder()).asShortBuffer();
                this.h.c.clear().flip();
            }
            this.m.add(poll);
        }
    }

    @TargetApi(16)
    public final boolean a(long j) {
        int dequeueInputBuffer;
        long j2;
        long j3;
        Object[] objArr = {0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c4197b7bd86fae95107364b67502d7c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c4197b7bd86fae95107364b67502d7c")).booleanValue();
        }
        boolean z = this.h.c != null && this.h.c.hasRemaining();
        if ((!this.m.isEmpty() || z) && (dequeueInputBuffer = this.o.dequeueInputBuffer(0L)) >= 0) {
            ShortBuffer asShortBuffer = this.q.a(dequeueInputBuffer).asShortBuffer();
            if (z) {
                Object[] objArr2 = {asShortBuffer};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e15b2620c9eebb167210761b6802c04a", RobustBitConfig.DEFAULT_VALUE)) {
                    j3 = ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e15b2620c9eebb167210761b6802c04a")).longValue();
                } else {
                    ShortBuffer shortBuffer = this.h.c;
                    int limit = shortBuffer.limit();
                    int remaining = shortBuffer.remaining();
                    long a2 = this.h.b + a(shortBuffer.position(), this.d, this.f);
                    asShortBuffer.clear();
                    if (remaining > asShortBuffer.capacity()) {
                        shortBuffer.limit(shortBuffer.position() + asShortBuffer.capacity());
                        asShortBuffer.put(shortBuffer);
                        shortBuffer.limit(limit);
                    } else {
                        asShortBuffer.put(shortBuffer);
                        shortBuffer.clear().limit(0);
                    }
                    j3 = a2;
                }
                if (this.j != null) {
                    this.j.a(asShortBuffer);
                }
                this.o.queueInputBuffer(dequeueInputBuffer, 0, asShortBuffer.position() * 2, j3, 0);
                return true;
            }
            C0136a poll = this.m.poll();
            if (poll != null && poll.a == -1) {
                b bVar = this.j;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "9540f76918ae9f1948cbf690685c262c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "9540f76918ae9f1948cbf690685c262c");
                } else if (bVar.d != null) {
                    try {
                        bVar.d.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                this.o.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                return false;
            } else if (poll != null) {
                Object[] objArr4 = {poll, asShortBuffer};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f54de647ad8d715a6f45dd9c144c48e1", RobustBitConfig.DEFAULT_VALUE)) {
                    j2 = ((Long) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f54de647ad8d715a6f45dd9c144c48e1")).longValue();
                } else {
                    ShortBuffer shortBuffer2 = poll.c;
                    ShortBuffer shortBuffer3 = this.h.c;
                    asShortBuffer.clear();
                    if (shortBuffer2.remaining() > asShortBuffer.remaining()) {
                        shortBuffer2.limit(shortBuffer2.position() + asShortBuffer.capacity());
                        this.g.a(shortBuffer2, asShortBuffer);
                        shortBuffer2.limit(shortBuffer2.capacity());
                        long a3 = a(asShortBuffer.position(), this.d, this.f);
                        shortBuffer3.clear();
                        this.g.a(shortBuffer2, shortBuffer3);
                        shortBuffer3.flip();
                        this.h.b = poll.b + a3;
                    } else {
                        this.g.a(shortBuffer2, asShortBuffer);
                    }
                    j2 = poll.b;
                }
                long j4 = j2;
                if (this.j != null) {
                    this.j.a(asShortBuffer);
                }
                this.o.queueInputBuffer(dequeueInputBuffer, 0, asShortBuffer.position() * 2, j4, 0);
                this.n.releaseOutputBuffer(poll.a, false);
                this.l.add(poll);
                return true;
            } else {
                return true;
            }
        }
        return false;
    }

    private static long a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "144dbc36847e15b8f97b9a89cf589764", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "144dbc36847e15b8f97b9a89cf589764")).longValue() : ((i * 1000000) / i2) / i3;
    }
}
