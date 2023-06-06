package com.dianping.picassocontroller.jse;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.dianping.jscore.JSRuntimeException;
import com.dianping.jscore.Value;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.jscore.model.Unarchived;
import com.dianping.picasso.PicassoManager;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picassocontroller.debug.g;
import com.meituan.android.common.metricx.koom.KoomDebugger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ String a(String str, String str2, JSONObject jSONObject) {
        Object[] objArr = {str, str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c34910c586cbad70a57c1e61529884a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c34910c586cbad70a57c1e61529884a");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(CommonConstant.Symbol.SINGLE_QUOTES);
        sb.append(str);
        sb.append(CommonConstant.Symbol.SINGLE_QUOTES);
        if (jSONObject != null) {
            sb.append(CommonConstant.Symbol.COMMA);
            sb.append(jSONObject.toString());
        }
        String sb2 = sb.toString();
        return String.format(Locale.getDefault(), "(function(context,Picasso,require){\n%s\n}).call(Picasso.prepareContext(%s),Picasso.prepareContext(%s),Picasso.prepareContext(%s).Picasso,Picasso.require);", str2, sb2, sb2, sb2);
    }

    public static /* synthetic */ boolean a(Value value) {
        Object[] objArr = {value};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a6f207df96caf2b3f0eac4f0a0811a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a6f207df96caf2b3f0eac4f0a0811a3")).booleanValue();
        }
        if (value == null || value.getUnarchived() == null) {
            return false;
        }
        Unarchived unarchived = value.getUnarchived();
        unarchived.rewind();
        return unarchived.peek() == 66 && unarchived.peek() == 1;
    }

    public static void a(@NonNull final com.dianping.picassocontroller.vc.b bVar, final String str, final JSONObject jSONObject, final JSONObject jSONObject2) {
        Object[] objArr = {bVar, str, jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f91acacbe3ede7037989d334d3eac39d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f91acacbe3ede7037989d334d3eac39d");
            return;
        }
        com.dianping.picassocontroller.vc.e eVar = (com.dianping.picassocontroller.vc.e) bVar;
        if (TextUtils.isEmpty(str)) {
            com.dianping.codelog.b.a(b.class, eVar.i + ":jsbundle为空");
            return;
        }
        h.a(eVar, new Runnable() { // from class: com.dianping.picassocontroller.jse.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                int i;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b0d4a4c2f7552a4ff8a403ae0b131f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b0d4a4c2f7552a4ff8a403ae0b131f2");
                    return;
                }
                com.dianping.picassocontroller.vc.e eVar2 = (com.dianping.picassocontroller.vc.e) com.dianping.picassocontroller.vc.b.this;
                com.dianping.picassocontroller.monitor.a f = eVar2.f();
                f.b("controller_create");
                String str2 = eVar2.i;
                try {
                    c cVar = eVar2.e;
                    String a2 = b.a(com.dianping.picassocontroller.vc.b.this.a(), str, jSONObject);
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "unknown";
                    }
                    Object[] objArr3 = {eVar2, a2, str2};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "c7bab6bbd82a706f719e460e377c76b9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "c7bab6bbd82a706f719e460e377c76b9");
                    } else if (!cVar.b()) {
                        throw new JSRuntimeException("JS Must be evaluated on js thread,please check the stack,Current thread name is " + Thread.currentThread().getName() + ",current looper = " + String.valueOf(Looper.myLooper()) + ",js looper = " + String.valueOf(cVar.b.getLooper()));
                    } else {
                        cVar.a(eVar2).a(a2, str2);
                    }
                    f.c("controller_create");
                    com.dianping.picassocontroller.vc.b bVar2 = com.dianping.picassocontroller.vc.b.this;
                    Object[] objArr4 = new Object[1];
                    objArr4[0] = jSONObject2 == null ? new JSONObject() : jSONObject2;
                    b.b(bVar2, "injectNativeData", objArr4);
                    if (eVar2.h != null) {
                        f.e("controller_create");
                        i = 1;
                        try {
                            Object[] objArr5 = new Object[1];
                            objArr5[0] = com.dianping.picassocontroller.vc.b.this.a();
                            b.a(cVar.a(eVar2, "isPCExist", objArr5));
                        } catch (Exception e) {
                            e = e;
                            Object[] objArr6 = new Object[i];
                            objArr6[0] = jSONObject;
                            b.a(eVar2, e, objArr6);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    i = 1;
                }
            }
        });
    }

    public static void a(@NonNull final com.dianping.picassocontroller.vc.b bVar, final String str, final Object... objArr) {
        Object[] objArr2 = {bVar, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "e2acf8ecb75e5f3300d382d35fa18767", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "e2acf8ecb75e5f3300d382d35fa18767");
        } else {
            h.a((com.dianping.picassocontroller.vc.e) bVar, new Runnable() { // from class: com.dianping.picassocontroller.jse.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "9c587bda92104a7f0343eeafe8103fb9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "9c587bda92104a7f0343eeafe8103fb9");
                    } else {
                        b.b(com.dianping.picassocontroller.vc.b.this, str, objArr);
                    }
                }
            });
        }
    }

    @WorkerThread
    public static Value b(@NonNull com.dianping.picassocontroller.vc.b bVar, String str, Object... objArr) {
        Object[] objArr2 = {bVar, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "b5a96376968ce656ba1c1ae9809cf886", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "b5a96376968ce656ba1c1ae9809cf886");
        }
        Object[] objArr3 = new Object[objArr.length + 2];
        objArr3[0] = bVar.a();
        objArr3[1] = str;
        if (objArr.length > 0) {
            System.arraycopy(objArr, 0, objArr3, 2, objArr.length);
        }
        return d(bVar, "callPCMethod", objArr3);
    }

    public static void a(@NonNull final com.dianping.picassocontroller.vc.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "445151cb7361c8991098a70c37766b14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "445151cb7361c8991098a70c37766b14");
        } else {
            h.a((com.dianping.picassocontroller.vc.e) bVar, new Runnable() { // from class: com.dianping.picassocontroller.jse.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "778117c2cb64c8997f36714d174cebb7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "778117c2cb64c8997f36714d174cebb7");
                        return;
                    }
                    com.dianping.picassocontroller.monitor.a f = ((com.dianping.picassocontroller.vc.e) com.dianping.picassocontroller.vc.b.this).f();
                    f.b("controller_destroy");
                    b.d(com.dianping.picassocontroller.vc.b.this, "destroyPC", com.dianping.picassocontroller.vc.b.this.a());
                    f.c("controller_destroy");
                }
            });
        }
    }

    public static void a(@NonNull final com.dianping.picassocontroller.vc.b bVar, final String str, final Value value, final String str2) {
        Object[] objArr = {bVar, str, value, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b7178f0ead3ea2b4eab5b2077d22e3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b7178f0ead3ea2b4eab5b2077d22e3e");
        } else {
            h.a((com.dianping.picassocontroller.vc.e) bVar, new Runnable() { // from class: com.dianping.picassocontroller.jse.b.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b526d1a577053e30937cc1ccad633dfc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b526d1a577053e30937cc1ccad633dfc");
                    } else {
                        b.b(com.dianping.picassocontroller.vc.b.this, str, new JSONBuilder().put("status", str2).toJSONObject(), value);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Value d(@NonNull com.dianping.picassocontroller.vc.b bVar, String str, Object... objArr) {
        Value value;
        Object[] objArr2 = {bVar, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "86e48e7d7371c42a903b2c3bd2ae4271", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "86e48e7d7371c42a903b2c3bd2ae4271");
        }
        com.dianping.picassocontroller.vc.e eVar = (com.dianping.picassocontroller.vc.e) bVar;
        com.dianping.picassocontroller.monitor.a f = eVar.f();
        String a2 = f.a(str, objArr);
        com.dianping.picassocontroller.vc.c.b = new WeakReference<>(eVar);
        f.b(a2);
        try {
            try {
                value = eVar.e.a(eVar, str, objArr);
            } catch (Exception e) {
                a(eVar, e, str, objArr);
                value = new Value();
            }
            com.dianping.picassocontroller.vc.c.b.clear();
            return value;
        } finally {
            f.c(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Value b(com.dianping.picassocontroller.vc.b bVar, String str, JSONObject jSONObject, Value value) {
        Value value2;
        Object[] objArr = {bVar, str, jSONObject, value};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bd00324759fc57a71ba96ee944a23c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bd00324759fc57a71ba96ee944a23c7");
        }
        com.dianping.picassocontroller.vc.e eVar = (com.dianping.picassocontroller.vc.e) bVar;
        com.dianping.picassocontroller.monitor.a f = eVar.f();
        String a2 = f.a("callback", str, jSONObject, value);
        f.b(a2);
        try {
            value2 = eVar.e.a(eVar, "callback", eVar.d, str, jSONObject, value);
        } catch (Exception e) {
            a(eVar, e, str, jSONObject, value);
            value2 = new Value();
        }
        f.c(a2);
        return value2;
    }

    public static void a(@NonNull com.dianping.picassocontroller.vc.e eVar, final Exception exc, Object... objArr) {
        int i = 0;
        Object[] objArr2 = {eVar, exc, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "a38a8bdaac3317cc441fb8f28f858c8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "a38a8bdaac3317cc441fb8f28f858c8d");
        } else if (eVar == null) {
        } else {
            final Context b = eVar.b();
            final com.dianping.picassocontroller.monitor.d h = eVar.h();
            JSONObject jSONObject = eVar.j;
            final String str = eVar.i;
            String str2 = eVar.l.b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("intentData", jSONObject);
                JSONArray jSONArray = new JSONArray();
                if (objArr.length > 0) {
                    int length = objArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        Object obj = objArr[i2];
                        if (obj instanceof Object[]) {
                            Object[] objArr3 = (Object[]) obj;
                            int length2 = objArr3.length;
                            while (i < length2) {
                                jSONArray.put(objArr3[i]);
                                i++;
                            }
                        } else {
                            jSONArray.put(obj);
                        }
                        i2++;
                        i = 0;
                    }
                }
                jSONObject2.put("args", jSONArray);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            PicassoUtils.reportException(exc, str2, str, jSONObject2, eVar);
            if (PicassoManager.isDebuggable()) {
                if (g.b.LIVE_LOAD_ON.equals(com.dianping.picassocontroller.debug.g.a().h)) {
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put(KoomDebugger.CRASH, exc.getMessage().replaceAll("\n", ";;"));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    com.dianping.picassocontroller.debug.e.a().a("crashreport", jSONObject3).a(rx.android.schedulers.a.a()).c(new rx.functions.b<String>() { // from class: com.dianping.picassocontroller.jse.b.5
                        public static ChangeQuickRedirect a;

                        @Override // rx.functions.b
                        public final /* synthetic */ void call(String str3) {
                            String str4 = str3;
                            Object[] objArr4 = {str4};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect2, false, "bc02caea521f8a2b906c054058fd375c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect2, false, "bc02caea521f8a2b906c054058fd375c");
                            } else if (TextUtils.isEmpty(str4) || !(b instanceof Activity) || ((Activity) b).isFinishing()) {
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(b, 16974394);
                                StringBuilder sb = new StringBuilder("Error:");
                                sb.append(TextUtils.equals(str, "__for_playground_only__") ? "" : str);
                                builder.setTitle(sb.toString()).setMessage(str4).setPositiveButton("确定", (DialogInterface.OnClickListener) null).show();
                            }
                        }
                    });
                } else if ((b instanceof Activity) && !((Activity) b).isFinishing()) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(eVar.b(), 16974394);
                    StringBuilder sb = new StringBuilder("Error:");
                    sb.append(TextUtils.equals(eVar.i, "__for_playground_only__") ? "" : eVar.i);
                    builder.setTitle(sb.toString()).setMessage(exc.getMessage()).setPositiveButton("确定", (DialogInterface.OnClickListener) null).show();
                }
            }
            if (h != null) {
                h.b(eVar.c, new Runnable() { // from class: com.dianping.picassocontroller.jse.b.6
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect2, false, "fdc7bfda87724f25e546f6a2dfaae305", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect2, false, "fdc7bfda87724f25e546f6a2dfaae305");
                        }
                    }
                });
            }
            if (eVar instanceof com.dianping.picassocontroller.vc.g) {
                com.dianping.picassocontroller.vc.g gVar = (com.dianping.picassocontroller.vc.g) eVar;
                com.dianping.picassocontroller.vc.f fVar = gVar.l;
                if (1 != gVar.w || fVar == null) {
                    return;
                }
                com.dianping.picassocontroller.monitor.h.a(b, fVar.a, fVar.c);
            }
        }
    }
}
