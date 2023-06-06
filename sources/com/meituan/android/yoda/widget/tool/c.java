package com.meituan.android.yoda.widget.tool;

import com.meituan.android.yoda.widget.tool.CameraManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final CameraManager.AnonymousClass2 b;
    private final JSONArray c;
    private final String d;

    private c(CameraManager.AnonymousClass2 anonymousClass2, JSONArray jSONArray, String str) {
        this.b = anonymousClass2;
        this.c = jSONArray;
        this.d = str;
    }

    public static Runnable a(CameraManager.AnonymousClass2 anonymousClass2, JSONArray jSONArray, String str) {
        Object[] objArr = {anonymousClass2, jSONArray, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5535391baaaba9ffc7db51340930a2ec", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5535391baaaba9ffc7db51340930a2ec") : new c(anonymousClass2, jSONArray, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e435a604a122c9589c4786fc83106ece", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e435a604a122c9589c4786fc83106ece");
        } else {
            CameraManager.AnonymousClass2.a(this.b, this.c, this.d);
        }
    }
}
