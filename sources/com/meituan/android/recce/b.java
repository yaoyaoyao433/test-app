package com.meituan.android.recce;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.react.bridge.ReactApplicationContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends ContextWrapper {
    public static ChangeQuickRedirect a;
    private Context b;
    private ReactApplicationContext c;

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6adcc8d8556d1c1234cc62060c8f2b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6adcc8d8556d1c1234cc62060c8f2b8");
        } else {
            this.b = context;
        }
    }

    public final ReactApplicationContext a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1682b5646b157d153478bd015bcc6325", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactApplicationContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1682b5646b157d153478bd015bcc6325");
        }
        if (this.c == null) {
            this.c = new ReactApplicationContext(this.b);
        }
        return this.c;
    }

    public final Activity b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6364be4220f597088720513f4c6b427", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6364be4220f597088720513f4c6b427");
        }
        if (this.b instanceof Activity) {
            return (Activity) this.b;
        }
        a().handleException(new Exception("context must be an Activity"));
        return null;
    }
}
