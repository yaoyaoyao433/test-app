package com.meituan.mmp.lib.msi;

import android.content.Intent;
import android.text.TextUtils;
import com.meituan.mmp.lib.HeraActivity;
import com.meituan.mmp.lib.RouterCenterActivity;
import com.meituan.msi.bean.ApiException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j implements com.meituan.msi.context.i {
    public static ChangeQuickRedirect a;
    private com.meituan.mmp.lib.config.a b;

    public j(com.meituan.mmp.lib.config.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68d54456e71b389318192e593dc06ec1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68d54456e71b389318192e593dc06ec1");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.meituan.msi.context.i
    public final boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02d23a186c2535e092661149334e97e1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02d23a186c2535e092661149334e97e1")).booleanValue() : TextUtils.equals(str, "openLink") && str2.startsWith("weixin://");
    }

    @Override // com.meituan.msi.context.i
    public final Intent a(String str, Intent intent, String str2) throws ApiException {
        Object[] objArr = {str, intent, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bf0fc7dfba12815a6dd24591c0f0f96", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bf0fc7dfba12815a6dd24591c0f0f96");
        }
        if (TextUtils.equals(str, "openLink") && this.b.a() && !TextUtils.isEmpty(str2)) {
            try {
                Class<?> cls = Class.forName(com.sankuai.waimai.platform.utils.f.a(intent, "name"));
                if (HeraActivity.class.isAssignableFrom(cls) || RouterCenterActivity.class.isAssignableFrom(cls)) {
                    intent.putExtra("startFromMinProgram", true);
                    intent.putExtra("srcAppId", this.b.c());
                    intent.putExtra("extraData", new JSONObject().put("extraData", str2).toString());
                }
                return intent;
            } catch (ClassNotFoundException | JSONException unused) {
                throw new ApiException("class not found or JSONException");
            }
        }
        return intent;
    }
}
