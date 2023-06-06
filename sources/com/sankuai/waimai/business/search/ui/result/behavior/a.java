package com.sankuai.waimai.business.search.ui.result.behavior;

import android.support.v4.view.ViewCompat;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final View b;
    int c;
    int d;
    int e;
    int f;

    public a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ccda55be76a9c09bb4526ab0f4835b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ccda55be76a9c09bb4526ab0f4835b7");
        } else {
            this.b = view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd7d675f7d1df310dd7197ff6d4d1b9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd7d675f7d1df310dd7197ff6d4d1b9d");
            return;
        }
        ViewCompat.offsetTopAndBottom(this.b, this.e - (this.b.getTop() - this.c));
        ViewCompat.offsetLeftAndRight(this.b, this.f - (this.b.getLeft() - this.d));
    }

    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05aa9a852a48511ae329d05f26d8fd22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05aa9a852a48511ae329d05f26d8fd22")).booleanValue();
        }
        if (this.e != i) {
            this.e = i;
            a();
            return true;
        }
        return false;
    }
}
