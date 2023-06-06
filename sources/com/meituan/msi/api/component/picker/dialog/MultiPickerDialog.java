package com.meituan.msi.api.component.picker.dialog;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.NumberPicker;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.msi.api.component.picker.bean.MultiPickerParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MultiPickerDialog extends BasePickerDialog {
    public static ChangeQuickRedirect e;
    public NumberPicker[] f;
    public String g;

    public MultiPickerDialog(Activity activity) {
        super(activity);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb7983d669abd2aae36f3993b6544f3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb7983d669abd2aae36f3993b6544f3b");
        }
    }

    public final void a(MultiPickerParam multiPickerParam) throws IllegalArgumentException {
        Object[] objArr = {multiPickerParam};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f32eb5aaa369e6294cb7bbf4680a8d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f32eb5aaa369e6294cb7bbf4680a8d72");
        } else if (multiPickerParam == null) {
            throw new IllegalArgumentException("param is null");
        } else {
            if (multiPickerParam.array == null || multiPickerParam.array.isEmpty()) {
                throw new IllegalArgumentException("array is empty");
            }
            if (multiPickerParam.current == null || multiPickerParam.current.isEmpty()) {
                throw new IllegalArgumentException("current is empty");
            }
            if (multiPickerParam.array.size() != multiPickerParam.current.size()) {
                throw new IllegalArgumentException("array.size!=current.size");
            }
            this.g = multiPickerParam.arrayKey;
            a(multiPickerParam.array, multiPickerParam.current);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd40b6f643635f937a371aab4b164bf0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd40b6f643635f937a371aab4b164bf0");
            } else {
                this.b.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msi.api.component.picker.dialog.MultiPickerDialog.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8da86f5fda8a91a511c391f339e4f375", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8da86f5fda8a91a511c391f339e4f375");
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        ArrayList arrayList = new ArrayList();
                        for (NumberPicker numberPicker : MultiPickerDialog.this.f) {
                            arrayList.add(Integer.valueOf(numberPicker.getValue()));
                        }
                        hashMap.put("current", arrayList);
                        if (MultiPickerDialog.this.d != null) {
                            MultiPickerDialog.this.d.a(hashMap);
                        }
                        MultiPickerDialog.this.dismiss();
                    }
                });
            }
            super.show();
        }
    }

    private void a(@NonNull List<List<JsonElement>> list, @NonNull List<Integer> list2) throws IllegalArgumentException {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85b517973ed2d2b585f1b59034eccbd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85b517973ed2d2b585f1b59034eccbd6");
            return;
        }
        this.f = a(list.size(), (String) null);
        for (int i = 0; i < this.f.length; i++) {
            List<JsonElement> list3 = list.get(i);
            if (list3 == null || list3.isEmpty()) {
                throw new IllegalArgumentException("sub array is empty");
            }
            this.f[i].setDisplayedValues(a(list3));
            this.f[i].setMaxValue(list3.size() - 1);
            this.f[i].setValue(list2.get(i).intValue());
            this.f[i].setOnValueChangedListener(new a(i));
        }
    }

    public void b(List<JsonElement> list) throws IllegalArgumentException {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d4a00e3af010045512d4fe43953e9f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d4a00e3af010045512d4fe43953e9f6");
        } else if (!TextUtils.isEmpty(this.g)) {
            int size = list.size();
            while (i < size) {
                JsonElement jsonElement = list.get(i);
                if (jsonElement != null && jsonElement.isJsonObject()) {
                    if (!((JsonObject) jsonElement).has(this.g)) {
                        throw new IllegalArgumentException("no arrayKey");
                    }
                    i++;
                } else {
                    throw new IllegalArgumentException("array element is not object");
                }
            }
        } else {
            int size2 = list.size();
            while (i < size2) {
                if (!list.get(i).isJsonPrimitive()) {
                    throw new IllegalArgumentException("array element is not string");
                }
                i++;
            }
        }
    }

    public String[] c(List<JsonElement> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f95ab6030bd536f7d5be3d93209880fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f95ab6030bd536f7d5be3d93209880fd");
        }
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            JsonElement jsonElement = list.get(i);
            if (jsonElement != null && jsonElement.isJsonObject()) {
                JsonObject jsonObject = (JsonObject) jsonElement;
                if (jsonObject.has(this.g)) {
                    JsonElement jsonElement2 = jsonObject.get(this.g);
                    strArr[i] = jsonElement2 != null ? jsonElement2.getAsString() : null;
                }
            }
        }
        return strArr;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements NumberPicker.OnValueChangeListener {
        public static ChangeQuickRedirect a;
        private final int c;

        public a(int i) {
            Object[] objArr = {MultiPickerDialog.this, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63ed2655b63731ba4dc65864c2789b24", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63ed2655b63731ba4dc65864c2789b24");
            } else {
                this.c = i;
            }
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
            Object[] objArr = {numberPicker, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02fcbb8c974efc89b9fecf21d50c6479", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02fcbb8c974efc89b9fecf21d50c6479");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("column", Integer.valueOf(this.c));
            hashMap.put("current", Integer.valueOf(i2));
            if (MultiPickerDialog.this.d != null) {
                MultiPickerDialog.this.d.b(hashMap);
            }
        }
    }
}
