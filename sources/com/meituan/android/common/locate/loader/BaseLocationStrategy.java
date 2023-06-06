package com.meituan.android.common.locate.loader;

import android.text.TextUtils;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.android.common.locate.LocationMode;
import com.meituan.android.common.locate.MTLocationPurpose;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public abstract class BaseLocationStrategy implements LocationStrategy {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected static LocationLoaderFactory.LoadStrategy i;
    public LoadConfig a;
    protected long b;
    protected long c;
    protected long d;
    protected float e;
    protected long f;
    protected String g;
    protected String h;
    protected boolean j;
    protected boolean k;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    protected String o;
    private boolean p;
    private boolean q;

    public BaseLocationStrategy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "882bd0e3b548a90dd8d64ddb42112c4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "882bd0e3b548a90dd8d64ddb42112c4e");
            return;
        }
        this.h = null;
        this.j = true;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = LocationMode.Hight_Accuracy;
        this.p = false;
        this.b = 30000L;
        this.c = 1800000L;
        this.d = -1L;
        this.e = -1.0f;
        this.f = 1000L;
    }

    public BaseLocationStrategy(LocationLoaderFactory.LoadStrategy loadStrategy) {
        this();
        Object[] objArr = {loadStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f3f1eecf4e95a7aa508311cee3073ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f3f1eecf4e95a7aa508311cee3073ea");
        } else {
            i = loadStrategy;
        }
    }

    public static LocationLoaderFactory.LoadStrategy getStrategy() {
        return i;
    }

    @Override // com.meituan.android.common.locate.loader.LocationStrategy
    public String getAssistMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4427416b02291bccb6823f81124cc0de", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4427416b02291bccb6823f81124cc0de");
        }
        try {
            String str = this.a.get(LoadConfig.ASSIST_LOC_MODE);
            return !TextUtils.isEmpty(str) ? str : "";
        } catch (Exception e) {
            LogUtils.a("BaseLocationStrategy " + e.getMessage());
            return "";
        }
    }

    @Override // com.meituan.android.common.locate.loader.LocationStrategy
    public String getAssistType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7f820b8e1213e61b856718703bab57d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7f820b8e1213e61b856718703bab57d");
        }
        try {
            String str = this.a.get(LoadConfig.ASSIST_LOC_TYPE);
            return !TextUtils.isEmpty(str) ? str : "";
        } catch (Exception e) {
            LogUtils.a("BaseLocationStrategy " + e.getMessage());
            return "";
        }
    }

    public String getBusinessId() {
        return this.g;
    }

    public long getCacheValid() {
        return this.b;
    }

    public LoadConfig getConfig() {
        return this.a;
    }

    @Override // com.meituan.android.common.locate.loader.LocationStrategy
    public long getDeliverInterval() {
        return this.f;
    }

    @Override // com.meituan.android.common.locate.loader.LocationStrategy
    public float getGpsDistanceGap() {
        return this.e;
    }

    @Override // com.meituan.android.common.locate.loader.LocationStrategy
    public long getGpsFixFirstWait() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72d24b6e636fee50ba3977ebbe95079c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72d24b6e636fee50ba3977ebbe95079c")).longValue();
        }
        if (this.a == null) {
            return 0L;
        }
        String str = this.a.get(LoadConfig.GPS_FIX_FIRST_WAIT);
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong >= getLocationTimeout() || parseLong <= 0) {
                return 0L;
            }
            return parseLong;
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
            return 0L;
        }
    }

    @Override // com.meituan.android.common.locate.loader.LocationStrategy
    public long getGpsTimeGap() {
        return this.d;
    }

    @Override // com.meituan.android.common.locate.loader.LocationStrategy
    public String getLocationMode() {
        return this.o;
    }

    @Override // com.meituan.android.common.locate.loader.LocationStrategy
    public String getLocationPurpose() {
        return this.h;
    }

    @Override // com.meituan.android.common.locate.loader.LocationStrategy
    public long getLocationTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82c346514bd9bc44116334b6af1f98ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82c346514bd9bc44116334b6af1f98ea")).longValue();
        }
        if (this.a == null) {
            return LocationStrategy.LOCATION_TIMEOUT;
        }
        String str = this.a.get(LoadConfig.LOCATION_TIMEOUT);
        if (TextUtils.isEmpty(str)) {
            return LocationStrategy.LOCATION_TIMEOUT;
        }
        try {
            long parseLong = Long.parseLong(str);
            return (parseLong >= this.b || parseLong <= 0) ? LocationStrategy.LOCATION_TIMEOUT : parseLong;
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
            return LocationStrategy.LOCATION_TIMEOUT;
        }
    }

    public long getMarkValid() {
        return this.c;
    }

    @Override // com.meituan.android.common.locate.loader.LocationStrategy
    public String getName() {
        return "basestrategy";
    }

    @Override // com.meituan.android.common.locate.loader.LocationStrategy
    public boolean isForceSingleCallback() {
        return this.q;
    }

    @Override // com.meituan.android.common.locate.loader.LocationStrategy
    public boolean isGpsMinDataTakeEffect() {
        return this.p;
    }

    public void setConfig(LoadConfig loadConfig) {
        Object[] objArr = {loadConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9c6d84585b33f5aa0dacb04e51da9f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9c6d84585b33f5aa0dacb04e51da9f3");
            return;
        }
        this.a = loadConfig;
        if (loadConfig == null) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(loadConfig.get(LoadConfig.IS_GEARS_RESULT_NEED_BEARING_WHEN_GPS_LOSING))) {
                this.k = TextUtils.equals("TRUE", loadConfig.get(LoadConfig.IS_GEARS_RESULT_NEED_BEARING_WHEN_GPS_LOSING));
            }
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
        }
        try {
            if (!TextUtils.isEmpty(loadConfig.get(LoadConfig.IS_GEARS_RESULT_NEED_BEARING_FORCE))) {
                this.l = TextUtils.equals("TRUE", loadConfig.get(LoadConfig.IS_GEARS_RESULT_NEED_BEARING_FORCE));
            }
        } catch (Throwable th2) {
            LogUtils.a(getClass(), th2);
        }
        try {
            if (!TextUtils.isEmpty(loadConfig.get(LoadConfig.IS_PREVENT_SHAKING_FORCE))) {
                this.m = TextUtils.equals("TRUE", loadConfig.get(LoadConfig.IS_PREVENT_SHAKING_FORCE));
            }
        } catch (Throwable th3) {
            LogUtils.a(getClass(), th3);
        }
        try {
            if (!TextUtils.isEmpty(loadConfig.get(LoadConfig.IS_NEED_GPS))) {
                this.j = !TextUtils.equals("FALSE", loadConfig.get(LoadConfig.IS_NEED_GPS));
            }
        } catch (Throwable th4) {
            LogUtils.a(getClass(), th4);
        }
        try {
            if (!TextUtils.isEmpty(loadConfig.get(LoadConfig.IS_TURN_ON_TENCENT_INDOOR_LOCATION))) {
                this.n = true ^ TextUtils.equals("FALSE", loadConfig.get(LoadConfig.IS_TURN_ON_TENCENT_INDOOR_LOCATION));
            }
        } catch (Throwable th5) {
            LogUtils.a(getClass(), th5);
        }
        try {
            if (!TextUtils.isEmpty(loadConfig.get(LoadConfig.CACHE_VALIDITY_TIME))) {
                long parseLong = Long.parseLong(loadConfig.get(LoadConfig.CACHE_VALIDITY_TIME));
                if (1800000 > parseLong && parseLong > 0) {
                    this.b = parseLong;
                }
            }
        } catch (Throwable th6) {
            LogUtils.a(getClass(), th6);
        }
        try {
            if (!TextUtils.isEmpty(loadConfig.get(LoadConfig.CACHE_VALIDITY_TIME))) {
                long parseLong2 = Long.parseLong(loadConfig.get(LoadConfig.CACHE_VALIDITY_TIME));
                if (1800000 > parseLong2 && parseLong2 > LocationStrategy.LOCATION_TIMEOUT) {
                    this.c = parseLong2;
                }
            }
        } catch (Throwable th7) {
            LogUtils.a(getClass(), th7);
        }
        try {
            if (!TextUtils.isEmpty(loadConfig.get(LoadConfig.GPS_MIN_TIME))) {
                long parseLong3 = Long.parseLong(loadConfig.get(LoadConfig.GPS_MIN_TIME));
                if (1000 <= parseLong3 && parseLong3 <= 30000) {
                    this.d = parseLong3;
                }
            }
        } catch (Throwable th8) {
            LogUtils.a(getClass(), th8);
        }
        try {
            if (!TextUtils.isEmpty(loadConfig.get(LoadConfig.GPS_MIN_DATA_TAKE_EFFECT))) {
                this.p = TextUtils.equals("TRUE", loadConfig.get(LoadConfig.GPS_MIN_DATA_TAKE_EFFECT));
            }
        } catch (Throwable th9) {
            LogUtils.a(getClass(), th9);
        }
        try {
            if (!TextUtils.isEmpty(loadConfig.get(LoadConfig.GPS_MIN_DISTANCE))) {
                float parseFloat = Float.parseFloat(loadConfig.get(LoadConfig.GPS_MIN_DISTANCE));
                if (parseFloat >= 0.0f) {
                    this.e = parseFloat;
                }
            }
        } catch (Throwable th10) {
            LogUtils.a(getClass(), th10);
        }
        try {
            if (!TextUtils.isEmpty(loadConfig.get(LoadConfig.DELIVER_INTERVAL))) {
                long parseLong4 = Long.parseLong(loadConfig.get(LoadConfig.DELIVER_INTERVAL));
                if (parseLong4 >= 1000) {
                    this.f = parseLong4;
                }
            }
        } catch (Throwable th11) {
            LogUtils.a(getClass(), th11);
        }
        try {
            this.g = loadConfig.get("business_id");
        } catch (Throwable th12) {
            LogUtils.a(getClass(), th12);
        }
        try {
            String str = loadConfig.get(LoadConfig.LOCATION_MODE);
            if (!TextUtils.isEmpty(str)) {
                this.o = str;
            }
        } catch (Exception unused) {
            this.o = LocationMode.Hight_Accuracy;
        }
        try {
            String str2 = loadConfig.get(MTLocationPurpose.Config_Location_Purpose);
            if (!TextUtils.isEmpty(str2)) {
                this.h = str2;
            }
        } catch (Exception e) {
            com.meituan.android.common.locate.platform.logs.c.a("BaseLocationStrategy:get:purpose:exception:" + e.getMessage(), 3);
        }
        try {
            if (TextUtils.isEmpty(loadConfig.get(LoadConfig.FORCE_SINGLE_CALLBACK))) {
                return;
            }
            this.q = TextUtils.equals("TRUE", loadConfig.get(LoadConfig.FORCE_SINGLE_CALLBACK));
        } catch (Throwable th13) {
            LogUtils.a(getClass(), th13);
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48a2cf1b7c75e9d1ce3b0dc88590afef", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48a2cf1b7c75e9d1ce3b0dc88590afef");
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("bid=" + this.g);
        stringBuffer.append(",config" + this.a.toString());
        return stringBuffer.toString();
    }
}
