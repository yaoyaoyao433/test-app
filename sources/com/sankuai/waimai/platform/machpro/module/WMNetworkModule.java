package com.sankuai.waimai.platform.machpro.module;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.dianping.titans.utils.NetworkUtil;
import com.hhmedic.android.sdk.base.net.HHNetConfig;
import com.meituan.android.legwork.monitor.report.channel.dao.DaBaiDao;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ad;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.waimai.foundation.core.a;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.machpro.util.b;
import com.sankuai.waimai.platform.net.c;
import com.tencent.open.SocialConstants;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import rx.d;
import rx.functions.g;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMNetworkModule extends MPModule {
    public static final int NETWORK_2G = 2;
    public static final int NETWORK_3G = 3;
    public static final int NETWORK_4G = 4;
    public static final int NETWORK_5G = 5;
    public static final int NETWORK_NONE = -1;
    public static final int NETWORK_UNKNOWN = -2;
    public static final int NETWORK_WIFI = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private static int getNetworkClass(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "926068ccdc9bbb0e6becc04c2ee51a61", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "926068ccdc9bbb0e6becc04c2ee51a61")).intValue();
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return -2;
        }
    }

    public WMNetworkModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d746cfa3bbd27417ffdd705ba66611d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d746cfa3bbd27417ffdd705ba66611d4");
        }
    }

    @JSMethod(methodName = "isProductEnv")
    public boolean isProductEnv() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad672a03df6a615c957178ebcdb38568", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad672a03df6a615c957178ebcdb38568")).booleanValue() : c.a().b();
    }

    @JSMethod(methodName = "waimaiBaseURL")
    public String waimaiBaseURL() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdaaf86aa30daad6e513a2eeb55d04c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdaaf86aa30daad6e513a2eeb55d04c7");
        }
        String e = c.a().e();
        if (a.d()) {
            return e + "/api";
        } else if (a.e()) {
            return e + "/mtapi";
        } else if (a.f()) {
            return e + "/dp";
        } else {
            return e;
        }
    }

    @JSMethod(methodName = "commonParameter")
    public MachMap commonParameter() {
        Map<String, String> commonParameter;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "415a286622f5b61a325ab253612f5ac2", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "415a286622f5b61a325ab253612f5ac2");
        }
        MachMap machMap = new MachMap();
        ICommonParameter iCommonParameter = (ICommonParameter) com.sankuai.waimai.router.a.a(ICommonParameter.class, ICommonParameter.COMMON_PARAMETER_KEY);
        if (iCommonParameter != null && (commonParameter = iCommonParameter.commonParameter()) != null && !commonParameter.isEmpty()) {
            for (Map.Entry<String, String> entry : commonParameter.entrySet()) {
                machMap.put(entry.getKey(), entry.getValue());
            }
        }
        return machMap;
    }

    @JSMethod(methodName = SocialConstants.TYPE_REQUEST)
    public void request(MachMap machMap, MPJSCallBack mPJSCallBack) {
        Object[] objArr = {machMap, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eb03e49851b88fe4e925e2735ccb99b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eb03e49851b88fe4e925e2735ccb99b");
            return;
        }
        try {
            String str = (String) machMap.get("url");
            String upperCase = ((String) machMap.get("method")).toUpperCase();
            MachMap machMap2 = (MachMap) machMap.get("params");
            MachMap machMap3 = (MachMap) machMap.get("data");
            String a = b.a(machMap.get("contentType"), "");
            d<ap> dVar = null;
            HashMap<String, Object> b = machMap2 != null ? b.b(machMap2) : null;
            HashMap<String, Object> b2 = machMap3 != null ? b.b(machMap3) : null;
            HashMap<String, Object> b3 = machMap.get("headers") instanceof MachMap ? b.b((MachMap) machMap.get("headers")) : null;
            String a2 = b.a(machMap.get("dataType"), "");
            if (TextUtils.isEmpty(a2)) {
                a2 = DaBaiDao.JSON_DATA;
            }
            if (DaBaiDao.JSON_DATA.equals(a) && "POST".equals(upperCase)) {
                if (b2 == null) {
                    try {
                        b2 = new HashMap<>();
                    } catch (UnsupportedEncodingException e) {
                        com.sankuai.waimai.machpro.util.a.a("WMNetworkModule-->" + e.getMessage());
                    }
                }
                ICommonParameter iCommonParameter = (ICommonParameter) com.sankuai.waimai.router.a.a(ICommonParameter.class, ICommonParameter.COMMON_PARAMETER_KEY);
                if (iCommonParameter != null) {
                    b2.putAll(iCommonParameter.commonParameter());
                }
                dVar = ((MPRequestApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) MPRequestApi.class)).post(str, al.a(ad.a(HHNetConfig.JSON), com.sankuai.waimai.mach.utils.b.a().toJson(b2).getBytes("UTF-8")), b, b3);
            } else if ("GET".equals(upperCase)) {
                dVar = ((MPRequestApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) MPRequestApi.class)).get(str, b, b3);
            } else if ("POST".equals(upperCase)) {
                dVar = ((MPRequestApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) MPRequestApi.class)).post(str, b, b2, b3);
            } else {
                errorCallBack("Must be get or post method", mPJSCallBack);
                return;
            }
            performRequest(dVar, a2, mPJSCallBack);
        } catch (Exception unused) {
            errorCallBack("Please check data format", mPJSCallBack);
        }
    }

    private void performRequest(d<ap> dVar, final String str, final MPJSCallBack mPJSCallBack) {
        Object[] objArr = {dVar, str, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bddde31ca224ea800ccc7cfcca657591", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bddde31ca224ea800ccc7cfcca657591");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(dVar.d(new g<ap, MachMap>() { // from class: com.sankuai.waimai.platform.machpro.module.WMNetworkModule.2
                public static ChangeQuickRedirect a;

                /* JADX INFO: Access modifiers changed from: private */
                @Override // rx.functions.g
                /* renamed from: a */
                public MachMap call(ap apVar) {
                    Object[] objArr2 = {apVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3d785805fa20835344730e7be5028901", RobustBitConfig.DEFAULT_VALUE)) {
                        return (MachMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3d785805fa20835344730e7be5028901");
                    }
                    String string = apVar != null ? apVar.string() : "";
                    MachMap machMap = new MachMap();
                    machMap.put("error", null);
                    if (DaBaiDao.JSON_DATA.equals(str)) {
                        try {
                            if (string == null) {
                                string = "";
                            }
                            machMap.put("data", b.a(new JSONObject(string)));
                        } catch (Throwable th) {
                            throw rx.exceptions.b.a(th);
                        }
                    } else {
                        machMap.put("data", string);
                    }
                    return machMap;
                }
            }), new j<MachMap>() { // from class: com.sankuai.waimai.platform.machpro.module.WMNetworkModule.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onCompleted() {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    MachMap machMap = (MachMap) obj;
                    Object[] objArr2 = {machMap};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "95a0414b8e5dc1ff1ac759a4dd20fe04", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "95a0414b8e5dc1ff1ac759a4dd20fe04");
                    } else {
                        WMNetworkModule.this.jsCallback(machMap, mPJSCallBack);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2db9ab91c808bebaa2d5f2f6efa256ae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2db9ab91c808bebaa2d5f2f6efa256ae");
                    } else {
                        WMNetworkModule.this.errorCallBack(th.getMessage(), mPJSCallBack);
                    }
                }
            }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void errorCallBack(String str, MPJSCallBack mPJSCallBack) {
        Object[] objArr = {str, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40743cbd229f3a9a6fd324d3c7e6dee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40743cbd229f3a9a6fd324d3c7e6dee2");
            return;
        }
        MachMap machMap = new MachMap();
        machMap.put("code", -1);
        machMap.put("message", str);
        machMap.put("errorCodeTip", "");
        MachMap machMap2 = new MachMap();
        machMap2.put("error", machMap);
        machMap2.put("data", null);
        jsCallback(machMap2, mPJSCallBack);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jsCallback(MachMap machMap, MPJSCallBack mPJSCallBack) {
        Object[] objArr = {machMap, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64b2941ae75a9fc17397f0301677f930", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64b2941ae75a9fc17397f0301677f930");
        } else if (mPJSCallBack != null) {
            mPJSCallBack.invoke(machMap);
        }
    }

    @JSMethod(methodName = "getNetworkType")
    public String getNetworkType() {
        MPContext machContext;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6717a8d10ff51956ead9225703deee07", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6717a8d10ff51956ead9225703deee07");
        }
        String str = "unknown";
        try {
            machContext = getMachContext();
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a(e.getMessage());
        }
        if (machContext == null) {
            return "unknown";
        }
        switch (getNetworkTypeInner(machContext.getContext())) {
            case -1:
                return "none";
            case 0:
                return "wifi";
            case 2:
                return "2g";
            case 3:
                return "3g";
            case 4:
                return "4g";
            case 5:
                str = NetworkUtil.NAME_NETWORK_5G;
                break;
        }
        return str;
    }

    public static int getNetworkTypeInner(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "43d8099dd254d15263d70f26b7156bce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "43d8099dd254d15263d70f26b7156bce")).intValue();
        }
        if (isNetworkConnected(context)) {
            try {
                int type = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo().getType();
                if (type == 1) {
                    return 0;
                }
                if (type == 0) {
                    return getNetworkClass(Privacy.createTelephonyManager(context.getApplicationContext(), "mach_pro").getNetworkType());
                }
                return -2;
            } catch (Throwable th) {
                th.printStackTrace();
                return -2;
            }
        }
        return -1;
    }

    public static boolean isNetworkConnected(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "43392a967ea7fbc3993331273405f516", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "43392a967ea7fbc3993331273405f516")).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
