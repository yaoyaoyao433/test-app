package com.meituan.android.pay.desk.component.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.android.pay.common.promotion.bean.Material;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CombineLabelDetailDialogFragment extends MTPayBaseDialogFragment {
    public static ChangeQuickRedirect a;
    public g b;
    private ArrayList<PayLabel> c;
    private Material d;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "CombineLabelDetailDialogFragment";
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment
    public final String b() {
        return "c_pay_ydit6lli";
    }

    public static CombineLabelDetailDialogFragment a(ArrayList<PayLabel> arrayList, Material material) {
        Object[] objArr = {arrayList, material};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b469e3d375e55f1759a15dd1af262afb", RobustBitConfig.DEFAULT_VALUE)) {
            return (CombineLabelDetailDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b469e3d375e55f1759a15dd1af262afb");
        }
        CombineLabelDetailDialogFragment combineLabelDetailDialogFragment = new CombineLabelDetailDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("pay_labels", arrayList);
        bundle.putSerializable("material", material);
        combineLabelDetailDialogFragment.setArguments(bundle);
        return combineLabelDetailDialogFragment;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4db5bc6b35875ed53167dd1b37b2673b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4db5bc6b35875ed53167dd1b37b2673b");
        } else {
            super.onAttach(context);
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9faf034f5109ff6c0327f9456ef2934f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9faf034f5109ff6c0327f9456ef2934f");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.c = (ArrayList) com.sankuai.waimai.platform.utils.f.a(getArguments(), "pay_labels");
            this.d = (Material) com.sankuai.waimai.platform.utils.f.a(getArguments(), "material");
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97e2d2cdebc3d183e83cd663d8937289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97e2d2cdebc3d183e83cd663d8937289");
            return;
        }
        super.onCancel(dialogInterface);
        if (this.b != null) {
            this.b.a(this.c);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcd347cbf51dac7f32e71600c7351bfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcd347cbf51dac7f32e71600c7351bfc");
            return;
        }
        super.onDetach();
        this.b = null;
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f8e32841db447b31711e889b681a00", RobustBitConfig.DEFAULT_VALUE) ? (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f8e32841db447b31711e889b681a00") : new CombineLabelDetailDialog(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class CombineLabelDetailDialog extends BaseDialog {
        public static ChangeQuickRedirect a;

        public CombineLabelDetailDialog(@NonNull Context context) {
            super(context);
            Object[] objArr = {CombineLabelDetailDialogFragment.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d59e5f4f4e3e780957b6a1de63edd99", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d59e5f4f4e3e780957b6a1de63edd99");
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "353cd089b28329a8e51a1f1c84c69e5c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "353cd089b28329a8e51a1f1c84c69e5c");
                return;
            }
            super.onCreate(bundle);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac78d2ef6db045e6b8b46ee2258c86aa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac78d2ef6db045e6b8b46ee2258c86aa");
            } else {
                requestWindowFeature(1);
                setCanceledOnTouchOutside(true);
                setContentView(R.layout.mpay__dialog_disconunt_detail);
                findViewById(R.id.mpay__dialog_cancel).setOnClickListener(a.a(this));
                TextView textView = (TextView) findViewById(R.id.mpay_dialog_title);
                Object[] objArr3 = {textView};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "07d36fd07dc90f28f2e0021fee2061f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "07d36fd07dc90f28f2e0021fee2061f4");
                } else if (CombineLabelDetailDialogFragment.this.d != null && !TextUtils.isEmpty(CombineLabelDetailDialogFragment.this.d.getCombineTitle())) {
                    textView.setText(CombineLabelDetailDialogFragment.this.d.getCombineTitle());
                }
                ((ListView) findViewById(R.id.mpay__discount_list)).setAdapter((ListAdapter) new com.meituan.android.pay.desk.payment.fragment.a(getContext(), CombineLabelDetailDialogFragment.this.c));
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f539ec223a0d81ca7404c8138fb700e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f539ec223a0d81ca7404c8138fb700e0");
                return;
            }
            getWindow().setBackgroundDrawableResource(17170445);
            Display defaultDisplay = CombineLabelDetailDialogFragment.this.getActivity().getWindowManager().getDefaultDisplay();
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            Point point = new Point();
            defaultDisplay.getSize(point);
            attributes.width = point.x;
            attributes.height = (point.y * 7) / 10;
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            getWindow().setWindowAnimations(R.style.paycommon__window_bottom_popup);
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
        }

        public static /* synthetic */ void a(CombineLabelDetailDialog combineLabelDetailDialog, View view) {
            Object[] objArr = {combineLabelDetailDialog, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9aa355b8ad202de7011bae31ad637e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9aa355b8ad202de7011bae31ad637e7");
            } else {
                combineLabelDetailDialog.cancel();
            }
        }
    }
}
