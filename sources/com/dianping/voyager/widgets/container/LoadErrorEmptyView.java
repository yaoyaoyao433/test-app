package com.dianping.voyager.widgets.container;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.shield.component.utils.PageContainerThemeManager;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LoadErrorEmptyView extends FrameLayout implements ShieldPreloadInterface {
    public static ChangeQuickRedirect a;
    public LinearLayout b;
    public TextView c;
    public LinearLayout d;
    public TextView e;
    public LinearLayout f;
    public TextView g;
    public b h;
    private ArrayList<View> i;
    private ArrayList<View> j;
    private ArrayList<View> k;
    private PageContainerThemePackage l;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        void loadRetry(View view);
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldPreload() {
    }

    public LoadErrorEmptyView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0dae53a54b32b92377930a1ef2c5134", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0dae53a54b32b92377930a1ef2c5134");
        } else {
            a();
        }
    }

    public LoadErrorEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab108e3c27594baec8bbbc3fd3d22a20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab108e3c27594baec8bbbc3fd3d22a20");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74fc72fb96a16d9aaad4c1155c36edcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74fc72fb96a16d9aaad4c1155c36edcb");
            return;
        }
        this.l = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().createTheme();
        if (this.l.getLoadErrorEmptyLayoutId() == 0) {
            return;
        }
        inflate(getContext(), this.l.getLoadErrorEmptyLayoutId(), this);
        this.d = (LinearLayout) findViewById(R.id.voyager_empty_layout);
        this.e = (TextView) findViewById(R.id.voyager_empty_view);
        this.d.setVisibility(8);
        this.j = new ArrayList<>();
        for (int i = 0; i < this.d.getChildCount(); i++) {
            this.j.add(this.d.getChildAt(i));
        }
        this.b = (LinearLayout) findViewById(R.id.voyager_loading_layout);
        this.c = (TextView) findViewById(R.id.voyager_loading_view);
        this.b.setVisibility(8);
        this.i = new ArrayList<>();
        for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
            this.i.add(this.b.getChildAt(i2));
        }
        this.f = (LinearLayout) findViewById(R.id.voyager_error_layout);
        this.g = (TextView) findViewById(R.id.voyager_error_view);
        this.k = new ArrayList<>();
        for (int i3 = 0; i3 < this.f.getChildCount(); i3++) {
            this.k.add(this.f.getChildAt(i3));
        }
        if (this.f != null) {
            this.f.setVisibility(8);
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.voyager.widgets.container.LoadErrorEmptyView.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d1032cd93ecf07c86675c757209431c", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d1032cd93ecf07c86675c757209431c");
                    } else if (LoadErrorEmptyView.this.h != null) {
                        LoadErrorEmptyView.this.h.loadRetry(view);
                    }
                }
            });
        }
    }

    public void setLoadingView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b21a27ee470dad90378c1407e915a0e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b21a27ee470dad90378c1407e915a0e7");
        } else if (this.b != null) {
            this.b.removeAllViews();
            this.b.addView(view);
        }
    }

    public void setErrorView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b9eeb614aa3428d3fa49f6282f4ef0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b9eeb614aa3428d3fa49f6282f4ef0b");
        } else if (this.f != null) {
            this.f.removeAllViews();
            this.f.addView(view);
        }
    }

    public void setErrorText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff548aa9ba8ae5d68d788ced92ec35da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff548aa9ba8ae5d68d788ced92ec35da");
        } else if (this.g == null || TextUtils.isEmpty(str)) {
        } else {
            this.g.setText(str);
        }
    }

    public void setEmptyView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d479de1ae63409fa65d5265a8fcdfe31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d479de1ae63409fa65d5265a8fcdfe31");
        } else if (this.d != null) {
            this.d.removeAllViews();
            this.d.addView(view);
        }
    }

    public void setRetryListener(b bVar) {
        this.h = bVar;
    }

    public void setModel(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79aa5de9558a3199206521286d3a7ecc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79aa5de9558a3199206521286d3a7ecc");
        } else if (aVar == null || this.d == null || this.f == null || this.b == null || this.l.getLoadErrorEmptyLayoutId() == 0) {
        } else {
            switch (aVar.f) {
                case EMPTY:
                    this.d.setVisibility(0);
                    if (aVar.g != null) {
                        if (aVar.g.getParent() != null) {
                            if (aVar.g.getParent() instanceof ViewGroup) {
                                ((ViewGroup) aVar.g.getParent()).removeView(aVar.g);
                            } else {
                                this.d.removeView(aVar.g);
                            }
                        }
                        if (aVar.g.getParent() == null) {
                            a(this.d, 8);
                            a(this.d, aVar.g);
                        }
                    }
                    this.f.setVisibility(8);
                    this.b.setVisibility(8);
                    if (this.e != null) {
                        this.e.setText(aVar.e);
                        break;
                    }
                    break;
                case ERROR:
                    this.d.setVisibility(8);
                    this.f.setVisibility(0);
                    if (aVar.g != null) {
                        if (aVar.g.getParent() != null) {
                            if (aVar.g.getParent() instanceof ViewGroup) {
                                ((ViewGroup) aVar.g.getParent()).removeView(aVar.g);
                            } else {
                                this.f.removeView(aVar.g);
                            }
                        }
                        if (aVar.g.getParent() == null) {
                            a(this.f, 8);
                            a(this.f, aVar.g);
                        }
                    }
                    this.b.setVisibility(8);
                    if (this.g != null) {
                        this.g.setText(aVar.e);
                        break;
                    }
                    break;
                case LOADING:
                    this.d.setVisibility(8);
                    this.f.setVisibility(8);
                    this.b.setVisibility(0);
                    if (aVar.g != null) {
                        if (aVar.g.getParent() != null) {
                            if (aVar.g.getParent() instanceof ViewGroup) {
                                ((ViewGroup) aVar.g.getParent()).removeView(aVar.g);
                            } else {
                                this.b.removeView(aVar.g);
                            }
                        }
                        if (aVar.g.getParent() == null) {
                            a(this.b, 8);
                            a(this.b, aVar.g);
                        }
                    }
                    if (this.c != null) {
                        if (TextUtils.isEmpty(aVar.e)) {
                            this.c.setVisibility(8);
                            break;
                        } else {
                            this.c.setVisibility(0);
                            this.c.setText(aVar.e);
                            break;
                        }
                    }
                    break;
                default:
                    this.d.setVisibility(8);
                    this.f.setVisibility(8);
                    this.b.setVisibility(8);
                    setVisibility(8);
                    break;
            }
            if (aVar.f != c.SUCCESS) {
                setVisibility(0);
            }
        }
    }

    private void a(LinearLayout linearLayout, View view) {
        LinearLayout.LayoutParams layoutParams;
        Object[] objArr = {linearLayout, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74e8ebbaf9c805bdf0029f2adf5c004a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74e8ebbaf9c805bdf0029f2adf5c004a");
        } else if (this.l.getLoadErrorEmptyLayoutId() == 0 || view == null || linearLayout == null) {
        } else {
            if (view.getLayoutParams() == null) {
                layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
            } else {
                layoutParams = new LinearLayout.LayoutParams(view.getLayoutParams());
            }
            linearLayout.addView(view, layoutParams);
        }
    }

    private void a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, 8};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e306bbd184f41f52f40e9f526ea3ca6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e306bbd184f41f52f40e9f526ea3ca6");
        } else if (this.l.getLoadErrorEmptyLayoutId() != 0 && viewGroup != null) {
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                viewGroup.getChildAt(i2).setVisibility(8);
            }
        }
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bc02ef49879ada84f94a0ee095f03fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bc02ef49879ada84f94a0ee095f03fc");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b869122cd105f4a94aefdd39ce807ace", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b869122cd105f4a94aefdd39ce807ace");
        } else {
            if (this.d != null) {
                this.d.removeAllViews();
                Iterator<View> it = this.j.iterator();
                while (it.hasNext()) {
                    View next = it.next();
                    if (next instanceof TextView) {
                        ((TextView) next).setText("");
                    }
                    this.d.addView(next);
                }
            }
            if (this.f != null) {
                this.f.removeAllViews();
                Iterator<View> it2 = this.k.iterator();
                while (it2.hasNext()) {
                    View next2 = it2.next();
                    if (next2 instanceof TextView) {
                        ((TextView) next2).setText("");
                    }
                    this.f.addView(next2);
                }
            }
            if (this.b != null) {
                this.b.removeAllViews();
                Iterator<View> it3 = this.i.iterator();
                while (it3.hasNext()) {
                    View next3 = it3.next();
                    if (next3 instanceof TextView) {
                        ((TextView) next3).setText("");
                    }
                    this.b.addView(next3);
                }
            }
        }
        this.h = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a = null;
        public static String b = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().createTheme().getDefaultErrorMessage();
        public static String c = "没有找到您所需要的信息";
        public static String d = "";
        public String e;
        public c f;
        private View g;

        public a(String str, c cVar) {
            Object[] objArr = {str, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04cbd8d2fbab49a87c48198bcb40925e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04cbd8d2fbab49a87c48198bcb40925e");
                return;
            }
            this.f = c.SUCCESS;
            this.e = str;
            this.f = cVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum c {
        LOADING,
        ERROR,
        EMPTY,
        SUCCESS;
        
        public static ChangeQuickRedirect a;

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9751bde19990417a06bcaf2f5979d62", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9751bde19990417a06bcaf2f5979d62");
            }
        }

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20d27884b247deb3e6d1f5caedc6fd67", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20d27884b247deb3e6d1f5caedc6fd67") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c496b9b5cee4748e8284792bf40dc9ef", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c496b9b5cee4748e8284792bf40dc9ef") : (c[]) values().clone();
        }
    }
}
