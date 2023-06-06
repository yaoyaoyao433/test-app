package com.meituan.msi.api.record;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    private MediaCodec b;
    private ByteBuffer[] c;
    private ByteBuffer[] d;
    private MediaCodec.BufferInfo e;
    private int f;
    private int g;
    private long h;
    private ByteArrayOutputStream i;

    public a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1931ca47b3149bb4968a0c19ae2cdacd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1931ca47b3149bb4968a0c19ae2cdacd");
            return;
        }
        this.g = -1;
        this.h = 0L;
        this.i = new ByteArrayOutputStream();
        try {
            this.b = MediaCodec.createEncoderByType("audio/mp4a-latm");
        } catch (IOException e) {
            e.printStackTrace();
        }
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i3);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", i2);
        createAudioFormat.setInteger("max-input-size", 1048576);
        this.b.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        this.b.start();
        this.c = this.b.getInputBuffers();
        this.d = this.b.getOutputBuffers();
        this.e = new MediaCodec.BufferInfo();
        this.f = i3;
        switch (i) {
            case 7350:
                this.g = 12;
                return;
            case 8000:
                this.g = 11;
                return;
            case 11025:
                this.g = 10;
                return;
            case 12000:
                this.g = 9;
                return;
            case 16000:
                this.g = 8;
                return;
            case 22050:
                this.g = 7;
                return;
            case 24000:
                this.g = 6;
                return;
            case 32000:
                this.g = 5;
                return;
            case 44100:
                this.g = 4;
                return;
            case 48000:
                this.g = 3;
                return;
            case 64000:
                this.g = 2;
                return;
            case 88200:
                this.g = 1;
                return;
            case 96000:
                this.g = 0;
                return;
            default:
                throw new RuntimeException("not support");
        }
    }

    @Override // com.meituan.msi.api.record.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b86d4fd526dc4357a5c6e3c094d48bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b86d4fd526dc4357a5c6e3c094d48bf");
            return;
        }
        try {
            this.b.stop();
            this.b.release();
            this.i.flush();
            this.i.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.msi.api.record.b
    public final byte[] a(byte[] bArr) throws Exception {
        char c = 0;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b106b849a564549062a676248dbf8e09", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b106b849a564549062a676248dbf8e09");
        }
        int dequeueInputBuffer = this.b.dequeueInputBuffer(-1L);
        if (dequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer = this.c[dequeueInputBuffer];
            byteBuffer.clear();
            byteBuffer.put(bArr);
            byteBuffer.limit(bArr.length);
            long j = this.h;
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            this.b.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8026524ed41c80a86bca59e03dfc7041", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8026524ed41c80a86bca59e03dfc7041")).longValue() : ((j * 90000) * 1024) / 44100, 0);
            this.h++;
        }
        while (true) {
            int dequeueOutputBuffer = this.b.dequeueOutputBuffer(this.e, 0L);
            if (dequeueOutputBuffer >= 0) {
                int i = this.e.size;
                int i2 = i + 7;
                ByteBuffer byteBuffer2 = this.d[dequeueOutputBuffer];
                byteBuffer2.position(this.e.offset);
                byteBuffer2.limit(this.e.offset + i);
                byte[] bArr2 = new byte[i2];
                Object[] objArr3 = new Object[2];
                objArr3[c] = bArr2;
                objArr3[1] = Integer.valueOf(i2);
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2af2e7dafd6b3a70addc193c0ca76a91", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2af2e7dafd6b3a70addc193c0ca76a91");
                } else {
                    int i3 = this.f;
                    bArr2[0] = -1;
                    bArr2[1] = -7;
                    bArr2[2] = (byte) ((this.g << 2) + 64 + (i3 >> 2));
                    bArr2[3] = (byte) (((i3 & 3) << 6) + (i2 >> 11));
                    bArr2[4] = (byte) ((i2 & 2047) >> 3);
                    bArr2[5] = (byte) (((i2 & 7) << 5) + 31);
                    bArr2[6] = -4;
                }
                byteBuffer2.get(bArr2, 7, i);
                byteBuffer2.position(this.e.offset);
                this.i.write(bArr2);
                this.b.releaseOutputBuffer(dequeueOutputBuffer, false);
                c = 0;
            } else {
                byte[] byteArray = this.i.toByteArray();
                this.i.flush();
                this.i.reset();
                return byteArray;
            }
        }
    }
}
