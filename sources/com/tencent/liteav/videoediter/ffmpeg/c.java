package com.tencent.liteav.videoediter.ffmpeg;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.d.e;
import com.tencent.liteav.videoediter.ffmpeg.jni.FFDecodedFrame;
import com.tencent.liteav.videoediter.ffmpeg.jni.TXFFAudioDecoderJNI;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes6.dex */
public class c implements com.tencent.liteav.g.b {
    public static String[] b = {"audio/mp4a-latm", "audio/mpeg"};
    private ByteBuffer c;
    private int d;
    private int e;
    private int f;
    private TXFFAudioDecoderJNI g;
    private List<e> h;
    private AtomicBoolean i = new AtomicBoolean(false);
    private FFDecodedFrame j;

    @Override // com.tencent.liteav.g.b
    public void a(MediaFormat mediaFormat, Surface surface) {
    }

    public static boolean a(String str) {
        for (String str2 : b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int b(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -53558318) {
            if (hashCode == 1504831518 && str.equals("audio/mpeg")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("audio/mp4a-latm")) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return -1;
        }
    }

    public c() {
        this.h = new LinkedList();
        this.h = Collections.synchronizedList(this.h);
    }

    @Override // com.tencent.liteav.g.b
    public void a(MediaFormat mediaFormat) {
        b();
        this.d = mediaFormat.getInteger("channel-count");
        this.e = mediaFormat.getInteger("sample-rate");
        if (mediaFormat.containsKey("max-input-size")) {
            this.f = mediaFormat.getInteger("max-input-size");
        }
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        String string = mediaFormat.getString(IMediaFormat.KEY_MIME);
        this.g = new TXFFAudioDecoderJNI();
        this.g.configureInput(b(string), byteBuffer, byteBuffer != null ? byteBuffer.capacity() : 0, this.e, this.d);
        int i = this.d * 1024 * 2;
        this.c = ByteBuffer.allocateDirect(i > this.f ? i : this.f);
        TXCLog.i("TXSWAudioDecoder", "createDecoderByFormat: type = " + string + ", mediaFormat = " + mediaFormat.toString() + ", calculateBufferSize = " + i + ", mMaxInputSize = " + this.f);
    }

    @Override // com.tencent.liteav.g.b
    public void a() {
        if (this.i.get()) {
            TXCLog.e("TXSWAudioDecoder", "start error: decoder have been started!");
            return;
        }
        this.h.clear();
        this.i.set(true);
    }

    @Override // com.tencent.liteav.g.b
    public void b() {
        if (!this.i.get()) {
            TXCLog.e("TXSWAudioDecoder", "stop error: decoder isn't starting yet!!");
            return;
        }
        this.h.clear();
        if (this.g != null) {
            this.g.release();
            this.g = null;
        }
        this.i.set(false);
    }

    @Override // com.tencent.liteav.g.b
    public e c() {
        if (!this.i.get()) {
            TXCLog.e("TXSWAudioDecoder", "find frame error: decoder isn't starting yet!!");
            return null;
        }
        this.c.position(0);
        e eVar = new e();
        eVar.a(this.c);
        eVar.h(this.d);
        eVar.g(this.e);
        eVar.d(this.c.capacity());
        return eVar;
    }

    @Override // com.tencent.liteav.g.b
    public void a(e eVar) {
        if (!this.i.get()) {
            TXCLog.e("TXSWAudioDecoder", "decode error: decoder isn't starting yet!!");
            return;
        }
        if (eVar.f() == 1) {
            byte[] a = a(eVar.b(), eVar.g());
            if (a == null) {
                this.j = null;
                return;
            }
            this.j = this.g.decode(a, eVar.e(), eVar.f());
        } else if (eVar.f() == 4) {
            this.j = new FFDecodedFrame();
            this.j.data = new byte[0];
            this.j.flags = 4;
            this.j.pts = eVar.e();
        }
        eVar.a((ByteBuffer) null);
        eVar.d(0);
        this.c.position(0);
    }

    private byte[] a(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        try {
            byteBuffer.get(bArr);
            return bArr;
        } catch (BufferUnderflowException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.tencent.liteav.g.b
    public e d() {
        if (!this.i.get()) {
            TXCLog.e("TXSWAudioDecoder", "decode error: decoder isn't starting yet!!");
            return null;
        } else if (this.j == null || this.j.data == null) {
            return null;
        } else {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.j.data.length);
            allocateDirect.put(this.j.data);
            allocateDirect.position(0);
            e eVar = new e();
            eVar.a(allocateDirect);
            eVar.d(this.j.data.length);
            eVar.a(this.j.pts);
            eVar.c(this.j.flags);
            eVar.h(this.d);
            eVar.g(this.j.sampleRate);
            this.j = null;
            return eVar;
        }
    }
}
