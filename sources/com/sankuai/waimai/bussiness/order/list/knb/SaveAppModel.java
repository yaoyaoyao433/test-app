package com.sankuai.waimai.bussiness.order.list.knb;

import android.text.TextUtils;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.model.c;
import com.sankuai.waimai.platform.utils.l;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SaveAppModel extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "huOk8gDA2YlKX7AOV33XYwtcmXdIrMMx2LbDuhC9wkOn03sdsZ0j5vDJ2B7yiJsNron7yXTf4F+QHP1MHyhclw==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a5b8520437d87e7381b5a7d7e50c7d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a5b8520437d87e7381b5a7d7e50c7d5");
        } else if (validateArgs()) {
            l.b(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.knb.SaveAppModel.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "097be15940b999e9948d62ae140290b7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "097be15940b999e9948d62ae140290b7");
                        return;
                    }
                    try {
                        c.a().a(SaveAppModel.this.jsBean().argsJson.optInt("appModel"));
                    } catch (Exception unused) {
                    }
                }
            }, "");
        }
    }

    public boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c57a673f593ece53f0db752f553ff6b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c57a673f593ece53f0db752f553ff6b7")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }
}
