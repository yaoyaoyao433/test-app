package com.dianping.picassocontroller.module;

import android.support.annotation.Keep;
import com.dianping.picasso.PicassoView;
import com.dianping.picassocontroller.annotation.PCSBMethod;
import com.dianping.picassocontroller.annotation.PCSBModule;
import com.dianping.picassocontroller.vc.b;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
@PCSBModule(name = "vc", stringify = true)
/* loaded from: classes.dex */
public class VCModule {
    private static final String TAG = "VCModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Keep
    @PCSBMethod(name = "needLayout")
    public void needLayout(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a616135454329d0fd7bb213079e8735f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a616135454329d0fd7bb213079e8735f");
        } else if (bVar instanceof g) {
            ((g) bVar).i();
        }
    }

    @Keep
    @PCSBMethod(name = "needLayoutAsync")
    public void needLayoutAsync(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3f200ee8f2c65577bc9ca7b23376743", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3f200ee8f2c65577bc9ca7b23376743");
        } else if (bVar instanceof g) {
            final g gVar = (g) bVar;
            gVar.a(new Runnable() { // from class: com.dianping.picassocontroller.module.VCModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a5b5d60862289e24b1624e1db1c92848", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a5b5d60862289e24b1624e1db1c92848");
                    } else {
                        gVar.i();
                    }
                }
            });
        }
    }

    @Keep
    @PCSBMethod(name = "needComponentLayout")
    public void needComponentLayout(b bVar, JSONObject jSONObject) {
        Object[] objArr = {bVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35761d358804e3ebd5d5f184ef552cbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35761d358804e3ebd5d5f184ef552cbb");
        } else if (bVar instanceof g) {
            ((g) bVar).b(jSONObject.optInt("componentId"));
        }
    }

    @Keep
    @PCSBMethod(name = "needComponentLayoutAsync")
    public void needComponentLayoutAsync(b bVar, final JSONObject jSONObject) {
        Object[] objArr = {bVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "239a8ef71a64679df8a574818874204a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "239a8ef71a64679df8a574818874204a");
        } else if (bVar instanceof g) {
            final g gVar = (g) bVar;
            gVar.a(new Runnable() { // from class: com.dianping.picassocontroller.module.VCModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b6e30fb3384279afc8517e69e32f37a2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b6e30fb3384279afc8517e69e32f37a2");
                    } else {
                        gVar.b(jSONObject.optInt("componentId"));
                    }
                }
            });
        }
    }

    @Keep
    @PCSBMethod(name = "needChildLayout")
    public void needChildLayout(b bVar, final JSONObject jSONObject) {
        Object[] objArr = {bVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77cdeea1480d3c8d9820cc35fba323db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77cdeea1480d3c8d9820cc35fba323db");
        } else if (bVar instanceof g) {
            final g gVar = (g) bVar;
            gVar.a(new Runnable() { // from class: com.dianping.picassocontroller.module.VCModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "77ead0068449810bca6685ea21fe5e2b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "77ead0068449810bca6685ea21fe5e2b");
                        return;
                    }
                    gVar.a((PicassoView) null, jSONObject.optInt("vcId"), (g.a) null);
                }
            });
        }
    }

    @Keep
    @PCSBMethod(name = "sendMsg")
    public void sendMsg(final b bVar, final JSONObject jSONObject) {
        Object[] objArr = {bVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1544a7c28717da52a9efe727978df43e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1544a7c28717da52a9efe727978df43e");
        } else if (!(bVar instanceof g) || jSONObject == null) {
        } else {
            ((g) bVar).a(new Runnable() { // from class: com.dianping.picassocontroller.module.VCModule.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "327479ff06296da8fdb443c24881e87b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "327479ff06296da8fdb443c24881e87b");
                        return;
                    }
                    g gVar = (g) bVar;
                    Object[] objArr3 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect4 = g.m;
                    if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect4, false, "f4a986fbd85afe514cf15b38b90091bc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect4, false, "f4a986fbd85afe514cf15b38b90091bc");
                    }
                }
            });
        }
    }

    @Keep
    @PCSBMethod(name = "clearCachedKeys")
    public void clearCachedKeys(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "969e4ca3dbc2a1aba82a580575a12877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "969e4ca3dbc2a1aba82a580575a12877");
        } else if (bVar instanceof g) {
            g gVar = (g) bVar;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = g.m;
            if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect3, false, "ef4a1ea1f004ff98c17f92534768e175", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect3, false, "ef4a1ea1f004ff98c17f92534768e175");
            } else if (gVar.r != null) {
                gVar.r.clear();
            }
        }
    }
}
