package com.meituan.msc.modules.api.auth;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.meituan.msc.modules.update.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ForegroundAndBackgroundAuthGroupSettingDialog extends PageDialog {
    public static ChangeQuickRedirect a;
    a b;
    private Context e;
    private f f;
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

    public ForegroundAndBackgroundAuthGroupSettingDialog(Context context, f fVar, ForegroundAndBackgroundAuthGroup foregroundAndBackgroundAuthGroup) {
        super(context);
        String str;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        String optString;
        Object[] objArr = {context, fVar, foregroundAndBackgroundAuthGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f58cb4a51be7601f44dd32a56991bb60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f58cb4a51be7601f44dd32a56991bb60");
            return;
        }
        this.l = new RadioGroup.OnCheckedChangeListener() { // from class: com.meituan.msc.modules.api.auth.ForegroundAndBackgroundAuthGroupSettingDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                Object[] objArr2 = {radioGroup, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "321fd4d8ff7ef7faed0fe6002bb3a95c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "321fd4d8ff7ef7faed0fe6002bb3a95c");
                } else {
                    ForegroundAndBackgroundAuthGroup.a(ForegroundAndBackgroundAuthGroupSettingDialog.this.e, ForegroundAndBackgroundAuthGroupSettingDialog.this.f.j(), ForegroundAndBackgroundAuthGroupSettingDialog.this.g, i != R.id.msc_agree ? i == R.id.msc_run_time ? 1 : 0 : 2);
                }
            }
        };
        this.e = context;
        this.f = fVar;
        this.g = foregroundAndBackgroundAuthGroup;
        this.k = LayoutInflater.from(context).inflate(R.layout.msc_setting_background_authgroup, (ViewGroup) null);
        a(this.k);
        String c = this.g.c();
        Object[] objArr2 = {c};
        ChangeQuickRedirect changeQuickRedirect2 = PageDialog.c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31ec91ddc7eb0ad322e9cdc568f257da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31ec91ddc7eb0ad322e9cdc568f257da");
        } else {
            this.d.setText(c);
        }
        TextView textView = (TextView) this.k.findViewById(R.id.msc_auth_explain);
        if (this.g.b != null) {
            str = this.g.b.e;
        } else {
            str = this.g.c.e;
        }
        String str2 = str;
        Object[] objArr3 = {str2};
        ChangeQuickRedirect changeQuickRedirect3 = f.a;
        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "1df3034e6ec3c317d0d809ef92f834e6", RobustBitConfig.DEFAULT_VALUE)) {
            optString = (String) PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "1df3034e6ec3c317d0d809ef92f834e6");
        } else {
            com.meituan.msc.modules.update.a aVar = fVar.U_().s;
            Object[] objArr4 = {str2};
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.update.a.a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "e830b6474aab720151814150bd9d2e04", RobustBitConfig.DEFAULT_VALUE)) {
                optString = (String) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "e830b6474aab720151814150bd9d2e04");
            } else {
                Object[] objArr5 = {str2};
                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.update.a.a;
                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "90b6844f4e11ec156686be1fcb26de19", RobustBitConfig.DEFAULT_VALUE)) {
                    optJSONObject2 = (JSONObject) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "90b6844f4e11ec156686be1fcb26de19");
                } else {
                    optJSONObject2 = (aVar.b == null || (optJSONObject = aVar.b.optJSONObject("permission")) == null) ? null : optJSONObject.optJSONObject(str2);
                }
                optString = optJSONObject2 != null ? optJSONObject2.optString("desc") : null;
            }
        }
        textView.setText(optString);
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d6271e2dea826c04be3f47949529c46e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d6271e2dea826c04be3f47949529c46e");
            return;
        }
        RadioGroup radioGroup = (RadioGroup) this.k.findViewById(R.id.msc_select_group);
        this.i = (RadioButton) this.k.findViewById(R.id.msc_run_time);
        this.h = (RadioButton) this.k.findViewById(R.id.msc_refuse);
        if (this.g.c != null) {
            this.j = (RadioButton) this.k.findViewById(R.id.msc_agree);
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

    @Override // com.meituan.msc.modules.api.auth.PageDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea493a8ab9f7f38bdffbd9c71405d3a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea493a8ab9f7f38bdffbd9c71405d3a3");
            return;
        }
        this.b.a(this.g.a());
        super.dismiss();
    }
}
