package com.sankuai.eh.component.web;

import android.app.Application;
import android.content.Context;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.spi.IEHInit;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.web.bridge.EHCloseModalJsHandler;
import com.sankuai.eh.component.web.bridge.EHDfpFingerprintJsHandler;
import com.sankuai.eh.component.web.bridge.EHFinParamsJsHandler;
import com.sankuai.eh.component.web.bridge.EHGetInfoJsHandler;
import com.sankuai.eh.component.web.bridge.EHGetRiskInfoJsHandler;
import com.sankuai.eh.component.web.bridge.EHPrefetchApiJsHandler;
import com.sankuai.eh.component.web.bridge.EHReportJsHandler;
import com.sankuai.eh.component.web.bridge.EHShowJsHandler;
import com.sankuai.eh.component.web.bridge.EHShowSkeletonJsHandler;
import com.sankuai.eh.component.web.bridge.EHTransCompleteJsHandler;
import com.sankuai.eh.component.web.bridge.EHTransJsHandler;
import com.sankuai.eh.component.web.plugins.c;
import com.sankuai.eh.component.web.plugins.f;
import com.sankuai.eh.component.web.plugins.h;
import com.sankuai.eh.component.web.plugins.k;
import com.sankuai.eh.component.web.plugins.m;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b implements IEHInit {
    public static ChangeQuickRedirect a;
    public static boolean b;
    private static long c;

    @Override // com.sankuai.eh.component.service.spi.IEHInit
    public void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abe014d90da0955d9f69dc0cc033dbdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abe014d90da0955d9f69dc0cc033dbdb");
        } else if (b) {
        } else {
            d.b("WebComponentInit init...");
            c = System.currentTimeMillis();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d715d4a6fbb8eba8ab1b77ffaec9013", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d715d4a6fbb8eba8ab1b77ffaec9013");
            } else {
                com.sankuai.eh.component.web.bridge.b.a();
                JsHandlerFactory.registerJsHandler("eh.show", EHShowJsHandler.class);
                JsHandlerFactory.registerJsHandler("eh.trans", EHTransJsHandler.class);
                JsHandlerFactory.registerJsHandler("eh.transComplete", EHTransCompleteJsHandler.class);
                JsHandlerFactory.registerJsHandler("eh.showSkeleton", "oGmdnqbVdmukXt7WKoRP23CDyswAVNBSOZ/oNYE/X8pBZPcZy1yrcr3LVRFWK1HJ0oTqruPTckJzHPREZ4NKYQ==", EHShowSkeletonJsHandler.class);
                JsHandlerFactory.registerJsHandler("eh.report", "NbWIpuxRoSy0Wu/NhjoYuUzG3WXy42LtwwfxA5fPH8mxuEEUKe9YkHUidWADKgJHqTr6lQHSYU3rGe2CPoAmPQ==", EHReportJsHandler.class);
                JsHandlerFactory.registerJsHandler("eh.getInfo", "cZbErg3BIUx7LytqrbqEGWaW6xvA0FTWM8q10Tp2G0U2vGuWgYoMJgA/ipx5IlE4nHRJYUz2t/69wrwZhsc9TA==", EHGetInfoJsHandler.class);
                JsHandlerFactory.registerJsHandler("eh.prefetchApi", "fcAr+GsE7DntIZDABNnV+ua5UEoKK8YWVILZU3PAnob67IzFLn+AoHDI//0oE6ULC6f0FOXIeu63RQWufZdwyA==", EHPrefetchApiJsHandler.class);
                JsHandlerFactory.registerJsHandler("eh.getFinParams", "OZ/LpBdclfO3NMCLyxGrfICMSfy2G1qeGoc9KvyBHHd1PBj/4dmA2iiQt5CzzTxqmvNhP1rJ/VKMD8zS/zBs+A==", EHFinParamsJsHandler.class);
                JsHandlerFactory.registerJsHandler("eh.getDfpFingerprint", "UmXWvIQNAqaKOAo/LMoQz3+YGT3y+ccqlwm5Uh7Oy4GaUooCX2OuvuTYHSgCWgpXJhxuToA1mGQgqa3p6jKEEw==", EHDfpFingerprintJsHandler.class);
                JsHandlerFactory.registerJsHandler("ehc.closeModal", "XpdXUbqeG8QnS/vzV3O8jJ0ZO3IYFWmIeWab8GHAvgGmnO7ScYGHLrTyusAaZ4xaHArv14yQ5hlpD2FvE05/zg==", EHCloseModalJsHandler.class);
                JsHandlerFactory.registerJsHandler("eh.getRiskInfo", "m3QIrqKynMlkuDycHQUcDb7oB1xThDX/+iGnE89DYhIndBBN8cM/3K7KDGKXZDZFUVr7LrLzId8WzcYE69RRpQ==", EHGetRiskInfoJsHandler.class);
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e9695d2b79f28a9e6b7b6f167af37178", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e9695d2b79f28a9e6b7b6f167af37178");
            } else {
                com.sankuai.eh.component.web.plugins.core.b.a("skeleton", k.class);
                com.sankuai.eh.component.web.plugins.core.b.a("api_fetch", com.sankuai.eh.component.web.plugins.a.class);
                com.sankuai.eh.component.web.plugins.core.b.a(c.b, c.class);
                com.sankuai.eh.component.web.plugins.core.b.a("res_fetch", h.class);
                com.sankuai.eh.component.web.plugins.core.b.a("urlRewrite", m.class);
                com.sankuai.eh.component.web.plugins.core.b.a("js_module", f.class);
            }
            ((Application) context).registerActivityLifecycleCallbacks(new com.sankuai.eh.component.web.chain.d());
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5e9e03fe8057bdfcf08a09829ab85ead", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5e9e03fe8057bdfcf08a09829ab85ead");
            } else {
                d.a("web_init", new d.b().a("name", "ehc.app.start").b);
                new d.c().a("ehc.app.start").b();
            }
            b = true;
        }
    }

    public static long a() {
        return c;
    }
}
