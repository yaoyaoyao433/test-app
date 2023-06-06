package com.meituan.android.paycommon.lib.widgets;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CheckView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private TextView b;
    private CheckBox c;
    private ImageView d;
    private a e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
    }

    public static /* synthetic */ void a(b bVar, View view) {
        Object[] objArr = {bVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3846180e3daa77c37b61e373cdf98d61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3846180e3daa77c37b61e373cdf98d61");
        }
    }

    public static /* synthetic */ void a(CheckView checkView, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {checkView, compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ddd1005af7b02a3fec90c5ad20a6cfdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ddd1005af7b02a3fec90c5ad20a6cfdf");
        }
    }

    public CheckView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9070f2fd77aefcce0927e3808e861d67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9070f2fd77aefcce0927e3808e861d67");
        } else {
            a(context);
        }
    }

    public CheckView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e580d0487449ada7dccbaafa8f8557a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e580d0487449ada7dccbaafa8f8557a");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f8c04b2fd679e3204a4d52f3d3c9755", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f8c04b2fd679e3204a4d52f3d3c9755");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.paycommon__integration_switch_view, this);
        setGravity(3);
        this.b = (TextView) findViewById(R.id.paycommon__integration_tips);
        this.c = (CheckBox) findViewById(R.id.paycommon__integration_checkbox);
        this.d = (ImageView) findViewById(R.id.paycommon__agreement_icon);
        this.c.setOnCheckedChangeListener(com.meituan.android.paycommon.lib.widgets.a.a(this));
        ((LinearLayout) findViewById(R.id.paycommon__agreement_click_area)).setOnClickListener(com.meituan.android.paycommon.lib.widgets.b.a(this));
    }

    public static /* synthetic */ void a(CheckView checkView, View view) {
        Object[] objArr = {checkView, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd4a0fc95e1eaf980761e424738abdbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd4a0fc95e1eaf980761e424738abdbb");
        } else {
            checkView.c.performClick();
        }
    }

    public void setChecked(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c43ce728c845cb8f36dde6c0db1f2ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c43ce728c845cb8f36dde6c0db1f2ec");
        } else {
            this.c.setChecked(z);
        }
    }

    public void setTips(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43e0b538cf5f7b534a37ee43320194d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43e0b538cf5f7b534a37ee43320194d9");
        } else {
            this.b.setText(str);
        }
    }

    public void setAgreementIconVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "736e5ddac923b354f9d47a94037955d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "736e5ddac923b354f9d47a94037955d4");
        } else {
            this.d.setVisibility(i);
        }
    }

    public void setOnCheckedStatusChangeListener(@Nullable a aVar) {
        this.e = aVar;
    }

    public void setOnClickAgreementListener(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "210919199051f7ad5efe612d553b0394", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "210919199051f7ad5efe612d553b0394");
        } else {
            this.d.setOnClickListener(c.a(bVar));
        }
    }
}
