package com.sankuai.waimai.mmp.modules.address;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.mmp.lib.api.address.AbsAddressModule;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.router.a;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.router.core.e;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class WMMMPAddressModule extends AbsAddressModule {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class ChooseAddress extends AbsAddressModule.AbsChooseAddress {
        public static ChangeQuickRedirect b;
        private BroadcastReceiver c;
        private BroadcastReceiver d;
        private boolean e;

        public static /* synthetic */ void a(ChooseAddress chooseAddress, JSONObject jSONObject, IApiCallback iApiCallback) {
            Object[] objArr = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, chooseAddress, changeQuickRedirect, false, "7d49172bd9f28960019886452ee43b26", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, chooseAddress, changeQuickRedirect, false, "7d49172bd9f28960019886452ee43b26");
                return;
            }
            try {
                AbsAddressModule.ChooseAddressResult chooseAddressResult = new AbsAddressModule.ChooseAddressResult();
                JSONObject jSONObject2 = jSONObject.getJSONObject("address_more");
                chooseAddressResult.userName = jSONObject2.getString("recipient_name");
                chooseAddressResult.telNumber = jSONObject2.getString("phone");
                chooseAddressResult.detailInfo = jSONObject2.getString("address_name") + StringUtil.SPACE + jSONObject2.getString("house_number");
                JSONArray jSONArray = jSONObject2.getJSONArray("address_admin_list");
                for (int i = 0; i < 3; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string = jSONObject3.getString("name");
                    if (i == 0) {
                        chooseAddressResult.provinceName = string;
                    } else if (i == 1) {
                        chooseAddressResult.cityName = string;
                    } else {
                        chooseAddressResult.countyName = string;
                        chooseAddressResult.nationalCode = jSONObject3.getString("code");
                    }
                }
                chooseAddressResult.postalCode = "000000";
                chooseAddress.a((ChooseAddress) chooseAddressResult, iApiCallback);
            } catch (Throwable unused) {
                iApiCallback.onFail(null);
            }
        }

        public static /* synthetic */ boolean a(ChooseAddress chooseAddress, boolean z) {
            chooseAddress.e = true;
            return true;
        }

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, AbsAddressModule.ChooseAddressParams chooseAddressParams, final IApiCallback iApiCallback) {
            AbsAddressModule.ChooseAddressParams chooseAddressParams2 = chooseAddressParams;
            Object[] objArr = {str, chooseAddressParams2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edbc333ab9d4ad22e330801454ae6240", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edbc333ab9d4ad22e330801454ae6240");
                return;
            }
            Context context = getContext();
            if (chooseAddressParams2.bizId == null) {
                chooseAddressParams2.bizId = ErrorCode.ERROR_CODE_OKHTTP_EXCEPTION;
            }
            if (TextUtils.isEmpty(chooseAddressParams2.env)) {
                chooseAddressParams2.env = "production";
            }
            Uri.Builder builder = new Uri.Builder();
            if (chooseAddressParams2.env.equals("production")) {
                builder.scheme("https").authority("i.meituan.com");
                builder.encodedPath("awp").appendPath("hfe").appendPath(ConfigInfo.MODULE_BLOCK).appendPath("index.html");
                builder.appendQueryParameter("cube_h", "31b2f9f9a529").appendQueryParameter("cube_i", "49414");
                builder.appendQueryParameter("bizID", chooseAddressParams2.bizId).appendQueryParameter("clientID", "70");
            } else if ("staging".equals(chooseAddressParams2.env)) {
                builder.scheme("http").authority("testi.meituan.com");
                builder.encodedPath("awp").appendPath("hfe").appendPath(ConfigInfo.MODULE_BLOCK).appendPath("st").appendPath("index.html");
                builder.appendQueryParameter("cube_h", "8ea95cbd6c34").appendQueryParameter("cube_i", "2960");
                builder.appendQueryParameter("bizID", chooseAddressParams2.bizId).appendQueryParameter("clientID", "70");
            } else if ("test".equals(chooseAddressParams2.env)) {
                builder.scheme("http").authority("testi.meituan.com");
                builder.encodedPath("awp").appendPath("hfe").appendPath(ConfigInfo.MODULE_BLOCK).appendPath("test").appendPath("16036b295ae9").appendPath("785").appendPath("index.html");
                builder.appendQueryParameter("cube_h", "8ea95cbd6c34").appendQueryParameter("cube_i", "2960");
                builder.appendQueryParameter("bizID", chooseAddressParams2.bizId).appendQueryParameter("clientID", "70");
            } else if (!TextUtils.isEmpty(chooseAddressParams2.env)) {
                iApiCallback.onFail();
                return;
            }
            this.e = false;
            this.c = new BroadcastReceiver() { // from class: com.sankuai.waimai.mmp.modules.address.WMMMPAddressModule.ChooseAddress.1
                public static ChangeQuickRedirect a;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    Object[] objArr2 = {context2, intent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa85a44d2e013cf039743100bdc502e2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa85a44d2e013cf039743100bdc502e2");
                    } else if (intent == null) {
                    } else {
                        try {
                            String a2 = f.a(intent, "data");
                            if (TextUtils.isEmpty(a2)) {
                                return;
                            }
                            JSONObject jSONObject = new JSONObject(a2).getJSONObject(GearsLocator.ADDRESS);
                            if (jSONObject.optBoolean("click")) {
                                ChooseAddress.a(ChooseAddress.this, jSONObject, iApiCallback);
                                ChooseAddress.a(ChooseAddress.this, true);
                                ChooseAddress.this.a(context2);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            };
            this.d = new BroadcastReceiver() { // from class: com.sankuai.waimai.mmp.modules.address.WMMMPAddressModule.ChooseAddress.2
                public static ChangeQuickRedirect a;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    String a2;
                    Object[] objArr2 = {context2, intent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc3387989230f15108f04f672b9e48c4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc3387989230f15108f04f672b9e48c4");
                    } else if (intent == null) {
                    } else {
                        try {
                            a2 = f.a(intent, "data");
                        } catch (Throwable unused) {
                            iApiCallback.onFail(null);
                        }
                        if (TextUtils.isEmpty(a2)) {
                            return;
                        }
                        JSONObject jSONObject = new JSONObject(a2).getJSONObject(GearsLocator.ADDRESS);
                        if (jSONObject.optBoolean("click")) {
                            ChooseAddress.a(ChooseAddress.this, jSONObject, iApiCallback);
                        } else {
                            iApiCallback.onCancel();
                        }
                        ChooseAddress.a(ChooseAddress.this, true);
                        ChooseAddress.this.a(context2);
                    }
                }
            };
            context.registerReceiver(this.c, new IntentFilter("address-action"));
            context.registerReceiver(this.d, new IntentFilter("address-close-action"));
            a.a().a(97).a(new e() { // from class: com.sankuai.waimai.mmp.modules.address.WMMMPAddressModule.ChooseAddress.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.router.core.e
                public final void a(@NonNull j jVar) {
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c52aae50ab7f3edd1d2381520bcca72d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c52aae50ab7f3edd1d2381520bcca72d");
                    } else {
                        iApiCallback.onSuccess(null);
                    }
                }

                @Override // com.sankuai.waimai.router.core.e
                public final void a(@NonNull j jVar, int i) {
                    Object[] objArr2 = {jVar, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2882e92d5b0ba117619e5bc9e3ac591d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2882e92d5b0ba117619e5bc9e3ac591d");
                    } else {
                        iApiCallback.onFail(null);
                    }
                }
            }).a(context, "meituanwaimai://waimai.meituan.com/browser?inner_url=" + Uri.encode(builder.build().toString()));
        }

        @Override // com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.AbsApi
        public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
            Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58e1ec2d9cf34ace376a19d7124f2b2e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58e1ec2d9cf34ace376a19d7124f2b2e");
            } else if (this.e) {
            } else {
                iApiCallback.onCancel();
                a(getContext());
            }
        }

        @Override // com.meituan.mmp.lib.api.AbsApi
        public void onDestroy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c1c5f98030509062aa56cd53ee65294", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c1c5f98030509062aa56cd53ee65294");
            } else {
                a(getContext());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11582d920abdc0dcb1d8f71de34a7dcc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11582d920abdc0dcb1d8f71de34a7dcc");
                return;
            }
            if (this.c != null) {
                context.unregisterReceiver(this.c);
                this.c = null;
            }
            if (this.d != null) {
                context.unregisterReceiver(this.d);
                this.d = null;
            }
        }
    }
}
