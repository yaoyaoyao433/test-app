package com.meituan.android.ptcommonim.ptcard.ptinvoice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.ptcommonim.pageadapter.message.item.g;
import com.meituan.android.ptcommonim.pageadapter.message.view.PTIMMachRootView;
import com.meituan.android.ptcommonim.ptcard.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.imui.session.event.e;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements g, d {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final Map<String, com.meituan.android.ptcommonim.pageadapter.message.item.a> c;
    private final com.meituan.android.ptcommonim.pageadapter.message.utils.b d;

    @Override // com.meituan.android.ptcommonim.pageadapter.message.item.g
    public final void a(EventMessage eventMessage) {
    }

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e891327f0c58d6f58e18e5032ac39e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e891327f0c58d6f58e18e5032ac39e7");
            return;
        }
        this.c = new HashMap();
        this.b = context;
        this.d = new com.meituan.android.ptcommonim.pageadapter.message.utils.b(context, this);
        com.sankuai.xm.imui.session.b b = com.sankuai.xm.imui.session.b.b(context);
        if (b != null) {
            b.a(e.a.class, this.d, false);
        }
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.message.item.g
    public final Map<String, com.meituan.android.ptcommonim.pageadapter.message.item.a> a() {
        return this.c;
    }

    @Override // com.meituan.android.ptcommonim.ptcard.d
    public final View a(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "754fab8eb4172ed3da3af58370ed3ad2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "754fab8eb4172ed3da3af58370ed3ad2");
        }
        PTIMMachRootView a2 = PTIMMachRootView.a(context, viewGroup);
        a2.setId(R.id.ptim_mach_root_view_container);
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0361  */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.util.Map] */
    @Override // com.meituan.android.ptcommonim.ptcard.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r30, com.sankuai.xm.imui.session.entity.b<com.sankuai.xm.im.message.bean.GeneralMessage> r31, java.util.Map<java.lang.String, java.lang.Object> r32) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.ptcommonim.ptcard.ptinvoice.b.a(android.view.View, com.sankuai.xm.imui.session.entity.b, java.util.Map):void");
    }

    @Nullable
    private <T> T a(Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a9baea90ff21e7e81f348b40f6f0a04", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a9baea90ff21e7e81f348b40f6f0a04");
        }
        try {
            return (T) map.get(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
