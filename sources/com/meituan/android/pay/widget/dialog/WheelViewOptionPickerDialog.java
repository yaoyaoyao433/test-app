package com.meituan.android.pay.widget.dialog;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.android.pay.model.bean.Option;
import com.meituan.android.paybase.widgets.wheelview.WheelViewChooseDialog;
import com.meituan.android.paybase.widgets.wheelview.adapter.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WheelViewOptionPickerDialog extends WheelViewChooseDialog {
    public static ChangeQuickRedirect a;
    private List<Option> c;

    @Override // com.meituan.android.paybase.widgets.wheelview.WheelViewChooseDialog
    public final b a() {
        return null;
    }

    public WheelViewOptionPickerDialog(Context context, WheelViewChooseDialog.b bVar, List<Option> list) {
        super(context, bVar);
        Object[] objArr = {context, bVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff219d315c2fe159337947839b60a21b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff219d315c2fe159337947839b60a21b");
        } else {
            this.c = list;
        }
    }

    @Override // com.meituan.android.paybase.widgets.wheelview.WheelViewChooseDialog
    public final b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f2f6e90c452fba8bdc93c22e12a2ce0", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f2f6e90c452fba8bdc93c22e12a2ce0") : new a(getContext(), this.c, 0);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends b {
        public static ChangeQuickRedirect a;

        public a(Context context, List<Option> list, int i) {
            super(context, R.layout.paybase__picker_item, R.id.item_textview, 0, list);
            Object[] objArr = {context, list, 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8de52e32ea5e4f3817681763b6f907e7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8de52e32ea5e4f3817681763b6f907e7");
            }
        }

        @Override // com.meituan.android.paybase.widgets.wheelview.adapter.c
        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e2776577a215e9bbc27a8ebccd566e2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e2776577a215e9bbc27a8ebccd566e2")).intValue() : this.e.size();
        }

        @Override // com.meituan.android.paybase.widgets.wheelview.adapter.b
        public final CharSequence a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "705e7b09bfad34771d24aae55830ab4f", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "705e7b09bfad34771d24aae55830ab4f") : ((Option) this.e.get(i)).getDisplay() != null ? ((Option) this.e.get(i)).getDisplay().getDisplayNameInDialog() : "";
        }
    }
}
