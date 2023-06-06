package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.widget.c;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {
    final a a;
    final LinearLayoutCompat b;
    final Drawable c;
    final FrameLayout d;
    final FrameLayout e;
    final ImageView f;
    ActionProvider g;
    final DataSetObserver h;
    PopupWindow.OnDismissListener i;
    boolean j;
    int k;
    int l;
    private final b m;
    private final ImageView n;
    private final int o;
    private final ViewTreeObserver.OnGlobalLayoutListener p;
    private ListPopupWindow q;
    private boolean r;

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    private ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new DataSetObserver() { // from class: android.support.v7.widget.ActivityChooserView.1
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                super.onChanged();
                ActivityChooserView.this.a.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.a.notifyDataSetInvalidated();
            }
        };
        this.p = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.widget.ActivityChooserView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (ActivityChooserView.this.c()) {
                    if (!ActivityChooserView.this.isShown()) {
                        ActivityChooserView.this.getListPopupWindow().e();
                        return;
                    }
                    ActivityChooserView.this.getListPopupWindow().d();
                    if (ActivityChooserView.this.g != null) {
                        ActivityChooserView.this.g.subUiVisibilityChanged(true);
                    }
                }
            }
        };
        this.k = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.initialActivityCount, R.attr.expandActivityOverflowButtonDrawable}, i, 0);
        this.k = obtainStyledAttributes.getInt(0, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        this.m = new b();
        this.b = (LinearLayoutCompat) findViewById(R.id.activity_chooser_view_content);
        this.c = this.b.getBackground();
        this.e = (FrameLayout) findViewById(R.id.default_activity_button);
        this.e.setOnClickListener(this.m);
        this.e.setOnLongClickListener(this.m);
        this.f = (ImageView) this.e.findViewById(R.id.image);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.expand_activities_button);
        frameLayout.setOnClickListener(this.m);
        frameLayout.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: android.support.v7.widget.ActivityChooserView.3
            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCanOpenPopup(true);
            }
        });
        frameLayout.setOnTouchListener(new aa(frameLayout) { // from class: android.support.v7.widget.ActivityChooserView.4
            @Override // android.support.v7.widget.aa
            public final android.support.v7.view.menu.n a() {
                return ActivityChooserView.this.getListPopupWindow();
            }

            @Override // android.support.v7.widget.aa
            protected final boolean b() {
                ActivityChooserView.this.a();
                return true;
            }

            @Override // android.support.v7.widget.aa
            protected final boolean c() {
                ActivityChooserView.this.b();
                return true;
            }
        });
        this.d = frameLayout;
        this.n = (ImageView) frameLayout.findViewById(R.id.image);
        this.n.setImageDrawable(drawable);
        this.a = new a();
        this.a.registerDataSetObserver(new DataSetObserver() { // from class: android.support.v7.widget.ActivityChooserView.5
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                super.onChanged();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (activityChooserView.a.getCount() > 0) {
                    activityChooserView.d.setEnabled(true);
                } else {
                    activityChooserView.d.setEnabled(false);
                }
                int a2 = activityChooserView.a.a.a();
                int c = activityChooserView.a.a.c();
                if (a2 == 1 || (a2 > 1 && c > 0)) {
                    activityChooserView.e.setVisibility(0);
                    ResolveInfo b2 = activityChooserView.a.a.b();
                    PackageManager packageManager = activityChooserView.getContext().getPackageManager();
                    activityChooserView.f.setImageDrawable(b2.loadIcon(packageManager));
                    if (activityChooserView.l != 0) {
                        activityChooserView.e.setContentDescription(activityChooserView.getContext().getString(activityChooserView.l, b2.loadLabel(packageManager)));
                    }
                } else {
                    activityChooserView.e.setVisibility(8);
                }
                if (activityChooserView.e.getVisibility() == 0) {
                    activityChooserView.b.setBackgroundDrawable(activityChooserView.c);
                } else {
                    activityChooserView.b.setBackgroundDrawable(null);
                }
            }
        });
        Resources resources = context.getResources();
        this.o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    }

    public void setActivityChooserModel(c cVar) {
        a aVar = this.a;
        c cVar2 = ActivityChooserView.this.a.a;
        if (cVar2 != null && ActivityChooserView.this.isShown()) {
            cVar2.unregisterObserver(ActivityChooserView.this.h);
        }
        aVar.a = cVar;
        if (cVar != null && ActivityChooserView.this.isShown()) {
            cVar.registerObserver(ActivityChooserView.this.h);
        }
        aVar.notifyDataSetChanged();
        if (getListPopupWindow().q.isShowing()) {
            b();
            a();
        }
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.n.setImageDrawable(drawable);
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.n.setContentDescription(getContext().getString(i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setProvider(ActionProvider actionProvider) {
        this.g = actionProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    final void a(int i) {
        if (this.a.a == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.p);
        ?? r0 = this.e.getVisibility() == 0 ? 1 : 0;
        int a2 = this.a.a.a();
        if (i != Integer.MAX_VALUE && a2 > i + r0) {
            this.a.a(true);
            this.a.a(i - 1);
        } else {
            this.a.a(false);
            this.a.a(i);
        }
        ListPopupWindow listPopupWindow = getListPopupWindow();
        if (listPopupWindow.q.isShowing()) {
            return;
        }
        if (this.j || r0 == 0) {
            this.a.a(true, r0);
        } else {
            this.a.a(false, false);
        }
        listPopupWindow.b(Math.min(this.a.a(), this.o));
        listPopupWindow.d();
        if (this.g != null) {
            this.g.subUiVisibilityChanged(true);
        }
        listPopupWindow.e.setContentDescription(getContext().getString(R.string.abc_activitychooserview_choose_application));
        listPopupWindow.e.setSelector(new ColorDrawable(0));
    }

    public final boolean c() {
        return getListPopupWindow().q.isShowing();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.a.a;
        if (cVar != null) {
            cVar.registerObserver(this.h);
        }
        this.r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.a.a;
        if (cVar != null) {
            cVar.unregisterObserver(this.h);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.p);
        }
        if (c()) {
            b();
        }
        this.r = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        LinearLayoutCompat linearLayoutCompat = this.b;
        if (this.e.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(linearLayoutCompat, i, i2);
        setMeasuredDimension(linearLayoutCompat.getMeasuredWidth(), linearLayoutCompat.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
        if (c()) {
            return;
        }
        b();
    }

    public c getDataModel() {
        return this.a.a;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.i = onDismissListener;
    }

    public void setInitialActivityCount(int i) {
        this.k = i;
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.l = i;
    }

    ListPopupWindow getListPopupWindow() {
        if (this.q == null) {
            this.q = new ListPopupWindow(getContext());
            this.q.a(this.a);
            this.q.k = this;
            this.q.a(true);
            this.q.l = this.m;
            this.q.a(this.m);
        }
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((a) adapterView.getAdapter()).getItemViewType(i)) {
                case 0:
                    ActivityChooserView.this.b();
                    if (!ActivityChooserView.this.j) {
                        if (!ActivityChooserView.this.a.b) {
                            i++;
                        }
                        Intent b = ActivityChooserView.this.a.a.b(i);
                        if (b != null) {
                            b.addFlags(524288);
                            ActivityChooserView.this.getContext().startActivity(b);
                            return;
                        }
                        return;
                    } else if (i > 0) {
                        c cVar = ActivityChooserView.this.a.a;
                        synchronized (cVar.b) {
                            cVar.d();
                            c.a aVar = cVar.c.get(i);
                            c.a aVar2 = cVar.c.get(0);
                            cVar.a(new c.d(new ComponentName(aVar.a.activityInfo.packageName, aVar.a.activityInfo.name), System.currentTimeMillis(), aVar2 != null ? (aVar2.b - aVar.b) + 5.0f : 1.0f));
                        }
                        return;
                    } else {
                        return;
                    }
                case 1:
                    ActivityChooserView.this.a(Integer.MAX_VALUE);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view == ActivityChooserView.this.e) {
                ActivityChooserView.this.b();
                Intent b = ActivityChooserView.this.a.a.b(ActivityChooserView.this.a.a.a(ActivityChooserView.this.a.a.b()));
                if (b != null) {
                    b.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(b);
                }
            } else if (view == ActivityChooserView.this.d) {
                ActivityChooserView.this.j = false;
                ActivityChooserView.this.a(ActivityChooserView.this.k);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            if (view == ActivityChooserView.this.e) {
                if (ActivityChooserView.this.a.getCount() > 0) {
                    ActivityChooserView.this.j = true;
                    ActivityChooserView.this.a(ActivityChooserView.this.k);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            if (ActivityChooserView.this.i != null) {
                ActivityChooserView.this.i.onDismiss();
            }
            if (ActivityChooserView.this.g != null) {
                ActivityChooserView.this.g.subUiVisibilityChanged(false);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        c a;
        boolean b;
        private int d = 4;
        private boolean e;
        private boolean f;

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return 3;
        }

        a() {
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i) {
            return (this.f && i == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            int a = this.a.a();
            if (!this.b && this.a.b() != null) {
                a--;
            }
            int min = Math.min(a, this.d);
            return this.f ? min + 1 : min;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!this.b && this.a.b() != null) {
                        i++;
                    }
                    return this.a.a(i);
                case 1:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null || view.getId() != R.id.list_item) {
                        view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
                    PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(R.id.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (this.b && i == 0 && this.e) {
                        view.setActivated(true);
                    } else {
                        view.setActivated(false);
                    }
                    return view;
                case 1:
                    if (view == null || view.getId() != 1) {
                        View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                        inflate.setId(1);
                        ((TextView) inflate.findViewById(R.id.title)).setText(ActivityChooserView.this.getContext().getString(R.string.abc_activity_chooser_view_see_all));
                        return inflate;
                    }
                    return view;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public final int a() {
            int i = this.d;
            this.d = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.d = i;
            return i2;
        }

        public final void a(int i) {
            if (this.d != i) {
                this.d = i;
                notifyDataSetChanged();
            }
        }

        public final void a(boolean z) {
            if (this.f != z) {
                this.f = z;
                notifyDataSetChanged();
            }
        }

        public final void a(boolean z, boolean z2) {
            if (this.b == z && this.e == z2) {
                return;
            }
            this.b = z;
            this.e = z2;
            notifyDataSetChanged();
        }
    }

    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayoutCompat {
        private static final int[] a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            aw a2 = aw.a(context, attributeSet, a);
            setBackgroundDrawable(a2.a(0));
            a2.a.recycle();
        }
    }

    public final boolean a() {
        if (getListPopupWindow().q.isShowing() || !this.r) {
            return false;
        }
        this.j = false;
        a(this.k);
        return true;
    }

    public final boolean b() {
        if (getListPopupWindow().q.isShowing()) {
            getListPopupWindow().e();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.p);
                return true;
            }
            return true;
        }
        return true;
    }
}
