package com.meituan.android.yoda.util;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.support.annotation.RequiresApi;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
@RequiresApi(api = 18)
/* loaded from: classes3.dex */
public class s {
    public static ChangeQuickRedirect a = null;
    private static final String d = "s";
    private static s f;
    public int b;
    public MediaMuxer c;
    private MediaFormat e;

    public s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "858157ea168e51363d936d24dee27be4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "858157ea168e51363d936d24dee27be4");
        } else {
            this.b = -1;
        }
    }

    public static s a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2928a6b228df15cbaa8ab004ac8c5ce5", RobustBitConfig.DEFAULT_VALUE)) {
            return (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2928a6b228df15cbaa8ab004ac8c5ce5");
        }
        if (f == null) {
            synchronized (s.class) {
                if (f == null) {
                    f = new s();
                }
            }
        }
        return f;
    }

    public final void a(MediaFormat mediaFormat, boolean z) {
        Object[] objArr = {mediaFormat, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ef709b8e180cf62e8ffa7cca3ff27b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ef709b8e180cf62e8ffa7cca3ff27b5");
            return;
        }
        Log.e(d, "添加音频轨和视频轨");
        if (this.b != -1) {
            new RuntimeException("already addTrack");
        }
        int addTrack = this.c.addTrack(mediaFormat);
        this.e = mediaFormat;
        this.b = addTrack;
        if (this.b != -1) {
            this.c.start();
        }
    }

    public final synchronized void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z) {
        Object[] objArr = {byteBuffer, bufferInfo, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76976a11c78cb83d907efe3bb705a7b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76976a11c78cb83d907efe3bb705a7b9");
        } else if (this.b == -1) {
            Log.e(d, "音频轨和视频轨没有添加");
        } else {
            if ((bufferInfo.flags & 2) == 0 && bufferInfo.size != 0) {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.size + bufferInfo.offset);
                this.c.writeSampleData(this.b, byteBuffer, bufferInfo);
            }
        }
    }
}
