package com.dianping.picassocontroller.monitor;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.picasso.PicassoEnvironment;
import com.meituan.android.common.unionid.IUnionIdCallback;
import com.meituan.android.common.unionid.UnionIdHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends com.dianping.monitor.impl.a {
    public static ChangeQuickRedirect a;
    private String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        static b a;
    }

    private b(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23f681a57bb42e8eb935c3770ec5883d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23f681a57bb42e8eb935c3770ec5883d");
        } else {
            this.b = "";
        }
    }

    @Override // com.dianping.monitor.impl.a
    public final String getUnionid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1f9b3310dfaca9a7b866487f97a6464", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1f9b3310dfaca9a7b866487f97a6464");
        }
        if (TextUtils.isEmpty(this.b)) {
            this.b = UnionIdHandler.getSingleInstance(PicassoEnvironment.globalContext).getUnionIdFromLocal();
        }
        if (TextUtils.isEmpty(this.b)) {
            UnionIdHandler.getSingleInstance(PicassoEnvironment.globalContext).getUnionId(new IUnionIdCallback() { // from class: com.dianping.picassocontroller.monitor.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.unionid.IUnionIdCallback
                public final void onCall(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7720fcd912f0a3fb87d1c7e98c58875d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7720fcd912f0a3fb87d1c7e98c58875d");
                    } else {
                        b.this.b = str;
                    }
                }
            });
        }
        return this.b == null ? "" : this.b;
    }

    public static b a(Context context) {
        int i = 1;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57dea4c07540ec881e5b54c85c6290d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57dea4c07540ec881e5b54c85c6290d3");
        }
        if (a.a == null) {
            Context applicationContext = context.getApplicationContext();
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8572f53d0ac4ba629ca99515669ed4c0", RobustBitConfig.DEFAULT_VALUE)) {
                int i2 = PicassoEnvironment.getPicassoEnvironment(context).appID;
                switch (i2) {
                    case 0:
                        break;
                    case 1:
                        i = 10;
                        break;
                    default:
                        i = i2;
                        break;
                }
            } else {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8572f53d0ac4ba629ca99515669ed4c0")).intValue();
            }
            a.a = new b(applicationContext, i);
        }
        return a.a;
    }
}
