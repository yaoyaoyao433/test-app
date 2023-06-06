package com.sankuai.waimai.alita.platform.knbbridge;

import android.support.annotation.Keep;
import android.util.MalformedJsonException;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.utils.c;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class AbstractAlitaJsHandler extends BaseJsHandler {
    public static final String RETURN_DATA = "data";
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void execInner(BaseParamBean baseParamBean);

    public boolean isOpSupported() {
        return false;
    }

    public abstract boolean isParamValid(BaseParamBean baseParamBean);

    public abstract BaseParamBean parseData(JSONObject jSONObject) throws MalformedJsonException;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "495a1a1ee7549d41f1e830276724c113", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "495a1a1ee7549d41f1e830276724c113");
        } else if (!isOpSupported()) {
            jsCallbackError(-190000, "无用类临时下线，该API暂不可用");
        } else {
            try {
                BaseParamBean parseData = parseData(jsBean().argsJson);
                if (isParamValid(parseData)) {
                    execInner(parseData);
                }
            } catch (MalformedJsonException e) {
                c.a("alita-jsbridge", "AbstractAlitaJsHandler MalformedJsonException exception:" + e.getMessage());
                jsCallbackError(-100002, "参数格式不正确");
            } catch (IllegalArgumentException e2) {
                c.a("alita-jsbridge", "AbstractAlitaJsHandler exec IllegalArgumentException exception:" + e2.getMessage());
                jsCallbackError(-100001, "缺少必传参数");
            } catch (Exception e3) {
                c.a("AbstractAlitaJsHandler exec Exception exception :" + e3.getMessage());
                jsCallbackError(-190000, "其他未定义错误类型");
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class BaseParamBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String mBiz;

        public BaseParamBean(String str) {
            this.mBiz = str;
        }
    }
}
