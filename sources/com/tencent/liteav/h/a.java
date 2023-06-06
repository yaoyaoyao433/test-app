package com.tencent.liteav.h;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.g;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.muxer.c;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import com.tencent.liteav.videoencoder.d;
import com.unionpay.tsmservice.data.Constant;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a implements g, d {
    private c c;
    private C1454a d;
    private b e;
    private long f = 0;
    private long g = -1;
    private boolean h = false;
    private Handler i = new Handler(Looper.getMainLooper()) { // from class: com.tencent.liteav.h.a.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (a.this.e != null) {
                switch (message.what) {
                    case 1:
                        a.this.e.a(((Long) message.obj).longValue());
                        return;
                    case 2:
                        TXCLog.d("TXCStreamRecord", "record complete. errcode = " + message.arg1 + ", errmsg = " + ((String) message.obj) + ", outputPath = " + a.this.d.f + ", coverImage = " + a.this.d.g);
                        if (message.arg1 == 0 && a.this.d.g != null && !a.this.d.g.isEmpty() && !com.tencent.liteav.basic.util.g.a(a.this.d.f, a.this.d.g)) {
                            TXCLog.e("TXCStreamRecord", "saveVideoThumb error. sourcePath = " + a.this.d.f + ", coverImagePath = " + a.this.d.g);
                        }
                        if (message.arg1 != 0) {
                            try {
                                File file = new File(a.this.d.f);
                                if (file.exists()) {
                                    file.delete();
                                }
                            } catch (Exception e) {
                                TXCLog.e("TXCStreamRecord", "delete file failed.", e);
                            }
                        }
                        a.this.e.a(message.arg1, (String) message.obj, a.this.d.f, a.this.d.g);
                        return;
                    default:
                        return;
                }
            }
        }
    };
    private com.tencent.liteav.audio.impl.Record.b a = new com.tencent.liteav.audio.impl.Record.b();
    private com.tencent.liteav.videoencoder.a b = new com.tencent.liteav.videoencoder.a();

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void a(int i, String str, String str2, String str3);

        void a(long j);
    }

    @Override // com.tencent.liteav.videoencoder.d
    public void onEncodeDataIn(int i) {
    }

    @Override // com.tencent.liteav.videoencoder.d
    public void onEncodeFinished(int i, long j, long j2) {
    }

    @Override // com.tencent.liteav.audio.g
    public void onRecordError(int i, String str) {
    }

    @Override // com.tencent.liteav.audio.g
    public void onRecordPcmData(byte[] bArr, long j, int i, int i2, int i3) {
    }

    @Override // com.tencent.liteav.audio.g
    public void onRecordRawPcmData(byte[] bArr, long j, int i, int i2, int i3, boolean z) {
    }

    @Override // com.tencent.liteav.videoencoder.d
    public void onRestartEncoder(int i) {
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.liteav.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1454a {
        public Object e;
        public String f;
        public String g;
        public int a = KNBJsErrorInfo.CODE_DENIED_PERMISSION;
        public int b = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        public int c = 20;
        public int d = 1000;
        public int h = 0;
        public int i = 0;
        public int j = 16;

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TXCStreamRecordParams: [width=" + this.a);
            sb.append("; height=" + this.b);
            sb.append("; fps=" + this.c);
            sb.append("; bitrate=" + this.d);
            sb.append("; channels=" + this.h);
            sb.append("; samplerate=" + this.i);
            sb.append("; bits=" + this.j);
            sb.append("; EGLContext=" + this.e);
            sb.append("; coveriamge=" + this.g);
            sb.append("; outputpath=" + this.f + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            return sb.toString();
        }
    }

    public a(Context context) {
        this.c = new c(context, 2);
    }

    public void a(b bVar) {
        this.e = bVar;
    }

    public void a(C1454a c1454a) {
        this.d = c1454a;
        this.f = 0L;
        this.g = -1L;
        this.c.a(this.d.f);
        if (c1454a.h > 0 && c1454a.i > 0 && c1454a.j > 0) {
            this.a.a(10, c1454a.i, c1454a.h, c1454a.j, new WeakReference<>(this));
            this.c.b(com.tencent.liteav.basic.util.g.a(this.d.i, this.d.h, 2));
            this.h = true;
        }
        this.b.setListener(this);
        TXSVideoEncoderParam tXSVideoEncoderParam = new TXSVideoEncoderParam();
        tXSVideoEncoderParam.width = this.d.a;
        tXSVideoEncoderParam.height = this.d.b;
        tXSVideoEncoderParam.fps = this.d.c;
        tXSVideoEncoderParam.glContext = this.d.e;
        tXSVideoEncoderParam.annexb = true;
        tXSVideoEncoderParam.appendSpsPps = false;
        this.b.setBitrate(this.d.d);
        this.b.start(tXSVideoEncoderParam);
    }

    public void a() {
        this.h = false;
        this.a.a();
        this.b.stop();
        if (this.c.b() < 0) {
            this.i.sendMessage(Message.obtain(this.i, 2, 1, 0, "mp4合成失败"));
        } else {
            this.i.sendMessage(Message.obtain(this.i, 2, 0, 0, ""));
        }
    }

    public void a(int i, long j) {
        this.b.pushVideoFrame(i, this.d.a, this.d.b, j);
    }

    public void a(byte[] bArr, long j) {
        if (this.h) {
            this.a.a(bArr, j);
        } else {
            TXCLog.e("TXCStreamRecord", "drainAudio fail because of not init yet!");
        }
    }

    public static String a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String format = simpleDateFormat.format(new Date(Long.valueOf(valueOf + Constant.DEFAULT_CVN2).longValue()));
            String a = a(context);
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            return new File(a, String.format("TXUGC_%s" + str, format)).getAbsolutePath();
        } catch (Exception e) {
            TXCLog.e("TXCStreamRecord", "create file path failed.", e);
            return null;
        }
    }

    private static String a(Context context) {
        if (context == null) {
            return null;
        }
        if ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
            File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
            return externalFilesDir != null ? externalFilesDir.getPath() : null;
        }
        return context.getFilesDir().getPath();
    }

    private String a(int i) {
        String str;
        switch (i) {
            case 10000002:
                str = "Video encoder is not activated";
                break;
            case 10000003:
                str = "Illegal video input parameters";
                break;
            case 10000004:
                str = "Video encoding failed to initialize";
                break;
            case 10000005:
                str = "Video encoding failed";
                break;
            default:
                str = "";
                break;
        }
        this.i.sendMessage(Message.obtain(this.i, 2, 1, 0, str));
        return str;
    }

    @Override // com.tencent.liteav.audio.g
    public void onRecordEncData(byte[] bArr, long j, int i, int i2, int i3) {
        this.c.a(bArr, 0, bArr.length, j * 1000, 1);
    }

    @Override // com.tencent.liteav.videoencoder.d
    public void onEncodeNAL(TXSNALPacket tXSNALPacket, int i) {
        if (i == 0) {
            this.c.b(tXSNALPacket.nalData, 0, tXSNALPacket.nalData.length, tXSNALPacket.pts * 1000, tXSNALPacket.info.flags);
            if (this.g < 0) {
                this.g = tXSNALPacket.pts;
            }
            if (tXSNALPacket.pts > this.f + 500) {
                this.i.sendMessage(Message.obtain(this.i, 1, new Long(tXSNALPacket.pts - this.g)));
                this.f = tXSNALPacket.pts;
                return;
            }
            return;
        }
        String a = a(i);
        TXCLog.e("TXCStreamRecord", "video encode error! errmsg: " + a);
    }

    @Override // com.tencent.liteav.videoencoder.d
    public void onEncodeFormat(MediaFormat mediaFormat) {
        this.c.a(mediaFormat);
        if (!this.c.c() || this.c.a() >= 0) {
            return;
        }
        this.i.sendMessage(Message.obtain(this.i, 2, 1, 0, "mp4 wrapper failed to start"));
    }
}
