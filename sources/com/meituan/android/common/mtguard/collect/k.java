package com.meituan.android.common.mtguard.collect;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.common.locate.MasterLocatorFactoryImpl;
import com.meituan.android.common.locate.MasterLocatorImpl;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.MtLocationInfo;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
/* loaded from: classes2.dex */
public class k implements MtLocationInfo.MtLocationInfoListener, c {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static k d = null;
    private static MasterLocatorImpl e = null;
    private static final int h = 127;
    private static final int i = 512;
    private static final int j = 542;
    public String a;
    public volatile String b;
    public boolean c;
    private Context f;
    private String g;
    private boolean k;

    /* loaded from: classes2.dex */
    final class a {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(JsBridgeResult.PROPERTY_LOCATION_ACCURACY)
        public float a;
        @SerializedName("verticalAccuracyMeters")
        public float b;
        @SerializedName(JsBridgeResult.PROPERTY_LOCATION_ALTITUDE)
        public double c;
        @SerializedName("speed")
        public float d;
        @SerializedName("provider")
        public String e;
        @SerializedName("time")
        public long f;

        public a(MtLocation mtLocation) {
            Object[] objArr = {k.this, mtLocation};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "299ff5c338e67e710d758ca78b0c8b21", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "299ff5c338e67e710d758ca78b0c8b21");
                return;
            }
            this.a = mtLocation.getAccuracy();
            this.c = mtLocation.getAltitude();
            this.d = mtLocation.getSpeed();
            this.e = mtLocation.getProvider();
            if (Build.VERSION.SDK_INT >= 26) {
                this.b = mtLocation.getVerticalAccuracyMeters();
            }
            this.f = mtLocation.getTime();
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84984fb9801e282127f449c0c806cc3b", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84984fb9801e282127f449c0c806cc3b") : new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(this);
        }
    }

    public k(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a52e1573004f45357c9e18b053a8ec2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a52e1573004f45357c9e18b053a8ec2");
            return;
        }
        this.g = a(0.0d, 0.0d);
        this.a = "";
        this.k = false;
        this.b = "";
        this.c = false;
        this.f = context;
    }

    public static k a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8ca322d4a8513beedceb27477b9f88c9", 6917529027641081856L)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8ca322d4a8513beedceb27477b9f88c9");
        }
        if (d == null) {
            synchronized (k.class) {
                if (d == null) {
                    d = new k(context);
                }
            }
        }
        return d;
    }

    private static String a(double d2, double d3) {
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6305d85a1196abc1edd3004afe09308a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6305d85a1196abc1edd3004afe09308a");
        }
        DecimalFormat decimalFormat = new DecimalFormat("#0.0000000000");
        return decimalFormat.format(d2) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + decimalFormat.format(d3);
    }

    private void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f20b41da8fbb5efb005a60b9ac8546e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f20b41da8fbb5efb005a60b9ac8546e3");
            return;
        }
        a();
        eVar.a(127, this);
        eVar.a(512, this);
    }

    private void c() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33ee20429741208a3b1071b36c03e5f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33ee20429741208a3b1071b36c03e5f0");
            return;
        }
        try {
            if (this.k) {
                return;
            }
            Object[] main3 = NBridge.main3(53, new Object[]{127});
            boolean booleanValue = main3 == null ? false : ((Boolean) main3[0]).booleanValue();
            Object[] main32 = NBridge.main3(53, new Object[]{512});
            if (main32 != null) {
                z = ((Boolean) main32[0]).booleanValue();
            }
            if (!booleanValue && !z) {
                if (e != null) {
                    e.addListener((MtLocationInfo.MtLocationInfoListener) this, true);
                }
                this.k = true;
            }
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e0bd70393344add82c7179e0d543eb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e0bd70393344add82c7179e0d543eb6");
            return;
        }
        try {
            if (this.k) {
                if (e != null) {
                    e.removeListener(this);
                }
                this.k = false;
            }
        } catch (Throwable unused) {
        }
    }

    private String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2424cc52bd3a98c4eb055ef8521d95ec", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2424cc52bd3a98c4eb055ef8521d95ec");
        }
        a();
        return this.a;
    }

    private String f() {
        return this.b;
    }

    private boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f59371672daa9db6cba658a06bd3f040", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f59371672daa9db6cba658a06bd3f040")).booleanValue();
        }
        a();
        MTGuardLog.setLogan("getIsMock:" + this.c);
        return this.c;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a20b6944e484131ed07f8ba33e0398b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a20b6944e484131ed07f8ba33e0398b5");
        } else if (e == null) {
            try {
                Field declaredField = MasterLocatorFactoryImpl.class.getDeclaredField("masterLocator");
                declaredField.setAccessible(true);
                MasterLocatorImpl masterLocatorImpl = (MasterLocatorImpl) declaredField.get(null);
                e = masterLocatorImpl;
                if (masterLocatorImpl == null) {
                    return;
                }
                c();
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
        }
    }

    @Override // com.meituan.android.common.mtguard.collect.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69aadaea8573963cea6bf57e73873042", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69aadaea8573963cea6bf57e73873042");
        } else if (!z) {
            c();
        } else {
            try {
                if (this.k) {
                    if (e != null) {
                        e.removeListener(this);
                    }
                    this.k = false;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc8441b846422060ef3e8e753c61aa0a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc8441b846422060ef3e8e753c61aa0a");
        }
        a();
        return this.g;
    }

    @Override // com.meituan.android.common.locate.MtLocationInfo.MtLocationInfoListener
    public boolean onLocationGot(MtLocationInfo mtLocationInfo) {
        Object[] objArr = {mtLocationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a55683d897b935ec23ace7d4e687387b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a55683d897b935ec23ace7d4e687387b")).booleanValue();
        }
        if (mtLocationInfo != null) {
            try {
                if (mtLocationInfo.location != null) {
                    MtLocation mtLocation = mtLocationInfo.location;
                    this.a = new a(mtLocation).toString();
                    MTGuardLog.setLogan("mars onLocationGot detail:" + this.a);
                    NBridge.main3(50, new Object[]{512});
                    Bundle extras = mtLocation.getExtras();
                    if (extras != null) {
                        double d2 = extras.getDouble("gpslat");
                        double d3 = extras.getDouble("gpslng");
                        String string = extras.getString("city");
                        MTGuardLog.setLogan("LocationInformation lat:" + d2 + ", lng:" + d3 + ", city:" + string);
                        this.b = string;
                        this.g = a(d2, d3);
                        NBridge.main3(50, new Object[]{127});
                    }
                    this.c = mtLocation.isFromMockProvider();
                    MTGuardLog.setLogan("isMock:" + this.c);
                    NBridge.main3(50, new Object[]{Integer.valueOf((int) j)});
                }
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
        }
        return true;
    }
}
