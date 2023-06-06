package com.meituan.android.indentifycard;

import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CardNoOcr {
    private static final boolean DEBUG = false;
    private static final String TAG = "CardNoOcr";
    public static ChangeQuickRedirect changeQuickRedirect;

    public native int cardOcr(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4);

    public native boolean downSize(int i, int i2, int[] iArr, int i3, int i4, int[] iArr2);

    public native boolean isFocus(int i, int i2, int[] iArr, float f);

    public native boolean ocrInit();

    public native boolean ocrUninit();

    public boolean ocrInitSafety() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc57528345fb809bc3dd10724d208036", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc57528345fb809bc3dd10724d208036")).booleanValue();
        }
        try {
            System.loadLibrary("CardOcr");
            return ocrInit();
        } catch (Throwable th) {
            a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CardNoOcr_ocrInitSafety").a("message", th.getMessage()).b);
            return false;
        }
    }

    public int cardOcrSafety(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), iArr, iArr2, iArr3, iArr4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d967edca282825582815216bd1077f7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d967edca282825582815216bd1077f7")).intValue();
        }
        try {
            return cardOcr(i, i2, iArr, iArr2, iArr3, iArr4);
        } catch (Throwable th) {
            a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CardNoOcr_cardOcrSafety").a("message", th.getMessage()).b);
            return 0;
        }
    }

    public boolean ocrUninitSafety() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fdb648f629019447212995197579d5d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fdb648f629019447212995197579d5d")).booleanValue();
        }
        try {
            return ocrUninit();
        } catch (Throwable th) {
            a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CardNoOcr_ocrUninitSafety").a("message", th.getMessage()).b);
            return false;
        }
    }
}
