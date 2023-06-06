package com.meituan.msi.api.component.picker.dialog;

import android.app.Activity;
import android.view.View;
import android.widget.NumberPicker;
import com.google.gson.JsonElement;
import com.meituan.msi.api.component.picker.bean.SinglePickerParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SinglePickerDialog extends BasePickerDialog {
    public static ChangeQuickRedirect e;
    private NumberPicker f;

    public SinglePickerDialog(Activity activity) {
        super(activity);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81d98f781371530749467d2e101c2662", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81d98f781371530749467d2e101c2662");
        }
    }

    public final void a(SinglePickerParam singlePickerParam) throws IllegalArgumentException {
        Object[] objArr = {singlePickerParam};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be94ffa13e6bdf84efa0ce3ba66d4680", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be94ffa13e6bdf84efa0ce3ba66d4680");
        } else if (singlePickerParam == null) {
            throw new IllegalArgumentException("param is empty");
        } else {
            if (singlePickerParam.array == null || singlePickerParam.array.isEmpty()) {
                throw new IllegalArgumentException("array is empty");
            }
            if (singlePickerParam.current < 0 || singlePickerParam.current >= singlePickerParam.array.size()) {
                throw new IllegalArgumentException("current range error. current=" + singlePickerParam.current);
            }
            List<JsonElement> list = singlePickerParam.array;
            int i = singlePickerParam.current;
            Object[] objArr2 = {list, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f32b50f5405a38cc25dd4447db5a4a4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f32b50f5405a38cc25dd4447db5a4a4");
            } else {
                this.f = a(1, (String) null)[0];
                this.f.setDisplayedValues(a(list));
                this.f.setMaxValue(list.size() - 1);
                this.f.setValue(i);
            }
            final List<JsonElement> list2 = singlePickerParam.array;
            Object[] objArr3 = {list2};
            ChangeQuickRedirect changeQuickRedirect3 = e;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1bb004801a7ba378726c93c8b06a2ad2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1bb004801a7ba378726c93c8b06a2ad2");
            } else {
                this.b.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msi.api.component.picker.dialog.SinglePickerDialog.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b07fa10a6de2acbe2a6f14220da019bc", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b07fa10a6de2acbe2a6f14220da019bc");
                        } else if (SinglePickerDialog.this.f == null || list2 == null) {
                        } else {
                            HashMap hashMap = new HashMap();
                            int value = SinglePickerDialog.this.f.getValue();
                            hashMap.put("index", Integer.valueOf(value));
                            hashMap.put("value", list2.get(value));
                            if (SinglePickerDialog.this.d != null) {
                                SinglePickerDialog.this.d.a(hashMap);
                            }
                            SinglePickerDialog.this.dismiss();
                        }
                    }
                });
            }
            super.show();
        }
    }
}
