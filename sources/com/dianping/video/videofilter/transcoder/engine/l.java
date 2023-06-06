package com.dianping.video.videofilter.transcoder.engine;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.dianping.video.recorder.model.RecordSession;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class l {
    public static ChangeQuickRedirect a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    com.dianping.video.model.a f;
    String g;
    String h;
    String i;
    String j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private final List<ByteBuffer> o;
    private final List<b> p;
    private final MediaMuxer q;
    private final a r;
    private MediaFormat s;
    private MediaFormat t;
    private RecordSession u;
    private RecordSession v;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public l(MediaMuxer mediaMuxer, a aVar) {
        Object[] objArr = {mediaMuxer, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84a41910e11c95a87635da31f096b37e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84a41910e11c95a87635da31f096b37e");
            return;
        }
        this.q = mediaMuxer;
        this.r = aVar;
        this.p = new ArrayList();
        this.o = new ArrayList();
    }

    public final void a(c cVar, MediaFormat mediaFormat) {
        Object[] objArr = {cVar, mediaFormat};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e706056e7e0c4d0fa6bec28d4e84f86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e706056e7e0c4d0fa6bec28d4e84f86");
            return;
        }
        switch (cVar) {
            case VIDEO:
                this.s = mediaFormat;
                break;
            case AUDIO:
                this.t = mediaFormat;
                break;
            default:
                throw new AssertionError();
        }
        b();
    }

    @TargetApi(18)
    private void b() {
        b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8866990a1cd3ff95bf27ed7346a8d6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8866990a1cd3ff95bf27ed7346a8d6d");
            return;
        }
        if (this.b && this.c) {
            if (this.s == null || this.t == null) {
                return;
            }
        } else if (this.b) {
            if (this.s == null) {
                return;
            }
        } else if (this.c && this.t == null) {
            return;
        }
        if (this.r != null) {
            this.r.a();
        }
        if (this.q != null) {
            if (this.b) {
                this.k = this.q.addTrack(this.s);
                com.dianping.video.log.c a2 = com.dianping.video.log.c.a();
                a2.b(l.class, "QueuedMuxer", "Added track #" + this.k + " with " + this.s.getString(IMediaFormat.KEY_MIME) + " to muxer");
            }
            if (this.c) {
                this.l = this.q.addTrack(this.t);
                com.dianping.video.log.c a3 = com.dianping.video.log.c.a();
                a3.b(l.class, "QueuedMuxer", "Added track #" + this.l + " with " + this.t.getString(IMediaFormat.KEY_MIME) + " to muxer");
            }
            this.q.start();
        }
        this.m = true;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        for (b bVar2 : this.p) {
            Object[] objArr2 = {bufferInfo, 0};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "f0028a07a4e89919dabc62737d3803ca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "f0028a07a4e89919dabc62737d3803ca");
                bVar = bVar2;
            } else {
                bVar = bVar2;
                bufferInfo.set(0, bVar2.c, bVar2.d, bVar2.e);
            }
            if (this.o.size() == 0) {
                break;
            }
            ByteBuffer remove = this.o.remove(0);
            remove.flip();
            if (this.d && bVar.b == c.VIDEO) {
                this.f.a(remove);
            } else if (this.n) {
                if (bVar.b == c.VIDEO) {
                    this.u.a(remove, bufferInfo, 0);
                } else {
                    this.v.a(remove, bufferInfo, 1);
                }
            } else if (this.q != null) {
                this.q.writeSampleData(a(bVar.b), remove, bufferInfo);
                com.dianping.video.log.c a4 = com.dianping.video.log.c.a();
                a4.a("QueuedMuxer", "push sample data which in bufferlist to mp4, bufferInfo : " + com.dianping.video.recorder.manager.a.a(bufferInfo));
            }
        }
        this.o.clear();
        this.p.clear();
    }

    @TargetApi(18)
    public final void a(c cVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        Object[] objArr = {cVar, byteBuffer, bufferInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f63a73447cdf6b21f5c9ac6feabd0b57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f63a73447cdf6b21f5c9ac6feabd0b57");
        } else if (this.m) {
            if (this.d && cVar == c.VIDEO) {
                if ((bufferInfo.flags & 1) != 0) {
                    this.f.a(byteBuffer);
                }
            } else if (this.n || this.e) {
                if (this.u == null && this.b) {
                    this.u = new RecordSession(this.g);
                }
                if (this.v == null && this.c) {
                    this.v = new RecordSession(this.h);
                }
                if (cVar == c.VIDEO) {
                    if ((bufferInfo.flags & 4) != 0) {
                        this.u.a();
                        if (this.e) {
                            com.dianping.util.d.a(new File(this.i), this.u);
                            return;
                        }
                        return;
                    }
                    this.u.a(byteBuffer, bufferInfo, 0);
                } else if ((bufferInfo.flags & 4) != 0) {
                    com.dianping.video.log.c.a().a("QueuedMuxer", com.dianping.video.recorder.manager.a.a(bufferInfo));
                    this.v.a();
                    if (this.e) {
                        com.dianping.util.d.a(new File(this.j), this.v);
                    }
                } else {
                    this.v.a(byteBuffer, bufferInfo, 1);
                }
            } else if (this.q != null) {
                com.dianping.video.log.c a2 = com.dianping.video.log.c.a();
                a2.b(l.class, "edit_video", "SampleTye = " + cVar + " ,bufferInfo = " + com.dianping.video.recorder.manager.a.a(bufferInfo));
                this.q.writeSampleData(a(cVar), byteBuffer, bufferInfo);
            }
        } else {
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            byteBuffer.position(bufferInfo.offset);
            ByteBuffer order = ByteBuffer.allocateDirect(byteBuffer.capacity()).order(ByteOrder.nativeOrder());
            order.clear();
            order.put(byteBuffer);
            this.o.add(order);
            this.p.add(new b(cVar, bufferInfo.size, bufferInfo));
            com.dianping.video.log.c.a().a("QueuedMuxer", "muxer is not started,write data to cache buffer");
        }
    }

    private int a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68bdd665e12ee41436c25332b44c6f19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68bdd665e12ee41436c25332b44c6f19")).intValue();
        }
        switch (cVar) {
            case VIDEO:
                return this.k;
            case AUDIO:
                return this.l;
            default:
                throw new AssertionError();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum c {
        VIDEO,
        AUDIO;
        
        public static ChangeQuickRedirect a;

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89c212ab6b9e2d8d07211dcfef749f1d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89c212ab6b9e2d8d07211dcfef749f1d");
            }
        }

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29474e7833d0452b2e8bab877d56345e", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29474e7833d0452b2e8bab877d56345e") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa53453ef3e93ce52d7eadaa7cec30a2", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa53453ef3e93ce52d7eadaa7cec30a2") : (c[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        final c b;
        final int c;
        final long d;
        final int e;

        @TargetApi(16)
        private b(c cVar, int i, MediaCodec.BufferInfo bufferInfo) {
            Object[] objArr = {cVar, Integer.valueOf(i), bufferInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "515c4b5f6ccfd019489187ac74affcbd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "515c4b5f6ccfd019489187ac74affcbd");
                return;
            }
            this.b = cVar;
            this.c = i;
            this.d = bufferInfo.presentationTimeUs;
            this.e = bufferInfo.flags;
        }
    }

    @TargetApi(18)
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dd0785a69b86fc768881b45c622afd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dd0785a69b86fc768881b45c622afd7");
        } else if (this.d) {
            int i = 0;
            while (!this.f.a()) {
                ByteBuffer b2 = this.f.b();
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.size = b2.limit();
                bufferInfo.presentationTimeUs = i * 40 * 1000;
                bufferInfo.offset = 0;
                bufferInfo.flags = 1;
                if (this.f.a()) {
                    bufferInfo.flags = 4;
                }
                this.q.writeSampleData(a(c.VIDEO), b2, bufferInfo);
                i++;
            }
        }
    }
}
