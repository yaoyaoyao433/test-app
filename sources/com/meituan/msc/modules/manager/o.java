package com.meituan.msc.modules.manager;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o implements d {
    public static ChangeQuickRedirect a;
    @Nullable
    private b b;
    @Nullable
    private b c;

    public o(b bVar, b bVar2) {
        Object[] objArr = {bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c76bf908ca526ef9c5ebef1611704ddf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c76bf908ca526ef9c5ebef1611704ddf");
            return;
        }
        this.b = bVar;
        this.c = bVar2;
    }

    @Override // com.meituan.msc.modules.manager.d
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90f31bc23a22f56c66b3a8a1aeb02e24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90f31bc23a22f56c66b3a8a1aeb02e24");
        } else if (this.b != null) {
            this.b.a(obj);
            this.b = null;
            this.c = null;
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "572e262e206730ada14cceaa95494d50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "572e262e206730ada14cceaa95494d50");
        } else {
            a(str, null, null);
        }
    }

    @Override // com.meituan.msc.modules.manager.d
    public final void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "544b85639f139a4a2e58b1dab11322e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "544b85639f139a4a2e58b1dab11322e5");
        } else {
            a(str, th, null);
        }
    }

    private void a(String str, Throwable th, JSONObject jSONObject) {
        Object[] objArr = {str, th, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e62bc734738e64999678d744886bc55d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e62bc734738e64999678d744886bc55d");
        } else if (this.c == null) {
            this.b = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (str != null) {
                    jSONObject2.put("message", str);
                } else if (th != null) {
                    jSONObject2.put("message", th.getMessage());
                } else {
                    jSONObject2.put("message", "Error not specified.");
                }
                if (th != null) {
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < stackTrace.length && i < 50; i++) {
                        StackTraceElement stackTraceElement = stackTrace[i];
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(CommonConstant.File.CLASS, stackTraceElement.getClassName());
                        jSONObject3.put("file", stackTraceElement.getFileName());
                        jSONObject3.put("lineNumber", stackTraceElement.getLineNumber());
                        jSONObject3.put("methodName", stackTraceElement.getMethodName());
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject2.put("nativeStackAndroid", jSONArray);
                } else {
                    jSONObject2.put("nativeStackAndroid", new JSONArray());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.c.a(jSONObject2);
            this.b = null;
            this.c = null;
        }
    }
}
