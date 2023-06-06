package com.meituan.msi.api.phonecall;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.msi.a;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MakePhoneCallApi implements IMsiApi {
    public static ChangeQuickRedirect a;
    private final Context b;

    public MakePhoneCallApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96396b423b244842f5a713fad91ba552", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96396b423b244842f5a713fad91ba552");
        } else {
            this.b = a.f();
        }
    }

    @MsiApiMethod(name = "makePhoneCall", request = PhoneCallParam.class)
    public void makePhoneCall(PhoneCallParam phoneCallParam, MsiContext msiContext) {
        Object[] objArr = {phoneCallParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "556050160056db0d61ac7d0a8903eb49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "556050160056db0d61ac7d0a8903eb49");
            return;
        }
        String str = phoneCallParam.phoneNumber;
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.DIAL");
            intent.addFlags(y.a);
            intent.setData(Uri.parse("tel:" + str));
            this.b.startActivity(intent);
            msiContext.onSuccess("");
            return;
        }
        msiContext.onError(400, "phoneNumber is empty");
    }
}
