package com.sankuai.eh.plugins.detector;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.a;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.e;
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.eh.component.service.utils.thread.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    public int b;
    public long c;
    public Bitmap d;
    public InterfaceC0560a e;
    private boolean f;
    private int g;
    private long h;
    private String i;
    private JsonElement j;
    private JsonElement k;
    private Map<String, Object> l;
    private JSONObject m;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.plugins.detector.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0560a {
        void a(float f, boolean z, long j);
    }

    public a(JsonElement jsonElement, Map<String, Object> map) {
        Object[] objArr = {jsonElement, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "039000e36932d0beb5a59dec163ba5d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "039000e36932d0beb5a59dec163ba5d9");
            return;
        }
        this.f = false;
        this.b = 2;
        this.j = jsonElement;
        this.l = map;
        this.i = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "catKey"), "unknown");
        this.h = System.currentTimeMillis();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42444b961a567b890c5df894c20bf031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42444b961a567b890c5df894c20bf031");
            return;
        }
        this.g = 0;
        this.k = com.sankuai.eh.component.service.utils.b.c(this.j, "data");
        if (this.k != null) {
            this.g = 1;
        }
    }

    public final void a(int i) {
        int i2;
        CountDownLatch countDownLatch;
        com.sankuai.eh.component.service.utils.thread.b bVar;
        a.InterfaceC0552a cVar;
        Object[] objArr = {11};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a617ac2d17c89243381ba901e37b4c4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a617ac2d17c89243381ba901e37b4c4c");
        } else if (f.a(this.k)) {
            long j = this.c;
            Bitmap bitmap = this.d;
            JsonArray b = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(this.k, "region"));
            ArrayList arrayList = new ArrayList();
            Object obj = null;
            char c = 3;
            if (b.size() <= 0) {
                com.sankuai.eh.component.service.utils.thread.b a2 = com.sankuai.eh.component.service.utils.thread.b.a();
                Object[] objArr2 = {this, bitmap, new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                a2.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fb87efec44f05f1a5772d0407e9dd238", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fb87efec44f05f1a5772d0407e9dd238") : new b(this, bitmap, j));
                return;
            }
            CountDownLatch countDownLatch2 = new CountDownLatch(b.size());
            int i3 = 0;
            while (i3 < b.size()) {
                JsonArray b2 = com.sankuai.eh.component.service.utils.b.b(b.get(i3));
                com.sankuai.eh.component.service.utils.thread.b a3 = com.sankuai.eh.component.service.utils.thread.b.a();
                Object[] objArr3 = new Object[5];
                objArr3[0] = this;
                objArr3[1] = bitmap;
                objArr3[2] = b2;
                objArr3[c] = arrayList;
                objArr3[4] = countDownLatch2;
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a2e2929fbeeb3c62dab5fc3509f6b5c8", RobustBitConfig.DEFAULT_VALUE)) {
                    cVar = (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr3, obj, changeQuickRedirect3, true, "a2e2929fbeeb3c62dab5fc3509f6b5c8");
                    bVar = a3;
                    i2 = i3;
                    countDownLatch = countDownLatch2;
                } else {
                    i2 = i3;
                    countDownLatch = countDownLatch2;
                    bVar = a3;
                    cVar = new c(this, bitmap, b2, arrayList, countDownLatch);
                }
                bVar.c(cVar);
                i3 = i2 + 1;
                countDownLatch2 = countDownLatch;
                c = 3;
                obj = null;
            }
            CountDownLatch countDownLatch3 = countDownLatch2;
            com.sankuai.eh.component.service.utils.thread.b a4 = com.sankuai.eh.component.service.utils.thread.b.a();
            Object[] objArr4 = {this, countDownLatch3, bitmap, arrayList, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect4 = d.a;
            a4.c(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "690edaa9d0f0b675bec87130f14f48d8", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "690edaa9d0f0b675bec87130f14f48d8") : new d(this, countDownLatch3, bitmap, arrayList, j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r12v5 */
    public static /* synthetic */ void a(a aVar, Bitmap bitmap, long j) {
        Object[] objArr = {aVar, bitmap, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aac7fa234c766f6d0e084cb7894bc151", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aac7fa234c766f6d0e084cb7894bc151");
            return;
        }
        Object[] objArr2 = {bitmap, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a862ff9077ac1cc8b5940062d7748327", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a862ff9077ac1cc8b5940062d7748327");
        } else if (bitmap == null) {
            aVar.a(true, 0L);
        } else {
            float[][] a2 = com.sankuai.eh.plugins.detector.imgs.a.a(bitmap, aVar.a());
            if (a2 != null && a2.length > 0) {
                com.sankuai.eh.component.service.tools.d.a("pixels", "color: " + a2[0][0] + " ratio:" + a2[0][1]);
                float f = a2[0][1];
                Object[] objArr3 = {bitmap, Float.valueOf(f), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "87fffca8e2c3e0bec0be590514917be5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "87fffca8e2c3e0bec0be590514917be5");
                } else {
                    ?? r12 = f > com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(aVar.k, "percent"), 0.998f) ? 1 : 0;
                    if (aVar.e != null) {
                        aVar.e.a(f, r12, j);
                    }
                    if (r12 != 0) {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "bd31c68f257119e81b243e839d608b85", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "bd31c68f257119e81b243e839d608b85");
                        } else {
                            long currentTimeMillis = System.currentTimeMillis() - aVar.h;
                            int a3 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(aVar.k, "catDelay"), 200);
                            boolean booleanValue = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(aVar.k, "catOnload"), false).booleanValue();
                            if (currentTimeMillis > a3 && !TextUtils.isEmpty(aVar.i) && (!booleanValue || ((aVar.l.get("load") instanceof Boolean) && ((Boolean) aVar.l.get("load")).booleanValue()))) {
                                aVar.c();
                            }
                        }
                    }
                    Object[] objArr5 = {bitmap, Byte.valueOf((byte) r12), Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "9383a56cb7e4c4567889c1c3d344ff9c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "9383a56cb7e4c4567889c1c3d344ff9c");
                    } else if (com.sankuai.eh.component.service.utils.b.c(aVar.k, "upload") != null) {
                        Map<String, JsonElement> c = com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.c(aVar.k, "upload"));
                        byte[] a4 = com.sankuai.eh.plugins.detector.imgs.c.a(bitmap, com.sankuai.eh.component.service.utils.b.a(c.get(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE), 3));
                        int a5 = com.sankuai.eh.component.service.utils.b.a(c.get("ab"), -1);
                        if (a4 != null && a.C0548a.a.c() <= a5) {
                            int a6 = com.sankuai.eh.component.service.utils.b.a(c.get(JsBridgeResult.ARG_KEY_LOCATION_MODE), 0);
                            String b = com.sankuai.eh.component.service.utils.b.b(c.get("bucket"), "ehimgdefault");
                            String str = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(aVar.k, "catKey"), "default") + CommonConstant.Symbol.MINUS + System.currentTimeMillis() + CommonConstant.Symbol.MINUS + f + ".jpg";
                            if ((a6 == 0 && r12 != 0) || a6 == 1) {
                                com.sankuai.eh.plugins.detector.imgs.c.a(a4, str, b);
                            }
                        }
                    }
                }
            } else {
                aVar.a(false, j);
            }
            aVar.a(bitmap);
        }
    }

    public static /* synthetic */ void a(a aVar, Bitmap bitmap, JsonArray jsonArray, List list, CountDownLatch countDownLatch) {
        Object[] objArr = {aVar, bitmap, jsonArray, list, countDownLatch};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9bf5db4d45df70ef6d44d219bc3d7371", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9bf5db4d45df70ef6d44d219bc3d7371");
            return;
        }
        Object[] objArr2 = {bitmap, jsonArray, list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "092645ca5713042562b87f6567857ae2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "092645ca5713042562b87f6567857ae2");
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, com.sankuai.eh.component.service.utils.b.a(jsonArray.get(0), 0) / aVar.b, com.sankuai.eh.component.service.utils.b.a(jsonArray.get(1), 0) / aVar.b, com.sankuai.eh.component.service.utils.b.a(jsonArray.get(2), 0) / aVar.b, com.sankuai.eh.component.service.utils.b.a(jsonArray.get(3), 0) / aVar.b);
            float[][] a2 = com.sankuai.eh.plugins.detector.imgs.a.a(createBitmap, aVar.a());
            if (a2 != null && a2.length > 0) {
                list.add(Float.valueOf(a2[0][1]));
            } else {
                list.add(Float.valueOf(100.0f));
            }
            aVar.a(createBitmap);
        }
        countDownLatch.countDown();
    }

    public static /* synthetic */ void a(a aVar, CountDownLatch countDownLatch, Bitmap bitmap, List list, long j) {
        Object[] objArr = {aVar, countDownLatch, bitmap, list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e937523fd68b2ff2bdc8aae8e5c3080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e937523fd68b2ff2bdc8aae8e5c3080");
            return;
        }
        try {
            countDownLatch.await();
            aVar.a(bitmap, list, j);
        } catch (InterruptedException unused) {
        }
    }

    private void a(Bitmap bitmap, List<Float> list, long j) {
        Object[] objArr = {bitmap, list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feb08625f2ec8d979aa0a1b9cf59a908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feb08625f2ec8d979aa0a1b9cf59a908");
            return;
        }
        float a2 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(this.k, "percent"), 0.998f);
        Iterator<Float> it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (it.next().floatValue() < a2) {
                z = false;
            }
        }
        a(z, j);
        a(bitmap);
    }

    private void a(boolean z, long j) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "350034a43d4d954804d590d2e6dc95a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "350034a43d4d954804d590d2e6dc95a7");
        } else if (this.f) {
            com.sankuai.eh.component.service.tools.d.a("pixels", "close - type: " + this.g + " result: " + j);
        }
    }

    private int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3036cd3bbf1540f4fc6d96c8299e6c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3036cd3bbf1540f4fc6d96c8299e6c5")).intValue();
        }
        JsonElement c = com.sankuai.eh.component.service.utils.b.c(this.k, "algorithmAB");
        return (c == null || f.a(com.sankuai.eh.component.service.utils.b.a(c, 100))) ? 1 : 2;
    }

    private void a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59191f1422e40577e16f096d6735a7f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59191f1422e40577e16f096d6735a7f6");
        } else if (f.b()) {
        } else {
            bitmap.recycle();
        }
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17631608a7b4d51a158ec2634b7fa480", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17631608a7b4d51a158ec2634b7fa480");
        }
        Uri g = e.g(com.sankuai.eh.component.service.utils.b.a(this.j, "url"));
        Iterator<JsonElement> it = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(this.k, "source")).iterator();
        while (it.hasNext()) {
            String b = com.sankuai.eh.component.service.utils.b.b(it.next(), "");
            String queryParameter = g.getQueryParameter(b);
            if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(queryParameter)) {
                return queryParameter;
            }
        }
        return null;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a7447a852ce20f83c9038d6769d8124", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a7447a852ce20f83c9038d6769d8124");
            return;
        }
        int currentTimeMillis = (int) (((System.currentTimeMillis() - this.h) / 1000) + 1);
        com.dianping.codelog.b.b(a.class, this.i, d());
        new d.c().a(this.i).a("osVersion", Build.VERSION.RELEASE).a("time", currentTimeMillis > 10 ? "10" : Integer.toString(currentTimeMillis)).a("source", b()).b();
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c85ae8091e0559cb80cb6edcdaf0cc30", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c85ae8091e0559cb80cb6edcdaf0cc30");
        }
        if (this.m == null) {
            this.m = new JSONObject();
            a(this.m);
        }
        return this.m.toString();
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40e0cd4b78565752163f7e27d4295649", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40e0cd4b78565752163f7e27d4295649");
            return;
        }
        try {
            jSONObject.put("originUrl", com.sankuai.eh.component.service.utils.b.a(this.j, "url"));
            jSONObject.put(DeviceInfo.USER_ID, com.sankuai.eh.component.service.a.c().d());
            jSONObject.put("onload", this.l.get("load"));
            jSONObject.put("timeSpan", System.currentTimeMillis() - this.h);
            jSONObject.put("skeleton", this.l.get("skeleton"));
        } catch (JSONException e) {
            com.sankuai.eh.component.service.tools.d.a(e);
        }
    }
}
