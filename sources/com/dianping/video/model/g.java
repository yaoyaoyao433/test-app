package com.dianping.video.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public String X;
    public com.dianping.video.videofilter.transcoder.format.d Y;
    public ArrayList<e> Z;
    public ArrayList<ArrayList<c>> aa;
    public d ab;
    public HashMap<String, String> ac;
    public f ad;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public long j;
    public long k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public double r;
    public double s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9b8478916e54d2e7060e7773db56683", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9b8478916e54d2e7060e7773db56683");
            return;
        }
        this.c = -1;
        this.r = 181.0d;
        this.s = 91.0d;
        this.A = true;
        this.Z = new ArrayList<>();
        this.ad = new f();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1f8cdaac02085b79e90938b66ef867e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1f8cdaac02085b79e90938b66ef867e");
        }
        return "TranscodeVideoModel{originVideoBitrate=" + this.b + ", rotationDegree=" + this.c + ", mixType=" + this.d + ", originVideoWidth=" + this.e + ", originVideoHeight=" + this.f + ", outputVideoWidth=" + this.g + ", outputVideoHeight=" + this.h + ", clipVideoStart=" + this.i + ", clipVideoEnd=" + this.j + ", iFrameInternal=" + this.k + ", leftMargin=" + this.l + ", rightMargin=" + this.m + ", topMargin=" + this.n + ", bottomMargin=" + this.o + ", bgmVolume=" + this.p + ", originVideoVolume=" + this.q + ", longitude=" + this.r + ", latitude=" + this.s + ", isSquare=" + this.t + ", isW3H4=" + this.u + ", isW4H3=" + this.v + ", isOnlyCompress=" + this.w + ", isInsertIFrame=" + this.x + ", clipSize=" + this.y + ", needProcessAudio=" + this.z + ", needProcessVideo=" + this.A + ", isReverseVideo=" + this.B + ", enableTranscodeBySoftWare=" + this.C + ", disableTranscodedByHardWare=" + this.D + ", needCollectVideoInfo=" + this.E + ", clipVideoExactly=" + this.F + ", compressedData2Draft=" + this.G + ", readCoverFromGpu=" + this.H + ", stickerKeeping=" + this.I + ", interruptProcessing=" + this.J + ", retryTranscode=" + this.K + ", targetVideoCoverPath='" + this.L + ", originVideoPath='" + this.M + ", targetVideoPath='" + this.N + ", originAudioPath='" + this.O + ", originAudioPcmPath='" + this.P + ", originAudioAacPath='" + this.Q + ", originAudioPcmCachePath='" + this.R + ", videoCompressedDataDraftPath='" + this.S + ", audioCompressedDataDraftPath='" + this.T + ", videoCompressedDataDocPath='" + this.U + ", audioCompressedDataDocPath='" + this.V + ", videoDecoderName='" + this.W + ", videoEncoderName='" + this.X + ", renderStrategyMode=" + this.ab + '}';
    }
}
