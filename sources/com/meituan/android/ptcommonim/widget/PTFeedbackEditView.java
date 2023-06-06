package com.meituan.android.ptcommonim.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTFeedbackEditView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private AppCompatEditText b;
    private TextView c;
    private int d;
    private rx.functions.c<String, Object> e;

    public PTFeedbackEditView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91e8b88a5d40ff428a0b56a8d73e9095", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91e8b88a5d40ff428a0b56a8d73e9095");
            return;
        }
        this.d = 100;
        a(context);
    }

    public PTFeedbackEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c59238cb66d76ecec42167d5409c16ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c59238cb66d76ecec42167d5409c16ea");
            return;
        }
        this.d = 100;
        a(context);
    }

    public PTFeedbackEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cdef10edb0fc0a00054bc7c76f2c228", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cdef10edb0fc0a00054bc7c76f2c228");
            return;
        }
        this.d = 100;
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40d065dd09a6f60a67074e764f4407b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40d065dd09a6f60a67074e764f4407b9");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.ptim_feedback_edit_layout, this);
        this.b = (AppCompatEditText) findViewById(R.id.feedback_edittext_view);
        this.c = (TextView) findViewById(R.id.feedback_edittext_count);
        this.b.addTextChangedListener(new TextWatcher() { // from class: com.meituan.android.ptcommonim.widget.PTFeedbackEditView.1
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c6c4c0969aefd3a6ba118fb5bf06f7a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c6c4c0969aefd3a6ba118fb5bf06f7a");
                    return;
                }
                PTFeedbackEditView.this.a();
                if (PTFeedbackEditView.this.e != null) {
                    PTFeedbackEditView.this.e.a("tag_edit_text", PTFeedbackEditView.this.getInputContent());
                }
            }
        });
        setupLengthFilter(100);
        a();
    }

    private int getCurrentTextCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c93e0e93e65d2eb69273aeb5e866361", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c93e0e93e65d2eb69273aeb5e866361")).intValue();
        }
        if (this.b == null || this.b.getText() == null) {
            return 0;
        }
        return this.b.getText().length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f80c52bbb7f61cf1fea05f46c51cf29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f80c52bbb7f61cf1fea05f46c51cf29");
            return;
        }
        int currentTextCount = getCurrentTextCount();
        int i = this.d;
        this.c.setText(currentTextCount + "/" + i);
    }

    private void setupLengthFilter(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "957e10054604d17c1bc85b3f33adab9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "957e10054604d17c1bc85b3f33adab9c");
        } else {
            this.b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
    }

    public void setMaxCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52d449bb12585247fd3c36b750f5f92c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52d449bb12585247fd3c36b750f5f92c");
            return;
        }
        this.d = i;
        setupLengthFilter(i);
        a();
    }

    public void setInputTips(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d42a681bf064b4292c098cbc6e7d979f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d42a681bf064b4292c098cbc6e7d979f");
        } else if (this.b == null || TextUtils.isEmpty(str)) {
        } else {
            this.b.setHint(str);
        }
    }

    public void setText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69e36c94985c241cb836bb7236d6df20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69e36c94985c241cb836bb7236d6df20");
        } else if (this.b == null || str == null) {
        } else {
            this.b.setText(str);
        }
    }

    @NonNull
    public String getInputContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f965ae91bd76e4baebfb1ecbcf87b28e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f965ae91bd76e4baebfb1ecbcf87b28e") : (this.b == null || this.b.getText() == null) ? "" : this.b.getText().toString();
    }

    public void setVoCallback(rx.functions.c<String, Object> cVar) {
        this.e = cVar;
    }
}
