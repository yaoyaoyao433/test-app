package com.sankuai.waimai.business.im.common.plugin.smartreply;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.utils.IMTextUtils;
import com.sankuai.xm.base.util.ab;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends FrameLayout {
    public static ChangeQuickRedirect a;
    String b;
    int c;
    public InterfaceC0734a d;
    private TextView e;
    private EditText f;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.im.common.plugin.smartreply.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0734a {
        void a(boolean z);
    }

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c2853c69153d25ed6eb3526e79fef6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c2853c69153d25ed6eb3526e79fef6a");
            return;
        }
        this.c = 20;
        LayoutInflater.from(getContext()).inflate(R.layout.wm_im_layout_smart_reply_dialog_content_edit, (ViewGroup) this, true);
        this.f = (EditText) findViewById(R.id.edit_im_custom_content);
        this.e = (TextView) findViewById(R.id.txt_im_custom_content_counter);
        this.f.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.c)});
        this.f.addTextChangedListener(new TextWatcher() { // from class: com.sankuai.waimai.business.im.common.plugin.smartreply.a.1
            public static ChangeQuickRedirect a;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1feda2e6c15ede98f1325f5ef112b23", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1feda2e6c15ede98f1325f5ef112b23");
                    return;
                }
                a.this.a(editable.toString().length());
                a.this.b = editable.toString();
            }
        });
        a(-1);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "241b83a3e5f1dfc67bfefdca947fedd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "241b83a3e5f1dfc67bfefdca947fedd8");
        } else if (i < 0) {
            this.e.setText(IMTextUtils.a(new String[]{getResources().getString(R.string.wm_im_smart_reply_content_maxcount, Integer.valueOf(this.c))}, new int[]{-6579301}, new int[]{11}));
            if (this.d != null) {
                this.d.a(false);
            }
        } else if (i == 0) {
            TextView textView = this.e;
            textView.setText(IMTextUtils.a(new String[]{"0", "/" + this.c}, new int[]{-6579301, -6579301}, new int[]{11, 11}));
            if (this.d != null) {
                this.d.a(false);
            }
        } else if (i > 0 && i < this.c) {
            TextView textView2 = this.e;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            textView2.setText(IMTextUtils.a(new String[]{sb.toString(), "/" + this.c}, new int[]{-6579301, -6579301}, new int[]{11, 11}));
            if (this.d != null) {
                this.d.a(true);
            }
        } else if (i >= this.c) {
            TextView textView3 = this.e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            textView3.setText(IMTextUtils.a(new String[]{sb2.toString(), "/" + this.c}, new int[]{-307644, -6579301}, new int[]{11, 11}));
            if (this.d != null) {
                this.d.a(true);
            }
        }
    }

    public final void setTextValidChangedListener(InterfaceC0734a interfaceC0734a) {
        this.d = interfaceC0734a;
    }

    public final String getContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58890e8cc191b7172fe376071792213a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58890e8cc191b7172fe376071792213a") : ab.b(this.b);
    }

    public final void setMaxContentLength(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97312a178df896302c363bd07622c12e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97312a178df896302c363bd07622c12e");
        } else if (i <= 0) {
        } else {
            this.c = i;
            this.f.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
            a(this.f.getText().length());
        }
    }

    public final void setContentHint(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5762bd651fb19cd7baabe63da903652e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5762bd651fb19cd7baabe63da903652e");
        } else {
            this.f.setHint(str);
        }
    }
}
