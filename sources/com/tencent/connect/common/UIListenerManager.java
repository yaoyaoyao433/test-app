package com.tencent.connect.common;

import android.content.Intent;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.i;
import com.tencent.open.utils.k;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class UIListenerManager {
    private static UIListenerManager a;
    private Map<String, ApiTask> b;

    public static UIListenerManager getInstance() {
        if (a == null) {
            a = new UIListenerManager();
        }
        return a;
    }

    private UIListenerManager() {
        this.b = Collections.synchronizedMap(new HashMap());
        if (this.b == null) {
            this.b = Collections.synchronizedMap(new HashMap());
        }
    }

    public Object setListenerWithRequestcode(int i, IUiListener iUiListener) {
        ApiTask put;
        String a2 = i.a(i);
        if (a2 == null) {
            SLog.e("openSDK_LOG.UIListenerManager", "setListener action is null! rquestCode=" + i);
            return null;
        }
        synchronized (this.b) {
            put = this.b.put(a2, new ApiTask(i, iUiListener));
        }
        if (put == null) {
            return null;
        }
        return put.mListener;
    }

    public Object setListnerWithAction(String str, IUiListener iUiListener) {
        ApiTask put;
        int a2 = i.a(str);
        if (a2 == -1) {
            SLog.e("openSDK_LOG.UIListenerManager", "setListnerWithAction fail, action = " + str);
            return null;
        }
        synchronized (this.b) {
            put = this.b.put(str, new ApiTask(a2, iUiListener));
        }
        if (put == null) {
            return null;
        }
        return put.mListener;
    }

    public IUiListener getListnerWithRequestCode(int i) {
        String a2 = i.a(i);
        if (a2 == null) {
            SLog.e("openSDK_LOG.UIListenerManager", "getListner action is null! rquestCode=" + i);
            return null;
        }
        return getListnerWithAction(a2);
    }

    public IUiListener getListnerWithAction(String str) {
        ApiTask apiTask;
        if (str == null) {
            SLog.e("openSDK_LOG.UIListenerManager", "getListnerWithAction action is null!");
            return null;
        }
        synchronized (this.b) {
            apiTask = this.b.get(str);
            this.b.remove(str);
        }
        if (apiTask == null) {
            return null;
        }
        return apiTask.mListener;
    }

    public void handleDataToListener(Intent intent, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.UIListenerManager", "handleDataToListener");
        if (intent == null) {
            iUiListener.onCancel();
            return;
        }
        String a2 = f.a(intent, Constants.KEY_ACTION);
        if ("action_login".equals(a2)) {
            int a3 = f.a(intent, Constants.KEY_ERROR_CODE, 0);
            if (a3 == 0) {
                String a4 = f.a(intent, Constants.KEY_RESPONSE);
                if (a4 != null) {
                    try {
                        iUiListener.onComplete(k.d(a4));
                        return;
                    } catch (JSONException e) {
                        iUiListener.onError(new UiError(-4, Constants.MSG_JSON_ERROR, a4));
                        SLog.e("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e);
                        return;
                    }
                }
                SLog.d("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
                iUiListener.onComplete(new JSONObject());
                return;
            }
            SLog.e("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + a3);
            iUiListener.onError(new UiError(a3, f.a(intent, Constants.KEY_ERROR_MSG), f.a(intent, Constants.KEY_ERROR_DETAIL)));
        } else if ("action_share".equals(a2)) {
            String a5 = f.a(intent, "result");
            String a6 = f.a(intent, "response");
            if ("cancel".equals(a5)) {
                iUiListener.onCancel();
            } else if ("error".equals(a5)) {
                iUiListener.onError(new UiError(-6, RaptorConstants.ERROR_UNKNOWN_VALUE, a6));
            } else if ("complete".equals(a5)) {
                try {
                    iUiListener.onComplete(new JSONObject(a6 == null ? "{\"ret\": 0}" : a6));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    iUiListener.onError(new UiError(-4, "json error", a6));
                }
            }
        }
    }

    private IUiListener a(int i, IUiListener iUiListener) {
        if (i == 11101) {
            SLog.e("openSDK_LOG.UIListenerManager", "登录的接口回调不能重新构建，暂时无法提供，先记录下来这种情况是否存在");
        } else if (i == 11105) {
            SLog.e("openSDK_LOG.UIListenerManager", "Social Api 的接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
        } else if (i == 11106) {
            SLog.e("openSDK_LOG.UIListenerManager", "Social Api 的H5接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
        }
        return iUiListener;
    }

    public boolean onActivityResult(int i, int i2, Intent intent, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.UIListenerManager", "onActivityResult req=" + i + " res=" + i2);
        IUiListener listnerWithRequestCode = getListnerWithRequestCode(i);
        if (listnerWithRequestCode == null) {
            if (iUiListener != null) {
                listnerWithRequestCode = a(i, iUiListener);
            } else {
                SLog.e("openSDK_LOG.UIListenerManager", "onActivityResult can't find the listener");
                return false;
            }
        }
        if (i2 != -1) {
            listnerWithRequestCode.onCancel();
        } else if (intent == null) {
            listnerWithRequestCode.onError(new UiError(-6, "onActivityResult intent data is null.", "onActivityResult intent data is null."));
            return true;
        } else {
            String a2 = f.a(intent, Constants.KEY_ACTION);
            if ("action_login".equals(a2)) {
                int a3 = f.a(intent, Constants.KEY_ERROR_CODE, 0);
                if (a3 == 0) {
                    String a4 = f.a(intent, Constants.KEY_RESPONSE);
                    if (a4 != null) {
                        try {
                            listnerWithRequestCode.onComplete(k.d(a4));
                        } catch (JSONException e) {
                            listnerWithRequestCode.onError(new UiError(-4, Constants.MSG_JSON_ERROR, a4));
                            SLog.e("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e);
                        }
                    } else {
                        SLog.d("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
                        listnerWithRequestCode.onComplete(new JSONObject());
                    }
                } else {
                    SLog.e("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + a3);
                    listnerWithRequestCode.onError(new UiError(a3, f.a(intent, Constants.KEY_ERROR_MSG), f.a(intent, Constants.KEY_ERROR_DETAIL)));
                }
            } else if ("action_share".equals(a2) || "action_request_avatar".equals(a2) || "action_request_dynamic_avatar".equals(a2) || "action_request_set_emotion".equals(a2) || "guildOpen".equals(a2)) {
                String a5 = f.a(intent, "result");
                String a6 = f.a(intent, "response");
                if ("cancel".equals(a5)) {
                    listnerWithRequestCode.onCancel();
                } else if ("error".equals(a5)) {
                    listnerWithRequestCode.onError(new UiError(-6, RaptorConstants.ERROR_UNKNOWN_VALUE, a6));
                } else if ("complete".equals(a5)) {
                    try {
                        listnerWithRequestCode.onComplete(new JSONObject(a6 == null ? "{\"ret\": 0}" : a6));
                    } catch (JSONException e2) {
                        SLog.e("openSDK_LOG.UIListenerManager", "JSONException", e2);
                        listnerWithRequestCode.onError(new UiError(-4, "json error", a6));
                    }
                }
            } else {
                int a7 = f.a(intent, Constants.KEY_ERROR_CODE, 0);
                if (a7 == 0) {
                    String a8 = f.a(intent, Constants.KEY_RESPONSE);
                    if (a8 != null) {
                        try {
                            listnerWithRequestCode.onComplete(k.d(a8));
                        } catch (JSONException unused) {
                            listnerWithRequestCode.onError(new UiError(-4, Constants.MSG_JSON_ERROR, a8));
                        }
                    } else {
                        listnerWithRequestCode.onComplete(new JSONObject());
                    }
                } else {
                    listnerWithRequestCode.onError(new UiError(a7, f.a(intent, Constants.KEY_ERROR_MSG), f.a(intent, Constants.KEY_ERROR_DETAIL)));
                }
            }
        }
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class ApiTask {
        public IUiListener mListener;
        public int mRequestCode;

        public ApiTask(int i, IUiListener iUiListener) {
            this.mRequestCode = i;
            this.mListener = iUiListener;
        }
    }
}
