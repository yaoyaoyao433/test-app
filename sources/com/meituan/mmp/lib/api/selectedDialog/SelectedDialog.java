package com.meituan.mmp.lib.api.selectedDialog;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.mmp.lib.utils.au;
import com.meituan.mmp.lib.widget.BottomDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SelectedDialog extends BottomDialog {
    public static ChangeQuickRedirect a;
    private List<a> b;

    public SelectedDialog(Activity activity, List<a> list) {
        super(activity);
        Object[] objArr = {activity, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "660d52ba75597e07703edab907be2eaa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "660d52ba75597e07703edab907be2eaa");
        } else {
            this.b = list;
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9ae48363696b2ac0a7ff75ffa3a86dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9ae48363696b2ac0a7ff75ffa3a86dd");
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        setContentView(linearLayout);
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.MMPDialogShowAnimation);
        }
        a(linearLayout);
    }

    private void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3adb1d26876755a16350e5a9368a3cdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3adb1d26876755a16350e5a9368a3cdf");
            return;
        }
        if (this.b != null) {
            for (a aVar : this.b) {
                a(viewGroup, aVar);
            }
        }
        a(viewGroup, new a(null, IPaymentManager.NO_ACTION));
    }

    private void a(ViewGroup viewGroup, final a aVar) {
        Object[] objArr = {viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f75e6036e52f5763eadccff1a0d4fe03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f75e6036e52f5763eadccff1a0d4fe03");
            return;
        }
        TextView textView = new TextView(getContext());
        textView.setBackgroundResource(R.drawable.hera_button_selector);
        textView.setGravity(17);
        textView.setText(aVar.c);
        textView.setTextColor(Color.parseColor("#222222"));
        textView.setTextSize(1, 16.0f);
        textView.setWidth(-1);
        textView.setHeight(au.a(55.0f));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.selectedDialog.SelectedDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d297835bea167761b89d7d82145c86ac", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d297835bea167761b89d7d82145c86ac");
                    return;
                }
                if (aVar.b != null) {
                    aVar.b.onClick(view);
                }
                SelectedDialog.this.dismiss();
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        viewGroup.addView(textView, layoutParams);
    }
}
