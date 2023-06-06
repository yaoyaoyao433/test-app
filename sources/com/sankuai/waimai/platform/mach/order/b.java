package com.sankuai.waimai.platform.mach.order;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.mach.component.base.a<EditText> {
    public static ChangeQuickRedirect a;
    EditText b;
    public ViewTreeObserver.OnGlobalLayoutListener c;
    private a d;
    private com.sankuai.waimai.mach.parser.d e;
    private View f;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34d57262ff0a1573d93b15b7dee143a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34d57262ff0a1573d93b15b7dee143a4");
            return;
        }
        this.d = new a();
        this.f = null;
    }

    public static /* synthetic */ void a(b bVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "d1f889a4faa31f351f5b549661ceba1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "d1f889a4faa31f351f5b549661ceba1c");
        } else if (bVar.m == null || bVar.e == null) {
        } else {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            bVar.m.asyncCallJSMethod(bVar.e.b, linkedList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a2  */
    @Override // com.sankuai.waimai.mach.component.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ android.widget.EditText b(android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.mach.order.b.b(android.content.Context):android.view.View");
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cccb0b1403d4e44e880e30388877e35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cccb0b1403d4e44e880e30388877e35");
            return;
        }
        this.d.d = "";
        this.d.d = a("content");
        if (k() == null || !(k().get("@text-changed") instanceof com.sankuai.waimai.mach.parser.d)) {
            return;
        }
        this.e = (com.sankuai.waimai.mach.parser.d) k().get("@text-changed");
    }

    private int j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "678f9b63fb77c3c8945f6161ce1a1d9e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "678f9b63fb77c3c8945f6161ce1a1d9e")).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    private int k(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aed668d08458a7f98df6e647f66856b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aed668d08458a7f98df6e647f66856b")).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    private int l(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de5de390a452ec763c231eb2c2e22119", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de5de390a452ec763c231eb2c2e22119")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78c9d8889c1fe288efce211d98d54fe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78c9d8889c1fe288efce211d98d54fe1");
            return;
        }
        super.b();
        if (this.f == null || this.f.getViewTreeObserver() == null || this.c == null) {
            return;
        }
        this.f.getViewTreeObserver().removeOnGlobalLayoutListener(this.c);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public String d;
        public int e;
        public int f;
        public int g;
        public int h;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "433738dee9832afa4ff226dcd764e6f3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "433738dee9832afa4ff226dcd764e6f3");
                return;
            }
            this.b = -1;
            this.c = -1;
            this.d = "";
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
        }
    }
}
