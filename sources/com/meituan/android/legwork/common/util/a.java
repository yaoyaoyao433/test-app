package com.meituan.android.legwork.common.util;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.legwork.bean.UniformLoadingTimeout;
import com.meituan.android.legwork.bean.monitor.ClientConfigBean;
import com.meituan.android.legwork.bean.monitor.FuncConfigBean;
import com.meituan.android.legwork.bean.monitor.FuncConfigResult;
import com.meituan.android.legwork.bean.monitor.MrnShellConfigBean;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.android.legwork.utils.aa;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.legwork.utils.y;
import com.meituan.android.legwork.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final a d = new a();
    public ClientConfigBean b;
    public String c;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.legwork.common.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0264a {
        void a(boolean z);
    }

    public static a a() {
        return d;
    }

    public final void a(final InterfaceC0264a interfaceC0264a) {
        Object[] objArr = {interfaceC0264a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2297df6290f91351f134dbf9306975bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2297df6290f91351f134dbf9306975bc");
        } else if (interfaceC0264a == null) {
            a(d());
        } else {
            final WeakReference weakReference = new WeakReference(interfaceC0264a);
            rx.d.a(new com.meituan.android.legwork.net.subscriber.a<Object>() { // from class: com.meituan.android.legwork.common.util.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f61a6d7431184ef030dbe5ed6eab251c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f61a6d7431184ef030dbe5ed6eab251c");
                        return;
                    }
                    String json = com.meituan.android.legwork.net.util.b.a().toJson(obj);
                    ClientConfigBean clientConfigBean = (ClientConfigBean) com.meituan.android.legwork.net.util.b.a().fromJson(json, (Class<Object>) ClientConfigBean.class);
                    if (TextUtils.isEmpty(json)) {
                        a.this.c = y.a().b();
                    } else {
                        a.this.c = json;
                    }
                    a.this.a(clientConfigBean);
                    b.a().a(a.this.b);
                    if (clientConfigBean != null) {
                        y a2 = y.a();
                        Object[] objArr3 = {json};
                        ChangeQuickRedirect changeQuickRedirect3 = y.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "724f718095fd2972caa4f51402134fdb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "724f718095fd2972caa4f51402134fdb");
                        } else {
                            x.c("PtSP.saveClientConfigStr()", "clientConfigStr:" + json);
                            a2.a("pt_client_config_bean", json);
                        }
                        Context a3 = com.meituan.android.legwork.a.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(clientConfigBean.cancelFeeRefreshInterval);
                        z.a(a3, "cancel_fee_refresh_interval", sb.toString());
                    }
                    InterfaceC0264a interfaceC0264a2 = (InterfaceC0264a) weakReference.get();
                    if (interfaceC0264a2 != null) {
                        interfaceC0264a2.a(true);
                    }
                }

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final void a(boolean z, int i, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a46f177b043e824a45ee6b72de79bd18", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a46f177b043e824a45ee6b72de79bd18");
                        return;
                    }
                    x.e("BaseSubscriber", String.format("获取配置错误 错误信息为:%d %s", Integer.valueOf(i), str));
                    a.this.a(a.this.d());
                    b.a().a(a.this.b);
                    if (interfaceC0264a != null) {
                        interfaceC0264a.a(false);
                    }
                }
            }, ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).getClientConfig().b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ClientConfigBean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f91812f7fbda0bb3764780dcc923bee", RobustBitConfig.DEFAULT_VALUE)) {
            return (ClientConfigBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f91812f7fbda0bb3764780dcc923bee");
        }
        String b = y.a().b();
        if (!TextUtils.isEmpty(b)) {
            this.c = b;
        }
        try {
            return (ClientConfigBean) com.meituan.android.legwork.net.util.b.a().fromJson(b, (Class<Object>) ClientConfigBean.class);
        } catch (Exception e) {
            x.e("PtSP.getClientConfig()", "获取本地配置错误，configStr:" + b + ",exception msg:", e);
            x.a(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ClientConfigBean clientConfigBean) {
        FuncConfigBean funcConfigBean;
        Object[] objArr = {clientConfigBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7cfa4ceb763fd063b1d0d055bda7042", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7cfa4ceb763fd063b1d0d055bda7042");
        } else if (clientConfigBean == null) {
        } else {
            this.b = clientConfigBean;
            com.meituan.android.legwork.utils.b.a().e = clientConfigBean.testIdParams;
            com.meituan.android.legwork.utils.b.a().a(clientConfigBean.testIdMapping);
            if (clientConfigBean.funcConfigResult != null && (funcConfigBean = clientConfigBean.funcConfigResult.get(FuncConfigResult.DEGRADE_MAPPING)) != null && funcConfigBean.support) {
                com.meituan.android.legwork.mrn.b.a().a(funcConfigBean.ext);
            }
            y.a().a(true ^ a(this.b, FuncConfigResult.LEGWORK_MAP_LINE_EGRADE));
            if (clientConfigBean.funcConfigResult != null) {
                FuncConfigBean funcConfigBean2 = clientConfigBean.funcConfigResult.get(FuncConfigResult.SCREEN_SHOT_LISTEN_DEGRADE);
                if (funcConfigBean2 != null) {
                    aa.b = funcConfigBean2.support;
                }
                q.a().a(clientConfigBean.funcConfigResult.get(FuncConfigResult.MONITOR_CONFIG_DEGRADE));
                x.a(clientConfigBean.funcConfigResult.get(FuncConfigResult.REPORT_CATCH_EXCEPTION_CONFIG_DEGRADE));
            } else {
                q.a().a((FuncConfigBean) null);
            }
            com.meituan.android.legwork.monitor.e.a().b();
            if (d.c()) {
                com.meituan.android.legwork.common.jarvis.a.a().b();
            }
            if (clientConfigBean.funcConfigResult != null) {
                g.a().a(clientConfigBean.funcConfigResult.get(FuncConfigResult.PRIVACY_BLACK_LIST_FOR_API));
                g.a().d(clientConfigBean.funcConfigResult.get(FuncConfigResult.PRIVACY_BLACK_LIST_FOR_H5));
                g.a().b(clientConfigBean.funcConfigResult.get(FuncConfigResult.PRIVACY_WHITE_LIST_FOR_API));
                g.a().c(clientConfigBean.funcConfigResult.get(FuncConfigResult.PRIVACY_WHITE_LIST_FOR_H5));
                g.a().e(clientConfigBean.funcConfigResult.get(FuncConfigResult.ENCRYPT_URL_CONFIG));
                return;
            }
            g.a().a((FuncConfigBean) null);
            g.a().d(null);
            g.a().b(null);
            g.a().c(null);
            g.a().e(null);
        }
    }

    public boolean a(ClientConfigBean clientConfigBean, String str) {
        FuncConfigBean funcConfigBean;
        Object[] objArr = {clientConfigBean, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5f6ad9fe2220b7db9213344088b7905", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5f6ad9fe2220b7db9213344088b7905")).booleanValue();
        }
        if (clientConfigBean == null || clientConfigBean.funcConfigResult == null || (funcConfigBean = clientConfigBean.funcConfigResult.get(str)) == null) {
            return false;
        }
        return funcConfigBean.support;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff14ab2a267799fe42b2d990a7cf135f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff14ab2a267799fe42b2d990a7cf135f") : String.valueOf(a(this.b, FuncConfigResult.SPU_USE_MRNLIST));
    }

    public final boolean a(String str) {
        FuncConfigBean funcConfigBean;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9b43c1b8d1727474e21275bb5fd6762", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9b43c1b8d1727474e21275bb5fd6762")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.b == null || this.b.funcConfigResult == null || (funcConfigBean = this.b.funcConfigResult.get(str)) == null) {
            return false;
        }
        return funcConfigBean.support;
    }

    public final boolean b(String str) {
        FuncConfigBean funcConfigBean;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d433832d73992451adcb23180a8212d3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d433832d73992451adcb23180a8212d3")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.b == null || this.b.funcConfigResult == null || (funcConfigBean = this.b.funcConfigResult.get(str)) == null || TextUtils.isEmpty(funcConfigBean.ext)) {
            return true;
        }
        try {
            MrnShellConfigBean mrnShellConfigBean = (MrnShellConfigBean) new Gson().fromJson(funcConfigBean.ext, new TypeToken<MrnShellConfigBean>() { // from class: com.meituan.android.legwork.common.util.a.2
            }.getType());
            if (mrnShellConfigBean == null) {
                return true;
            }
            return !TextUtils.equals(mrnShellConfigBean.needLogin, "0");
        } catch (Exception e) {
            x.e("ConfigManager.isMrnShellNeedLogin()", "json parse exception msg: ", e);
            return true;
        }
    }

    public final int c(String str) {
        MrnShellConfigBean mrnShellConfigBean;
        UniformLoadingTimeout uniformLoadingTimeout;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a317f1df973747cec356ec39b8ee65c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a317f1df973747cec356ec39b8ee65c")).intValue();
        }
        int i = 10;
        if (this.b == null || this.b.funcConfigResult == null) {
            return 10;
        }
        try {
            FuncConfigBean funcConfigBean = this.b.funcConfigResult.get(FuncConfigResult.MRN_SHELL_TIME_OUT);
            if (funcConfigBean != null && !TextUtils.isEmpty(funcConfigBean.ext) && (uniformLoadingTimeout = (UniformLoadingTimeout) new Gson().fromJson(funcConfigBean.ext, new TypeToken<UniformLoadingTimeout>() { // from class: com.meituan.android.legwork.common.util.a.3
            }.getType())) != null && uniformLoadingTimeout.timeout > 0) {
                i = uniformLoadingTimeout.timeout;
            }
            FuncConfigBean funcConfigBean2 = this.b.funcConfigResult.get(str);
            return (funcConfigBean2 == null || TextUtils.isEmpty(funcConfigBean2.ext) || (mrnShellConfigBean = (MrnShellConfigBean) new Gson().fromJson(funcConfigBean2.ext, new TypeToken<MrnShellConfigBean>() { // from class: com.meituan.android.legwork.common.util.a.4
            }.getType())) == null || mrnShellConfigBean.timeout <= 0) ? i : mrnShellConfigBean.timeout;
        } catch (Exception e) {
            x.e("ConfigManager.getMrnShellTimeout()", "json parse exception msg: ", e);
            return i;
        }
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee4bb5eb0f3e7c57f85403136f785150", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee4bb5eb0f3e7c57f85403136f785150")).booleanValue() : a(this.b, FuncConfigResult.ENABLE_JARVIS);
    }

    public final boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3676a017f73756e60436ddcc4c867b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3676a017f73756e60436ddcc4c867b2")).booleanValue();
        }
        if (a(this.b, FuncConfigResult.POI_ID_ENCRYPT_WAY_DEGRADE)) {
            FuncConfigBean funcConfigBean = this.b.funcConfigResult.get(FuncConfigResult.POI_ID_ENCRYPT_WAY_DEGRADE);
            if (TextUtils.isEmpty(funcConfigBean.ext)) {
                return true;
            }
            try {
                List list = (List) com.meituan.android.legwork.net.util.b.a().fromJson(funcConfigBean.ext, (Class<Object>) ArrayList.class);
                if (list == null || list.size() <= 0) {
                    return true;
                }
                if (!TextUtils.isEmpty(str)) {
                    if (list.contains(str)) {
                        return true;
                    }
                }
            } catch (Exception e) {
                x.e("ConfigManager", "isPoiIdEncryptWayDegrade exception msg:", e);
                return true;
            }
        }
        return false;
    }
}
