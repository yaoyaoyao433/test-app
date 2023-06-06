package com.speech.vadsdk.custom;

import android.content.Context;
import android.content.res.AssetManager;
import android.support.annotation.Keep;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public final class CustomModelHelper {
    private static final String VAD_MODE_NAME = "vad_zip.conf";
    private static final String WAKEUP_MODE_NAME = "zip_wakeup.bin";

    public static byte[] getVADModelData(Context context) {
        return readAssets(context.getAssets(), VAD_MODE_NAME);
    }

    public static byte[] getWakeUpModelData(Context context) {
        return readAssets(context.getAssets(), WAKEUP_MODE_NAME);
    }

    private static byte[] readAssets(AssetManager assetManager, String str) {
        byte[] bArr;
        InputStream open;
        try {
            open = assetManager.open(str, 0);
            bArr = new byte[open.available()];
        } catch (IOException e) {
            e = e;
            bArr = null;
        }
        try {
            open.read(bArr);
            open.close();
        } catch (IOException e2) {
            e = e2;
            e.printStackTrace();
            return bArr;
        }
        return bArr;
    }
}
