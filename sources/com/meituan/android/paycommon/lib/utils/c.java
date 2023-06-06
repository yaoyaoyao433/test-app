package com.meituan.android.paycommon.lib.utils;

import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements HornCallback {
    public static ChangeQuickRedirect a;
    private final HornCallback b;
    private final String c;

    private c(HornCallback hornCallback, String str) {
        this.b = hornCallback;
        this.c = str;
    }

    public static HornCallback a(HornCallback hornCallback, String str) {
        Object[] objArr = {hornCallback, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e86faa7dc90e3433b50d4eac88bc2784", RobustBitConfig.DEFAULT_VALUE) ? (HornCallback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e86faa7dc90e3433b50d4eac88bc2784") : new c(hornCallback, str);
    }

    @Override // com.meituan.android.common.horn.HornCallback
    public final void onChanged(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f3d547a904b00ebc9d89420b5feb94a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f3d547a904b00ebc9d89420b5feb94a");
            return;
        }
        HornCallback hornCallback = this.b;
        String str2 = this.c;
        Object[] objArr2 = {hornCallback, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bb6ed74e1d86b8391a4a951c76d45be5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bb6ed74e1d86b8391a4a951c76d45be5");
        } else if (z) {
            try {
                if (TextUtils.isEmpty(str) || new JSONObject(str).length() == 0 || hornCallback == null) {
                    return;
                }
                hornCallback.onChanged(z, str);
            } catch (Exception e) {
                a.c cVar = new a.c();
                com.meituan.android.paybase.utils.v.a("b_an74lgy8", cVar.a(KnbConstants.PARAMS_SCENE, "CommonHornServiceUtil_callback_" + str2).a("message", e.getMessage()).b);
            }
        }
    }
}
