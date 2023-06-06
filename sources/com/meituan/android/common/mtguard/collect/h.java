package com.meituan.android.common.mtguard.collect;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Build;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.v3.EglCore;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class h {
    private static String a;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7fca1a2ef379e08dba38d6cf6a3939cb", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7fca1a2ef379e08dba38d6cf6a3939cb");
        }
        if (a == null) {
            a = b();
        }
        return a;
    }

    private static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5df05ee8214b30c18f22c6b211649d22", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5df05ee8214b30c18f22c6b211649d22");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (Build.VERSION.SDK_INT >= 22) {
                new EglCore(null, 2).makeCurrent(EGL14.EGL_NO_SURFACE);
                jSONObject.put("renderer", GLES20.glGetString(7937));
                jSONObject.put("vendor", GLES20.glGetString(7936));
                jSONObject.put("version", GLES20.glGetString(7938));
                return jSONObject.toString();
            }
            return DFPConfigs.API_NOT_SUPPORT;
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
            return DFPConfigs.JAVA_EXCEPTION;
        }
    }

    private static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e4e529ad9301b5afd88dc1d7bbb0d36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e4e529ad9301b5afd88dc1d7bbb0d36");
        } else if (a == null) {
            a = b();
        }
    }
}
