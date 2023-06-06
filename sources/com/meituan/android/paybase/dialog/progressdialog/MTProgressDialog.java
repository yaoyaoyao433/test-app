package com.meituan.android.paybase.dialog.progressdialog;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MTProgressDialog extends Dialog {
    public static ChangeQuickRedirect a;
    private RollingCircleDotView b;
    private ValueAnimator c;
    private String d;
    private int e;

    public MTProgressDialog(Context context) {
        super(context, R.style.paybase__ProgressDialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "365e08b0c2037aa106b6031027cc02ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "365e08b0c2037aa106b6031027cc02ce");
        }
    }

    public MTProgressDialog(Context context, int i, String str) {
        this(context);
        Object[] objArr = {context, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e1e66f4522d59f322720fd058351559", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e1e66f4522d59f322720fd058351559");
            return;
        }
        try {
            if (getContext().getResources().getDrawable(i) == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.d = str;
            this.e = i;
        } catch (Resources.NotFoundException e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "MTProgressDialog_MTProgressDialog").a("message", e.getMessage()).b);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        ImageView imageView;
        TextView textView;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3719014a8fb6210869acbe2fd198d7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3719014a8fb6210869acbe2fd198d7d");
            return;
        }
        super.onCreate(bundle);
        try {
            setContentView(R.layout.paybase__progress_dialog);
            imageView = (ImageView) findViewById(R.id.progress_logo);
            textView = (TextView) findViewById(R.id.progress_text);
            this.b = (RollingCircleDotView) findViewById(R.id.rollingCircleDotView);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "MTProgressDialog_onCreate", (Map<String, Object>) null);
        }
        if (this.e != 0 && !TextUtils.isEmpty(this.d)) {
            findViewById(R.id.progress_logo_loading).setVisibility(0);
            findViewById(R.id.progress_default_loading).setVisibility(8);
            imageView.setImageResource(this.e);
            textView.setText(this.d);
            setCanceledOnTouchOutside(false);
        }
        findViewById(R.id.progress_logo_loading).setVisibility(8);
        findViewById(R.id.progress_default_loading).setVisibility(0);
        View findViewById = findViewById(R.id.progress_default_loading_logo);
        this.c = ValueAnimator.ofInt(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        this.c.addUpdateListener(a.a(findViewById));
        this.c.setRepeatCount(-1);
        this.c.setDuration(450L);
        setCanceledOnTouchOutside(false);
    }

    public static /* synthetic */ void a(View view, ValueAnimator valueAnimator) {
        Object[] objArr = {view, valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b6df1d596d474c832c5667a3db7f0e4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b6df1d596d474c832c5667a3db7f0e4a");
        } else {
            view.setRotation(((Integer) valueAnimator.getAnimatedValue()).intValue() * 40);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81518e389076ae0672c16e34e97ea480", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81518e389076ae0672c16e34e97ea480");
            return;
        }
        super.dismiss();
        if (this.b != null) {
            this.b.b = false;
        }
        if (this.c != null) {
            this.c.cancel();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaeff37eb41e3466436bd1f9c5f68986", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaeff37eb41e3466436bd1f9c5f68986");
            return;
        }
        try {
            super.show();
        } catch (WindowManager.BadTokenException e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "MTProgressDialog_show").a("message", e.getMessage()).b);
        }
        if (this.b != null) {
            this.b.setFlag(true);
            this.b.a();
        }
        if (this.c != null) {
            this.c.start();
        }
    }
}
