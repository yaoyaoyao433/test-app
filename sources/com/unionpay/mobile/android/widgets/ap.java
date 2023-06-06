package com.unionpay.mobile.android.widgets;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.InputFilter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class ap extends aa implements Handler.Callback {
    private a c;
    private TextView o;
    private Handler p;
    private int q;

    /* loaded from: classes6.dex */
    public interface a {
        void a(z zVar);
    }

    public ap(Context context, int i, JSONObject jSONObject, String str) {
        super(context, i, jSONObject, str);
        this.c = null;
        this.o = null;
        this.p = null;
        this.q = 0;
        j();
        this.c = null;
    }

    public ap(Context context, int i, JSONObject jSONObject, String str, byte b) {
        super(context, i, jSONObject, str);
        this.c = null;
        this.o = null;
        this.p = null;
        this.q = 0;
        j();
    }

    private void a(boolean z, String str) {
        this.o.setText(str);
        this.o.setEnabled(z);
    }

    private void j() {
        this.b.a(new InputFilter.LengthFilter(6));
        this.b.a(2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.unionpay.mobile.android.global.b.n);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(15, -1);
        this.b.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-3419943);
        new LinearLayout.LayoutParams(1, -1);
        this.o = new TextView(getContext());
        this.o.setGravity(17);
        this.o.setText(com.unionpay.mobile.android.languages.c.bD.w);
        this.o.setTextColor(com.unionpay.mobile.android.utils.h.a(-10705958, -5846275, -5846275, -6710887));
        this.o.setTextSize(com.unionpay.mobile.android.global.b.k);
        this.o.setOnClickListener(new aq(this));
        this.b.a(this.o, new LinearLayout.LayoutParams(-2, -1));
    }

    public final void a(int i) {
        this.p = new Handler(this);
        ar arVar = new ar(this, i);
        a(false, String.format(com.unionpay.mobile.android.languages.c.bD.x, Integer.valueOf(i)));
        arVar.start();
    }

    public final void a(a aVar) {
        this.c = aVar;
    }

    @Override // com.unionpay.mobile.android.widgets.ba.a
    public final boolean b() {
        return this.i || 6 == a().length();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unionpay.mobile.android.widgets.ba
    public final String d() {
        return "_input_msg";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.q = message.arg1;
                if (com.unionpay.mobile.android.languages.c.bD != null) {
                    a(false, String.format(com.unionpay.mobile.android.languages.c.bD.x, Integer.valueOf(message.arg1)));
                }
                return true;
            case 1:
                if (com.unionpay.mobile.android.languages.c.bD != null) {
                    a(true, com.unionpay.mobile.android.languages.c.bD.y);
                }
                this.p = null;
                return true;
            default:
                return false;
        }
    }
}
