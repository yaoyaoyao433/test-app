package com.meituan.android.pay.widget.bankinfoitem;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.support.constraint.R;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import com.meituan.android.pay.model.bean.BankFactor;
import com.meituan.android.pay.model.bean.Display;
import com.meituan.android.pay.model.bean.Option;
import com.meituan.android.pay.widget.dialog.WheelViewOptionPickerDialog;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ai;
import com.meituan.android.paybase.widgets.wheelview.WheelViewChooseDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class c extends j implements WheelViewChooseDialog.b {
    public static ChangeQuickRedirect a;
    private BankFactor b;
    private TextWatcher c;
    private Dialog d;

    public c(Context context, BankFactor bankFactor, com.meituan.android.paybase.widgets.keyboard.a aVar) {
        super(context, bankFactor, aVar);
        Object[] objArr = {context, bankFactor, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07dbc9dddc48eb595041a9e5b3ec46fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07dbc9dddc48eb595041a9e5b3ec46fd");
        }
    }

    @Override // com.meituan.android.pay.widget.bankinfoitem.j
    public final View b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf9a1cd1e56ea3107a2751a30442b7b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf9a1cd1e56ea3107a2751a30442b7b1");
        }
        View b = super.b(context);
        List<Option> options = this.b.getOptions();
        if (options != null && options.size() > 1) {
            this.h.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.mpay__ic_down_arrow_normal, 0);
        }
        return b;
    }

    public static /* synthetic */ void a(c cVar, BankFactor bankFactor, View view) {
        Object[] objArr = {cVar, bankFactor, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d98a20508919edd12682310b62848eec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d98a20508919edd12682310b62848eec");
            return;
        }
        if (cVar.m != null && cVar.m.f) {
            cVar.m.a();
        }
        Object[] objArr2 = {bankFactor};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "33997cdab463d7f2c5244695e86f7236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "33997cdab463d7f2c5244695e86f7236");
            return;
        }
        if (cVar.d == null) {
            cVar.d = new WheelViewOptionPickerDialog(cVar.getContext(), cVar, bankFactor.getOptions());
        }
        cVar.d.show();
    }

    @Override // com.meituan.android.pay.widget.bankinfoitem.j
    public final void a(HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b785c244cb2fa14796018094d206600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b785c244cb2fa14796018094d206600");
        } else if (e()) {
            hashMap.put((String) getTag(), this.g.getText().toString().trim().replace(StringUtil.SPACE, ""));
            if (this.h == null || this.b == null || com.meituan.android.paybase.utils.i.a((Collection) this.b.getOptions()) || this.b.getOptions().get(0) == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(getLastCheckedType());
            hashMap.put((String) this.h.getTag(), sb.toString());
        }
    }

    @Override // com.meituan.android.pay.widget.bankinfoitem.j
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c03fb394c3e19546feca9b79bafbffe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c03fb394c3e19546feca9b79bafbffe");
            return;
        }
        if (this.l.getCurrentOption() == null) {
            List<Option> options = this.l.getOptions();
            if (!com.meituan.android.paybase.utils.i.a((Collection) options) && options.get(0) != null) {
                this.l.setCurrentOption(options.get(0));
            }
        }
        if (this.l.getCurrentOption() != null && this.l.getCurrentOption().getDisplay() != null) {
            this.l.setDisplay(this.l.getCurrentOption().getDisplay());
        }
        super.b();
        BankFactor bankFactor = this.l;
        Object[] objArr2 = {bankFactor};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12d85636c7ca9618265829608c745d29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12d85636c7ca9618265829608c745d29");
            return;
        }
        this.b = bankFactor;
        List<Option> options2 = bankFactor.getOptions();
        this.h.setTag(bankFactor.getOptionKey());
        if (bankFactor.getCurrentOption() != null && bankFactor.getCurrentOption().getDisplay() != null && !TextUtils.isEmpty(bankFactor.getCurrentOption().getDisplay().getFactorName())) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_r6c0q5pi_mv", "选择证件类型", new a.c().a("factor_name", bankFactor.getCurrentOption().getDisplay().getFactorName()).b, a.EnumC0329a.VIEW, -1);
        }
        if (com.meituan.android.paybase.utils.i.a((Collection) options2) || options2.size() <= 1) {
            return;
        }
        this.h.setOnClickListener(d.a(this, bankFactor));
    }

    @Override // com.meituan.android.pay.widget.bankinfoitem.j
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "347f1d25d514a972fec0a68d342b3bd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "347f1d25d514a972fec0a68d342b3bd0");
            return;
        }
        this.g.setKeyboardBuilder(this.m);
        if (this.l.isIdentityNum()) {
            int lastCheckedType = getLastCheckedType();
            if (lastCheckedType == 1) {
                c();
            } else if (lastCheckedType == 8) {
                i();
            } else {
                k();
            }
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ac52ec6fc45bd6dd90e5c9879a53eb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ac52ec6fc45bd6dd90e5c9879a53eb8");
            return;
        }
        a(18, getContext().getResources().getString(R.string.mpay__bank_item_error_tip_chinese_identify_card));
        j();
        setFilters(a(20));
        if (this.m != null) {
            this.g.setSecurityKeyBoardType(3);
        }
        if (this.c == null) {
            this.c = new com.meituan.android.paybase.utils.textwatcher.c(this.g);
            this.g.addTextChangedListener(this.c);
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "412f80468896dcf1322aca717fab9081", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "412f80468896dcf1322aca717fab9081");
            return;
        }
        a(8, getContext().getResources().getString(R.string.mpay__bank_item_error_tip_chinese_tw_identify_card));
        setFilters(a(8));
        if (this.m != null) {
            this.g.setSecurityKeyBoardType(1);
        }
        this.g.setContentErrorCheckListener(null);
        l();
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5756f79a35ba56512730da4ea14f87d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5756f79a35ba56512730da4ea14f87d0");
        } else {
            this.g.setContentErrorCheckListener(e.a(this));
        }
    }

    public static /* synthetic */ void d(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1536b983a628a35716b46d0ae182fd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1536b983a628a35716b46d0ae182fd3");
        } else if (cVar.g.getText().toString().trim().length() == 20) {
            if (!com.meituan.android.paybase.utils.o.a(cVar.g.getText().toString().replaceAll(StringUtil.SPACE, ""))) {
                cVar.a(cVar.getContext().getResources().getString(R.string.mpay__bank_item_error_tip_identity_card_format));
            } else {
                cVar.h();
            }
        } else {
            cVar.h();
        }
    }

    @Override // com.meituan.android.paybase.widgets.wheelview.WheelViewChooseDialog.b
    public final void a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84eae9f5605729edaca5921d8a0cc2a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84eae9f5605729edaca5921d8a0cc2a1");
            return;
        }
        Option option = (Option) obj;
        Display display = option.getDisplay();
        if (display != null) {
            this.h.setText(display.getFactorName());
            this.g.setHint(display.getFactorTip());
            a(display.getHelp());
            com.meituan.android.paybase.common.analyse.a.a("b_pay_r6c0q5pi_mc", "选择证件类型", new a.c().a("factor_name", display.getFactorName()).b, a.EnumC0329a.CLICK, -1);
            this.b.setDisplay(display);
            h();
            if (getLastCheckedType() != option.getOptionValue()) {
                this.g.setText("");
            }
            if (option.getOptionValue() == 1) {
                ai.a(this);
                c();
                m();
            } else if (option.getOptionValue() == 8) {
                ai.a(this);
                i();
                m();
            } else {
                if (this.m != null) {
                    this.m.a();
                }
                k();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6498fe1f24d7ffb7d2bf3e52e2047539", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6498fe1f24d7ffb7d2bf3e52e2047539");
                } else {
                    new Handler().post(f.a(this));
                }
            }
        }
        this.b.setCurrentOption(option);
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "627fb05dd3a0b011ae1b92abb1959178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "627fb05dd3a0b011ae1b92abb1959178");
            return;
        }
        a(1, "");
        this.g.setSecurityKeyBoardType(-1);
        this.g.setContentErrorCheckListener(null);
        d();
        l();
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ac9050a5a2fe9a60ae794c227420806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ac9050a5a2fe9a60ae794c227420806");
        } else if (getLastCheckedType() != 1 || this.c == null) {
        } else {
            this.g.removeTextChangedListener(this.c);
            this.c = null;
        }
    }

    public static /* synthetic */ void b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a97f6fc055fc49b8c7fc762962d3b51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a97f6fc055fc49b8c7fc762962d3b51");
        } else if (!cVar.g.isFocused()) {
            cVar.g.requestFocus();
        } else {
            new Handler().post(h.a(cVar));
        }
    }

    public static /* synthetic */ void c(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e08d020276f574ba02a2a7e222ac4a6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e08d020276f574ba02a2a7e222ac4a6e");
        } else {
            ai.b(cVar.g);
        }
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9603b0e65d5557fe7cb9775a59dea082", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9603b0e65d5557fe7cb9775a59dea082");
        } else {
            new Handler().post(g.a(this));
        }
    }

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d182f98255e32987d00dcf8f8ab5d6c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d182f98255e32987d00dcf8f8ab5d6c4");
        } else if (!cVar.g.isFocused()) {
            cVar.g.requestFocus();
        } else if (cVar.m != null) {
            cVar.m.a(cVar.g, cVar.g.getShowType());
        }
    }

    private int getLastCheckedType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35ecf11b021564e989f4eb57690f476a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35ecf11b021564e989f4eb57690f476a")).intValue();
        }
        if (this.l.getCurrentOption() != null) {
            return this.l.getCurrentOption().getOptionValue();
        }
        return 0;
    }
}
