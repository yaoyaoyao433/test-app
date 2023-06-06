package com.dianping.video.videofilter.transcoder.format;

import android.media.MediaFormat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends d {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;

    public b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5213f82ee9ce292ae6c872e78db3711d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5213f82ee9ce292ae6c872e78db3711d");
            return;
        }
        i = i % 2 == 1 ? i - 1 : i;
        i2 = i2 % 2 == 1 ? i2 - 1 : i2;
        this.b = i;
        this.c = i2;
    }

    @Override // com.dianping.video.videofilter.transcoder.format.d
    public final MediaFormat a(MediaFormat mediaFormat, int i) {
        Object[] objArr = {mediaFormat, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dc8ccc130553c83da9eb8e8f6f830d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (MediaFormat) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dc8ccc130553c83da9eb8e8f6f830d3");
        }
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9c6603f845f7bb81124e69632a39f674", RobustBitConfig.DEFAULT_VALUE)) {
            return (MediaFormat) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9c6603f845f7bb81124e69632a39f674");
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i2, i3);
        c.a(createVideoFormat);
        if (i4 <= 0) {
            i4 = 3584000;
        }
        createVideoFormat.setInteger("bitrate", i4);
        return createVideoFormat;
    }
}
