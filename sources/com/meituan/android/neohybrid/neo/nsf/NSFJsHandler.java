package com.meituan.android.neohybrid.neo.nsf;

import com.meituan.android.neohybrid.base.jshandler.NeoBaseJsHandler;
import com.meituan.android.neohybrid.neo.nsf.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NSFJsHandler extends NeoBaseJsHandler<NSFBean> implements c.a {
    public static final String NAME = "neohybrid.hybridFetch";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isFetched;

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler
    public String getName() {
        return NAME;
    }

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoFormatDataJsHandler
    public void onExecute(String str, NSFBean nSFBean) {
        Object[] objArr = {str, nSFBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de949b206847d81db6a4054622b1478f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de949b206847d81db6a4054622b1478f");
        } else if (nSFBean == null) {
            formatJsCallbackDataError();
        } else {
            if (getNeoCompat() == null) {
                formatJsCallbackError(2000, "NeoCompat为null");
            }
            if (a.a(getNeoCompat(), nSFBean.getKey(), this)) {
                return;
            }
            formatJsCallbackError(2000, "数据获取失败");
        }
    }

    @Override // com.meituan.android.neohybrid.neo.nsf.c.a
    public void onCallbackSucc(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61cffa64b140a103003e14d1126ed42e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61cffa64b140a103003e14d1126ed42e");
        } else if (this.isFetched) {
        } else {
            this.isFetched = true;
            formatJsCallbackSucc(jSONObject);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.nsf.c.a
    public void onCallbackFail(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "baa70eb41df2a65d1cb33dade3b58c96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "baa70eb41df2a65d1cb33dade3b58c96");
        } else if (this.isFetched) {
        } else {
            this.isFetched = true;
            formatJsCallbackError(i, str);
        }
    }
}
