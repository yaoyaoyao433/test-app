package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.util.AGCUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.NetWorkUtil;
import com.huawei.hms.utils.PackageManagerHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class n implements IBridgeActivityDelegate {
    public WeakReference<Activity> a;
    public IBridgeActivityDelegate b;
    public UpdateBean c = null;
    public o d = null;
    public boolean e = false;
    public int f = -1;
    public String g = null;
    public String h = null;
    public int i = 0;

    public static String a(int i) {
        if (i != 0) {
            switch (i) {
                case 5:
                    return x.class.getName();
                case 6:
                    return f0.class.getName();
                case 7:
                    return p.class.getName();
                default:
                    return "";
            }
        }
        return e0.class.getName();
    }

    public void a(o oVar) {
    }

    public abstract void a(Class<? extends o> cls);

    public Activity b() {
        WeakReference<Activity> weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void b(o oVar) {
    }

    public void c(int i, int i2) {
        Activity b = b();
        if (b == null || b.isFinishing()) {
            return;
        }
        a(i, i2);
        Intent intent = new Intent();
        intent.putExtra(BridgeActivity.EXTRA_DELEGATE_CLASS_NAME, getClass().getName());
        intent.putExtra(BridgeActivity.EXTRA_RESULT, i);
        b.setResult(-1, intent);
        b.finish();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.a = new WeakReference<>(activity);
        if (this.c == null) {
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            this.c = (UpdateBean) com.sankuai.waimai.platform.utils.f.c(intent, BridgeActivity.EXTRA_DELEGATE_UPDATE_INFO);
            if (this.c == null) {
                return;
            }
        }
        this.g = this.c.b();
        this.h = this.c.getClientAppName();
        this.i = this.c.c();
        this.c.a();
        this.b = null;
        this.e = false;
        this.f = -1;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        this.a = null;
        a();
        if (!this.e || (iBridgeActivityDelegate = this.b) == null) {
            return;
        }
        iBridgeActivityDelegate.onBridgeActivityDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.e && (iBridgeActivityDelegate = this.b) != null) {
            iBridgeActivityDelegate.onBridgeConfigurationChanged();
            return;
        }
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        Class<?> cls = oVar.getClass();
        this.d.b();
        this.d = null;
        a((Class<? extends o>) cls);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (!this.e || (iBridgeActivityDelegate = this.b) == null) {
            return;
        }
        iBridgeActivityDelegate.onKeyUp(i, keyEvent);
    }

    public final String b(int i, int i2) {
        String valueOf = String.valueOf(i);
        if (i2 == 0) {
            return "0000" + valueOf;
        } else if (i2 == 5) {
            return "5000" + valueOf;
        } else if (i2 != 6) {
            return valueOf;
        } else {
            return "4000" + valueOf;
        }
    }

    public void a() {
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        try {
            oVar.b();
            this.d = null;
        } catch (IllegalStateException e) {
            HMSLog.e("AbsUpdateWizard", "In dismissDialog, Failed to dismiss the dialog." + e.getMessage());
        }
    }

    public void a(int i, int i2) {
        if (!SystemUtils.isChinaROM()) {
            HMSLog.i("AbsUpdateWizard", "not ChinaROM ");
            return;
        }
        Activity b = b();
        if (b == null || b.isFinishing()) {
            return;
        }
        int packageVersionCode = new PackageManagerHelper(b).getPackageVersionCode(this.g);
        HashMap hashMap = new HashMap();
        hashMap.put("package", b.getPackageName());
        hashMap.put(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, this.g);
        hashMap.put(HiAnalyticsConstant.BI_KEY_TARGET_VER, String.valueOf(packageVersionCode));
        hashMap.put("sdk_ver", "50200300");
        hashMap.put("app_id", AGCUtils.getAppId(b));
        hashMap.put(HiAnalyticsConstant.BI_KEY_TRIGGER_API, "core.connnect");
        hashMap.put(HiAnalyticsConstant.BI_KEY_UPDATE_TYPE, String.valueOf(i2));
        hashMap.put(HiAnalyticsConstant.BI_KEY_NET_TYPE, String.valueOf(NetWorkUtil.getNetworkType(b)));
        hashMap.put("result", b(i, i2));
        HiAnalyticsUtils.getInstance().onEvent(b, HiAnalyticsConstant.BI_TYPE_UPDATE, hashMap);
    }

    public boolean a(boolean z) {
        Activity b = b();
        boolean z2 = false;
        if (b == null) {
            return false;
        }
        ArrayList typeList = this.c.getTypeList();
        if (typeList.size() > 0) {
            typeList.remove(0);
        }
        if (this.b == null) {
            a(typeList);
        }
        if (this.b != null) {
            z2 = true;
            this.e = true;
            this.c.setTypeList(typeList);
            this.c.setNeedConfirm(z);
            IBridgeActivityDelegate iBridgeActivityDelegate = this.b;
            if (iBridgeActivityDelegate instanceof n) {
                ((n) iBridgeActivityDelegate).a(this.c);
            }
            this.b.onBridgeActivityCreate(b);
        }
        return z2;
    }

    public final void a(ArrayList arrayList) {
        String a = (arrayList == null || arrayList.size() <= 0) ? null : a(((Integer) arrayList.get(0)).intValue());
        if (a == null) {
            return;
        }
        try {
            this.b = (IBridgeActivityDelegate) Class.forName(a).asSubclass(IBridgeActivityDelegate.class).newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            HMSLog.e("AbsUpdateWizard", "getBridgeActivityDelegate error" + e.getMessage());
        }
    }

    public final void a(UpdateBean updateBean) {
        this.c = updateBean;
    }

    public boolean a(String str, int i) {
        Activity b;
        return (TextUtils.isEmpty(str) || (b = b()) == null || b.isFinishing() || new PackageManagerHelper(b).getPackageVersionCode(str) < i) ? false : true;
    }
}
