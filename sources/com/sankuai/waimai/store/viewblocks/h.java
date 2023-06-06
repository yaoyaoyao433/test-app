package com.sankuai.waimai.store.viewblocks;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.platform.utils.p;
import com.sankuai.waimai.store.repository.model.TitleMenuItemEntity;
import com.sankuai.waimai.store.util.ar;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public final Context b;
    public final PopupWindow c;
    com.sankuai.waimai.store.param.a d;
    public final SparseArray<MenuItemView> e;
    public final ViewGroup f;
    public final ArrayList<Integer> g;
    public final int h;
    public a i;
    private final ViewGroup j;
    private g k;
    private int l;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(int i);

        void a(int i, List<Integer> list, SparseArray<MenuItemView> sparseArray);
    }

    public h(Context context, int i, com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {context, 3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b73aaf8e7eaeea36c061c1453bc4a84b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b73aaf8e7eaeea36c061c1453bc4a84b");
            return;
        }
        this.e = new SparseArray<>();
        this.g = new ArrayList<>();
        this.b = context;
        this.h = 3;
        this.d = aVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_sg_home_pop_up_window_layout, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(com.sankuai.shangou.stone.util.h.a(context, 102.0f), -2));
        this.j = (ViewGroup) inflate.findViewById(R.id.sg_pop_content_layout);
        this.f = (ViewGroup) inflate.findViewById(R.id.sg_menu_content);
        this.c = new PopupWindow(inflate, -2, -2);
        this.c.setFocusable(true);
        this.c.setTouchable(true);
        this.c.setOutsideTouchable(true);
        this.c.setBackgroundDrawable(new BitmapDrawable());
    }

    private void a(PopupWindow popupWindow) {
        Object[] objArr = {popupWindow};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76f69b82aa9bfef376f96c154fd1eef7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76f69b82aa9bfef376f96c154fd1eef7");
            return;
        }
        try {
            p.b(popupWindow);
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }

    public final void a(List<TitleMenuItemEntity> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97d553613ba48767070411763f7b616d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97d553613ba48767070411763f7b616d");
        } else if (list == null || com.sankuai.shangou.stone.util.a.c(list) == 0) {
        } else {
            this.f.removeAllViews();
            this.g.clear();
            int i = 0;
            int i2 = 3;
            while (i < com.sankuai.shangou.stone.util.a.c(list)) {
                final TitleMenuItemEntity titleMenuItemEntity = (TitleMenuItemEntity) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
                if (titleMenuItemEntity != null) {
                    if (!TextUtils.isEmpty(titleMenuItemEntity.title)) {
                        i2 = Math.max(i2, titleMenuItemEntity.title.length());
                    }
                    g gVar = new g(this.b);
                    gVar.setMenuIcon(titleMenuItemEntity.picUrl);
                    gVar.setMenuName(titleMenuItemEntity.title);
                    gVar.setHasTopLine(i != 0);
                    this.e.put(titleMenuItemEntity.menuCode, gVar);
                    gVar.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.viewblocks.h.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7d2b051e55243cc8e279633cdb82165", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7d2b051e55243cc8e279633cdb82165");
                                return;
                            }
                            h.this.a();
                            if (h.this.i != null) {
                                h.this.i.a(titleMenuItemEntity.menuCode);
                            }
                            if (!h.this.d.bb || titleMenuItemEntity.menuCode != 18) {
                                if (t.a(titleMenuItemEntity.mScheme)) {
                                    return;
                                }
                                com.sankuai.waimai.store.router.d.a(h.this.b, titleMenuItemEntity.mScheme);
                            } else if (h.this.i != null) {
                                h.this.i.a();
                            }
                        }
                    });
                    this.f.addView(gVar);
                    this.g.add(Integer.valueOf(titleMenuItemEntity.menuCode));
                    if (this.d.bb) {
                        a(titleMenuItemEntity, gVar);
                    }
                }
                i++;
            }
            if (this.j != null) {
                this.j.getLayoutParams().width = b(i2);
            }
        }
    }

    private void a(TitleMenuItemEntity titleMenuItemEntity, g gVar) {
        Object[] objArr = {titleMenuItemEntity, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "079c4440488fcc10e72fcf4ce2d62e38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "079c4440488fcc10e72fcf4ce2d62e38");
        } else if (this.d.bb && titleMenuItemEntity.menuCode == 4) {
            this.k = gVar;
        }
    }

    private int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b449b02a755d22bc80c3718e9b9bcd21", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b449b02a755d22bc80c3718e9b9bcd21")).intValue();
        }
        return com.sankuai.shangou.stone.util.h.a(this.b, i == 4 ? 115 : i >= 5 ? 125 : 102);
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b5ac75e28eb520418752353bb437f05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b5ac75e28eb520418752353bb437f05");
            return;
        }
        this.f.requestFocus();
        int measuredHeight = view.getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        ar.a(this.c, view, 53, com.sankuai.shangou.stone.util.h.a(this.b, 8.0f), (iArr[1] + measuredHeight) - com.sankuai.shangou.stone.util.h.a(this.b, 9.0f));
        if (this.i != null) {
            this.i.a(this.h, this.g, this.e);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "672285128e7cc46e4151453517d3ac78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "672285128e7cc46e4151453517d3ac78");
        } else {
            a(this.c);
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70bacfedcd92ce5e65612d0a220a01c2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70bacfedcd92ce5e65612d0a220a01c2")).booleanValue() : this.c.isShowing();
    }

    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        Object[] objArr = {onDismissListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9594a75292845ad3da04a97d4a1a9b5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9594a75292845ad3da04a97d4a1a9b5d");
        } else {
            this.c.setOnDismissListener(onDismissListener);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca899fd909ce499b23c8bc378fca2f65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca899fd909ce499b23c8bc378fca2f65");
            return;
        }
        this.l = i;
        if (this.k != null) {
            this.k.setUnreadMessageCountInHomeSearchRight(this.l);
            ((Activity) this.b).runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.store.viewblocks.h.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79da8fb273cc53fe9c31f42020b9a082", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79da8fb273cc53fe9c31f42020b9a082");
                    } else {
                        h.this.f.invalidate();
                    }
                }
            });
        }
    }
}
