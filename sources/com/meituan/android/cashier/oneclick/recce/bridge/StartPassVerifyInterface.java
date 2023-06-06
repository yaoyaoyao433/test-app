package com.meituan.android.cashier.oneclick.recce.bridge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.cashier.oneclick.util.b;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.recce.bridge.RecceCustomApi;
import com.meituan.android.recce.bridge.RecceInterface;
import com.meituan.android.recce.bridge.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class StartPassVerifyInterface extends RecceCustomApi {
    public static ChangeQuickRedirect a;

    @RecceInterface
    public void openOneClickPay(String str, String str2, JsonObject jsonObject, c cVar) {
        Object[] objArr = {str, str2, jsonObject, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7092fe1dcd6dfd858c4225945b8febe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7092fe1dcd6dfd858c4225945b8febe");
            return;
        }
        Activity a2 = a();
        if (a2 == null) {
            if (cVar != null) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("code", (Number) (-1));
                jsonObject2.addProperty("message", "activity is null");
                jsonObject2.addProperty("data", "");
                cVar.onFail(400, "activity is null", jsonObject2.toString());
                return;
            }
            return;
        }
        String asString = jsonObject.get("url").getAsString();
        if (TextUtils.isEmpty(asString) || TextUtils.isEmpty(asString.trim())) {
            if (cVar != null) {
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("code", (Number) (-1));
                jsonObject3.addProperty("message", "url is null");
                jsonObject3.addProperty("data", "");
                cVar.onFail(400, "url is null", jsonObject3.toString());
                return;
            }
            return;
        }
        FragmentManager supportFragmentManager = ((FragmentActivity) a2).getSupportFragmentManager();
        if (supportFragmentManager != null) {
            StartPayVerifyWorkerFragment startPayVerifyWorkerFragment = new StartPayVerifyWorkerFragment();
            startPayVerifyWorkerFragment.b = asString;
            startPayVerifyWorkerFragment.c = cVar;
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("start_pass_verify_worker_fragment");
            if (findFragmentByTag != null) {
                supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
            }
            supportFragmentManager.beginTransaction().add(startPayVerifyWorkerFragment, "start_pass_verify_worker_fragment").commitAllowingStateLoss();
            supportFragmentManager.executePendingTransactions();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class StartPayVerifyWorkerFragment extends PayBaseFragment {
        public static ChangeQuickRedirect a;
        String b;
        c c;

        @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
        public void onCreate(@Nullable Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed88f186e1e26052a6a9af54a236304a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed88f186e1e26052a6a9af54a236304a");
                return;
            }
            super.onCreate(bundle);
            al.a(this, this.b, 21);
        }

        @Override // android.support.v4.app.Fragment
        public void onActivityResult(int i, int i2, Intent intent) {
            FragmentManager supportFragmentManager;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d27058d22eb0551be3f8574c4ebeba7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d27058d22eb0551be3f8574c4ebeba7");
                return;
            }
            com.meituan.android.privacy.aop.a.e();
            super.onActivityResult(i, i2, intent);
            if (21 == i) {
                if (i2 == 10 && intent != null) {
                    String a2 = f.a(intent, "resultData");
                    if (this.c != null) {
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.addProperty("code", (Number) 0);
                        jsonObject.addProperty("message", "");
                        if (TextUtils.isEmpty(a2)) {
                            a2 = "{}";
                        }
                        jsonObject.add("data", new JsonParser().parse(a2).getAsJsonObject());
                        this.c.onSuccess(jsonObject.toString());
                    }
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_65byxvtm_mv", (Map<String, Object>) null);
                    b.a(200);
                } else if (i2 == 0) {
                    if (this.c != null) {
                        JsonObject jsonObject2 = new JsonObject();
                        jsonObject2.addProperty("code", (Number) (-1));
                        jsonObject2.addProperty("message", "");
                        jsonObject2.addProperty("data", "");
                        this.c.onFail(400, "cancel", jsonObject2.toString());
                    }
                } else if (this.c != null) {
                    JsonObject jsonObject3 = new JsonObject();
                    jsonObject3.addProperty("code", (Number) (-1));
                    jsonObject3.addProperty("message", "");
                    jsonObject3.addProperty("data", "");
                    this.c.onFail(400, "2000", jsonObject3.toString());
                }
            }
            FragmentActivity activity = getActivity();
            if (activity != null && !activity.isFinishing() && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                supportFragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
            }
            com.meituan.android.privacy.aop.a.f();
        }
    }
}
