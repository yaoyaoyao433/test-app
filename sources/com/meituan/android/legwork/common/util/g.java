package com.meituan.android.legwork.common.util;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.legwork.bean.monitor.FuncConfigBean;
import com.meituan.android.legwork.net.encrypt.EncryptConfigBean;
import com.meituan.android.legwork.net.encrypt.EncryptUrlConfig;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public List<String> b;
    public List<String> c;
    public List<String> d;
    public List<String> e;
    public Map<String, EncryptUrlConfig> f;
    public boolean g;
    public boolean h;
    public boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        private static final g a = new g();
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30c4e94c50069a1b86a243225273e6ee", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30c4e94c50069a1b86a243225273e6ee") : a.a;
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f543f538fd42660bb10258642938727e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f543f538fd42660bb10258642938727e");
            return;
        }
        this.f = new HashMap();
        this.g = false;
        this.h = false;
        this.i = false;
    }

    public final void a(FuncConfigBean funcConfigBean) {
        Object[] objArr = {funcConfigBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "550c3b2fa6cbaf495285a6b66d81e675", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "550c3b2fa6cbaf495285a6b66d81e675");
            return;
        }
        if (funcConfigBean != null && funcConfigBean.support && !TextUtils.isEmpty(funcConfigBean.ext)) {
            try {
                this.b = (List) com.meituan.android.legwork.net.util.b.a().fromJson(funcConfigBean.ext, (Class<Object>) ArrayList.class);
                return;
            } catch (Exception e) {
                x.e("LegworkPrivacyManager", "setApiBlackListConfig exception msg:", e);
            }
        }
        this.b = null;
    }

    public final void b(FuncConfigBean funcConfigBean) {
        Object[] objArr = {funcConfigBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89502bdc374abf2cf377678dec3179fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89502bdc374abf2cf377678dec3179fd");
            return;
        }
        this.g = funcConfigBean != null && funcConfigBean.support;
        if (this.g && !TextUtils.isEmpty(funcConfigBean.ext)) {
            try {
                this.d = (List) com.meituan.android.legwork.net.util.b.a().fromJson(funcConfigBean.ext, (Class<Object>) ArrayList.class);
                return;
            } catch (Exception e) {
                x.e("LegworkPrivacyManager", "setApiBlackListConfig exception msg:", e);
            }
        }
        this.d = null;
    }

    public final void c(FuncConfigBean funcConfigBean) {
        Object[] objArr = {funcConfigBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "899b978fd5dae853885bf3c7f75bc4a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "899b978fd5dae853885bf3c7f75bc4a4");
            return;
        }
        this.h = funcConfigBean != null && funcConfigBean.support;
        if (this.h && !TextUtils.isEmpty(funcConfigBean.ext)) {
            try {
                this.e = (List) com.meituan.android.legwork.net.util.b.a().fromJson(funcConfigBean.ext, (Class<Object>) ArrayList.class);
                return;
            } catch (Exception e) {
                x.e("LegworkPrivacyManager", "setH5BlackListConfig exception msg:", e);
            }
        }
        this.e = null;
    }

    public final void d(FuncConfigBean funcConfigBean) {
        Object[] objArr = {funcConfigBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb33424e7bf6fb3566a63479a530d648", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb33424e7bf6fb3566a63479a530d648");
            return;
        }
        if (funcConfigBean != null && funcConfigBean.support && !TextUtils.isEmpty(funcConfigBean.ext)) {
            try {
                this.c = (List) com.meituan.android.legwork.net.util.b.a().fromJson(funcConfigBean.ext, (Class<Object>) ArrayList.class);
                return;
            } catch (Exception e) {
                x.e("LegworkPrivacyManager", "setH5BlackListConfig exception msg:", e);
            }
        }
        this.c = null;
    }

    public final void e(FuncConfigBean funcConfigBean) {
        List<EncryptUrlConfig> list;
        Object[] objArr = {funcConfigBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4698003c6742ceefcf56afcf2a370ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4698003c6742ceefcf56afcf2a370ec");
            return;
        }
        this.i = funcConfigBean != null && funcConfigBean.support;
        this.f.clear();
        if (this.i) {
            a(this.f);
        }
        if (funcConfigBean != null && funcConfigBean.support && !TextUtils.isEmpty(funcConfigBean.ext)) {
            try {
                list = (List) com.meituan.android.legwork.net.util.b.a().fromJson(funcConfigBean.ext, new TypeToken<List<EncryptUrlConfig>>() { // from class: com.meituan.android.legwork.common.util.g.1
                }.getType());
            } catch (Exception e) {
                x.e("LegworkPrivacyManager", "setEncryptConfig exception msg:", e);
            }
            if (list != null || list.size() <= 0) {
            }
            for (EncryptUrlConfig encryptUrlConfig : list) {
                this.f.put(encryptUrlConfig.url, encryptUrlConfig);
            }
            return;
        }
        list = null;
        if (list != null) {
        }
    }

    private void a(Map<String, EncryptUrlConfig> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98bf7feabca13e0f2e049a927c14bf6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98bf7feabca13e0f2e049a927c14bf6f");
            return;
        }
        for (String str : com.meituan.android.legwork.net.util.a.b) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new EncryptConfigBean("actual_longitude"));
            arrayList.add(new EncryptConfigBean("actual_latitude"));
            arrayList.add(new EncryptConfigBean("location_accuracy"));
            arrayList.add(new EncryptConfigBean(Constants.PRIVACY.KEY_LONGITUDE));
            arrayList.add(new EncryptConfigBean(Constants.PRIVACY.KEY_LATITUDE));
            map.put(str, new EncryptUrlConfig(str, arrayList, null));
        }
    }
}
