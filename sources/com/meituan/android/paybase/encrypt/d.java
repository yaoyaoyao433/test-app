package com.meituan.android.paybase.encrypt;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.i;
import java.io.IOException;
import java.lang.annotation.Annotation;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements i<String, String> {
    public static ChangeQuickRedirect a;
    private Annotation[] b;
    private Context c;

    @Override // com.sankuai.meituan.retrofit2.i
    public final /* synthetic */ String a(String str) throws IOException {
        Annotation[] annotationArr;
        String str2 = str;
        Object[] objArr = {str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9827b98176d058d4951f9e0c0ba512dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9827b98176d058d4951f9e0c0ba512dc");
        }
        if (com.meituan.android.paybase.utils.b.a(this.c.getApplicationContext()) && this.b != null && !str2.startsWith(" **need*q encrypt*qq")) {
            for (Annotation annotation : this.b) {
                if (annotation != null && Encrypt.class.equals(annotation.annotationType())) {
                    return " **need*q encrypt*qq" + str2;
                }
            }
        }
        return str2;
    }

    public d(Annotation[] annotationArr, Context context) {
        Object[] objArr = {annotationArr, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07d9ad603f96c27881ff1bac4ea39d78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07d9ad603f96c27881ff1bac4ea39d78");
            return;
        }
        this.b = (Annotation[]) annotationArr.clone();
        this.c = context;
    }
}
