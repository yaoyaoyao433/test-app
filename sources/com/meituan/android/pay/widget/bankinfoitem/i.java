package com.meituan.android.pay.widget.bankinfoitem;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.meituan.android.pay.model.bean.BankFactor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class i extends j implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    protected Button b;
    protected a c;
    protected boolean d;
    protected boolean e;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);
    }

    public i(Context context, BankFactor bankFactor, com.meituan.android.paybase.widgets.keyboard.a aVar) {
        super(context, bankFactor, null);
        Object[] objArr = {context, bankFactor, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2950e9c4cca97fd4181acf703dbc7319", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2950e9c4cca97fd4181acf703dbc7319");
            return;
        }
        this.d = false;
        this.e = true;
    }

    @Override // com.meituan.android.pay.widget.bankinfoitem.j
    public final View b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45419f3bdd8e669e5959881e67f35350", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45419f3bdd8e669e5959881e67f35350");
        }
        View b = super.b(context);
        this.b = (Button) b.findViewById(R.id.resend_code_btn);
        this.b.setOnClickListener(this);
        b();
        return b;
    }

    @Override // com.meituan.android.pay.widget.bankinfoitem.j
    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "101bf2dd0e931b7fc8447c0a9d4a99f2", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "101bf2dd0e931b7fc8447c0a9d4a99f2") : LayoutInflater.from(context).inflate(R.layout.mpay__smscode_info_item, this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2af6cc4eef76e614814915553864e6f5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2af6cc4eef76e614814915553864e6f5");
        } else if (this.c != null) {
            this.c.a((String) view.getTag());
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0162235d9e5bf21d3ca36758b4d5a8a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0162235d9e5bf21d3ca36758b4d5a8a0");
        } else if (this.b != null) {
            if (j > -1) {
                this.d = true;
                this.b.setText(getContext().getResources().getString(R.string.mpay__resend_sms_code_time_remaining, Long.valueOf(j)));
                this.b.setEnabled(false);
                return;
            }
            this.d = false;
            this.b.setText(R.string.mpay__resend_sms_code);
            if (this.e) {
                return;
            }
            this.b.setEnabled(true);
        }
    }

    public final void setResendButtonState(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72c5493b3bc57fae8ff8c77be24f8e93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72c5493b3bc57fae8ff8c77be24f8e93");
            return;
        }
        this.e = z;
        if (this.b == null || this.d) {
            return;
        }
        this.b.setEnabled(!z ? 1 : 0);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d75d3557dd9c446bf6dddc111f795c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d75d3557dd9c446bf6dddc111f795c1");
        } else if (this.g != null) {
            this.g.setText("");
        }
    }

    public final void setResendButtonTag(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbe6bdc828037f161367f29afe4e31f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbe6bdc828037f161367f29afe4e31f6");
        } else if (this.b != null) {
            this.b.setTag(str);
        }
    }

    public final void setSMSCodeListener(a aVar) {
        this.c = aVar;
    }

    @Override // com.meituan.android.pay.widget.bankinfoitem.j
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72a567f5e9d96ae30a1df53c96f99d65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72a567f5e9d96ae30a1df53c96f99d65");
            return;
        }
        setFilters(a(6));
        setInputType(2);
        if (this.m != null) {
            this.g.setFilters(a(6));
            this.g.setKeyboardBuilder(this.m);
            this.g.setSecurityKeyBoardType(1);
        }
        a(4, getResources().getString(R.string.mpay__bank_item_error_tip_sms_format));
    }

    public final EditText getContentEditText() {
        return this.g;
    }
}
