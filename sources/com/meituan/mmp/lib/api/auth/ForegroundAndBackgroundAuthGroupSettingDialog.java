package com.meituan.mmp.lib.api.auth;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ForegroundAndBackgroundAuthGroupSettingDialog extends PageDialog {
    public static ChangeQuickRedirect a;
    a b;
    private Context e;
    private com.meituan.mmp.lib.config.a f;
    private ForegroundAndBackgroundAuthGroup g;
    private RadioButton h;
    private RadioButton i;
    private RadioButton j;
    private View k;
    private RadioGroup.OnCheckedChangeListener l;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    interface a {
        void a(String str);
    }

    public ForegroundAndBackgroundAuthGroupSettingDialog(Context context, com.meituan.mmp.lib.config.a aVar, ForegroundAndBackgroundAuthGroup foregroundAndBackgroundAuthGroup) {
        super(context);
        String str;
        Object[] objArr = {context, aVar, foregroundAndBackgroundAuthGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ec7b15926354de68b3937b1e6eeb1f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ec7b15926354de68b3937b1e6eeb1f3");
            return;
        }
        this.l = new RadioGroup.OnCheckedChangeListener() { // from class: com.meituan.mmp.lib.api.auth.ForegroundAndBackgroundAuthGroupSettingDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                Object[] objArr2 = {radioGroup, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "520f42e5e41ae5ad0ea93114c9cb79b9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "520f42e5e41ae5ad0ea93114c9cb79b9");
                } else {
                    ForegroundAndBackgroundAuthGroup.a(ForegroundAndBackgroundAuthGroupSettingDialog.this.e, ForegroundAndBackgroundAuthGroupSettingDialog.this.f.c(), ForegroundAndBackgroundAuthGroupSettingDialog.this.g, i != R.id.mmp_agree ? i == R.id.mmp_run_time ? 1 : 0 : 2);
                }
            }
        };
        this.e = context;
        this.g = foregroundAndBackgroundAuthGroup;
        this.f = aVar;
        this.k = LayoutInflater.from(context).inflate(R.layout.mmp_setting_background_authgroup, (ViewGroup) null);
        a(this.k);
        String c = this.g.c();
        Object[] objArr2 = {c};
        ChangeQuickRedirect changeQuickRedirect2 = PageDialog.c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cad73ef2f42d4002af3c7d9a26a2bc8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cad73ef2f42d4002af3c7d9a26a2bc8f");
        } else {
            this.d.setText(c);
        }
        TextView textView = (TextView) this.k.findViewById(R.id.mmp_auth_explain);
        if (this.g.b != null) {
            str = this.g.b.e;
        } else {
            str = this.g.c.e;
        }
        textView.setText(this.f.b(str));
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "72ad3b3006dccb280e28d3d8e7273cc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "72ad3b3006dccb280e28d3d8e7273cc4");
            return;
        }
        RadioGroup radioGroup = (RadioGroup) this.k.findViewById(R.id.mmp_select_group);
        this.i = (RadioButton) this.k.findViewById(R.id.mmp_run_time);
        this.h = (RadioButton) this.k.findViewById(R.id.mmp_refuse);
        if (this.g.c != null) {
            this.j = (RadioButton) this.k.findViewById(R.id.mmp_agree);
            this.j.setVisibility(0);
        }
        radioGroup.setOnCheckedChangeListener(this.l);
        switch (this.g.b()) {
            case 0:
                this.h.setChecked(true);
                return;
            case 1:
                this.i.setChecked(true);
                return;
            case 2:
                this.j.setChecked(true);
                return;
            default:
                return;
        }
    }

    @Override // com.meituan.mmp.lib.api.auth.PageDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "154985c6152cc4c21ce9102aa9d1d983", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "154985c6152cc4c21ce9102aa9d1d983");
            return;
        }
        this.b.a(this.g.a());
        super.dismiss();
    }
}
