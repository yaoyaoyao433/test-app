package com.meituan.android.pay.widget.bankinfoitem;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.model.bean.BankFactor;
import com.meituan.android.pay.model.bean.Display;
import com.meituan.android.pay.model.bean.FactorValueSug;
import com.meituan.android.pay.model.bean.Help;
import com.meituan.android.pay.widget.EditTextWithClearAndHelpButton;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class j extends FrameLayout {
    public static ChangeQuickRedirect f;
    private String a;
    private TranslateAnimation b;
    private TranslateAnimation c;
    protected EditTextWithClearAndHelpButton g;
    protected TextView h;
    protected TextView i;
    protected View j;
    protected View k;
    public BankFactor l;
    protected com.meituan.android.paybase.widgets.keyboard.a m;
    protected int n;
    protected boolean o;

    public static /* synthetic */ void a(j jVar, LinearLayout linearLayout, List list) {
        boolean z;
        int i = 2;
        char c = 1;
        Object[] objArr = {linearLayout, list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "6f44f8e71319e484861fe9b190665b71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "6f44f8e71319e484861fe9b190665b71");
            return;
        }
        String replace = jVar.g.getText().toString().replace(StringUtil.SPACE, "");
        if (TextUtils.isEmpty(replace)) {
            jVar.a(linearLayout, list);
        } else if (jVar.f()) {
            jVar.g();
        } else {
            if (replace.length() < 11 && replace.contains("*")) {
                jVar.g.setText("");
            }
            int childCount = linearLayout.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (i2 < childCount) {
                View childAt = linearLayout.getChildAt(i2);
                Object tag = childAt.getTag(R.id.mpay__suggestion_phone_tag);
                if (tag instanceof String) {
                    String str = (String) tag;
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = str;
                    objArr2[c] = replace;
                    ChangeQuickRedirect changeQuickRedirect2 = f;
                    String str2 = str;
                    if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "ebcd3d8fa2144ff3fdc6341ed521ea3e", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "ebcd3d8fa2144ff3fdc6341ed521ea3e")).booleanValue();
                    } else {
                        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(replace) && str2.length() >= replace.length()) {
                            int length = replace.length();
                            int i4 = 0;
                            while (i4 < length) {
                                String str3 = str2;
                                if (str3.charAt(i4) != replace.charAt(i4)) {
                                    break;
                                }
                                i4++;
                                str2 = str3;
                            }
                            if (i4 == length) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                    if (!z) {
                        childAt.setVisibility(8);
                    } else {
                        childAt.setVisibility(0);
                        i3++;
                    }
                }
                i2++;
                i = 2;
                c = 1;
            }
            int dimensionPixelSize = i3 * jVar.getResources().getDimensionPixelSize(R.dimen.mpay__suggestion_item_height);
            if (dimensionPixelSize != linearLayout.getHeight()) {
                if (dimensionPixelSize == 0) {
                    jVar.g();
                    return;
                }
                linearLayout.setVisibility(0);
                com.meituan.android.paybase.common.utils.anim.a.a(linearLayout, 0, (Animator.AnimatorListener) null, dimensionPixelSize);
            }
        }
    }

    public j(Context context, BankFactor bankFactor, com.meituan.android.paybase.widgets.keyboard.a aVar) {
        super(context);
        Object[] objArr = {context, bankFactor, aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "497756cebadb00bb36f0572eb9966b27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "497756cebadb00bb36f0572eb9966b27");
            return;
        }
        this.n = 1;
        this.o = false;
        this.l = bankFactor;
        this.m = aVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b77b85a8a1e10b3825ca92d3b8496df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b77b85a8a1e10b3825ca92d3b8496df");
        } else {
            this.b = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -0.5f, 1, 0.0f);
            this.b.setDuration(100L);
            this.c = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -0.5f);
            this.c.setDuration(100L);
        }
        b(context);
    }

    public View b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a642ac3c43e7eeb40109550ca443e0b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a642ac3c43e7eeb40109550ca443e0b4");
        }
        View a = a(context);
        this.h = (TextView) a.findViewById(R.id.type);
        this.g = (EditTextWithClearAndHelpButton) a.findViewById(R.id.bankinfo_edittext);
        this.i = (TextView) a.findViewById(R.id.bottom_tip);
        this.j = a.findViewById(R.id.divider_up);
        this.k = a.findViewById(R.id.divider_down);
        b();
        return a;
    }

    public View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b8131f5bbf2763629f375fb3c4ee739", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b8131f5bbf2763629f375fb3c4ee739") : LayoutInflater.from(context).inflate(R.layout.mpay__simple_bankinfo_item, this);
    }

    public final void a(Help help) {
        Object[] objArr = {help};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c743b0bc094ab4bade185f3c8ba717b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c743b0bc094ab4bade185f3c8ba717b7");
        } else if (this.g != null) {
            this.g.a(help);
        }
    }

    public void setFactorName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53ca77716640133e53780695ae256f2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53ca77716640133e53780695ae256f2f");
        } else if (this.h != null) {
            this.h.setText(str);
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        Object[] objArr = {inputFilterArr};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a553ef08a6a65602d399214fa303db0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a553ef08a6a65602d399214fa303db0");
        } else if (this.g != null) {
            this.g.setFilters(inputFilterArr);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e0c28d6cf33b3369b46fc94e3c3a6a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e0c28d6cf33b3369b46fc94e3c3a6a8");
        } else if (this.g != null) {
            this.g.setFilters(new InputFilter[0]);
        }
    }

    public void setRawInputType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d1b1155cc9888e2d815919d815ea693", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d1b1155cc9888e2d815919d815ea693");
        } else if (this.g != null) {
            this.g.setRawInputType(i);
        }
    }

    public void setInputType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ba9a9d078fb24abb1c6fd4a5f3baea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ba9a9d078fb24abb1c6fd4a5f3baea8");
        } else if (this.g != null) {
            this.g.setInputType(i);
        }
    }

    public void setContentEditTextHint(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32ff69498ba297f4e9412f170449ed4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32ff69498ba297f4e9412f170449ed4f");
        } else if (this.g != null) {
            this.g.setHint(str);
        }
    }

    public void setContentEditTextId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf48b00cd0dca251a721081d23cb0dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf48b00cd0dca251a721081d23cb0dc");
        } else {
            this.g.setId(i);
        }
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2dc8029b1ea4d3ecfbe28d95a8eb09a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2dc8029b1ea4d3ecfbe28d95a8eb09a")).booleanValue() : (this.g == null || TextUtils.isEmpty(this.g.getText().toString().trim())) ? false : true;
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68f97622f01c8625ed585ccb548fdb06", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68f97622f01c8625ed585ccb548fdb06")).booleanValue() : e() && this.g.getText().toString().replaceAll(StringUtil.SPACE, "").length() >= this.n;
    }

    public void setEditTextListener(EditTextWithClearAndHelpButton.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "140f3330e8ef2175d74cec24c8f2af66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "140f3330e8ef2175d74cec24c8f2af66");
        } else if (this.g != null) {
            this.g.setEditTextListener(dVar);
        }
    }

    public EditTextWithClearAndHelpButton.d getEditTextListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07541210ef4d928d1ae113d90f879125", RobustBitConfig.DEFAULT_VALUE)) {
            return (EditTextWithClearAndHelpButton.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07541210ef4d928d1ae113d90f879125");
        }
        if (this.g != null) {
            return this.g.getEditTextListener();
        }
        return null;
    }

    public void a(HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c170fabe4fb42d32732e960649fcd28f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c170fabe4fb42d32732e960649fcd28f");
        } else if (e()) {
            String trim = this.g.getText().toString().trim();
            if ("user_name".equals(getTag())) {
                hashMap.put((String) getTag(), trim);
            } else if ("user_cellphone".equals(getTag()) && trim.contains("*")) {
                Object tag = this.g.getTag(R.id.mpay__suggestion_phone_edit_tag);
                if (tag instanceof String) {
                    hashMap.put((String) getTag(), ((String) tag).replace(StringUtil.SPACE, ""));
                }
            } else {
                hashMap.put((String) getTag(), trim.replace(StringUtil.SPACE, ""));
            }
        }
    }

    public void setDefaultValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4848ef9c6315db1ffb02ad374025526", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4848ef9c6315db1ffb02ad374025526");
        } else if (this.g != null) {
            this.g.setText(str);
        }
    }

    public void setReadOnly(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a65cfbf2d0c46754214ff4cce92524ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a65cfbf2d0c46754214ff4cce92524ec");
            return;
        }
        this.o = z;
        if (!z || this.g == null) {
            return;
        }
        this.g.setFocusable(false);
        this.g.setCursorVisible(false);
        this.g.setTextColor(getContext().getResources().getColor(R.color.mpay__black1));
    }

    public void setContentDescription(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c43add87ddd6607a2eabd97020793208", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c43add87ddd6607a2eabd97020793208");
        } else if (this.g != null) {
            this.g.setContentDescription(str);
        }
    }

    public void setDrawableHelpButton(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b0032dc4859db48d5014000bffe9744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b0032dc4859db48d5014000bffe9744");
        } else {
            this.g.setDrawableHelpButton(drawable);
        }
    }

    public void setOnClickHelpButton(EditTextWithClearAndHelpButton.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df7b5d8ab5b36c37a1c0ad97427f07b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df7b5d8ab5b36c37a1c0ad97427f07b8");
        } else {
            this.g.setClickHelpButtonListener(bVar);
        }
    }

    public TextView getBottomTip() {
        return this.i;
    }

    public View getDividerUp() {
        return this.j;
    }

    public View getDividerDown() {
        return this.k;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcfd4b1f5d663f1e0e27860cb5f1015f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcfd4b1f5d663f1e0e27860cb5f1015f");
            return;
        }
        if (this.l.getDisplay() != null) {
            Display display = this.l.getDisplay();
            if (!TextUtils.isEmpty(display.getFactorName())) {
                setFactorName(display.getFactorName());
            }
            if (display.getHelp() != null) {
                a(display.getHelp());
            }
            if (!TextUtils.isEmpty(display.getFactorTip())) {
                setContentEditTextHint(display.getFactorTip());
            }
            if (!TextUtils.isEmpty(display.getFactorFootTip())) {
                String factorFootTip = display.getFactorFootTip();
                Object[] objArr2 = {factorFootTip};
                ChangeQuickRedirect changeQuickRedirect2 = f;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed52f8cc9b2ed85c3dae35cc93d9869e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed52f8cc9b2ed85c3dae35cc93d9869e");
                } else {
                    this.i.setVisibility(0);
                    this.i.setText(factorFootTip);
                }
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = f;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8ae56fa68ab3bed752646e55be4904be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8ae56fa68ab3bed752646e55be4904be");
                } else {
                    this.i.setVisibility(8);
                }
            }
        }
        setReadOnly(this.l.isReadOnly());
        setContentDescription(this.l.getFactorKey());
        a();
        setTag(this.l.getFactorKey());
        if (TextUtils.isEmpty(this.l.getDefaultValue())) {
            return;
        }
        setDefaultValue(this.l.getDefaultValue());
    }

    public final InputFilter[] a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3bf08fe42b0346af8b2895927eaa94c", RobustBitConfig.DEFAULT_VALUE) ? (InputFilter[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3bf08fe42b0346af8b2895927eaa94c") : new InputFilter[]{new InputFilter.LengthFilter(i)};
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa2642719becac70e470e2c6eae1131f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa2642719becac70e470e2c6eae1131f");
            return;
        }
        this.g.setKeyboardBuilder(this.m);
        if (this.l.isBankcardCVV2()) {
            setFilters(a(4));
            setInputType(2);
            if (this.m != null) {
                this.g.setSecurityKeyBoardType(1);
            }
            a(3, getContext().getResources().getString(R.string.mpay__bank_item_error_tip_cvs));
        } else if (this.l.isUserPhone()) {
            final ArrayList<FactorValueSug> factorValueSug = this.l.getDisplay().getFactorValueSug();
            Object[] objArr2 = {factorValueSug};
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b56eaeef6d06beac1189fb3de27e36d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b56eaeef6d06beac1189fb3de27e36d");
            } else {
                setFilters(a(13));
                setInputType(2);
                a(11, getContext().getResources().getString(R.string.mpay__bank_item_error_tip_phone));
                this.g.setSecurityKeyBoardType(1);
                this.g.addTextChangedListener(new com.meituan.android.paybase.utils.textwatcher.d(this.g));
                if (!com.meituan.android.paybase.utils.i.a((Collection) factorValueSug)) {
                    this.g.setFocusable(false);
                    FactorValueSug factorValueSug2 = factorValueSug.get(0);
                    this.g.setText(com.meituan.android.pay.utils.a.a(factorValueSug2.getSugValue()));
                    this.g.setTag(R.id.mpay__suggestion_phone_edit_tag, factorValueSug2.getSugValue());
                    TextView textView = (TextView) findViewById(R.id.error_tip);
                    textView.setText(factorValueSug2.getSugText());
                    textView.setVisibility(0);
                    textView.setTextColor(ContextCompat.getColor(getContext(), R.color.paybase__text_color_3));
                    this.g.setOnClickListener(k.a(this));
                }
            }
            final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.suggestion_container);
            if (this.l.getDisplay() == null || com.meituan.android.paybase.utils.i.a((Collection) factorValueSug)) {
                return;
            }
            this.g.setSuggestListener(new EditTextWithClearAndHelpButton.f() { // from class: com.meituan.android.pay.widget.bankinfoitem.j.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.pay.widget.EditTextWithClearAndHelpButton.f
                public final void a() {
                    String str;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e2e1eb5f69276f4f733d9782cd3c72eb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e2e1eb5f69276f4f733d9782cd3c72eb");
                        return;
                    }
                    str = "";
                    if (!j.this.e()) {
                        FactorValueSug factorValueSug3 = (FactorValueSug) factorValueSug.get(0);
                        str = TextUtils.isEmpty(factorValueSug3.getSugValue()) ? "" : factorValueSug3.getSugText();
                        j.this.a(linearLayout, factorValueSug);
                    }
                    com.meituan.android.paybase.common.analyse.a.a("b_f5jLO", "点击手机号输入框", new a.c().a("IS_INTRODUCE", str).b, a.EnumC0329a.CLICK, -1);
                }

                @Override // com.meituan.android.pay.widget.EditTextWithClearAndHelpButton.f
                public final void b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9c1cd95e8585607ab8f877e26124ef92", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9c1cd95e8585607ab8f877e26124ef92");
                    } else {
                        j.a(j.this, linearLayout, factorValueSug);
                    }
                }

                @Override // com.meituan.android.pay.widget.EditTextWithClearAndHelpButton.f
                public final void c() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8d6cb1f5672e930ccc84ab7892bba38a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8d6cb1f5672e930ccc84ab7892bba38a");
                    } else {
                        j.this.g();
                    }
                }
            });
        } else {
            a(1, "");
        }
    }

    public static /* synthetic */ void b(j jVar, View view) {
        Object[] objArr = {jVar, view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be3d4276fbc8a01eb6802e328cc36cc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be3d4276fbc8a01eb6802e328cc36cc1");
            return;
        }
        jVar.g.setFocusable(true);
        jVar.g.setFocusableInTouchMode(true);
        jVar.g.requestFocus();
        jVar.g.findFocus();
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "782613877020f658994089dbdbf53e07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "782613877020f658994089dbdbf53e07");
            return;
        }
        this.n = i;
        this.a = str;
        this.g.setBankItemFocusChangeListener(l.a(this, str));
    }

    public static /* synthetic */ void a(j jVar, String str, View view, boolean z) {
        Object[] objArr = {jVar, str, view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e322b4dd4fc3407d174fcfd4d53eda19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e322b4dd4fc3407d174fcfd4d53eda19");
            return;
        }
        if (jVar.e() && !jVar.f() && !z) {
            jVar.a(str);
        }
        if (z) {
            jVar.h();
        }
        if ((jVar instanceof a) && z) {
            com.meituan.android.paybase.common.analyse.a.a("b_rkoq4tzz", "添加银行卡页面_输入银行卡号", (Map<String, Object>) null, a.EnumC0329a.CLICK, -1);
            com.meituan.android.paybase.common.analyse.a.a("b_feru0j2t", "添加银行卡页面_输入银行卡号", new a.c().a("isInput", "0").b, a.EnumC0329a.CLICK, -1);
        }
    }

    @SuppressLint({"InflateParams"})
    public final void a(LinearLayout linearLayout, List<FactorValueSug> list) {
        Object[] objArr = {linearLayout, list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "667f9aa49536e0f2d7c7f79cc21caa19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "667f9aa49536e0f2d7c7f79cc21caa19");
        } else if (linearLayout != null && !com.meituan.android.paybase.utils.i.a((Collection) list)) {
            linearLayout.removeAllViews();
            linearLayout.setVisibility(0);
            ArrayList arrayList = new ArrayList();
            for (FactorValueSug factorValueSug : list) {
                View inflate = LayoutInflater.from(getContext()).inflate(R.layout.mpay__suggestion_phone_info, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R.id.suggestion_phone_num);
                TextView textView2 = (TextView) inflate.findViewById(R.id.suggestion_text);
                inflate.setTag(R.id.mpay__suggestion_phone_tag, factorValueSug.getSugValue());
                if (textView.getTag() == null) {
                    textView.addTextChangedListener(new com.meituan.android.paybase.utils.textwatcher.d(textView));
                    textView.setTag(new Object());
                }
                String a = com.meituan.android.pay.utils.a.a(factorValueSug.getSugValue());
                textView.setText(a);
                textView2.setText(factorValueSug.getSugText());
                inflate.setOnClickListener(m.a(this, a, factorValueSug));
                linearLayout.addView(inflate);
                arrayList.add(factorValueSug.getSugText());
            }
            com.meituan.android.paybase.common.analyse.a.a("b_SUa0i", "推荐手机号", new a.c().a("IS_INTRODUCE", arrayList).b, a.EnumC0329a.VIEW, -1);
            com.meituan.android.paybase.common.utils.anim.a.a(linearLayout, 100, (Animator.AnimatorListener) null, list.size() * getResources().getDimensionPixelSize(R.dimen.mpay__suggestion_item_height));
        }
    }

    public static /* synthetic */ void a(j jVar, String str, FactorValueSug factorValueSug, View view) {
        Object[] objArr = {jVar, str, factorValueSug, view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "195efdc8d3be78a4a6533a960df3150e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "195efdc8d3be78a4a6533a960df3150e");
            return;
        }
        jVar.g.setText(str);
        jVar.g.setTag(R.id.mpay__suggestion_phone_edit_tag, factorValueSug.getSugValue());
        jVar.g.setFocusable(false);
        jVar.m.a();
        com.meituan.android.paybase.common.analyse.a.a("b_eia1q", "推荐手机号", new a.c().a("IS_INTRODUCE", factorValueSug.getSugText()).b, a.EnumC0329a.CLICK, -1);
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2803216b96764d4725b297386d458e82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2803216b96764d4725b297386d458e82");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.suggestion_container);
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        linearLayout.startAnimation(this.c);
        new Handler().postDelayed(n.a(linearLayout), 100L);
        com.meituan.android.paybase.common.utils.anim.a.a(linearLayout, 100, (Animator.AnimatorListener) null, 1.0f, 0.0f);
    }

    public static /* synthetic */ void a(LinearLayout linearLayout) {
        Object[] objArr = {linearLayout};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "612fe80f55b817c68bb5bab0fd9398ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "612fe80f55b817c68bb5bab0fd9398ee");
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6651e6e1e8c700ba6664aadae47f2787", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6651e6e1e8c700ba6664aadae47f2787");
            return;
        }
        TextView textView = (TextView) findViewById(R.id.error_tip);
        if (textView == null || this.o) {
            return;
        }
        textView.setTextColor(ContextCompat.getColor(getContext(), R.color.mpay__bankinfo_edittext_error_tip));
        textView.setText(str);
        if (textView.getVisibility() != 0) {
            textView.startAnimation(this.b);
            textView.setVisibility(0);
            com.meituan.android.paybase.common.utils.anim.a.a(textView, 100, (Animator.AnimatorListener) null, 0.0f, 1.0f);
        }
        textView.setOnClickListener(o.a(this));
    }

    public static /* synthetic */ void a(j jVar, View view) {
        Object[] objArr = {jVar, view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ff23f2409397be5c957a28d0ea7825d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ff23f2409397be5c957a28d0ea7825d");
        } else {
            jVar.g.requestFocusFromTouch();
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c2cc5caba9708b38fc9aea6fe889fee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c2cc5caba9708b38fc9aea6fe889fee");
            return;
        }
        TextView textView = (TextView) findViewById(R.id.error_tip);
        if (textView == null || textView.getVisibility() == 8) {
            return;
        }
        textView.startAnimation(this.c);
        new Handler().postDelayed(p.a(textView), 100L);
        com.meituan.android.paybase.common.utils.anim.a.a(textView, 100, (Animator.AnimatorListener) null, 1.0f, 0.0f);
    }

    public static /* synthetic */ void a(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "071d63750baa3d9876191d4cfb243327", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "071d63750baa3d9876191d4cfb243327");
        } else {
            textView.setVisibility(8);
        }
    }

    public String getMinimumContentErrorTip() {
        return this.a;
    }

    public EditTextWithClearAndHelpButton getEditText() {
        return this.g;
    }
}
