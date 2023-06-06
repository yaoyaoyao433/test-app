package com.meituan.mmp.lib.api.ui;

import android.content.DialogInterface;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.utils.i;
import com.meituan.mmp.lib.widget.ActionSheetDialog;
import com.meituan.mmp.lib.widget.ModalDialog;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DialogModule extends ActivityApi {
    public static ChangeQuickRedirect h;
    private ModalDialog i;
    private ActionSheetDialog j;
    private int k;
    private boolean l;

    public DialogModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9e421612e46f7c201ead5815476e59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9e421612e46f7c201ead5815476e59");
        } else {
            this.k = -1;
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a2f343a8be9573ee2da7fc11515491d", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a2f343a8be9573ee2da7fc11515491d") : new String[]{"showModal", "showActionSheet"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, final IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "075ba2357cd81dca96dee7ad0f1d5b1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "075ba2357cd81dca96dee7ad0f1d5b1f");
        } else if (!this.l) {
            if (!"showModal".equals(str)) {
                if ("showActionSheet".equals(str)) {
                    Object[] objArr2 = {jSONObject, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e19dc3398ba1b4db2e7851be5d99aec0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e19dc3398ba1b4db2e7851be5d99aec0");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    String optString = jSONObject.optString("itemColor", DiagnoseLog.COLOR_ERROR);
                    JSONArray optJSONArray = jSONObject.optJSONArray("itemList");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            String optString2 = optJSONArray.optString(i);
                            if (!TextUtils.isEmpty(optString2)) {
                                arrayList.add(optString2);
                            }
                        }
                    }
                    if (this.j == null) {
                        this.j = new ActionSheetDialog(getContext());
                        this.j.setCanceledOnTouchOutside(true);
                    }
                    this.j.a(arrayList, i.a(optString));
                    this.j.b = new ActionSheetDialog.a() { // from class: com.meituan.mmp.lib.api.ui.DialogModule.3
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.mmp.lib.widget.ActionSheetDialog.a
                        public final void a(int i2, View view) {
                            Object[] objArr3 = {Integer.valueOf(i2), view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f88e74a21dfd8b18b2c67915ada79993", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f88e74a21dfd8b18b2c67915ada79993");
                                return;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("tapIndex", i2);
                            } catch (JSONException unused) {
                            }
                            iApiCallback.onSuccess(jSONObject2);
                        }
                    };
                    this.j.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meituan.mmp.lib.api.ui.DialogModule.4
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            Object[] objArr3 = {dialogInterface};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0f77120476076dc9661048ae391e6015", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0f77120476076dc9661048ae391e6015");
                            } else {
                                iApiCallback.onCancel();
                            }
                        }
                    });
                    this.j.show();
                }
            } else {
                Object[] objArr3 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d6a984faa097866d60f57d01293851a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d6a984faa097866d60f57d01293851a9");
                    return;
                }
                String optString3 = jSONObject.optString("title");
                String optString4 = jSONObject.optString("content");
                boolean optBoolean = jSONObject.optBoolean("showCancel", true);
                String optString5 = jSONObject.optString("cancelText", getContext().getString(R.string.mmp_cancel));
                String optString6 = jSONObject.optString("cancelColor", DiagnoseLog.COLOR_ERROR);
                String optString7 = jSONObject.optString("confirmText", getContext().getString(R.string.mmp_confirm));
                String optString8 = jSONObject.optString("confirmColor", "#596b93");
                if (this.i == null) {
                    this.i = new ModalDialog(getActivity());
                    this.i.setCancelable(false);
                    this.i.setCanceledOnTouchOutside(false);
                }
                this.i.setTitle(optString3);
                this.i.a((CharSequence) optString4);
                if (optBoolean) {
                    this.i.a(optString6);
                    this.i.a(optString5, new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.ui.DialogModule.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr4 = {view};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "76e0883a4460f4752a66b55d24ebc23d", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "76e0883a4460f4752a66b55d24ebc23d");
                                return;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("cancel", true);
                            } catch (JSONException unused) {
                            }
                            iApiCallback.onSuccess(jSONObject2);
                        }
                    });
                }
                this.i.b(optString8);
                this.i.b(optString7, new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.ui.DialogModule.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "97895d629c06cab5d955f987193f39a1", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "97895d629c06cab5d955f987193f39a1");
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("confirm", true);
                        } catch (JSONException unused) {
                        }
                        iApiCallback.onSuccess(jSONObject2);
                    }
                });
                this.i.show();
            }
        } else {
            iApiCallback.onFail(codeJson(1000, "fail to show dialog in background"));
        }
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b7d66417c39ba5ce6244f1a75eb6bea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b7d66417c39ba5ce6244f1a75eb6bea");
            return;
        }
        super.onPause();
        this.l = true;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22cbd21834362aa1c4d86335d5e83b06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22cbd21834362aa1c4d86335d5e83b06");
            return;
        }
        super.onResume();
        this.l = false;
        if (getPageManager() != null) {
            int b = getPageManager().b();
            if (this.k != b && this.k != -1) {
                if (this.i != null) {
                    this.i.dismiss();
                }
                if (this.j != null) {
                    this.j.dismiss();
                }
            }
            this.k = b;
        }
    }
}
