package com.dianping.live.knb;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.dianping.live.live.utils.j;
import com.dianping.live.status.b;
import com.dianping.live.status.c;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.dianping.util.exception.a;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.android.mrn.config.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ShowMLiveStatusWidgetJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "TJtO7HcRmDOiHxYqrRb0TqU3RLf8e1+lgVciOxS590j/R4kRAoe7cAqE/P0fZS0kkQFHLWc5FoQ+axxsAXS/wg==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27a39ca9626740998c5b5954dd1040fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27a39ca9626740998c5b5954dd1040fc");
            return;
        }
        try {
            c cVar = new c(jsBean().argsJson);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "2f4b1873b53de12ae8c813e96e6b3d87", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "2f4b1873b53de12ae8c813e96e6b3d87")).booleanValue();
            } else {
                z = (TextUtils.isEmpty(cVar.b) || TextUtils.isEmpty(cVar.c) || TextUtils.isEmpty(cVar.d) || cVar.e == null || cVar.f == null || cVar.f.size() <= 0) ? false : true;
            }
            if (!z) {
                jsCallbackError(-1, "参数非法");
                j.a("MLive_LoganshowMLiveStatusWidget -1 参数非法");
                Sniffer.smell("group_mlive", "mLive_status_widget_picture", "paramCheckFail", "", jsBean().argsJson.toString(), cVar.a());
                return;
            }
            b bVar = b.b;
            Activity activity = jsHost().getActivity();
            b.a aVar = new b.a() { // from class: com.dianping.live.knb.ShowMLiveStatusWidgetJsHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.dianping.live.status.b.a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1a8394d93a9cc248b69fede281a1bc7e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1a8394d93a9cc248b69fede281a1bc7e");
                    } else {
                        ShowMLiveStatusWidgetJsHandler.this.jsCallback();
                    }
                }

                @Override // com.dianping.live.status.b.a
                public final void a(int i, String str) {
                    Object[] objArr3 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "bd294aa0b2505b8079f56e4b7b82cd11", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "bd294aa0b2505b8079f56e4b7b82cd11");
                    } else {
                        ShowMLiveStatusWidgetJsHandler.this.jsCallbackError(i, str);
                    }
                }
            };
            Object[] objArr3 = {activity, cVar, aVar};
            ChangeQuickRedirect changeQuickRedirect4 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect4, false, "51a0b6750ffc03437003812ca71da7c3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect4, false, "51a0b6750ffc03437003812ca71da7c3");
                return;
            }
            bVar.c = cVar;
            bVar.d = aVar;
            bVar.e = activity.getWindow().getDecorView().getWindowToken();
            Uri.Builder buildUpon = Uri.parse("https://mapi.dianping.com/mapi/dzu/live/queryrelatedlive.bin").buildUpon();
            buildUpon.appendQueryParameter("businessfigure", cVar.b);
            buildUpon.appendQueryParameter("pagesource", cVar.d);
            buildUpon.appendQueryParameter("businessid", cVar.c);
            w.a(com.dianping.codelog.b.b()).exec(com.dianping.dataservice.mapi.b.a(buildUpon.toString(), com.dianping.dataservice.mapi.c.DISABLED), bVar);
        } catch (Exception e) {
            e.printStackTrace();
            j.a("DismissMLiveFloatJsHandler exception" + a.a(e));
        }
    }
}
