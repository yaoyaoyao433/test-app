package com.meituan.android.indentifycard;

import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ExtractBankCard {
    private static final boolean DEBUG = false;
    private static final String TAG = "ExtractBankCard";
    public static ChangeQuickRedirect changeQuickRedirect;

    public native int extractBankCard(byte[] bArr, int[] iArr, int[] iArr2);

    public native int getLegalImage(int i, int i2, int[] iArr, int i3);

    public native int isClear(byte[] bArr, int[] iArr);

    public int isClearSafety(byte[] bArr, int[] iArr) {
        Object[] objArr = {bArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4724b1220ff1c008dc0739977103239f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4724b1220ff1c008dc0739977103239f")).intValue();
        }
        try {
            System.loadLibrary("extractCard");
            return isClear(bArr, iArr);
        } catch (Throwable th) {
            a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "ExtractBankCard_isClearSafety").a("message", th.getMessage()).b);
            return -999;
        }
    }

    public int extractBankCardSafety(byte[] bArr, int[] iArr, int[] iArr2) {
        Object[] objArr = {bArr, iArr, iArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ce61f483739d9023a23af351b95b134", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ce61f483739d9023a23af351b95b134")).intValue();
        }
        try {
            System.loadLibrary("extractCard");
            return extractBankCard(bArr, iArr, iArr2);
        } catch (Throwable th) {
            a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "ExtractBankCard_extractBankCardSafety").a("message", th.getMessage()).b);
            return -1;
        }
    }

    public int getLegalImageSafety(int i, int i2, int[] iArr, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e2aff45a427a8d7e3ea528e09b4aec0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e2aff45a427a8d7e3ea528e09b4aec0")).intValue();
        }
        try {
            System.loadLibrary("extractCard");
            return getLegalImage(i, i2, iArr, i3);
        } catch (Throwable th) {
            a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "ExtractBankCard_getLegalImageSafety").a("message", th.getMessage()).b);
            return 0;
        }
    }
}
