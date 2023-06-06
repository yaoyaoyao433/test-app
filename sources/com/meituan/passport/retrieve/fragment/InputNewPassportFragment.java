package com.meituan.passport.retrieve.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.passport.BasePassportFragment;
import com.meituan.passport.converter.m;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.exception.skyeyemonitor.module.x;
import com.meituan.passport.pojo.Result;
import com.meituan.passport.pojo.request.i;
import com.meituan.passport.service.ai;
import com.meituan.passport.service.w;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.aj;
import com.meituan.passport.utils.b;
import com.meituan.passport.view.PassportButton;
import com.meituan.passport.view.PassportClearTextView;
import com.meituan.passport.view.PassportEditText;
import com.meituan.passport.view.PassportPasswordEye;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.skyeye.library.core.e;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class InputNewPassportFragment extends BasePassportFragment {
    public static ChangeQuickRedirect h;
    private PassportEditText i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private m<Result> o;

    @Override // com.meituan.passport.BasePassportFragment
    public final int W_() {
        return R.layout.passport_fragment_input_newpassword;
    }

    public InputNewPassportFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00c2105129188cb9b599956b778bf32c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00c2105129188cb9b599956b778bf32c");
        } else {
            this.o = new m<Result>() { // from class: com.meituan.passport.retrieve.fragment.InputNewPassportFragment.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.converter.m
                public final /* synthetic */ void a(Result result) {
                    Result result2 = result;
                    Object[] objArr2 = {result2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd51f2a5fc88fa06742b43d9f18844bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd51f2a5fc88fa06742b43d9f18844bd");
                    } else if (!InputNewPassportFragment.this.isAdded() || result2 == null || InputNewPassportFragment.this.getActivity() == null) {
                    } else {
                        new com.sankuai.meituan.android.ui.widget.a(InputNewPassportFragment.this.getActivity(), InputNewPassportFragment.this.getString(R.string.passport_reset_password_success), 0).a();
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.meituan.passport.retrieve.fragment.InputNewPassportFragment.2.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7d24f66ff64c1b0c45a5e00639a5fa69", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7d24f66ff64c1b0c45a5e00639a5fa69");
                                } else if (InputNewPassportFragment.this.getActivity() != null) {
                                    InputNewPassportFragment.this.getActivity().finish();
                                }
                            }
                        }, 1000L);
                        x xVar = (x) com.meituan.passport.exception.skyeyemonitor.a.a().a("retrieve_password");
                        Object[] objArr3 = {null};
                        ChangeQuickRedirect changeQuickRedirect3 = x.a;
                        if (PatchProxy.isSupport(objArr3, xVar, changeQuickRedirect3, false, "607219790d414eb1eeae1e3e346676d8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, xVar, changeQuickRedirect3, false, "607219790d414eb1eeae1e3e346676d8");
                        } else {
                            e.a("biz_passport", "retrieve_password", "retrieve_password_success", null);
                        }
                    }
                }
            };
        }
    }

    @Override // com.meituan.passport.BasePassportFragment
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e89470494ae2d388977213ceae74adce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e89470494ae2d388977213ceae74adce");
        } else if (getArguments() != null) {
            b.c cVar = new b.c(getArguments());
            this.k = cVar.b();
            this.j = cVar.a();
            this.l = cVar.c();
            this.m = cVar.d();
            this.n = cVar.e();
        }
    }

    @Override // com.meituan.passport.BasePassportFragment
    public final void a(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3d94417d79db16cdc986178c9c132c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3d94417d79db16cdc986178c9c132c9");
            return;
        }
        aj.b(this, "b_ugqhjmdn", "c_qsjvllrt");
        this.i = (PassportEditText) view.findViewById(R.id.input_passport);
        this.i.setEnableControler(c.a());
        this.i.requestFocus();
        PassportButton passportButton = (PassportButton) view.findViewById(R.id.commit);
        ((TextView) view.findViewById(R.id.input_text)).setText(Utils.a(getContext(), (int) R.string.passport_retrieve_set_new_password, b()));
        ((PassportClearTextView) view.findViewById(R.id.password_clean)).setControlerView(this.i);
        ((PassportPasswordEye) view.findViewById(R.id.password_eye_img)).setControlerView(this.i);
        passportButton.a(this.i);
        passportButton.setClickAction(d.a(this));
        Utils.a(getContext(), this.i);
    }

    public static /* synthetic */ boolean a(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b62b666ae6c706e6c43aef7e6f20fb5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b62b666ae6c706e6c43aef7e6f20fb5")).booleanValue() : editable.length() > 7;
    }

    public static /* synthetic */ void a(InputNewPassportFragment inputNewPassportFragment, View view) {
        Object[] objArr = {inputNewPassportFragment, view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3cd9c66a26f6c72afec9212287521b55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3cd9c66a26f6c72afec9212287521b55");
            return;
        }
        Utils.a(inputNewPassportFragment);
        String str = inputNewPassportFragment.k;
        String str2 = inputNewPassportFragment.j;
        String str3 = inputNewPassportFragment.l;
        String str4 = inputNewPassportFragment.m;
        String str5 = inputNewPassportFragment.n;
        String a = com.meituan.passport.encryption.a.a(inputNewPassportFragment.i.getParam());
        Object[] objArr2 = {str, str2, str3, str4, str5, a};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, inputNewPassportFragment, changeQuickRedirect2, false, "0b70da086d0ace337a9299f876d3be4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, inputNewPassportFragment, changeQuickRedirect2, false, "0b70da086d0ace337a9299f876d3be4b");
        } else {
            w a2 = com.meituan.passport.c.a().a(ai.TYPE_RETRIEVE_PASSWORD);
            i iVar = new i();
            iVar.b = com.meituan.passport.clickaction.d.a(str);
            iVar.c = com.meituan.passport.clickaction.d.a(str2);
            iVar.h = com.meituan.passport.clickaction.d.a(str3);
            iVar.i = com.meituan.passport.clickaction.d.a(str4);
            iVar.j = com.meituan.passport.clickaction.d.a(str5);
            iVar.k = com.meituan.passport.clickaction.d.a(a);
            a2.a((w) iVar);
            a2.a(inputNewPassportFragment.o);
            a2.a(new com.meituan.passport.converter.b() { // from class: com.meituan.passport.retrieve.fragment.InputNewPassportFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.converter.b
                public final boolean a(ApiException apiException, boolean z) {
                    Object[] objArr3 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e14459e250b9d6eaaf0b50feb0c26ee2", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e14459e250b9d6eaaf0b50feb0c26ee2")).booleanValue();
                    }
                    x xVar = (x) com.meituan.passport.exception.skyeyemonitor.a.a().a("retrieve_password");
                    Object[] objArr4 = {apiException};
                    ChangeQuickRedirect changeQuickRedirect4 = x.a;
                    if (PatchProxy.isSupport(objArr4, xVar, changeQuickRedirect4, false, "6bf6caebae216f5995e65291a0454b99", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, xVar, changeQuickRedirect4, false, "6bf6caebae216f5995e65291a0454b99");
                    } else if (apiException != null) {
                        HashMap hashMap = new HashMap();
                        if (apiException != null) {
                            hashMap.put("code", Integer.valueOf(apiException.code));
                            hashMap.put("message", apiException.getMessage());
                            hashMap.put("type", apiException.type);
                        }
                        if (apiException.code == 101016 || apiException.code == 101084) {
                            e.a("biz_passport", "retrieve_password", "retrieve_password_userset_error", "密码设置不合规范", hashMap);
                        } else {
                            e.a("biz_passport", "retrieve_password", "retrieve_password_failed", "找回密码失败", hashMap);
                        }
                    }
                    return true;
                }
            });
            a2.a(inputNewPassportFragment);
            a2.b();
        }
        aj.a(inputNewPassportFragment, "b_cyeko21z", "c_qsjvllrt");
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efd6141397e15ba7488342c057b73f3a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efd6141397e15ba7488342c057b73f3a");
        }
        int i = 86;
        if (!TextUtils.isEmpty(this.j)) {
            try {
                i = Integer.parseInt(this.j);
            } catch (Exception unused) {
            }
        }
        return " +" + i + StringUtil.SPACE + com.meituan.passport.c.a().a(i).a(this.k);
    }
}
