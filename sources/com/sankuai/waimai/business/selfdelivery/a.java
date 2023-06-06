package com.sankuai.waimai.business.selfdelivery;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ae;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public Context c;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e65c24d3ec552eed2c22af289d1e578f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e65c24d3ec552eed2c22af289d1e578f");
            return;
        }
        this.b = "http://mapdownload.map.qq.com";
        this.c = context;
    }

    public LinearLayout a(@DrawableRes int i, String str, final String str2, View.OnClickListener onClickListener) {
        Object[] objArr = {Integer.valueOf(i), str, str2, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a93950da149379360bc01b91dfb4e058", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a93950da149379360bc01b91dfb4e058");
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.c).inflate(R.layout.wm_order_self_delivery_map, (ViewGroup) null);
        ((ImageView) linearLayout.findViewById(R.id.map_logo)).setImageResource(i);
        ((TextView) linearLayout.findViewById(R.id.map_name)).setText(str);
        if (onClickListener == null) {
            onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.business.selfdelivery.a.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cbf3e8a47c4e7ad4875f4aa6deede9b6", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cbf3e8a47c4e7ad4875f4aa6deede9b6");
                        return;
                    }
                    try {
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(Uri.parse(str2));
                        a.this.c.startActivity(intent);
                    } catch (Exception unused) {
                        ae.a(a.this.c, a.this.c.getString(R.string.wm_order_self_delivery_conduct_error_msg));
                    }
                }
            };
        }
        linearLayout.setOnClickListener(onClickListener);
        return linearLayout;
    }

    public boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31426ceacc6a1a0c01faa8b8c83882a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31426ceacc6a1a0c01faa8b8c83882a3")).booleanValue();
        }
        try {
            this.c.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
