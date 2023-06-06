package com.meituan.roodesign.widgets.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatDialog;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class AlertController {
    public static ChangeQuickRedirect a;
    ImageView A;
    TextView B;
    TextView C;
    View D;
    public ListAdapter E;
    public int F;
    int G;
    int H;
    public int I;
    public int J;
    public int K;
    public int L;
    boolean M;
    int N;
    public Handler O;
    final View.OnClickListener P;
    final Context b;
    public final AppCompatDialog c;
    final Window d;
    CharSequence e;
    CharSequence f;
    public ListView g;
    View h;
    int i;
    int j;
    int k;
    int l;
    int m;
    boolean n;
    public Button o;
    CharSequence p;
    public Message q;
    public Button r;
    CharSequence s;
    public Message t;
    public Button u;
    CharSequence v;
    public Message w;
    public NestedScrollView x;
    int y;
    Drawable z;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class b extends Handler {
        public static ChangeQuickRedirect a;
        private WeakReference<DialogInterface> b;

        public b(DialogInterface dialogInterface) {
            Object[] objArr = {dialogInterface};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcd90b7ea8c010ddbf1521ad5112daf9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcd90b7ea8c010ddbf1521ad5112daf9");
            } else {
                this.b = new WeakReference<>(dialogInterface);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34c3da7c36d14b4961d20ca42e13919e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34c3da7c36d14b4961d20ca42e13919e");
                return;
            }
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case -3:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick(this.b.get(), message.what);
                        return;
                    default:
                        return;
                }
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }

    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window) {
        Object[] objArr = {context, appCompatDialog, window};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81864d65e9f1cf44da442afaf50972bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81864d65e9f1cf44da442afaf50972bc");
            return;
        }
        this.n = false;
        this.y = 0;
        this.F = -1;
        this.N = 0;
        this.P = new View.OnClickListener() { // from class: com.meituan.roodesign.widgets.dialog.AlertController.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Message obtain;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6887992c463dbc5bc959687dfecea4bc", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6887992c463dbc5bc959687dfecea4bc");
                    return;
                }
                if (view == AlertController.this.o && AlertController.this.q != null) {
                    obtain = Message.obtain(AlertController.this.q);
                } else if (view == AlertController.this.r && AlertController.this.t != null) {
                    obtain = Message.obtain(AlertController.this.t);
                } else {
                    obtain = (view != AlertController.this.u || AlertController.this.w == null) ? null : Message.obtain(AlertController.this.w);
                }
                if (obtain != null) {
                    obtain.sendToTarget();
                }
                AlertController.this.O.obtainMessage(1, AlertController.this.c).sendToTarget();
            }
        };
        this.b = context;
        this.c = appCompatDialog;
        this.d = window;
        this.O = new b(appCompatDialog);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16842994, R.attr.buttonPanelSideLayout, R.attr.listLayout, R.attr.multiChoiceItemLayout, R.attr.singleChoiceItemLayout, R.attr.listItemLayout, R.attr.showTitle}, R.attr.rooAlertDialogStyle, 0);
        this.G = obtainStyledAttributes.getResourceId(0, 0);
        this.H = obtainStyledAttributes.getResourceId(1, 0);
        this.I = obtainStyledAttributes.getResourceId(2, 0);
        this.J = obtainStyledAttributes.getResourceId(3, 0);
        this.K = obtainStyledAttributes.getResourceId(4, 0);
        this.L = obtainStyledAttributes.getResourceId(5, 0);
        this.M = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.recycle();
        appCompatDialog.b(1);
    }

    public static boolean a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9bb8a3c09a43825736f247aed2a5e655", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9bb8a3c09a43825736f247aed2a5e655")).booleanValue();
        }
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void a(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf3f058fc7870f55a613c8ef68cd99cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf3f058fc7870f55a613c8ef68cd99cb");
            return;
        }
        this.e = charSequence;
        if (this.B != null) {
            this.B.setText(charSequence);
        }
    }

    public static void a(View view, View view2, View view3) {
        Object[] objArr = {view, view2, view3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "575d7f3250fc4b79e0fc158938998708", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "575d7f3250fc4b79e0fc158938998708");
            return;
        }
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3f8a03c7a33456389e8710a6c99a938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3f8a03c7a33456389e8710a6c99a938");
            return;
        }
        this.z = null;
        this.y = i;
        if (this.A != null) {
            if (i != 0) {
                this.A.setVisibility(0);
                this.A.setImageResource(this.y);
                return;
            }
            this.A.setVisibility(8);
        }
    }

    public final void a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        Object[] objArr = {Integer.valueOf(i), charSequence, onClickListener, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb458a225c0369bb6e35590d16a8ccf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb458a225c0369bb6e35590d16a8ccf9");
            return;
        }
        if (onClickListener != null) {
            message = this.O.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.v = charSequence;
                this.w = message;
                return;
            case -2:
                this.s = charSequence;
                this.t = message;
                return;
            case -1:
                this.p = charSequence;
                this.q = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public ViewGroup a(@Nullable View view, @Nullable View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb50a1d2dd3246fac5b6187e707175d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb50a1d2dd3246fac5b6187e707175d8");
        }
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Button button) {
        Object[] objArr = {button};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fbb99a381c8d8144d31c25853093ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fbb99a381c8d8144d31c25853093ac7");
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class RecycleListView extends ListView {
        public static ChangeQuickRedirect a;
        final int b;
        final int c;

        public RecycleListView(Context context) {
            this(context, null);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ad545a5be6a5a72a0fe405112549253", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ad545a5be6a5a72a0fe405112549253");
            }
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Object[] objArr = {context, attributeSet};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1051a0c6033ff8fc485229140e3f926", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1051a0c6033ff8fc485229140e3f926");
                return;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle});
            this.c = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.b = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int A;
        public int B;
        public boolean C;
        public boolean[] D;
        public boolean E;
        public boolean F;
        public int G;
        public DialogInterface.OnMultiChoiceClickListener H;
        public Cursor I;
        public String J;
        public String K;
        public AdapterView.OnItemSelectedListener L;
        public boolean M;
        public final Context b;
        public final LayoutInflater c;
        public int d;
        public Drawable e;
        public int f;
        public CharSequence g;
        public View h;
        public CharSequence i;
        public CharSequence j;
        public DialogInterface.OnClickListener k;
        public CharSequence l;
        public DialogInterface.OnClickListener m;
        public CharSequence n;
        public DialogInterface.OnClickListener o;
        public boolean p;
        public DialogInterface.OnCancelListener q;
        public DialogInterface.OnDismissListener r;
        public DialogInterface.OnKeyListener s;
        public CharSequence[] t;
        public ListAdapter u;
        public DialogInterface.OnClickListener v;
        public int w;
        public View x;
        public int y;
        public int z;

        public a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fd3eae0700f9c464515cf4849f633c0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fd3eae0700f9c464515cf4849f633c0");
                return;
            }
            this.d = 0;
            this.f = 0;
            this.C = false;
            this.G = -1;
            this.M = true;
            this.b = context;
            this.p = true;
            this.c = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class c extends ArrayAdapter<CharSequence> {
        public static ChangeQuickRedirect a;

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }

        public c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, 16908308, charSequenceArr);
            Object[] objArr = {context, Integer.valueOf(i), 16908308, charSequenceArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cfdec6a3b3d157cbc8160128c392674", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cfdec6a3b3d157cbc8160128c392674");
            }
        }
    }
}
