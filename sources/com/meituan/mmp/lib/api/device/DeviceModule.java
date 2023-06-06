package com.meituan.mmp.lib.api.device;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.api.device.c;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class DeviceModule<T extends c> extends ServiceApi {
    public static ChangeQuickRedirect h;
    private Map<String, T> a;
    private boolean i;

    public static int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7ce511167e2b045a8eba196093a56b6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7ce511167e2b045a8eba196093a56b6")).intValue();
        }
        switch (i) {
            case 1:
                return 20;
            case 2:
                return 60;
            case 3:
                return 200;
            default:
                return 200;
        }
    }

    public abstract T a(@NonNull MtSensorManager mtSensorManager, String str);

    public abstract String a(String str);

    public DeviceModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d61dfcf7f20d9833c5115471dec79eef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d61dfcf7f20d9833c5115471dec79eef");
            return;
        }
        this.a = new HashMap();
        this.i = false;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92d79aa6c6663962a803b14ee50963aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92d79aa6c6663962a803b14ee50963aa");
            return;
        }
        a(false);
        this.i = false;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "827391aec9075f65e60dc5a98e0381d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "827391aec9075f65e60dc5a98e0381d6");
            return;
        }
        a(true);
        this.i = true;
    }

    @Override // com.meituan.mmp.lib.api.ServiceApi
    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b31865173f58359e2b5f6712eabb0ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b31865173f58359e2b5f6712eabb0ee");
        } else {
            a((IApiCallback) null);
        }
    }

    public final synchronized T d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ffde5fd9a8ab82632873f1feade83f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ffde5fd9a8ab82632873f1feade83f3");
        }
        T e = e(str);
        if (e != null) {
            return e;
        }
        MtSensorManager createSensorManager = Privacy.createSensorManager(getContext(), str);
        if (createSensorManager != null) {
            e = a(createSensorManager, str);
            e.a(this.i);
            this.a.put(a(str), e);
        }
        return e;
    }

    public final synchronized T e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b30c2463fcc9815bdb55e175343736f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b30c2463fcc9815bdb55e175343736f7");
        }
        String a = a(str);
        if (this.a.containsKey(a)) {
            return this.a.get(a);
        }
        return null;
    }

    private synchronized void a(IApiCallback iApiCallback) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8189ce6776217c6b81b3dd1cbafe2cb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8189ce6776217c6b81b3dd1cbafe2cb8");
            return;
        }
        for (Map.Entry<String, T> entry : this.a.entrySet()) {
            if (entry != null && entry.getValue() != null) {
                entry.getValue().a(null);
            }
        }
        this.a.clear();
    }

    private synchronized void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "946e6d08cc31536b94de55f72a9025eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "946e6d08cc31536b94de55f72a9025eb");
            return;
        }
        for (Map.Entry<String, T> entry : this.a.entrySet()) {
            if (entry != null && entry.getValue() != null) {
                entry.getValue().a(z);
            }
        }
    }

    public static int b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6e77329b841253f88bb8c882efb73ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6e77329b841253f88bb8c882efb73ed")).intValue();
        }
        if (jSONObject != null) {
            String optString = jSONObject.optString("interval");
            if (!TextUtils.isEmpty(optString)) {
                if ("ui".contentEquals(optString)) {
                    return 2;
                }
                if ("game".contentEquals(optString)) {
                    return 1;
                }
            }
        }
        return 3;
    }
}
