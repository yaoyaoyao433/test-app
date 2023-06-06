package com.meituan.android.paybase.widgets.wheelview;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.android.paybase.widgets.wheelview.WheelViewChooseDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Calendar;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WheelViewDatePickerDialog extends WheelViewChooseDialog {
    public static ChangeQuickRedirect a;

    public WheelViewDatePickerDialog(Context context, WheelViewChooseDialog.b bVar) {
        super(context, bVar);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2763fb9d0fe7b6871e89af450d80bb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2763fb9d0fe7b6871e89af450d80bb5");
        }
    }

    @Override // com.meituan.android.paybase.widgets.wheelview.WheelViewChooseDialog
    public final com.meituan.android.paybase.widgets.wheelview.adapter.b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4f97f5ceb8ad14df6d71fdd88e0d607", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.paybase.widgets.wheelview.adapter.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4f97f5ceb8ad14df6d71fdd88e0d607");
        }
        int i = Calendar.getInstance().get(1);
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i2 = i - 1; i2 <= i + 50; i2++) {
            arrayList.add(String.valueOf(i2));
        }
        return new a(getContext(), arrayList, 4);
    }

    @Override // com.meituan.android.paybase.widgets.wheelview.WheelViewChooseDialog
    public final com.meituan.android.paybase.widgets.wheelview.adapter.b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d299bb74136bd27864089f71ff593944", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.paybase.widgets.wheelview.adapter.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d299bb74136bd27864089f71ff593944");
        }
        int i = Calendar.getInstance().get(2);
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i2 = 1; i2 < 13; i2++) {
            arrayList.add(String.valueOf(i2));
        }
        return new a(getContext(), arrayList, i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a<T> extends com.meituan.android.paybase.widgets.wheelview.adapter.b {
        public static ChangeQuickRedirect a;

        public a(Context context, ArrayList<T> arrayList, int i) {
            super(context, R.layout.paybase__picker_item, R.id.item_textview, i, arrayList);
            Object[] objArr = {context, arrayList, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cff041e810d0b64d2d80e2b0a9da60d0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cff041e810d0b64d2d80e2b0a9da60d0");
            }
        }

        @Override // com.meituan.android.paybase.widgets.wheelview.adapter.c
        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53c0b9afaa1bfd661bba0c3e20e43851", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53c0b9afaa1bfd661bba0c3e20e43851")).intValue() : this.e.size();
        }

        @Override // com.meituan.android.paybase.widgets.wheelview.adapter.b
        public final CharSequence a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d24c74fbf2af2a36a305f574f6902a16", RobustBitConfig.DEFAULT_VALUE)) {
                return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d24c74fbf2af2a36a305f574f6902a16");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.e.get(i));
            return sb.toString();
        }
    }
}
