package com.meituan.android.legwork.ui.base;

import android.content.Intent;
import android.os.Bundle;
import com.meituan.android.legwork.ui.activity.ToSendOneMoreActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class b {
    public static ChangeQuickRedirect a;
    public final ToSendOneMoreActivity b;

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cef2f49a6fec58aa7ecf16b149e4a69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cef2f49a6fec58aa7ecf16b149e4a69");
        }
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "990080c3cf71dff55163302aea2afeee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "990080c3cf71dff55163302aea2afeee");
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "712358684b139e2f1688ba0a937f973d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "712358684b139e2f1688ba0a937f973d");
        }
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return true;
    }

    public b(ToSendOneMoreActivity toSendOneMoreActivity) {
        Object[] objArr = {toSendOneMoreActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bc2272d8243adaac67dfa927288dd64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bc2272d8243adaac67dfa927288dd64");
        } else {
            this.b = toSendOneMoreActivity;
        }
    }
}
