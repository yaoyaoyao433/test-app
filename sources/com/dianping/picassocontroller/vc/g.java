package com.dianping.picassocontroller.vc;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.picasso.PicassoRenderEngine;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.PicassoViewWrapperUtil;
import com.dianping.picasso.creator.BaseViewWrapper;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.model.PicassoValue;
import com.dianping.picasso.view.component.ContainerItemInterface;
import com.dianping.picassocontroller.jse.h;
import com.dianping.picassocontroller.vc.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class g extends e {
    public static ChangeQuickRedirect m;
    private ArrayList<Object> A;
    public HashMap<String, WeakReference<View>> n;
    public HashMap<String, WeakReference<PicassoModel>> o;
    SparseArray<WeakReference<View>> p;
    public SparseArray<WeakReference<PicassoModel>> q;
    public SparseArray<PicassoModel> r;
    public PicassoView s;
    public com.dianping.picassocontroller.statis.a t;
    public PicassoModel u;
    public boolean v;
    public int w;
    public com.dianping.picassocontroller.widget.b x;
    private com.dianping.picassocontroller.vc.a<Integer, PicassoView> y;
    private SparseArray<Object> z;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
    }

    public static /* synthetic */ PicassoModel a(g gVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "f81510ee77b4966dac625e4e9f13e819", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoModel) PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "f81510ee77b4966dac625e4e9f13e819");
        }
        String d = gVar.g.d("vc_js_layout_component_");
        gVar.g.b(d);
        PicassoModel c = gVar.c("dispatchComponentLayoutByNative", new JSONBuilder().put("componentId", Integer.valueOf(i)).toJSONObject());
        gVar.g.c(d);
        return c;
    }

    public static /* synthetic */ PicassoModel a(g gVar, JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "5b516e3b8b163baf976fb8cd7ccec012", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoModel) PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "5b516e3b8b163baf976fb8cd7ccec012");
        }
        String d = gVar.g.d("vc_js_layout_child_");
        gVar.g.b(d);
        gVar.g.b("child_precompute");
        PicassoModel c = gVar.c("dispatchChildLayoutByNative", jSONObject);
        gVar.g.c(d);
        com.dianping.picassocontroller.monitor.a aVar = gVar.g;
        aVar.b("child_precompute", "picasso://compute/child/" + gVar.i, c.isNull() ? 500 : 200);
        return c;
    }

    public static /* synthetic */ boolean a(g gVar, boolean z) {
        gVar.v = false;
        return false;
    }

    public static /* synthetic */ void c(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "7735cf58d659ffe27e76740a695d7336", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "7735cf58d659ffe27e76740a695d7336");
        } else {
            gVar.a("dispatchOnLayoutFinished", new Object[0]);
        }
    }

    public g(Context context, String str, Point point, JSONObject jSONObject) {
        this(context, str, jSONObject, new JSONBuilder().put("width", Integer.valueOf(point.x)).put("height", Integer.valueOf(point.y)).toJSONObject());
        Object[] objArr = {context, str, point, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00cf169f203d247a12ac7e275d6c26d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00cf169f203d247a12ac7e275d6c26d0");
        }
    }

    private g(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this(context, str, jSONObject, jSONObject2, null);
        Object[] objArr = {context, str, jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dc6beb4aa226ca15cd2875f341dead5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dc6beb4aa226ca15cd2875f341dead5");
        }
    }

    private g(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2, String str2) {
        this(context, str, jSONObject, jSONObject2, null, false);
        Object[] objArr = {context, str, jSONObject, jSONObject2, null};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92c9172a7dca10a21c0435bf27d76292", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92c9172a7dca10a21c0435bf27d76292");
        }
    }

    private g(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2, String str2, boolean z) {
        this(context, str, jSONObject, jSONObject2, str2, false, null);
        Object[] objArr = {context, str, jSONObject, jSONObject2, str2, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59f44defb83b7a0fbe5734b3cb0ea06a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59f44defb83b7a0fbe5734b3cb0ea06a");
        }
    }

    private g(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2, String str2, boolean z, e.a aVar) {
        super(context, str, jSONObject, jSONObject2, str2, z, null);
        Object[] objArr = {context, str, jSONObject, jSONObject2, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), null};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88418811975b6a6ab899b99bce34d98c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88418811975b6a6ab899b99bce34d98c");
            return;
        }
        this.n = new HashMap<>();
        this.o = new HashMap<>();
        this.p = new SparseArray<>();
        this.q = new SparseArray<>();
        this.r = new SparseArray<>();
        this.y = new com.dianping.picassocontroller.vc.a<>();
        this.z = new SparseArray<>();
        this.A = new ArrayList<>();
        this.g.b("vc_load");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(PicassoModel picassoModel) {
        Object[] objArr = {picassoModel};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba49d087428efbab5cb04ccdb61ae1b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba49d087428efbab5cb04ccdb61ae1b3");
        } else {
            a((PicassoView) null, picassoModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@Nullable final PicassoView picassoView, final PicassoModel picassoModel) {
        Object[] objArr = {picassoView, picassoModel};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6212a4fd5bcf8340fb900a7846d9e657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6212a4fd5bcf8340fb900a7846d9e657");
        } else {
            a(new Runnable() { // from class: com.dianping.picassocontroller.vc.g.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 601
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.dianping.picassocontroller.vc.g.AnonymousClass1.run():void");
                }
            });
        }
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d97192c969aec3c7926f3756afd8b1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d97192c969aec3c7926f3756afd8b1e");
        } else {
            a(this, new Runnable() { // from class: com.dianping.picassocontroller.vc.g.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0925fe2b6c30fdb516d328b79c39a19a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0925fe2b6c30fdb516d328b79c39a19a");
                        return;
                    }
                    g.this.g.b("vc_precompute");
                    g gVar = g.this;
                    g gVar2 = g.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = g.m;
                    gVar.u = PatchProxy.isSupport(objArr3, gVar2, changeQuickRedirect3, false, "39b7d088be1172cbb605d8ea1d07bbd9", RobustBitConfig.DEFAULT_VALUE) ? (PicassoModel) PatchProxy.accessDispatch(objArr3, gVar2, changeQuickRedirect3, false, "39b7d088be1172cbb605d8ea1d07bbd9") : gVar2.c("dispatchLayoutByNative", new Object[0]);
                    g.this.g.c("vc_precompute");
                    g.this.a(g.this.u);
                }
            });
        }
    }

    PicassoModel c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "59542a144399b991196d3c0efedb6027", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoModel) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "59542a144399b991196d3c0efedb6027");
        }
        PicassoValue picassoValue = new PicassoValue(b(str, objArr));
        if (picassoValue.isNULL()) {
            return new PicassoModel();
        }
        try {
            this.g.b("value_to_pmodel");
            PicassoModel picassoModel = (PicassoModel) picassoValue.object(PicassoModel.PICASSO_DECODER);
            this.g.c("value_to_pmodel");
            return picassoModel;
        } catch (Exception e) {
            e.printStackTrace();
            com.dianping.codelog.b.b(g.class, e.getMessage());
            return new PicassoModel();
        }
    }

    @UiThread
    public final void a(String str, String str2, JSONObject jSONObject) {
        Object[] objArr = {str, str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f38ab3321011a787d9e13794b079fb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f38ab3321011a787d9e13794b079fb7");
            return;
        }
        JSONBuilder jSONBuilder = new JSONBuilder();
        jSONBuilder.put("id", str).put("action", str2).put("param", jSONObject);
        a("dispatchActionByNative", jSONBuilder.toJSONObject());
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8956b8c22f66960379896feff5174c6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8956b8c22f66960379896feff5174c6d");
        } else if (this.s == null) {
        } else {
            this.s.setVCHost(null);
            this.s = null;
        }
    }

    private void b(PicassoView picassoView) {
        Object[] objArr = {picassoView};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5ad8ea500c073c6808dbeceae8ffd68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5ad8ea500c073c6808dbeceae8ffd68");
            return;
        }
        if (picassoView != null) {
            picassoView.setVCHost(this);
        }
        this.s = picassoView;
    }

    public final void a(PicassoView picassoView) {
        Object[] objArr = {picassoView};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68747004b9cb2854fa21ef20ffe35cec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68747004b9cb2854fa21ef20ffe35cec");
            return;
        }
        if (this.s != picassoView) {
            k();
        }
        if (picassoView != null) {
            g vCHost = picassoView.getVCHost();
            if (vCHost != null && vCHost != this) {
                vCHost.k();
            }
            b(picassoView);
            a(this.u);
        }
    }

    @Override // com.dianping.picassocontroller.vc.e
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c04b5209f3a0545718e73a07fa3d239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c04b5209f3a0545718e73a07fa3d239");
            return;
        }
        this.x = null;
        this.s = null;
        super.e();
    }

    @Override // com.dianping.picassocontroller.vc.e
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49f2efa74b312da42f0d47e8a824ea34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49f2efa74b312da42f0d47e8a824ea34");
            return;
        }
        super.g();
        a(this, new Runnable() { // from class: com.dianping.picassocontroller.vc.g.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18b35a4f995fe6e7b27c8c4c55f1703b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18b35a4f995fe6e7b27c8c4c55f1703b");
                } else {
                    g.this.r.clear();
                }
            }
        });
        for (int i = 0; i < this.z.size(); i++) {
            int keyAt = this.z.keyAt(i);
            Object[] objArr2 = {Integer.valueOf(keyAt)};
            ChangeQuickRedirect changeQuickRedirect2 = m;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3993d466bdaf02417d0dd5c86573afcb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3993d466bdaf02417d0dd5c86573afcb");
            } else {
                this.z.get(keyAt);
                PicassoView picassoView = this.y.get(Integer.valueOf(keyAt));
                if (picassoView != null && picassoView.getFocusedView() != null) {
                    picassoView.getFocusedView().clearFocus();
                    InputMethodManager inputMethodManager = (InputMethodManager) b().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(picassoView.getFocusedView().getWindowToken(), 0);
                    }
                    picassoView.setFocusedView(null);
                }
                this.z.remove(keyAt);
                this.y.remove(Integer.valueOf(keyAt));
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("vcId", keyAt);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                a("destroyChildVCByNative", jSONObject);
            }
        }
    }

    public final View a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d265bc11a0f145fd20fbfd986713a3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d265bc11a0f145fd20fbfd986713a3e");
        }
        WeakReference<View> weakReference = this.n.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final PicassoModel b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3c0462f804cb8940e168dfd12a36a90", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3c0462f804cb8940e168dfd12a36a90");
        }
        WeakReference<PicassoModel> weakReference = this.o.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4297d1313d1f83c4a0ed9845f0ab4f40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4297d1313d1f83c4a0ed9845f0ab4f40");
        } else {
            com.dianping.picassocontroller.jse.b.a(this, "dispatchOnAppear", new Object[0]);
        }
    }

    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5c3e33519ab7e659942365d5dd777d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5c3e33519ab7e659942365d5dd777d5");
            return;
        }
        Iterator<Object> it = this.A.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.A.clear();
    }

    public final void a(PicassoView picassoView, final int i, a aVar) {
        Object[] objArr = {picassoView, Integer.valueOf(i), null};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f43288d3adf2763572dab65af5744f0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f43288d3adf2763572dab65af5744f0a");
            return;
        }
        if (picassoView == null) {
            picassoView = this.y.get(Integer.valueOf(i));
            if (picassoView == null) {
                Log.e("layoutChildVC", "Cannot find childPicassoView");
                return;
            }
        } else {
            this.y.put(Integer.valueOf(i), picassoView);
        }
        final PicassoView picassoView2 = picassoView;
        com.dianping.picassocontroller.monitor.a aVar2 = this.g;
        final String d = aVar2.d("vc_layout_child" + i);
        this.g.a(d);
        a(this, new Runnable() { // from class: com.dianping.picassocontroller.vc.g.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e91deaa3c675193b8411b5537d622a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e91deaa3c675193b8411b5537d622a4");
                    return;
                }
                g.this.g.b(d);
                final PicassoModel a2 = g.a(g.this, new JSONBuilder().put("vcId", Integer.valueOf(i)).toJSONObject());
                g.this.a(new Runnable() { // from class: com.dianping.picassocontroller.vc.g.4.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "681569c301d3f68b6c10a05a0d4cde6d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "681569c301d3f68b6c10a05a0d4cde6d");
                            return;
                        }
                        g.this.a(picassoView2, a2);
                        g.this.g.c(d);
                    }
                });
            }
        });
    }

    public final void a(int i, String str, JSONObject jSONObject) {
        Object[] objArr = {Integer.valueOf(i), str, null};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98fc8bde7933c291a61c045a10e70558", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98fc8bde7933c291a61c045a10e70558");
            return;
        }
        final JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("__vcid__", i);
            jSONObject2.put("__method__", str);
            jSONObject2.put("params", (Object) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        a(this, new Runnable() { // from class: com.dianping.picassocontroller.vc.g.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d697aac46e2b7226feeede24aa615d97", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d697aac46e2b7226feeede24aa615d97");
                } else {
                    g.this.b("callChildVCByNative", jSONObject2);
                }
            }
        });
    }

    public PicassoModel a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99ef7bae482e3558d50a84faa1524626", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99ef7bae482e3558d50a84faa1524626");
        }
        WeakReference<PicassoModel> weakReference = this.q.get(i);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void b(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6960c5793244ff5aba2cee155f9256e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6960c5793244ff5aba2cee155f9256e9");
        } else {
            a(this, new Runnable() { // from class: com.dianping.picassocontroller.vc.g.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f71cb1287f7c9754eee8ebd7108210a1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f71cb1287f7c9754eee8ebd7108210a1");
                        return;
                    }
                    com.dianping.picassocontroller.monitor.a aVar = g.this.g;
                    final String d = aVar.d("vc_layout_component" + i);
                    g.this.g.a(d);
                    g.this.g.b(d);
                    final PicassoModel a2 = g.a(g.this, i);
                    if (a2 == null || a2.isNull()) {
                        com.dianping.codelog.b.b(g.class, "calculateComponentPModel 失败 -- 改为全局刷新");
                        g.this.i();
                    } else if (a2.componentIntercept) {
                    } else {
                        PicassoModel a3 = g.this.a(i);
                        if (a3 == null || a3.isNull()) {
                            com.dianping.codelog.b.a(g.class, "Not find cachePModel");
                            return;
                        }
                        PicassoModel b = g.this.b(a3.parentId);
                        if (b == null || b.isNull()) {
                            com.dianping.codelog.b.a(g.class, "Not find parentPModel");
                            return;
                        }
                        a2.parentId = a3.parentId;
                        if (!b.transformComponent(a2)) {
                            com.dianping.codelog.b.a(g.class, "parentPModel not find ComponentId or PModel type = " + b.type + "不支持Component");
                            return;
                        }
                        h.b(g.this, new Runnable() { // from class: com.dianping.picassocontroller.vc.g.6.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                View view;
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7313465972ac91435aa626514da2d9d9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7313465972ac91435aa626514da2d9d9");
                                    return;
                                }
                                g gVar = g.this;
                                int i2 = i;
                                Object[] objArr4 = {Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect4 = g.m;
                                if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "dfd9e29e83c22f00b0b7dc6452d2408b", RobustBitConfig.DEFAULT_VALUE)) {
                                    view = (View) PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "dfd9e29e83c22f00b0b7dc6452d2408b");
                                } else {
                                    WeakReference<View> weakReference = gVar.p.get(i2);
                                    view = weakReference != null ? weakReference.get() : null;
                                }
                                if (view == null) {
                                    com.dianping.codelog.b.a(g.class, "Not find cacheComponentView");
                                    return;
                                }
                                PicassoModel picassoModel = (PicassoModel) view.getTag(R.id.id_picasso_model);
                                if (picassoModel != null && picassoModel.componentId == i) {
                                    if (g.this.s == null) {
                                        return;
                                    }
                                    BaseViewWrapper viewWrapperByType = PicassoViewWrapperUtil.viewWrapperByType(Integer.valueOf(a2.type));
                                    if (viewWrapperByType instanceof ContainerItemInterface) {
                                        ((ContainerItemInterface) viewWrapperByType).updateItem(g.this.s, view, a2);
                                    } else {
                                        PicassoRenderEngine.renderView(g.this.s, a2, view);
                                    }
                                    g.this.g.c(d);
                                    return;
                                }
                                com.dianping.codelog.b.a(g.class, "find cacheComponentView -- different componentId");
                            }
                        });
                    }
                }
            });
        }
    }

    public final void a(View view, PicassoModel picassoModel, PicassoModel picassoModel2) {
        Object[] objArr = {view, picassoModel, picassoModel2};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dc8f058c677e7e611b176ad6042f9d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dc8f058c677e7e611b176ad6042f9d7");
            return;
        }
        if (!TextUtils.isEmpty(picassoModel.viewId)) {
            this.n.put(picassoModel.viewId, new WeakReference<>(view));
        }
        if (picassoModel2 != null && !TextUtils.equals(picassoModel2.viewId, picassoModel.viewId) && !TextUtils.isEmpty(picassoModel2.viewId)) {
            this.n.remove(picassoModel2.viewId);
        }
        if (picassoModel.componentId > 0) {
            this.p.put(picassoModel.componentId, new WeakReference<>(view));
        }
        if (picassoModel2 == null || picassoModel2.componentId == picassoModel.componentId || picassoModel2.componentId <= 0) {
            return;
        }
        this.p.remove(picassoModel2.componentId);
    }
}
