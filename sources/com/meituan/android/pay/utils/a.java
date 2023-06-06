package com.meituan.android.pay.utils;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.model.bean.BankFactor;
import com.meituan.android.pay.retrofit.PayRequestService;
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
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static InterfaceC0327a b = null;
    private static EditTextWithClearAndHelpButton.d c = null;
    private static int d = 16711696;
    private static String e = "";
    private static boolean f = false;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.pay.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0327a {
        com.meituan.android.pay.widget.bankinfoitem.j a(BankFactor bankFactor);
    }

    public static void a(InterfaceC0327a interfaceC0327a) {
        b = interfaceC0327a;
    }

    public static void a(EditTextWithClearAndHelpButton.d dVar) {
        c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f9  */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v59, types: [com.meituan.android.pay.widget.bankinfoitem.j] */
    @android.annotation.SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.view.View r40, android.app.Activity r41, @android.support.annotation.Nullable java.util.List<java.util.List<com.meituan.android.pay.model.bean.BankFactor>> r42, boolean r43, com.meituan.android.pay.widget.EditTextWithClearAndHelpButton.b r44, com.meituan.android.paybase.retrofit.b r45, com.meituan.android.paybase.widgets.keyboard.a r46, boolean r47, int r48) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.utils.a.a(android.view.View, android.app.Activity, java.util.List, boolean, com.meituan.android.pay.widget.EditTextWithClearAndHelpButton$b, com.meituan.android.paybase.retrofit.b, com.meituan.android.paybase.widgets.keyboard.a, boolean, int):void");
    }

    public static List<BankFactor> a(@Nullable List<List<BankFactor>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c1dca74b325c5dfc5b80a9558ea6a0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c1dca74b325c5dfc5b80a9558ea6a0e");
        }
        ArrayList arrayList = new ArrayList();
        if (com.meituan.android.paybase.utils.i.a((Collection) list)) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            for (BankFactor bankFactor : list.get(i)) {
                if (bankFactor.canBeShownInReadOnlyContainer()) {
                    arrayList.add(bankFactor);
                }
            }
        }
        return arrayList;
    }

    public static void a(View view, @Nullable List<BankFactor> list, Context context) {
        ViewGroup viewGroup;
        String sb;
        Object[] objArr = {view, list, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4cdeae01893b4f0b121b62ce7b2f210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4cdeae01893b4f0b121b62ce7b2f210");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.read_only_bankinfo_container);
        linearLayout.removeAllViews();
        if (com.meituan.android.paybase.utils.i.a((Collection) list)) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        for (int i = 0; i < list.size(); i++) {
            BankFactor bankFactor = list.get(i);
            Object[] objArr2 = {bankFactor, context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6dd480955a51d26e270164f3778b678c", RobustBitConfig.DEFAULT_VALUE)) {
                viewGroup = (ViewGroup) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6dd480955a51d26e270164f3778b678c");
            } else {
                ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.mpay__readonly_bankinfo_item, (ViewGroup) null);
                TextView textView = (TextView) viewGroup2.findViewById(R.id.readonly_key);
                TextView textView2 = (TextView) viewGroup2.findViewById(R.id.readonly_value);
                if (bankFactor.getDisplay() != null && !TextUtils.isEmpty(bankFactor.getDisplay().getFactorName())) {
                    textView.setText(bankFactor.getDisplay().getFactorName());
                }
                String defaultValue = bankFactor.getDefaultValue();
                if (!TextUtils.isEmpty(defaultValue)) {
                    if (bankFactor.isBankCardNum()) {
                        Object[] objArr3 = {defaultValue};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5acd3d7f7c885f1355d1ca2b349c8479", RobustBitConfig.DEFAULT_VALUE)) {
                            sb = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5acd3d7f7c885f1355d1ca2b349c8479");
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            int i2 = 0;
                            while (i2 < defaultValue.length()) {
                                sb2.append(defaultValue.charAt(i2));
                                i2++;
                                if (i2 % 4 == 0) {
                                    sb2.append(StringUtil.SPACE);
                                }
                            }
                            sb = sb2.toString();
                        }
                        defaultValue = sb;
                    }
                    textView2.setText(defaultValue);
                }
                viewGroup = viewGroup2;
            }
            viewGroup.setTag(list.get(i).getFactorKey());
            linearLayout.addView(viewGroup);
        }
    }

    public static HashMap<String, String> a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee3dbfeae3a63982359522f7a401fa93", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee3dbfeae3a63982359522f7a401fa93");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bankinfo_container);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup viewGroup2 = (ViewGroup) ((ViewGroup) viewGroup.getChildAt(i)).getChildAt(1);
            int childCount2 = viewGroup2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt = viewGroup2.getChildAt(i2);
                if (childAt instanceof com.meituan.android.pay.widget.bankinfoitem.j) {
                    ((com.meituan.android.pay.widget.bankinfoitem.j) childAt).a(hashMap);
                }
            }
        }
        return hashMap;
    }

    public static /* synthetic */ void a(int i, com.meituan.android.paybase.retrofit.b bVar, Activity activity, BankFactor bankFactor, View view, boolean z, Button button, String str) {
        Object[] objArr = {Integer.valueOf(i), bVar, activity, bankFactor, view, Byte.valueOf(z ? (byte) 1 : (byte) 0), button, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a194d0aaf7ff9dfa282b0c2512540390", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a194d0aaf7ff9dfa282b0c2512540390");
            return;
        }
        if (!f) {
            f = true;
            com.meituan.android.paybase.common.analyse.a.a("b_feru0j2t", "添加银行卡页面_输入银行卡号", new a.c().a("isInput", "1").b, a.EnumC0329a.CLICK, -1);
        }
        if (str.length() >= i) {
            String substring = str.substring(0, i);
            if (!e.equals(substring) && bVar != null) {
                e.b(activity);
                com.meituan.android.pay.common.payment.utils.b.a(activity, "current_url", bankFactor.getCardbinUrl());
                ((PayRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(PayRequestService.class, bVar, 0)).getCardBinTip(bankFactor.getCardbinUrl(), str.substring(0, i), com.meituan.android.pay.common.payment.utils.b.c(activity), !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.a(activity)) ? com.meituan.android.pay.common.payment.utils.b.a(activity) : com.meituan.android.pay.common.payment.utils.b.b(activity, "nb_source"), com.meituan.android.paycommon.lib.config.a.a().o());
                e = substring;
                com.meituan.android.paybase.common.analyse.a.a("b_ij4fbhno", (Map<String, Object>) null);
            }
        } else {
            view.findViewById(R.id.bank_name).setVisibility(8);
            view.findViewById(R.id.bank_icon).setVisibility(8);
            view.findViewById(R.id.bank_limit).setVisibility(8);
            if (!z) {
                view.findViewById(R.id.check_bank_limit).setVisibility(8);
                view.findViewById(R.id.bank_tips).setVisibility(8);
            }
            view.findViewById(R.id.discount_labels).setVisibility(8);
            e = "";
        }
        if (str.length() >= 12) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7974400961ab19081529a9470794d3f6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7974400961ab19081529a9470794d3f6") : !TextUtils.isEmpty(str) ? str.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2") : str;
    }

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da34d4b93f756c0268a21d0d661a6805", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da34d4b93f756c0268a21d0d661a6805")).booleanValue();
        }
        try {
            Class.forName("com.meituan.android.ocr.DisplayCardNumActivity");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
