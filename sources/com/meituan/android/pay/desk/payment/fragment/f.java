package com.meituan.android.pay.desk.payment.fragment;

import android.content.Context;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.pay.common.promotion.bean.LabelIcon;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f extends com.meituan.android.paycommon.lib.assist.a<PayLabel> {
    public static ChangeQuickRedirect a;
    public ArrayList<PayLabel> b;
    public ArrayList<PayLabel> c;
    public com.meituan.android.pay.desk.component.fragment.f d;
    public boolean e;
    public String f;
    public String g;
    private boolean l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public ImageView a;
        public TextView b;
        public TextView c;
        public TextView d;
        public TextView e;
        public TextView f;
        public TextView g;
        public LinearLayout h;
        public ProgressBar i;
        public AppCompatCheckBox j;
        public LinearLayout k;
        public LinearLayout l;
        public LinearLayout m;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    public f(Context context, ArrayList<PayLabel> arrayList) {
        super(context, arrayList);
        Object[] objArr = {context, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ad14dbbae26a6b729e5660241018559", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ad14dbbae26a6b729e5660241018559");
            return;
        }
        this.e = false;
        this.l = false;
        this.f = "";
        this.g = "";
    }

    public static /* synthetic */ void a(f fVar, Agreement agreement, View view) {
        Object[] objArr = {fVar, agreement, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a520eb6e87b07bd495a65e7f5ef0860", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a520eb6e87b07bd495a65e7f5ef0860");
        } else {
            fVar.a(agreement.getUrl());
        }
    }

    public static /* synthetic */ void a(f fVar, LabelIcon labelIcon, View view) {
        Object[] objArr = {fVar, labelIcon, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "395aa120468ffe2ac1defd1b717f278e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "395aa120468ffe2ac1defd1b717f278e");
        } else {
            fVar.a(labelIcon.getLink());
        }
    }

    public static /* synthetic */ void a(f fVar, a aVar, View view) {
        Object[] objArr = {fVar, aVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c51f0a3d0b8243dc4297f9a25bf4aef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c51f0a3d0b8243dc4297f9a25bf4aef");
            return;
        }
        fVar.e = true;
        aVar.m.setVisibility(8);
        com.meituan.android.pay.common.analyse.b.b(fVar.b(), "b_pay_hkjo22gm_mc", "新营销权益页点击展开更多按钮", new a.c().a("entry_page", fVar.f).b, fVar.g);
        fVar.notifyDataSetChanged();
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b7996760d22f144edac83279a26f1b3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b7996760d22f144edac83279a26f1b3")).booleanValue() : !com.meituan.android.paybase.utils.i.a((Collection) this.b);
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c9598fd64aa85d528fbf7886c8e4d50", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c9598fd64aa85d528fbf7886c8e4d50") : TextUtils.equals(this.f, "收银台首页") ? "c_PJmoK" : "c_sjk32ngz";
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01c2  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r23, android.view.View r24, android.view.ViewGroup r25) {
        /*
            Method dump skipped, instructions count: 1602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.desk.payment.fragment.f.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15d1494370c68a5b010376d08cef35dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15d1494370c68a5b010376d08cef35dd");
        } else {
            al.a(this.i, str);
        }
    }
}
