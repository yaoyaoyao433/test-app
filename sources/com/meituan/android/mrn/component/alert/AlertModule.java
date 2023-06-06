package com.meituan.android.mrn.component.alert;

import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.android.mrn.component.utils.YellowBox;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AlertModule extends ReactContextBaseJavaModule {
    private static final String TYPE_PLAIN = "PLAIN";
    private static final int TYPE_PLAIN_INT = 0;
    private static final String TYPE_SECURE = "SECURE";
    private static final int TYPE_SECURE_INT = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MRNAlert";
    }

    public AlertModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f67c04fb748afe69b430aea9e2e7fe6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f67c04fb748afe69b430aea9e2e7fe6");
        }
    }

    @ReactMethod
    public void prompt(String str, String str2, int i, final Callback callback) {
        Object[] objArr = {str, str2, Integer.valueOf(i), callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a661c28b5164a66ecd19c3aba7ab5a17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a661c28b5164a66ecd19c3aba7ab5a17");
            return;
        }
        YellowBox.a(getReactApplicationContext(), "MRNComponents 组件库的 Alert 组件已被废弃不再维护，请尽快使用 MTD 中的 Dialog 替代");
        AlertDialog.a aVar = new AlertDialog.a(getCurrentActivity());
        aVar.a(str);
        if (!TextUtils.isEmpty(str2)) {
            aVar.b(str2);
        }
        View inflate = LayoutInflater.from(getReactApplicationContext()).inflate(R.layout.mrn_component_alert_prompt_layout, (ViewGroup) null);
        aVar.a(inflate);
        final EditText editText = (EditText) inflate.findViewById(R.id.edit_text);
        switch (i) {
            case 0:
                editText.setInputType(144);
                break;
            case 1:
                editText.setInputType(129);
                break;
        }
        aVar.a("确认", new DialogInterface.OnClickListener() { // from class: com.meituan.android.mrn.component.alert.AlertModule.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e9d9f0b7869b6fe2b68a1e99f605fa9c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e9d9f0b7869b6fe2b68a1e99f605fa9c");
                } else if (callback != null) {
                    if (TextUtils.isEmpty(editText.getText())) {
                        callback.invoke(new Object[0]);
                    } else {
                        callback.invoke(editText.getText().toString());
                    }
                }
            }
        });
        aVar.b(IPaymentManager.NO_ACTION, (DialogInterface.OnClickListener) null);
        aVar.a().show();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cffcb9a6b574c57e388ccd08112aa0a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cffcb9a6b574c57e388ccd08112aa0a0");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(TYPE_PLAIN, 0);
        hashMap.put(TYPE_SECURE, 1);
        return hashMap;
    }

    private int dp2px(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf9cf83e513d01b1dfbb890975277c07", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf9cf83e513d01b1dfbb890975277c07")).intValue() : (int) (f * context.getResources().getDisplayMetrics().density);
    }
}
