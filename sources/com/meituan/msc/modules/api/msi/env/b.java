package com.meituan.msc.modules.api.msi.env;

import android.content.Intent;
import android.text.TextUtils;
import com.meituan.msc.modules.container.MSCActivity;
import com.meituan.msc.modules.engine.h;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.context.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements i {
    public static ChangeQuickRedirect a;
    private h b;

    @Override // com.meituan.msi.context.i
    public final boolean a(String str, String str2) {
        return true;
    }

    public b(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60b6aa17eed048d401b47c6455779782", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60b6aa17eed048d401b47c6455779782");
        } else {
            this.b = hVar;
        }
    }

    @Override // com.meituan.msi.context.i
    public final Intent a(String str, Intent intent, String str2) throws ApiException {
        Object[] objArr = {str, intent, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fef11a4f2acafa7515ecfa7ed417db6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fef11a4f2acafa7515ecfa7ed417db6");
        }
        if (TextUtils.equals(str, "openLink") && this.b.r.i() && !TextUtils.isEmpty(str2)) {
            try {
                if (MSCActivity.class.isAssignableFrom(Class.forName(f.a(intent, "name")))) {
                    intent.putExtra("startFromMinProgram", true);
                    intent.putExtra("srcAppId", this.b.a());
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
