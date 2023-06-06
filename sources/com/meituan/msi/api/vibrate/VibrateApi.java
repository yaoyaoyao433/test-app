package com.meituan.msi.api.vibrate;

import android.content.Context;
import android.os.Vibrator;
import com.meituan.msi.a;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VibrateApi implements IMsiApi {
    public static ChangeQuickRedirect a;
    public final Context b;

    public VibrateApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3116cdc14bbec8699dc7a2ceaae49f16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3116cdc14bbec8699dc7a2ceaae49f16");
        } else {
            this.b = a.f();
        }
    }

    @MsiApiMethod(name = "vibrateShort")
    public void vibrateShort(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b2de3fc40b8cd30c7ace332f3e7c1ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b2de3fc40b8cd30c7ace332f3e7c1ec");
            return;
        }
        Vibrator vibrator = (Vibrator) this.b.getSystemService("vibrator");
        if (vibrator != null && vibrator.hasVibrator()) {
            vibrator.vibrate(15L);
            msiContext.onSuccess("");
            return;
        }
        msiContext.onError("vibrator fail");
    }

    @MsiApiMethod(name = "vibrateLong")
    public void vibrateLong(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4df04b91eeefa9d0d39173501da07aeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4df04b91eeefa9d0d39173501da07aeb");
            return;
        }
        Vibrator vibrator = (Vibrator) this.b.getSystemService("vibrator");
        if (vibrator != null && vibrator.hasVibrator()) {
            vibrator.vibrate(400L);
            msiContext.onSuccess("");
            return;
        }
        msiContext.onError("vibrator fail");
    }
}
