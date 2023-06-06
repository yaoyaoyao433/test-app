package com.sankuai.waimai.ugc.creator.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.ugc.library.d;
import com.sankuai.meituan.mtlive.ugc.library.interfaces.d;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.entity.inner.VideoData;
import com.sankuai.waimai.ugc.creator.utils.f;
import com.sankuai.waimai.ugc.creator.utils.o;
import com.tencent.liteav.audio.TXEAudioDef;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class b extends com.sankuai.waimai.ugc.creator.utils.task.a<VideoData> {
    public static ChangeQuickRedirect c;
    private final String a;
    private final String b;
    private Context d;

    @Override // com.sankuai.waimai.ugc.creator.utils.task.a
    public final /* synthetic */ VideoData b() throws Exception {
        String a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a5e8731f8ca80172d9a3f48bcee96b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (VideoData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a5e8731f8ca80172d9a3f48bcee96b0");
        }
        if (!o.a(this.d) || TextUtils.isEmpty(this.a)) {
            return null;
        }
        VideoData videoData = new VideoData();
        videoData.i = this.a;
        videoData.h = this.a;
        videoData.l = 540;
        int i = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        videoData.m = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        videoData.r = f.a(this.a);
        d a2 = com.sankuai.meituan.mtlive.ugc.library.b.a(this.d, 33019);
        d.C0618d a3 = a2.a(this.a);
        a2.cancel();
        this.d = null;
        videoData.t = new ImageData();
        videoData.t.i = this.b;
        if (a3 != null) {
            videoData.n = a3.c;
            videoData.l = a3.f != 0 ? a3.f : 540;
            if (a3.g != 0) {
                i = a3.g;
            }
            videoData.m = i;
            videoData.b = a3.b;
            if (TextUtils.isEmpty(videoData.t.i) && a3.a != null) {
                ImageData imageData = videoData.t;
                ImageData imageData2 = videoData.t;
                Bitmap bitmap = a3.a;
                Object[] objArr2 = {bitmap, 100};
                ChangeQuickRedirect changeQuickRedirect2 = f.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5e10d187193e718fc10a71fcecd9fa63", RobustBitConfig.DEFAULT_VALUE)) {
                    a = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5e10d187193e718fc10a71fcecd9fa63");
                } else {
                    String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.CHINA).format(new Date());
                    a = f.a("wm_ugc_cover_" + format + ".png", bitmap, 100);
                }
                imageData2.h = a;
                imageData.i = a;
            }
            videoData.t.r = f.a(videoData.t.i);
        }
        return videoData;
    }

    public b(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42e9deb41151886c09e57d76b3a5f318", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42e9deb41151886c09e57d76b3a5f318");
            return;
        }
        this.d = context;
        this.a = str;
        this.b = str2;
    }
}
