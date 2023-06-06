package com.sankuai.android.share.common;

import android.app.Activity;
import android.content.Context;
import com.meituan.android.sdkmanager.SDKInfoManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.ShareActivity;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends SDKInfoManager.a {
    public static ChangeQuickRedirect a;
    private WeakReference<Activity> b;
    private boolean c;

    public a(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e3a0233dcff4b2462d3311cd42110dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e3a0233dcff4b2462d3311cd42110dc");
            return;
        }
        if (context instanceof Activity) {
            this.b = new WeakReference<>((Activity) context);
        }
        this.c = z;
    }

    @Override // com.meituan.android.sdkmanager.SDKInfoManager.a
    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59fc13f43033594b4673562ddffbfa4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59fc13f43033594b4673562ddffbfa4b");
        } else if (this.b != null) {
            Activity activity = this.b.get();
            if (!(activity instanceof ShareActivity) || activity.isFinishing()) {
                return;
            }
            activity.finish();
        }
    }

    @Override // com.meituan.android.sdkmanager.SDKInfoManager.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81e207746055c3b714483e6179862c63", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81e207746055c3b714483e6179862c63")).booleanValue();
        }
        if (this.c) {
            return false;
        }
        return super.a();
    }

    @Override // com.meituan.android.sdkmanager.SDKInfoManager.a
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20a41855af07bf1a147fd44df42c6e64", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20a41855af07bf1a147fd44df42c6e64");
        }
        if (!this.c) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("standard", false);
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
        return super.b();
    }
}
