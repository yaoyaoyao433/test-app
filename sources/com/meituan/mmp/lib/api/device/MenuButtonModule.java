package com.meituan.mmp.lib.api.device;

import android.graphics.Rect;
import android.support.constraint.R;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.api.d;
import com.meituan.mmp.lib.page.view.CustomNavigationBar;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MenuButtonModule extends ActivityApi {
    public static ChangeQuickRedirect h;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef9c96d22016aa4f6cd039a677023fe9", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef9c96d22016aa4f6cd039a677023fe9") : new String[]{"getMenuButtonBoundingClientRect", "getMenuButtonBoundingClientRectSync"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) throws d {
        int dimension;
        int c;
        int i;
        int a;
        int i2;
        int i3 = 0;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf0bae3714e24e94921c1822c863a1af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf0bae3714e24e94921c1822c863a1af");
        } else if (a().a()) {
            iApiCallback.onSuccess(a(str));
            com.meituan.mmp.lib.trace.b.c("MenuButtonModule", "API " + str + " not supported in widget but ignored");
        } else {
            int a2 = a(jSONObject, -1);
            if (getPageManager().f(a2)) {
                Rect e = getPageManager().e(a2);
                if (e != null) {
                    i3 = e.width();
                    dimension = e.height();
                    c = e.top;
                    i = e.bottom;
                    a = e.left;
                    i2 = e.right;
                } else {
                    iApiCallback.onFail(codeJson(-1, "getMenuRect is null"));
                    return;
                }
            } else {
                dimension = (int) getContext().getResources().getDimension(R.dimen.mmp_capsule_height);
                c = p.c() + ((CustomNavigationBar.getFixedHeight() - dimension) / 2);
                i = c + dimension;
                a = p.a(getContext()) - p.d(15);
                i2 = a;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("width", p.b(i3));
                jSONObject2.put("height", p.b(dimension));
                jSONObject2.put("top", p.b(c));
                jSONObject2.put("bottom", p.b(i));
                jSONObject2.put("left", p.b(a));
                jSONObject2.put("right", p.b(i2));
                iApiCallback.onSuccess(jSONObject2);
            } catch (JSONException e2) {
                e2.printStackTrace();
                iApiCallback.onFail(codeJson(-1, e2.toString()));
            }
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35d2843100abf558e1f6908a4cb755c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35d2843100abf558e1f6908a4cb755c5")).booleanValue();
        }
        if ("getMenuButtonBoundingClientRect".equals(str)) {
            return true;
        }
        return super.c(str);
    }

    @Override // com.meituan.mmp.lib.api.ActivityApi
    public final JSONObject a(String str) throws d {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2642abd2cdcb704b4b4aa7e78a7bd86", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2642abd2cdcb704b4b4aa7e78a7bd86") : new JSONObject();
    }
}
