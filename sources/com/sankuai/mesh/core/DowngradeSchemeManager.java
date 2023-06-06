package com.sankuai.mesh.core;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mesh.bean.MeshBaseUrl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class DowngradeSchemeManager {
    public static ChangeQuickRedirect a;
    public static List<DowngradeBean> b = new ArrayList();

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class DowngradeMapping implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -4958099291141187732L;
        public HashMap<String, String> convert;
        public String scheme;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class DowngradeScheme implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -3946214106847896033L;
        public List<DowngradeBean> mDowngradeBeans = new ArrayList();
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75c93ec42f9631b2a783fc201a008ae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75c93ec42f9631b2a783fc201a008ae5");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6ef89e4e4b01d119ab77082fef9e16ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6ef89e4e4b01d119ab77082fef9e16ec");
            return;
        }
        HornCallback hornCallback = new HornCallback() { // from class: com.sankuai.mesh.core.DowngradeSchemeManager.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e3f0350f5cd68f93cc34f98695fcde40", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e3f0350f5cd68f93cc34f98695fcde40");
                } else if (z) {
                    DowngradeSchemeManager.b.clear();
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    try {
                        DowngradeScheme downgradeScheme = (DowngradeScheme) com.sankuai.mesh.util.c.a(DowngradeScheme.class, str, "sDowngradeBeans");
                        if (downgradeScheme != null) {
                            DowngradeSchemeManager.b = downgradeScheme.mDowngradeBeans;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        };
        HashMap hashMap = new HashMap();
        hashMap.put(DeviceInfo.OS_NAME, "android");
        Horn.register("mesh", hornCallback, hashMap);
    }

    public static ArrayList<MeshBaseUrl> a(MeshBaseUrl meshBaseUrl) {
        boolean z;
        Object[] objArr = {meshBaseUrl};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd98e04d9e00a51572b65257954c7953", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd98e04d9e00a51572b65257954c7953");
        }
        ArrayList<DowngradeMapping> arrayList = null;
        for (DowngradeBean downgradeBean : b) {
            Object[] objArr2 = {downgradeBean, meshBaseUrl};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cb64716696f9859c5691ff6c6f9bfe0e", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cb64716696f9859c5691ff6c6f9bfe0e")).booleanValue();
            } else {
                if (!downgradeBean.hasParse) {
                    downgradeBean.parseKey();
                }
                z = a(downgradeBean.businessId, meshBaseUrl.getBusinessId()) && a(downgradeBean.service, meshBaseUrl.getService()) && a(downgradeBean.api, meshBaseUrl.getApi()) && a(downgradeBean.targetType, "native");
            }
            if (z) {
                arrayList = downgradeBean.value;
            }
        }
        if (com.sankuai.mesh.util.a.a(arrayList)) {
            return null;
        }
        ArrayList<MeshBaseUrl> arrayList2 = new ArrayList<>();
        Iterator<DowngradeMapping> it = arrayList.iterator();
        while (it.hasNext()) {
            DowngradeMapping next = it.next();
            MeshBaseUrl a2 = com.sankuai.mesh.util.e.a(next.scheme);
            if (a2 == null) {
                return null;
            }
            a2.setUniqueId(meshBaseUrl.getUniqueId());
            HashMap<String, String> hashMap = next.convert;
            JsonObject parameters = meshBaseUrl.getParameters();
            if (parameters != null && hashMap != null) {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    String key = entry.getKey();
                    parameters.add(entry.getValue(), parameters.get(key));
                    parameters.remove(key);
                }
            }
            a2.setParameters(com.sankuai.mesh.util.c.a(a2.getParameters(), meshBaseUrl.getParameters()));
            a2.setBusinessId(meshBaseUrl.getBusinessId());
            arrayList2.add(a2);
        }
        return arrayList2;
    }

    private static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3785a487e4204622c1e5c962c87e5a5a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3785a487e4204622c1e5c962c87e5a5a")).booleanValue();
        }
        if (str == null || str2 == null) {
            return false;
        }
        return "*".equals(str) || str.equals(str2);
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class DowngradeBean implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -4167383338471856294L;
        public String api;
        public String apiAdaptId;
        public String businessId;
        public boolean hasParse;
        public String key;
        public String service;
        public String targetType;
        public ArrayList<DowngradeMapping> value;

        public DowngradeBean() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "659080a4daa889514ede1684ee97774d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "659080a4daa889514ede1684ee97774d");
            } else {
                this.value = new ArrayList<>();
            }
        }

        public void parseKey() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12650a649ba650bd71eb81316e99c631", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12650a649ba650bd71eb81316e99c631");
                return;
            }
            this.hasParse = true;
            if (TextUtils.isEmpty(this.key)) {
                return;
            }
            String[] split = this.key.split("\\.");
            if (split.length == 5) {
                this.businessId = split[0];
                this.service = split[1];
                this.api = split[2];
                this.targetType = split[3];
                this.apiAdaptId = split[4];
            }
        }
    }
}
