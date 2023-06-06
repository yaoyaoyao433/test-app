package com.sankuai.meituan.mtlive.ugc.tx;

import android.content.Context;
import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.ugc.library.d;
import com.sankuai.meituan.mtlive.ugc.library.interfaces.c;
import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.TXVideoEditer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTTxUgcVideoEditor implements c {
    public static ChangeQuickRedirect a;
    private TXVideoEditer b;

    public static /* synthetic */ d.a a(MTTxUgcVideoEditor mTTxUgcVideoEditor, TXVideoEditConstants.TXGenerateResult tXGenerateResult) {
        Object[] objArr = {tXGenerateResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTTxUgcVideoEditor, changeQuickRedirect, false, "e0f097b4cfef25abe5b28eca3f68df68", RobustBitConfig.DEFAULT_VALUE)) {
            return (d.a) PatchProxy.accessDispatch(objArr, mTTxUgcVideoEditor, changeQuickRedirect, false, "e0f097b4cfef25abe5b28eca3f68df68");
        }
        if (tXGenerateResult == null) {
            return null;
        }
        d.a aVar = new d.a();
        aVar.a = tXGenerateResult.retCode;
        aVar.b = tXGenerateResult.descMsg;
        return aVar;
    }

    public MTTxUgcVideoEditor(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d647f432436b553e02021ba8b48c2a65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d647f432436b553e02021ba8b48c2a65");
        } else {
            this.b = new TXVideoEditer(context);
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25a517ddd387d94f171aec2266b5cfe6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25a517ddd387d94f171aec2266b5cfe6")).intValue() : this.b.setVideoPath(str);
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "998fbaae357d88e88c287a9c3a7ba472", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "998fbaae357d88e88c287a9c3a7ba472");
        } else {
            this.b.setSpecialRatio(f);
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final void a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98673cf76a45515255d13b9c0181304c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98673cf76a45515255d13b9c0181304c");
        } else {
            this.b.setFilter(bitmap);
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final void a(List<d.c> list) {
        List<TXVideoEditConstants.TXSpeed> list2;
        TXVideoEditConstants.TXSpeed tXSpeed;
        int i = 1;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aee60819a88cca180dae588517f82c63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aee60819a88cca180dae588517f82c63");
            return;
        }
        TXVideoEditer tXVideoEditer = this.b;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f0d8d01d56d3f6842dc1a4805035968", RobustBitConfig.DEFAULT_VALUE)) {
            list2 = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f0d8d01d56d3f6842dc1a4805035968");
        } else if (list == null) {
            list2 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (d.c cVar : list) {
                Object[] objArr3 = new Object[i];
                objArr3[0] = cVar;
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "373c82a22b83b9436ee49485627b598f", RobustBitConfig.DEFAULT_VALUE)) {
                    tXSpeed = (TXVideoEditConstants.TXSpeed) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "373c82a22b83b9436ee49485627b598f");
                } else if (cVar == null) {
                    tXSpeed = null;
                } else {
                    tXSpeed = new TXVideoEditConstants.TXSpeed();
                    tXSpeed.speedLevel = cVar.a;
                    tXSpeed.startTime = cVar.b;
                    tXSpeed.endTime = cVar.c;
                }
                arrayList.add(tXSpeed);
                i = 1;
            }
            list2 = arrayList;
        }
        tXVideoEditer.setSpeedList(list2);
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final void a(List<Long> list, int i, int i2, boolean z, final c.a aVar) {
        Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2), (byte) 1, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "027d04db0c8673b80f86fc09fb7f3909", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "027d04db0c8673b80f86fc09fb7f3909");
        } else {
            this.b.getThumbnail(list, i, i2, true, new TXVideoEditer.TXThumbnailListener() { // from class: com.sankuai.meituan.mtlive.ugc.tx.MTTxUgcVideoEditor.1
                public static ChangeQuickRedirect a;

                @Override // com.tencent.ugc.TXVideoEditer.TXThumbnailListener
                public final void onThumbnail(int i3, long j, Bitmap bitmap) {
                    Object[] objArr2 = {Integer.valueOf(i3), new Long(j), bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f5c2f2f6c8a69f1d42d3efe860a16d4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f5c2f2f6c8a69f1d42d3efe860a16d4");
                    } else {
                        aVar.a(i3, j, bitmap);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final void a(int i, int i2, int i3, boolean z, final c.a aVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), (byte) 1, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27c13ef5bc74cdf1adb982b5a59dbdac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27c13ef5bc74cdf1adb982b5a59dbdac");
        } else {
            this.b.getThumbnail(i, i2, i3, true, new TXVideoEditer.TXThumbnailListener() { // from class: com.sankuai.meituan.mtlive.ugc.tx.MTTxUgcVideoEditor.2
                public static ChangeQuickRedirect a;

                @Override // com.tencent.ugc.TXVideoEditer.TXThumbnailListener
                public final void onThumbnail(int i4, long j, Bitmap bitmap) {
                    Object[] objArr2 = {Integer.valueOf(i4), new Long(j), bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f28500d91c116f0d2a6b903846f9ac4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f28500d91c116f0d2a6b903846f9ac4");
                    } else {
                        aVar.a(i4, j, bitmap);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "316d29757d88b42b78ea90bb0e6b220c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "316d29757d88b42b78ea90bb0e6b220c");
        } else {
            this.b.release();
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final void a(final c.InterfaceC0619c interfaceC0619c) {
        Object[] objArr = {interfaceC0619c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51e238545463d491983618e8470cb668", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51e238545463d491983618e8470cb668");
        } else if (interfaceC0619c == null) {
            this.b.setTXVideoPreviewListener(null);
        } else {
            this.b.setTXVideoPreviewListener(new TXVideoEditer.TXVideoPreviewListener() { // from class: com.sankuai.meituan.mtlive.ugc.tx.MTTxUgcVideoEditor.3
                public static ChangeQuickRedirect a;

                @Override // com.tencent.ugc.TXVideoEditer.TXVideoPreviewListener
                public final void onPreviewProgress(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "972441f08515a1db8b78d3faa2372306", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "972441f08515a1db8b78d3faa2372306");
                    }
                }

                @Override // com.tencent.ugc.TXVideoEditer.TXVideoPreviewListener
                public final void onPreviewFinished() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5643aa90af25e97b875f035fd70e99e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5643aa90af25e97b875f035fd70e99e");
                    } else {
                        interfaceC0619c.a();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final void a(d.b bVar) {
        TXVideoEditConstants.TXPreviewParam tXPreviewParam;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40dcaeec68dca79d244872f89f016a45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40dcaeec68dca79d244872f89f016a45");
            return;
        }
        TXVideoEditer tXVideoEditer = this.b;
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca64e81acd1e29934b9aa12f8118c090", RobustBitConfig.DEFAULT_VALUE)) {
            tXPreviewParam = (TXVideoEditConstants.TXPreviewParam) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca64e81acd1e29934b9aa12f8118c090");
        } else if (bVar == null) {
            tXPreviewParam = null;
        } else {
            TXVideoEditConstants.TXPreviewParam tXPreviewParam2 = new TXVideoEditConstants.TXPreviewParam();
            tXPreviewParam2.videoView = bVar.a;
            tXPreviewParam2.renderMode = bVar.b;
            tXPreviewParam = tXPreviewParam2;
        }
        tXVideoEditer.initWithPreview(tXPreviewParam);
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final void a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcf114f9769ec95d7467a2434cdefdac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcf114f9769ec95d7467a2434cdefdac");
        } else {
            this.b.startPlayFromTime(j, j2);
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0501e55313844ed95241bb1c1b7f4ec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0501e55313844ed95241bb1c1b7f4ec9");
        } else {
            this.b.pausePlay();
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1f985915da5a5f35318ea8a85016835", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1f985915da5a5f35318ea8a85016835");
        } else {
            this.b.resumePlay();
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d394c4f39d5430b3dbbdbff9b839eb1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d394c4f39d5430b3dbbdbff9b839eb1d");
        } else {
            this.b.stopPlay();
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final void a(final c.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "835a9554708c8feb27432344535ecbad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "835a9554708c8feb27432344535ecbad");
        } else {
            this.b.setVideoGenerateListener(new TXVideoEditer.TXVideoGenerateListener() { // from class: com.sankuai.meituan.mtlive.ugc.tx.MTTxUgcVideoEditor.4
                public static ChangeQuickRedirect a;

                @Override // com.tencent.ugc.TXVideoEditer.TXVideoGenerateListener
                public final void onGenerateProgress(float f) {
                    Object[] objArr2 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29442b70fe57f8809057ac584010b01f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29442b70fe57f8809057ac584010b01f");
                    } else {
                        bVar.a(f);
                    }
                }

                @Override // com.tencent.ugc.TXVideoEditer.TXVideoGenerateListener
                public final void onGenerateComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult) {
                    Object[] objArr2 = {tXGenerateResult};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a11ff10e16cdb410c1c6aa2d2a74c5c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a11ff10e16cdb410c1c6aa2d2a74c5c");
                    } else {
                        bVar.a(MTTxUgcVideoEditor.a(MTTxUgcVideoEditor.this, tXGenerateResult));
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final void b(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad0192665b7642e5528ad45e246ccb2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad0192665b7642e5528ad45e246ccb2a");
        } else {
            this.b.setCutFromTime(j, j2);
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2937159c55d60276234dbcb4ff386da8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2937159c55d60276234dbcb4ff386da8");
        } else {
            this.b.generateVideo(i, str);
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "821c45d4b51a9374539e335e07eaca9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "821c45d4b51a9374539e335e07eaca9a");
        } else {
            this.b.cancel();
        }
    }

    @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c
    public final void b(float f) {
        Object[] objArr = {Float.valueOf(0.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efaa54fce2820b28edce6065eb784acd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efaa54fce2820b28edce6065eb784acd");
        } else {
            this.b.setVideoVolume(0.0f);
        }
    }
}
