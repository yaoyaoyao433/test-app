package com.sankuai.waimai.platform.mach.order;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewManager;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.mach.util.a;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.mach.component.base.a<LinearLayout> {
    public static ChangeQuickRedirect a;
    EditText b;
    ImageView c;
    com.sankuai.waimai.mach.parser.d d;
    com.sankuai.waimai.mach.parser.d e;
    boolean f;
    public ViewTreeObserver.OnGlobalLayoutListener g;
    com.sankuai.waimai.mach.parser.d h;
    private LinearLayout i;
    private C1056a j;
    private com.sankuai.waimai.mach.parser.d k;
    private View r;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee783be388ecabed1aee1df709db23ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee783be388ecabed1aee1df709db23ea");
            return;
        }
        this.j = new C1056a();
        this.r = null;
    }

    public static /* synthetic */ void a(a aVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "d43f5e023af90ec20e8e522a321311fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "d43f5e023af90ec20e8e522a321311fd");
        } else if (aVar.m == null || aVar.k == null) {
        } else {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            aVar.m.asyncCallJSMethod(aVar.k.b, linkedList);
            aVar.f = false;
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ LinearLayout b(Context context) {
        Activity activity;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58d766ede90782a0acbd0ec37043334a", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58d766ede90782a0acbd0ec37043334a");
        }
        this.i = new LinearLayout(context);
        C1056a c1056a = this.j;
        if ((c1056a.b == -1 && c1056a.c == -1) ? false : true) {
            C1056a c1056a2 = this.j;
            Object[] objArr2 = {c1056a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3cdf248461d6a3e28cfc4d2b51de7ad4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3cdf248461d6a3e28cfc4d2b51de7ad4");
            } else if (c1056a2 != null) {
                this.b.setText(c1056a2.d);
            }
        }
        if (this.m != null && (activity = this.m.getActivity()) != null && !activity.isFinishing() && activity.getWindow() != null) {
            this.r = activity.getWindow().getDecorView();
        }
        if (this.r != null && this.r.getViewTreeObserver() != null) {
            if (this.g != null) {
                this.r.getViewTreeObserver().removeOnGlobalLayoutListener(this.g);
            }
            this.g = com.sankuai.waimai.platform.mach.util.a.a(this.r, new a.b() { // from class: com.sankuai.waimai.platform.mach.order.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.util.a.b
                public final void a(boolean z) {
                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7ec0f65a821979b9445b247cb82e29a3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7ec0f65a821979b9445b247cb82e29a3");
                    } else if (a.this.b.isShown() && a.this.b.isFocused()) {
                        if (!z) {
                            a.a(a.this, a.this.b == null ? null : a.this.b.getText().toString());
                            if (a.this.b != null) {
                                a.this.b.setSelection(0);
                                a.this.b.setCursorVisible(false);
                            }
                        } else if (a.this.b != null) {
                            a.this.b.setCursorVisible(true);
                        }
                    }
                }
            });
        }
        if (this.b.getParent() != null) {
            ((ViewManager) this.b.getParent()).removeView(this.b);
        }
        if (this.c.getParent() != null) {
            ((ViewManager) this.c.getParent()).removeView(this.c);
        }
        this.i.addView(this.b);
        this.i.addView(this.c);
        this.i.setGravity(16);
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c7  */
    @Override // com.sankuai.waimai.mach.component.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 1168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.mach.order.a.a():void");
    }

    private int j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5531fe893bab11dfb3d8cdf35aff2bff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5531fe893bab11dfb3d8cdf35aff2bff")).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    private boolean k(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34abe43be0619b2d02b9242050204ffd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34abe43be0619b2d02b9242050204ffd")).booleanValue() : !TextUtils.isEmpty(str) && str.equals("true");
    }

    private int l(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dffb7cab415a6da44a893b28a9cfa046", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dffb7cab415a6da44a893b28a9cfa046")).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    private int m(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4683bc6f7baa3574477dfe7fb73dbf3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4683bc6f7baa3574477dfe7fb73dbf3")).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54961fc7fc22862f348c7231870a988f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54961fc7fc22862f348c7231870a988f");
            return;
        }
        super.b();
        if (this.r == null || this.r.getViewTreeObserver() == null || this.g == null) {
            return;
        }
        this.r.getViewTreeObserver().removeOnGlobalLayoutListener(this.g);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.mach.order.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1056a {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public String d;
        public int e;
        public int f;
        public int g;
        public int h;
        public boolean i;
        public boolean j;
        public String k;
        public int l;

        public C1056a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4875f0ddd65fd98244f0a4c31132ad1f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4875f0ddd65fd98244f0a4c31132ad1f");
                return;
            }
            this.b = -1;
            this.c = -1;
            this.d = "";
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = true;
            this.j = false;
            this.k = "";
            this.l = -1;
        }
    }
}
