package com.meituan.msc.modules.api.ui;

import android.content.DialogInterface;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.msc.common.utils.g;
import com.meituan.msc.extern.IApiCallback;
import com.meituan.msc.modules.api.ActivityApi;
import com.meituan.msc.modules.page.widget.ActionSheetDialog;
import com.meituan.msc.modules.page.widget.ModalDialog;
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
    public static ChangeQuickRedirect e;
    private ModalDialog f;
    private ActionSheetDialog g;
    private int h;
    private boolean i;

    public DialogModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea2cc24f9a1c4a1b08901e3ae4134c73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea2cc24f9a1c4a1b08901e3ae4134c73");
        } else {
            this.h = -1;
        }
    }

    @Override // com.meituan.msc.modules.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, final IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6ed1651c97337f6dbebad445fdb78de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6ed1651c97337f6dbebad445fdb78de");
        } else if (!this.i) {
            if (!"showModal".equals(str)) {
                if ("showActionSheet".equals(str)) {
                    Object[] objArr2 = {jSONObject, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect2 = e;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0132f70277518514f76b33570f4691b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0132f70277518514f76b33570f4691b");
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
                    if (this.g == null) {
                        this.g = new ActionSheetDialog(getContext());
                        this.g.setCanceledOnTouchOutside(true);
                    }
                    this.g.a(arrayList, g.a(optString));
                    this.g.b = new ActionSheetDialog.a() { // from class: com.meituan.msc.modules.api.ui.DialogModule.3
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.modules.page.widget.ActionSheetDialog.a
                        public final void a(int i2, View view) {
                            Object[] objArr3 = {Integer.valueOf(i2), view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c7311fccd91b738b2712af0159cf346d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c7311fccd91b738b2712af0159cf346d");
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
                    this.g.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meituan.msc.modules.api.ui.DialogModule.4
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            Object[] objArr3 = {dialogInterface};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2baece6574d7a2a88442a2b324909cd0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2baece6574d7a2a88442a2b324909cd0");
                            } else {
                                iApiCallback.onCancel();
                            }
                        }
                    });
                    this.g.show();
                }
            } else {
                Object[] objArr3 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect3 = e;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "099b68aad4af98482cf5925d194c99ad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "099b68aad4af98482cf5925d194c99ad");
                    return;
                }
                String optString3 = jSONObject.optString("title");
                String optString4 = jSONObject.optString("content");
                boolean optBoolean = jSONObject.optBoolean("showCancel", true);
                String optString5 = jSONObject.optString("cancelText", getContext().getString(R.string.msc_cancel));
                String optString6 = jSONObject.optString("cancelColor", DiagnoseLog.COLOR_ERROR);
                String optString7 = jSONObject.optString("confirmText", getContext().getString(R.string.msc_confirm));
                String optString8 = jSONObject.optString("confirmColor", "#596b93");
                if (this.f == null) {
                    this.f = new ModalDialog(getActivity());
                    this.f.setCancelable(false);
                    this.f.setCanceledOnTouchOutside(false);
                }
                this.f.setTitle(optString3);
                this.f.a((CharSequence) optString4);
                if (optBoolean) {
                    this.f.a(optString6);
                    this.f.a(optString5, new View.OnClickListener() { // from class: com.meituan.msc.modules.api.ui.DialogModule.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr4 = {view};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e5a482a91e3e2505e6feb05b94b7fc1f", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e5a482a91e3e2505e6feb05b94b7fc1f");
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
                this.f.b(optString8);
                this.f.b(optString7, new View.OnClickListener() { // from class: com.meituan.msc.modules.api.ui.DialogModule.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8b958aeec49fec458f31a8f236178a37", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8b958aeec49fec458f31a8f236178a37");
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
                this.f.show();
            }
        } else {
            iApiCallback.onFail(codeJson(1000, "fail to show dialog in background"));
        }
    }

    @Override // com.meituan.msc.modules.api.AbsApi
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75792c5dce20edfa4430b36b1e37e187", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75792c5dce20edfa4430b36b1e37e187");
            return;
        }
        super.onPause();
        this.i = true;
    }

    @Override // com.meituan.msc.modules.api.AbsApi
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdde8755825a6b1c9cd1b0c934a71535", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdde8755825a6b1c9cd1b0c934a71535");
            return;
        }
        super.onResume();
        this.i = false;
        if (getPageManager() != null) {
            int d = getPageManager().d();
            if (this.h != d && this.h != -1) {
                if (this.f != null) {
                    this.f.dismiss();
                }
                if (this.g != null) {
                    this.g.dismiss();
                }
            }
            this.h = d;
        }
    }
}
