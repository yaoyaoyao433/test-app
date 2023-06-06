package com.sankuai.waimai.store.order.detail.dialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.ui.common.SCBaseDialog;
import com.sankuai.waimai.store.util.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MedicineInstructionDialog extends SCBaseDialog implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    public TextView b;
    public TextView c;

    public MedicineInstructionDialog(@NonNull Context context) {
        super(context, LayoutInflater.from(context).inflate(R.layout.wm_sc_order_detail_medicine_instruction_dialog_layout, (ViewGroup) null, false), 2131559270);
        View decorView;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "201b0509a03e4c8edd2fc5633e8217a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "201b0509a03e4c8edd2fc5633e8217a3");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ce9e109b1eb068e8c849409c4115923", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ce9e109b1eb068e8c849409c4115923");
            return;
        }
        Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            attributes.gravity = 17;
            attributes.width = h.a(getContext());
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        decorView.setPadding(h.a(context, 30.0f), 0, h.a(context, 30.0f), 0);
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c90dcaf0a04c1abf0a23644562f7064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c90dcaf0a04c1abf0a23644562f7064");
            return;
        }
        super.a(view);
        this.b = (TextView) view.findViewById(R.id.tv_content);
        this.c = (TextView) view.findViewById(R.id.tv_title);
        view.findViewById(R.id.tv_ensure).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f01d3ea1a3a9861bfc2be277c61cbe8", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f01d3ea1a3a9861bfc2be277c61cbe8");
        } else {
            d.a(this);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public ArrayMap<Context, MedicineInstructionDialog> b;

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.store.order.detail.dialog.MedicineInstructionDialog$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C1252a {
            public static final a a = new a();
        }

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79c045d9443e50e5d52e1d8d8e86fb47", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79c045d9443e50e5d52e1d8d8e86fb47");
            } else {
                this.b = new ArrayMap<>();
            }
        }
    }
}
