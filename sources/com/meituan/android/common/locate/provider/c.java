package com.meituan.android.common.locate.provider;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public long n;

    public c(long j, String str, String str2, int i, int i2, int i3, int i4, String str3, String str4, String str5, String str6, String str7, String str8) {
        Object[] objArr = {new Long(j), str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str3, str4, str5, str6, str7, str8};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea0b360d1473f54980846f1d859287b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea0b360d1473f54980846f1d859287b0");
            return;
        }
        this.a = j;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = str;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
    }

    public JSONObject a() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f2f3b2641a348b17ef224947080548a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f2f3b2641a348b17ef224947080548a");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uuid", TextUtils.isEmpty(this.b) ? "" : this.b);
        jSONObject.put("minor", this.d);
        jSONObject.put("major", this.c);
        jSONObject.put("rssi", this.f);
        jSONObject.put("txpower", this.e);
        jSONObject.put("age", (System.currentTimeMillis() - this.a) / 1000);
        jSONObject.put("mac", TextUtils.isEmpty(this.g) ? "" : this.g);
        jSONObject.put("name", TextUtils.isEmpty(this.i) ? "" : this.i);
        jSONObject.put("localName", TextUtils.isEmpty(this.j) ? "" : this.j);
        jSONObject.put("companyData", TextUtils.isEmpty(this.h) ? "" : this.h);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd83f14d24db1b0b10d6a334811fe28f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd83f14d24db1b0b10d6a334811fe28f")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.g.equals(((c) obj).g);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68d6f82a96e25faa07ab8758e7358301", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68d6f82a96e25faa07ab8758e7358301")).intValue();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(this.g);
        }
        return 1;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69e12bea15080f7194e2876ac5a70d66", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69e12bea15080f7194e2876ac5a70d66");
        }
        return "BeaconInfo{updateTime=" + this.a + ", uuid='" + this.b + "', major=" + this.c + ", minor=" + this.d + ", txPower=" + this.e + ", rssi=" + this.f + ", mac='" + this.g + "', manufacDataCompanyCode='" + this.h + "', deviceName='" + this.i + "', localName='" + this.j + "', servceData='" + this.k + "', originData='" + this.l + "', serviceUUid='" + this.m + "', age='" + this.n + "'}";
    }
}
