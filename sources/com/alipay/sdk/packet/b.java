package com.alipay.sdk.packet;

import android.text.TextUtils;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final String b;

    public b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final JSONObject a() {
        if (TextUtils.isEmpty(this.b)) {
            return null;
        }
        try {
            return new JSONObject(this.b);
        } catch (Exception e) {
            com.alipay.sdk.util.d.a(e);
            return null;
        }
    }

    public final String toString() {
        return String.format("<Letter envelop=%s body=%s>", this.a, this.b);
    }
}
