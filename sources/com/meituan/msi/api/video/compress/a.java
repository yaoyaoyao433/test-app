package com.meituan.msi.api.video.compress;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaMuxer;
import android.net.Uri;
import android.support.annotation.RequiresApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.misc.IMediaFormat;
/* compiled from: ProGuard */
@RequiresApi(api = 18)
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Uri b;
    private String c;
    private MediaCodec.BufferInfo d;
    private MediaMuxer e;
    private MediaCodec f;
    private MediaCodec g;
    private int h;
    private com.meituan.msi.api.video.compress.muxer.a i;
    private int j;
    private int k;
    private int l;
    private final int m;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "784f1b1b10e19b4b72a83011c230e49e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "784f1b1b10e19b4b72a83011c230e49e");
            return;
        }
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = 2500;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:89:0x02b9
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final boolean a(android.net.Uri r51, java.lang.String r52, int r53, int r54, int r55, com.meituan.msi.api.video.compress.listner.a r56) {
        /*
            Method dump skipped, instructions count: 2361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.video.compress.a.a(android.net.Uri, java.lang.String, int, int, int, com.meituan.msi.api.video.compress.listner.a):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
        if (r4 == (-1)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long a(android.media.MediaExtractor r19, android.media.MediaMuxer r20, android.media.MediaCodec.BufferInfo r21, long r22, long r24, java.io.File r26, boolean r27) throws java.lang.Exception {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r0 = 7
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r12 = 0
            r11[r12] = r8
            r13 = 1
            r11[r13] = r9
            r0 = 2
            r11[r0] = r10
            r14 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r1 = 3
            r11[r1] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r1 = 4
            r11[r1] = r0
            r0 = 5
            r11[r0] = r26
            java.lang.Byte r0 = java.lang.Byte.valueOf(r12)
            r1 = 6
            r11[r1] = r0
            com.meituan.robust.ChangeQuickRedirect r5 = com.meituan.msi.api.video.compress.a.a
            java.lang.String r6 = "f45042fdeca4d5302e5ffcada85231f2"
            r3 = 0
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r11
            r1 = r18
            r2 = r5
            r4 = r6
            r13 = r5
            r14 = r6
            r5 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L4f
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r7, r13, r12, r14)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L4f:
            int r0 = r7.a(r8, r12)
            if (r0 < 0) goto Lae
            r8.selectTrack(r0)
            android.media.MediaFormat r1 = r8.getTrackFormat(r0)
            int r2 = r9.addTrack(r1)
            r20.start()
            java.lang.String r3 = "max-input-size"
            int r1 = r1.getInteger(r3)
            r3 = 0
            r8.seekTo(r3, r12)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            r3 = 0
        L74:
            if (r3 != 0) goto La8
            int r4 = r19.getSampleTrackIndex()
            if (r4 != r0) goto L9f
            int r4 = r8.readSampleData(r1, r12)
            r10.size = r4
            int r4 = r10.size
            if (r4 >= 0) goto L8a
            r10.size = r12
        L88:
            r4 = 1
            goto La4
        L8a:
            long r4 = r19.getSampleTime()
            r10.presentationTimeUs = r4
            r10.offset = r12
            int r4 = r19.getSampleFlags()
            r10.flags = r4
            r9.writeSampleData(r2, r1, r10)
            r19.advance()
            goto La3
        L9f:
            r5 = -1
            if (r4 != r5) goto La3
            goto L88
        La3:
            r4 = 0
        La4:
            if (r4 == 0) goto L74
            r3 = 1
            goto L74
        La8:
            r8.unselectTrack(r0)
            r0 = -1
            return r0
        Lae:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.video.compress.a.a(android.media.MediaExtractor, android.media.MediaMuxer, android.media.MediaCodec$BufferInfo, long, long, java.io.File, boolean):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
        if (r4 == (-1)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long a(android.media.MediaExtractor r21, android.media.MediaMuxer r22, android.media.MediaCodec.BufferInfo r23, long r24, long r26, java.io.File r28, int r29) throws java.lang.Exception {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r0 = 7
            java.lang.Object[] r13 = new java.lang.Object[r0]
            r14 = 0
            r13[r14] = r8
            r15 = 1
            r13[r15] = r9
            r0 = 2
            r13[r0] = r10
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r11)
            r1 = 3
            r13[r1] = r0
            r16 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r1 = 4
            r13[r1] = r0
            r0 = 5
            r13[r0] = r28
            java.lang.Integer r0 = java.lang.Integer.valueOf(r29)
            r1 = 6
            r13[r1] = r0
            com.meituan.robust.ChangeQuickRedirect r5 = com.meituan.msi.api.video.compress.a.a
            java.lang.String r6 = "b716e191cde434ed973e32bf677aad6f"
            r3 = 0
            r18 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r13
            r1 = r20
            r2 = r5
            r4 = r6
            r15 = r5
            r14 = r6
            r5 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L53
            r0 = 0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r7, r15, r0, r14)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L53:
            r0 = 1
            int r1 = r7.a(r8, r0)
            if (r1 < 0) goto Lc5
            r8.selectTrack(r1)
            android.media.MediaFormat r2 = r8.getTrackFormat(r1)
            java.lang.String r3 = "max-input-size"
            int r2 = r2.getInteger(r3)
            r3 = 0
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 <= 0) goto L73
            r6 = 0
            r8.seekTo(r11, r6)
            goto L77
        L73:
            r6 = 0
            r8.seekTo(r3, r6)
        L77:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            r11 = r16
            r3 = 0
        L7e:
            if (r3 != 0) goto Lc1
            int r4 = r21.getSampleTrackIndex()
            if (r4 != r1) goto Lb6
            int r4 = r8.readSampleData(r2, r6)
            r10.size = r4
            int r4 = r10.size
            if (r4 >= 0) goto L96
            r10.size = r6
            r13 = r29
        L94:
            r4 = 1
            goto Lbd
        L96:
            long r13 = r21.getSampleTime()
            r10.presentationTimeUs = r13
            if (r5 <= 0) goto La4
            int r4 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r4 != 0) goto La4
            long r11 = r10.presentationTimeUs
        La4:
            r6 = 0
            r10.offset = r6
            int r4 = r21.getSampleFlags()
            r10.flags = r4
            r13 = r29
            r9.writeSampleData(r13, r2, r10)
            r21.advance()
            goto Lbc
        Lb6:
            r13 = r29
            r14 = -1
            if (r4 != r14) goto Lbc
            goto L94
        Lbc:
            r4 = 0
        Lbd:
            if (r4 == 0) goto L7e
            r3 = 1
            goto L7e
        Lc1:
            r8.unselectTrack(r1)
            return r11
        Lc5:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.video.compress.a.a(android.media.MediaExtractor, android.media.MediaMuxer, android.media.MediaCodec$BufferInfo, long, long, java.io.File, int):long");
    }

    private int a(MediaExtractor mediaExtractor, boolean z) {
        Object[] objArr = {mediaExtractor, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c41a53f3bbfebb2ceeece8867841ec5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c41a53f3bbfebb2ceeece8867841ec5")).intValue();
        }
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            String string = mediaExtractor.getTrackFormat(i).getString(IMediaFormat.KEY_MIME);
            if (z) {
                if (string.startsWith("audio/")) {
                    return i;
                }
            } else if (string.startsWith("video/")) {
                return i;
            }
        }
        return -233;
    }
}
