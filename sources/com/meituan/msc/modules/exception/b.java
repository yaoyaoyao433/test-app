package com.meituan.msc.modules.exception;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.util.Pair;
import com.meituan.android.mrn.module.MRNExceptionsManagerModule;
import com.meituan.msc.common.config.MSCRenderConfig;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.modules.container.p;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.f;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.manager.q;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = MRNExceptionsManagerModule.NAME)
/* loaded from: classes3.dex */
public class b extends k implements com.meituan.msc.modules.exception.a {
    public static ChangeQuickRedirect a;
    private static RedBoxDialog b;
    private int c;
    private final q d;

    @Override // com.meituan.msc.modules.manager.k
    public final String J_() {
        return MRNExceptionsManagerModule.NAME;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cc2dd9fb10d0cdbaca0409a4ce98ed0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cc2dd9fb10d0cdbaca0409a4ce98ed0");
            return;
        }
        this.c = 0;
        this.d = new q() { // from class: com.meituan.msc.modules.exception.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.manager.q
            public final void a(f fVar) {
                Object[] objArr2 = {fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2b20709568c24818af99dc2c429200f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2b20709568c24818af99dc2c429200f");
                } else {
                    b.this.f();
                }
            }
        };
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        JS,
        NATIVE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6cd63cf9856f9f1261312c19bac394c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6cd63cf9856f9f1261312c19bac394c");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "730067b00bf2646bb53f5c952605cabf", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "730067b00bf2646bb53f5c952605cabf") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57e0fc2686cf6f3cde473a04de2422ed", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57e0fc2686cf6f3cde473a04de2422ed") : (a[]) values().clone();
        }
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25fd9863724f33b5a3a9cabb7991cab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25fd9863724f33b5a3a9cabb7991cab1");
            return;
        }
        super.a(hVar);
        U_().a("msc_event_container_destroyed", this.d);
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void L_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48d4c10c60cc7bab289b905e623e7302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48d4c10c60cc7bab289b905e623e7302");
            return;
        }
        f();
        U_().a(this.d);
        super.L_();
    }

    @MSCMethod
    public void reportFatalException(String str, JSONArray jSONArray, double d) {
        Object[] objArr = {str, jSONArray, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "441bdbfd2d015aa3452c714c693cfd78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "441bdbfd2d015aa3452c714c693cfd78");
            return;
        }
        int i = (int) d;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", str);
            jSONObject.put("stack", jSONArray);
            jSONObject.put("id", i);
            jSONObject.put("isFatal", true);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        reportException(jSONObject);
    }

    @MSCMethod
    public void reportSoftException(String str, JSONArray jSONArray, double d) {
        Object[] objArr = {str, jSONArray, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b8047e8d62f1958d9eae90b98150349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b8047e8d62f1958d9eae90b98150349");
            return;
        }
        int i = (int) d;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", str);
            jSONObject.put("stack", jSONArray);
            jSONObject.put("id", i);
            jSONObject.put("isFatal", false);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        reportException(jSONObject);
    }

    @MSCMethod
    public void reportException(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f4f3411d0c9e9cdc689a49ef38bb0e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f4f3411d0c9e9cdc689a49ef38bb0e5");
        } else {
            a(jSONObject, U_().p);
        }
    }

    @Override // com.meituan.msc.modules.exception.a
    public final void a(JSONObject jSONObject, com.meituan.msc.modules.page.e eVar) {
        com.meituan.msc.modules.reporter.f fVar;
        Object[] objArr = {jSONObject, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "727abaf1e88a565773f52aed8813340b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "727abaf1e88a565773f52aed8813340b");
            return;
        }
        if (eVar != null) {
            fVar = eVar.l();
        } else {
            fVar = U_().p;
        }
        a(jSONObject, fVar);
    }

    @MSCMethod
    public void updateExceptionMessage(final String str, final JSONArray jSONArray, double d) {
        Object[] objArr = {str, jSONArray, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "544fba3d41effc12dfb206fe3e795905", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "544fba3d41effc12dfb206fe3e795905");
            return;
        }
        final int i = (int) d;
        Object[] objArr2 = {str, jSONArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce6c873799b9f3e29244ae403e8f4f90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce6c873799b9f3e29244ae403e8f4f90");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.modules.exception.b.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "64d9ecf0b1e7bbe709f6a68daf58825e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "64d9ecf0b1e7bbe709f6a68daf58825e");
                    } else if (b.b != null && b.b.isShowing() && i == b.this.c) {
                        Pair create = Pair.create(str, e.a(jSONArray));
                        b.b.a((String) create.first, (com.meituan.msc.devsupport.interfaces.a[]) create.second);
                        b bVar = b.this;
                        String str2 = str;
                        int i2 = i;
                        a aVar = a.JS;
                        bVar.c = i2;
                        b.b.show();
                    }
                }
            });
        }
    }

    @MSCMethod
    public void dismissRedbox() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d01de0970403728736473da44621c8e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d01de0970403728736473da44621c8e1");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.modules.exception.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f37eac31cd3085f0a603441ea7d6f13e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f37eac31cd3085f0a603441ea7d6f13e");
                    } else {
                        b.this.e();
                    }
                }
            });
        }
    }

    public static boolean a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "577ae9c1e9045939c67f2488d3a39366", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "577ae9c1e9045939c67f2488d3a39366")).booleanValue() : jSONObject.optBoolean("isFatal");
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9003f5d7509502bd3e383d642ecf1f1c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9003f5d7509502bd3e383d642ecf1f1c")).booleanValue() : (MSCEnvHelper.isInited() && !MSCEnvHelper.getEnvInfo().isProdEnv()) || DebugHelper.a();
    }

    private boolean a(String str, JSONObject jSONObject) {
        boolean z;
        com.meituan.msc.modules.container.q b2;
        p e;
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "478824f8088aa15a0ae2b7cdc544d594", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "478824f8088aa15a0ae2b7cdc544d594")).booleanValue();
        }
        if (MSCRenderConfig.d() && str.contains("MSCRenderCommandModule is not a registered callable module")) {
            b(str, jSONObject);
            return true;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a498f681318dc36bf261129aa84f9406", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a498f681318dc36bf261129aa84f9406")).booleanValue();
        } else {
            if (U_() != null && (b2 = U_().b()) != null && b2.i() > 0 && (e = b2.e()) != null && e.C() != null && !e.C().isFinishing()) {
                g.d("TAG hasContainerInTask", e, Integer.valueOf(e.C().getTaskId()));
                if (e.C().getTaskId() != -1) {
                    z = true;
                }
            }
            z = false;
        }
        if (!z && str.contains("page stack is empty")) {
            b(str, jSONObject);
            return true;
        }
        int indexOf = str.indexOf("java.lang.OutOfMemoryError");
        if (indexOf != -1) {
            try {
                jSONObject.put("message", str.substring(0, indexOf + 26));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    private void b(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f398645924ebfcb9fe86b0eb81d516f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f398645924ebfcb9fe86b0eb81d516f");
        } else {
            g.e(MRNExceptionsManagerModule.NAME, "logSkippedErrorMessage", jSONObject);
        }
    }

    private void a(JSONObject jSONObject, com.meituan.msc.modules.reporter.f fVar) {
        Object[] objArr = {jSONObject, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4cb0b835aec3d58daaf77476ff35087", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4cb0b835aec3d58daaf77476ff35087");
            return;
        }
        try {
            if (!a(jSONObject.optString("message"), jSONObject)) {
                fVar.a(jSONObject);
            }
        } catch (Throwable unused) {
            fVar.a(jSONObject);
        }
        jSONObject.optBoolean("isFatal");
        if (d()) {
            a(jSONObject.optString("message"), e.a(jSONObject.optJSONArray("stack")), jSONObject.optInt("id"), a.JS);
        }
    }

    @Override // com.meituan.msc.modules.exception.a
    public final void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "076ecf64ed6f9afbbab4122b6612cce2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "076ecf64ed6f9afbbab4122b6612cce2");
        } else {
            a(str, e.a(th), -1, a.NATIVE);
        }
    }

    private void a(@Nullable final String str, final com.meituan.msc.devsupport.interfaces.a[] aVarArr, final int i, final a aVar) {
        Object[] objArr = {str, aVarArr, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8c3ebc18f83ef651a956414c1377af1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8c3ebc18f83ef651a956414c1377af1");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.modules.exception.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8bd0e265eceb4e3206d92cfdf77727b4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8bd0e265eceb4e3206d92cfdf77727b4");
                        return;
                    }
                    if (b.b == null) {
                        Activity c = b.this.U_().b().c();
                        if (c == null || c.isFinishing()) {
                            g.a("ReactNative", "Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: " + str);
                            return;
                        }
                        b bVar = b.this;
                        Object[] objArr3 = {c, null};
                        ChangeQuickRedirect changeQuickRedirect3 = b.a;
                        RedBoxDialog unused = b.b = PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "dc363a9d9023708eb759f9400a73c249", RobustBitConfig.DEFAULT_VALUE) ? (RedBoxDialog) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "dc363a9d9023708eb759f9400a73c249") : new RedBoxDialog(c, null);
                    }
                    if (b.b.isShowing()) {
                        return;
                    }
                    Pair create = Pair.create(str, aVarArr);
                    b.b.a((String) create.first, (com.meituan.msc.devsupport.interfaces.a[]) create.second);
                    b bVar2 = b.this;
                    String str2 = str;
                    com.meituan.msc.devsupport.interfaces.a[] aVarArr2 = aVarArr;
                    int i2 = i;
                    a aVar2 = aVar;
                    bVar2.c = i2;
                    RedBoxDialog unused2 = b.b;
                    try {
                        b.b.show();
                    } catch (Throwable unused3) {
                    }
                }
            });
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "091b4b78f0de624954c664289be2844b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "091b4b78f0de624954c664289be2844b");
        } else if (b != null) {
            try {
                b.dismiss();
            } catch (Throwable unused) {
            }
            b = null;
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c74c5ed54a1a76f97dafd7c4758e7058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c74c5ed54a1a76f97dafd7c4758e7058");
        } else {
            e();
        }
    }
}
