package com.sankuai.waimai.store.newwidgets;

import android.content.Context;
import android.database.DataSetObserver;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NestFullListView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.newwidgets.list.c b;
    private final SparseArray<List<View>> c;
    private View d;
    private DataSetObserver e;
    private b f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();
    }

    public static /* synthetic */ void a(NestFullListView nestFullListView) {
        c cVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, nestFullListView, changeQuickRedirect, false, "4a923964e8d99b70cca6f21249fb403a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, nestFullListView, changeQuickRedirect, false, "4a923964e8d99b70cca6f21249fb403a");
            return;
        }
        int childCount = nestFullListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = nestFullListView.getChildAt(i);
            Object[] objArr2 = {childAt};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, nestFullListView, changeQuickRedirect2, false, "2eed23a73d048aca28c02affd358ca8a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, nestFullListView, changeQuickRedirect2, false, "2eed23a73d048aca28c02affd358ca8a");
            } else if (childAt != nestFullListView.d && (cVar = (c) childAt.getLayoutParams()) != null) {
                int i2 = cVar.b;
                List<View> list = nestFullListView.c.get(i2);
                if (list == null) {
                    list = new ArrayList<>();
                    nestFullListView.c.put(i2, list);
                }
                Object[] objArr3 = {childAt};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, nestFullListView, changeQuickRedirect3, false, "531b082c3d946e25e6560134a867dafb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, nestFullListView, changeQuickRedirect3, false, "531b082c3d946e25e6560134a867dafb");
                } else {
                    childAt.setAccessibilityDelegate(null);
                    nestFullListView.b(childAt);
                }
                list.add(childAt);
                nestFullListView.a(list);
            }
        }
    }

    public static /* synthetic */ void b(NestFullListView nestFullListView) {
        View remove;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, nestFullListView, changeQuickRedirect, false, "241754d7d7608adcb6c52ff26978798a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, nestFullListView, changeQuickRedirect, false, "241754d7d7608adcb6c52ff26978798a");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, nestFullListView, changeQuickRedirect2, false, "bdc38c27a2a03a55166b6592648bcaf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, nestFullListView, changeQuickRedirect2, false, "bdc38c27a2a03a55166b6592648bcaf1");
        } else {
            super.removeAllViews();
            if (nestFullListView.d != null) {
                super.addView(nestFullListView.d, 0, nestFullListView.c(nestFullListView.d));
            }
        }
        if (nestFullListView.b == null) {
            return;
        }
        int count = nestFullListView.b.getCount();
        for (int i = 0; i < count; i++) {
            int itemViewType = nestFullListView.b.getItemViewType(i);
            com.sankuai.waimai.store.newwidgets.list.c cVar = nestFullListView.b;
            Object[] objArr3 = {Integer.valueOf(itemViewType)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, nestFullListView, changeQuickRedirect3, false, "746061b8e3912c3ce4218b4f9ddd5eac", RobustBitConfig.DEFAULT_VALUE)) {
                remove = (View) PatchProxy.accessDispatch(objArr3, nestFullListView, changeQuickRedirect3, false, "746061b8e3912c3ce4218b4f9ddd5eac");
            } else {
                List<View> list = nestFullListView.c.get(itemViewType);
                remove = (list == null || list.isEmpty()) ? null : list.remove(0);
            }
            View view = cVar.getView(i, remove, nestFullListView);
            if (view == null) {
                throw new RuntimeException(nestFullListView.getClass().getName() + "：null == child");
            }
            c c2 = nestFullListView.c(view);
            c2.b = itemViewType;
            super.addView(view, -1, c2);
        }
    }

    public NestFullListView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62d4b09d72a8743fd7204accece0b5e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62d4b09d72a8743fd7204accece0b5e1");
            return;
        }
        this.c = new SparseArray<>();
        this.f = new b() { // from class: com.sankuai.waimai.store.newwidgets.NestFullListView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.NestFullListView.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4293fa2cac0dbce77d58822453884d8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4293fa2cac0dbce77d58822453884d8");
                    return;
                }
                NestFullListView.a(NestFullListView.this);
                NestFullListView.b(NestFullListView.this);
                NestFullListView.this.requestLayout();
            }
        };
        a();
    }

    public NestFullListView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16f2a025f41be8b4eed9ae6965b8325c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16f2a025f41be8b4eed9ae6965b8325c");
            return;
        }
        this.c = new SparseArray<>();
        this.f = new b() { // from class: com.sankuai.waimai.store.newwidgets.NestFullListView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.NestFullListView.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4293fa2cac0dbce77d58822453884d8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4293fa2cac0dbce77d58822453884d8");
                    return;
                }
                NestFullListView.a(NestFullListView.this);
                NestFullListView.b(NestFullListView.this);
                NestFullListView.this.requestLayout();
            }
        };
        a();
    }

    public NestFullListView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cb2f78665c3fef41b4891519fc45587", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cb2f78665c3fef41b4891519fc45587");
            return;
        }
        this.c = new SparseArray<>();
        this.f = new b() { // from class: com.sankuai.waimai.store.newwidgets.NestFullListView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.NestFullListView.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4293fa2cac0dbce77d58822453884d8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4293fa2cac0dbce77d58822453884d8");
                    return;
                }
                NestFullListView.a(NestFullListView.this);
                NestFullListView.b(NestFullListView.this);
                NestFullListView.this.requestLayout();
            }
        };
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68d7ab72f09e906e2680b3823dee0142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68d7ab72f09e906e2680b3823dee0142");
        } else {
            setOrientation(1);
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1700d775f7a814ef293e08c6415181e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1700d775f7a814ef293e08c6415181e6");
        } else if (view == null) {
        } else {
            if (this.d != null) {
                super.removeView(this.d);
            }
            this.d = view;
            super.addView(view, 0, c(view));
        }
    }

    private void a(List<View> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bd6cefa32a78ff4ca13d11531697934", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bd6cefa32a78ff4ca13d11531697934");
        } else if (list == null) {
        } else {
            while (list.size() > 10) {
                list.remove(list.size() - 1);
            }
        }
    }

    private void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a88ad4127684b9e74393bf03bc7d2a44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a88ad4127684b9e74393bf03bc7d2a44");
            return;
        }
        view.forceLayout();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                b(viewGroup.getChildAt(i));
            }
        }
    }

    private c c(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95c92f01b55c9c810f68f6bd5f291aa8", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95c92f01b55c9c810f68f6bd5f291aa8");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!(layoutParams instanceof c)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        return (c) layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: b */
    public c generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "568d6c9a6d0cd0356a73df2f5cf51fb9", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "568d6c9a6d0cd0356a73df2f5cf51fb9") : new c(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f9c8c057041a4b18a308db7a4906ddd", RobustBitConfig.DEFAULT_VALUE) ? (LinearLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f9c8c057041a4b18a308db7a4906ddd") : new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36f85e69af3a9baa51fb26dbcd66fdb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36f85e69af3a9baa51fb26dbcd66fdb3");
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public void setAdapter(com.sankuai.waimai.store.newwidgets.list.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1126d2f3870b6d27479a5ffc1508e8bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1126d2f3870b6d27479a5ffc1508e8bc");
            return;
        }
        if (this.b != null && this.e != null) {
            this.b.unregisterDataSetObserver(this.e);
        }
        if (cVar != null) {
            this.b = cVar;
            this.e = new a(this.f);
            this.b.registerDataSetObserver(this.e);
        }
        this.f.a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends DataSetObserver {
        public static ChangeQuickRedirect a;
        @NonNull
        private final b b;

        private a(@NonNull b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8abf848b385b72fc4020444a466b2189", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8abf848b385b72fc4020444a466b2189");
            } else {
                this.b = bVar;
            }
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6440cd0cc76ee06401b9eeb4371c9597", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6440cd0cc76ee06401b9eeb4371c9597");
            } else {
                this.b.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32245443b48a4c013d5255a6e7299357", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View) is not supported in NestFullListView");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32245443b48a4c013d5255a6e7299357");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6657211e1ee1a94379f452e2a573be35", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View, int) is not supported in NestFullListView");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6657211e1ee1a94379f452e2a573be35");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcf7ad046690412a980331b571b53e52", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in NestFullListView");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcf7ad046690412a980331b571b53e52");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b60927a5e391b70a4c129ebd95c9c4c8", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in NestFullListView");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b60927a5e391b70a4c129ebd95c9c4c8");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "073974650255b9f304f8acefb9bca7a5", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("removeView(View) is not supported in NestFullListView");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "073974650255b9f304f8acefb9bca7a5");
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43f4f6cdfca2ee046d872933a054c0c5", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("removeViewAt(int) is not supported in NestFullListView");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43f4f6cdfca2ee046d872933a054c0c5");
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a52974ba056831006924edc87698112", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("removeAllViews() is not supported in NestFullListView");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a52974ba056831006924edc87698112");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c extends LinearLayout.LayoutParams {
        public static ChangeQuickRedirect a;
        private int b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Object[] objArr = {context, attributeSet};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9e1bb5ff9008e2c11cc83e5f934fa75", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9e1bb5ff9008e2c11cc83e5f934fa75");
            }
        }

        public c(int i, int i2) {
            super(-2, -2);
            Object[] objArr = {-2, -2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eef27a17c96cf3824a47828251b37947", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eef27a17c96cf3824a47828251b37947");
            }
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            Object[] objArr = {marginLayoutParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b410d582f58c2a80f615ca4ec1dce917", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b410d582f58c2a80f615ca4ec1dce917");
            }
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            Object[] objArr = {layoutParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84c8007e5e1b392166b7bddc85a455c2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84c8007e5e1b392166b7bddc85a455c2");
            }
        }
    }
}
