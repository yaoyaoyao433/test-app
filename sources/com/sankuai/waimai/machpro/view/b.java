package com.sankuai.waimai.machpro.view;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends TouchDelegate {
    public static ChangeQuickRedirect a;
    private ViewGroup b;
    private int c;
    private List<a> d;
    private int[] e;
    private a f;
    private boolean g;

    public b(ViewGroup viewGroup) {
        super(new Rect(), viewGroup);
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a5b35431c0eff05ebf25fe43337d1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a5b35431c0eff05ebf25fe43337d1b");
            return;
        }
        this.e = new int[2];
        this.g = true;
        this.c = ViewConfiguration.get(viewGroup.getContext()).getScaledTouchSlop();
        this.b = viewGroup;
        viewGroup.setTouchDelegate(this);
    }

    public final void a(@NonNull View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "344643efbe957ac36eba1980f9738333", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "344643efbe957ac36eba1980f9738333");
            return;
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        a a2 = a(view);
        if (a2 != null) {
            a2.b.set(i, i2, i3, i4);
        } else {
            a2 = new a(view, new Rect(i, i2, i3, i4));
        }
        this.d.add(a2);
    }

    public final a a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d9ec849608f51fbfb0363fe7d1ae1d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d9ec849608f51fbfb0363fe7d1ae1d9");
        }
        LinkedList linkedList = null;
        if (this.d == null || this.d.isEmpty()) {
            return null;
        }
        a aVar = null;
        for (int i = 0; i < this.d.size(); i++) {
            a aVar2 = this.d.get(i);
            if (aVar2.e.get() == null) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(this.d.get(i));
            } else if (aVar2.e.get() == view) {
                aVar = this.d.get(i);
            }
        }
        if (!com.sankuai.waimai.machpro.util.b.b((List) linkedList)) {
            this.d.removeAll(linkedList);
        }
        if (aVar != null) {
            this.d.remove(aVar);
        }
        return aVar;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        a aVar2;
        boolean z;
        int i = 0;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a637c4c149425da7cd41db576f1f558", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a637c4c149425da7cd41db576f1f558")).booleanValue();
        }
        if (this.g) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            switch (motionEvent.getActionMasked()) {
                case 0:
                    Object[] objArr2 = {Integer.valueOf(x), Integer.valueOf(y), (byte) 1};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d86ea14f0d4d1148f1d295bf0998d53", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar2 = (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d86ea14f0d4d1148f1d295bf0998d53");
                    } else {
                        if (this.d != null && !this.d.isEmpty()) {
                            this.b.getLocationInWindow(this.e);
                            int size = this.d.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                aVar2 = this.d.get(i2);
                                int[] iArr = this.e;
                                int i3 = this.c;
                                Object[] objArr3 = {iArr, Integer.valueOf(i3)};
                                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "e6817e554edd6b97bc620ea0c577de44", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "e6817e554edd6b97bc620ea0c577de44");
                                } else if (aVar2.e != null && aVar2.e.get() != null) {
                                    View view = aVar2.e.get();
                                    view.getLocationInWindow(aVar2.f);
                                    aVar2.c.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                                    aVar2.c.offsetTo(aVar2.f[0] - iArr[0], aVar2.f[1] - iArr[1]);
                                    aVar2.c.left -= aVar2.b.left;
                                    aVar2.c.right += aVar2.b.right;
                                    aVar2.c.top -= aVar2.b.top;
                                    aVar2.c.bottom += aVar2.b.bottom;
                                    aVar2.d.set(aVar2.c);
                                    int i4 = -i3;
                                    aVar2.d.inset(i4, i4);
                                }
                                Object[] objArr4 = {Integer.valueOf(x), Integer.valueOf(y)};
                                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                                if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "52d35aaff3a642bcac454b9bd6ef68e3", RobustBitConfig.DEFAULT_VALUE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "52d35aaff3a642bcac454b9bd6ef68e3")).booleanValue();
                                } else {
                                    z = (aVar2.e == null || aVar2.e.get() == null || !aVar2.c.contains(x, y)) ? false : true;
                                }
                                if (!z) {
                                }
                            }
                        }
                        aVar2 = null;
                    }
                    this.f = aVar2;
                    aVar = this.f;
                    break;
                case 1:
                case 6:
                    aVar = this.f;
                    this.f = null;
                    break;
                case 2:
                case 4:
                case 5:
                default:
                    aVar = null;
                    break;
                case 3:
                    aVar = this.f;
                    this.f = null;
                    break;
            }
            if (aVar == null || aVar.e == null || aVar.e.get() == null) {
                return false;
            }
            View view2 = aVar.e.get();
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            int[] iArr2 = new int[2];
            view2.getLocationOnScreen(iArr2);
            int i5 = iArr2[0];
            int i6 = iArr2[1];
            int height = view2.getHeight() + i6;
            int width = view2.getWidth() + i5;
            if (rawX < i5 || rawX > width || rawY < i6 || rawY > height) {
                int i7 = rawX < i5 ? (i5 - rawX) + 2 : rawX > width ? (width - rawX) - 2 : 0;
                if (rawY < i6) {
                    i = (i6 - rawY) + 2;
                } else if (rawY > height) {
                    i = (height - rawY) - 2;
                }
                motionEvent.setLocation(x + i7, y + i);
            } else {
                motionEvent.setLocation(x - view2.getLeft(), y - view2.getTop());
            }
            return view2.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public Rect b;
        public Rect c;
        public Rect d;
        public WeakReference<View> e;
        public int[] f;

        public a(View view, Rect rect) {
            Object[] objArr = {view, rect};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5da8acbd8fe42ceae4d4529baa9e1e78", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5da8acbd8fe42ceae4d4529baa9e1e78");
                return;
            }
            this.c = new Rect();
            this.d = new Rect();
            this.f = new int[2];
            this.e = new WeakReference<>(view);
            this.b = rect;
        }
    }
}
