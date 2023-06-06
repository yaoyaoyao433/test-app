package com.sankuai.waimai.bussiness.order.transfer.cross;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements com.sankuai.waimai.bussiness.order.transfer.base.b<String, C0927a> {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.transfer.cross.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0927a {
        @SerializedName(OtherVerifyTypeConstants.REQUEST_CODE)
        public int a;
        @SerializedName("login_from")
        public int b;
        @SerializedName("tag")
        public String c;
    }

    @Override // com.sankuai.waimai.bussiness.order.transfer.base.b
    public final /* synthetic */ C0927a a(String str) {
        String str2 = str;
        Object[] objArr = {str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7727d14a078768e075be3652a6e7853e", RobustBitConfig.DEFAULT_VALUE) ? (C0927a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7727d14a078768e075be3652a6e7853e") : (C0927a) new Gson().fromJson((JsonElement) ((JsonObject) ((JsonObject) new Gson().fromJson(str2, (Class<Object>) JsonObject.class)).get(PackageLoadReporter.LoadType.LOCAL)), (Class<Object>) C0927a.class);
    }
}
