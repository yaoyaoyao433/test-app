package com.tencent.map.geolocation;

import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.geolocation.internal.TencentExtraKeys;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class TencentLocationRequest {
    public static final int REQUEST_LEVEL_ADMIN_AREA = 3;
    public static final int REQUEST_LEVEL_GEO = 0;
    public static final int REQUEST_LEVEL_NAME = 1;
    public static final int REQUEST_LEVEL_POI = 4;
    private long a;
    private int b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private long g;
    private int h;
    private String i;
    private String j;
    private Bundle k;

    private TencentLocationRequest() {
    }

    public TencentLocationRequest(TencentLocationRequest tencentLocationRequest) {
        this.a = tencentLocationRequest.a;
        this.b = tencentLocationRequest.b;
        this.d = tencentLocationRequest.d;
        this.e = tencentLocationRequest.e;
        this.g = tencentLocationRequest.g;
        this.h = tencentLocationRequest.h;
        this.c = tencentLocationRequest.c;
        this.f = tencentLocationRequest.f;
        this.j = tencentLocationRequest.j;
        this.i = tencentLocationRequest.i;
        this.k = new Bundle();
        this.k.putAll(tencentLocationRequest.k);
    }

    public static void copy(TencentLocationRequest tencentLocationRequest, TencentLocationRequest tencentLocationRequest2) {
        tencentLocationRequest.a = tencentLocationRequest2.a;
        tencentLocationRequest.b = tencentLocationRequest2.b;
        tencentLocationRequest.e = tencentLocationRequest2.e;
        tencentLocationRequest.g = tencentLocationRequest2.g;
        tencentLocationRequest.h = tencentLocationRequest2.h;
        tencentLocationRequest.f = tencentLocationRequest2.f;
        tencentLocationRequest.c = tencentLocationRequest2.c;
        tencentLocationRequest.j = tencentLocationRequest2.j;
        tencentLocationRequest.i = tencentLocationRequest2.i;
        tencentLocationRequest.k.clear();
        tencentLocationRequest.k.putAll(tencentLocationRequest2.k);
    }

    public static TencentLocationRequest create() {
        TencentLocationRequest tencentLocationRequest = new TencentLocationRequest();
        tencentLocationRequest.a = 10000L;
        tencentLocationRequest.b = 1;
        tencentLocationRequest.e = false;
        tencentLocationRequest.f = false;
        tencentLocationRequest.g = Long.MAX_VALUE;
        tencentLocationRequest.h = Integer.MAX_VALUE;
        tencentLocationRequest.c = true;
        tencentLocationRequest.j = "";
        tencentLocationRequest.i = "";
        tencentLocationRequest.k = new Bundle();
        return tencentLocationRequest;
    }

    public final TencentLocationRequest setInterval(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("interval should >= 0");
        }
        this.a = j;
        return this;
    }

    public final TencentLocationRequest setRequestLevel(int i) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TencentExtraKeys.isAllowedLevel(i)) {
            this.b = i;
            return this;
        }
        throw new IllegalArgumentException("request_level: " + i + " not supported!");
    }

    public final TencentLocationRequest setAllowGPS(boolean z) {
        this.c = z;
        return this;
    }

    public final TencentLocationRequest setAllowDirection(boolean z) {
        this.e = z;
        return this;
    }

    public final TencentLocationRequest setIndoorLocationMode(boolean z) {
        this.f = z;
        return this;
    }

    public final TencentLocationRequest setQQ(String str) {
        this.j = str;
        return this;
    }

    public final TencentLocationRequest setSmallAppKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.i = str;
        }
        return this;
    }

    public final String getSmallAppKey() {
        return this.i;
    }

    public final String getQQ() {
        return this.j;
    }

    public final TencentLocationRequest setPhoneNumber(String str) {
        if (str == null) {
            str = "";
        }
        this.k.putString("phoneNumber", str);
        return this;
    }

    public final String getPhoneNumber() {
        String string = this.k.getString("phoneNumber");
        return string == null ? "" : string;
    }

    public final long getInterval() {
        return this.a;
    }

    public final int getRequestLevel() {
        return this.b;
    }

    public final boolean isAllowCache() {
        return this.d;
    }

    public final boolean isAllowGPS() {
        return this.c;
    }

    public final boolean isIndoorLocationMode() {
        return this.f;
    }

    public final boolean isAllowDirection() {
        return this.e;
    }

    public final Bundle getExtras() {
        return this.k;
    }

    public final String toString() {
        return "TencentLocationRequest {interval = " + this.a + "ms, level = " + this.b + ", allowGps = " + this.c + ", allowDirection = " + this.e + ", isIndoorMode = " + this.f + ", QQ = " + this.j + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }
}
