package com.sankuai.meituan.mtlive.ugc.tx;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.ugc.library.MTUgcView;
import com.sankuai.meituan.mtlive.ugc.library.c;
import com.sankuai.meituan.mtlive.ugc.library.interfaces.b;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import com.tencent.ugc.TXUGCRecord;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTTxUgcRecord implements b {
    public static ChangeQuickRedirect a;
    private TXUGCRecord b;
    private a c;
    private com.sankuai.meituan.mtlive.ugc.library.interfaces.a d;
    private Context e;

    public static /* synthetic */ c.C0617c a(MTTxUgcRecord mTTxUgcRecord, TXRecordCommon.TXRecordResult tXRecordResult) {
        Object[] objArr = {tXRecordResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTTxUgcRecord, changeQuickRedirect, false, "cdd8afd37a0cc9addc27cb21c0c396f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (c.C0617c) PatchProxy.accessDispatch(objArr, mTTxUgcRecord, changeQuickRedirect, false, "cdd8afd37a0cc9addc27cb21c0c396f3");
        }
        if (tXRecordResult == null) {
            return null;
        }
        c.C0617c c0617c = new c.C0617c();
        c0617c.d = tXRecordResult.coverPath;
        c0617c.a = tXRecordResult.retCode;
        c0617c.b = tXRecordResult.descMsg;
        c0617c.c = tXRecordResult.videoPath;
        return c0617c;
    }

    public MTTxUgcRecord(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5634ff142a7215f38991c108f06822f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5634ff142a7215f38991c108f06822f2");
            return;
        }
        this.e = context;
        this.b = TXUGCRecord.getInstance(context);
        this.c = new a(this.b.getBeautyManager());
        this.d = new MTTxUgcPartsManager(this.b.getPartsManager());
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.b
    public final void a(final c.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49ab5f02db0d9a6d9634c9923a5013a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49ab5f02db0d9a6d9634c9923a5013a7");
        } else if (bVar == null) {
            this.b.setVideoRecordListener(null);
        } else {
            this.b.setVideoRecordListener(new TXRecordCommon.ITXVideoRecordListener() { // from class: com.sankuai.meituan.mtlive.ugc.tx.MTTxUgcRecord.1
                public static ChangeQuickRedirect a;

                @Override // com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener
                public final void onRecordEvent(int i, Bundle bundle) {
                    Object[] objArr2 = {Integer.valueOf(i), bundle};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63db7b6dc8b9ef6e396658b607d66b17", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63db7b6dc8b9ef6e396658b607d66b17");
                    }
                }

                @Override // com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener
                public final void onRecordProgress(long j) {
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f905e1550d1a987ac256453c694951ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f905e1550d1a987ac256453c694951ba");
                    } else {
                        bVar.a(j);
                    }
                }

                @Override // com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener
                public final void onRecordComplete(TXRecordCommon.TXRecordResult tXRecordResult) {
                    Object[] objArr2 = {tXRecordResult};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dffae1520216f9cf51c72e8be86c0c8f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dffae1520216f9cf51c72e8be86c0c8f");
                    } else {
                        bVar.a(MTTxUgcRecord.a(MTTxUgcRecord.this, tXRecordResult));
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.b
    public final int a(c.d dVar, MTUgcView mTUgcView) {
        TXRecordCommon.TXUGCSimpleConfig tXUGCSimpleConfig;
        Object[] objArr = {dVar, mTUgcView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38a0c297ba72b5a0b2c0211fc24e8b2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38a0c297ba72b5a0b2c0211fc24e8b2c")).intValue();
        }
        TXCloudVideoView tXCloudVideoView = new TXCloudVideoView(this.e);
        mTUgcView.addView(tXCloudVideoView, new FrameLayout.LayoutParams(-1, -1));
        TXUGCRecord tXUGCRecord = this.b;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17366911df00c4ce29a26c6b1bc7cbf6", RobustBitConfig.DEFAULT_VALUE)) {
            tXUGCSimpleConfig = (TXRecordCommon.TXUGCSimpleConfig) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17366911df00c4ce29a26c6b1bc7cbf6");
        } else if (dVar == null) {
            tXUGCSimpleConfig = null;
        } else {
            TXRecordCommon.TXUGCSimpleConfig tXUGCSimpleConfig2 = new TXRecordCommon.TXUGCSimpleConfig();
            tXUGCSimpleConfig2.videoQuality = dVar.a;
            tXUGCSimpleConfig2.watermark = dVar.b;
            tXUGCSimpleConfig2.watermarkX = dVar.c;
            tXUGCSimpleConfig2.watermarkY = dVar.d;
            tXUGCSimpleConfig2.isFront = dVar.e;
            tXUGCSimpleConfig2.touchFocus = dVar.f;
            tXUGCSimpleConfig2.minDuration = dVar.g;
            tXUGCSimpleConfig2.maxDuration = dVar.h;
            tXUGCSimpleConfig2.needEdit = dVar.i;
            tXUGCSimpleConfig = tXUGCSimpleConfig2;
        }
        return tXUGCRecord.startCameraSimplePreview(tXUGCSimpleConfig, tXCloudVideoView);
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dead734366ec46e5df35d2d7c7870e0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dead734366ec46e5df35d2d7c7870e0a");
        } else {
            this.b.stopCameraPreview();
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.b
    public final com.sankuai.meituan.mtlive.ugc.library.interfaces.a b() {
        return this.d;
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.b
    public final int a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78ec78d0e3ca08a78ad144cf9bff9792", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78ec78d0e3ca08a78ad144cf9bff9792")).intValue() : this.b.startRecord(str, str2);
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.b
    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6ecfcd8bd41e74c33e8930d6ed91682", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6ecfcd8bd41e74c33e8930d6ed91682")).intValue() : this.b.stopRecord();
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "affed0cd8e03736bae279b2f7adfb16a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "affed0cd8e03736bae279b2f7adfb16a");
        } else {
            this.b.release();
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.b
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d123d9156acf164879a9902fc66d33f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d123d9156acf164879a9902fc66d33f")).intValue() : this.b.pauseRecord();
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.b
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd2997d8b7403babb43f3b27883ee7ed", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd2997d8b7403babb43f3b27883ee7ed")).intValue() : this.b.resumeRecord();
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.b
    public final boolean a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5044ff0396a3ef824a36f99aad5b57f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5044ff0396a3ef824a36f99aad5b57f")).booleanValue() : this.b.switchCamera(z);
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e21b950743c3feaf92b743c9f7deaf09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e21b950743c3feaf92b743c9f7deaf09");
        } else {
            this.b.setAspectRatio(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.b
    public final void a(final c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05b454fea23a49548d52edd2e07ce2e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05b454fea23a49548d52edd2e07ce2e9");
        } else {
            this.b.snapshot(new TXRecordCommon.ITXSnapshotListener() { // from class: com.sankuai.meituan.mtlive.ugc.tx.MTTxUgcRecord.2
                public static ChangeQuickRedirect a;

                @Override // com.tencent.ugc.TXRecordCommon.ITXSnapshotListener
                public final void onSnapshot(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbee6d194f8b0861f39951092c3c52a7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbee6d194f8b0861f39951092c3c52a7");
                    } else {
                        aVar.a(bitmap);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.b
    public final void a(b.a aVar) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efb412927646b29a14be1731f4f5906d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efb412927646b29a14be1731f4f5906d");
        } else {
            this.b.setVideoProcessListener(null);
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.b
    public final boolean b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40a9a077fc31e07af8c5aba6bbb5059e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40a9a077fc31e07af8c5aba6bbb5059e")).booleanValue() : this.b.toggleTorch(z);
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.b
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64ece179f7070f04e24f3c8ccc2ddd8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64ece179f7070f04e24f3c8ccc2ddd8c");
        } else {
            this.b.setHomeOrientation(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.b
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c0b7ba99bf220c22986bd0d871f1977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c0b7ba99bf220c22986bd0d871f1977");
        } else {
            this.b.setRenderRotation(i);
        }
    }
}
