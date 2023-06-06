package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXImageSprite implements com.tencent.rtmp.a.a {
    private Context mContext;
    private com.tencent.rtmp.a.a mImageSprite;

    public TXImageSprite(Context context) {
        this.mContext = context.getApplicationContext();
        TXCDRApi.initCrashReport(context);
    }

    @Override // com.tencent.rtmp.a.a
    public void setVTTUrlAndImageUrls(String str, List<String> list) {
        if (this.mImageSprite != null) {
            release();
        }
        if (str == null || list == null || list.size() == 0) {
            return;
        }
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bD);
        this.mImageSprite = new com.tencent.rtmp.a.b();
        this.mImageSprite.setVTTUrlAndImageUrls(str, list);
    }

    @Override // com.tencent.rtmp.a.a
    public Bitmap getThumbnail(float f) {
        if (this.mImageSprite != null) {
            return this.mImageSprite.getThumbnail(f);
        }
        return null;
    }

    @Override // com.tencent.rtmp.a.a
    public void release() {
        if (this.mImageSprite != null) {
            this.mImageSprite.release();
            this.mImageSprite = null;
        }
    }
}
