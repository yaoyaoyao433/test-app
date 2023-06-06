package com.sankuai.ehcore.detector;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
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
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.eh.component.service.utils.thread.a;
import com.sankuai.ehcore.horn.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    public boolean b;
    public int c;
    public int d;
    public long e;
    public com.sankuai.ehcore.tools.b f;
    public Bitmap g;
    public JSONObject h;
    private JsonElement i;

    public a(com.sankuai.ehcore.tools.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e9aba91fa4374d01ac095b07014a8fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e9aba91fa4374d01ac095b07014a8fb");
            return;
        }
        this.b = false;
        this.c = 2;
        this.f = bVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da2a6a9fea283f060f1d36e0560d9c25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da2a6a9fea283f060f1d36e0560d9c25");
            return;
        }
        this.d = 0;
        if (e.j()) {
            return;
        }
        this.i = this.f.a().get("closeMonitor");
        if (this.i != null) {
            this.d = 1;
            this.f.d("whiteMonitor");
        }
    }

    public final void a(View view, int i) {
        int i2;
        CountDownLatch countDownLatch;
        com.sankuai.eh.component.service.utils.thread.b bVar;
        a.InterfaceC0552a cVar;
        Object[] objArr = {view, 11};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0485e6338f4339842171ddcc97cec9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0485e6338f4339842171ddcc97cec9a");
        } else if (f.a(this.i)) {
            long j = this.e;
            Bitmap bitmap = this.g;
            JsonArray b = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(this.i, "region"));
            ArrayList arrayList = new ArrayList();
            Object obj = null;
            char c = 3;
            if (b.size() <= 0) {
                com.sankuai.eh.component.service.utils.thread.b a2 = com.sankuai.eh.component.service.utils.thread.b.a();
                Object[] objArr2 = {this, bitmap, new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                a2.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a07c6f34c3b1dd01833b80902a805625", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a07c6f34c3b1dd01833b80902a805625") : new b(this, bitmap, j));
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
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1a72bb1d4c575de46d3932abb7d821cd", RobustBitConfig.DEFAULT_VALUE)) {
                    cVar = (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr3, obj, changeQuickRedirect3, true, "1a72bb1d4c575de46d3932abb7d821cd");
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
            a4.c(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "83d615735fff905f4377dcabf040d6f9", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "83d615735fff905f4377dcabf040d6f9") : new d(this, countDownLatch3, bitmap, arrayList, j));
        }
    }

    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r12v5 */
    public static /* synthetic */ void a(a aVar, Bitmap bitmap, long j) {
        Object[] objArr = {aVar, bitmap, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a5b91ff94b6619c1d4704a414d56836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a5b91ff94b6619c1d4704a414d56836");
            return;
        }
        Object[] objArr2 = {bitmap, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "050446b2fb01487af55a625032e4cf06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "050446b2fb01487af55a625032e4cf06");
        } else if (bitmap == null) {
            aVar.a(true, 0L);
        } else {
            float[][] a2 = com.sankuai.eh.plugins.detector.imgs.a.a(bitmap, aVar.a());
            if (a2 != null && a2.length > 0) {
                com.sankuai.eh.component.service.tools.d.a("pixels", "color: " + a2[0][0] + " ratio:" + a2[0][1]);
                float f = a2[0][1];
                Object[] objArr3 = {bitmap, Float.valueOf(f), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "ba77f972e4c29459c26ea29bee548517", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "ba77f972e4c29459c26ea29bee548517");
                } else {
                    ?? r12 = f > com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(aVar.i, "percent"), 0.998f) ? 1 : 0;
                    aVar.a((boolean) r12, j);
                    if (r12 != 0) {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "065ffaf8ac78b7ea9aab35618c8b89a3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "065ffaf8ac78b7ea9aab35618c8b89a3");
                        } else {
                            long b = aVar.f.b("at_eh_open");
                            int a3 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(aVar.i, "catDelay"), 200);
                            String b2 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(aVar.i, "catKey"), "");
                            boolean booleanValue = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(aVar.i, "catOnload"), false).booleanValue();
                            if (b > a3 && !TextUtils.isEmpty(b2)) {
                                if (booleanValue) {
                                    if (aVar.f.f || aVar.f.e) {
                                        com.dianping.codelog.b.b(a.class, b2, aVar.b());
                                    }
                                } else {
                                    com.dianping.codelog.b.b(a.class, b2, aVar.b());
                                }
                            }
                        }
                    }
                    Object[] objArr5 = {bitmap, Byte.valueOf((byte) r12), Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "0d8ffb424e0d3cdac76bf33e11077492", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "0d8ffb424e0d3cdac76bf33e11077492");
                    } else if (com.sankuai.eh.component.service.utils.b.c(aVar.i, "upload") != null) {
                        Map<String, JsonElement> c = com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.c(aVar.i, "upload"));
                        byte[] a4 = com.sankuai.eh.plugins.detector.imgs.c.a(bitmap, com.sankuai.eh.component.service.utils.b.a(c.get(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE), 3));
                        int a5 = com.sankuai.eh.component.service.utils.b.a(c.get("ab"), -1);
                        if (a4 != null && a.C0548a.a.c() <= a5) {
                            int a6 = com.sankuai.eh.component.service.utils.b.a(c.get(JsBridgeResult.ARG_KEY_LOCATION_MODE), 0);
                            String b3 = com.sankuai.eh.component.service.utils.b.b(c.get("bucket"), "ehimgdefault");
                            String str = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(aVar.i, "catKey"), "default") + CommonConstant.Symbol.MINUS + System.currentTimeMillis() + CommonConstant.Symbol.MINUS + f + ".jpg";
                            if ((a6 == 0 && r12 != 0) || a6 == 1) {
                                com.sankuai.eh.plugins.detector.imgs.c.a(a4, str, b3);
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a67b32fe7c94645423e35552ac953639", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a67b32fe7c94645423e35552ac953639");
            return;
        }
        Object[] objArr2 = {bitmap, jsonArray, list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "cdaf9bcf141aa90f9a7d2093995fb587", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "cdaf9bcf141aa90f9a7d2093995fb587");
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, com.sankuai.eh.component.service.utils.b.a(jsonArray.get(0), 0) / aVar.c, com.sankuai.eh.component.service.utils.b.a(jsonArray.get(1), 0) / aVar.c, com.sankuai.eh.component.service.utils.b.a(jsonArray.get(2), 0) / aVar.c, com.sankuai.eh.component.service.utils.b.a(jsonArray.get(3), 0) / aVar.c);
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b36c23b239ab9f09e0582aa33cb9730", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b36c23b239ab9f09e0582aa33cb9730");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56d2215e241e892993e243d3a489a413", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56d2215e241e892993e243d3a489a413");
            return;
        }
        float a2 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(this.i, "percent"), 0.998f);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9617dc274e28f2c9be65f6fa2df60dbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9617dc274e28f2c9be65f6fa2df60dbd");
        } else if (this.b) {
            com.sankuai.eh.component.service.tools.d.a("pixels", "close - type: " + this.d + " result: " + j);
            a(new d.b().a("name", "eh.page.close").a("isWhite", Boolean.valueOf(z)).a("monitorCost", Long.valueOf(j)).a("algorithm", Integer.valueOf(a())).b, Long.valueOf(this.f.b("at_eh_open")));
        }
    }

    private void a(Map<String, Object> map, Long l) {
        boolean z = false;
        Object[] objArr = {map, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "845af4250ab1f94928c188715b611d26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "845af4250ab1f94928c188715b611d26");
            return;
        }
        d.b a2 = new d.b().a("currentUrl", this.f.m);
        if (this.f.f || (this.f.n && this.f.e)) {
            z = true;
        }
        com.sankuai.ehcore.util.a.a("eh_close", a2.a("ehShow", Boolean.valueOf(z)).a("load", Boolean.valueOf(this.f.e)).a(com.sankuai.ehcore.util.a.a(this.f)).a(map).b, l);
    }

    private int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4265cba319fcf32d6f8f97e3c040b7e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4265cba319fcf32d6f8f97e3c040b7e3")).intValue();
        }
        if (com.sankuai.eh.component.service.utils.b.c(this.i, "algorithmAB") != null) {
            return f.a(com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(this.i, "algorithmAB"), 100)) ? 1 : 2;
        } else if (com.sankuai.eh.component.service.utils.b.c(this.i, "algorithm") != null) {
            return com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(this.i, "algorithm"), 1);
        } else {
            return com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(e.c(), "algorithm"), 1);
        }
    }

    private void a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de92d39821dc1c729bfdba10ad0edb25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de92d39821dc1c729bfdba10ad0edb25");
        } else if (f.b()) {
        } else {
            bitmap.recycle();
        }
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5691fb4065e4afcf89d01f1067b9db18", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5691fb4065e4afcf89d01f1067b9db18");
        }
        if (this.h == null) {
            this.h = new JSONObject();
            a(this.h, this.f);
        }
        return this.h.toString();
    }

    public static void a(JSONObject jSONObject, com.sankuai.ehcore.tools.b bVar) {
        Object[] objArr = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dcc5c56e78e638a4973d04962322ea2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dcc5c56e78e638a4973d04962322ea2d");
            return;
        }
        try {
            jSONObject.put("originUrl", bVar.k);
            jSONObject.put("loadUrl", bVar.m);
            jSONObject.put(DeviceInfo.USER_ID, com.sankuai.ehcore.util.b.a());
            jSONObject.put("onload", bVar.e);
            jSONObject.put("timeSpan", bVar.b("at_eh_open"));
            jSONObject.put("skeleton", bVar.g);
        } catch (JSONException e) {
            com.sankuai.eh.component.service.tools.d.a(e);
        }
    }

    public static void a(JSONObject jSONObject, WebView webView) {
        Object[] objArr = {jSONObject, webView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99330998efa6f06b00a2920e790b768d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99330998efa6f06b00a2920e790b768d");
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(webView.getWidth());
            jSONArray.put(webView.getHeight());
            jSONObject.put("webview size", jSONArray);
            jSONObject.put("webview contentHeight", webView.getContentHeight());
            jSONObject.put("webview title", webView.getTitle());
        } catch (Exception e) {
            com.sankuai.eh.component.service.tools.d.a(e);
        }
    }
}
