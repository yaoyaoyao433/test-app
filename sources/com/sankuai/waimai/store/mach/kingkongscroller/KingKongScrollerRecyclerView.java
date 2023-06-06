package com.sankuai.waimai.store.mach.kingkongscroller;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class KingKongScrollerRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect a;
    private f b;
    private RecyclerView.f c;
    private boolean d;

    public KingKongScrollerRecyclerView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "316cf879814b9274f480284c912006d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "316cf879814b9274f480284c912006d5");
        }
    }

    private KingKongScrollerRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1fba98e2eea3ff03e663786abc4facb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1fba98e2eea3ff03e663786abc4facb");
        }
    }

    public KingKongScrollerRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec79d509ad4d564dab209a4a74d347c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec79d509ad4d564dab209a4a74d347c2");
        } else {
            this.b = new f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78d5a0209155c6d649cdcc872dea0173", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78d5a0209155c6d649cdcc872dea0173")).booleanValue();
        }
        if (motionEvent.getAction() == 0 && this.d) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setParentHasSwiper(boolean z) {
        this.d = z;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c94d9fa28cd830fd272ed912be66de1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c94d9fa28cd830fd272ed912be66de1b");
        } else if (z) {
            if (((LinearLayoutManager) getLayoutManager()).getOrientation() == 0) {
                setHorizontalScrollBarEnabled(true);
            } else {
                setVerticalScrollBarEnabled(true);
            }
            setScrollBarStyle(33554432);
            try {
                Method declaredMethod = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
                try {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this, null);
                } catch (IllegalAccessException e) {
                    com.sankuai.waimai.mach.log.b.b("KingKongScrollerRecyclerView", "illegalAccessException:" + e.getMessage(), new Object[0]);
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    com.sankuai.waimai.mach.log.b.b("KingKongScrollerRecyclerView", "InvocationTargetException:" + e2.getMessage(), new Object[0]);
                    e2.printStackTrace();
                }
            } catch (NoSuchMethodException e3) {
                com.sankuai.waimai.mach.log.b.b("KingKongScrollerRecyclerView", "NoSuchMethodException:" + e3.getMessage(), new Object[0]);
                e3.printStackTrace();
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void addItemDecoration(RecyclerView.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2f76987fc43e3f6792b55f398df5645", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2f76987fc43e3f6792b55f398df5645");
            return;
        }
        if (this.c != null) {
            super.removeItemDecoration(this.c);
        }
        super.addItemDecoration(fVar);
        this.c = fVar;
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a576bd8c14b0b2842385487b726d940", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a576bd8c14b0b2842385487b726d940");
            return;
        }
        super.setLayoutManager(layoutManager);
        if (this.b != null) {
            f fVar = this.b;
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "064276867f4baa168b2505e5e57c0bf6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "064276867f4baa168b2505e5e57c0bf6");
            } else if (fVar.b == this) {
                com.sankuai.waimai.mach.log.b.b("KingKongScrollerSnapHelper", "recyclerview is null", new Object[0]);
            } else {
                if (fVar.b != null) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = f.a;
                    if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "d24f8a4bbfe463009ec32f7541cacc33", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "d24f8a4bbfe463009ec32f7541cacc33");
                    } else if (fVar.b != null) {
                        fVar.d = true;
                        fVar.b.removeOnScrollListener(fVar.e);
                        fVar.b.setOnFlingListener(null);
                    }
                }
                fVar.b = this;
                if (fVar.b != null) {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = f.a;
                    if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "154d88c80e123b88307928f05acaa5ee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "154d88c80e123b88307928f05acaa5ee");
                    } else if (fVar.b != null) {
                        fVar.b.addOnScrollListener(fVar.e);
                        fVar.b.setOnFlingListener(fVar);
                    }
                }
            }
        }
    }
}
