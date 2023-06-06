package com.sankuai.meituan.android.knb.multiprocess;

import android.text.TextUtils;
import com.dianping.titans.utils.Constants;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBProcessUtil {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static KNBIPC knbipc = null;
    private static boolean useMultiProcess = false;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface KNBIPC {
        String ipc(String str);
    }

    public static void init(KNBIPC knbipc2) {
        knbipc = knbipc2;
    }

    public static void setUseMultiProcess(boolean z) {
        useMultiProcess = z;
    }

    public static boolean useMultiProcess() {
        return useMultiProcess;
    }

    public static boolean useIPC() {
        return knbipc != null;
    }

    public static String send(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e528bf23e57adf7997324f162d685b1c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e528bf23e57adf7997324f162d685b1c") : (knbipc == null || jSONObject == null || TextUtils.isEmpty(jSONObject.toString())) ? "" : knbipc.ipc(jSONObject.toString());
    }

    public static String receive(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ccfbe9ffd3f58802aa67a8763ff4f417", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ccfbe9ffd3f58802aa67a8763ff4f417");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("type");
            if (jSONObject.has(Constants.MULTI_PROCESS_STORE_KEY)) {
                String optString = jSONObject.optString(Constants.MULTI_PROCESS_STORE_KEY);
                if (optInt != 4) {
                    switch (optInt) {
                        case 0:
                            return StorageUtil.getSharedValue(KNBConfig.getContext(), optString);
                        case 1:
                            StorageUtil.putSharedValue(KNBConfig.getContext(), optString, jSONObject.optString(Constants.MULTI_PROCESS_STORE_VALUE), jSONObject.optInt(Constants.MULTI_PROCESS_STORE_LEVEL));
                            return "";
                        default:
                            return "";
                    }
                }
                StorageUtil.clearShareValue(KNBConfig.getContext(), optString);
                return "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }
}
