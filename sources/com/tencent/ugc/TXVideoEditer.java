package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.license.LicenceCheck;
import com.tencent.liteav.basic.license.f;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.c.b;
import com.tencent.liteav.c.d;
import com.tencent.liteav.c.i;
import com.tencent.liteav.c.j;
import com.tencent.liteav.c.k;
import com.tencent.liteav.d.c;
import com.tencent.liteav.editer.ab;
import com.tencent.liteav.editer.ac;
import com.tencent.liteav.editer.ag;
import com.tencent.liteav.editer.ah;
import com.tencent.liteav.editer.aj;
import com.tencent.liteav.editer.x;
import com.tencent.liteav.f.g;
import com.tencent.liteav.f.h;
import com.tencent.liteav.i.a;
import com.tencent.liteav.i.b;
import com.tencent.ugc.TXVideoEditConstants;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXVideoEditer {
    private static final String TAG = "TXVideoEditer";
    private b mBgmConfig;
    private Context mContext;
    private volatile boolean mIsPreviewStart;
    private d mMotionFilterConfig;
    private TXThumbnailListener mTXThumbnailListener;
    private TXVideoCustomProcessListener mTXVideoCustomProcessListener;
    private TXVideoGenerateListener mTXVideoGenerateListener;
    private TXVideoPreviewListener mTXVideoPreviewListener;
    private TXVideoProcessListener mTXVideoProcessListener;
    private x mVideoAverageThumbnailGenerate;
    private ab mVideoEditGenerate;
    private ac mVideoEditerPreview;
    private i mVideoOutputConfig;
    private j mVideoPreProcessConfig;
    private ag mVideoProcessGenerate;
    private ah mVideoRecordGenerate;
    private k mVideoSourceConfig;
    private aj mVideoTimelistThumbnailGenerate;
    private boolean mSmartLicenseSupport = true;
    private b.InterfaceC1456b mTXCVideoCustomProcessListener = new b.InterfaceC1456b() { // from class: com.tencent.ugc.TXVideoEditer.1
        @Override // com.tencent.liteav.i.b.InterfaceC1456b
        public int a(int i, int i2, int i3, long j) {
            if (TXVideoEditer.this.mTXVideoCustomProcessListener != null) {
                return TXVideoEditer.this.mTXVideoCustomProcessListener.onTextureCustomProcess(i, i2, i3, j);
            }
            return 0;
        }

        @Override // com.tencent.liteav.i.b.InterfaceC1456b
        public void a() {
            if (TXVideoEditer.this.mTXVideoCustomProcessListener != null) {
                TXVideoEditer.this.mTXVideoCustomProcessListener.onTextureDestroyed();
            }
        }
    };
    private b.e mTXCVideoProcessListener = new b.e() { // from class: com.tencent.ugc.TXVideoEditer.2
        @Override // com.tencent.liteav.i.b.e
        public void a(float f) {
            if (TXVideoEditer.this.mTXVideoProcessListener != null) {
                TXVideoEditer.this.mTXVideoProcessListener.onProcessProgress(f);
            }
        }

        @Override // com.tencent.liteav.i.b.e
        public void a(a.c cVar) {
            if (TXVideoEditer.this.mTXVideoProcessListener != null) {
                if (cVar.a != 0) {
                    TXVideoEditer.this.cancel();
                }
                TXVideoEditConstants.TXGenerateResult tXGenerateResult = new TXVideoEditConstants.TXGenerateResult();
                tXGenerateResult.retCode = cVar.a;
                tXGenerateResult.descMsg = cVar.b;
                TXVideoEditer.this.mTXVideoProcessListener.onProcessComplete(tXGenerateResult);
            }
        }
    };
    private b.a mTXCThumbnailListener = new b.a() { // from class: com.tencent.ugc.TXVideoEditer.3
        @Override // com.tencent.liteav.i.b.a
        public void a(int i, long j, Bitmap bitmap) {
            if (TXVideoEditer.this.mTXThumbnailListener != null) {
                TXVideoEditer.this.mTXThumbnailListener.onThumbnail(i, j, bitmap);
            }
        }
    };
    private b.d mTXCVideoPreviewListener = new b.d() { // from class: com.tencent.ugc.TXVideoEditer.4
        @Override // com.tencent.liteav.i.b.d
        public void a(int i) {
            if (TXVideoEditer.this.mTXVideoPreviewListener != null) {
                TXVideoEditer.this.mTXVideoPreviewListener.onPreviewProgress(i);
            }
        }

        @Override // com.tencent.liteav.i.b.d
        public void a() {
            if (TXVideoEditer.this.mTXVideoPreviewListener != null) {
                TXVideoEditer.this.mTXVideoPreviewListener.onPreviewFinished();
            }
        }

        @Override // com.tencent.liteav.i.b.d
        public void a(a.f fVar) {
            TXCLog.e(TXVideoEditer.TAG, "onPreviewError -> error code = " + fVar.a + " msg = " + fVar.b);
            TXVideoEditer.this.stopPlay();
            TXVideoPreviewListener tXVideoPreviewListener = TXVideoEditer.this.mTXVideoPreviewListener;
            if (tXVideoPreviewListener != null) {
                TXVideoEditConstants.TXPreviewError tXPreviewError = new TXVideoEditConstants.TXPreviewError();
                tXPreviewError.errorCode = fVar.a;
                tXPreviewError.errorMsg = fVar.b;
                if (tXVideoPreviewListener instanceof TXVideoPreviewListenerEx) {
                    ((TXVideoPreviewListenerEx) tXVideoPreviewListener).onPreviewError(tXPreviewError);
                } else {
                    tXVideoPreviewListener.onPreviewFinished();
                }
            }
        }
    };
    private b.c mTXCVideoGenerateListener = new b.c() { // from class: com.tencent.ugc.TXVideoEditer.5
        @Override // com.tencent.liteav.i.b.c
        public void a(float f) {
            if (TXVideoEditer.this.mTXVideoGenerateListener != null) {
                TXVideoEditer.this.mTXVideoGenerateListener.onGenerateProgress(f);
            }
        }

        @Override // com.tencent.liteav.i.b.c
        public void a(a.c cVar) {
            TXVideoEditConstants.TXGenerateResult tXGenerateResult = new TXVideoEditConstants.TXGenerateResult();
            tXGenerateResult.retCode = cVar.a;
            tXGenerateResult.descMsg = cVar.b;
            if (tXGenerateResult.retCode == 0) {
                int p = i.a().p();
                int q = i.a().q();
                TXCDRApi.txReportDAU(TXVideoEditer.this.mContext, com.tencent.liteav.basic.datareport.a.aZ, p, "");
                TXCDRApi.txReportDAU(TXVideoEditer.this.mContext, com.tencent.liteav.basic.datareport.a.ba, q, "");
            }
            if (TXVideoEditer.this.mTXVideoGenerateListener != null) {
                TXVideoEditer.this.mTXVideoGenerateListener.onGenerateComplete(tXGenerateResult);
            }
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface TXPCMCallbackListener {
        TXAudioFrame onPCMCallback(TXAudioFrame tXAudioFrame);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface TXThumbnailListener {
        void onThumbnail(int i, long j, Bitmap bitmap);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface TXVideoCustomProcessListener {
        int onTextureCustomProcess(int i, int i2, int i3, long j);

        void onTextureDestroyed();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface TXVideoGenerateListener {
        void onGenerateComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult);

        void onGenerateProgress(float f);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface TXVideoPreviewListener {
        void onPreviewFinished();

        void onPreviewProgress(int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface TXVideoPreviewListenerEx extends TXVideoPreviewListener {
        void onPreviewError(TXVideoEditConstants.TXPreviewError tXPreviewError);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface TXVideoProcessListener {
        void onProcessComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult);

        void onProcessProgress(float f);
    }

    public TXVideoEditer(Context context) {
        this.mContext = context.getApplicationContext();
        TXCCommonUtil.setAppContext(this.mContext);
        TXCLog.init();
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.ax);
        TXCDRApi.initCrashReport(this.mContext);
        LicenceCheck.a().a((f) null, this.mContext);
        this.mVideoEditerPreview = new ac(this.mContext);
        this.mVideoEditGenerate = new ab(this.mContext);
        this.mVideoProcessGenerate = new ag(this.mContext, "Pretreatment");
        this.mVideoRecordGenerate = new ah(this.mContext);
        this.mVideoAverageThumbnailGenerate = new x(this.mContext);
        this.mVideoTimelistThumbnailGenerate = new aj(this.mContext);
        this.mVideoOutputConfig = i.a();
        this.mVideoSourceConfig = k.a();
        this.mVideoPreProcessConfig = j.a();
        this.mBgmConfig = com.tencent.liteav.c.b.a();
        this.mMotionFilterConfig = d.a();
    }

    public int setVideoPath(String str) {
        TXCLog.i(TAG, "=== setVideoPath === videoSource: " + str);
        this.mVideoSourceConfig.a = str;
        return this.mVideoSourceConfig.e();
    }

    private boolean isSmartLicense() {
        LicenceCheck.a().a((f) null, this.mContext);
        if (LicenceCheck.a().b() == -1) {
            this.mSmartLicenseSupport = false;
        } else if (LicenceCheck.a().b() == 2) {
            return true;
        }
        return false;
    }

    public void setCustomVideoProcessListener(TXVideoCustomProcessListener tXVideoCustomProcessListener) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setCustomVideoProcessListener is not supported in UGC_Smart license");
            return;
        }
        this.mTXVideoCustomProcessListener = tXVideoCustomProcessListener;
        if (this.mVideoEditerPreview != null) {
            this.mVideoEditerPreview.a(this.mTXCVideoCustomProcessListener);
        }
        if (this.mVideoEditGenerate != null) {
            this.mVideoEditGenerate.a(this.mTXCVideoCustomProcessListener);
        }
    }

    public void setSpecialRatio(float f) {
        TXCLog.i(TAG, " setSpecialRatio -> " + f);
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setSpecialRatio is not supported in UGC_Smart license");
            return;
        }
        com.tencent.liteav.d.d d = this.mVideoPreProcessConfig.d();
        if (d == null) {
            d = new com.tencent.liteav.d.d();
        }
        d.a(f);
        d.b(0.0f);
        this.mVideoPreProcessConfig.a(d);
    }

    public void setFilter(Bitmap bitmap) {
        float f;
        float f2;
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setFilter is not supported in UGC_Smart license");
            return;
        }
        com.tencent.liteav.d.d d = this.mVideoPreProcessConfig.d();
        if (d != null) {
            f = d.b();
            f2 = d.c();
        } else {
            f = 0.5f;
            f2 = 0.0f;
        }
        setFilter(bitmap, f, null, f2, 1.0f);
        refreshOneFrame();
    }

    public void setFilter(Bitmap bitmap, float f, Bitmap bitmap2, float f2, float f3) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setFilter is not supported in UGC_Smart license");
            return;
        }
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.aQ);
        this.mVideoPreProcessConfig.a(new com.tencent.liteav.d.d(f3, bitmap, f, bitmap2, f2));
        refreshOneFrame();
    }

    public void setBeautyFilter(int i, int i2) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setBeautyFilter is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== setBeautyFilter ==== beautyLevel: " + i + ",whiteningLevel:" + i2);
        this.mVideoPreProcessConfig.a(new c(i, i2));
    }

    public int setPictureList(List<Bitmap> list, int i) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setBeautyFilter is not supported in UGC_Smart license");
            return -1;
        } else if (list == null || list.size() <= 0) {
            TXCLog.e(TAG, "setPictureList, bitmapList is empty!");
            return -1;
        } else {
            if (i <= 15) {
                TXCLog.i(TAG, "setPictureList, fps <= 15, set 15");
                i = 15;
            }
            if (i >= 30) {
                TXCLog.i(TAG, "setPictureList, fps >= 30, set 30");
                i = 30;
            }
            initConfig();
            TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.aX);
            this.mVideoSourceConfig.a(list, i);
            this.mVideoEditerPreview.a(list, i);
            return 0;
        }
    }

    public long setPictureTransition(int i) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setPictureTransition is not supported in UGC_Smart license");
            return 0L;
        }
        long a = this.mVideoEditerPreview.a(i);
        i.a().l = 1000 * a;
        return a;
    }

    public int setBGM(String str) {
        int i;
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setBGM is not supported in UGC_Smart license");
            return 0;
        }
        TXCLog.i(TAG, "==== setBGM ==== path: " + str);
        if (!TextUtils.isEmpty(str)) {
            i = k.a().a(str);
            TXCLog.i(TAG, " setBGM -> ret = " + i);
        } else {
            TXCLog.e(TAG, " setBGM -> bgm path is empty.");
            i = 0;
        }
        if (i != 0) {
            return i;
        }
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.aR);
        this.mBgmConfig.a(str);
        this.mVideoEditerPreview.b(str);
        stopPlay();
        return 0;
    }

    public void setBGMLoop(boolean z) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setBGMLoop is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== setBGMLoop ==== looping: " + z);
        if (this.mBgmConfig.b == this.mBgmConfig.c) {
            TXCLog.w(TAG, "setBGMLoop fail: bgmconfig starttime equals endtime!");
            return;
        }
        this.mBgmConfig.e = z;
        this.mVideoEditerPreview.a(z);
    }

    public void setBGMAtVideoTime(long j) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setBGMAtVideoTime is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== setBGMAtVideoTime ==== videoStartTime: " + j);
        this.mBgmConfig.d = j;
        this.mVideoEditerPreview.a(j);
    }

    public void setBGMStartTime(long j, long j2) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setBGMStartTime is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== setBGMStartTime ==== startTime: " + j + ", endTime: " + j2);
        if (j == j2) {
            TXCLog.w(TAG, "bgm starttime is equal endtime: fail !");
            return;
        }
        this.mBgmConfig.b = j;
        this.mBgmConfig.c = j2;
        this.mVideoEditerPreview.a(j, j2);
    }

    public void setBGMVolume(float f) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setBGMVolume is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== setBGMVolume ==== volume: " + f);
        this.mBgmConfig.g = f;
        this.mVideoEditerPreview.b(f);
    }

    public void setBGMFadeInOutDuration(long j, long j2) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setBGMFadeInOutDuration is not supported in UGC_Smart license");
            return;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if ((i == 0 && j2 == 0) || i < 0 || j2 < 0) {
            this.mBgmConfig.i = false;
            return;
        }
        this.mBgmConfig.i = true;
        this.mBgmConfig.j = j;
        this.mBgmConfig.k = j2;
    }

    public void setWaterMark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setWaterMark is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== setWaterMark ==== waterMark: " + bitmap + ", rect: " + tXRect);
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.aV);
        a.h hVar = new a.h();
        hVar.c = tXRect.width;
        hVar.a = tXRect.x;
        hVar.b = tXRect.y;
        this.mVideoPreProcessConfig.a(new com.tencent.liteav.d.j(bitmap, hVar));
    }

    public void setTailWaterMark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect, int i) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setTailWaterMark is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== setTailWaterMark ==== tailWaterMark: " + bitmap + ", rect: " + tXRect + ", duration: " + i);
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.aW);
        a.h hVar = new a.h();
        hVar.c = tXRect.width;
        hVar.a = tXRect.x;
        hVar.b = tXRect.y;
        com.tencent.liteav.f.j.a().a(new com.tencent.liteav.d.i(bitmap, hVar, i));
    }

    public void setSubtitleList(List<TXVideoEditConstants.TXSubtitle> list) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setSubtitleList is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== setSubtitleList ==== subtitleList: " + list);
        if (list != null) {
            TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.aU);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                TXVideoEditConstants.TXSubtitle tXSubtitle = list.get(i);
                a.k kVar = new a.k();
                a.h hVar = new a.h();
                hVar.c = tXSubtitle.frame.width;
                hVar.a = tXSubtitle.frame.x;
                hVar.b = tXSubtitle.frame.y;
                kVar.b = hVar;
                kVar.a = tXSubtitle.titleImage;
                kVar.c = tXSubtitle.startTime;
                kVar.d = tXSubtitle.endTime;
                arrayList.add(kVar);
            }
            h.a().a(arrayList);
            return;
        }
        h.a().a((List<a.k>) null);
    }

    public void setAnimatedPasterList(List<TXVideoEditConstants.TXAnimatedPaster> list) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setAnimatedPasterList is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== setAnimatedPasterList ==== animatedPasterList: " + list);
        if (list != null) {
            TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.aT);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                TXVideoEditConstants.TXAnimatedPaster tXAnimatedPaster = list.get(i);
                a.b bVar = new a.b();
                a.h hVar = new a.h();
                hVar.c = tXAnimatedPaster.frame.width;
                hVar.a = tXAnimatedPaster.frame.x;
                hVar.b = tXAnimatedPaster.frame.y;
                bVar.b = hVar;
                bVar.a = tXAnimatedPaster.animatedPasterPathFolder;
                bVar.c = tXAnimatedPaster.startTime;
                bVar.d = tXAnimatedPaster.endTime;
                bVar.e = tXAnimatedPaster.rotation;
                arrayList.add(bVar);
            }
            com.tencent.liteav.f.a.a().a(arrayList);
            return;
        }
        com.tencent.liteav.f.a.a().a((List<a.b>) null);
    }

    public void setPasterList(List<TXVideoEditConstants.TXPaster> list) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setPasterList is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== setPasterList ==== pasterList: " + list);
        if (list != null) {
            TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.aS);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                TXVideoEditConstants.TXPaster tXPaster = list.get(i);
                a.e eVar = new a.e();
                a.h hVar = new a.h();
                hVar.c = tXPaster.frame.width;
                hVar.a = tXPaster.frame.x;
                hVar.b = tXPaster.frame.y;
                eVar.b = hVar;
                eVar.a = tXPaster.pasterImage;
                eVar.c = tXPaster.startTime;
                eVar.d = tXPaster.endTime;
                arrayList.add(eVar);
            }
            com.tencent.liteav.f.f.a().a(arrayList);
            return;
        }
        com.tencent.liteav.f.f.a().a((List<a.e>) null);
    }

    public void setRenderRotation(int i) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setRenderRotation is not supported in UGC_Smart license");
            return;
        }
        j.a().a(i);
        if (i.a().t.get() != 3 || this.mVideoEditerPreview == null) {
            return;
        }
        this.mVideoEditerPreview.b();
    }

    public void setSpeedList(List<TXVideoEditConstants.TXSpeed> list) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setSpeedList is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== setSpeedList ==== ");
        if (list != null) {
            TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.aM);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                TXVideoEditConstants.TXSpeed tXSpeed = list.get(i);
                a.j jVar = new a.j();
                jVar.a = tXSpeed.speedLevel;
                jVar.b = tXSpeed.startTime;
                jVar.c = tXSpeed.endTime;
                arrayList.add(jVar);
            }
            g.a().a(arrayList);
            return;
        }
        g.a().a((List<a.j>) null);
    }

    public void setRepeatPlay(List<TXVideoEditConstants.TXRepeat> list) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setRepeatPlay is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== setRepeatPlay ==== ");
        if (list != null) {
            TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.aN);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                TXVideoEditConstants.TXRepeat tXRepeat = list.get(i);
                a.i iVar = new a.i();
                iVar.c = tXRepeat.repeatTimes;
                iVar.a = tXRepeat.startTime;
                iVar.b = tXRepeat.endTime;
                arrayList.add(iVar);
            }
            com.tencent.liteav.c.f.a().a(arrayList);
            TXVideoEditConstants.TXRepeat tXRepeat2 = list.get(0);
            this.mVideoEditerPreview.c(tXRepeat2.startTime * 1000, tXRepeat2.endTime * 1000);
            return;
        }
        TXCLog.i(TAG, "==== cancel setRepeatPlay ==== ");
        com.tencent.liteav.c.f.a().a(null);
        this.mVideoEditerPreview.c(0L, 0L);
    }

    public void setReverse(boolean z) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "setReverse is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== setReverse ====isReverse:" + z);
        if (z) {
            TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.aO);
        }
        this.mVideoEditerPreview.d();
        com.tencent.liteav.c.g.a().a(z);
    }

    public void startEffect(int i, long j) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "startEffect is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== startEffect ==== type: " + i + ", startTime: " + j);
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.aP, i, "");
        com.tencent.liteav.d.f fVar = null;
        switch (i) {
            case 0:
                fVar = new com.tencent.liteav.d.f(2);
                break;
            case 1:
                fVar = new com.tencent.liteav.d.f(3);
                break;
            case 2:
                fVar = new com.tencent.liteav.d.f(0);
                break;
            case 3:
                fVar = new com.tencent.liteav.d.f(1);
                break;
            case 4:
                fVar = new com.tencent.liteav.d.f(4);
                break;
            case 5:
                fVar = new com.tencent.liteav.d.f(5);
                break;
            case 6:
                fVar = new com.tencent.liteav.d.f(6);
                break;
            case 7:
                fVar = new com.tencent.liteav.d.f(7);
                break;
            case 8:
                fVar = new com.tencent.liteav.d.f(8);
                break;
            case 9:
                fVar = new com.tencent.liteav.d.f(11);
                break;
            case 10:
                fVar = new com.tencent.liteav.d.f(10);
                break;
        }
        if (fVar != null) {
            if (com.tencent.liteav.c.g.a().b()) {
                fVar.c = j * 1000;
            } else {
                fVar.b = j * 1000;
            }
            this.mMotionFilterConfig.a(fVar);
        }
    }

    public void stopEffect(int i, long j) {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "stopEffect is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== stopEffect ==== type: " + i + ", endTime: " + j);
        com.tencent.liteav.d.f b = this.mMotionFilterConfig.b();
        if (b != null) {
            if (com.tencent.liteav.c.g.a().b()) {
                b.b = j * 1000;
            } else {
                b.c = j * 1000;
            }
        }
    }

    public void deleteLastEffect() {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "deleteLastEffect is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== deleteLastEffect ====");
        this.mMotionFilterConfig.c();
    }

    public void deleteAllEffect() {
        if (isSmartLicense()) {
            TXCLog.e(TAG, "deleteAllEffect is not supported in UGC_Smart license");
            return;
        }
        TXCLog.i(TAG, "==== deleteAllEffect ====");
        this.mMotionFilterConfig.e();
    }

    public void setVideoProcessListener(TXVideoProcessListener tXVideoProcessListener) {
        this.mTXVideoProcessListener = tXVideoProcessListener;
        if (tXVideoProcessListener == null) {
            if (this.mVideoProcessGenerate != null) {
                this.mVideoProcessGenerate.a((b.e) null);
            }
            if (this.mVideoRecordGenerate != null) {
                this.mVideoRecordGenerate.a((b.e) null);
            }
            if (this.mVideoAverageThumbnailGenerate != null) {
                this.mVideoAverageThumbnailGenerate.a((b.e) null);
                return;
            }
            return;
        }
        if (this.mVideoProcessGenerate != null) {
            this.mVideoProcessGenerate.a(this.mTXCVideoProcessListener);
        }
        if (this.mVideoRecordGenerate != null) {
            this.mVideoRecordGenerate.a(this.mTXCVideoProcessListener);
        }
        if (this.mVideoAverageThumbnailGenerate != null) {
            this.mVideoAverageThumbnailGenerate.a(this.mTXCVideoProcessListener);
        }
    }

    public void getThumbnail(List<Long> list, int i, int i2, boolean z, TXThumbnailListener tXThumbnailListener) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.mTXThumbnailListener = tXThumbnailListener;
        com.tencent.liteav.c.h.a().i();
        com.tencent.liteav.c.h.a().a(z);
        if (this.mVideoTimelistThumbnailGenerate != null) {
            this.mVideoTimelistThumbnailGenerate.a(this.mTXCThumbnailListener);
            this.mVideoTimelistThumbnailGenerate.a(i);
            this.mVideoTimelistThumbnailGenerate.b(i2);
            this.mVideoAverageThumbnailGenerate.b(true);
            this.mVideoTimelistThumbnailGenerate.c(z);
            this.mVideoTimelistThumbnailGenerate.a(list);
            this.mVideoTimelistThumbnailGenerate.a();
        }
    }

    public void getThumbnail(int i, int i2, int i3, boolean z, TXThumbnailListener tXThumbnailListener) {
        com.tencent.liteav.c.h.a().i();
        this.mTXThumbnailListener = tXThumbnailListener;
        a.l lVar = new a.l();
        lVar.a = i;
        lVar.b = i2;
        lVar.c = i3;
        com.tencent.liteav.c.h.a().a(lVar);
        com.tencent.liteav.c.h.a().a(z);
        if (this.mVideoAverageThumbnailGenerate != null) {
            this.mVideoAverageThumbnailGenerate.a(this.mTXCThumbnailListener);
            this.mVideoAverageThumbnailGenerate.b(true);
            this.mVideoAverageThumbnailGenerate.a(true);
            this.mVideoAverageThumbnailGenerate.c(z);
            this.mVideoAverageThumbnailGenerate.a();
        }
    }

    public void setThumbnail(TXVideoEditConstants.TXThumbnail tXThumbnail) {
        a.l lVar = new a.l();
        lVar.a = tXThumbnail.count;
        lVar.b = tXThumbnail.width;
        lVar.c = tXThumbnail.height;
        com.tencent.liteav.c.h.a().a(lVar);
    }

    public void setThumbnailListener(TXThumbnailListener tXThumbnailListener) {
        this.mTXThumbnailListener = tXThumbnailListener;
        if (tXThumbnailListener == null) {
            if (this.mVideoProcessGenerate != null) {
                this.mVideoProcessGenerate.a((b.a) null);
            }
            if (this.mVideoRecordGenerate != null) {
                this.mVideoRecordGenerate.a((b.a) null);
            }
            if (this.mVideoAverageThumbnailGenerate != null) {
                this.mVideoAverageThumbnailGenerate.a((b.a) null);
            }
            if (this.mVideoTimelistThumbnailGenerate != null) {
                this.mVideoTimelistThumbnailGenerate.a((b.a) null);
                return;
            }
            return;
        }
        if (this.mVideoProcessGenerate != null) {
            this.mVideoProcessGenerate.a(this.mTXCThumbnailListener);
        }
        if (this.mVideoRecordGenerate != null) {
            this.mVideoRecordGenerate.a(this.mTXCThumbnailListener);
        }
        if (this.mVideoAverageThumbnailGenerate != null) {
            this.mVideoAverageThumbnailGenerate.a(this.mTXCThumbnailListener);
        }
        if (this.mVideoTimelistThumbnailGenerate != null) {
            this.mVideoTimelistThumbnailGenerate.a(this.mTXCThumbnailListener);
        }
    }

    public void processVideo() {
        TXCLog.i(TAG, "=== processVideo ===");
        if (LicenceCheck.a().a((f) null, this.mContext) != 0 || (LicenceCheck.a().b() == 2 && !this.mSmartLicenseSupport)) {
            TXVideoEditConstants.TXGenerateResult tXGenerateResult = new TXVideoEditConstants.TXGenerateResult();
            tXGenerateResult.retCode = -5;
            tXGenerateResult.descMsg = "licence verify failed";
            if (this.mTXVideoProcessListener != null) {
                this.mTXVideoProcessListener.onProcessComplete(tXGenerateResult);
                return;
            }
            return;
        }
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.bb);
        com.tencent.liteav.c.h.a().a(false);
        this.mVideoOutputConfig.o = com.tencent.liteav.j.f.a(this.mContext, 1);
        this.mVideoOutputConfig.j = 3;
        this.mVideoOutputConfig.m = true;
        boolean f = this.mVideoSourceConfig.f();
        TXCLog.i(TAG, "allFullFrame:" + f);
        this.mVideoOutputConfig.r = f;
        if (f) {
            if (this.mVideoRecordGenerate != null) {
                this.mVideoRecordGenerate.a();
            }
        } else if (this.mVideoProcessGenerate != null) {
            this.mVideoProcessGenerate.a();
        }
    }

    public void release() {
        TXCLog.i(TAG, "=== release ===");
        initConfig();
        if (this.mVideoEditerPreview != null) {
            this.mVideoEditerPreview.g();
        }
        if (this.mVideoRecordGenerate != null) {
            this.mVideoRecordGenerate.d();
        }
        if (this.mVideoProcessGenerate != null) {
            this.mVideoProcessGenerate.d();
        }
        if (this.mVideoEditGenerate != null) {
            this.mVideoEditGenerate.d();
        }
        if (this.mVideoTimelistThumbnailGenerate != null) {
            this.mVideoTimelistThumbnailGenerate.d();
        }
        if (this.mVideoAverageThumbnailGenerate != null) {
            this.mVideoAverageThumbnailGenerate.d();
        }
        this.mTXCThumbnailListener = null;
        this.mTXCVideoCustomProcessListener = null;
        this.mTXCVideoGenerateListener = null;
        this.mTXCVideoPreviewListener = null;
        this.mTXCVideoProcessListener = null;
    }

    private void initConfig() {
        i.a().o();
        k.a().g();
        com.tencent.liteav.c.c.a().h();
        com.tencent.liteav.c.g.a().c();
        com.tencent.liteav.c.f.a().c();
        g.a().d();
        j.a().g();
        h.a().c();
        com.tencent.liteav.f.f.a().c();
        com.tencent.liteav.f.a.a().c();
        d.a().e();
        com.tencent.liteav.c.b.a().b();
        com.tencent.liteav.f.j.a().i();
        com.tencent.liteav.c.h.a().j();
    }

    public void setTXVideoPreviewListener(TXVideoPreviewListener tXVideoPreviewListener) {
        this.mTXVideoPreviewListener = tXVideoPreviewListener;
        if (this.mVideoEditerPreview != null) {
            if (tXVideoPreviewListener == null) {
                this.mVideoEditerPreview.a((b.d) null);
            } else {
                this.mVideoEditerPreview.a(this.mTXCVideoPreviewListener);
            }
        }
    }

    public void initWithPreview(TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        if (tXPreviewParam == null) {
            TXCLog.e(TAG, "=== initWithPreview === please set param not null");
            return;
        }
        TXCLog.i(TAG, "=== initWithPreview === rendeMode: " + tXPreviewParam.renderMode);
        a.g gVar = new a.g();
        gVar.b = tXPreviewParam.renderMode;
        gVar.a = tXPreviewParam.videoView;
        this.mVideoOutputConfig.s = gVar.b;
        if (this.mVideoEditerPreview != null) {
            this.mVideoEditerPreview.a(gVar);
        }
    }

    public void startPlayFromTime(long j, long j2) {
        TXCLog.i(TAG, "==== startPlayFromTime ==== startTime: " + j + ", endTime: " + j2);
        if (this.mIsPreviewStart) {
            stopPlay();
        }
        this.mIsPreviewStart = true;
        if (this.mVideoEditerPreview != null) {
            com.tencent.liteav.c.c.a().b(j * 1000, 1000 * j2);
            this.mVideoEditerPreview.b(j, j2);
            this.mVideoEditerPreview.c();
            i.a().t.set(2);
        }
    }

    public void pausePlay() {
        TXCLog.i(TAG, "==== pausePlay ====");
        if (this.mVideoEditerPreview != null) {
            this.mVideoEditerPreview.f();
            i.a().t.set(3);
        }
    }

    public void resumePlay() {
        TXCLog.i(TAG, "==== resumePlay ====");
        if (this.mVideoEditerPreview != null) {
            this.mVideoEditerPreview.e();
            i.a().t.set(2);
        }
    }

    public void stopPlay() {
        TXCLog.i(TAG, "==== stopPlay ====");
        if (this.mIsPreviewStart) {
            if (this.mVideoEditerPreview != null) {
                this.mVideoEditerPreview.d();
                i.a().t.set(1);
            }
            this.mIsPreviewStart = false;
        }
    }

    public void previewAtTime(long j) {
        TXCLog.d(TAG, "==== previewAtTime ==== timeMs: " + j);
        if (this.mVideoEditerPreview != null) {
            this.mVideoEditerPreview.b(j);
        }
    }

    public void setVideoGenerateListener(TXVideoGenerateListener tXVideoGenerateListener) {
        TXCLog.i(TAG, "=== setVideoGenerateListener === listener:" + tXVideoGenerateListener);
        this.mTXVideoGenerateListener = tXVideoGenerateListener;
        if (this.mVideoEditGenerate != null) {
            if (tXVideoGenerateListener == null) {
                this.mVideoEditGenerate.a((b.c) null);
            } else {
                this.mVideoEditGenerate.a(this.mTXCVideoGenerateListener);
            }
        }
    }

    public void setCutFromTime(long j, long j2) {
        TXCLog.i(TAG, "==== setCutFromTime ==== startTime: " + j + ", endTime: " + j2);
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.aL);
        com.tencent.liteav.c.c.a().a(j * 1000, j2 * 1000);
    }

    public void setVideoBitrate(int i) {
        TXCLog.i(TAG, "==== setVideoBitrate ==== videoBitrate: " + i);
        this.mVideoOutputConfig.p = i;
    }

    public void setAudioBitrate(int i) {
        TXCLog.i(TAG, "==== setAudioBitrate ==== audioBitrate: " + i);
        this.mVideoOutputConfig.q = i * 1024;
    }

    public void generateVideo(int i, String str) {
        TXCLog.i(TAG, "==== generateVideo ==== videoCompressed: " + i + ", videoOutputPath: " + str);
        if (LicenceCheck.a().a((f) null, this.mContext) != 0 || (LicenceCheck.a().b() == 2 && !this.mSmartLicenseSupport)) {
            TXVideoEditConstants.TXGenerateResult tXGenerateResult = new TXVideoEditConstants.TXGenerateResult();
            tXGenerateResult.retCode = -5;
            tXGenerateResult.descMsg = "licence verify failed";
            if (this.mTXVideoGenerateListener != null) {
                this.mTXVideoGenerateListener.onGenerateComplete(tXGenerateResult);
                return;
            }
            return;
        }
        this.mVideoOutputConfig.s = 2;
        this.mVideoOutputConfig.i = str;
        this.mVideoOutputConfig.j = i;
        this.mVideoOutputConfig.m = false;
        if (this.mVideoEditGenerate != null) {
            this.mVideoEditGenerate.a();
        }
    }

    public void cancel() {
        TXCLog.i(TAG, "==== cancel ====");
        if (this.mVideoAverageThumbnailGenerate != null) {
            this.mVideoAverageThumbnailGenerate.c();
        }
        if (this.mVideoTimelistThumbnailGenerate != null) {
            this.mVideoTimelistThumbnailGenerate.c();
        }
        if (this.mVideoRecordGenerate != null) {
            this.mVideoRecordGenerate.c();
        }
        if (this.mVideoProcessGenerate != null) {
            this.mVideoProcessGenerate.c();
        }
        if (this.mVideoEditGenerate != null) {
            this.mVideoEditGenerate.c();
        }
    }

    public void refreshOneFrame() {
        TXCLog.d(TAG, "==== refreshOneFrame ====");
        if (this.mVideoEditerPreview != null) {
            this.mVideoEditerPreview.a();
        }
    }

    public void setVideoVolume(float f) {
        TXCLog.i(TAG, "==== setVideoVolume ==== volume: " + f);
        this.mBgmConfig.f = f;
        if (this.mVideoEditerPreview != null) {
            this.mVideoEditerPreview.a(f);
        }
    }
}
