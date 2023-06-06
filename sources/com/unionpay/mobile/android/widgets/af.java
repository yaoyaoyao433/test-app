package com.unionpay.mobile.android.widgets;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextWatcher;
import com.meituan.robust.common.StringUtil;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class af extends aa {
    private TextWatcher c;
    private ArrayList<a> o;

    /* loaded from: classes6.dex */
    final class a {
        private String b;
        private String c;
        private String d;

        public a(JSONObject jSONObject) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.b = com.unionpay.mobile.android.utils.j.a(jSONObject, "pattern");
            this.c = com.unionpay.mobile.android.utils.j.a(jSONObject, "prefix");
            this.d = com.unionpay.mobile.android.utils.j.a(jSONObject, "isCheck");
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public final boolean c() {
            return this.d == null || !"false".equalsIgnoreCase(this.d);
        }
    }

    public af(Context context, int i, JSONObject jSONObject, String str) {
        super(context, i, jSONObject, str, (byte) 0);
        this.c = new ag(this);
        this.o = null;
        this.b.a(this.c);
        this.b.a(new InputFilter.LengthFilter(23));
        this.b.a(2);
        if (this.i) {
            this.b.setEnabled(false);
        }
        JSONArray d = com.unionpay.mobile.android.utils.j.d(jSONObject, "regex");
        if (d != null) {
            if (this.o == null) {
                this.o = new ArrayList<>();
            }
            for (int i2 = 0; i2 < d.length(); i2++) {
                JSONObject jSONObject2 = (JSONObject) com.unionpay.mobile.android.utils.j.b(d, i2);
                if (jSONObject2 != null) {
                    this.o.add(new a(jSONObject2));
                }
            }
        }
    }

    private static boolean b(String str) {
        int length = str.length();
        int i = length - 2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i < 0) {
                break;
            }
            int charAt = str.charAt(i) - '0';
            if (i2 % 2 == 0) {
                int i4 = charAt * 2;
                charAt = (i4 % 10) + (i4 / 10);
            }
            i3 += charAt;
            i--;
            i2++;
        }
        int i5 = i3 % 10;
        return (i5 != 0 ? (char) ((10 - i5) + 48) : '0') == str.charAt(length - 1);
    }

    @Override // com.unionpay.mobile.android.widgets.aa, com.unionpay.mobile.android.widgets.ba.a
    public final String a() {
        return (this.i ? i() : this.b.b()).replace(StringUtil.SPACE, "");
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean b() {
        if (this.i) {
            return true;
        }
        String a2 = a();
        if (this.o != null && this.o.size() > 0) {
            boolean z = false;
            for (int i = 0; i < this.o.size(); i++) {
                a aVar = this.o.get(i);
                if (aVar.a() != null) {
                    z = a2.matches(aVar.a());
                }
                if (z) {
                    if (!aVar.c()) {
                        return 13 <= a2.length() && 19 >= a2.length();
                    }
                    return b(aVar.b() + a2);
                }
            }
        }
        return 13 <= a2.length() && 19 >= a2.length() && b(a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.widgets.ba
    public final String d() {
        return "_input_cardNO";
    }
}
