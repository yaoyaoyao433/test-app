package com.sankuai.network.debug.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DebugDomainItem extends RelativeLayout implements View.OnClickListener {
    public static ChangeQuickRedirect a = null;
    private static final String b = "DebugDomainItem";
    private Context c;
    private Button d;
    private EditText e;
    private int f;
    private SparseArray g;

    public DebugDomainItem(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ea6f894b9d105d4564e57cbf355e86e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ea6f894b9d105d4564e57cbf355e86e");
        } else {
            this.c = context;
        }
    }

    public DebugDomainItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bc23999a348cc0ae4b8e0816a445575", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bc23999a348cc0ae4b8e0816a445575");
            return;
        }
        this.f = 0;
        this.g = new SparseArray();
        this.c = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.sk_network_itemDomainSelector, R.attr.sk_network_itemDianpingDomain, R.attr.sk_network_itemBetaDomain, R.attr.sk_network_itemPPEDomain, R.attr.sk_network_itemAlphaDomain, R.attr.sk_network_itemYiminDomain, R.attr.sk_network_itemCustomDomain, R.attr.sk_network_itemMobileAPIDomain});
        String string = obtainStyledAttributes.getString(0);
        String string2 = obtainStyledAttributes.getString(1);
        String string3 = obtainStyledAttributes.getString(2);
        String string4 = obtainStyledAttributes.getString(3);
        String string5 = obtainStyledAttributes.getString(4);
        String string6 = obtainStyledAttributes.getString(5);
        String string7 = obtainStyledAttributes.getString(6);
        String string8 = obtainStyledAttributes.getString(7);
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(context).inflate(R.layout.sk_network_debug_domain_item, (ViewGroup) this, true);
        this.d = (Button) inflate.findViewById(R.id.domain_selector);
        this.e = (EditText) inflate.findViewById(R.id.debug_domain);
        this.d.setText(string);
        this.e.setHint(string2);
        if (!TextUtils.isEmpty(string2)) {
            this.g.append(0, string2);
        }
        if (!TextUtils.isEmpty(string3)) {
            this.g.append(1, string3);
        }
        if (!TextUtils.isEmpty(string4)) {
            this.g.append(2, string4);
        }
        if (!TextUtils.isEmpty(string5)) {
            this.g.append(3, string5);
        }
        if (!TextUtils.isEmpty(string6)) {
            this.g.append(4, string6);
        }
        if (!TextUtils.isEmpty(string7)) {
            this.g.append(5, string7);
        }
        if (!TextUtils.isEmpty(string8)) {
            this.g.append(6, string8);
        }
        this.d.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5f68ee3c3cd7571b2c58dd1d34b793c", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5f68ee3c3cd7571b2c58dd1d34b793c");
        } else if (view.getId() == R.id.domain_selector) {
            final String[] strArr = new String[this.g.size()];
            for (int i = 0; i < this.g.size(); i++) {
                strArr[i] = (String) this.g.valueAt(i);
            }
            new AlertDialog.Builder(this.c).setTitle("域名选择").setSingleChoiceItems(strArr, this.f, new DialogInterface.OnClickListener() { // from class: com.sankuai.network.debug.widget.DebugDomainItem.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce9f84cf22bdb233d4956648b11a2f05", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce9f84cf22bdb233d4956648b11a2f05");
                        return;
                    }
                    DebugDomainItem.this.setCurrentSelection(i2);
                    DebugDomainItem.this.e.setText(strArr[i2]);
                    dialogInterface.dismiss();
                }
            }).setNegativeButton(IPaymentManager.NO_ACTION, new DialogInterface.OnClickListener() { // from class: com.sankuai.network.debug.widget.DebugDomainItem.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e6bdae144085de100bee369fb9ade4e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e6bdae144085de100bee369fb9ade4e");
                    }
                }
            }).show();
        }
    }

    public void setCurrentSelection(int i) {
        this.f = i;
    }

    public String getCurrentDomain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f87b23e57f1972338d15422821600b5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f87b23e57f1972338d15422821600b5") : this.e.getText().toString().trim();
    }

    public void setDomain(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86ff58b5b79e37fd4bc67e027c0ca82c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86ff58b5b79e37fd4bc67e027c0ca82c");
            return;
        }
        this.e.setText(str);
        for (int i = 0; i < this.g.size(); i++) {
            if (this.g.valueAt(i) != null && this.g.valueAt(i).equals(str)) {
                this.f = i;
                return;
            }
        }
        this.f = 0;
    }
}
