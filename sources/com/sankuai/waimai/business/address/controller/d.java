package com.sankuai.waimai.business.address.controller;

import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.address.widget.CustomUnleakedEditText;
import com.sankuai.waimai.foundation.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    CustomUnleakedEditText b;
    ImageView c;
    TextView d;
    Context e;
    public String f;
    public a g;
    boolean h;
    String i;
    public com.sankuai.waimai.platform.widget.emptylayout.d j;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();
    }

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb3d323678fc1a4ad1856ed2e1fbacf9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb3d323678fc1a4ad1856ed2e1fbacf9");
            return;
        }
        this.f = "";
        this.h = false;
        this.i = null;
        this.e = context;
    }

    public final void a(ViewGroup viewGroup, RecyclerView recyclerView) {
        Object[] objArr = {viewGroup, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b81d68ccf862c48eede1b7c0168f4f9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b81d68ccf862c48eede1b7c0168f4f9c");
            return;
        }
        this.c = (ImageView) viewGroup.findViewById(R.id.search_address_clear_image);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.address.controller.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e6d2ed074feab9eee585cd39768f1e0", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e6d2ed074feab9eee585cd39768f1e0");
                    return;
                }
                d.this.b.setText("");
                if (r2 != null) {
                    r2.stopScroll();
                    ((LinearLayoutManager) r2.getLayoutManager()).scrollToPositionWithOffset(0, 0);
                }
                if (d.this.j != null) {
                    d.this.j.h();
                }
            }
        });
        this.d = (TextView) viewGroup.findViewById(R.id.search_address_txt);
        this.d.setSelected(false);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.address.controller.d.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92c9dbde856a58f6fb553ce198da3126", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92c9dbde856a58f6fb553ce198da3126");
                } else if (d.this.g != null) {
                    d.this.h = true;
                    d.this.g.a();
                }
            }
        });
        this.b = (CustomUnleakedEditText) viewGroup.findViewById(R.id.address_search_map_txt);
        this.b.setHint(this.f);
        this.b.requestFocus();
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.sankuai.waimai.business.address.controller.d.3
            public static ChangeQuickRedirect a;

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                Object[] objArr2 = {textView, Integer.valueOf(i), keyEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d6a2804d28737d9fa5e5d71865d3240", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d6a2804d28737d9fa5e5d71865d3240")).booleanValue();
                }
                if (i != 3 || d.this.g == null) {
                    return false;
                }
                d.this.h = true;
                d.this.g.a();
                return true;
            }
        });
        this.b.a();
        this.b.addTextChangedListener(new TextWatcher() { // from class: com.sankuai.waimai.business.address.controller.d.4
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0665c654df20ea7c24f32320bda27924", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0665c654df20ea7c24f32320bda27924");
                } else if (f.a(d.this.e)) {
                } else {
                    String trim = d.this.b.getText().toString().trim();
                    if (!TextUtils.equals(trim, d.this.i) && !TextUtils.isEmpty(d.this.i)) {
                        d.this.h = false;
                    }
                    d.this.i = trim;
                    if (!TextUtils.isEmpty(trim)) {
                        d.this.d.setSelected(true);
                        d.this.c.setVisibility(0);
                    } else {
                        d.this.d.setSelected(false);
                        d.this.c.setVisibility(8);
                    }
                    if (d.this.g != null) {
                        d.this.g.b();
                    }
                }
            }
        });
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2529a014c2dc936ed1ab4a8701819b5c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2529a014c2dc936ed1ab4a8701819b5c") : a(this.b);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a69f9dd8a00fa178ef5e368dd9b574c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a69f9dd8a00fa178ef5e368dd9b574c1");
        } else if (this.b != null) {
            this.b.setText("");
        }
    }

    private static String a(EditText editText) {
        Object[] objArr = {editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1268e52801003b40e66facbb3a15ae1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1268e52801003b40e66facbb3a15ae1") : (editText == null || editText.getText() == null || editText.getText().toString().trim().equals("")) ? "" : editText.getText().toString().trim();
    }
}
