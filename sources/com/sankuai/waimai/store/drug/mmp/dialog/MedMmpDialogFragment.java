package com.sankuai.waimai.store.drug.mmp.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.msc.modules.container.MSCWidgetFragment;
import com.meituan.msc.modules.container.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.base.BaseMemberActivity;
import com.sankuai.waimai.store.drug.util.e;
import com.sankuai.waimai.store.mrn.dialog.model.DialogActionResult;
import com.sankuai.waimai.store.mrn.dialog.model.DialogConfigResult;
import com.sankuai.waimai.store.ui.common.SGBaseDialogFragment;
import com.sankuai.waimai.store.util.b;
import com.sankuai.waimai.store.util.i;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MedMmpDialogFragment extends SGBaseDialogFragment {
    public static ChangeQuickRedirect a;
    private MSCWidgetFragment b;
    private int d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private boolean i;
    private boolean j;
    private String k;

    public static /* synthetic */ void a(MedMmpDialogFragment medMmpDialogFragment, String str, String str2) {
        int i;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, medMmpDialogFragment, changeQuickRedirect, false, "e9fbe57f28dd213c4dfe641dec4f3652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, medMmpDialogFragment, changeQuickRedirect, false, "e9fbe57f28dd213c4dfe641dec4f3652");
            return;
        }
        try {
            if ("dialog_config".equals(str)) {
                DialogActionResult dialogActionResult = (DialogActionResult) i.a(str2, DialogActionResult.class);
                if (dialogActionResult == null || !dialogActionResult.isCloseDialog) {
                    return;
                }
                medMmpDialogFragment.i = true;
                medMmpDialogFragment.dismissAllowingStateLoss();
                medMmpDialogFragment.a();
            } else if ("dialog_result_call_back".equals(str)) {
                DialogConfigResult dialogConfigResult = (DialogConfigResult) i.a(str2, DialogConfigResult.class);
                Object[] objArr2 = {dialogConfigResult};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, medMmpDialogFragment, changeQuickRedirect2, false, "563b74a1dea7ed5bfe2c41a17a1667b9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, medMmpDialogFragment, changeQuickRedirect2, false, "563b74a1dea7ed5bfe2c41a17a1667b9");
                } else if (dialogConfigResult != null) {
                    if (dialogConfigResult.dialogWidth > 0.0f) {
                        medMmpDialogFragment.e = h.a(b.a(), dialogConfigResult.dialogWidth);
                    }
                    if (dialogConfigResult.dialogHeight > 0.0f) {
                        medMmpDialogFragment.d = h.a(b.a(), dialogConfigResult.dialogHeight);
                    }
                    String str3 = dialogConfigResult.dialogPosition;
                    Object[] objArr3 = {str3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, medMmpDialogFragment, changeQuickRedirect3, false, "566c4fd6dd95346efbd75ba6695d3bf7", RobustBitConfig.DEFAULT_VALUE)) {
                        i = ((Integer) PatchProxy.accessDispatch(objArr3, medMmpDialogFragment, changeQuickRedirect3, false, "566c4fd6dd95346efbd75ba6695d3bf7")).intValue();
                    } else if ("top".equals(str3)) {
                        i = 48;
                    } else {
                        i = ("center".equals(str3) || !"bottom".equals(str3)) ? 17 : 80;
                    }
                    if (i == 48 || i == 17 || i == 80 || i == 3 || i == 5) {
                        medMmpDialogFragment.f = i;
                    }
                    medMmpDialogFragment.setCancelable(dialogConfigResult.closeWhenTouchMask);
                    if (medMmpDialogFragment.getDialog() == null || medMmpDialogFragment.getDialog().getWindow() == null || medMmpDialogFragment.getDialog().getWindow().getAttributes() == null) {
                        return;
                    }
                    medMmpDialogFragment.b();
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    public MedMmpDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "414d14ea5bfd50e2e9cf41b5b5dd9001", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "414d14ea5bfd50e2e9cf41b5b5dd9001");
            return;
        }
        this.d = 1200;
        this.e = -1;
        this.f = 80;
        this.g = -1.0f;
        this.h = false;
        this.i = false;
        this.j = false;
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7152862ddea6a353fa5746ddf6406451", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7152862ddea6a353fa5746ddf6406451");
            return;
        }
        super.onDismiss(dialogInterface);
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e43072b80ef800ae1d1658e647c5cf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e43072b80ef800ae1d1658e647c5cf1");
            return;
        }
        Activity d = d();
        if (d instanceof BaseMemberActivity) {
            if (this.i) {
                d.setResult(-1);
            }
            d.finish();
            d.overridePendingTransition(0, R.anim.wm_sc_common_dialog_alpha_out);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3166eb0b620e7eddc652b565d8c8a5ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3166eb0b620e7eddc652b565d8c8a5ad");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        if (this.j && this.b != null) {
            this.b.onActivityResult(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcd3f466a9362a4501cbb7c6860581ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcd3f466a9362a4501cbb7c6860581ba");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74bb8b29f636ed6c865af7be53f4db78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74bb8b29f636ed6c865af7be53f4db78");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca02bd95a1074ac0c0f17e8727a8a194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca02bd95a1074ac0c0f17e8727a8a194");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.g = arguments.getFloat("dim", -1.0f);
            this.j = arguments.getBoolean("need_activity_result");
            float f = arguments.getFloat("page_height");
            Object[] objArr4 = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "06bf0ddacc60ad810b8eae0e38ce0aab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "06bf0ddacc60ad810b8eae0e38ce0aab");
            } else if (f > 1.0f) {
                this.d = h.a(b.a(), f);
            } else if (f > 0.0f) {
                this.d = (int) (h.b(b.a()) * f);
            }
            this.k = arguments.getString("mmp_scheme_uri");
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11d694e6f33433a877a1ada8ad3f23de", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11d694e6f33433a877a1ada8ad3f23de") : layoutInflater.inflate(R.layout.wm_drug_dialog_mmp_half_page, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Map<String, Object> hashMap;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ab4c4f5848eb4cecd8e566af36fe504", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ab4c4f5848eb4cecd8e566af36fe504");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8800ad6e4982e84b6c3cc9bef8ea7a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8800ad6e4982e84b6c3cc9bef8ea7a5");
            return;
        }
        try {
            if (this.b == null) {
                String decode = URLDecoder.decode(this.k, "utf-8");
                Uri parse = Uri.parse(decode);
                this.b = MSCWidgetFragment.a("61cbdaae3b504b9b", decode);
                MSCWidgetFragment.a aVar = new MSCWidgetFragment.a();
                aVar.c = "61cbdaae3b504b9b";
                aVar.b = decode;
                Object[] objArr3 = {parse};
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2f53d4def523bdbec597b6bafb953146", RobustBitConfig.DEFAULT_VALUE)) {
                    hashMap = (Map) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2f53d4def523bdbec597b6bafb953146");
                } else {
                    hashMap = new HashMap<>();
                    for (String str : parse.getQueryParameterNames()) {
                        String queryParameter = parse.getQueryParameter(str);
                        if (queryParameter != null) {
                            hashMap.put(str, queryParameter);
                        }
                    }
                }
                aVar.a(hashMap).f = R.layout.wm_st_common_view_progress_round;
                this.b.setArguments(aVar.a());
                HashSet hashSet = new HashSet();
                hashSet.add("dialog_result_call_back");
                hashSet.add("dialog_config");
                this.b.a(hashSet, new z() { // from class: com.sankuai.waimai.store.drug.mmp.dialog.MedMmpDialogFragment.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.modules.container.z
                    public final void a(String str2, Map<String, Object> map) {
                        Object[] objArr4 = {str2, map};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cab7cbeabaff2be89c97190e1f3e4ffb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cab7cbeabaff2be89c97190e1f3e4ffb");
                        } else {
                            MedMmpDialogFragment.a(MedMmpDialogFragment.this, str2, i.a(map));
                        }
                    }
                });
            }
            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
            if (this.f == 80) {
                beginTransaction.setCustomAnimations(R.anim.wm_sc_base_dialog_bottom_in, R.anim.wm_sc_base_dialog_bottom_out);
            }
            beginTransaction.add(R.id.mmp_dialog_fragment_container, this.b, "MedHalfPageTag").commitAllowingStateLoss();
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42b385a9cb10d7f486bc00daccb94354", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42b385a9cb10d7f486bc00daccb94354");
            return;
        }
        super.onResume();
        if (this.h) {
            return;
        }
        b();
        this.h = true;
    }

    private void b() {
        Window window;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97072b6ee4a8c1d66f8dbed1959ff6a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97072b6ee4a8c1d66f8dbed1959ff6a4");
        } else if (getDialog() == null || (window = getDialog().getWindow()) == null) {
        } else {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = this.e;
            attributes.height = this.d;
            attributes.gravity = this.f;
            if (this.g > -1.0f) {
                attributes.dimAmount = this.g;
            }
            getDialog().getWindow().setAttributes(attributes);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public float c;
        public float d;
        public boolean e;
        private Bundle f;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6799fce05566bdd6852b9f66dbc7c5b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6799fce05566bdd6852b9f66dbc7c5b");
                return;
            }
            this.d = -1.0f;
            this.f = new Bundle();
        }
    }
}
