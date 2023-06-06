package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.view.TintableBackgroundView;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements TintableBackgroundView {
    private static final int[] a = {16843505};
    private final e b;
    private final Context c;
    private aa d;
    private SpinnerAdapter e;
    private final boolean f;
    private b g;
    private int h;
    private final Rect i;

    public AppCompatSpinner(Context context) {
        this(context, null);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    private AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, -1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r2 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        r2.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private AppCompatSpinner(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, android.content.res.Resources.Theme r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        if (this.g != null) {
            return this.c;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.g != null) {
            this.g.a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int i) {
        setPopupBackgroundDrawable(android.support.v7.content.res.b.b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        if (this.g == null) {
            if (Build.VERSION.SDK_INT >= 16) {
                return super.getPopupBackground();
            }
            return null;
        }
        return this.g.q.getBackground();
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        if (this.g != null) {
            this.g.a(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        if (this.g != null) {
            return this.g.b();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        if (this.g == null) {
            if (Build.VERSION.SDK_INT >= 16) {
                super.setDropDownHorizontalOffset(i);
                return;
            }
            return;
        }
        this.g.g = i;
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        if (this.g == null) {
            if (Build.VERSION.SDK_INT >= 16) {
                return super.getDropDownHorizontalOffset();
            }
            return 0;
        }
        return this.g.g;
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.g != null) {
            this.h = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.g != null) {
            return this.h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f) {
            this.e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.g != null) {
            this.g.a(new a(spinnerAdapter, (this.c == null ? getContext() : this.c).getTheme()));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.g == null || !this.g.q.isShowing()) {
            return;
        }
        this.g.e();
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.d == null || !this.d.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        if (this.g == null) {
            return super.performClick();
        }
        if (this.g.q.isShowing()) {
            return true;
        }
        this.g.d();
        return true;
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        if (this.g == null) {
            super.setPrompt(charSequence);
        } else {
            this.g.a = charSequence;
        }
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        if (this.g == null) {
            return super.getPrompt();
        }
        return this.g.a;
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        if (this.b != null) {
            this.b.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.b != null) {
            this.b.a(drawable);
        }
    }

    @Override // android.support.v4.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.b != null) {
            this.b.a(colorStateList);
        }
    }

    @Override // android.support.v4.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        if (this.b != null) {
            return this.b.a();
        }
        return null;
    }

    @Override // android.support.v4.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.b != null) {
            this.b.a(mode);
        }
    }

    @Override // android.support.v4.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.b != null) {
            return this.b.b();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.b != null) {
            this.b.c();
        }
    }

    final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.i);
            return i2 + this.i.left + this.i.right;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter a;
        private ListAdapter b;

        @Override // android.widget.Adapter
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        public a(@Nullable SpinnerAdapter spinnerAdapter, @Nullable Resources.Theme theme) {
            this.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || Build.VERSION.SDK_INT < 23 || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            if (this.a == null) {
                return 0;
            }
            return this.a.getCount();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            if (this.a == null) {
                return null;
            }
            return this.a.getItem(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            if (this.a == null) {
                return -1L;
            }
            return this.a.getItemId(i);
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            if (this.a == null) {
                return null;
            }
            return this.a.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            return this.a != null && this.a.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.a != null) {
                this.a.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.a != null) {
                this.a.unregisterDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b extends ListPopupWindow {
        CharSequence a;
        ListAdapter b;
        final Rect c;

        public b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.c = new Rect();
            this.k = AppCompatSpinner.this;
            a(true);
            this.j = 0;
            this.l = new AdapterView.OnItemClickListener() { // from class: android.support.v7.widget.AppCompatSpinner.b.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                    AppCompatSpinner.this.setSelection(i2);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        AppCompatSpinner.this.performItemClick(view, i2, b.this.b.getItemId(i2));
                    }
                    b.this.e();
                }
            };
        }

        @Override // android.support.v7.widget.ListPopupWindow
        public final void a(ListAdapter listAdapter) {
            super.a(listAdapter);
            this.b = listAdapter;
        }

        final void a() {
            Drawable background = this.q.getBackground();
            int i = 0;
            if (background != null) {
                background.getPadding(AppCompatSpinner.this.i);
                i = bd.a(AppCompatSpinner.this) ? AppCompatSpinner.this.i.right : -AppCompatSpinner.this.i.left;
            } else {
                Rect rect = AppCompatSpinner.this.i;
                AppCompatSpinner.this.i.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            if (AppCompatSpinner.this.h != -2) {
                if (AppCompatSpinner.this.h != -1) {
                    b(AppCompatSpinner.this.h);
                } else {
                    b((width - paddingLeft) - paddingRight);
                }
            } else {
                int a = AppCompatSpinner.this.a((SpinnerAdapter) this.b, this.q.getBackground());
                int i2 = (AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.i.left) - AppCompatSpinner.this.i.right;
                if (a > i2) {
                    a = i2;
                }
                b(Math.max(a, (width - paddingLeft) - paddingRight));
            }
            this.g = bd.a(AppCompatSpinner.this) ? i + ((width - paddingRight) - this.f) : i + paddingLeft;
        }

        @Override // android.support.v7.widget.ListPopupWindow, android.support.v7.view.menu.n
        public final void d() {
            ViewTreeObserver viewTreeObserver;
            boolean isShowing = this.q.isShowing();
            a();
            c(2);
            super.d();
            this.e.setChoiceMode(1);
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            y yVar = this.e;
            if (this.q.isShowing() && yVar != null) {
                yVar.setListSelectionHidden(false);
                yVar.setSelection(selectedItemPosition);
                if (yVar.getChoiceMode() != 0) {
                    yVar.setItemChecked(selectedItemPosition, true);
                }
            }
            if (isShowing || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.widget.AppCompatSpinner.b.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    b bVar = b.this;
                    AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                    if (!(ViewCompat.isAttachedToWindow(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(bVar.c))) {
                        b.this.e();
                        return;
                    }
                    b.this.a();
                    b.super.d();
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            a(new PopupWindow.OnDismissListener() { // from class: android.support.v7.widget.AppCompatSpinner.b.3
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ViewTreeObserver viewTreeObserver2 = AppCompatSpinner.this.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                    }
                }
            });
        }
    }
}
