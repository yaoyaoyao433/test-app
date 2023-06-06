package com.meituan.msi.api.address;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.g;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.lifecycle.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ChooseAddress implements IMsiApi, g, a {
    public static ChangeQuickRedirect a;
    private BroadcastReceiver b;
    private BroadcastReceiver c;
    private boolean d;

    @Override // com.meituan.msi.lifecycle.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce534ad67a02b037ed8fc4f116e03359", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce534ad67a02b037ed8fc4f116e03359");
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0dd6be5f8d2a4828e4ca30670434140", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0dd6be5f8d2a4828e4ca30670434140");
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5e4529d586f3b65db0f08135d91d7db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5e4529d586f3b65db0f08135d91d7db");
        }
    }

    public static /* synthetic */ void a(ChooseAddress chooseAddress, JSONObject jSONObject, MsiContext msiContext) {
        Object[] objArr = {jSONObject, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, chooseAddress, changeQuickRedirect, false, "3967667c38ece323de15807fc360cdc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, chooseAddress, changeQuickRedirect, false, "3967667c38ece323de15807fc360cdc5");
            return;
        }
        try {
            ChooseAddressResponse chooseAddressResponse = new ChooseAddressResponse();
            JSONObject jSONObject2 = jSONObject.getJSONObject("address_more");
            chooseAddressResponse.userName = jSONObject2.getString("recipient_name");
            chooseAddressResponse.telNumber = jSONObject2.getString("phone");
            chooseAddressResponse.detailInfo = jSONObject2.getString("address_name") + StringUtil.SPACE + jSONObject2.getString("house_number");
            chooseAddressResponse.detailInfoNew = chooseAddressResponse.detailInfo;
            JSONArray jSONArray = jSONObject2.getJSONArray("address_admin_list");
            for (int i = 0; i < 3; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                String string = jSONObject3.getString("name");
                if (i == 0) {
                    chooseAddressResponse.provinceName = string;
                } else if (i == 1) {
                    chooseAddressResponse.cityName = string;
                } else {
                    chooseAddressResponse.countyName = string;
                    chooseAddressResponse.nationalCode = jSONObject3.getString("code");
                }
            }
            chooseAddressResponse.postalCode = "";
            chooseAddressResponse.streetName = "";
            msiContext.onSuccess(chooseAddressResponse);
        } catch (Throwable unused) {
            msiContext.onError("failed");
        }
    }

    public static /* synthetic */ boolean a(ChooseAddress chooseAddress, boolean z) {
        chooseAddress.d = true;
        return true;
    }

    @MsiApiMethod(name = "chooseAddress", request = ChooseAddressParam.class, response = ChooseAddressResponse.class)
    public void chooseAddress(ChooseAddressParam chooseAddressParam, final MsiContext msiContext) {
        Object[] objArr = {chooseAddressParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e06b5ec8a1df014a733220902da270a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e06b5ec8a1df014a733220902da270a");
            return;
        }
        Context f = com.meituan.msi.a.f();
        String str = TextUtils.isEmpty(chooseAddressParam.bizId) ? "1101" : chooseAddressParam.bizId;
        if (TextUtils.isEmpty(chooseAddressParam.env)) {
            chooseAddressParam.env = "production";
        }
        Uri.Builder builder = new Uri.Builder();
        if (!"meituaninternaltest".equals(com.meituan.android.base.a.f) || chooseAddressParam.env.equals("production")) {
            builder.scheme("https").authority("i.meituan.com");
            builder.encodedPath("awp").appendPath("hfe").appendPath(ConfigInfo.MODULE_BLOCK).appendPath("index.html");
            builder.appendQueryParameter("cube_h", "31b2f9f9a529").appendQueryParameter("cube_i", "49414");
            builder.appendQueryParameter("bizID", str).appendQueryParameter("clientID", "69");
        } else if ("staging".equals(chooseAddressParam.env)) {
            builder.scheme("http").authority("testi.meituan.com");
            builder.encodedPath("awp").appendPath("hfe").appendPath(ConfigInfo.MODULE_BLOCK).appendPath("st").appendPath("index.html");
            builder.appendQueryParameter("cube_h", "8ea95cbd6c34").appendQueryParameter("cube_i", "2960");
            builder.appendQueryParameter("bizID", str).appendQueryParameter("clientID", "52");
        } else if ("test".equals(chooseAddressParam.env)) {
            builder.scheme("http").authority("testi.meituan.com");
            builder.encodedPath("awp").appendPath("hfe").appendPath(ConfigInfo.MODULE_BLOCK).appendPath("test").appendPath("16036b295ae9").appendPath("785").appendPath("index.html");
            builder.appendQueryParameter("cube_h", "8ea95cbd6c34").appendQueryParameter("cube_i", "2960");
            builder.appendQueryParameter("bizID", str).appendQueryParameter("clientID", "52");
        } else if (!TextUtils.isEmpty(chooseAddressParam.env)) {
            msiContext.onError("not production");
            return;
        }
        Uri.Builder builder2 = new Uri.Builder();
        builder2.scheme("imeituan").authority("web").appendQueryParameter("url", builder.build().toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(builder2.build());
        this.d = false;
        this.b = new BroadcastReceiver() { // from class: com.meituan.msi.api.address.ChooseAddress.1
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent2) {
                Object[] objArr2 = {context, intent2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0fd7f078195f37ff26fc7121cdec1c89", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0fd7f078195f37ff26fc7121cdec1c89");
                } else if (intent2 == null) {
                } else {
                    try {
                        String a2 = f.a(intent2, "data");
                        if (TextUtils.isEmpty(a2)) {
                            return;
                        }
                        JSONObject jSONObject = new JSONObject(a2).getJSONObject(GearsLocator.ADDRESS);
                        if (jSONObject.optBoolean("click")) {
                            ChooseAddress.a(ChooseAddress.this, jSONObject, msiContext);
                            ChooseAddress.a(ChooseAddress.this, true);
                            ChooseAddress.this.a(context);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        };
        this.c = new BroadcastReceiver() { // from class: com.meituan.msi.api.address.ChooseAddress.2
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent2) {
                String a2;
                Object[] objArr2 = {context, intent2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19e3befe947e1e3a082dabff3701be17", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19e3befe947e1e3a082dabff3701be17");
                } else if (intent2 == null) {
                } else {
                    try {
                        a2 = f.a(intent2, "data");
                    } catch (Throwable unused) {
                        msiContext.onError("failed");
                    }
                    if (TextUtils.isEmpty(a2)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(a2).getJSONObject(GearsLocator.ADDRESS);
                    if (jSONObject.optBoolean("click")) {
                        ChooseAddress.a(ChooseAddress.this, jSONObject, msiContext);
                    } else {
                        msiContext.onError("canceled");
                    }
                    ChooseAddress.a(ChooseAddress.this, true);
                    ChooseAddress.this.a(context);
                }
            }
        };
        f.registerReceiver(this.b, new IntentFilter("address-action"));
        f.registerReceiver(this.c, new IntentFilter("address-close-action"));
        intent.setPackage(f.getPackageName());
        msiContext.startActivityForResult(intent, 97);
    }

    @Override // com.meituan.msi.api.g
    public final void a(int i, Intent intent, MsiContext msiContext) {
        Object[] objArr = {Integer.valueOf(i), intent, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d238110c01088ed69eaed11e81056406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d238110c01088ed69eaed11e81056406");
        } else if (this.d) {
        } else {
            msiContext.onError("");
            a(com.meituan.msi.a.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e29431d54c3c043234c59f8de6d106b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e29431d54c3c043234c59f8de6d106b9");
            return;
        }
        if (this.b != null) {
            context.unregisterReceiver(this.b);
            this.b = null;
        }
        if (this.c != null) {
            context.unregisterReceiver(this.c);
            this.c = null;
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f90115acadc5ef35503d40c045bab86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f90115acadc5ef35503d40c045bab86");
        } else {
            a(com.meituan.msi.a.f());
        }
    }
}
