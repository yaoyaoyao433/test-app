package com.unionpay.mobile.android.widgets;

import android.content.Context;
import com.meituan.robust.common.CommonConstant;
import com.unionpay.mobile.android.widgets.ba;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public abstract class z extends ba implements ba.a {
    public z(Context context, JSONObject jSONObject, String str) {
        super(context, jSONObject, str);
    }

    @Override // com.unionpay.mobile.android.widgets.ba
    public final /* bridge */ /* synthetic */ boolean a(String str) {
        return super.a(str);
    }

    @Override // com.unionpay.mobile.android.widgets.ba
    public /* bridge */ /* synthetic */ boolean f() {
        return super.f();
    }

    public String h() {
        StringBuffer stringBuffer = new StringBuffer();
        if (n() != null && a() != null) {
            stringBuffer.append(CommonConstant.Symbol.DOUBLE_QUOTES);
            stringBuffer.append(n());
            stringBuffer.append("\":");
            stringBuffer.append(CommonConstant.Symbol.DOUBLE_QUOTES);
            stringBuffer.append(a());
            stringBuffer.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        return stringBuffer.toString();
    }

    @Override // com.unionpay.mobile.android.widgets.ba
    public final /* bridge */ /* synthetic */ String i() {
        return super.i();
    }
}
