package com.meituan.msi.api.component.canvas;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.titans.widget.DynamicTitleParser;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.component.canvas.param.DrawParam;
import com.meituan.msi.api.component.canvas.param.GetImageDataParam;
import com.meituan.msi.api.component.canvas.param.GetImageDataResponse;
import com.meituan.msi.api.component.canvas.param.MeasureTextApiParam;
import com.meituan.msi.api.component.canvas.param.MeasureTextApiResponse;
import com.meituan.msi.api.component.canvas.param.MsiCanvasParam;
import com.meituan.msi.api.component.canvas.param.PutImageDataParam;
import com.meituan.msi.bean.EventType;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.view.MsiNativeViewApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MsiCanvasViewApi extends MsiNativeViewApi<e, JsonObject> {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "Canvas.onTouchStart")
    public void onConfirm(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "Canvas.onLongPress")
    public void onLongPress(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "Canvas.onTouchCancel")
    public void onTouchCancel(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "Canvas.onTouchEnd")
    public void onTouchEnd(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "Canvas.onTouchMove")
    public void onTouchMove(MsiContext msiContext) {
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ e a(MsiContext msiContext, JsonObject jsonObject, JsonObject jsonObject2) {
        JsonObject jsonObject3 = jsonObject2;
        Object[] objArr = {msiContext, jsonObject, jsonObject3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "497cf53821032d128c87b69e9e7ddf7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "497cf53821032d128c87b69e9e7ddf7b");
        }
        e eVar = new e(msiContext.getActivity());
        eVar.a(msiContext.getFileProvider());
        MsiCanvasParam msiCanvasParam = eVar.getMsiCanvasParam();
        msiCanvasParam.updateProperty(jsonObject3);
        eVar.a(msiCanvasParam);
        if (msiCanvasParam.gesture) {
            eVar.a(msiContext, a(jsonObject3), jsonObject);
        }
        return eVar;
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ boolean a(MsiContext msiContext, e eVar, int i, int i2, JsonObject jsonObject, JsonObject jsonObject2) {
        e eVar2 = eVar;
        JsonObject jsonObject3 = jsonObject2;
        Object[] objArr = {msiContext, eVar2, Integer.valueOf(i), Integer.valueOf(i2), jsonObject, jsonObject3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "200f433ce402b8ba085e8406555c51a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "200f433ce402b8ba085e8406555c51a9")).booleanValue();
        }
        if (eVar2 != null) {
            MsiCanvasParam msiCanvasParam = eVar2.getMsiCanvasParam();
            msiCanvasParam.updateProperty(jsonObject3);
            eVar2.a(msiCanvasParam);
            return true;
        }
        return false;
    }

    @MsiApiMethod(name = "canvas", onUiThread = true, request = JsonObject.class)
    public void handleView(JsonObject jsonObject, MsiContext msiContext) {
        Object[] objArr = {jsonObject, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cd63e8e21d9e86a9f7dfafe05326bed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cd63e8e21d9e86a9f7dfafe05326bed");
        } else {
            a(msiContext, (MsiContext) jsonObject);
        }
    }

    private String a(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c66bd33ab45bcc96d3fc9fa64eb8a55c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c66bd33ab45bcc96d3fc9fa64eb8a55c");
        }
        if (jsonObject.has("canvasId")) {
            try {
                return jsonObject.get("canvasId").getAsString();
            } catch (Exception e) {
                e.printStackTrace();
                com.meituan.msi.log.a.a(e.getMessage());
                return "";
            }
        }
        return "";
    }

    @MsiApiMethod(name = "canvasContext.draw", onUiThread = true, request = DrawParam.class)
    public void drawCoverView(DrawParam drawParam, final MsiContext msiContext) {
        Object[] objArr = {drawParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "032ef5fcb2c31b6150b2d0803421d42b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "032ef5fcb2c31b6150b2d0803421d42b");
            return;
        }
        e eVar = (e) a(msiContext, f(msiContext.getUIArgs()), g(msiContext.getUIArgs()));
        if (eVar == null) {
            msiContext.onError("view not found!");
            return;
        }
        final JsonArray jsonArray = drawParam.actions;
        if (drawParam.reserve) {
            final d dVar = new d() { // from class: com.meituan.msi.api.component.canvas.MsiCanvasViewApi.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.component.canvas.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ad9df3204aa9190da180c6abb374d0a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ad9df3204aa9190da180c6abb374d0a");
                    } else {
                        msiContext.onSuccess(new JSONObject());
                    }
                }
            };
            Object[] objArr2 = {jsonArray, dVar};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "a87126f14cd4805ab67cccddafac48cc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "a87126f14cd4805ab67cccddafac48cc");
            } else if (eVar.c == null) {
                com.meituan.msi.log.a.a("drawer has gone");
            } else {
                final a aVar = eVar.c;
                Object[] objArr3 = {jsonArray, dVar};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "01fce708f4c04b09bca8867f96d9d5a3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "01fce708f4c04b09bca8867f96d9d5a3");
                } else if (jsonArray != null && jsonArray.size() != 0) {
                    aVar.f.a(new Runnable() { // from class: com.meituan.msi.api.component.canvas.a.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "99b784c17ff315f7307a251ab060dae0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "99b784c17ff315f7307a251ab060dae0");
                                return;
                            }
                            if (aVar.c == null) {
                                aVar.c = jsonArray;
                            } else {
                                for (int i = 0; i < jsonArray.size(); i++) {
                                    aVar.c.add(jsonArray.get(i));
                                }
                            }
                            aVar.b = true;
                            if (dVar != null) {
                                dVar.a();
                            }
                        }
                    });
                }
            }
        } else {
            final d dVar2 = new d() { // from class: com.meituan.msi.api.component.canvas.MsiCanvasViewApi.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.component.canvas.d
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bfa42d1eb98e2b91d6f989dd4c21b4ca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bfa42d1eb98e2b91d6f989dd4c21b4ca");
                    } else {
                        msiContext.onSuccess(new JSONObject());
                    }
                }
            };
            Object[] objArr4 = {jsonArray, dVar2};
            ChangeQuickRedirect changeQuickRedirect4 = e.a;
            if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "22ba30874c802c831751a7bcadb9197f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "22ba30874c802c831751a7bcadb9197f");
            } else if (eVar.c == null) {
                com.meituan.msi.log.a.a("drawer has gone");
            } else {
                final a aVar2 = eVar.c;
                Object[] objArr5 = {jsonArray, dVar2};
                ChangeQuickRedirect changeQuickRedirect5 = a.a;
                if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "a25e00f925cbd145964123cbd75abc90", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "a25e00f925cbd145964123cbd75abc90");
                } else {
                    aVar2.f.a(new Runnable() { // from class: com.meituan.msi.api.component.canvas.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "c24d80647ae3cab44b719b98c8c0e15e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "c24d80647ae3cab44b719b98c8c0e15e");
                                return;
                            }
                            aVar2.c = jsonArray;
                            aVar2.b = true;
                            dVar2.a();
                        }
                    });
                }
            }
        }
        eVar.postInvalidate();
        msiContext.onSuccess(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x011a, code lost:
        if (r2 != 0) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    @com.meituan.msi.annotations.MsiApiMethod(name = "canvasToTempFilePath", onUiThread = true, request = com.meituan.msi.api.component.canvas.param.ToTempPathParam.class)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void canvasToTempFile(com.meituan.msi.api.component.canvas.param.ToTempPathParam r26, com.meituan.msi.bean.MsiContext r27) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.component.canvas.MsiCanvasViewApi.canvasToTempFile(com.meituan.msi.api.component.canvas.param.ToTempPathParam, com.meituan.msi.bean.MsiContext):void");
    }

    @MsiApiMethod(name = "canvasContext.measureText", onUiThread = true, request = MeasureTextApiParam.class, response = MeasureTextApiResponse.class)
    public MeasureTextApiResponse measureText(MeasureTextApiParam measureTextApiParam, MsiContext msiContext) {
        char c;
        Object[] objArr = {measureTextApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f4b044bbcf8885a4e74d3eecd74f148", RobustBitConfig.DEFAULT_VALUE)) {
            return (MeasureTextApiResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f4b044bbcf8885a4e74d3eecd74f148");
        }
        String str = measureTextApiParam.text;
        if (TextUtils.isEmpty(str)) {
            msiContext.onError("");
            return new MeasureTextApiResponse();
        }
        double d = measureTextApiParam.fontSize;
        String str2 = measureTextApiParam.fontFamily;
        String str3 = measureTextApiParam.fontWeight;
        String str4 = measureTextApiParam.fontStyle;
        com.meituan.msi.api.component.canvas.view.b bVar = new com.meituan.msi.api.component.canvas.view.b();
        bVar.setTextSize(com.meituan.msi.util.f.a((int) d));
        bVar.a(str2);
        int hashCode = str3.hashCode();
        char c2 = 65535;
        if (hashCode != -1039745817) {
            if (hashCode == 3029637 && str3.equals(DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD)) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str3.equals("normal")) {
                c = 1;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                bVar.setFakeBoldText(true);
                break;
            case 1:
                bVar.setFakeBoldText(false);
                break;
        }
        int hashCode2 = str4.hashCode();
        if (hashCode2 != -1657669071) {
            if (hashCode2 != -1178781136) {
                if (hashCode2 == -1039745817 && str4.equals("normal")) {
                    c2 = 2;
                }
            } else if (str4.equals(DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC)) {
                c2 = 1;
            }
        } else if (str4.equals("oblique")) {
            c2 = 0;
        }
        switch (c2) {
            case 0:
            case 1:
                bVar.a(2);
                break;
            case 2:
                bVar.a(0);
                break;
        }
        float measureText = bVar.measureText(str);
        Paint.FontMetrics fontMetrics = bVar.getFontMetrics();
        float f = fontMetrics.bottom - fontMetrics.top;
        MeasureTextApiResponse measureTextApiResponse = new MeasureTextApiResponse();
        measureTextApiResponse.width = com.meituan.msi.util.f.c(measureText);
        measureTextApiResponse.height = com.meituan.msi.util.f.c(f);
        msiContext.onSuccess(measureTextApiResponse);
        return measureTextApiResponse;
    }

    @MsiApiMethod(name = "canvasPutImageData", onUiThread = true, request = PutImageDataParam.class)
    public void canvasPutImageData(PutImageDataParam putImageDataParam, MsiContext msiContext) {
        int[] iArr;
        Object[] objArr = {putImageDataParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0424cc696e59c45d0e47fde16aa17c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0424cc696e59c45d0e47fde16aa17c1");
        } else if (((e) a(msiContext, f(msiContext.getUIArgs()), g(msiContext.getUIArgs()))) == null) {
            msiContext.onError("view not found!");
        } else {
            int i = putImageDataParam.x;
            int i2 = putImageDataParam.y;
            int i3 = putImageDataParam.width;
            int i4 = putImageDataParam.height;
            if (i3 == 0 || i4 == 0) {
                return;
            }
            if (i3 < 0) {
                i += i3;
                i3 = -i3;
            }
            if (i4 < 0) {
                i2 += i4;
                i4 = -i4;
            }
            byte[] decode = Base64.decode(putImageDataParam.data.getBytes(), 2);
            Object[] objArr2 = {decode};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3381d269eb06a3db703ce98f20cd176c", RobustBitConfig.DEFAULT_VALUE)) {
                iArr = (int[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3381d269eb06a3db703ce98f20cd176c");
            } else {
                int[] iArr2 = new int[decode.length / 4];
                for (int i5 = 0; i5 < iArr2.length; i5++) {
                    int i6 = i5 * 4;
                    iArr2[i5] = ((decode[i6 + 3] & 255) << 24) | ((decode[i6] & 255) << 16) | ((decode[i6 + 1] & 255) << 8) | (decode[i6 + 2] & 255);
                }
                iArr = iArr2;
            }
            JsonArray jsonArray = new JsonArray();
            jsonArray.add(Integer.valueOf(i));
            jsonArray.add(Integer.valueOf(i2));
            jsonArray.add(Integer.valueOf(i3));
            jsonArray.add(Integer.valueOf(i4));
            try {
                jsonArray.add(new GsonBuilder().create().toJson(Bitmap.createBitmap(iArr, i3, i4, Bitmap.Config.ARGB_8888)));
                DrawParam drawParam = new DrawParam();
                JsonArray jsonArray2 = new JsonArray();
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("method", "__setPixels");
                jsonObject.add("data", jsonArray);
                jsonArray2.add(jsonObject);
                drawParam.actions = jsonArray2;
                drawCoverView(drawParam, msiContext);
            } catch (Exception e) {
                com.meituan.msi.log.a.a(e.getMessage());
                msiContext.onError("");
            }
        }
    }

    @MsiApiMethod(name = "canvasGetImageData", onUiThread = true, request = GetImageDataParam.class, response = GetImageDataResponse.class)
    public void canvasGetImageData(GetImageDataParam getImageDataParam, MsiContext msiContext) {
        Bitmap createBitmap;
        Bitmap createScaledBitmap;
        GetImageDataResponse getImageDataResponse;
        Object[] objArr = {getImageDataParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35f48d6aa904983a25db52375c9e613c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35f48d6aa904983a25db52375c9e613c");
            return;
        }
        e eVar = (e) a(msiContext, f(msiContext.getUIArgs()), g(msiContext.getUIArgs()));
        if (eVar == null) {
            msiContext.onError("view not found!");
            return;
        }
        int measuredWidth = eVar.getMeasuredWidth();
        int measuredHeight = eVar.getMeasuredHeight();
        Bitmap createBitmap2 = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        float d = com.meituan.msi.util.f.d(getImageDataParam.x);
        float d2 = com.meituan.msi.util.f.d(getImageDataParam.y);
        float f = measuredWidth;
        float a2 = a(getImageDataParam.width, f);
        float a3 = a(getImageDataParam.height, f);
        if (d + a2 > f) {
            a2 = f - d;
        }
        float f2 = measuredHeight;
        if (d2 + a3 > f2) {
            a3 = f2 - d2;
        }
        float a4 = a(getImageDataParam.destWidth, a2);
        float a5 = a(getImageDataParam.destHeight, a3);
        if (d < 0.0f || d2 < 0.0f || a2 <= 0.0f || a3 <= 0.0f || d + a2 > f || d2 + a3 > f2 || a4 <= 0.0f || a5 <= 0.0f) {
            msiContext.onError("fail:illegal arguments");
            return;
        }
        eVar.draw(new com.meituan.msi.api.component.canvas.view.a(createBitmap2));
        float f3 = com.meituan.msi.util.f.a(com.meituan.msi.a.f()).density;
        if (a2 == f && a3 == f2) {
            createBitmap = createBitmap2;
        } else {
            createBitmap = Bitmap.createBitmap(createBitmap2, (int) d, (int) d2, (int) a2, (int) a3, (Matrix) null, false);
            createBitmap2.recycle();
        }
        if (a2 != a4 || a3 != a5) {
            createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, Math.round(a4 / f3), Math.round(a5 / f3), false);
            createBitmap.recycle();
        } else if (f3 != 1.0f) {
            createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, Math.round(a2 / f3), Math.round(a3 / f3), false);
            createBitmap.recycle();
        } else {
            createScaledBitmap = createBitmap;
        }
        int[] iArr = new int[createScaledBitmap.getWidth() * createScaledBitmap.getHeight()];
        createScaledBitmap.getPixels(iArr, 0, createScaledBitmap.getWidth(), 0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
        double width = createScaledBitmap.getWidth();
        double height = createScaledBitmap.getHeight();
        Object[] objArr2 = {iArr, Double.valueOf(width), Double.valueOf(height)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "073f0b86172caa502fd86773fbcab22e", RobustBitConfig.DEFAULT_VALUE)) {
            getImageDataResponse = (GetImageDataResponse) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "073f0b86172caa502fd86773fbcab22e");
        } else {
            byte[] bArr = new byte[iArr.length * 4];
            for (int i = 0; i < iArr.length; i++) {
                int i2 = i * 4;
                bArr[i2] = (byte) ((iArr[i] >> 16) & 255);
                bArr[i2 + 1] = (byte) ((iArr[i] >> 8) & 255);
                bArr[i2 + 2] = (byte) (iArr[i] & 255);
                bArr[i2 + 3] = (byte) ((iArr[i] >> 24) & 255);
            }
            getImageDataResponse = new GetImageDataResponse();
            getImageDataResponse.data = Base64.encodeToString(bArr, 2);
            getImageDataResponse.width = width;
            getImageDataResponse.height = height;
        }
        msiContext.onSuccess(getImageDataResponse);
        createScaledBitmap.recycle();
    }

    private static float a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8587428999432f36be28af1b8f5aa9b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8587428999432f36be28af1b8f5aa9b8")).floatValue();
        }
        if (f > 0.0f) {
            try {
                return f * com.meituan.msi.util.f.a(com.meituan.msi.a.f()).density;
            } catch (Exception unused) {
                return f2;
            }
        }
        return f2;
    }
}
