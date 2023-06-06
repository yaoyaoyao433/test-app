package com.tencent.ugc;

import android.content.Context;
import android.os.Build;
import com.tencent.liteav.b.k;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.license.LicenceCheck;
import com.tencent.liteav.basic.license.f;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.c.i;
import com.tencent.liteav.g.e;
import com.tencent.liteav.g.p;
import com.tencent.liteav.g.r;
import com.tencent.liteav.g.s;
import com.tencent.liteav.g.t;
import com.tencent.liteav.i.a;
import com.tencent.liteav.i.c;
import com.tencent.liteav.videoediter.ffmpeg.b;
import com.tencent.ugc.TXVideoEditConstants;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXVideoJoiner {
    private static final String TAG = "TXVideoJoiner";
    private Context mContext;
    private b mQuickJointer;
    private k mTXCombineVideo;
    private TXVideoJoinerListener mTXVideoJoinerListener;
    private TXVideoPreviewListener mTXVideoPreviewListener;
    private p mVideoJoinGenerate;
    private r mVideoJoinPreview;
    private s mVideoOutputListConfig;
    private List<String> mVideoPathList;
    private t mVideoSourceListConfig;
    private c.b mTXCVideoPreviewListener = new c.b() { // from class: com.tencent.ugc.TXVideoJoiner.1
        @Override // com.tencent.liteav.i.c.b
        public void a(int i) {
            if (TXVideoJoiner.this.mTXVideoPreviewListener != null) {
                TXVideoJoiner.this.mTXVideoPreviewListener.onPreviewProgress(i);
            }
        }

        @Override // com.tencent.liteav.i.c.b
        public void a() {
            if (TXVideoJoiner.this.mTXVideoPreviewListener != null) {
                TXVideoJoiner.this.mTXVideoPreviewListener.onPreviewFinished();
            }
        }
    };
    private c.a mTXCVideoJoinerListener = new c.a() { // from class: com.tencent.ugc.TXVideoJoiner.2
        @Override // com.tencent.liteav.i.c.a
        public void a(float f) {
            if (TXVideoJoiner.this.mTXVideoJoinerListener != null) {
                TXVideoJoiner.this.mTXVideoJoinerListener.onJoinProgress(f);
            }
        }

        @Override // com.tencent.liteav.i.c.a
        public void a(a.d dVar) {
            TXVideoEditConstants.TXJoinerResult tXJoinerResult = new TXVideoEditConstants.TXJoinerResult();
            tXJoinerResult.retCode = dVar.a;
            tXJoinerResult.descMsg = dVar.b;
            if (tXJoinerResult.retCode == 0) {
                int p = i.a().p();
                int q = i.a().q();
                TXCDRApi.txReportDAU(TXVideoJoiner.this.mContext, com.tencent.liteav.basic.datareport.a.aZ, p, "");
                TXCDRApi.txReportDAU(TXVideoJoiner.this.mContext, com.tencent.liteav.basic.datareport.a.ba, q, "");
            }
            if (TXVideoJoiner.this.mTXVideoJoinerListener != null) {
                TXVideoJoiner.this.mTXVideoJoinerListener.onJoinComplete(tXJoinerResult);
            }
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface TXVideoJoinerListener {
        void onJoinComplete(TXVideoEditConstants.TXJoinerResult tXJoinerResult);

        void onJoinProgress(float f);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface TXVideoPreviewListener {
        void onPreviewFinished();

        void onPreviewProgress(int i);
    }

    public TXVideoJoiner(Context context) {
        this.mContext = context.getApplicationContext();
        TXCCommonUtil.setAppContext(this.mContext);
        TXCLog.init();
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.ay);
        TXCDRApi.initCrashReport(this.mContext);
        LicenceCheck.a().a((f) null, this.mContext);
        this.mVideoJoinPreview = new r(this.mContext);
        this.mVideoJoinGenerate = new p(this.mContext);
        this.mTXCombineVideo = new k(context);
        this.mVideoSourceListConfig = t.a();
        this.mVideoOutputListConfig = s.r();
    }

    public int setVideoPathList(List<String> list) {
        if (list == null || list.size() == 0) {
            TXCLog.e(TAG, "==== setVideoSourceList ==== is empty");
            return 0;
        }
        TXCLog.i(TAG, "==== setVideoSourceList videoSourceList:" + list);
        this.mVideoPathList = list;
        this.mVideoSourceListConfig.a(list);
        this.mTXCombineVideo.a(list);
        return this.mVideoSourceListConfig.c();
    }

    public void initWithPreview(TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        if (tXPreviewParam == null) {
            TXCLog.e(TAG, "=== initWithPreview === please set param not null");
            return;
        }
        TXCLog.i(TAG, "=== initWithPreview === rendeMode: " + tXPreviewParam.renderMode);
        a.g gVar = new a.g();
        gVar.a = tXPreviewParam.videoView;
        gVar.b = tXPreviewParam.renderMode;
        this.mVideoOutputListConfig.u = gVar.b;
        if (this.mVideoJoinPreview != null) {
            this.mVideoJoinPreview.a(gVar);
        }
    }

    public void setTXVideoPreviewListener(TXVideoPreviewListener tXVideoPreviewListener) {
        TXCLog.i(TAG, "==== setTXVideoPreviewListener ====listener:" + tXVideoPreviewListener);
        this.mTXVideoPreviewListener = tXVideoPreviewListener;
        if (this.mVideoJoinPreview != null) {
            if (tXVideoPreviewListener == null) {
                this.mVideoJoinPreview.a((c.b) null);
            } else {
                this.mVideoJoinPreview.a(this.mTXCVideoPreviewListener);
            }
        }
    }

    public void startPlay() {
        TXCLog.i(TAG, "==== startPlay ====");
        if (this.mVideoJoinPreview != null) {
            this.mVideoJoinPreview.a();
        }
    }

    public void pausePlay() {
        TXCLog.i(TAG, "==== pausePlay ====");
        if (this.mVideoJoinPreview != null) {
            this.mVideoJoinPreview.c();
        }
    }

    public void resumePlay() {
        TXCLog.i(TAG, "==== resumePlay ====");
        if (this.mVideoJoinPreview != null) {
            this.mVideoJoinPreview.d();
        }
    }

    public void stopPlay() {
        TXCLog.i(TAG, "==== stopPlay ====");
        if (this.mVideoJoinPreview != null) {
            this.mVideoJoinPreview.b();
        }
    }

    public void setVideoJoinerListener(TXVideoJoinerListener tXVideoJoinerListener) {
        TXCLog.i(TAG, "=== setVideoJoinerListener === listener:" + tXVideoJoinerListener);
        this.mTXVideoJoinerListener = tXVideoJoinerListener;
        if (this.mVideoJoinGenerate != null) {
            if (tXVideoJoinerListener == null) {
                this.mVideoJoinGenerate.a((c.a) null);
            } else {
                this.mVideoJoinGenerate.a(this.mTXCVideoJoinerListener);
            }
        }
    }

    public void joinVideo(int i, String str) {
        TXCLog.i(TAG, "==== joinVideo ====");
        int a = LicenceCheck.a().a((f) null, this.mContext);
        if (a != 0 || LicenceCheck.a().b() == 2) {
            TXCLog.e(TAG, "joinVideo, checkErrCode = " + a + ", licenseVersionType = " + LicenceCheck.a().b());
            TXVideoEditConstants.TXJoinerResult tXJoinerResult = new TXVideoEditConstants.TXJoinerResult();
            tXJoinerResult.retCode = -5;
            tXJoinerResult.descMsg = "licence verify failed";
            if (this.mTXVideoJoinerListener != null) {
                this.mTXVideoJoinerListener.onJoinComplete(tXJoinerResult);
                return;
            }
            return;
        }
        this.mVideoOutputListConfig.i = str;
        this.mVideoOutputListConfig.v = i;
        if (quickJoin() || this.mVideoJoinGenerate == null) {
            return;
        }
        this.mVideoJoinGenerate.a();
    }

    public void cancel() {
        TXCLog.i(TAG, "==== cancel ====");
        if (this.mVideoJoinGenerate != null) {
            this.mVideoJoinGenerate.b();
        }
        if (this.mQuickJointer != null) {
            this.mQuickJointer.c();
            this.mQuickJointer = null;
        }
        if (this.mTXCombineVideo != null) {
            this.mTXCombineVideo.a((c.a) null);
            this.mTXCombineVideo.b();
        }
    }

    private boolean quickJoin() {
        this.mQuickJointer = new b("joiner");
        this.mQuickJointer.a(this.mVideoPathList);
        this.mQuickJointer.a(this.mVideoOutputListConfig.i);
        boolean isMatchQuickJoin = isMatchQuickJoin();
        if (isMatchQuickJoin) {
            this.mQuickJointer.a(new b.a() { // from class: com.tencent.ugc.TXVideoJoiner.3
                @Override // com.tencent.liteav.videoediter.ffmpeg.b.a
                public void a(b bVar, int i, String str) {
                    bVar.c();
                    bVar.d();
                    TXVideoJoiner.this.mQuickJointer = null;
                    TXVideoEditConstants.TXJoinerResult tXJoinerResult = new TXVideoEditConstants.TXJoinerResult();
                    tXJoinerResult.retCode = i == 0 ? 0 : -1;
                    tXJoinerResult.descMsg = str;
                    if (TXVideoJoiner.this.mTXVideoJoinerListener != null) {
                        TXVideoJoiner.this.mTXVideoJoinerListener.onJoinComplete(tXJoinerResult);
                    }
                }

                @Override // com.tencent.liteav.videoediter.ffmpeg.b.a
                public void a(b bVar, float f) {
                    if (TXVideoJoiner.this.mTXVideoJoinerListener != null) {
                        TXVideoJoiner.this.mTXVideoJoinerListener.onJoinProgress(f);
                    }
                }
            });
            TXCLog.i(TAG, "==== quickJoin ====");
            this.mQuickJointer.b();
        }
        return isMatchQuickJoin;
    }

    private boolean isMatchQuickJoin() {
        boolean a = this.mQuickJointer.a();
        if (a) {
            int e = this.mQuickJointer.e();
            int f = this.mQuickJointer.f();
            this.mVideoOutputListConfig.a(this.mVideoSourceListConfig.j());
            int[] a2 = com.tencent.liteav.j.c.a(this.mVideoOutputListConfig.v, e, f);
            a = e == a2[0] && f == a2[1];
        }
        if (a) {
            if (isVideoDurationBiggerTooMuchThanAudio()) {
                a = false;
            }
            if (hasBFrame() || isContainsContentUri()) {
                return false;
            }
            return a;
        }
        return a;
    }

    private boolean isContainsContentUri() {
        List<String> b = t.a().b();
        boolean z = false;
        for (int i = 0; i < b.size(); i++) {
            if (com.tencent.liteav.editer.p.c(b.get(i))) {
                z = true;
            }
        }
        return z;
    }

    private boolean isVideoDurationBiggerTooMuchThanAudio() {
        if (Build.VERSION.SDK_INT >= 16) {
            e eVar = new e();
            for (int i = 0; i < this.mVideoPathList.size(); i++) {
                eVar.a(this.mVideoPathList.get(i));
                long j = eVar.j();
                long k = eVar.k();
                if (j <= 0 || k <= 0) {
                    return true;
                }
                if (j - k > 400000) {
                    TXCLog.i(TAG, "isVideoDurationBiggerTooMuchThanAudio, videoDuration = " + j + ", audioDuration = " + k);
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasBFrame() {
        long j;
        if (Build.VERSION.SDK_INT >= 16) {
            e eVar = new e();
            for (int i = 0; i < this.mVideoPathList.size(); i++) {
                eVar.a(this.mVideoPathList.get(i));
                int d = eVar.d();
                if (d <= 0) {
                    d = 1;
                }
                eVar.a(0L);
                while (true) {
                    long r = eVar.r();
                    TXCLog.i(TAG, "isMatchQuickJoin, video index = " + i + ", pts = " + r + ", lastVideoPts = " + j);
                    if (r >= d * 1000000) {
                        break;
                    } else if (r < j) {
                        eVar.o();
                        return true;
                    } else {
                        j = eVar.c(new com.tencent.liteav.d.e()) ? -1L : r;
                    }
                }
            }
            eVar.o();
        }
        return false;
    }

    public void setSplitScreenList(List<TXVideoEditConstants.TXAbsoluteRect> list, int i, int i2) {
        TXCLog.i(TAG, "==== setSplitScreenList ====canvasWidth:" + i + ",canvasHeight:" + i2);
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect = list.get(i3);
            a.C1455a c1455a = new a.C1455a();
            c1455a.c = tXAbsoluteRect.width;
            c1455a.d = tXAbsoluteRect.height;
            c1455a.a = tXAbsoluteRect.x;
            c1455a.b = tXAbsoluteRect.y;
            arrayList.add(c1455a);
        }
        this.mTXCombineVideo.a(arrayList, i, i2);
    }

    public void setVideoVolumes(List<Float> list) {
        if (this.mTXCombineVideo != null) {
            this.mTXCombineVideo.b(list);
        }
    }

    public void splitJoinVideo(int i, String str) {
        TXCLog.i(TAG, "==== splitJoinVideo ====");
        TXCDRApi.txReportDAU(this.mContext, com.tencent.liteav.basic.datareport.a.aY);
        int a = LicenceCheck.a().a((f) null, this.mContext);
        if (a != 0 || LicenceCheck.a().b() == 2) {
            TXCLog.e(TAG, "splitJoinVideo, checkErrCode = " + a + ", licenseVersionType = " + LicenceCheck.a().b());
            TXVideoEditConstants.TXJoinerResult tXJoinerResult = new TXVideoEditConstants.TXJoinerResult();
            tXJoinerResult.retCode = -5;
            tXJoinerResult.descMsg = "licence verify failed";
            if (this.mTXVideoJoinerListener != null) {
                this.mTXVideoJoinerListener.onJoinComplete(tXJoinerResult);
            }
        } else if (!t.a().h()) {
            TXVideoEditConstants.TXJoinerResult tXJoinerResult2 = new TXVideoEditConstants.TXJoinerResult();
            tXJoinerResult2.retCode = -5;
            tXJoinerResult2.descMsg = "Chorus video does not support videos with no audio tracks";
            if (this.mTXVideoJoinerListener != null) {
                this.mTXVideoJoinerListener.onJoinComplete(tXJoinerResult2);
            }
        } else if (this.mTXCombineVideo != null) {
            this.mTXCombineVideo.a(str);
            this.mTXCombineVideo.a(this.mTXCVideoJoinerListener);
            this.mTXCombineVideo.a();
        }
    }
}
