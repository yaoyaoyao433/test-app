package com.meituan.msi.api.selectedDialog;

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
import com.meituan.msi.util.ac;
import com.meituan.msi.view.BottomDialog;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46dba7d4917b1041bbfa47b41d27ba61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46dba7d4917b1041bbfa47b41d27ba61");
        } else {
            this.c = list;
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03f265cfab709d86107f0e159c39adeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03f265cfab709d86107f0e159c39adeb");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21f97a95930c22ec94d6fd65594e86fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21f97a95930c22ec94d6fd65594e86fe");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "108f5eac5b1b3ef422497d1d8816c8af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "108f5eac5b1b3ef422497d1d8816c8af");
            return;
        }
        TextView textView = new TextView(getContext());
        textView.setBackgroundResource(R.drawable.msi_button_selector);
        textView.setGravity(17);
        textView.setText(aVar.c);
        textView.setTextColor(Color.parseColor("#222222"));
        textView.setTextSize(1, 16.0f);
        textView.setWidth(-1);
        textView.setHeight(ac.a(55.0f));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msi.api.selectedDialog.SelectedDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e597912facf4e04e66a559be3b89605", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e597912facf4e04e66a559be3b89605");
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
