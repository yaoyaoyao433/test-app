package com.meituan.roodesign.widgets.iconfont;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    volatile boolean b;
    private ConcurrentHashMap<String, Typeface> c;
    private AssetManager d;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83c9f7f51776cb84b1027b9eb945c1f9", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83c9f7f51776cb84b1027b9eb945c1f9") : C0520a.a;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11a07e3af885411bdf0eac7b5298621f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11a07e3af885411bdf0eac7b5298621f");
            return;
        }
        this.c = null;
        this.d = null;
        this.b = false;
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d3c61bb256ca4a072f05ca08c94403a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d3c61bb256ca4a072f05ca08c94403a");
        } else if (context != null) {
            this.c = new ConcurrentHashMap<>();
            this.d = context.getAssets();
            this.b = true;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.roodesign.widgets.iconfont.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0520a {
        private static a a = new a();
    }

    private Typeface a(String str, String str2) {
        Typeface typeface;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69073f11db64a8bacde7f113d4eb53c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69073f11db64a8bacde7f113d4eb53c1");
        }
        if (this.b) {
            try {
                typeface = Typeface.createFromAsset(this.d, str2);
            } catch (RuntimeException e) {
                e.printStackTrace();
                typeface = null;
            }
            if (typeface != null && typeface != Typeface.DEFAULT) {
                Object[] objArr2 = {str, typeface};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "050c8db4c08acaca535dd0b7ea90575c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "050c8db4c08acaca535dd0b7ea90575c");
                } else if (this.b && !TextUtils.isEmpty(str) && !this.c.containsKey(str)) {
                    this.c.put(str, typeface);
                }
            }
            return typeface;
        }
        return null;
    }

    public final Typeface a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60fe2322add689d2eca1ed0d6ed27e80", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60fe2322add689d2eca1ed0d6ed27e80");
        }
        if (this.b) {
            Typeface typeface = this.c.get(str);
            if (typeface == null) {
                return a(str, "fonts/" + str + ".ttf");
            }
            return typeface;
        }
        return null;
    }
}
