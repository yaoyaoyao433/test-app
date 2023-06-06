package com.meituan.roodesign.widgets.bottomsheet.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.meituan.roodesign.widgets.internal.b;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BottomSheetTitleBar extends FrameLayout {
    public static ChangeQuickRedirect a;
    private CharSequence b;
    private TextView c;
    private CharSequence d;
    private RooIconFont e;
    private CharSequence f;
    private RooIconFont g;

    public BottomSheetTitleBar(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2a178f1e831538d04723483a6cc77ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2a178f1e831538d04723483a6cc77ed");
        }
    }

    public BottomSheetTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7756f84c779f1a54a3027372db86c4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7756f84c779f1a54a3027372db86c4f");
        }
    }

    public BottomSheetTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "143f1f29ac60fb7aacde3dac64151ab1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "143f1f29ac60fb7aacde3dac64151ab1");
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.roo_bottomsheet_title, (ViewGroup) this, true);
        this.c = (TextView) findViewById(R.id.title);
        this.e = (RooIconFont) findViewById(R.id.rightButton);
        this.g = (RooIconFont) findViewById(R.id.leftButton);
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "282472f7c22fec2fafb68922d2edbbe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "282472f7c22fec2fafb68922d2edbbe6");
            return;
        }
        this.c.setText(this.b);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.e.getLayoutParams();
        if (this.d != null && this.d.length() == 0) {
            this.e.setText(R.string.wm_c_iconfont_76guanbi);
            this.e.setTextSize(22.0f);
            this.e.setTextColor(-16777216);
            layoutParams.rightMargin = getResources().getDimensionPixelSize(R.dimen.roo_bottomsheet_icon_button_margin);
        } else {
            this.e.setText(this.d);
            this.e.setTextSize(16.0f);
            this.e.setTextColor(b.a(this, (int) R.attr.rooGrayDarker));
            layoutParams.rightMargin = getResources().getDimensionPixelSize(R.dimen.roo_bottomsheet_text_button_margin);
        }
        this.e.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.g.getLayoutParams();
        if (this.f != null && this.f.length() == 0) {
            this.g.setText(R.string.wm_c_iconfont_76guanbi);
            this.g.setTextSize(22.0f);
            this.g.setTextColor(-16777216);
            layoutParams2.leftMargin = getResources().getDimensionPixelSize(R.dimen.roo_bottomsheet_icon_button_margin);
        } else {
            this.g.setText(this.f);
            this.g.setTextSize(16.0f);
            this.g.setTextColor(b.a(this, (int) R.attr.rooGrayDarker));
            layoutParams2.leftMargin = getResources().getDimensionPixelSize(R.dimen.roo_bottomsheet_text_button_margin);
        }
        this.g.setLayoutParams(layoutParams2);
        this.c.setVisibility(TextUtils.isEmpty(this.b) ? 8 : 0);
        this.e.setVisibility(this.d == null ? 4 : 0);
        this.g.setVisibility(this.f != null ? 0 : 4);
        setVisibility(this.c.getVisibility() == 0 || this.e.getVisibility() == 0 || this.g.getVisibility() == 0 ? 0 : 8);
    }

    public CharSequence getTitle() {
        return this.b;
    }

    public void setTitle(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c44674a4ed7e39bae45a59a78f9d101", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c44674a4ed7e39bae45a59a78f9d101");
        } else {
            setTitle(getContext().getString(i));
        }
    }

    public void setTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d76f22f07602fd564248b11fafefc53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d76f22f07602fd564248b11fafefc53");
            return;
        }
        this.b = charSequence;
        a();
    }

    @NonNull
    public View getPositiveButton() {
        return this.e;
    }

    public void setPositiveButton(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af7faf6c43cb9161949c35171f6aa22b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af7faf6c43cb9161949c35171f6aa22b");
            return;
        }
        this.d = charSequence;
        a();
    }

    @NonNull
    public View getNegativeButton() {
        return this.g;
    }

    public void setNegativeButton(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7940acb25691e12cafd79f380c67a352", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7940acb25691e12cafd79f380c67a352");
            return;
        }
        this.f = charSequence;
        a();
    }
}
