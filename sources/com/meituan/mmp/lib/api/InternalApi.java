package com.meituan.mmp.lib.api;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class InternalApi extends AbsApi {
    public static ChangeQuickRedirect b;
    public static final Handler c = new Handler(Looper.getMainLooper());
    private com.meituan.mmp.lib.trace.h a;
    public com.meituan.mmp.lib.interfaces.c d;
    protected com.meituan.mmp.lib.devtools.g e;
    @Nullable
    protected com.meituan.mmp.lib.a f;
    @Nullable
    protected Activity g;

    public String[] a(String str, JSONObject jSONObject) {
        return null;
    }

    public abstract String[] b();

    public boolean d() {
        return false;
    }

    public InternalApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5eaa78285fc4b6e490edbf669965b44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5eaa78285fc4b6e490edbf669965b44");
        } else {
            this.a = null;
        }
    }

    public String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2bb8404ed48f5f95604b773715cd0c5", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2bb8404ed48f5f95604b773715cd0c5") : b();
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9022b2251d4c968389de549edec08985", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9022b2251d4c968389de549edec08985")).booleanValue() : str.endsWith("Sync");
    }

    public boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a623640708a341f7d54da8ff8b977241", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a623640708a341f7d54da8ff8b977241")).booleanValue() : b(str);
    }

    public final void a(@Nullable com.meituan.mmp.lib.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c8ab5014fbca00df9377ef05347f207", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c8ab5014fbca00df9377ef05347f207");
            return;
        }
        this.f = aVar;
        this.g = aVar != null ? aVar.f : null;
    }

    public final void a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e57718849928e77bcf25409c3e8a4c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e57718849928e77bcf25409c3e8a4c6");
        } else {
            this.d.a(str, str2, i);
        }
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97310b4fe2d793f41f98cd465afee593", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97310b4fe2d793f41f98cd465afee593") : getAppConfig().c(getContext());
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    @NonNull
    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95a8f88c55cf2ef0db7228e1cfb9052b", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95a8f88c55cf2ef0db7228e1cfb9052b") : MMPEnvHelper.getContext();
    }

    public static final int a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31c07483194e805955ed5235958c1356", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31c07483194e805955ed5235958c1356")).intValue();
        }
        if (jSONObject != null) {
            return jSONObject.optInt("__mmp__viewId", -1);
        }
        return -1;
    }

    public final int a(JSONObject jSONObject, int i) {
        Object[] objArr = {jSONObject, -1};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7bd022ed6090c34a4822ebcd5b7fc60", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7bd022ed6090c34a4822ebcd5b7fc60")).intValue() : jSONObject.optInt("__mmp__viewId", -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meituan.mmp.lib.trace.h a(int r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.mmp.lib.api.InternalApi.b
            java.lang.String r10 = "0d198e1adf7cafd102471656ece024fe"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            com.meituan.mmp.lib.trace.h r12 = (com.meituan.mmp.lib.trace.h) r12
            return r12
        L22:
            r0 = -1
            r1 = 0
            if (r12 == r0) goto L39
            com.meituan.mmp.lib.page.e r0 = r11.getPageByPageId(r12)
            if (r0 == 0) goto L31
            com.meituan.mmp.lib.engine.AppPage r12 = r0.a(r12)
            goto L32
        L31:
            r12 = r1
        L32:
            if (r12 == 0) goto L39
            com.meituan.mmp.lib.trace.h r12 = r12.r()
            goto L3a
        L39:
            r12 = r1
        L3a:
            if (r12 == 0) goto L3d
            return r12
        L3d:
            com.meituan.mmp.lib.config.a r12 = r11.getAppConfig()
            if (r12 == 0) goto L4a
            com.meituan.mmp.lib.config.a r12 = r11.getAppConfig()
            com.meituan.mmp.lib.trace.h r12 = r12.h
            return r12
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.InternalApi.a(int):com.meituan.mmp.lib.trace.h");
    }
}
