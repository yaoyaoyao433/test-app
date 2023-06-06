package com.meituan.mmp.lib.api.canvas;

import android.support.annotation.NonNull;
import android.util.Base64;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.page.view.NativeViewApi;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CanvasApi extends NativeViewApi<h> {
    public static ChangeQuickRedirect h;

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    @NonNull
    public final String f() {
        return "canvasId";
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final /* synthetic */ h b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b63f16c3b4f59dee539cec8cdfcc4689", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b63f16c3b4f59dee539cec8cdfcc4689") : new h(getContext(), getAppConfig());
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9afb641fa9933ed731d45e0a1cbd9a2", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9afb641fa9933ed731d45e0a1cbd9a2") : new String[]{"drawCanvas", "insertCanvas", "canvasPutImageData", "canvasGetImageData", "canvasToTempFilePathSync", "canvasToTempFilePath", "updateCanvas", "removeCanvas", "measureText", "measureTextSync"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "941589c39d558f6bc0243b537a465a72", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "941589c39d558f6bc0243b537a465a72") : new String[]{"drawCanvas", "insertCanvas", "canvasPutImageData", "canvasGetImageData", "canvasToTempFilePathSync", "canvasToTempFilePath", "updateCanvas", "removeCanvas", "measureText", "measureTextSync", "canvas"};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0609 A[Catch: Exception -> 0x0674, TryCatch #8 {Exception -> 0x0674, blocks: (B:217:0x0556, B:219:0x058b, B:220:0x058d, B:222:0x0594, B:223:0x0596, B:231:0x05b2, B:233:0x05b8, B:240:0x05c8, B:254:0x0609, B:257:0x0630, B:256:0x061e, B:246:0x05e1, B:258:0x0667), top: B:331:0x0556 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x061c  */
    @Override // com.meituan.mmp.lib.api.AbsApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.String r34, org.json.JSONObject r35, com.meituan.mmp.main.IApiCallback r36) {
        /*
            Method dump skipped, instructions count: 2116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.canvas.CanvasApi.invoke(java.lang.String, org.json.JSONObject, com.meituan.mmp.main.IApiCallback):void");
    }

    private static JSONObject a(int[] iArr, double d, double d2) {
        Object[] objArr = {iArr, Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7bf4fd85b8f10a76166bd1885666e3b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7bf4fd85b8f10a76166bd1885666e3b0");
        }
        byte[] bArr = new byte[iArr.length * 4];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = i * 4;
            bArr[i2] = (byte) ((iArr[i] >> 16) & 255);
            bArr[i2 + 1] = (byte) ((iArr[i] >> 8) & 255);
            bArr[i2 + 2] = (byte) (iArr[i] & 255);
            bArr[i2 + 3] = (byte) ((iArr[i] >> 24) & 255);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("data", Base64.encodeToString(bArr, 2));
            jSONObject.put("width", d);
            jSONObject.put("height", d2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private static int[] a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30b1e49e853438a3620e1c660d9159bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30b1e49e853438a3620e1c660d9159bc");
        }
        int[] iArr = new int[bArr.length / 4];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = i * 4;
            iArr[i] = ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8) | (bArr[i2 + 2] & 255);
        }
        return iArr;
    }

    private void b(JSONObject jSONObject, final IApiCallback iApiCallback) {
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee1c25c547c4458961edd341b2593b49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee1c25c547c4458961edd341b2593b49");
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(DMKeys.KEY_ACTIONS);
        CoverViewWrapper c = c(jSONObject, iApiCallback);
        if (c == null) {
            return;
        }
        h hVar = (h) c.b(h.class);
        if (hVar == null) {
            iApiCallback.onFail(a("view not found!", new Object[0]));
            return;
        }
        if (jSONObject.optBoolean("reserve")) {
            hVar.b(optJSONArray, new d() { // from class: com.meituan.mmp.lib.api.canvas.CanvasApi.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.api.canvas.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0361608a23d4e316322bbfc78cab1081", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0361608a23d4e316322bbfc78cab1081");
                    } else {
                        iApiCallback.onSuccess(new JSONObject());
                    }
                }
            });
        } else {
            hVar.a(optJSONArray, new d() { // from class: com.meituan.mmp.lib.api.canvas.CanvasApi.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.api.canvas.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "916c4413a102ac40acf2249a027ea192", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "916c4413a102ac40acf2249a027ea192");
                    } else {
                        iApiCallback.onSuccess(new JSONObject());
                    }
                }
            });
        }
        hVar.postInvalidate();
        iApiCallback.onSuccess(null);
    }

    private static float a(JSONObject jSONObject, String str, float f) {
        Object[] objArr = {jSONObject, str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15a8c90abdc5ea2ad84079569c80cff6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15a8c90abdc5ea2ad84079569c80cff6")).floatValue();
        }
        if (jSONObject == null || !jSONObject.has(str)) {
            return f;
        }
        try {
            return (float) (jSONObject.optDouble(str) * p.b().density);
        } catch (Exception unused) {
            return f;
        }
    }

    @Override // com.meituan.mmp.lib.api.ActivityApi
    public final JSONObject a(String str) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b54e627aef26da261b4ab89e3c3e5420", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b54e627aef26da261b4ab89e3c3e5420");
        }
        if ("measureTextSync".equals(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", 0);
                jSONObject.put("height", 0);
                return jSONObject;
            } catch (JSONException unused) {
                return super.a(str);
            }
        }
        return super.a(str);
    }
}
