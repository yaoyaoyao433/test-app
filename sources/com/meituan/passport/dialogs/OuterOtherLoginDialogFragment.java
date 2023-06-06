package com.meituan.passport.dialogs;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.passport.dialogs.BottomListDialogFragment;
import com.meituan.passport.pojo.KeyValue;
import com.meituan.passport.utils.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OuterOtherLoginDialogFragment extends BottomListDialogFragment {
    public static ChangeQuickRedirect c;
    private LayoutInflater d;

    @Override // com.meituan.passport.dialogs.BottomListDialogFragment, com.meituan.passport.dialogs.BottomDialogFragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a48923dfa3295c31b1c2d5ee483cf8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a48923dfa3295c31b1c2d5ee483cf8d");
        }
        this.d = layoutInflater;
        return layoutInflater.inflate(R.layout.passport_other_login_dialog, viewGroup, false);
    }

    @Override // com.meituan.passport.dialogs.BottomListDialogFragment, com.meituan.passport.dialogs.BottomDialogFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        List<KeyValue> c2;
        int i = 0;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0453de4997f348aeb0ed6c1778c084", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0453de4997f348aeb0ed6c1778c084");
            return;
        }
        view.setBackgroundColor(a());
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = l.a;
        view.setOnClickListener(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e8a2847468f8d888908c267d30e3b69b", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e8a2847468f8d888908c267d30e3b69b") : new l(this));
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.other_dialog);
        BottomListDialogFragment.a aVar = (BottomListDialogFragment.a) f();
        if (aVar == null || (c2 = aVar.c()) == null || c2.size() == 0) {
            return;
        }
        for (KeyValue keyValue : c2) {
            int i2 = i + 1;
            linearLayout.addView(a(keyValue.key, keyValue.value.b(), linearLayout), i);
            i = i2 + 1;
            linearLayout.addView(e(), i2, d());
        }
        TextView textView = (TextView) linearLayout.findViewById(R.id.cancel);
        textView.setTextSize(1, 16.0f);
        ((LinearLayout.LayoutParams) textView.getLayoutParams()).height = Utils.a(getContext(), 48.0f);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.passport.dialogs.OuterOtherLoginDialogFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr3 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "03616cd7dab15bc71b7d1b9dac12bb76", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "03616cd7dab15bc71b7d1b9dac12bb76");
                } else {
                    OuterOtherLoginDialogFragment.this.c();
                }
            }
        });
    }

    public static /* synthetic */ void a(OuterOtherLoginDialogFragment outerOtherLoginDialogFragment, View view) {
        Object[] objArr = {outerOtherLoginDialogFragment, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58df9f17404adf6d505127e21dfceb0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58df9f17404adf6d505127e21dfceb0f");
        } else {
            outerOtherLoginDialogFragment.c();
        }
    }

    @Override // com.meituan.passport.dialogs.BottomListDialogFragment
    public final View a(String str, String str2, ViewGroup viewGroup) {
        Object[] objArr = {str, str2, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fb822c9de64a71de0e2c1b16e113b81", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fb822c9de64a71de0e2c1b16e113b81");
        }
        LinearLayout linearLayout = (LinearLayout) this.d.inflate(R.layout.passport_other_login_dialog_item, viewGroup, false);
        TextView textView = (TextView) linearLayout.findViewById(R.id.other_item_text);
        textView.setText(str2);
        textView.setTextSize(1, 16.0f);
        ((LinearLayout.LayoutParams) textView.getLayoutParams()).height = Utils.a(getContext(), 48.0f);
        linearLayout.setOnClickListener(this);
        linearLayout.setTag(str);
        return linearLayout;
    }

    @Override // com.meituan.passport.dialogs.BottomListDialogFragment
    public final View e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5dc8538c62986a45bb0d52963aad9cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5dc8538c62986a45bb0d52963aad9cb");
        }
        View view = new View(getContext());
        view.setBackgroundColor(Color.parseColor("#f2f2f2"));
        return view;
    }
}
