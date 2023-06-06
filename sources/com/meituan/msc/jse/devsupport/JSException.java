package com.meituan.msc.jse.devsupport;

import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public class JSException extends Exception {
    public static ChangeQuickRedirect a;
    public final String b;

    @DoNotStrip
    public JSException(String str, String str2, Throwable th) {
        super(str, th);
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f35c89ec43a3ecd8b4a6df4ee6385fd1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f35c89ec43a3ecd8b4a6df4ee6385fd1");
        } else {
            this.b = str2;
        }
    }
}
