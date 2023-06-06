package com.meituan.android.yoda.callbacks;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.yoda.IYodaVerifyListener;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.android.yoda.interfaces.h;
import com.meituan.android.yoda.interfaces.i;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class f implements h<YodaResult> {
    public static ChangeQuickRedirect a;
    private String b;
    private i c;
    private String d;
    private boolean e;

    @Override // com.meituan.android.yoda.interfaces.h
    public final /* synthetic */ void a(String str, @NonNull YodaResult yodaResult) {
        final YodaResult yodaResult2 = yodaResult;
        Object[] objArr = {str, yodaResult2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dacf3e9b6f4fda37daec3c03d84580ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dacf3e9b6f4fda37daec3c03d84580ca");
            return;
        }
        String str2 = com.meituan.android.yoda.plugins.d.a().f;
        if (this.e && !TextUtils.isEmpty(str2)) {
            h<ap> hVar = new h<ap>() { // from class: com.meituan.android.yoda.callbacks.f.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.yoda.interfaces.h
                public final /* synthetic */ void a(String str3, @NonNull ap apVar) {
                    Object[] objArr2 = {str3, apVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2adbc2f919d75587911da69862f7d5d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2adbc2f919d75587911da69862f7d5d");
                    } else {
                        f.this.a2(str3, yodaResult2);
                    }
                }

                @Override // com.meituan.android.yoda.interfaces.h
                public final void a(String str3, @NonNull Error error) {
                    Object[] objArr2 = {str3, error};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09081520ebd1ac9cbb0ee8d58b3ef6be", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09081520ebd1ac9cbb0ee8d58b3ef6be");
                    } else {
                        f.this.b(str3, error);
                    }
                }
            };
            Object[] objArr2 = {str, str2, hVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d748ca1e3b7554e04614f0f4c028a5d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d748ca1e3b7554e04614f0f4c028a5d");
                return;
            }
            String str3 = this.b;
            com.meituan.android.yoda.monitor.log.a.a(str3, "mtsiCheck, requestCode = " + str + ", url = " + str2, true);
            com.meituan.android.yoda.network.a.a().a(str, str2, hVar);
            return;
        }
        a2(str, yodaResult2);
    }

    public f(IYodaVerifyListener iYodaVerifyListener, i iVar, boolean z) {
        Object[] objArr = {iYodaVerifyListener, iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f0bdbeabbfe09fb75f7927659895af4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f0bdbeabbfe09fb75f7927659895af4");
            return;
        }
        this.b = f.class.getSimpleName();
        this.c = iVar;
        this.d = null;
        this.e = z;
    }

    @Override // com.meituan.android.yoda.interfaces.h
    public final void a(String str, @NonNull Error error) {
        Object[] objArr = {str, error};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30fb59d1ab399dc948ed42687ccc71bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30fb59d1ab399dc948ed42687ccc71bd");
        } else {
            b(str, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(String str, @NonNull YodaResult yodaResult) {
        int a2;
        Object[] objArr = {str, yodaResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef89b73179a0759dc9c14efeaca96748", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef89b73179a0759dc9c14efeaca96748");
            return;
        }
        if (yodaResult != null && yodaResult.data != null) {
            Object obj = yodaResult.data.get("nextVerifyMethodId");
            if (obj != null && (a2 = x.a(obj.toString(), -2147483647)) != -2147483647) {
                this.c.b(str, a2, null);
                return;
            }
            Object obj2 = yodaResult.data.get(OtherVerifyTypeConstants.RESPONSE_CODE);
            if (yodaResult.data.containsKey("origin_request_code")) {
                String valueOf = String.valueOf(yodaResult.data.get("origin_request_code"));
                if (!TextUtils.isEmpty(valueOf)) {
                    str = valueOf;
                }
            }
            if (obj2 != null) {
                if (TextUtils.isEmpty(this.d)) {
                    this.c.a(str, obj2.toString());
                    return;
                } else {
                    this.c.a(this.d, obj2.toString());
                    return;
                }
            }
        }
        if (TextUtils.isEmpty(this.d)) {
            this.c.a(str, "");
        } else {
            this.c.a(this.d, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, @NonNull Error error) {
        Object[] objArr = {str, error};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd1dc6b6468eb047e0384332bd3c62fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd1dc6b6468eb047e0384332bd3c62fa");
        } else if (this.c != null) {
            this.c.a(str, error);
        }
    }
}
