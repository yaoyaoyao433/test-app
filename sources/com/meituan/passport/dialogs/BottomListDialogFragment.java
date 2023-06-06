package com.meituan.passport.dialogs;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.passport.pojo.KeyValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BottomListDialogFragment extends BottomDialogFragment implements View.OnClickListener {
    public static ChangeQuickRedirect b;
    private LayoutInflater c;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        View.OnClickListener b();

        List<KeyValue> c();
    }

    @Override // com.meituan.passport.dialogs.BottomDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea6ac40dc86b788073548e300409ee0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea6ac40dc86b788073548e300409ee0e");
            return;
        }
        super.onCreate(bundle);
        this.c = (LayoutInflater) getContext().getSystemService("layout_inflater");
    }

    @Override // com.meituan.passport.dialogs.BottomDialogFragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa28615a61c0796908a4a98ee7104f6d", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa28615a61c0796908a4a98ee7104f6d") : layoutInflater.inflate(R.layout.passport_fragment_dialog_other_more, viewGroup, false);
    }

    @Override // com.meituan.passport.dialogs.BottomDialogFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        List<KeyValue> c;
        int size;
        int i = 0;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2deded34b38402a144a56703c042ca30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2deded34b38402a144a56703c042ca30");
            return;
        }
        super.onViewCreated(view, bundle);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.passport_more_other);
        a aVar = (a) f();
        if (aVar == null || (c = aVar.c()) == null || c.size() == 0 || (size = c.size() - 1) == 0) {
            return;
        }
        for (KeyValue keyValue : c) {
            View a2 = a(keyValue.key, keyValue.value.b(), linearLayout);
            if (i == 0) {
                a2.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.passport_more_other_login_start_bg_selector));
            } else {
                if (i == size) {
                    a2.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.passport_more_other_login_end_bg_selector));
                }
                linearLayout.addView(e(), d());
            }
            i++;
            linearLayout.addView(a2);
        }
        view.findViewById(R.id.passport_more_other_bg).setOnClickListener(this);
        view.findViewById(R.id.passport_more_other_cancel).setOnClickListener(this);
    }

    public View a(String str, String str2, ViewGroup viewGroup) {
        Object[] objArr = {str, str2, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb653c7b9ecf6af0f0bd382da53b964a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb653c7b9ecf6af0f0bd382da53b964a");
        }
        TextView textView = (TextView) this.c.inflate(R.layout.passport_oauth_more_item, viewGroup, false);
        textView.setText(str2);
        textView.setOnClickListener(this);
        textView.setTag(str);
        return textView;
    }

    public final LinearLayout.LayoutParams d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d25a39d50a8c1287270a8847afa49e60", RobustBitConfig.DEFAULT_VALUE) ? (LinearLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d25a39d50a8c1287270a8847afa49e60") : new LinearLayout.LayoutParams(-1, 1);
    }

    public View e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34bfeeca558dfb1aca17ec7ea45f9ee2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34bfeeca558dfb1aca17ec7ea45f9ee2");
        }
        View view = new View(getContext());
        view.setBackgroundColor(Color.parseColor("#C74D4D4D"));
        return view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar;
        View.OnClickListener b2;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c341c89b859626f4994ecb95bbf0f340", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c341c89b859626f4994ecb95bbf0f340");
            return;
        }
        c();
        Object tag = view.getTag();
        if (tag == null || !(tag instanceof String) || (aVar = (a) f()) == null || (b2 = aVar.b()) == null) {
            return;
        }
        b2.onClick(view);
    }

    public final <T> T f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60dbd8821b1637319644e02e55ec53cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60dbd8821b1637319644e02e55ec53cc");
        }
        try {
            return (T) getParentFragment();
        } catch (Exception unused) {
            return null;
        }
    }
}
