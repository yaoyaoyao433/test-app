package com.meituan.android.screenshot.manager;

import android.support.constraint.R;
import com.meituan.android.screenshot.model.ScreenShotItemModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public int b;
    com.meituan.android.screenshot.listener.b c;
    public List<ScreenShotItemModel> d;

    private a(C0366a c0366a) {
        Object[] objArr = {c0366a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b238aa8feadf66c0ebf835145717d9b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b238aa8feadf66c0ebf835145717d9b7");
            return;
        }
        this.b = R.style.ScreenShotFloatThemeBase;
        this.c = c0366a.c;
        this.d = c0366a.b;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.screenshot.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0366a {
        public static ChangeQuickRedirect a;
        List<ScreenShotItemModel> b;
        public com.meituan.android.screenshot.listener.b c;

        public C0366a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d377f034aeb80d9082dd0142ad77f885", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d377f034aeb80d9082dd0142ad77f885");
            } else {
                this.b = new ArrayList();
            }
        }
    }
}
