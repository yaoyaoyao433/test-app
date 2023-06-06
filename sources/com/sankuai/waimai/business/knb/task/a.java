package com.sankuai.waimai.business.knb.task;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.dianping.titans.js.IJSHandlerDelegate;
import com.dianping.titans.js.jshandler.JsHandler;
import com.dianping.titansmodel.apimodel.g;
import com.dianping.titansmodel.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.http.RetrofitFactory;
import com.sankuai.meituan.android.knb.image.BridgeImageRetrofitService;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends AsyncTask<g, Void, i> {
    public static ChangeQuickRedirect a;
    public Context b;
    public final String c;
    public final i d;
    public final JsHandler e;
    public final List<String> f;
    public final IJSHandlerDelegate<i> g;
    private BridgeImageRetrofitService h;

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(i iVar) {
        i iVar2 = iVar;
        Object[] objArr = {iVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76dd2bdf757dfdf534cbf43842e93b51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76dd2bdf757dfdf534cbf43842e93b51");
            return;
        }
        super.onPostExecute(iVar2);
        if (TextUtils.isEmpty(this.d.errorMsg)) {
            this.g.successCallback(this.d);
        } else {
            this.g.failCallback(this.d);
        }
    }

    public a(Context context, String str, List<String> list, JsHandler jsHandler, i iVar, IJSHandlerDelegate<i> iJSHandlerDelegate) {
        Object[] objArr = {context, str, list, jsHandler, iVar, iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2266af238b81bad3ce0ba65000a6251a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2266af238b81bad3ce0ba65000a6251a");
            return;
        }
        this.b = context;
        this.c = str;
        this.f = list;
        this.e = jsHandler;
        this.d = iVar;
        this.g = iJSHandlerDelegate;
        this.h = (BridgeImageRetrofitService) RetrofitFactory.getInstance("http://pic.meituan.com/").a(BridgeImageRetrofitService.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(21:29|30|31|(1:33)(1:103)|34|35|(9:37|(5:91|(1:93)(1:99)|(1:95)(1:98)|96|97)(1:40)|41|42|43|44|45|46|(3:(1:49)|50|51)(15:53|54|55|(12:57|58|59|(1:61)|62|63|64|(1:66)(1:78)|67|(1:69)(1:77)|70|(1:76)(3:(1:73)|74|75))|83|59|(0)|62|63|64|(0)(0)|67|(0)(0)|70|(0)(0)))|100|(0)|91|(0)(0)|(0)(0)|96|97|41|42|43|44|45|46|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0157, code lost:
        r7 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0158, code lost:
        r0 = r20;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f6  */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.dianping.titansmodel.i doInBackground(com.dianping.titansmodel.apimodel.g... r22) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.knb.task.a.doInBackground(com.dianping.titansmodel.apimodel.g[]):com.dianping.titansmodel.i");
    }
}
