package com.meituan.passport.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PassportToolbar extends Toolbar {
    public static ChangeQuickRedirect p;
    public TextView q;
    private TextView r;
    private FrameLayout s;
    private TextView t;

    public PassportToolbar(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd89cd54bcfca63da5cfff5dca93861", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd89cd54bcfca63da5cfff5dca93861");
        }
    }

    public PassportToolbar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b16ec1bbddbffad152338d2dc0b89ec9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b16ec1bbddbffad152338d2dc0b89ec9");
        }
    }

    public PassportToolbar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14d37df6d548b744c5655a0a9fc0bbe1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14d37df6d548b744c5655a0a9fc0bbe1");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = p;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf6c7d99246f4aa21cbd66060ba7a7ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf6c7d99246f4aa21cbd66060ba7a7ff");
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.passport_toolbar_customed, (ViewGroup) this, true);
        this.r = (TextView) findViewById(R.id.close_button);
        this.t = (TextView) findViewById(R.id.title_text);
        this.q = (TextView) findViewById(R.id.menu);
        this.s = (FrameLayout) findViewById(R.id.close_button_layout);
        setContainerBackground(-1);
    }

    public final void a(@DrawableRes int i, View.OnClickListener onClickListener) {
        Object[] objArr = {Integer.valueOf(i), onClickListener};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2392ed4f6966846f83f164d89e7d4475", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2392ed4f6966846f83f164d89e7d4475");
            return;
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        try {
            this.r.setBackgroundResource(i);
            if (R.drawable.passport_actionbar_close == i) {
                this.s.setContentDescription(context.getString(R.string.passport_accessibility_actionbar_close));
            } else if (R.drawable.passport_actionbar_back == i) {
                this.s.setContentDescription(context.getString(R.string.passport_accessibility_actionbar_back));
            }
        } catch (Exception unused) {
        }
        this.s.setOnClickListener(onClickListener);
    }

    public void setBackImageColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b65b00bb696a389f5714f70e73e4a124", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b65b00bb696a389f5714f70e73e4a124");
        } else {
            ViewCompat.setBackgroundTintList(this.r, ColorStateList.valueOf(i));
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public void setTitle(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a61afced06ab37116e36ccdc4f944bd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a61afced06ab37116e36ccdc4f944bd0");
        } else {
            this.t.setText(i);
        }
    }

    public void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dd3f8f3941fcb39f8e26b5f3f976f2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dd3f8f3941fcb39f8e26b5f3f976f2d");
        } else {
            this.t.setText(str);
        }
    }

    public final void b(@StringRes int i, View.OnClickListener onClickListener) {
        Object[] objArr = {Integer.valueOf((int) R.string.passport_menu_help), onClickListener};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf662aee988bf98f768261236c36095a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf662aee988bf98f768261236c36095a");
            return;
        }
        this.q.setText(R.string.passport_menu_help);
        this.q.setOnClickListener(onClickListener);
    }

    public void setMenuTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3b5dd56b7255f7090f6373192a9867c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3b5dd56b7255f7090f6373192a9867c");
        } else {
            this.q.setTextColor(i);
        }
    }

    public void setMenuTextSize(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b99c7e4b2e20e1c85729c3aface60a88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b99c7e4b2e20e1c85729c3aface60a88");
        } else {
            this.q.setTextSize(1, f);
        }
    }

    public void setContainerBackground(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51188def3e6dda21f0548e9e5eab67de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51188def3e6dda21f0548e9e5eab67de");
        } else {
            setBackgroundColor(i);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad72b3b49f981b7993f8b0cf2f1586d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad72b3b49f981b7993f8b0cf2f1586d6");
        } else if (!z) {
            if (this.s == null || this.s.getVisibility() != 0) {
                return;
            }
            this.s.setVisibility(4);
        } else if (this.s == null || this.s.getVisibility() != 4) {
        } else {
            this.s.setVisibility(0);
        }
    }
}
