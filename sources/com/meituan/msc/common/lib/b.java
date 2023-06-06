package com.meituan.msc.common.lib;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    private static final List<Object> a = new CopyOnWriteArrayList();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;

        public void a(String str, Intent intent) {
            Object[] objArr = {str, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10b8e180f2134b8967020e504949962a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10b8e180f2134b8967020e504949962a");
                return;
            }
            Iterator it = b.a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
