package com.dianping.video.videofilter.transcoder.compat;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final MediaCodec b;
    public final ByteBuffer[] c;
    public final ByteBuffer[] d;

    @TargetApi(16)
    public a(MediaCodec mediaCodec) {
        Object[] objArr = {mediaCodec};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62462eb5a3c502fc1101cff02d3b3af2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62462eb5a3c502fc1101cff02d3b3af2");
            return;
        }
        this.b = mediaCodec;
        if (Build.VERSION.SDK_INT < 21) {
            this.c = mediaCodec.getInputBuffers();
            this.d = mediaCodec.getOutputBuffers();
            return;
        }
        this.d = null;
        this.c = null;
    }

    public final ByteBuffer a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "818c733b90de77cc51871be3ac5aa2e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "818c733b90de77cc51871be3ac5aa2e4");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return this.b.getInputBuffer(i);
        }
        return this.c[i];
    }

    public final ByteBuffer b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fecb4502790592f04cf338910eb25f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fecb4502790592f04cf338910eb25f7");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return this.b.getOutputBuffer(i);
        }
        return this.b.getOutputBuffers()[i];
    }
}
