package com.sankuai.waimai.business.im.group.controller;

import android.app.Activity;
import android.app.Dialog;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Dialog b;
    public View c;
    public int d;
    public int e;
    private final Activity f;
    private InterfaceC0739a g;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.im.group.controller.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0739a {
    }

    public a(Activity activity) {
        this(activity, null);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c1805e9f2f572de795248419953f1d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c1805e9f2f572de795248419953f1d5");
        }
    }

    private a(Activity activity, InterfaceC0739a interfaceC0739a) {
        Object[] objArr = {activity, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4efeafafe6c1ebca81b0270518d14f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4efeafafe6c1ebca81b0270518d14f5");
            return;
        }
        this.f = activity;
        this.g = null;
        this.b = new Dialog(this.f, R.style.wm_im_group_chat_fake_pop_view_style);
    }
}
