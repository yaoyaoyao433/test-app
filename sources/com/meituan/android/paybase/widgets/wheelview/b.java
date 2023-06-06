package com.meituan.android.paybase.widgets.wheelview;

import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    List<View> b;
    List<View> c;
    private WheelView d;

    public b(WheelView wheelView) {
        Object[] objArr = {wheelView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e142e1688615cfbdc1a7f3f3133a802", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e142e1688615cfbdc1a7f3f3133a802");
        } else {
            this.d = wheelView;
        }
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v2 */
    public final int a(LinearLayout linearLayout, int i, a aVar) {
        boolean z;
        ?? r11 = 0;
        int i2 = 1;
        Object[] objArr = {linearLayout, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1d41bcc47df7b491e234886455fd5bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1d41bcc47df7b491e234886455fd5bf")).intValue();
        }
        int i3 = i;
        int i4 = i3;
        int i5 = 0;
        while (i5 < linearLayout.getChildCount()) {
            Object[] objArr2 = new Object[i2];
            objArr2[r11] = Integer.valueOf(i3);
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "b921a8340be30c33e44d4cefa37a0908", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, r11, "b921a8340be30c33e44d4cefa37a0908")).booleanValue();
            } else {
                z = i3 >= aVar.b && i3 <= aVar.a();
            }
            if (z) {
                i5++;
            } else {
                View childAt = linearLayout.getChildAt(i5);
                Object[] objArr3 = new Object[2];
                objArr3[r11] = childAt;
                objArr3[1] = Integer.valueOf(i3);
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e2246eb900dfb675396dd0d607ce0387", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e2246eb900dfb675396dd0d607ce0387");
                } else {
                    int a2 = this.d.getViewAdapter().a();
                    if ((i3 < 0 || i3 >= a2) && !this.d.b) {
                        this.c = a(childAt, this.c);
                    } else {
                        this.b = a(childAt, this.b);
                    }
                }
                linearLayout.removeViewAt(i5);
                if (i5 == 0) {
                    i4++;
                }
            }
            i3++;
            r11 = 0;
            i2 = 1;
        }
        return i4;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61aa6cc995067451458a2559cc14cd61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61aa6cc995067451458a2559cc14cd61");
            return;
        }
        if (this.b != null) {
            this.b.clear();
        }
        if (this.c != null) {
            this.c.clear();
        }
    }

    private List<View> a(View view, List<View> list) {
        Object[] objArr = {view, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da23ba6c51e54d8b4d9f64045ada5b8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da23ba6c51e54d8b4d9f64045ada5b8b");
        }
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(view);
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(List<View> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63c2a8ca45551d0eff6a2b840a1b2c84", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63c2a8ca45551d0eff6a2b840a1b2c84");
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        View view = list.get(0);
        list.remove(0);
        return view;
    }
}
