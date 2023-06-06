package com.meituan.android.common.statistics.session;

import android.content.Context;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.StatisticsDelegate;
import com.meituan.android.common.statistics.channel.DefaultEnvironment;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SessionBeanManager {
    public static final int SHOULD_SESSION_UPDATE_CHANGE = 1;
    public static final int SHOULD_SESSION_UPDATE_NONE = 0;
    public static final int SHOULD_SESSION_UPDATE_TIMEOUT = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static SessionBean mCachedSessionBean = new SessionBean();

    public static int shouldSessionUpdate(SessionBean sessionBean) {
        DefaultEnvironment defaultEnvironment;
        Object[] objArr = {sessionBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e369cdbc604f2dd4b358def13daa5c8f", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e369cdbc604f2dd4b358def13daa5c8f")).intValue();
        }
        if (sessionBean == null || (defaultEnvironment = StatisticsDelegate.getInstance().getDefaultEnvironment()) == null || defaultEnvironment.getEnvironment() == null) {
            return 0;
        }
        if (SessionManager.hasMSID() && SessionManager.isSessionValid()) {
            return ((AppUtil.isEmpty(sessionBean.lch) || sessionBean.lch.equals(mCachedSessionBean.lch)) && (AppUtil.isEmpty(sessionBean.pushid) || "0".equals(sessionBean.pushid) || sessionBean.pushid.equals(mCachedSessionBean.pushid)) && (AppUtil.isEmpty(sessionBean.utmSource) || sessionBean.utmSource.equals(mCachedSessionBean.utmSource))) ? 0 : 1;
        }
        LogUtil.log("test", "shouldSessionUpdate SessionId" + SessionManager.getSession());
        return 2;
    }

    public static boolean filterUtmChanged(SessionBean sessionBean) {
        DefaultEnvironment defaultEnvironment;
        Object[] objArr = {sessionBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b55b0db891fabbd8e0bca138ed4e592d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b55b0db891fabbd8e0bca138ed4e592d")).booleanValue();
        }
        if (sessionBean == null || (defaultEnvironment = StatisticsDelegate.getInstance().getDefaultEnvironment()) == null || defaultEnvironment.getEnvironment() == null) {
            return false;
        }
        return ((AppUtil.isEmpty(sessionBean.lch) || sessionBean.lch.equals(mCachedSessionBean.lch)) && (AppUtil.isEmpty(sessionBean.pushid) || "0".equals(sessionBean.pushid) || sessionBean.pushid.equals(mCachedSessionBean.pushid))) ? false : true;
    }

    public static synchronized void setCurrentSessionBean(SessionBean sessionBean) {
        synchronized (SessionBeanManager.class) {
            Object[] objArr = {sessionBean};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "341551ef9d3c6c21ba69c86fc3425216", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "341551ef9d3c6c21ba69c86fc3425216");
            } else if (sessionBean == null) {
            } else {
                DefaultEnvironment defaultEnvironment = StatisticsDelegate.getInstance().getDefaultEnvironment();
                if (defaultEnvironment == null) {
                    return;
                }
                Map<String, String> environment = defaultEnvironment.getEnvironment();
                if (environment == null) {
                    return;
                }
                if (!AppUtil.isEmpty(sessionBean.lch)) {
                    environment.put("lch", sessionBean.lch);
                }
                if (!AppUtil.isEmpty(sessionBean.pushid) && !"0".equals(sessionBean.pushid)) {
                    environment.put(Constants.Environment.KEY_PUSHID, sessionBean.pushid);
                    environment.put("lch", "push");
                }
                if (!AppUtil.isEmpty(sessionBean.pushExt)) {
                    environment.put(Constants.Environment.KEY_PUSH_EXT, sessionBean.pushExt);
                }
                if (!AppUtil.isEmpty(sessionBean.utmSource) || !AppUtil.isEmpty(sessionBean.utmMedium) || !AppUtil.isEmpty(sessionBean.utmTerm) || !AppUtil.isEmpty(sessionBean.utmContent) || !AppUtil.isEmpty(sessionBean.utmCampaign)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (!AppUtil.isEmpty(sessionBean.utmSource)) {
                            jSONObject.put("utm_source", sessionBean.utmSource);
                        }
                        if (!AppUtil.isEmpty(sessionBean.utmMedium)) {
                            jSONObject.put("utm_medium", sessionBean.utmMedium);
                        }
                        if (!AppUtil.isEmpty(sessionBean.utmTerm)) {
                            jSONObject.put("utm_term", sessionBean.utmTerm);
                        }
                        if (!AppUtil.isEmpty(sessionBean.utmContent)) {
                            jSONObject.put("utm_content", sessionBean.utmContent);
                        }
                        if (!AppUtil.isEmpty(sessionBean.utmCampaign)) {
                            jSONObject.put("utm_campaign", sessionBean.utmCampaign);
                        }
                        environment.put(Constants.Environment.KEY_UTM, jSONObject.toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if (!AppUtil.isEmpty(sessionBean.tn)) {
                    environment.put(Constants.Environment.KEY_TN, sessionBean.tn);
                }
                if (!AppUtil.isEmpty(sessionBean.tc)) {
                    environment.put(Constants.Environment.KEY_TC, sessionBean.tc);
                }
                if (!AppUtil.isEmpty(sessionBean.slxcuid)) {
                    environment.put(Constants.Environment.KEY_SLXCUID, sessionBean.slxcuid);
                }
                if (!AppUtil.isEmpty(sessionBean.oauid)) {
                    environment.put("oauid", sessionBean.oauid);
                }
                if (!AppUtil.isEmpty(sessionBean.sunionId)) {
                    environment.put(Constants.Environment.KEY_SUNION_ID, sessionBean.sunionId);
                }
                if (!AppUtil.isEmpty(sessionBean.lch)) {
                    mCachedSessionBean.lch = sessionBean.lch;
                }
                if (!AppUtil.isEmpty(sessionBean.pushid) && !"0".equals(sessionBean.pushid)) {
                    mCachedSessionBean.pushid = sessionBean.pushid;
                }
                if (!AppUtil.isEmpty(sessionBean.utmSource)) {
                    mCachedSessionBean.utmSource = sessionBean.utmSource;
                }
            }
        }
    }

    public static synchronized void resetCurrentSessionBean(Context context) {
        synchronized (SessionBeanManager.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "259f88519a507346f22de35e8de82714", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "259f88519a507346f22de35e8de82714");
                return;
            }
            DefaultEnvironment defaultEnvironment = StatisticsDelegate.getInstance().getDefaultEnvironment();
            if (defaultEnvironment == null) {
                return;
            }
            Map<String, String> environment = defaultEnvironment.getEnvironment();
            if (environment == null) {
                return;
            }
            environment.put("lch", AppUtil.getApplicationName(context));
            environment.put(Constants.Environment.KEY_PUSHID, "0");
            if (environment.containsKey(Constants.Environment.KEY_PUSH_EXT)) {
                environment.remove(Constants.Environment.KEY_PUSH_EXT);
            }
            if (environment.containsKey(Constants.Environment.KEY_UTM)) {
                environment.remove(Constants.Environment.KEY_UTM);
            }
            if (environment.containsKey(Constants.Environment.KEY_TC)) {
                environment.remove(Constants.Environment.KEY_TC);
            }
            if (environment.containsKey(Constants.Environment.KEY_TN)) {
                environment.remove(Constants.Environment.KEY_TN);
            }
            if (environment.containsKey("oauid")) {
                environment.remove("oauid");
            }
            if (environment.containsKey(Constants.Environment.KEY_SUNION_ID)) {
                environment.remove(Constants.Environment.KEY_SUNION_ID);
            }
            if (environment.containsKey(Constants.Environment.KEY_SLXCUID)) {
                environment.remove(Constants.Environment.KEY_SLXCUID);
            }
            mCachedSessionBean.lch = AppUtil.getApplicationName(context);
            mCachedSessionBean.pushid = "0";
            mCachedSessionBean.utmSource = "";
        }
    }
}
