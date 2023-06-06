package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertController;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {
    final AlertController a;

    protected AlertDialog(@NonNull Context context, @StyleRes int i) {
        super(context, a(context, i));
        this.a = new AlertController(getContext(), this, getWindow());
    }

    static int a(@NonNull Context context, @StyleRes int i) {
        if (((i >>> 24) & 255) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button a(int i) {
        AlertController alertController = this.a;
        switch (i) {
            case -3:
                return alertController.t;
            case -2:
                return alertController.q;
            case -1:
                return alertController.n;
            default:
                return null;
        }
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.a(charSequence);
    }

    public final void a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.a.a(i, charSequence, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        View inflate;
        boolean z;
        View findViewById;
        View findViewById2;
        super.onCreate(bundle);
        final AlertController alertController = this.a;
        if (alertController.G != 0 && alertController.M == 1) {
            i = alertController.G;
        } else {
            i = alertController.F;
        }
        alertController.b.setContentView(i);
        View findViewById3 = alertController.c.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        if (alertController.g != null) {
            inflate = alertController.g;
        } else {
            inflate = alertController.h != 0 ? LayoutInflater.from(alertController.a).inflate(alertController.h, viewGroup, false) : null;
        }
        boolean z2 = inflate != null;
        if (!z2 || !AlertController.a(inflate)) {
            alertController.c.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) alertController.c.findViewById(R.id.custom);
            frameLayout.addView(inflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.m) {
                frameLayout.setPadding(alertController.i, alertController.j, alertController.k, alertController.l);
            }
            if (alertController.f != null) {
                ((LinearLayoutCompat.a) viewGroup.getLayoutParams()).g = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a2 = AlertController.a(findViewById7, findViewById4);
        ViewGroup a3 = AlertController.a(findViewById8, findViewById5);
        ViewGroup a4 = AlertController.a(findViewById9, findViewById6);
        alertController.w = (NestedScrollView) alertController.c.findViewById(R.id.scrollView);
        alertController.w.setFocusable(false);
        alertController.w.setNestedScrollingEnabled(false);
        alertController.B = (TextView) a3.findViewById(16908299);
        if (alertController.B != null) {
            if (alertController.e != null) {
                alertController.B.setText(alertController.e);
            } else {
                alertController.B.setVisibility(8);
                alertController.w.removeView(alertController.B);
                if (alertController.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.w.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    a3.setVisibility(8);
                }
            }
        }
        alertController.n = (Button) a4.findViewById(16908313);
        alertController.n.setOnClickListener(alertController.O);
        if (TextUtils.isEmpty(alertController.o)) {
            alertController.n.setVisibility(8);
            z = false;
        } else {
            alertController.n.setText(alertController.o);
            alertController.n.setVisibility(0);
            z = true;
        }
        alertController.q = (Button) a4.findViewById(16908314);
        alertController.q.setOnClickListener(alertController.O);
        if (TextUtils.isEmpty(alertController.r)) {
            alertController.q.setVisibility(8);
        } else {
            alertController.q.setText(alertController.r);
            alertController.q.setVisibility(0);
            z |= true;
        }
        alertController.t = (Button) a4.findViewById(16908315);
        alertController.t.setOnClickListener(alertController.O);
        if (TextUtils.isEmpty(alertController.u)) {
            alertController.t.setVisibility(8);
        } else {
            alertController.t.setText(alertController.u);
            alertController.t.setVisibility(0);
            z |= true;
        }
        Context context = alertController.a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                AlertController.a(alertController.n);
            } else if (z) {
                AlertController.a(alertController.q);
            } else if (z) {
                AlertController.a(alertController.t);
            }
        }
        if (!(z)) {
            a4.setVisibility(8);
        }
        if (alertController.C != null) {
            a2.addView(alertController.C, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.z = (ImageView) alertController.c.findViewById(16908294);
            if ((!TextUtils.isEmpty(alertController.d)) && alertController.L) {
                alertController.A = (TextView) alertController.c.findViewById(R.id.alertTitle);
                alertController.A.setText(alertController.d);
                if (alertController.x != 0) {
                    alertController.z.setImageResource(alertController.x);
                } else if (alertController.y != null) {
                    alertController.z.setImageDrawable(alertController.y);
                } else {
                    alertController.A.setPadding(alertController.z.getPaddingLeft(), alertController.z.getPaddingTop(), alertController.z.getPaddingRight(), alertController.z.getPaddingBottom());
                    alertController.z.setVisibility(8);
                }
            } else {
                alertController.c.findViewById(R.id.title_template).setVisibility(8);
                alertController.z.setVisibility(8);
                a2.setVisibility(8);
            }
        }
        boolean z3 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        int i2 = (a2 == null || a2.getVisibility() == 8) ? 0 : 1;
        boolean z4 = (a4 == null || a4.getVisibility() == 8) ? false : true;
        if (!z4 && a3 != null && (findViewById2 = a3.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (i2 != 0) {
            if (alertController.w != null) {
                alertController.w.setClipToPadding(true);
            }
            View findViewById10 = (alertController.e == null && alertController.f == null) ? null : a2.findViewById(R.id.titleDividerNoCustom);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (a3 != null && (findViewById = a3.findViewById(R.id.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        if (alertController.f instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) alertController.f;
            if (!z4 || i2 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i2 != 0 ? recycleListView.getPaddingTop() : recycleListView.a, recycleListView.getPaddingRight(), z4 ? recycleListView.getPaddingBottom() : recycleListView.b);
            }
        }
        if (!z3) {
            View view = alertController.f != null ? alertController.f : alertController.w;
            if (view != null) {
                int i3 = i2 | (z4 ? 2 : 0);
                final View findViewById11 = alertController.c.findViewById(R.id.scrollIndicatorUp);
                final View findViewById12 = alertController.c.findViewById(R.id.scrollIndicatorDown);
                if (Build.VERSION.SDK_INT >= 23) {
                    ViewCompat.setScrollIndicators(view, i3, 3);
                    if (findViewById11 != null) {
                        a3.removeView(findViewById11);
                    }
                    if (findViewById12 != null) {
                        a3.removeView(findViewById12);
                    }
                } else {
                    if (findViewById11 != null && (i3 & 1) == 0) {
                        a3.removeView(findViewById11);
                        findViewById11 = null;
                    }
                    if (findViewById12 != null && (i3 & 2) == 0) {
                        a3.removeView(findViewById12);
                        findViewById12 = null;
                    }
                    if (findViewById11 != null || findViewById12 != null) {
                        if (alertController.e != null) {
                            alertController.w.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: android.support.v7.app.AlertController.2
                                @Override // android.support.v4.widget.NestedScrollView.OnScrollChangeListener
                                public void onScrollChange(NestedScrollView nestedScrollView, int i4, int i5, int i6, int i7) {
                                    AlertController.a(nestedScrollView, findViewById11, findViewById12);
                                }
                            });
                            alertController.w.post(new Runnable() { // from class: android.support.v7.app.AlertController.3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AlertController.a(AlertController.this.w, findViewById11, findViewById12);
                                }
                            });
                        } else if (alertController.f != null) {
                            alertController.f.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: android.support.v7.app.AlertController.4
                                @Override // android.widget.AbsListView.OnScrollListener
                                public final void onScrollStateChanged(AbsListView absListView, int i4) {
                                }

                                @Override // android.widget.AbsListView.OnScrollListener
                                public final void onScroll(AbsListView absListView, int i4, int i5, int i6) {
                                    AlertController.a(absListView, findViewById11, findViewById12);
                                }
                            });
                            alertController.f.post(new Runnable() { // from class: android.support.v7.app.AlertController.5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AlertController.a(AlertController.this.f, findViewById11, findViewById12);
                                }
                            });
                        } else {
                            if (findViewById11 != null) {
                                a3.removeView(findViewById11);
                            }
                            if (findViewById12 != null) {
                                a3.removeView(findViewById12);
                            }
                        }
                    }
                }
            }
        }
        ListView listView = alertController.f;
        if (listView == null || alertController.D == null) {
            return;
        }
        listView.setAdapter(alertController.D);
        int i4 = alertController.E;
        if (i4 >= 0) {
            listView.setItemChecked(i4, true);
            listView.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AlertController alertController = this.a;
        if (alertController.w != null && alertController.w.executeKeyEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        AlertController alertController = this.a;
        if (alertController.w != null && alertController.w.executeKeyEvent(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public final AlertController.a a;
        private final int b;

        public a(@NonNull Context context) {
            this(context, AlertDialog.a(context, 0));
        }

        public a(@NonNull Context context, @StyleRes int i) {
            this.a = new AlertController.a(new ContextThemeWrapper(context, AlertDialog.a(context, i)));
            this.b = i;
        }

        public final a a(@StringRes int i) {
            this.a.f = this.a.a.getText(i);
            return this;
        }

        public final a a(@Nullable CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public final a b(@StringRes int i) {
            this.a.h = this.a.a.getText(i);
            return this;
        }

        public final a b(@Nullable CharSequence charSequence) {
            this.a.h = charSequence;
            return this;
        }

        public final a a(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            this.a.i = this.a.a.getText(i);
            this.a.j = onClickListener;
            return this;
        }

        public final a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.a.i = charSequence;
            this.a.j = onClickListener;
            return this;
        }

        public final a b(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            this.a.k = this.a.a.getText(i);
            this.a.l = onClickListener;
            return this;
        }

        public final a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.a.k = charSequence;
            this.a.l = onClickListener;
            return this;
        }

        public final a a(boolean z) {
            this.a.o = z;
            return this;
        }

        public final a a(DialogInterface.OnKeyListener onKeyListener) {
            this.a.r = onKeyListener;
            return this;
        }

        public final a a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            this.a.s = charSequenceArr;
            this.a.u = onClickListener;
            return this;
        }

        public final a a(View view) {
            this.a.w = view;
            this.a.v = 0;
            this.a.B = false;
            return this;
        }

        public AlertDialog a() {
            int i;
            ListAdapter cVar;
            AlertDialog alertDialog = new AlertDialog(this.a.a, this.b);
            final AlertController.a aVar = this.a;
            final AlertController alertController = alertDialog.a;
            if (aVar.g == null) {
                if (aVar.f != null) {
                    alertController.a(aVar.f);
                }
                if (aVar.d != null) {
                    Drawable drawable = aVar.d;
                    alertController.y = drawable;
                    alertController.x = 0;
                    if (alertController.z != null) {
                        if (drawable != null) {
                            alertController.z.setVisibility(0);
                            alertController.z.setImageDrawable(drawable);
                        } else {
                            alertController.z.setVisibility(8);
                        }
                    }
                }
                if (aVar.c != 0) {
                    alertController.a(aVar.c);
                }
                if (aVar.e != 0) {
                    int i2 = aVar.e;
                    TypedValue typedValue = new TypedValue();
                    alertController.a.getTheme().resolveAttribute(i2, typedValue, true);
                    alertController.a(typedValue.resourceId);
                }
            } else {
                alertController.C = aVar.g;
            }
            if (aVar.h != null) {
                CharSequence charSequence = aVar.h;
                alertController.e = charSequence;
                if (alertController.B != null) {
                    alertController.B.setText(charSequence);
                }
            }
            if (aVar.i != null) {
                alertController.a(-1, aVar.i, aVar.j, null);
            }
            if (aVar.k != null) {
                alertController.a(-2, aVar.k, aVar.l, null);
            }
            if (aVar.m != null) {
                alertController.a(-3, aVar.m, aVar.n, null);
            }
            if (aVar.s != null || aVar.H != null || aVar.t != null) {
                final AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) aVar.b.inflate(alertController.H, (ViewGroup) null);
                if (aVar.D) {
                    if (aVar.H == null) {
                        cVar = new ArrayAdapter<CharSequence>(aVar.a, alertController.I, 16908308, aVar.s, recycleListView) { // from class: android.support.v7.app.AlertController.a.1
                            final /* synthetic */ RecycleListView a;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.a = recycleListView;
                            }

                            @Override // android.widget.ArrayAdapter, android.widget.Adapter
                            public final View getView(int i3, View view, ViewGroup viewGroup) {
                                View view2 = super.getView(i3, view, viewGroup);
                                if (a.this.C != null && a.this.C[i3]) {
                                    this.a.setItemChecked(i3, true);
                                }
                                return view2;
                            }
                        };
                    } else {
                        cVar = new CursorAdapter(aVar.a, aVar.H, false, recycleListView, alertController) { // from class: android.support.v7.app.AlertController.a.2
                            final /* synthetic */ RecycleListView a;
                            final /* synthetic */ AlertController b;
                            private final int d;
                            private final int e;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.a = recycleListView;
                                this.b = alertController;
                                Cursor cursor = getCursor();
                                this.d = cursor.getColumnIndexOrThrow(a.this.I);
                                this.e = cursor.getColumnIndexOrThrow(a.this.J);
                            }

                            @Override // android.widget.CursorAdapter
                            public final void bindView(View view, Context context, Cursor cursor) {
                                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.d));
                                this.a.setItemChecked(cursor.getPosition(), cursor.getInt(this.e) == 1);
                            }

                            @Override // android.widget.CursorAdapter
                            public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                                return a.this.b.inflate(this.b.I, viewGroup, false);
                            }
                        };
                    }
                } else {
                    if (aVar.E) {
                        i = alertController.J;
                    } else {
                        i = alertController.K;
                    }
                    int i3 = i;
                    if (aVar.H != null) {
                        cVar = new SimpleCursorAdapter(aVar.a, i3, aVar.H, new String[]{aVar.I}, new int[]{16908308});
                    } else if (aVar.t != null) {
                        cVar = aVar.t;
                    } else {
                        cVar = new AlertController.c(aVar.a, i3, 16908308, aVar.s);
                    }
                }
                alertController.D = cVar;
                alertController.E = aVar.F;
                if (aVar.u != null) {
                    recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: android.support.v7.app.AlertController.a.3
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView<?> adapterView, View view, int i4, long j) {
                            a.this.u.onClick(alertController.b, i4);
                            if (a.this.E) {
                                return;
                            }
                            alertController.b.dismiss();
                        }
                    });
                } else if (aVar.G != null) {
                    recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: android.support.v7.app.AlertController.a.4
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView<?> adapterView, View view, int i4, long j) {
                            if (a.this.C != null) {
                                a.this.C[i4] = recycleListView.isItemChecked(i4);
                            }
                            a.this.G.onClick(alertController.b, i4, recycleListView.isItemChecked(i4));
                        }
                    });
                }
                if (aVar.K != null) {
                    recycleListView.setOnItemSelectedListener(aVar.K);
                }
                if (aVar.E) {
                    recycleListView.setChoiceMode(1);
                } else if (aVar.D) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f = recycleListView;
            }
            if (aVar.w != null) {
                if (aVar.B) {
                    View view = aVar.w;
                    int i4 = aVar.x;
                    int i5 = aVar.y;
                    int i6 = aVar.z;
                    int i7 = aVar.A;
                    alertController.g = view;
                    alertController.h = 0;
                    alertController.m = true;
                    alertController.i = i4;
                    alertController.j = i5;
                    alertController.k = i6;
                    alertController.l = i7;
                } else {
                    alertController.g = aVar.w;
                    alertController.h = 0;
                    alertController.m = false;
                }
            } else if (aVar.v != 0) {
                int i8 = aVar.v;
                alertController.g = null;
                alertController.h = i8;
                alertController.m = false;
            }
            alertDialog.setCancelable(this.a.o);
            if (this.a.o) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.a.p);
            alertDialog.setOnDismissListener(this.a.q);
            if (this.a.r != null) {
                alertDialog.setOnKeyListener(this.a.r);
            }
            return alertDialog;
        }

        public AlertDialog b() {
            AlertDialog a = a();
            a.show();
            return a;
        }
    }
}
