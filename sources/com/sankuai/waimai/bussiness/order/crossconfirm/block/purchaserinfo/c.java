package com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.base.widget.picker.SingleWheelPicker;
import com.sankuai.waimai.bussiness.order.confirm.model.PhoneInfo;
import com.sankuai.waimai.bussiness.order.confirm.widget.FixedAutoCompleteTextView;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.n;
import com.sankuai.waimai.platform.domain.core.location.PhoneCodeOption;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    private boolean A;
    FixedAutoCompleteTextView e;
    ImageView f;
    FixedAutoCompleteTextView g;
    ImageView h;
    RelativeLayout i;
    f j;
    public View k;
    String l;
    TextView m;
    PhoneCodeOption n;
    List<PhoneCodeOption> o;
    boolean p;
    a q;
    private TextView r;
    private LinearLayout s;
    private ScrollView t;
    private View u;
    private View v;
    private View w;
    private TextView x;
    private TextView y;
    private LinearLayout z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_layout_remarks;
    }

    public static /* synthetic */ void e(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "90cfcd5a8172e3f9cfd05b8a7a07aa33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "90cfcd5a8172e3f9cfd05b8a7a07aa33");
        } else if (cVar.j.b) {
        } else {
            int scrollY = cVar.t.getScrollY();
            cVar.t.scrollBy(0, cVar.s.getTop() - scrollY);
        }
    }

    public static /* synthetic */ void q(c cVar) {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "8374e36a5943128d4188f36d35d8115c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "8374e36a5943128d4188f36d35d8115c");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "0b7c2719f79416ef9ee33c5e456c56fe", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "0b7c2719f79416ef9ee33c5e456c56fe")).booleanValue();
        } else if (cVar.g != null && cVar.e != null && (cVar.g.isPopupShowing() || cVar.e.isPopupShowing())) {
            z = true;
        }
        if (z) {
            return;
        }
        n.a((Activity) cVar.c);
    }

    public c(Context context, ScrollView scrollView, RelativeLayout relativeLayout) {
        super(context);
        Object[] objArr = {context, scrollView, relativeLayout};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7e3f88859f42efbc79dc6919630e107", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7e3f88859f42efbc79dc6919630e107");
            return;
        }
        this.A = true;
        this.p = true;
        this.t = scrollView;
        this.i = relativeLayout;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76b51a0ba8da479b4baffd68a96225b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76b51a0ba8da479b4baffd68a96225b2");
            return;
        }
        this.k = this.b.findViewById(R.id.divider_line_view);
        this.r = (TextView) this.b.findViewById(R.id.remarks_cnt_title);
        this.s = (LinearLayout) this.b.findViewById(R.id.layout_remarks);
        this.e = (FixedAutoCompleteTextView) this.b.findViewById(R.id.remarks_edt_phone);
        this.f = (ImageView) this.b.findViewById(R.id.remarks_clear_phone);
        this.g = (FixedAutoCompleteTextView) this.b.findViewById(R.id.remarks_edit_fc);
        this.h = (ImageView) this.b.findViewById(R.id.remarks_clear_fc);
        this.u = this.b.findViewById(R.id.divider_view);
        this.v = this.b.findViewById(R.id.layout_remarks_card);
        this.w = this.b.findViewById(R.id.layout_remarks_flower_card);
        this.x = (TextView) this.b.findViewById(R.id.remarks_cnt_title_flower);
        this.y = (TextView) this.b.findViewById(R.id.remarks_edit_fc_flower);
        this.y.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e21c8fd3034a1a5dabe93b79aff3da76", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e21c8fd3034a1a5dabe93b79aff3da76");
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("intent_flower_card", c.this.l);
                bundle.putString("intent_poi_id", String.valueOf(c.this.j.c));
                bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, c.this.j.d);
                com.sankuai.waimai.foundation.router.a.a(c.this.c, c.this.c.getString(R.string.wm_order_confirm_remark_flower_jump_url), bundle, 27);
            }
        });
        this.e.setInputType(2);
        this.e.setThreshold(0);
        this.e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.c.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                Object[] objArr3 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "67e17a08aaf701d3efd3368ba46ce9da", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "67e17a08aaf701d3efd3368ba46ce9da");
                } else if (c.this.c == null || ((Activity) c.this.c).isFinishing() || c.this.e == null || c.this.e.getWindowToken() == null) {
                } else {
                    String trim = c.this.e.getText().toString().trim();
                    if (z) {
                        if (!TextUtils.isEmpty(trim)) {
                            c.this.f.setVisibility(0);
                        } else {
                            c.this.f.setVisibility(8);
                            c.this.e.showDropDown();
                        }
                        c.e(c.this);
                        return;
                    }
                    c.this.f.setVisibility(8);
                    if (trim.length() <= 0 || c.this.n == null || trim.length() == c.this.n.ValidDigit) {
                        return;
                    }
                    ae.a(c.this.c, (int) R.string.wm_order_confirm_remark_error_phone);
                }
            }
        });
        this.e.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.c.7
            public static ChangeQuickRedirect a;

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                Object[] objArr3 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1fa701e0e6db807c6e5a5c88431c5ea0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1fa701e0e6db807c6e5a5c88431c5ea0");
                    return;
                }
                n.a((Activity) c.this.c);
                c.this.e.clearFocus();
                c.this.i.requestFocus();
            }
        });
        this.e.addTextChangedListener(new TextWatcher() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.c.8
            public static ChangeQuickRedirect a;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr3 = {editable};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dc15e0f08214cc1c2912ff6e633f74c2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dc15e0f08214cc1c2912ff6e633f74c2");
                } else if (c.this.c == null || ((Activity) c.this.c).isFinishing()) {
                } else {
                    String trim = c.this.e.getText().toString().trim();
                    if (TextUtils.isEmpty(trim)) {
                        c.this.f.setVisibility(8);
                        c.this.e.setHint(c.this.j.f.hint);
                        return;
                    }
                    if (c.this.e.isFocused()) {
                        c.this.f.setVisibility(0);
                        if (c.this.p && "+86".equals(c.this.m.getText().toString().trim()) && trim.length() == 11 && c.this.q != null) {
                            c.this.q.a();
                            c.this.p = false;
                        }
                    } else {
                        c.this.f.setVisibility(8);
                    }
                    c.this.e.setHint("");
                }
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.c.9
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "753f003ffce75d01632a75d5875449a6", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "753f003ffce75d01632a75d5875449a6");
                } else {
                    c.this.e.setText("");
                }
            }
        });
        this.g.setThreshold(0);
        this.g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.c.10
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                Object[] objArr3 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "668e07ae75491b515703fa716d98a5eb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "668e07ae75491b515703fa716d98a5eb");
                } else if (c.this.c == null || ((Activity) c.this.c).isFinishing() || c.this.g == null || c.this.g.getWindowToken() == null) {
                } else {
                    if (z) {
                        if (!TextUtils.isEmpty(c.this.g.getText().toString().trim())) {
                            c.this.h.setVisibility(0);
                        } else {
                            c.this.h.setVisibility(8);
                        }
                        c.this.g.showDropDown();
                        c.e(c.this);
                        return;
                    }
                    c.this.h.setVisibility(8);
                }
            }
        });
        this.g.addTextChangedListener(new TextWatcher() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.c.11
            public static ChangeQuickRedirect a;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr3 = {editable};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f62232567f6d1a98ca56ade21cd4e984", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f62232567f6d1a98ca56ade21cd4e984");
                } else if (c.this.c == null || ((Activity) c.this.c).isFinishing()) {
                } else {
                    if (TextUtils.isEmpty(c.this.g.getText().toString().trim())) {
                        c.this.h.setVisibility(8);
                        return;
                    }
                    if (c.this.g.isFocused()) {
                        c.this.h.setVisibility(0);
                    } else {
                        c.this.h.setVisibility(8);
                    }
                    if (c.this.g.getText().length() == 20) {
                        ae.a(c.this.c, c.this.c.getString(R.string.wm_order_base_max_input_num, 20));
                    }
                }
            }
        });
        this.g.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.c.12
            public static ChangeQuickRedirect a;

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                Object[] objArr3 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4d58afcfe0a35c89294f9a529ea4cae7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4d58afcfe0a35c89294f9a529ea4cae7");
                    return;
                }
                n.a((Activity) c.this.c);
                c.this.g.clearFocus();
                if (TextUtils.isEmpty(c.this.e().toString())) {
                    c.this.i.requestFocus();
                }
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.c.13
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7aa676e1793c4cfb4331549869661aee", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7aa676e1793c4cfb4331549869661aee");
                } else {
                    c.this.g.setText("");
                }
            }
        });
        this.t.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.c.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr3 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e3b976d3ad62227176d882ac708b256d", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e3b976d3ad62227176d882ac708b256d")).booleanValue();
                }
                c.q(c.this);
                return false;
            }
        });
        this.z = (LinearLayout) this.b.findViewById(R.id.phone_number_prefix);
        this.m = (TextView) this.b.findViewById(R.id.phone_number_prefix_tv);
        this.z.setOnClickListener(d.a(this));
    }

    public static /* synthetic */ void a(c cVar, View view) {
        Object[] objArr = {cVar, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c146bdfc5cc64a7bed5ef2c1da5ce20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c146bdfc5cc64a7bed5ef2c1da5ce20");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "5dfa28bdba0fff6862fbd81e0043bf42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "5dfa28bdba0fff6862fbd81e0043bf42");
        } else if (cVar.o == null || cVar.o.size() <= 0) {
        } else {
            SingleWheelPicker a2 = SingleWheelPicker.a(new ArrayList<com.sankuai.waimai.platform.ui.a>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.c.3
                {
                    addAll(c.this.o);
                }
            });
            a2.b = cVar.n;
            Object[] objArr3 = {cVar};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            a2.d = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "88ebd0911c73669ef6e1c4df3c3553e9", RobustBitConfig.DEFAULT_VALUE) ? (SingleWheelPicker.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "88ebd0911c73669ef6e1c4df3c3553e9") : new e(cVar);
            a2.a(((FragmentActivity) cVar.c).getSupportFragmentManager());
        }
    }

    private String a(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ab1be73a63bfb93cbf6a9213746ad0d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ab1be73a63bfb93cbf6a9213746ad0d") : (this.j.f.defaultValues == null || this.j.f.defaultValues.length <= 0 || this.j.f.defaultValues.length <= 0) ? "" : this.j.f.defaultValues[0];
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f98331cc404c34b9d89615b6afe6ea1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f98331cc404c34b9d89615b6afe6ea1") : (TextUtils.isEmpty(str) || !str.contains(CommonConstant.Symbol.UNDERLINE)) ? "86" : str.split(CommonConstant.Symbol.UNDERLINE)[0];
    }

    private String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc4afc707de6983c4821955865fcf4fc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc4afc707de6983c4821955865fcf4fc") : (TextUtils.isEmpty(str) || !str.contains(CommonConstant.Symbol.UNDERLINE)) ? str : str.split(CommonConstant.Symbol.UNDERLINE)[1];
    }

    @NonNull
    public final PhoneInfo e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8f89d61503d6861b3cc391dd2d51c1f", RobustBitConfig.DEFAULT_VALUE) ? (PhoneInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8f89d61503d6861b3cc391dd2d51c1f") : new PhoneInfo() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.c.4
            {
                this.code = c.this.n == null ? "86" : c.this.n.code;
                this.phone = c.this.e.getText().toString().trim();
                this.valid_digit = c.this.n == null ? 11 : c.this.n.ValidDigit;
            }
        };
    }

    public final String a(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac3d362c1f4106ce391e59bb5266896c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac3d362c1f4106ce391e59bb5266896c");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3adf9eaf0defba4f400337a64b088895", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3adf9eaf0defba4f400337a64b088895");
        } else {
            String str3 = new String();
            String obj = b(this.j) ? this.l : this.g.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                str2 = str3;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(TextUtils.isEmpty(str3) ? "" : StringUtil.SPACE);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(this.j.e == 1 ? this.c.getString(R.string.wm_order_confirm_post_card_content) : this.c.getString(R.string.wm_order_confirm_greeting_on_cake_1));
                sb3.append(obj);
                str2 = sb3.toString();
            }
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        sb4.append(TextUtils.isEmpty(str2) ? "" : StringUtil.SPACE);
        String sb5 = sb4.toString();
        return sb5 + this.c.getString(R.string.wm_order_confirm_other_notes) + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.f r13) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.c.a(com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.f):void");
    }

    private PhoneCodeOption d(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "debc6c335ee8ab3840c647cbbf183842", RobustBitConfig.DEFAULT_VALUE)) {
            return (PhoneCodeOption) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "debc6c335ee8ab3840c647cbbf183842");
        }
        PhoneCodeOption phoneCodeOption = new PhoneCodeOption() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.c.5
            {
                this.code = TextUtils.isEmpty(str) ? "86" : str;
                this.ValidDigit = 11;
            }
        };
        return (this.o == null || this.o.size() == 0 || !this.o.contains(phoneCodeOption)) ? phoneCodeOption : this.o.get(this.o.indexOf(phoneCodeOption));
    }

    private boolean b(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96302c283fd55ee54ae4dac3c8b0f1dc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96302c283fd55ee54ae4dac3c8b0f1dc")).booleanValue() : (fVar == null || fVar.e != 1 || fVar.b) ? false : true;
    }
}
