package com.meituan.banma.jarvis;

import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.banma.jarvis.api.JarvisApiService;
import com.meituan.banma.jarvis.api.a;
import com.meituan.banma.jarvis.bean.JarvisDataBean;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.meituan.retrofit2.raw.a;
import java.io.File;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final Gson b = new Gson();
    private static final Type c = new TypeToken<Map<String, Object>>() { // from class: com.meituan.banma.jarvis.b.1
    }.getType();
    private static String d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(String str);

        void b(String str);
    }

    public static Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b3e8640ed39d359aa1c2da2aafa9d85", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b3e8640ed39d359aa1c2da2aafa9d85");
        }
        String b2 = b();
        if (!TextUtils.isEmpty(b2)) {
            try {
                return (Map) b.fromJson(com.meituan.banma.jarvis.utils.d.a(b2, "configData"), c);
            } catch (Exception e) {
                com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "updateCache error:" + Log.getStackTraceString(e));
            }
        }
        return null;
    }

    public static void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b25ece785e7b0de659ac0b63f62132d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b25ece785e7b0de659ac0b63f62132d");
            return;
        }
        com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "dealNetworkData start...");
        if (TextUtils.isEmpty(str)) {
            com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "netData is null ???");
        } else if (z) {
            com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "forceUpdate,update netData:\n" + str);
            a(str);
        } else {
            String b2 = b();
            if (TextUtils.isEmpty(b2)) {
                com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "no cacheData,update netData:\n" + str);
                a(str);
                return;
            }
            try {
                JarvisDataBean jarvisDataBean = (JarvisDataBean) b.fromJson(b2, (Class<Object>) JarvisDataBean.class);
                JarvisDataBean jarvisDataBean2 = (JarvisDataBean) b.fromJson(str, (Class<Object>) JarvisDataBean.class);
                if (jarvisDataBean2.version <= jarvisDataBean.version) {
                    com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "netVersion is not higher than cacheVersion,skip update");
                    return;
                }
                jarvisDataBean.version = jarvisDataBean2.version;
                jarvisDataBean.keyVersion = jarvisDataBean2.keyVersion;
                if (jarvisDataBean2.configData != null) {
                    if (jarvisDataBean.configData != null) {
                        jarvisDataBean.configData.putAll(jarvisDataBean2.configData);
                    } else {
                        jarvisDataBean.configData = jarvisDataBean2.configData;
                    }
                    Iterator<Map.Entry<String, Object>> it = jarvisDataBean.configData.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Object> next = it.next();
                        if (next != null) {
                            try {
                                if (!jarvisDataBean.keyVersion.containsKey(next.getKey())) {
                                    it.remove();
                                }
                            } catch (Exception e) {
                                com.meituan.banma.jarvis.utils.c.a("banma_jarvis", Log.getStackTraceString(e));
                            }
                        }
                    }
                    String json = b.toJson(jarvisDataBean);
                    com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "update new cache:\n" + json);
                    a(json);
                    return;
                }
                com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "netBean.configData is null ???");
            } catch (Exception e2) {
                com.meituan.banma.jarvis.utils.c.a("banma_jarvis", Log.getStackTraceString(e2));
            }
        }
    }

    private static synchronized void a(String str) {
        synchronized (b.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96d3efb18d57df1b1b2f6f0576b95913", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96d3efb18d57df1b1b2f6f0576b95913");
                return;
            }
            d = str;
            b(str);
            com.meituan.banma.jarvis.a aVar = c.a().b;
            if (aVar != null) {
                try {
                    aVar.a((Map) b.fromJson(com.meituan.banma.jarvis.utils.d.a(str, "configData"), c));
                } catch (Exception e) {
                    com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "onConfigChanged callback error:" + Log.getStackTraceString(e));
                }
            }
        }
    }

    private static Map<String, Object> a(boolean z) {
        int i;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        Map<String, Object> map = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ecb6c082e16868022f4dcec0dc0095b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ecb6c082e16868022f4dcec0dc0095b4");
        }
        HashMap hashMap = new HashMap();
        com.meituan.banma.jarvis.env.c a2 = com.meituan.banma.jarvis.env.c.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.banma.jarvis.env.c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "95e0555b043f58ea250fa7587f5345d1", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "95e0555b043f58ea250fa7587f5345d1")).intValue();
        } else {
            i = a2.b != null ? 100 : -1;
        }
        hashMap.put("accessId", Integer.valueOf(i));
        try {
            com.meituan.banma.jarvis.env.c a3 = com.meituan.banma.jarvis.env.c.a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.banma.jarvis.env.c.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "c9db5b2929e533472a22fe2d8efb6ba3", RobustBitConfig.DEFAULT_VALUE)) {
                map = (Map) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "c9db5b2929e533472a22fe2d8efb6ba3");
            } else if (a3.b != null) {
                map = a3.b.a();
            }
            hashMap.put("param", new JSONObject(map).toString());
        } catch (Exception e) {
            hashMap.put("param", "{}");
            com.meituan.banma.jarvis.utils.c.a("banma_jarvis", e);
        }
        try {
            if (z) {
                hashMap.put("keyVersion", "{}");
            } else {
                String b2 = b();
                if (!TextUtils.isEmpty(b2)) {
                    String a4 = com.meituan.banma.jarvis.utils.d.a(b2, "keyVersion");
                    if (!TextUtils.isEmpty(a4)) {
                        hashMap.put("keyVersion", a4);
                    } else {
                        hashMap.put("keyVersion", "{}");
                    }
                } else {
                    hashMap.put("keyVersion", "{}");
                }
            }
        } catch (Exception e2) {
            hashMap.put("keyVersion", "{}");
            com.meituan.banma.jarvis.utils.c.a("banma_jarvis", e2);
        }
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(final a aVar, boolean z) {
        String str;
        JarvisApiService jarvisApiService;
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1da04c703a89544adbcd74336d37eeb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1da04c703a89544adbcd74336d37eeb8");
            return;
        }
        try {
            com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "loadFromNetwork start ==>> ");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.banma.jarvis.api.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1af503e473f1c91dd352e7b4dc621971", RobustBitConfig.DEFAULT_VALUE)) {
                jarvisApiService = (JarvisApiService) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1af503e473f1c91dd352e7b4dc621971");
            } else {
                a.InterfaceC0637a interfaceC0637a = com.meituan.banma.jarvis.env.c.a().e;
                ar.a aVar2 = new ar.a();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.banma.jarvis.api.a.a;
                if (!PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "30ac20733633288ab10ca629ff61e3b1", RobustBitConfig.DEFAULT_VALUE)) {
                    switch (a.AnonymousClass1.a[com.meituan.banma.jarvis.env.c.a().d.ordinal()]) {
                        case 1:
                            str = "https://shuttleconfigapi.peisong.meituan.com";
                            break;
                        case 2:
                            str = "http://shuttleconfigapi.banma.st.sankuai.com";
                            break;
                        case 3:
                            str = "http://shuttleconfigapi.banma.test.sankuai.com";
                            break;
                        case 4:
                            str = "http://shuttleconfigapi.banma.dev.sankuai.com";
                            break;
                        default:
                            str = "https://shuttleconfigapi.peisong.meituan.com";
                            break;
                    }
                } else {
                    str = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "30ac20733633288ab10ca629ff61e3b1");
                }
                ar.a a2 = aVar2.a(str);
                if (interfaceC0637a == null) {
                    interfaceC0637a = com.sankuai.meituan.retrofit2.callfactory.urlconnection.a.a();
                }
                jarvisApiService = (JarvisApiService) a2.a(interfaceC0637a).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a().a(JarvisApiService.class);
            }
            Map<String, Object> a3 = a(z);
            com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "http request params:\n" + b.toJson(a3));
            jarvisApiService.loadJarvisConfig(a3).a(new f<ap>() { // from class: com.meituan.banma.jarvis.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<ap> call, Response<ap> response) {
                    Object[] objArr4 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0bec6864faf004a36356ed6bf5a8e0ff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0bec6864faf004a36356ed6bf5a8e0ff");
                        return;
                    }
                    try {
                        int b2 = response.b();
                        ap e = response.e();
                        String string = e == null ? "" : e.string();
                        if (b2 != 200 || TextUtils.isEmpty(string)) {
                            if (a.this != null) {
                                a aVar3 = a.this;
                                aVar3.b("http code error:" + b2 + CommonConstant.Symbol.COMMA + response.c());
                                return;
                            }
                            return;
                        }
                        Object[] objArr5 = {string, "code", -1};
                        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.banma.jarvis.utils.d.a;
                        int intValue = PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "74ae7641989e370d993aefe1e6119794", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "74ae7641989e370d993aefe1e6119794")).intValue() : ((Integer) com.meituan.banma.jarvis.utils.d.a(string, "code", -1, (byte) 1)).intValue();
                        if (intValue == 0) {
                            String a4 = com.meituan.banma.jarvis.utils.d.a(string, "data", null);
                            com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "http response data:\n" + a4);
                            if (a.this != null) {
                                a.this.a(a4);
                            }
                        } else if (a.this != null) {
                            a aVar4 = a.this;
                            aVar4.b("http ret code error:" + intValue + CommonConstant.Symbol.COMMA + com.meituan.banma.jarvis.utils.d.a(string, "msg"));
                        }
                    } catch (Exception e2) {
                        com.meituan.banma.jarvis.utils.c.a("banma_jarvis", Log.getStackTraceString(e2));
                        if (a.this != null) {
                            a aVar5 = a.this;
                            aVar5.b("http response data style error:" + Log.getStackTraceString(e2));
                        }
                    }
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<ap> call, Throwable th) {
                    Object[] objArr4 = {call, th};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bac38262468cd5eac7fdc1944767e4c5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bac38262468cd5eac7fdc1944767e4c5");
                        return;
                    }
                    com.meituan.banma.jarvis.utils.c.b("banma_jarvis", call.e().b(), Log.getStackTraceString(th));
                    if (a.this != null) {
                        a aVar3 = a.this;
                        aVar3.b("http response failed:" + Log.getStackTraceString(th));
                    }
                }
            });
        } catch (Exception e) {
            com.meituan.banma.jarvis.utils.c.a("banma_jarvis", Log.getStackTraceString(e));
            aVar.b("http request failed:" + Log.getStackTraceString(e));
        }
    }

    private static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a3e3eb0002df02a759fa255c56bc9d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a3e3eb0002df02a759fa255c56bc9d3");
        }
        com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "loadFromCache...");
        String c2 = c();
        return TextUtils.isEmpty(c2) ? d() : c2;
    }

    private static String c() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0eae0d2f9547167f67001b2a1661efc2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0eae0d2f9547167f67001b2a1661efc2");
        }
        Object[] objArr2 = new Object[1];
        StringBuilder sb = new StringBuilder("loadFromMemoryCache, memory is:");
        if (TextUtils.isEmpty(d)) {
            str = " null";
        } else {
            str = "\n" + d;
        }
        sb.append(str);
        objArr2[0] = sb.toString();
        com.meituan.banma.jarvis.utils.c.a("banma_jarvis", objArr2);
        return d;
    }

    private static String d() {
        String[] list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "322435e4f774daaaf1cf285972dc457b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "322435e4f774daaaf1cf285972dc457b");
        }
        File file = new File(e());
        if (file.exists() && (list = file.list()) != null && list.length > 0) {
            String str = list[0];
            File file2 = new File(e() + str);
            if (file2.exists() && !a(file2)) {
                try {
                    String a2 = com.meituan.banma.jarvis.utils.b.a(file2);
                    if (!TextUtils.isEmpty(a2)) {
                        com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "loadFromFileCache:\n" + a2);
                        d = a2;
                        return a2;
                    }
                } catch (Exception e) {
                    com.meituan.banma.jarvis.utils.c.a("banma_jarvis", Log.getStackTraceString(e));
                }
            }
        }
        com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "loadFromFileCache ,no cache file ");
        return null;
    }

    private static boolean a(File file) {
        int b2;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74344f027f43864560fae8b4e9c85f65", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74344f027f43864560fae8b4e9c85f65")).booleanValue();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String name = file.getName();
            long parseLong = currentTimeMillis - Long.parseLong(name);
            com.meituan.banma.jarvis.env.c a2 = com.meituan.banma.jarvis.env.c.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.banma.jarvis.env.c.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "75638b22d9dfa7832056f352ea982d36", RobustBitConfig.DEFAULT_VALUE)) {
                b2 = ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "75638b22d9dfa7832056f352ea982d36")).intValue();
            } else {
                b2 = (a2.c == null || a2.c.b() <= 0) ? 3 : a2.c.b();
            }
            if (parseLong > b2 * DDLoadConstants.TIME_HOURS_MILLIS) {
                com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "delete expired file cache:" + name);
                return file.delete();
            }
            return false;
        } catch (Exception e) {
            com.meituan.banma.jarvis.utils.c.a("banma_jarvis", Log.getStackTraceString(e));
            return true;
        }
    }

    private static boolean b(String str) {
        String[] list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ab80cb8ab838dbd5eb79c777953136e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ab80cb8ab838dbd5eb79c777953136e")).booleanValue();
        }
        try {
        } catch (Exception e) {
            com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "create file error:" + Log.getStackTraceString(e));
        }
        if (TextUtils.isEmpty(str)) {
            com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "json string is null");
            return false;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4639fafe244fd26d551034e72031161a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4639fafe244fd26d551034e72031161a");
        } else {
            File file = new File(e());
            if (file.exists() && (list = file.list()) != null && list.length > 0) {
                for (String str2 : list) {
                    String str3 = e() + str2;
                    com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "delete file cache:" + str3);
                    try {
                        new File(str3).delete();
                    } catch (Exception e2) {
                        com.meituan.banma.jarvis.utils.c.a("banma_jarvis", Log.getStackTraceString(e2));
                    }
                }
            }
        }
        String e3 = e();
        if (com.meituan.banma.jarvis.utils.b.c(new File(e3))) {
            String str4 = e3 + System.currentTimeMillis();
            File file2 = new File(str4);
            if (com.meituan.banma.jarvis.utils.b.b(file2)) {
                boolean a2 = com.meituan.banma.jarvis.utils.b.a(file2, str, false);
                com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "create file " + str4 + " done:" + a2);
                return a2;
            }
        }
        return false;
    }

    private static String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71c968ecbc254ee8be1e0535a74840dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71c968ecbc254ee8be1e0535a74840dc");
        }
        try {
            File a2 = q.a(com.meituan.banma.jarvis.utils.a.a(), "banma", "", u.b);
            if (a2 != null) {
                return a2.getPath() + "/jarvis_config_cache/";
            }
            return "";
        } catch (Exception e) {
            com.meituan.banma.jarvis.utils.c.a("banma_jarvis", "getDirPathPrefix error:" + Log.getStackTraceString(e));
            return "";
        }
    }
}
