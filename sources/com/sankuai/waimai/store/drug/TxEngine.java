package com.sankuai.waimai.store.drug;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.meituan.android.loader.DynLoader;
import com.meituan.android.loader.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class TxEngine {
    public static final int LOAD_SO_FAILED = 202;
    private static final String TX_FFMPEG_SO_NAME = "txffmpeg";
    private static final String TX_RTMP_SO_NAME = "traeimp-rtmp";
    private static final String TX_SDK_SO_NAME = "liteavsdk";
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile boolean mIsEnvReady;
    private volatile boolean mIsFfmpegInitialed;
    private volatile boolean mIsRtmpInitialed;
    private volatile boolean mIsSdkInitialed;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(int i);
    }

    public boolean checkEngine(@Nullable final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ed75a7503f35bf64c03583503308cbf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ed75a7503f35bf64c03583503308cbf")).booleanValue();
        }
        if (isEngineReady()) {
            if (aVar != null) {
                aVar.a();
            }
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(TX_SDK_SO_NAME);
        arrayList.add(TX_RTMP_SO_NAME);
        arrayList.add(TX_FFMPEG_SO_NAME);
        DynLoader.toggleDownload(new com.meituan.android.loader.a() { // from class: com.sankuai.waimai.store.drug.TxEngine.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.loader.a
            public final void onDynDownloadSuccess() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c4fa851263487f3a0b336fb725897442", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c4fa851263487f3a0b336fb725897442");
                } else if (TxEngine.this.isEngineReady()) {
                    if (aVar != null) {
                        aVar.a();
                    }
                } else if (aVar != null) {
                    aVar.a(202);
                }
            }

            @Override // com.meituan.android.loader.a
            public final void onDynDownloadFailure() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1275fc8f893fba089f7ccc00d38c1758", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1275fc8f893fba089f7ccc00d38c1758");
                } else if (aVar != null) {
                    aVar.a(202);
                }
            }
        }, new c.a().a(arrayList).b, true);
        return false;
    }

    public boolean isEngineReady() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53fafbc5ca1b2cd9ad29149f6184d1e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53fafbc5ca1b2cd9ad29149f6184d1e0")).booleanValue();
        }
        if (this.mIsEnvReady) {
            return true;
        }
        if (!this.mIsFfmpegInitialed && DynLoader.available(TX_FFMPEG_SO_NAME, 1)) {
            this.mIsFfmpegInitialed = DynLoader.load(TX_FFMPEG_SO_NAME);
        }
        if (!this.mIsRtmpInitialed && DynLoader.available(TX_RTMP_SO_NAME, 1)) {
            this.mIsRtmpInitialed = DynLoader.load(TX_RTMP_SO_NAME);
        }
        if (!this.mIsSdkInitialed && DynLoader.available(TX_SDK_SO_NAME, 1)) {
            this.mIsSdkInitialed = DynLoader.load(TX_SDK_SO_NAME);
        }
        if (this.mIsSdkInitialed && this.mIsRtmpInitialed && this.mIsFfmpegInitialed) {
            z = true;
        }
        this.mIsEnvReady = z;
        return this.mIsEnvReady;
    }
}
