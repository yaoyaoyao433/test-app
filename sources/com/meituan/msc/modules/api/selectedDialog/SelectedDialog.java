package com.meituan.msc.modules.api.selectedDialog;

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
import com.meituan.msc.common.utils.ar;
import com.meituan.msc.modules.page.widget.BottomDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SelectedDialog extends BottomDialog {
    public static ChangeQuickRedirect a;
    private List<a> c;

    public SelectedDialog(Activity activity, List<a> list) {
        super(activity);
        Object[] objArr = {activity, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c48d82b53397c6f32d355dbc3e4a484b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c48d82b53397c6f32d355dbc3e4a484b");
        } else {
            this.c = list;
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9aaf386f0965799a5a51ed671fb6273", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9aaf386f0965799a5a51ed671fb6273");
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        setContentView(linearLayout);
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.MSCDialogShowAnimation);
        }
        a(linearLayout);
    }

    private void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5e10decb15d263d98bc8963bea0b847", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5e10decb15d263d98bc8963bea0b847");
            return;
        }
        if (this.c != null) {
            for (a aVar : this.c) {
                a(viewGroup, aVar);
            }
        }
        a(viewGroup, new a(null, IPaymentManager.NO_ACTION));
    }

    private void a(ViewGroup viewGroup, final a aVar) {
        Object[] objArr = {viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc2e7f709b7bb05d94c9a6c96c927c77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc2e7f709b7bb05d94c9a6c96c927c77");
            return;
        }
        TextView textView = new TextView(getContext());
        textView.setBackgroundResource(R.drawable.msc_button_selector);
        textView.setGravity(17);
        textView.setText(aVar.c);
        textView.setTextColor(Color.parseColor("#222222"));
        textView.setTextSize(1, 16.0f);
        textView.setWidth(-1);
        textView.setHeight(ar.a(55.0f));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msc.modules.api.selectedDialog.SelectedDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "370bd623fb9368f6589a5e6bf92a8e35", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "370bd623fb9368f6589a5e6bf92a8e35");
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
