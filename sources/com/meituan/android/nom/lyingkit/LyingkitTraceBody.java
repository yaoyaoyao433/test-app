package com.meituan.android.nom.lyingkit;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LyingkitTraceBody implements Parcelable {
    public static final Parcelable.Creator<LyingkitTraceBody> CREATOR = new Parcelable.Creator<LyingkitTraceBody>() { // from class: com.meituan.android.nom.lyingkit.LyingkitTraceBody.2
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LyingkitTraceBody createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5af3c89dd55721b849e3288edb0b090e", RobustBitConfig.DEFAULT_VALUE) ? (LyingkitTraceBody) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5af3c89dd55721b849e3288edb0b090e") : new LyingkitTraceBody(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LyingkitTraceBody[] newArray(int i) {
            return new LyingkitTraceBody[i];
        }
    };
    public static ChangeQuickRedirect a;
    final String b;
    LyingkitExtraInfo c;
    long d;
    long e;
    long f;
    public String g;
    public String h;
    String i;
    String j;
    Object[] k;
    String l;
    private final long m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private Class s;
    private String t;
    private String u;
    private String v;
    private String w;
    private long x;
    private String y;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LyingkitTraceBody(@NonNull LyingkitZone lyingkitZone, @Nullable LyingkitTraceBody lyingkitTraceBody, String str) {
        Object[] objArr = {lyingkitZone, lyingkitTraceBody, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9233118763c35e7a8f493df7bc7afd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9233118763c35e7a8f493df7bc7afd4");
            return;
        }
        this.g = "";
        this.h = "";
        if (b.b != null) {
            this.w = Build.VERSION.RELEASE;
        }
        this.n = "Android";
        this.r = str;
        this.o = lyingkitZone.b;
        this.p = lyingkitZone.c;
        this.q = lyingkitZone.e;
        if (lyingkitTraceBody != null) {
            this.m = lyingkitTraceBody.m > 0 ? lyingkitTraceBody.m : System.currentTimeMillis();
            this.b = lyingkitTraceBody.b + CommonConstant.Symbol.DOT + str;
            this.c = lyingkitTraceBody.c;
        } else {
            this.m = System.currentTimeMillis();
            this.b = str;
            this.c = lyingkitZone.d;
        }
        if (this.c == null) {
            this.c = new LyingkitExtraInfo("undifend", "belongpage_undifend") { // from class: com.meituan.android.nom.lyingkit.LyingkitTraceBody.1
                @Override // com.meituan.android.nom.lyingkit.LyingkitExtraInfo
                public HashMap<String, Object> getExtraMgeMap() {
                    return null;
                }
            };
        }
        this.s = this.c.getClass();
    }

    public LyingkitTraceBody(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cead3960770ab96de0b8b2033bfe8cf4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cead3960770ab96de0b8b2033bfe8cf4");
            return;
        }
        this.g = "";
        this.h = "";
        if (b.b != null) {
            this.w = Build.VERSION.RELEASE;
        }
        this.m = parcel.readLong();
        this.b = parcel.readString();
        this.n = parcel.readString();
        this.o = parcel.readString();
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.t = parcel.readString();
        this.l = parcel.readString();
        this.u = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readLong();
        this.y = parcel.readString();
        this.s = (Class) parcel.readSerializable();
        try {
            this.c = (LyingkitExtraInfo) parcel.readParcelable(this.s.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad284a578841549bd59c6a2d1ae83e8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad284a578841549bd59c6a2d1ae83e8c");
            return;
        }
        parcel.writeLong(this.m);
        parcel.writeString(this.b);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(a());
        parcel.writeString(this.l);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeLong(this.x);
        parcel.writeString(this.y);
        parcel.writeSerializable(this.s);
        parcel.writeParcelable(this.c, 1);
    }

    public final String a() {
        Object[] objArr;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "3d35b0a56594e7779ea991cdd82fb042", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "3d35b0a56594e7779ea991cdd82fb042");
        }
        if (TextUtils.isEmpty(this.t)) {
            StringBuilder sb = new StringBuilder();
            if (this.k != null && this.k.length > 0) {
                for (Object obj : this.k) {
                    sb.append(CommonConstant.Symbol.BRACKET_LEFT);
                    if (obj == null) {
                        obj = StringUtil.NULL;
                    }
                    sb.append(obj);
                    sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
                }
            }
            this.t = sb.toString();
        }
        return this.t;
    }

    @WorkerThread
    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6224e5f8f84c8234b2831bfd95d660b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6224e5f8f84c8234b2831bfd95d660b8");
            return;
        }
        Context context = b.b;
        if (context != null) {
            context.getPackageManager();
            try {
                this.u = "";
                this.v = "";
            } catch (Throwable unused) {
            }
            this.x = UserCenter.getInstance(context).getUserId();
            this.y = GetUUID.getInstance().getUUID(context);
        }
    }

    @WorkerThread
    public final Map<String, Object> a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51db56803592f580d6c10b637b7bbe0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51db56803592f580d6c10b637b7bbe0c");
        }
        b();
        HashMap hashMap = new HashMap(64);
        if (i != 1) {
            hashMap.put(SnifferDBHelper.COLUMN_LOG, this.h);
            hashMap.put("apiParams", a());
            hashMap.put("apiResult", this.l);
            hashMap.put("belongPage", this.c != null ? this.c.getBelongPage() : "");
            hashMap.put("serviceName", this.i);
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APINAME, this.j);
            hashMap.put("deviceId", this.y);
        }
        hashMap.put(NetLogConstants.Tags.TRACE_ID, this.y + CommonConstant.Symbol.UNDERLINE + this.m);
        hashMap.put("spanId", this.b);
        hashMap.put("interfaceInvokeTime", String.valueOf((this.f - this.e) / 1000));
        hashMap.put("frameworkInvokeTime", String.valueOf(this.e - this.d));
        hashMap.put("code", this.g);
        hashMap.put("component", this.o);
        hashMap.put("componentVersion", this.p);
        hashMap.put("belongBiz", this.c != null ? this.c.getBelongBiz() : "");
        hashMap.put("apiAlias", this.r);
        hashMap.put("apiEntrance", this.q);
        hashMap.put("app", this.u);
        hashMap.put("appVersion", this.v);
        hashMap.put("osVersion", this.w);
        hashMap.put("platform", this.n);
        hashMap.put(DeviceInfo.USER_ID, Long.valueOf(this.x));
        hashMap.put("extraInfoMap", this.c != null ? this.c.getExtraMgeMap() : null);
        return hashMap;
    }
}
