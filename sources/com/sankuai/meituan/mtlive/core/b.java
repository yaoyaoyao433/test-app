package com.sankuai.meituan.mtlive.core;

import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.bean.HotSwitchHornAppInfo;
import com.sankuai.meituan.mtlive.core.bean.HotSwitchHornEngineInfo;
import com.sankuai.meituan.mtlive.core.bean.HotSwitchHornProjectInfo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b b;
    private List<HotSwitchHornAppInfo> c;
    private String d;
    private String e;

    public static /* synthetic */ void b(b bVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "4f69467643ff5e090c38887cf3dab5e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "4f69467643ff5e090c38887cf3dab5e2");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                bVar.c.clear();
                JSONArray jSONArray = new JSONObject(str).getJSONArray("sdk_hotswitch");
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject != null) {
                            HotSwitchHornAppInfo hotSwitchHornAppInfo = new HotSwitchHornAppInfo();
                            hotSwitchHornAppInfo.setAppID(jSONObject.optString("app_id"));
                            JSONArray optJSONArray = jSONObject.optJSONArray("projects");
                            if (optJSONArray != null) {
                                ArrayList arrayList = new ArrayList();
                                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                    if (jSONObject2 != null) {
                                        HotSwitchHornProjectInfo hotSwitchHornProjectInfo = new HotSwitchHornProjectInfo();
                                        hotSwitchHornProjectInfo.setProjectID(jSONObject2.optString("project_id"));
                                        JSONArray optJSONArray2 = jSONObject2.optJSONArray("project_configs");
                                        if (optJSONArray2 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                                                JSONObject jSONObject3 = optJSONArray2.getJSONObject(i3);
                                                if (jSONObject3 != null) {
                                                    HotSwitchHornEngineInfo hotSwitchHornEngineInfo = new HotSwitchHornEngineInfo();
                                                    hotSwitchHornEngineInfo.setSceneType(jSONObject3.optString("scene_type"));
                                                    hotSwitchHornEngineInfo.setSdkType(jSONObject3.optString("sdk_type"));
                                                    arrayList2.add(hotSwitchHornEngineInfo);
                                                }
                                            }
                                            hotSwitchHornProjectInfo.setProjectEngineList(arrayList2);
                                        }
                                        arrayList.add(hotSwitchHornProjectInfo);
                                    }
                                }
                                hotSwitchHornAppInfo.setAppProjects(arrayList);
                            }
                            bVar.c.add(hotSwitchHornAppInfo);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84078a651ba2f6f69e9441d183461a7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84078a651ba2f6f69e9441d183461a7b");
            return;
        }
        this.d = null;
        this.e = null;
        this.c = new ArrayList();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1aae3ade3141e6d91940bf9c90ec83f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1aae3ade3141e6d91940bf9c90ec83f");
            return;
        }
        if (k.a().b()) {
            Horn.debug(k.a().b, "MTLive_SDK_HotSwitch", k.a().b());
        }
        com.sankuai.meituan.mtliveqos.b.a("MTLive_SDK_HotSwitch", new com.sankuai.meituan.mtliveqos.common.d() { // from class: com.sankuai.meituan.mtlive.core.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtliveqos.common.d
            public final void a(boolean z, String str) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0201549e3798e3c04c0ae8a4afda8173", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0201549e3798e3c04c0ae8a4afda8173");
                    return;
                }
                if (!z || str == null) {
                    str = null;
                }
                if (TextUtils.equals(b.this.d, str)) {
                    return;
                }
                b.this.d = str;
                b.b(b.this, b.this.d);
            }
        });
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2817b6e23c08786abf42e8fb4ddf2451", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2817b6e23c08786abf42e8fb4ddf2451");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public final int a(String str, String str2, String str3, int i) {
        List<HotSwitchHornProjectInfo> appProjects;
        List<HotSwitchHornEngineInfo> projectEngineList;
        Object[] objArr = {str, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2e69a6617b1b028a362fec0efb7b370", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2e69a6617b1b028a362fec0efb7b370")).intValue();
        }
        if (!TextUtils.equals(this.d, this.e)) {
            this.e = this.d;
            com.sankuai.meituan.mtliveqos.a.a(k.a().b, "MTLive_SDK_HotSwitch", this.d);
        }
        if (str != null && str2 != null && str3 != null && this.c != null && this.c.size() > 0) {
            for (HotSwitchHornAppInfo hotSwitchHornAppInfo : this.c) {
                if (hotSwitchHornAppInfo != null && str.equals(hotSwitchHornAppInfo.getAppID()) && (appProjects = hotSwitchHornAppInfo.getAppProjects()) != null && appProjects.size() > 0) {
                    for (HotSwitchHornProjectInfo hotSwitchHornProjectInfo : appProjects) {
                        if (hotSwitchHornProjectInfo != null && str2.equals(hotSwitchHornProjectInfo.getProjectID()) && (projectEngineList = hotSwitchHornProjectInfo.getProjectEngineList()) != null && projectEngineList.size() > 0) {
                            for (HotSwitchHornEngineInfo hotSwitchHornEngineInfo : projectEngineList) {
                                if (str3.equals(hotSwitchHornEngineInfo.getSceneType())) {
                                    try {
                                        return Integer.parseInt(hotSwitchHornEngineInfo.getSdkType());
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            continue;
                        }
                    }
                    continue;
                }
            }
        }
        return i;
    }
}
