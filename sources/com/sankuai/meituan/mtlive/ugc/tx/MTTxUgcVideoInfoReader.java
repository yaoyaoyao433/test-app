package com.sankuai.meituan.mtlive.ugc.tx;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.ugc.library.d;
import com.sankuai.meituan.mtlive.ugc.library.interfaces.d;
import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.TXVideoInfoReader;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTTxUgcVideoInfoReader implements d {
    public static ChangeQuickRedirect a;
    private TXVideoInfoReader b;

    public MTTxUgcVideoInfoReader(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0dfeb41030767c6afa4543ced7ae838", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0dfeb41030767c6afa4543ced7ae838");
        } else {
            this.b = TXVideoInfoReader.getInstance(context);
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.d
    public final d.C0618d a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96f22a14aa2d71a3f79abb7fc6f5636a", RobustBitConfig.DEFAULT_VALUE)) {
            return (d.C0618d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96f22a14aa2d71a3f79abb7fc6f5636a");
        }
        TXVideoEditConstants.TXVideoInfo videoFileInfo = this.b.getVideoFileInfo(str);
        Object[] objArr2 = {videoFileInfo};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f23f65c8ee571da747fa905b51ed8322", RobustBitConfig.DEFAULT_VALUE)) {
            return (d.C0618d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f23f65c8ee571da747fa905b51ed8322");
        }
        if (videoFileInfo == null) {
            return null;
        }
        d.C0618d c0618d = new d.C0618d();
        c0618d.a = videoFileInfo.coverImage;
        c0618d.b = videoFileInfo.duration;
        c0618d.c = videoFileInfo.fileSize;
        c0618d.d = videoFileInfo.fps;
        c0618d.e = videoFileInfo.bitrate;
        c0618d.f = videoFileInfo.width;
        c0618d.g = videoFileInfo.height;
        c0618d.h = videoFileInfo.audioSampleRate;
        return c0618d;
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.d
    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5997fb57237b8f6234caa150ced4807", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5997fb57237b8f6234caa150ced4807");
        } else {
            this.b.cancel();
        }
    }
}
