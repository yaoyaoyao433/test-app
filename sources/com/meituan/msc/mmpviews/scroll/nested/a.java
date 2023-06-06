package com.meituan.msc.mmpviews.scroll.nested;

import android.view.View;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.mmpviews.scroll.i;
import com.meituan.msc.uimanager.NativeViewHierarchyManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public NativeViewHierarchyManager b;
    public final Map<String, C0450a> c;
    private ReactApplicationContext d;

    public a(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06d47d712b42e9287379f505994c8b4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06d47d712b42e9287379f505994c8b4a");
            return;
        }
        this.c = new HashMap();
        if (reactApplicationContext == null || reactApplicationContext.getUIManagerModule() == null || reactApplicationContext.getUIManagerModule().b() == null || reactApplicationContext.getUIManagerModule().b().g() == null) {
            return;
        }
        this.d = reactApplicationContext;
        this.b = reactApplicationContext.getUIManagerModule().b().g().a();
    }

    public void a(final C0450a c0450a, final boolean z) {
        Object[] objArr = {c0450a, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "076f876400ac517d9462a1b635de85e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "076f876400ac517d9462a1b635de85e8");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.mmpviews.scroll.nested.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11954afb09140e11fae4068c2bc4c2a5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11954afb09140e11fae4068c2bc4c2a5");
                        return;
                    }
                    View a2 = a.this.b.a(c0450a.b);
                    a aVar = a.this;
                    Object[] objArr3 = {a2, (byte) 1};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    View a3 = PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "8953abe4eab95e01254612117d49f41a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "8953abe4eab95e01254612117d49f41a") : aVar.a(a2);
                    if (a3 != null) {
                        if (z) {
                            MSCNestedScrollView mSCNestedScrollView = (MSCNestedScrollView) a3;
                            int i = c0450a.c;
                            Object[] objArr4 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = MSCNestedScrollView.b;
                            if (PatchProxy.isSupport(objArr4, mSCNestedScrollView, changeQuickRedirect4, false, "be7f7e46be830e3883fc00cb6fb98803", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, mSCNestedScrollView, changeQuickRedirect4, false, "be7f7e46be830e3883fc00cb6fb98803");
                                return;
                            } else {
                                mSCNestedScrollView.c.add(Integer.valueOf(i));
                                return;
                            }
                        }
                        MSCNestedScrollView mSCNestedScrollView2 = (MSCNestedScrollView) a3;
                        int i2 = c0450a.c;
                        Object[] objArr5 = {Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect5 = MSCNestedScrollView.b;
                        if (PatchProxy.isSupport(objArr5, mSCNestedScrollView2, changeQuickRedirect5, false, "793016c6765c9a80ff42ad6106dee47d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, mSCNestedScrollView2, changeQuickRedirect5, false, "793016c6765c9a80ff42ad6106dee47d");
                        } else {
                            mSCNestedScrollView2.c.remove(Integer.valueOf(i2));
                        }
                    }
                }
            });
        }
    }

    View a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09a15f2c32b799be7683815005cdc96d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09a15f2c32b799be7683815005cdc96d");
        }
        if (view instanceof i) {
            i iVar = (i) view;
            if (iVar.getChildCount() > 0) {
                View childAt = iVar.getChildAt(0);
                if (childAt instanceof MSCNestedScrollView) {
                    return childAt;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.mmpviews.scroll.nested.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0450a {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public int d;
        public int e;

        public C0450a(int i, int i2, int i3, int i4) {
            Object[] objArr = {a.this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e065422f1f7b03d0228f3d6213cebf2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e065422f1f7b03d0228f3d6213cebf2");
                return;
            }
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57984980a081ed1ec167fd12657c9880", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57984980a081ed1ec167fd12657c9880");
            }
            return this.b + CommonConstant.Symbol.UNDERLINE + this.c;
        }
    }
}
