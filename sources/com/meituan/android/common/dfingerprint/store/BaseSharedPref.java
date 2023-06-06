package com.meituan.android.common.dfingerprint.store;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class BaseSharedPref {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Context mContext;
    private q settings;

    public BaseSharedPref(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ce7ac63a85d9cc734aca83a697e81f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ce7ac63a85d9cc734aca83a697e81f1");
            return;
        }
        this.mContext = null;
        this.settings = null;
        if (context == null) {
            return;
        }
        this.mContext = context;
        this.settings = q.a(context, DFPConfigs.MTDFP_CONFIG, 2);
    }

    public synchronized void clear(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7bb73816b074dbe456912492ba0454d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7bb73816b074dbe456912492ba0454d");
            return;
        }
        if (this.settings != null && str != null) {
            this.settings.b(str);
        }
    }

    public int readInt(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40825eed7814325c6f1eb2e96adb0f9c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40825eed7814325c6f1eb2e96adb0f9c")).intValue();
        }
        if (this.settings == null || str == null) {
            return -1;
        }
        return this.settings.b(str, -1);
    }

    public long readLong(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63f5b03cd3048515a798ae960324a172", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63f5b03cd3048515a798ae960324a172")).longValue();
        }
        if (this.settings == null || str == null) {
            return -1L;
        }
        return this.settings.b(str, -1L);
    }

    public String readString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "887e8326c3a70911e671223b96d65bfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "887e8326c3a70911e671223b96d65bfb");
        }
        if (this.settings == null || str == null) {
            return null;
        }
        return this.settings.b(str, (String) null);
    }

    public synchronized boolean writeInt(String str, Integer num) {
        Object[] objArr = {str, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43c7da92045eabedfdf55948ef241aa0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43c7da92045eabedfdf55948ef241aa0")).booleanValue();
        }
        if (this.settings != null && str != null) {
            return this.settings.a(str, num.intValue());
        }
        return false;
    }

    public synchronized boolean writeLong(String str, Long l) {
        Object[] objArr = {str, l};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93235bd34916c2847e5163b3a089b4ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93235bd34916c2847e5163b3a089b4ef")).booleanValue();
        }
        if (this.settings != null && str != null) {
            return this.settings.a(str, l.longValue());
        }
        return false;
    }

    public synchronized boolean writeString(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02966c6f8cd31943d8f0f7ac6081ab15", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02966c6f8cd31943d8f0f7ac6081ab15")).booleanValue();
        }
        if (this.settings != null && str != null && str2 != null) {
            return this.settings.a(str, str2);
        }
        return false;
    }
}
