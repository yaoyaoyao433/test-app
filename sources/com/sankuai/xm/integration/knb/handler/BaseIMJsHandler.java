package com.sankuai.xm.integration.knb.handler;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.integration.knb.publish.c;
import com.sankuai.xm.integration.knb.publish.k;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class BaseIMJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long mBeginTime;

    public abstract void innerExe();

    public BaseIMJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4244bbff949937907e6e6b87274b03c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4244bbff949937907e6e6b87274b03c9");
        } else {
            this.mBeginTime = 0L;
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64abd0c9e0447201d33e68d198974592", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64abd0c9e0447201d33e68d198974592");
            return;
        }
        try {
            this.mBeginTime = System.currentTimeMillis();
            String optString = jsBean().argsJson.optString("apiSource", "");
            if (ac.a(optString)) {
                com.sankuai.xm.im.utils.a.d("BaseIMJsHandler::exec error source:" + optString, new Object[0]);
                jsCallbackErrorMsg("apiSource param error");
                return;
            }
            innerExe();
        } catch (Throwable th) {
            com.sankuai.xm.im.utils.a.a(th, "BaseIMJsHandler::exception info: ", new Object[0]);
            jsCallbackErrorMsg("BaseIMJsHandler::exception info: " + th.getMessage());
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void jsCallback(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f55890416117926024bf64f8e0c627fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f55890416117926024bf64f8e0c627fb");
            return;
        }
        if (ac.a(jSONObject.optString("status")) || ac.a(jSONObject.optString("status"), "success")) {
            reportCatSuccess();
        } else {
            int optInt = jSONObject.optInt("errorCode", -1);
            String optString = jSONObject.optString("errMsg", "");
            reportFail(optInt, optString);
            com.sankuai.xm.im.utils.a.d("jsCallbackError::code=%d,error=%s,method=%s", Integer.valueOf(optInt), optString, jsBean().url);
        }
        super.jsCallback(jSONObject);
    }

    public void reportCatSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbbafd0fffad4cbd9057deeec93d6a71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbbafd0fffad4cbd9057deeec93d6a71");
        } else {
            com.sankuai.xm.integration.knb.utils.a.a(getMethod(), 0, System.currentTimeMillis() - this.mBeginTime);
        }
    }

    public void reportSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "412f9396d4a75f4f10419851b4673597", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "412f9396d4a75f4f10419851b4673597");
        } else {
            com.sankuai.xm.integration.knb.utils.a.a(getApiSource(), getMethod(), 0, System.currentTimeMillis() - this.mBeginTime, 0, "");
        }
    }

    public void reportFail(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47fdbb32f0be9a17ce139c41624faf33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47fdbb32f0be9a17ce139c41624faf33");
            return;
        }
        com.sankuai.xm.integration.knb.utils.a.a(getApiSource(), getMethod(), 10100, System.currentTimeMillis() - this.mBeginTime, i, str);
        com.sankuai.xm.integration.knb.utils.a.a(getMethod(), i, System.currentTimeMillis() - this.mBeginTime);
    }

    public String TAG() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b91d3ca6d81683ba15688bb37b8fc97", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b91d3ca6d81683ba15688bb37b8fc97") : getClass().getSimpleName();
    }

    public String getMethod() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a70c42f79c75f80548a3e7b2b83be52", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a70c42f79c75f80548a3e7b2b83be52") : jsBean().method;
    }

    public short getChannel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56702cd5889b9a96c92076e853f39e75", 6917529027641081856L) ? ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56702cd5889b9a96c92076e853f39e75")).shortValue() : (short) jsBean().argsJson.optInt(RemoteMessageConst.Notification.CHANNEL_ID, -1);
    }

    public String getApiSource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d913965e6e28c88049c0a322e16ee40c", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d913965e6e28c88049c0a322e16ee40c") : jsBean().argsJson.optString("apiSource", "");
    }

    public <T> T createCallback(Class<T> cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddab72bd1478ae41cce29f00e26d6b6d", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddab72bd1478ae41cce29f00e26d6b6d");
        }
        try {
            return (T) Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, new a(this, str, cls));
        } catch (Throwable th) {
            com.sankuai.xm.im.utils.a.a(th, "CallbackProxy::createCallback exception info: ", new Object[0]);
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a implements InvocationHandler {
        public static ChangeQuickRedirect a;
        private BaseIMJsHandler b;
        private String c;
        private Class d;

        public a(BaseIMJsHandler baseIMJsHandler, String str, Class cls) {
            Object[] objArr = {baseIMJsHandler, str, cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11de73fe48fbb196aa84ae9b9f67059c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11de73fe48fbb196aa84ae9b9f67059c");
                return;
            }
            this.b = baseIMJsHandler;
            this.c = str;
            this.d = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object[] objArr2 = {obj, method, objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "a54c25d25b6a48f815e4c12039af2e65", 6917529027641081856L)) {
                return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "a54c25d25b6a48f815e4c12039af2e65");
            }
            Object obj2 = null;
            Set<c> a2 = k.a.a.a(this.c);
            if (!b.a(a2)) {
                for (c cVar : a2) {
                    if (this.d != null && this.d.isInstance(cVar)) {
                        obj2 = method.invoke(cVar, objArr);
                    }
                }
            }
            return obj2;
        }
    }
}
